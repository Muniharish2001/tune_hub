package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Users;
import com.example.demo.repository.UsersRepository;

@Service
public class UserServiceImplementation implements UsersService{
	
	@Autowired
	UsersRepository repo;

	@Override
	public String addUsers(Users user) {
		// TODO Auto-generated method stub
		repo.save(user);
		return "user added successfully";
	}

	@Override
	public boolean emailExists(String email) {
		// TODO Auto-generated method stub
		if(repo.findByEmail(email)==null)
		{
		return false;
	}
		else {
			return true;
		}
	}

	@Override
	public boolean validateUser(String email, String password) {
		// TODO Auto-generated method stub
		Users user = repo.findByEmail(email);
		String db_pass = user.getPassword();
		if(password.equals(db_pass)) 
		{
		return true;
	}
		else {
			return false;
		}
}
	@Override
	public String getRole(String email) {
		Users user = repo.findByEmail(email);
		return user.getRole();
	}

	@Override
	public void updateUser(Users user) {
		// TODO Auto-generated method stub
		repo.save(user);
		
	}

	@Override
	public Users getUser(String email) {
		// TODO Auto-generated method stub
		return repo.findByEmail(email);
	}

	@Override
	public Object fetchAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
	