package com.moodanalyser;

public class MoodAnalyser {

    String message;

    public MoodAnalyser(String message) {
        super();
        this.message = message;
    }

    public String analyseMood() throws MoodAnalyserException{
        if(message == null) {
            throw new MoodAnalyserException("Message Can't Be Null");
        }
        else if(message.equals("")) {
            throw new MoodAnalyserException("Message Can't Be Empty");
        }
        else if(message.contains("Sad"))
            return "Sad";
        else
            return "Happy";
//        try{
//            analyseMood("message");
//        }
//        catch (MoodAnalyserException Exception){
//            System.out.println("Message Can't be NULL");
//        }
    }
}
