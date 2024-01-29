package mavenPracExample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getTittleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String s= driver.getTitle();
		if(s!=" ") {
			System.out.println("tittle is  "+s);
			if(s.length()<=170) {
				System.out.println("tittle is valid");
			}else {
				System.out.println("tittle is not valid");
			}
		}else {
			System.out.println("tittle is not set"+s);
		}
	*/
//===================================================================================	
	
		// for current url of element
		
		/*
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.partialLinkText("Amazon")).click();
		String s= driver.getCurrentUrl();
		System.out.println("url is "+s);
	*/
	
//==================================================================================
		// resister -- amazon
		/*
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26adgrpid%3D58075519359%26ext_vrnc%3Dhi%26hvadid%3D610780881833%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9303999%26hvnetw%3Dg%26hvpone%3D%26hvpos%3D%26hvptwo%3D%26hvqmt%3De%26hvrand%3D8051509049602694082%26hvtargid%3Dkwd-64107830%26hydadcr%3D14452_2316413%26ref%3Dpd_sl_5szpgfto9i_e%26tag%3Dgooghydrabk1-21%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		driver.findElement(By.name("customerName")).sendKeys("aman");
		Select d = new Select(driver.findElement(By.name("countryCode")));
		d.selectByVisibleText("AF +93");
		driver.findElement(By.id("ap_phone_number")).sendKeys("9565253641");
		driver.findElement(By.id("ap_email")).sendKeys("thadha@gmail.com");
		driver.findElement(By.id("ap_password")).sendKeys("abc@123");
		driver.findElement(By.id("continue")).click();
	*/
		
//===========================================================================
		
		// logopath and image
		
		/*
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		WebElement ele =driver.findElement(By.id("nav-logo-sprites"));
		String s = ele.getAttribute("href");
		int position = s.lastIndexOf("/");
		String s1= s.substring(position+1);
		System.out.println(s1);
		System.out.println(s);
		driver.get(s);
		*/
//============================================================================
		
		// count image and print image
		/*
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.eroomrent.in");
		List<WebElement> ele =driver.findElements(By.className("img-fluid"));
		System.out.println(" total image -->  "+ele.size());
		for(WebElement e:ele) {
			String s= e.getAttribute("src");
			System.out.println(s);
		}
		*/
		
//=========================================================================
		
		// page source code and gettext
		/*
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		System.out.println(driver.getPageSource());
		WebElement ele =driver.findElement(By.tagName("h2"));
	    String s = ele.getText();
	    System.out.println("text is  "+s);
	    */
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		System.out.println(driver.getPageSource());
		
	}

}
