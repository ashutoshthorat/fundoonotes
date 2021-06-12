package com.bridgelabz.fundoo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService implements IService {
	@Autowired
	RestTemplate resttemplate;

	@Override
	public boolean checkuser() {
		boolean data=resttemplate.getForObject("http://localhost:8080/user/checkuserpresent", boolean.class);
		// TODO Auto-generated method stub
		return data;
	}

}
