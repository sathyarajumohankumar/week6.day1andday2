package stepdef;

import org.openqa.selenium.By;
import org.testng.Assert;

import hooks.BaseMethod;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CreateLead extends BaseMethod {

	@When("Click on {string} link")
	public void clickLink(String option) {

		driver.findElement(By.linkText(option)).click();

	}

	@Then("{string} Page should be displayed")
	public void verifyPage(String pageName) {

		boolean contains = driver.getTitle().contains(pageName);
		Assert.assertTrue(contains);
		
	}

	@Then("Enter Company name as {string}")
	public void enterCompanyName(String compName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(compName);
	}

	@Then("Enter First name as {string}")
	public void enterFirstName(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
	}

	@Then("Enter Last name as {string}")
	public void enterLastName(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
	}

	@When("Click on create lead button")
	public void clickCreateLeadButton() {
		driver.findElement(By.name("submitButton")).click();
	}

}