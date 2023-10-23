package com.example.inversion_control;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MobilesConfig {
	@Bean
	public Colors getColorObject() {
		return new Colors();
	}
	
	@Bean
	public Mobiles getOneplusObject(Colors getColorObject){
		return new Oneplus(getColorObject);
	}
	
	@Bean
	public Mobiles getIphoneObject(Colors getColorObject){
		return new Iphone(getColorObject);
	}
	
}
