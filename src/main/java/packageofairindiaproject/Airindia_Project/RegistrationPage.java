package packageofairindiaproject.Airindia_Project;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RegistrationPage 
{

@FindBy(id="titleDropdown")
WebElement title;
@FindBy(id = "userfirstNameInput")
WebElement firstname;
@FindBy(id = "userLastName")
WebElement lastname;
@FindBy(id = "date_of_birth")
WebElement birthdate;
@FindBy(xpath = "//select[contains(@title, 'Select month')]")
WebElement month;
@FindBy(xpath = "//select[contains(@title, 'Select year')]")
WebElement year;
@FindBy(xpath = "//div[@class='ngb-dp-week ng-star-inserted']")
List<WebElement> date;
@FindBy(id = "contactEmail")
WebElement email;
@FindBy(id = "confirmEmail")
WebElement confirmemail;
@FindBy(id = "phoneNo")
WebElement mobno;
@FindBy(id = "confirmPhoneNo")
WebElement confirmmobno;
@FindBy(id = "promotionCheck")
WebElement prefcheck;
@FindBy(id = "submit-button")
WebElement submit;
@FindBy(xpath ="//span[@class='ng-star-inserted']")
WebElement msg;
public void titlebox(WebDriver driver) throws AWTException, InterruptedException
{
	title.click();
	Robot r1 = new Robot();
	r1.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	r1.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	r1.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	r1.keyPress(KeyEvent.VK_ENTER);
}
public void fname() throws IOException, InterruptedException
{
	Thread.sleep(4000);
	FileInputStream f1 = new FileInputStream("C:\\Users\\lenovo\\eclipse-workspace\\Airindia_Project\\ExcelSheet\\login.xlsx");
	Workbook w1 = WorkbookFactory.create(f1);
	String firstnamesheet = w1.getSheet("registration").getRow(1).getCell(0).getStringCellValue();
	firstname.sendKeys(firstnamesheet);
}
public void lname() throws IOException
{
	FileInputStream f1 = new FileInputStream("C:\\Users\\lenovo\\eclipse-workspace\\Airindia_Project\\ExcelSheet\\login.xlsx");
	Workbook w1 = WorkbookFactory.create(f1);
	String lastnamesheet = w1.getSheet("registration").getRow(1).getCell(1).getStringCellValue();
	lastname.sendKeys(lastnamesheet);
}
public void dob() throws InterruptedException
{
	Thread.sleep(3000);
	birthdate.click();
	Select s1 = new Select(month);
	s1.selectByVisibleText("Jan");
	Select s2 = new Select(year);
	s2.selectByVisibleText("1993");
	System.out.println(date.get(4));
	date.get(5).click();
}
public void emailtext() throws IOException
{
	FileInputStream f1 = new FileInputStream("C:\\Users\\lenovo\\eclipse-workspace\\Airindia_Project\\ExcelSheet\\login.xlsx");
	Workbook w1 = WorkbookFactory.create(f1);
	String emailsheet = w1.getSheet("registration").getRow(1).getCell(2).getStringCellValue();
	email.sendKeys(emailsheet);
}
public void confirmemailtext() throws IOException
{
	FileInputStream f1 = new FileInputStream("C:\\Users\\lenovo\\eclipse-workspace\\Airindia_Project\\ExcelSheet\\login.xlsx");
	Workbook w1 = WorkbookFactory.create(f1);
	String confirmemailsheet = w1.getSheet("registration").getRow(1).getCell(3).getStringCellValue();
	confirmemail.sendKeys(confirmemailsheet);
}
public void mobile() throws IOException
{
	FileInputStream f1 = new FileInputStream("C:\\Users\\lenovo\\eclipse-workspace\\Airindia_Project\\ExcelSheet\\login.xlsx");
	Workbook w1 = WorkbookFactory.create(f1);
	String mobilesheet = NumberToTextConverter.toText(w1.getSheet("registration").getRow(1).getCell(4).getNumericCellValue());
	mobno.sendKeys(mobilesheet);
}
public void confirmemobile() throws IOException
{
	FileInputStream f1 = new FileInputStream("C:\\Users\\lenovo\\eclipse-workspace\\Airindia_Project\\ExcelSheet\\login.xlsx");
	Workbook w1 = WorkbookFactory.create(f1);
	String confirmmobilesheet = NumberToTextConverter.toText(w1.getSheet("registration").getRow(1).getCell(4).getNumericCellValue());
	confirmmobno.sendKeys(confirmmobilesheet);
}
public void readandaceept() throws IOException
{
	prefcheck.click();
}
public void submitbtn() throws IOException, InterruptedException
{
	Thread.sleep(2000);
	submit.click();
}
public void assertmsg() throws IOException
{
	String Actualmsg = msg.getText();
	String Expectedmsg = " We found an existing Maharaja Club account with this mobile number. ";
	Assert.assertEquals(Actualmsg, Expectedmsg, "login not happen");
}
public RegistrationPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
}
