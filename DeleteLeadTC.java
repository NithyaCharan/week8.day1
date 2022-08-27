package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class DeleteLeadTC extends ProjectSpecificMethods{

	@BeforeTest
	public void setup() {
		excelFileName = "DeleteLead";
	}
	@Test(dataProvider = "fetch")
	public void createLead(String uname,String pwd,String frstName) {
		LoginPage lp = new LoginPage();
		lp.typeUserName(uname).typePassword(pwd).clickLogin().clickCrmSfa().clickLeadsTab().clickFindLeadsLink().typeFirstName(frstName)
		.clickFindLeads().clickFirstMatchingLead().verifyViewLeads().clickDelete().clickFindLeadsLink().typeLeadId()
		.verifyDeleted();
}
}
