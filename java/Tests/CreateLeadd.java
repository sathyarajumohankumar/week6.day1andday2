package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.testleaf.utils.Basee;

public class CreateLeadd extends Basee {

	@BeforeClass
	public void setFileName() {
		fileName="Create";
	}
	
	@Test(dataProvider = "getData") 
	public void createLead(String compName,String firstName,String lastName) throws InterruptedException {
		
		
		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Lead")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(compName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);

		WebElement eleSourceDropDown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select selectSource = new Select(eleSourceDropDown);

		selectSource.selectByVisibleText("Conference");

		driver.findElement(By.name("submitButton")).click();

		Thread.sleep(5000);

		System.out.println(driver.findElement(By.id("viewLead_firstName_sp")).getText());
	}

}
