package com.demo.services;

public class HelloWorldFactory {

    public HelloWorldService createHelloWorldService(String language){
        HelloWorldService service = null;

        switch (language){
            case "en":
                service = new HelloWorldEngImpl();
                break;
            case "hi":
                service = new HelloWorldHindiImpl();
                break;
            default: new HelloWorldEngImpl();
        }

        return service;
    }
 }
