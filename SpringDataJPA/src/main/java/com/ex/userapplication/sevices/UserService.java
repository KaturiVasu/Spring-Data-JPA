package com.ex.userapplication.sevices;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex.userapplication.beans.User;
import com.ex.userapplication.entities.UserEntity;
import com.ex.userapplication.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;
	
	@Transactional
	public void saveUser(User user) {
		UserEntity entity= new UserEntity();
		BeanUtils.copyProperties(user, entity);
		repository.save(entity);
		
	}
	@Transactional
	public List<UserEntity> getAllUsers() {
		return (List<UserEntity>) repository.findAll();
	}
	
}