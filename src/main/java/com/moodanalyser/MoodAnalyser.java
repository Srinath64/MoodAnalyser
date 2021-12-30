package com.moodanalyser;

public class MoodAnalyser {

    String message;

    public MoodAnalyser(String message) {
        super();
        this.message = message;
    }

    public String analyseMood() {
        if(message.contains("Sad"))
            return "Sad";
        else
            return "Happy";
    }
}
