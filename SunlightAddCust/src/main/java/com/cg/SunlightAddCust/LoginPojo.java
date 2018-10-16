package com.cg.SunlightAddCust;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPojo {

	
	@FindBy(how = How.NAME, using = "emailId")
	WebElement email;

	@FindBy(how = How.NAME, using = "password")
	WebElement password;

	@FindBy(how = How.ID, using = "submit")
	WebElement submit;

	public String getEmail() {
		return email.getAttribute("value");
	}

	public void setEmail(String email) {
		this.email.sendKeys(email);
	}

	public String getPassword() {
		return password.getAttribute("value");
	}

	public void setPassword(String password) {
		this.password.sendKeys(password);
	}

	public void setSubmit() {
		this.submit.click();
	}
}
