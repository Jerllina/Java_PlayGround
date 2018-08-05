package com.adapterpatterntest;

//英标插座的充电实现方法
public class EnPlugin implements EnPluginInterface{
	public void chargeWith3Pins() {
		System.out.println("charge with EnPlugin");
	}
}
