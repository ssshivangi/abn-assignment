package com.abnamro.steps;

import com.abnamro.action.Home;
import com.abnamro.action.Login;
import com.abnamro.drivers.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;


public class StepsDefinitions {

	private final Home homeActions = new Home();
	private final Login loginActions = new Login();

	WebDriver driver = DriverFactory.getDriver();

	@Given("^User loads the application$")
	public void user_is_on_Home_Page() {
		driver.get("file://"+System.getProperty("user.dir")+"/index.html");
	}
	
	@When("^Login in with user \"([^\"]*)\"$")
	public void signIn_user(String role) throws InterruptedException {
		loginActions.login(role);
	}
	
	@Then("^Verify if home page displayed for signed in user$")
	public void verifyHomePageLoaded() {
		homeActions.verifyHomePageLoaded();
	}

	@Then("^Verify if home page contains correct content$")
	public void verifyHomePageContentValue() {
		homeActions.verifyHomePageContentValue();
	}

	@Then("^Verify if correct user name displays on Home page$")
	public void verifyUserName() {
		//After development, add the code to validate correct user name
		//Assert.fail();
	}


	@Then("^Logout from ABN AMRO application$")
		public void logout_user() throws InterruptedException {
			homeActions.logoutUser();
	}

	@When("^User navigates to \"([^\"]*)\"$")
	public void navigate(String page) {
		//After development, add the code to validate correct user name
	}

	@Then("^Verify if Email Ids are available$")
	public void verifyEmailIds() {
		//After development, add the code to validate available Email Ids
	}

	@Then("^Verify if phone numbers are available$")
	public void verifyPhoneNumbers() {
		//After development, add the code to validate available phone numbers
	}

	@Then("^Verify if the appropriate FAQ are listed$")
	public void verifyFAQs() {
		//After development, add the code to validate available FAQs
	}

	@Then("^All the products for the user \"([^\"]*)\" is displayed$")
	public void verifyUserProducts(String role) {
		//After development, add the code to validate available Products
	}

	@Then("^User \"([^\"]*)\" can take required action for the product$")
	public void validateUserAction(String role) {
		//After development, add the code to validate user action on the product
	}

	@When("^Error case- Login in with user \"([^\"]*)\"$")
	public void logIn(String specificCase) {
		//After development, add the code to validate user action
	}

	@When("^Verify the error message for \"([^\"]*)\"$")
	public void verifyError(String specificCase) {
		//No error displayed with incorrect test data. After development, add the code to validate user action
	}

}
