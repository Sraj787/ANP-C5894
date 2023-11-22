package com.SpringBoot.Curd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBoot.Curd.Entity.Login;

public interface LoginRepository extends JpaRepository<Login, Integer> {
	
	public Login findByUserNameAndPassword(String userName,String password);

}
