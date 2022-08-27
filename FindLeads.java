package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.ProjectSpecificMethods;


public class FindLeads extends ProjectSpecificMethods{

	public FindLeads typeFirstName(String firstName) {
		getDriver().findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(firstName);
		return this;
	}
	
	public FindLeads clickFindLeads() {
		getDriver().findElement(By.xpath("//button[text()='Find Leads']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return this;
	}

	public ViewLeadsPage clickFirstMatchingLead() {
		leadID = getDriver().findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		getDriver().findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new ViewLeadsPage();
	}
	
	public FindLeads typeLeadId() {
		getDriver().findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		return this;
	}
	
	public FindLeads verifyDeleted() {
		String text = getDriver().findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) { System.out.println("Text matched");
		} else { System.out.println("Text not matched");}
	
		//String expctdTxt = "No records to display";
		//Assert.assertEquals(actualTxt, expctdTxt);
		return this;

	}
	
	
}
