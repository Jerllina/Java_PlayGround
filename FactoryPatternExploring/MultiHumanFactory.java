package com.helloworld;

//多个工厂方法
public class MultiHumanFactory {
	public Male createMale() {
		return new Male();
	}
	public Female createFemale() {
		return new Female();
	}
}
