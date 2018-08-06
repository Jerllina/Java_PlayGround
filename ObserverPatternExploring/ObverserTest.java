package com.observerpattentest;

public class ObverserTest {
	public static void main(String[] args) {
		VideoSite vs=new VideoSite();
		vs.registerObserver(new VideoFans("LiLei"));
		vs.registerObserver(new VideoFans("HanMeimei"));
		vs.registerObserver(new VideoFans("XiaoMing"));
		
		vs.addVideos("Video 1");
		vs.addVideos("Video 2");
	}
}
