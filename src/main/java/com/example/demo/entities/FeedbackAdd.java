package com.example.demo.entities;

import java.security.Timestamp;
import java.sql.Date;

import javax.persistence.Column;

public class FeedbackAdd {
   
	
	String feedback_text;
	
	
	Date   createdOn;
	
	
	int customer;
	
	int owner;

	public FeedbackAdd() {
		super();
	}

	public FeedbackAdd(String feedback_text,Date createdOn, int customer, int owner) {
		super();
		this.feedback_text = feedback_text;
		this.createdOn = createdOn;
		this.customer = customer;
		this.owner = owner;
	}

	public String getFeedback_text() {
		return feedback_text;
	}

	public void setFeedback_text(String feedback_text) {
		this.feedback_text = feedback_text;
	}



	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public int getCustomer() {
		return customer;
	}

	public void setCustomer(int customer) {
		this.customer = customer;
	}

	public int getOwner() {
		return owner;
	}

	public void setOwner(int owner) {
		this.owner = owner;
	}
	
	
}
