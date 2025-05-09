package packageofairindiaproject.Airindia_Project;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listner.class)
public class TestCase1_Registration_Airindia extends Launch_Quit
{
	@Test(retryAnalyzer = IRetry_Logic.class)
	public void new_registration() throws InterruptedException, AWTException, IOException
	{
	HomePage homepage = new HomePage(driver);
	homepage.setcookie();
	homepage.signinlink();
	homepage.signupbtn();
	
	RegistrationPage signuppage = new RegistrationPage(driver);
	signuppage.titlebox(driver);
	signuppage.fname();
	signuppage.lname();
	signuppage.dob();
	signuppage.emailtext();
	signuppage.confirmemailtext();
	signuppage.mobile();
	signuppage.confirmemobile();
	signuppage.readandaceept();
	signuppage.submitbtn();
	signuppage.assertmsg();
	}
}
