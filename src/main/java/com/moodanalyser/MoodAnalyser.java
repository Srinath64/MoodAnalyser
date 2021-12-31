package com.moodanalyser;

public class MoodAnalyser {

    String message;

    public MoodAnalyser(String message) {
        super();
        this.message = message;
    }

    public String analyseMood() throws Exception {

        try {
            if (message == null) {
                throw new MoodAnalyserException("Message Can't Be Null ", MoodAnalyserException.ExceptionType.NULL);
            }
            else if (message.contains("Sad"))
                return "Sad";
            else
                return "Happy";
        } catch (MoodAnalyserException e) {
            System.out.println(e);
            return "Happy";
        }
    }
}
