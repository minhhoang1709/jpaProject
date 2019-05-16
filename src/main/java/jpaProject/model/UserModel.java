package jpaProject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbluserv2")
public class UserModel {

	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "user_pass")
	private String userPass;

	@Column(name = "user_full_name")
	private String userFullName;

	@Column(name = "user_created_date")
	private String userCreatedDate;

	public UserModel(int userId, String userName, String userPass, String userFullName, String userCreatedDate) {
		this.userId = userId;
		this.userName = userName;
		this.userPass = userPass;
		this.userFullName = userFullName;
		this.userCreatedDate = userCreatedDate;
	}

	public UserModel() {
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public String getUserFullName() {
		return userFullName;
	}

	public void setUserFullName(String userFullName) {
		this.userFullName = userFullName;
	}

	public String getUserCreatedDate() {
		return userCreatedDate;
	}

	public void setUserCreatedDate(String userCreatedDate) {
		this.userCreatedDate = userCreatedDate;
	}

}
