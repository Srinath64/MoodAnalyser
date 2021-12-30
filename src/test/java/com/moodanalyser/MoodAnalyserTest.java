package com.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    public void testMessage() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I'm In Sad Mood");
        Assertions.assertEquals("Sad", mood);
    }
}
