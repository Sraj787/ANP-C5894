package com.SpringBoot.Curd.TeacherServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot.Curd.Entity.Login;
import com.SpringBoot.Curd.repository.LoginRepository;
import com.SpringBoot.Curd.service.LoginService;


@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	LoginRepository lrepo;

	@Override
	public Login LoginUser(String userName, String password) {
		Login login = lrepo.findByUserNameAndPassword(userName, password);
		return login;
	}

}
