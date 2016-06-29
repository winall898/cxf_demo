package com.wujiang.client1;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.wujiang.domain.User;
import com.wujiang.inf.HelloWorld;

public class HelloWorldClient {
    public static void main(String[] args) {
        JaxWsProxyFactoryBean svr = new JaxWsProxyFactoryBean();
        svr.setServiceClass(HelloWorld.class);
        svr.setAddress("http://localhost:8080/cxf_demo");
        HelloWorld hw = (HelloWorld) svr.create();
        User user = new User();
        user.setName("Tony");
        System.out.println(hw.sayHiToUser(user));
    }
}
