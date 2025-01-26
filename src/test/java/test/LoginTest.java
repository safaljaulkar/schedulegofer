package test;

import java.io.IOException;

import org.testng.annotations.Test;

import action.LoginAction;
import base.TestBase;

public class LoginTest extends TestBase{

	
	LoginAction action = new LoginAction();
	
	
	@Test(priority = 1)
	public void VerifyLogin() throws IOException {

		action.Login(UserName, Password);
	
	
	
	}
	
	
}




// - Title Verification Before login
// - Validation check Process for Blank user-name and valid password
// - Validation check process for valid user-name and blank password field
// - Validation check process for both user-name and password fields are blank
// - Normal Login Process with valid user-name and valid password
// - Title Verification After login
// - Logout process