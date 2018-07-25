package mail.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SentMailsPage extends HomePage {
	
	public static final String BASE_URL = "https://e.mail.ru/messages/sent";
	
	@FindBy(xpath = "//*[@id=\"b-nav_folders\"]/div/div[2]/a")
	private WebElement sent;

	public SentMailsPage(WebDriver driver) {
		super(driver);
	}

	@Override
	public void openPage() {
		driver.navigate().to(BASE_URL);
		
	}
	/*
	public void openSentMail(){
		sent.click();
		
	}*/

}
