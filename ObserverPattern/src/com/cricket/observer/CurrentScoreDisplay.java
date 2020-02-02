package com.cricket.observer;

import com.cricket.observable.CricketData;

public class CurrentScoreDisplay implements Observer,Display{

	private CricketData cricketData;
	private int runs, wickets;
	private float overs;
	
	
	//On calling this constructor the observer subscribes to the Subject data (here CricketData)
	 public CurrentScoreDisplay(CricketData crikData) {
		this.cricketData = crikData;
		crikData.registerObeserver(this);
		}
	
	 /**
	  * Simply displays the average score details.
	  */
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(this); 
	}

	/**
	 * Used by the subject class / Observable class to provide the latest updates.
	 */
	@Override
	public void update(int runs, int wickets, float overs) {
		this.runs = runs;
		this.wickets = wickets;
		this.overs = overs;
		display();
	}

	@Override
	public String toString() {
		return "CurrentScoreDisplay [runs=" + runs + ", wickets=" + wickets + ", overs=" + overs + "]";
	}
	
	

}
