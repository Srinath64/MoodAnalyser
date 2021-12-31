package com.moodanalyser;

public class MoodAnalyserException extends Exception{
    public ExceptionType type;
    public String message;


    public enum ExceptionType{
        NULL
    }
    public MoodAnalyserException(String message,ExceptionType type) {
        super(message);
        this.type = type;
    }

}

