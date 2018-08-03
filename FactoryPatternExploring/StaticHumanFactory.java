package com.helloworld;

//æ≤Ã¨π§≥ß¿‡
public class StaticHumanFactory {
	public static Male createMale() {
		return new Male();
	}
	public static Female createFemale() {
		return new Female();
	}
}
