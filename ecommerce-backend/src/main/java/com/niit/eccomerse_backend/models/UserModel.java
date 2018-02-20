package com.niit.eccomerse_backend.models;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="userdetails")
public class UserModel {

	
	
	
	@Id
	@Column(name="userid")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userid;
	
	@Column
	private String role;
	@Column
	private String username;
	
	@Column(name="Password")
	private String password;
	@Column(name="Email")
	private String email;
	@Column(name="DOB")
	private String birthdate;
	@Column(name="Mobile")
	private String mobile_number;
	@Column(name="Address")
	private String address;
	@Column(name="Gender")
	private String gender;
	
	@Column(name="Occupation")
	private String occupation;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="basketId")
	private BasketModel basket;
 
	
	
	public BasketModel getBasket() {
		return basket;
	}

	public void setBasket(BasketModel basket) {
		this.basket = basket;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
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

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
      
	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public UserModel(String username, String password, String email, String birthdate, String mobile_number,
			String address, String gender, String occupation) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.birthdate = birthdate;
		this.mobile_number = mobile_number;
		this.address = address;
		this.gender = gender;
		this.occupation = occupation;
	}

	public UserModel() {
		// TODO Auto-generated constructor stub
	}
	

}
