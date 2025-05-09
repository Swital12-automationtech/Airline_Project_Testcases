package packageofairindiaproject.Airindia_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
@FindBy(id ="onetrust-accept-btn-handler")
WebElement cookie;
@FindBy(id ="signIn")
WebElement signin;
@FindBy(id ="create-account-button")
WebElement signup;

public void setcookie() throws InterruptedException
{
	Thread.sleep(2000);
	cookie.click();
}
public void signinlink() throws InterruptedException
{
	Thread.sleep(2000);
	signin.click();
}
public void signupbtn() throws InterruptedException
{
	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	Thread.sleep(3000);
	signup.click();
}
public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
}
