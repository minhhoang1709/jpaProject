package jpaProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import jpaProject.dto.UserDto;

import jpaProject.service.UserService;

@Controller
@RequestMapping(path="/api")
public class UserController {
	
	@Autowired UserService userService;
	
	@RequestMapping(path="/user/profile", method={ RequestMethod.GET })
	@ResponseBody
	public UserDto getprofile(int userId) {
		UserDto userDto = userService.getUserById(userId);
		return userDto;
	}
}