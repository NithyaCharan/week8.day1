package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.ProjectSpecificMethods;

public class ViewLeadsPage extends ProjectSpecificMethods{
	
	public ViewLeadsPage verifyViewLeads() {
		String title = getDriver().getTitle();
		String expected = "View Lead | opentaps CRM";
		Assert.assertEquals(title, expected);
		return this;
	}
	
	public EditLead clickEdit() {
		getDriver().findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
		return new EditLead();
	}
	
	public MyLeadsPage clickDelete() {
		getDriver().findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
		return new MyLeadsPage();
	}
}
