package com.example.microservice_project.exception;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(){
        super("resource on found on server ...!!");
    }
    public ResourceNotFoundException(String message){
        super(message);
    }
}
