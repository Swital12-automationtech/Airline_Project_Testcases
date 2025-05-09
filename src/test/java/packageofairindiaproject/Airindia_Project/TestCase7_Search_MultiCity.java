package packageofairindiaproject.Airindia_Project;

import java.awt.AWTException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listner.class)

public class TestCase7_Search_MultiCity extends Launch_Quit{

@Test(retryAnalyzer = IRetry_Logic.class)
public void search_multicity() throws InterruptedException, AWTException
{
	HomePage homepage = new HomePage(driver);
	homepage.setcookie();
	Search_FlightPage search = new Search_FlightPage(driver);
	search.onewayradiobtn(driver);
	search.multicity(driver);
	//search.origin(driver);
	//search.destination(driver);
	//search.departuredate();
	//search.classselect(driver);
	//search.searchbtn();
}

}
