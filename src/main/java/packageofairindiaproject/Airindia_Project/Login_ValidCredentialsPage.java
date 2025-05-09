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

public class Login_ValidCredentialsPage 
{
@FindBy(xpath ="//input[@name = 'username']")
WebElement username;
@FindBy(xpath = "//button[.= 'Sign In with OTP']")
WebElement signinotp;

public void un() throws IOException
{
	FileInputStream f1 = new FileInputStream("C:\\Users\\lenovo\\eclipse-workspace\\Airindia_Project\\ExcelSheet\\login.xlsx");
	Workbook w1 = WorkbookFactory.create(f1);
	String user = NumberToTextConverter.toText(w1.getSheet("loginsheet").getRow(1).getCell(0).getNumericCellValue()); 
	username.sendKeys(user);
}
public void signinotpbtn()
{
	signinotp.click();
}
public Login_ValidCredentialsPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
