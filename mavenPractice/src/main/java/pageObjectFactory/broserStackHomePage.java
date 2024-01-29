package pageObjectFactory;



import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class broserStackHomePage {

	WebDriver driver;
	@FindBy(xpath= "//h1")
	WebElement Header;
	@FindBy(xpath="//*[@id='signupModalButton']")
	WebElement getStarted;
	
	public broserStackHomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void vHeader() {
		String getheadertext = Header.getText();
		assertEquals("App & Browser Testing Made Easy",getheadertext);
	}
	public void clickgetStarted() {
		getStarted.click();
	}	
}
