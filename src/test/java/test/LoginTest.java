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
