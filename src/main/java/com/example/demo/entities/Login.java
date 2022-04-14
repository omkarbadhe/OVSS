package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="login")
public class Login {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int UserID;
	@Column
	String email;
	@Column
	String password;
	@Column
	String user_type;
	@Column
	int isactive;
	
	@ManyToOne
	@JoinColumn(name = "questionID")
	Question questionID;
	
	@Column
	String answer;
	
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Login(String email, String password, String user_type, int isactive, Question questionID, String answer) {
		super();
		this.email = email;
		this.password = password;
		this.user_type = user_type;
		this.isactive = isactive;
		this.questionID = questionID;
		this.answer = answer;
	}

	public int getUserID() {
		return UserID;
	}
	public void setUserID(int userID) {
		UserID = userID;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getuser_type() {
		return user_type;
	}
	public void setuser_type(String user_type) {
		this.user_type = user_type;
	}
	public int getIsactive() {
		return isactive;
	}
	public void setIsactive(int isactive) {
		this.isactive = isactive;
	}
	public Question getQuestionID() {
		return questionID;
	}
	public void setQuestionID(Question questionID) {
		this.questionID = questionID;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	
	
	

}
