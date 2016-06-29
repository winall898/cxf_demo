package com.wujiang.client1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wujiang.domain.User;
import com.wujiang.inf.HelloWorld;

public class HelloWorldClientTomcat {
    public static void main(String[] args) {
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld client = (HelloWorld)context.getBean("client");
        User user1 = new User();
        user1.setName("Tony");
        User user2 = new User();
        user2.setName("freeman");
        List<User> userList= new ArrayList<User>();
        userList.add(user1);
        userList.add(user2);
/*        String[] res = client.SayHiToUserList(userList);
        for(String str : res){
        	System.out.println(str);
        }*/
        String str = client.sayHi("wujiang");
        System.out.println(str);
    }
}
