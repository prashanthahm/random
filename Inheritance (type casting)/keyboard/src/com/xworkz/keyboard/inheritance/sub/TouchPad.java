package com.xworkz.keyboard.inheritance.sub;

import com.xworkz.keyboard.inheritance.sup.Keyboard;

public class TouchPad extends Keyboard {
	
	public String type ;
	public boolean floating;
	public boolean oneHand;
	
	public TouchPad(double height,double width,String color,String type,boolean floating,boolean oneHand) {
		super(height,width,color);

		this.type = type;
		this.floating = floating;
		this.oneHand = oneHand;
	}
	public TouchPad(double height,double width,String color) {
		super(height,width,color);
	
	}
	public void torisu() {
		
		System.out.println(this.type);
		System.out.println(this.floating);
		System.out.println(this.oneHand);
		System.out.println(super.height);
		System.out.println(super.width);
		System.out.println(super.color);

	}

}
