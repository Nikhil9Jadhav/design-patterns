package com.cricket.observer;

import com.cricket.observable.CricketData;

public class AverageScoreDisplay implements Observer,Display{

	private float runRate;
	private int   predictedScore;
	private CricketData cricketData;
	
	
	//On calling this constructor the observer subscribes to the Subject data (here CricketData)
	 public AverageScoreDisplay(CricketData crikData) {
		this.cricketData = crikData;
		crikData.registerObeserver(this);
		}
	
	 /**
	  * Simply displays the average score details.
	  */
	@Override
	public void display() {
		// TODO Auto-generated method stub
		 System.out.println("\nAverage Score Display: \n"
                 + "Run Rate: " + runRate + 
                 "\nPredictedScore: " + 
                 predictedScore); 
		 System.out.println("*************");
	}

	/**
	 * Used by the subject class / Observable class to provide the latest updates.
	 */
	@Override
	public void update(int runs, int wickets, float overs) {
		this.runRate = (float)runs/overs;
		this.predictedScore = (int) (this.runRate * 50);
		display();
	}

}
