package jpaProject.dto;

public class UserDto {
	private String userName;
	private String userCreatedDate;

	public UserDto() {

	}

	public UserDto(String userName, String userCreatedDate) {
		this.userName = userName;
		this.userCreatedDate = userCreatedDate;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserCreatedDate() {
		return userCreatedDate;
	}

	public void setUserCreatedDate(String userCreatedDate) {
		this.userCreatedDate = userCreatedDate;
	}

}
