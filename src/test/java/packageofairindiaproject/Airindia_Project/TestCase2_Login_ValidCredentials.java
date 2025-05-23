package packageofairindiaproject.Airindia_Project;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listner.class)

public class TestCase2_Login_ValidCredentials extends Launch_Quit
{
@Test(retryAnalyzer = IRetry_Logic.class)
public void loginwithvalidcredentials() throws Exception
{
	HomePage homepage = new HomePage(driver);
	homepage.setcookie();
	homepage.signinlink();
	//Login_ValidCredentialsPage loginpage = new Login_ValidCredentialsPage(driver);
	//loginpage.un();
	//loginpage.signinotpbtn();

}
}
