package com.cg.SunlightAddCust;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCustPojo 
{
	WebDriver driver;
	
	AddCustPojo(WebDriver driver)
	{
		this.driver = driver;
	}
	@FindBy(how = How.ID, using="add-user")WebElement addCust;



	public void setAddCust() {
		//this.addCust.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",addCust); 
		js.executeScript("arguments[0].click();",addCust); 
		
	}
	
}
