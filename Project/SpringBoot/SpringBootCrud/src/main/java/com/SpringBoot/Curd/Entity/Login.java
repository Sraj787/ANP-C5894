package com.SpringBoot.Curd.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class Login {
	
	@Id
	private int uid;
	
	private String userName;
	
	private String password;


}
