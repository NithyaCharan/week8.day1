package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	public HomePage verifyHomePage() {
		String expTitle = "Leaftaps - TestLeaf Automation Platform";
		String text = getDriver().getTitle();
		Assert.assertEquals(text, expTitle);
		return this;

	}
	
	public MyHomePage clickCrmSfa() {
		getDriver().findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();
	}

}
