package com.example.demo.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="service_details")
public class ServiceDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int servicedetID;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="service_id")
	Services service_id;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="ownerID")
	Owner ownerID;
	@Column
	float price;
	@Column
	String description;
	public ServiceDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ServiceDetails(Services service_id, Owner ownerID, float price, String description) {
		super();
		this.service_id = service_id;
		this.ownerID = ownerID;
		this.price = price;
		this.description = description;
	}
	public int getServicedetID() {
		return servicedetID;
	}
	public void setServicedetID(int servicedetID) {
		this.servicedetID = servicedetID;
	}
	public Services getService_id() {
		return service_id;
	}
	public void setService_id(Services service_id) {
		this.service_id = service_id;
	}
	public Owner getOwnerID() {
		return ownerID;
	}
	public void setOwnerID(Owner ownerID) {
		this.ownerID = ownerID;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	


	
}
