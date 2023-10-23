package com.example.inversion_control;

public class Iphone implements Mobiles {
	

	Colors color;
	Iphone(Colors ColorObj){
		this.color=ColorObj;
	}

	@Override
	public void getModelAndColor() {
		System.out.println("Model is 14 pro");
		color.getIphoneColor();
	}

}
