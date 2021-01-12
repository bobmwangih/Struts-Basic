package com.bob.struts;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@Action("/verify")
@Result(name="SUCCESS",location="/success.jsp")
public class LoginAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private String uname;
	private String password;

		
	public String getUname() {
		return uname;
	}


	public String getPassword() {
		return password;
	}


	public void setUname(String uname) {
		this.uname = uname;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String execute() {
		if(uname.equals("bob")&& password.equals("admin")) {

			return SUCCESS;	
		}
		else {
			return ERROR;
		}
		}
}
