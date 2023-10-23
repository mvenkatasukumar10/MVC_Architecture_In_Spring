package com.example.RestApI.controller;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//import java.util.HashMap;
//import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RestApI.Model.RestUser;

@RestController
@RequestMapping("/users")
public class Controller {
	 
	Map<String,RestUser> allvalues=new HashMap<>();
	
	@GetMapping
	public Collection<RestUser> getusers() {
		return allvalues.values();
	}
	@GetMapping("/{userId}")
	public RestUser getUser(@PathVariable String userId) {
		if(allvalues.containsKey(userId)) {
			return allvalues.get(userId);
		}
		else {
		   return null;
		}
	}
	@PostMapping
	public String createUsers(@RequestBody RestUser userdetails) {
		RestUser addvalue=new RestUser();
		addvalue.setName(userdetails.getName());
		addvalue.setUserId(userdetails.getUserId());
		addvalue.setEmail(userdetails.getEmail());
		allvalues.put(userdetails.getUserId(),addvalue);
		System.out.println(allvalues);
      return "User is created";
	}
	@PutMapping("/{UserId}")
	public String editUsers(@PathVariable String UserId,@RequestBody RestUser userdetails) {
		if(allvalues.containsKey(UserId)) {
			RestUser addvalue=new RestUser();
			addvalue.setName(userdetails.getName());
			addvalue.setUserId(userdetails.getUserId());
			addvalue.setEmail(userdetails.getEmail());
			allvalues.put(userdetails.getUserId(),addvalue);
			return "user is edited";
		}
		else {
			return "user is not found to edited";
		}
	}
	@DeleteMapping("/{userId}")
	public String deleteUsers(@PathVariable String userId) {
		if(allvalues.containsKey(userId)) {
			allvalues.remove(userId);
			return "user is deleted";
		}
		else {
			return "user is not found to delete";
		}
	}
}

