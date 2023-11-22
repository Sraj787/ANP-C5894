package com.SpringBoot.Curd.service;

import com.SpringBoot.Curd.Entity.Login;

public interface LoginService {
	
	public Login LoginUser(String userName,String password);

}
