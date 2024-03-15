package StepDefinitions;

import io.cucumber.java.en.*;
import pageObjects.AddProductObj;
import pageObjects.LandingPage;
import pageObjects.PageObjectManager;
import utils.TestBase;
import utils.TestContextSetup;

import org.openqa.selenium.chrome.*;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class AddProduct {
	
	
	public WebDriver driver;
	public String landingPageproductName;
	public String offerPageProductName;
	TestContextSetup TestContextSetup;
	PageObjectManager pageObjectManager;
	TestBase testBase;
	
	// Single responsibility Principle
	// loosly coupled
	//Factory Design Pattern
	
	public AddProduct(TestContextSetup TestContextSetup) {
		this.TestContextSetup=TestContextSetup;
	}

	@When("user add three units")
	public void user_add_three_units() {
	    // Write code here that turns the phrase above into concrete actions

		AddProductObj AddProductObj = TestContextSetup.pageObjectManager.getAddPageObj();
		
		AddProductObj.addItem();
	}
	@Then("User go to the cart")
	public void user_go_to_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("check if the product name is added in the cart with the same Tom")
	public void check_if_the_product_name_is_added_in_the_cart_with_the_same_tom() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
