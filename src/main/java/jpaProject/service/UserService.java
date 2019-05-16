package jpaProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jpaProject.model.UserModel;
import jpaProject.repository.UserRepository;


@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	
	public UserModel getUserById(int userId) {
		UserModel userModel = userRepository.findOne(userId);
		return userModel;
	}
}
