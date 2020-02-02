package com.cricket.observable;

import java.util.ArrayList;
import java.util.List;

import com.cricket.observer.Observer;

public class CricketData implements Observable {

	List<Observer> observers = new ArrayList<>();
	private int runs;
	private int wickets;
	private float overs;
	
	public void setScore(int runs, int wickets , float overs) {
		
		this.runs = runs;
		this.wickets = wickets;
		this.overs = overs;
		scoreUpdated();
		
	}
	
	
	private void scoreUpdated() {
		notifyObservers();
	}


	@Override
	public void registerObeserver(Observer object) {
		observers.add(object);
	}
	@Override
	public void deRegisterObserver(Observer object) {
		int indexOf = observers.indexOf(object);
		if (indexOf >= 0) {
			observers.remove(object);
		}
	}
	@Override
	public void notifyObservers() {
		for(Observer observer : observers) {
			observer.update(runs,wickets,overs);
		}
	}
	
}
