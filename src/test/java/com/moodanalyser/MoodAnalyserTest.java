package com.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

    @Test
    public void sadMessage() throws Exception{
        MoodAnalyser moodAnalyser = new MoodAnalyser("I'm In Sad Mood");
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("Sad", mood);
    }
    @Test
    public void happyMessage() throws Exception{
        MoodAnalyser moodAnalyser = new MoodAnalyser("I'm In Any Mood");
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("Happy", mood);
    }
    @Test
    public void nullMessage() throws Exception{
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("Happy", mood);
    }
}
