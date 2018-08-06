package com.decoratorpatterntest;

//���װ����
public class Tall extends GirlDecorator{
	private Girl girl;
	public Tall(Girl g) {
		girl=g;
	}
	
	@Override
	public String getDescription() {
		return girl.getDescription()+"+is very tall";
	}
}
