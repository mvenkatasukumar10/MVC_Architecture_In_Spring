package com.example.inversion_control;

public class Oneplus implements Mobiles {
	
	Colors color;
	Oneplus(Colors ColorObj){
		this.color=ColorObj;
	}

	@Override
	public void getModelAndColor(){
		System.out.println("Model is 9 pro");
		color.getOnePlusColor();
	}

}
