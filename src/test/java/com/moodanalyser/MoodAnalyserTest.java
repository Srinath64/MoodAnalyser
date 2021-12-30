package com.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    public void sadMessage() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I'm In Sad Mood");
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("Sad", mood);
    }
    @Test
    public void nullMessage() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("Happy", mood);
    }
    @Test
    public void happyMessage() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I'm In Any Mood");
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("Happy", mood);
    }
}
