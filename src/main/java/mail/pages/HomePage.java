package mail.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class HomePage extends AbstractPage{
	
	@FindBy(xpath = "//*[@id='b-toolbar__left']/div/div/div[2]/div/a")
	private WebElement testEMailWriteLetter;

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public void clickToWriteEmailButton(){
		testEMailWriteLetter.click();		
		
	}
}
