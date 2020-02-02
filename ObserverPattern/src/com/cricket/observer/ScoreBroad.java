package com.cricket.observer;

import com.cricket.observable.CricketData;

public class ScoreBroad {

	public static void main(String[] args) {
		CricketData crickData = new CricketData();
		CurrentScoreDisplay currentScoreDisplay = new CurrentScoreDisplay(crickData);
		AverageScoreDisplay avgScoreDisplay = new AverageScoreDisplay(crickData);
		
		crickData.setScore(123, 2, 15f);
		crickData.setScore(185, 2, 20.3f);
		crickData.setScore(205, 4, 25.3f);
		crickData.setScore(225, 4, 35.3f);
	}

}
