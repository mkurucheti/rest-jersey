package com.startupkit.rest.jersy.bean;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.glassfish.jersey.server.JSONP;

@XmlRootElement(name = "user")
public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userName;
	private String userId;
	private String password;
	
	public User() {
	}
	public String getUserName() {
		return userName;
	}
	//@XmlElement 
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserId() {
		return userId;
	}
	//@XmlElement 
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	//@XmlElement 
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
