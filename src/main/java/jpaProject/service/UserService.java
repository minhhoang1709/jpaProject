package jpaProject.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jpaProject.dto.UserDto;
import jpaProject.model.UserModel;
import jpaProject.repository.UserRepository;

@Service
public class UserService {

	private static final ModelMapper modelMapper = new ModelMapper();

	@Autowired
	private UserRepository userRepository;

	public UserDto getUserById(int userId) {
		UserModel userModel = userRepository.findOne(userId);
		UserDto userDto = convertToDto(userModel);
		return userDto;
	}

	private UserDto convertToDto(UserModel userModel) {
		UserDto userDto = modelMapper.map(userModel, UserDto.class);

		return userDto;
	}
}
