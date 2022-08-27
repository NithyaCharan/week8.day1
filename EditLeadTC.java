package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class EditLeadTC extends ProjectSpecificMethods{

	@BeforeTest
	public void setup() {
		excelFileName = "EditLead";
	}
	@Test(dataProvider = "fetch")
	public void editLead(String uname,String pwd,String company, String first, String last,String compName) {
		LoginPage lp = new LoginPage();
		lp.typeUserName(uname).typePassword(pwd).clickLogin().clickCrmSfa().clickLeadsTab().clickCreateLeadsLink().
		typeCompanyName(company).typeFirstName(first).typeLastName(last).clickCreateLeadsButton().verifyViewLeads()
		.clickEdit().changeCompanyName(compName).clickUpdate().verifyViewLeads();
	}
}
