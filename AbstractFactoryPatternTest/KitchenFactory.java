package com.abfactorypatterntest;

//抽象厨房工厂
public interface KitchenFactory {
	public Food getFood();
	public TableWare getTableWare();

}
