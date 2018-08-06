package com.observerpattentest;

//这个例子中的观察者实例就是看视频的人 
public class VideoFans implements Observer{
	private String name;
	public VideoFans(String name) {
		this.name=name;
	}
	@Override
	public void update(Subject s) {
		System.out.println(this.name+",new videos are available^^");
		System.out.println(s);
	}
}
