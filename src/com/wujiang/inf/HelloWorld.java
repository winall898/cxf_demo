package com.wujiang.inf;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.wujiang.domain.User;

@WebService
public interface HelloWorld {
	String sayHi(@WebParam(name="text")String text);
	String sayHiToUser(User user);
	String[] SayHiToUserList(List<User> userList);
}
