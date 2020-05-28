package com.softserve.edu.greencity.rest.dto;

public enum KeyParameters {

	EMAIL("email"),
    PASSWORD("password"),
    ACCEPT("accept"),
    AUTHORIZATION("Authorization"),
    LANGUAGE("language"),
    LANG("lang"),
    USER_ID("userId"),
    NAME("name"),
    BEARER("Bearer "),
    ADVICE_ID("adviceId"),
    HABIT_ID("habitId"),
    CONTENT_TYPE("Content-Type");
    
    
    private String key;

    private KeyParameters(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        //return String.valueOf(key);
    	return key;
    }
}
