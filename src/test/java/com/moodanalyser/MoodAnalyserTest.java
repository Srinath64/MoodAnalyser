package com.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    public void sadMessage() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I'm In Sad Mood");
        Assertions.assertEquals("Sad", mood);
    }
    @Test
    public void happyMessage() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I'm In Any Mood");
        Assertions.assertEquals("Happy", mood);
    }
}
