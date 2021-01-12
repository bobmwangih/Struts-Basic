package com.bob.struts;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.EmailValidator;
import com.opensymphony.xwork2.validator.annotations.IntRangeFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.Validations;
import com.opensymphony.xwork2.validator.annotations.ValidatorType;


@Action("/register")
@Results({ @Result(name = "success", location = "/registered.jsp"), @Result(name = "input", location = "/index.jsp") })
public class RegisterAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
	private String email;
	private int age;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public int getAge() {
		return age;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "RegisterAction [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", age=" + age
				+ "]";
	}

	// does form validation ---->check output with "input"
//	public void validate() {
//		if (firstName.length() == 0) {
//			addFieldError("firstName", "First name is required");
//		}
//		if (lastName.length() == 0) {
//			addFieldError("lastName", "last name is required");
//		}
//
//		if (email.length() == 0) {
//			addFieldError("email", "Email is required");
//		}
//
//	}
	
	
//validation using annotation
	@Validations(requiredStrings = {
			@RequiredStringValidator(type = ValidatorType.SIMPLE, fieldName = "firstName", message = "First Name must be set!"),
			@RequiredStringValidator(type = ValidatorType.SIMPLE, fieldName = "lastName", message = "last name must be set!") }, emails = {
					@EmailValidator(type = ValidatorType.SIMPLE, fieldName = "email", message = "Enter a valid email") }, intRangeFields = {
							@IntRangeFieldValidator(type = ValidatorType.SIMPLE, fieldName = "age", min = "18", message = "Must be over ${min} years") })
	public String execute() {
		System.out.println(toString());
		return SUCCESS;
	}

}
