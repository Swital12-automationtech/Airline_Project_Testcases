package packageofairindiaproject.Airindia_Project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Search_FlightPage 
{
@FindBy(id = "dpFromDate")	
WebElement depart;
@FindBy(xpath = "//select[@class='custom-select']")	
WebElement departdate;
@FindBy(xpath = "(//div[.=' March 2025 ']/parent::div/child::ngb-datepicker-month/child::*)[3]/div")
List<WebElement> dateselect;
@FindBy(xpath = "(//div[.=' April 2025 ']/parent::div/child::ngb-datepicker-month/child::*)[3]/div")
List<WebElement> returndateselect;
@FindBy(xpath = "//button[text() = 'Search']")
WebElement search;
@FindBy(xpath = "//a[.='Multi City']")
WebElement city;
@FindBy(id = "From")
WebElement from;
@FindBy(xpath = "(//input[@id='To'])[1]")
WebElement to;
@FindBy(xpath = "(//input[@id='To'])[2]")
WebElement to1;
@FindBy(id = "datepickerlone")
WebElement multiselectdate;
@FindBy(xpath = "(//select[@class='form-select'])[1]")
WebElement multiselectmonth;
@FindBy(xpath = "//select[contains(@title, 'Select year')]")
WebElement multiselectyear;
@FindBy(xpath = "(//div[@class='ngb-dp-month ng-star-inserted']/child::ngb-datepicker-month/child::*)[3]/div")
List<WebElement> multiselectdate1;
public void onewayradiobtn(WebDriver driver) 
{
	JavascriptExecutor js = (JavascriptExecutor) driver;  
    // Locate the shadow element and click the radio button
    String script = "return document.querySelector('#ai-booking-widget > ai-tab-group > ai-tab:nth-child(1) > ai-search-flight > slot-fb > div.ai-search-flight-wrapper > div.ai-search-trip > div > div.ai-search-trip-type > ai-radio-group').shadowRoot.querySelector('#radio0')";
    WebElement e1 = (WebElement) js.executeScript(script);
    e1.click();
}
public void origin(WebDriver driver) 
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	String originAdd = "return document.querySelector('#ai-booking-widget > ai-tab-group > ai-tab:nth-child(1) > ai-search-flight > slot-fb > div.ai-search-flight-wrapper > div.ai-origin-dest-search > ai-origin-destination').shadowRoot.querySelector('#originAutoComplete').shadowRoot.querySelector('div > div > div.ai-input-wrap > input')";
	WebElement e2 = (WebElement) js.executeScript(originAdd);
	e2.click();
	e2.clear();
    e2.sendKeys("Ahmedabad" +Keys.ENTER);
   /* WebElement a1 = driver.findElement(By.xpath("//div[contains(text(),'Delhi')]"));
    Actions actions = new Actions(driver);
    actions.moveToElement(a1).click().build().perform();*/
}
public void destination(WebDriver driver)
{
	JavascriptExecutor js = (JavascriptExecutor) driver;

	String destAdd = "return document.querySelector('#ai-booking-widget > ai-tab-group > ai-tab:nth-child(1) > ai-search-flight > slot-fb > div.ai-search-flight-wrapper > div.ai-origin-dest-search > ai-origin-destination').shadowRoot.querySelector('#destinationAutoComplete').shadowRoot.querySelector('div > div > div.ai-input-wrap > input')";
	WebElement e3 = (WebElement) js.executeScript(destAdd);
	e3.click();
	e3.clear();
    e3.sendKeys("Pune" +Keys.ARROW_DOWN.ENTER);
}
public void departuredate() throws InterruptedException
{
	depart.click();
	Thread.sleep(4000);
	Select s1 = new Select(departdate);
	s1.selectByVisibleText("Mar 2025");
	Thread.sleep(4000);
	//System.out.println(dateselect);
	dateselect.get(4).click();
}
public void returndate() throws InterruptedException
{
	depart.click();
	Thread.sleep(4000);
	Select s1 = new Select(departdate);
	s1.selectByVisibleText("Apr 2025");
	Thread.sleep(4000);
	//System.out.println(dateselect);
	returndateselect.get(4).click();
}
public void multicity(WebDriver driver) throws InterruptedException
{
	city.click();
	from.sendKeys("DEL");
    //firstSuggestion.sendKeys("Delhi");
    WebElement a1 = driver.findElement(By.xpath("//span[contains(text(),'DEL')]"));
    Actions actions = new Actions(driver);
    actions.moveToElement(a1).click().build().perform();
    to.sendKeys("BEN");
    WebElement a2 = driver.findElement(By.xpath("//span[contains(text(),'BLR')]"));
    actions.moveToElement(a2).click().build().perform();
    multiselectdate.click();
    Select s2 = new Select(multiselectmonth);
    s2.selectByVisibleText("Mar");
    Select s3 = new Select(multiselectyear);
    s3.selectByVisibleText("2025");
    multiselectdate1.get(3).click();
    Thread.sleep(3000);
    to1.sendKeys("DEL");
    WebElement a3 = driver.findElement(By.xpath("//span[contains(text(),'DEL')]"));
    actions.moveToElement(a3).click().build().perform();
    WebElement removebtn = driver.findElement(By.xpath("//span[@class='remove-flight']"));
    removebtn.click();
    driver.findElement(By.xpath("//button[@class='col-lg-4 col-12 booking-flight-btn']")).click();

}
public void classselect(WebDriver driver) throws AWTException, InterruptedException
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	String classsel = "return document.querySelector('#ai-booking-widget > ai-tab-group > ai-tab:nth-child(1) > ai-search-flight > slot-fb > div.ai-search-flight-wrapper > div.ai-search-trip > div > div.ai-search-categories > div.ai-class-selection > ai-dropdown').shadowRoot.querySelector('div')";
	WebElement e3 = (WebElement) js.executeScript(classsel);
	e3.click();
	Robot r1 = new Robot();
	r1.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	r1.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	r1.keyPress(KeyEvent.VK_ENTER);
}
public void searchbtn() 
{
	search.click();
}
public Search_FlightPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
