package com.wujiang.service;

import javax.xml.ws.Endpoint;

import com.wujiang.inf.HelloWorldImpl;

public class WebServiceApp {
    public static void main(String[] args) {
        System.out.println("web service start");
        HelloWorldImpl implementor= new HelloWorldImpl();
        String address="http://localhost:8080/cxf_demo";
        Endpoint.publish(address, implementor);
        System.out.println("web service started");
    }
}
