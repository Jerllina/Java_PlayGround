package com.observerpattentest;

import java.util.ArrayList;

//视频网站实现接口
public class VideoSite implements Subject{
	private ArrayList<Observer> userList;
	private ArrayList<String> videos;
	
	public VideoSite() {
		userList=new ArrayList<Observer>();
		videos=new ArrayList<String>();
	}
	
	@Override
	public void registerObserver(Observer o) {
		userList.add(o);
	}
	
	@Override
	public void removeObserver(Observer o) {
		userList.remove(o);
	}
	
	@Override
	public void notifyAllObservers() {
		for (Observer o:userList) {
			o.update(this);
		}
	}
	
	public void addVideos(String video) {
		this.videos.add(video);
		notifyAllObservers();
	}
	
	public ArrayList<String> getVideos(){
		return videos;
	}
	
	public String toString() {
		return videos.toString();
	}
}
