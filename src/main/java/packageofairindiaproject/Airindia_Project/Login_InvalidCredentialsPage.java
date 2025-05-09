package packageofairindiaproject.Airindia_Project;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Login_InvalidCredentialsPage 
{
	@FindBy(xpath ="//input[@name = 'username']")
	WebElement username;
	@FindBy(xpath ="//p[@class='cabc5f3cc c2a5c4bc6']")
	WebElement message;
	public void wrongun() throws IOException
	{
		FileInputStream f1 = new FileInputStream("C:\\Users\\lenovo\\eclipse-workspace\\Airindia_Project\\ExcelSheet\\login.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		String user = NumberToTextConverter.toText(w1.getSheet("loginsheet").getRow(1).getCell(1).getNumericCellValue()); 
		username.sendKeys(user);
	}
	public void invalidloginmsg()
	{
		String Actualmsg = message.getText();
		String Expectedmsg = "Could not find an account associated with this phone number. Please create an account";
		Assert.assertEquals(Actualmsg, Expectedmsg, "login fails");
	}
	public Login_InvalidCredentialsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
