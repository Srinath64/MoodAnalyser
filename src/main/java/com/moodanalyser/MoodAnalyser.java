package com.moodanalyser;

public class MoodAnalyser {

    String message;

    public MoodAnalyser(String message) {
        super();
        this.message = message;
    }

    public String analyseMood() {
        try {
            if(message.contains("Sad"))
                return "Sad";
            else
                return "Happy";
        } catch (NullPointerException e) {
            return "Happy";
        }
    }
}
