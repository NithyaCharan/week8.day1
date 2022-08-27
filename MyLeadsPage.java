package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods{

	public CreateLeadPage clickCreateLeadsLink() {
		getDriver().findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage();
	}
	
	public FindLeads clickFindLeadsLink() {
		getDriver().findElement(By.linkText("Find Leads")).click();
		return new FindLeads();
	}
	
	public FindLeads clickMergeLeadsLink() {
		getDriver().findElement(By.linkText("Merge Leads")).click();
		return new FindLeads();
	}
}
