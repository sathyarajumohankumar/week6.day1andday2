package Tests;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.testleaf.utils.Basee;




public class EdiLead extends Basee {

	@Test(priority = 1)
	public void editLead() throws InterruptedException {
		
		// click crm/sfa
		driver.findElement(By.linkText("CRM/SFA")).click();
		// Click Leads link
		driver.findElement(By.linkText("Leads")).click();
		// click find leads
		driver.findElement(By.linkText("Find Leads")).click();
		// Enter first name
		driver.findElement(By.xpath("//div[@id='findLeads']//input[@name='firstName']")).sendKeys("a");
		// Click Find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		// Click on first resulting lead
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[1]")).click();
		// Verify title of the page
		String title = driver.getTitle();
		verifyTitle(title);

		// Click Edit
		driver.findElement(By.linkText("Edit")).click();
		WebElement eleCompanyName = driver.findElement(By.id("updateLeadForm_companyName"));

		eleCompanyName.clear();
		String newCompanyName = "Thunderbird";
		eleCompanyName.sendKeys(newCompanyName);
		// click update
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		Thread.sleep(3000);

		verifyUpdatedName(newCompanyName, driver.findElement(By.id("viewLead_companyName_sp")).getText());
	}

	private void verifyUpdatedName(String newCompanyName, String string) {
		// TODO Auto-generated method stub
		if (string.contains(newCompanyName))
			System.out.println("Company name changed successfully");

	}

	private void verifyTitle(String title) {
		// TODO Auto-generated method stub
		if (title.contains("View Lead"))
			System.out.println("Title verified as : " + title);
	}

}