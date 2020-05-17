package com.kru.springmvc;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public boolean isUseValid(String name, String password) {
		if(name.equals("Kruthika") && password.equals("kru")) {
			return true;
		}
		return false;
	}
}
