package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class CreateLeadTC extends ProjectSpecificMethods {

	@BeforeTest
	public void setup() {
		excelFileName = "CreateLead";
	}
	@Test(dataProvider = "fetch")
	public void createLead(String uname,String pwd,String company, String first, String last) {
		LoginPage lp = new LoginPage();
		lp.typeUserName(uname).typePassword(pwd).clickLogin().clickCrmSfa().clickLeadsTab().clickCreateLeadsLink().
		typeCompanyName(company).typeFirstName(first).typeLastName(last).clickCreateLeadsButton().verifyViewLeads();
	}
	
}
