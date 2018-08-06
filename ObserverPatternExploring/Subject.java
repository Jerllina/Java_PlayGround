package com.observerpattentest;

//不同主题观察者接口
public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyAllObservers();
	
}
