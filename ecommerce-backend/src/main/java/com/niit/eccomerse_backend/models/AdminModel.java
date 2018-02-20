package com.niit.eccomerse_backend.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AdminDetails")
public class AdminModel implements Serializable {
 

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="UserId")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int adminId;
	@Column
	private String adminname;
	@Column
    private String role;
	@Column(name="Password")
	private String password;
	@Column(name="DOB")
	private String birthdate;
	@Column(name="Email")
	private String email;
	@Column(name="Address")
	private String address;
	@Column(name="Gender")
	private String gender;
	@Column(name="Mobile")
	private String mobile_number;
	public String getAdminname() {
		return adminname;
	}
	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}          
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}
	 
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public AdminModel(String adminname, String password, String birthdate, String email, String address, String gender,
			String mobile_number) {
		super();
		this.adminname = adminname;
		this.password = password;
		this.birthdate = birthdate;
		this.email = email;
		this.address = address;
		this.gender = gender;
		this.mobile_number = mobile_number;
	}
	
	public AdminModel() {}
}
