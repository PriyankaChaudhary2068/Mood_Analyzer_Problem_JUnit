package com.bridgelabz.moodAnalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
	
	
	    public MoodAnalyzer moodAnalyzer = new MoodAnalyzer();

	    @Test
	    public void givenMessage_WhenSad_ShouldReturnSad(){
	        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in sad mood");
	        String mood = moodAnalyzer.analyzeMood();
	        Assert.assertEquals("SAD",mood);
	    }

	    @Test
	    public void givenMessage_WhenNotSad_ShouldReturnHAPPY(){
	        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in any mood");
	        String mood = moodAnalyzer.analyzeMood();
	        Assert.assertEquals("HAPPY",mood);
	    }
	}


