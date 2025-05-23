package packageofairindiaproject.Airindia_Project;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listner.class)

public class TestCase4_Search_OneWay extends Launch_Quit
{
@Test
//(retryAnalyzer = IRetry_Logic.class)
public void searchonewayflight() throws InterruptedException
{
	HomePage homepage = new HomePage(driver);
	homepage.setcookie();
	Search_FlightPage search = new Search_FlightPage(driver);
	search.onewayradiobtn(driver);
	search.origin(driver);
	search.destination(driver);
	search.departuredate();
	search.searchbtn();
}
}
