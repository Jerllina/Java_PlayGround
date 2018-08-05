package com.adapterpatterntest;

//国标插座的充电实现方法
public class CnPlugin implements CnPluginInterface{
	public void chargeWith2Pins() {
		System.out.println("charge with CnPlugin");
	}

}
