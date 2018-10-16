package com.cg.SunlightAddCust;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCustTest {
	
	
	WebDriver driver;
	LoginPojo pojo;
	AddCustPojo pojo1;
	@Before
	public void setUp()
	{
		driver=DriverUtil.driverInitialize("chrome");
		pojo= new LoginPojo();
		pojo1=new AddCustPojo(driver);
		
		
		PageFactory.initElements(driver, pojo);
		PageFactory.initElements(driver, pojo1);
		
	}

	@Test
	public void test() throws Throwable {
		i_am_on_the_login_page();
		i_enter_correct_username_and_password();
		i_must_go_to_into_the_website();
		i_click_on_add_customer_then_that_page_should_display();
		
	}

	@Given("^I am on the login page$")
	public void i_am_on_the_login_page() throws Throwable {
	    
		driver.get("https://waftest.slfportal.com/uiuxQA/#/");
	}

	@When("^I enter correct username and password$")
	public void i_enter_correct_username_and_password() throws Throwable {
		 pojo.setEmail("meghaa.1993@gmail.com");
		    pojo.setPassword("Sunlight@123");
	}

	@Then("^I must go to into the website$")
	public void i_must_go_to_into_the_website() throws Throwable {
		pojo.setSubmit();
		WebDriverWait wait=new WebDriverWait(driver,100);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("add-user")));
	}

	@Then("^i click on add customer then that page should display$")
	public void i_click_on_add_customer_then_that_page_should_display() throws Throwable {
	    
		Thread.sleep(3000);
		pojo1.setAddCust();
		
	}

	

}
