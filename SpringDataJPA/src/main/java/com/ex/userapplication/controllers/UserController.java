package com.ex.userapplication.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ex.userapplication.beans.Responce;
import com.ex.userapplication.beans.User;
import com.ex.userapplication.entities.UserEntity;
import com.ex.userapplication.sevices.UserService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	private UserService userService;

	@PostMapping("/save")
	public Responce saveUser(@RequestBody User user) {
		userService.saveUser(user);
		Responce res = new Responce();
		res.setStatus(200);
		res.setMessage("success");
		return res;
	}
	@GetMapping("/fetchallusers")
	public Responce fetchAllUsers() {
		List<UserEntity> list = userService.getAllUsers();
		Responce res = new Responce();
		res.setStatus(200);
		res.setMessage("success");
		res.setData(list);
		return res;
	}

}
