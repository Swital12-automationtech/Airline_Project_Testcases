package packageofairindiaproject.Airindia_Project;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listner.class)

public class TestCase3_Login_InvalidCredentials extends Launch_Quit
{
	@Test(retryAnalyzer = IRetry_Logic.class)
	public void invalidlogincredentails() throws InterruptedException, IOException
	{
	HomePage homepage = new HomePage(driver);
	homepage.setcookie();
	homepage.signinlink();
	Login_InvalidCredentialsPage invalidloginpage = new Login_InvalidCredentialsPage(driver);
	invalidloginpage.wrongun();
	Login_ValidCredentialsPage loginpage = new Login_ValidCredentialsPage(driver);
	loginpage.signinotpbtn();
	invalidloginpage.invalidloginmsg();
}
}