package com.example.demo.model;

import javax.management.relation.Role;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;


@Entity
@Table(name = "user")
public class User {

		@Id
		@GeneratedValue
		@Column(name = "id")
		private int id;

		@Column(name = "name")
		private String name;

		@Column(name = "username")
		private String username;
		
		@Column(name = "password")
		private String password;
		
		@Column(name = "mobile_no")
		private String mobileNumber;
		
		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
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


		public String getMobileNumber() {
			return mobileNumber;
		}


		public void setMobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public char getActive() {
			return active;
		}


		public void setActive(char active) {
			this.active = active;
		}


		public Role getRole() {
			return role;
		}


		public void setRole(Role role) {
			this.role = role;
		}


		public void setId(int id) {
			this.id = id;
		}


		@Column(name = "email_Id")
		private String email;

		@Column(name="active")
		private char active;
		
		
		@JoinColumn(name="user_roleId")
		private Role role;

		
		public User(String name, String username, String password, String mobileNumber, String emailID) {
			this.name = name;
			this.username = username;
			this.password = password;
			this.mobileNumber = mobileNumber;
			this.email = emailID;
			this.active = 'A';
		}


		public User() {
			// TODO Auto-generated constructor stub
		}


		public Long getId() {
			// TODO Auto-generated method stub
			return null;
		}
}
