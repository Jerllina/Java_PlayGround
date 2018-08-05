package com.adapterpatterntest;

//适配器
public class PluginAdapter implements CnPluginInterface{
	private EnPluginInterface enPlugin;
	public PluginAdapter(EnPluginInterface enPlugin) {
		this.enPlugin=enPlugin;
	}
	//重载国标充电方法给英标充电
	public void chargeWith2Pins() {
		enPlugin.chargeWith3Pins();
	}
}
