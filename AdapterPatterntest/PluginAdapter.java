package com.adapterpatterntest;

//������
public class PluginAdapter implements CnPluginInterface{
	private EnPluginInterface enPlugin;
	public PluginAdapter(EnPluginInterface enPlugin) {
		this.enPlugin=enPlugin;
	}
	//���ع����緽����Ӣ����
	public void chargeWith2Pins() {
		enPlugin.chargeWith3Pins();
	}
}
