package com.bridgelabz.moodAnalyzer;


public class MoodAnalyzer {

	
	    public String analyzeMood(String message) {
	    	
	        if (message.contains("I am in sad mood"))
	            return "SAD";
	        else
	            return "HAPPY";
	    
	}
	

}
