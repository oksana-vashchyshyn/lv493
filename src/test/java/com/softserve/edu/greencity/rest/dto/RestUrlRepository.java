package com.softserve.edu.greencity.rest.dto;

public final class RestUrlRepository {
	// TODO Send as Parameter
    private static String remoteServer = "https://greencity.azurewebsites.net";

    private RestUrlRepository() {
    }

    public static RestUrl getDefault() {
    	return getSignin();
    }
    
    public static RestUrl getSignin() {
        return new RestUrl()
                .addBaseUrl(remoteServer)
                .addGetUrl("")
                .addPostUrl("/ownSecurity/signIn")
                .addPutUrl("")
                .addDeleteUrl("")
                .addPatchUrl("");
    }

    public static RestUrl getUserGoals() {
        return new RestUrl()
                .addBaseUrl(remoteServer)
                .addGetUrl("/user/{" + KeyParameters.USER_ID.toString() + "}/goals")
                .addPostUrl("/user/{" + KeyParameters.USER_ID.toString() + "}/goals")
                .addPutUrl("")
                .addDeleteUrl("")
                .addPatchUrl("");
    }
    
   // EcoNews ---------------------------------------------------------------------
    

    public static RestUrl getAllTags() {
        return new RestUrl()
                .addBaseUrl(remoteServer)
                .addGetUrl("/tags")
                .addPostUrl("")
                .addPutUrl("")
                .addDeleteUrl("")
                .addPatchUrl("");
    }
    
    public static RestUrl getRecentlyCreatedNews() {
        return new RestUrl()
                .addBaseUrl(remoteServer)
                .addGetUrl("/econews/newest")
                .addPostUrl("")
                .addPutUrl("")
                .addDeleteUrl("")
                .addPatchUrl("");
    }
}


