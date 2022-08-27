package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class EditLead extends ProjectSpecificMethods{
	
	public EditLead changeCompanyName(String companyName) {
		getDriver().findElement(By.id("updateLeadForm_companyName")).clear();
		getDriver().findElement(By.id("updateLeadForm_companyName")).sendKeys(companyName);
		return this;
	}
	
	public ViewLeadsPage clickUpdate() {
		getDriver().findElement(By.name("submitButton")).click();
		return new ViewLeadsPage();
	}
	
}
