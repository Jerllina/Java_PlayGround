package com.abfactorypatterntest;

//一个具体工厂例子
public class AKitchen implements KitchenFactory{
	public Food getFood() {
		return new Apple();
	}
	public TableWare getTableWare() {
		return new Knife(); 
	}
}
