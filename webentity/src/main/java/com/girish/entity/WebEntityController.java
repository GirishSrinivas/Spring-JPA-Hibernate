package com.girish.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequestMapping(URLMappingConstants.GENERAL)
public class WebEntityController
{
	@Autowired
	private UsersRepository usersRepository;
	
	@ResponseBody
	@RequestMapping(URLMappingConstants.READ)
	public Iterable<User> getAllUsers()
	{
		return usersRepository.findAll();
		
	}
} 
