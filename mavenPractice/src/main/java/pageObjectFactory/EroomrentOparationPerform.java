package pageObjectFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjectModel.EroomrentLogin;
import pageObjectModel.EroomrentRegPage;

public class EroomrentOparationPerform {

	WebDriver driver;
	EroomrentRegPage obj;
	EroomrentLogin obj1;
	@BeforeTest
	public void setup() {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://eroomrent.in/ownerreg.php");
	}

	@Test (priority =1)
	public void enter_RegDetails() {
	obj= new EroomrentRegPage(driver);
	obj.enterfullName("himansu");
	obj.entermobileNumber("9545253012");
	obj.enterpasswrod("hsha@123");
	obj.enterconfirmPasswrod("hsha@123");
	obj.enteremailid("hsharma125@gmail.com");
	obj.entersubmit();
	obj.alert();
	}
	
	@Test (priority =2)
	public void enter_loginDetails(){
	obj1= new EroomrentLogin(driver);
	obj1.enterurl();
	obj1.enterUsername("sharma125@gmail.com");
	obj1.enterPassword("sha@123");
	obj1.enterBtn();
	}

}
