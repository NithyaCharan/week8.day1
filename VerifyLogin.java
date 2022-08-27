package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class VerifyLogin extends ProjectSpecificMethods {

	@BeforeTest
	public void setup() {
		excelFileName = "Login";
	}
	@Test(dataProvider = "fetch")
	public void veriLogin(String uname,String pwd) {
		LoginPage lp = new LoginPage();
		lp.typeUserName(uname).typePassword(pwd).clickLogin().verifyHomePage();
	}

}
