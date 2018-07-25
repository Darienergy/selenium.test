package selenium.email;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainMail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.ru");

		WebElement testEMailLogin = driver.findElement(By.name("login"));
		testEMailLogin.sendKeys("TATHTP");

		WebElement testEMailPassword = driver.findElement(By.name("password"));
		testEMailPassword.sendKeys("Klopik123");

		WebElement testEMailCheckBox = driver.findElement(By.id("mailbox:saveauth"));
		testEMailCheckBox.click();

		WebElement testEMailEnter = driver.findElement(By.id("mailbox:submit"));
		testEMailEnter.click();

		Thread.sleep(10000);

		WebElement testEMailWriteLetter = driver.findElement(By.xpath("//*[@id='b-toolbar__left']/div/div/div[2]/div/a"));
		testEMailWriteLetter.click();

		Thread.sleep(1000);
		WebElement testEMailWriteLetterTo = driver.findElement(By.id("b-compose"));
		testEMailWriteLetterTo.click();

		WebElement testEMailWriteLetterTo1 = driver.findElement(By.xpath(".//textarea[@data-original-name='To']"));
		testEMailWriteLetterTo1.sendKeys("dokape@mail.ru");

		WebElement testEMailWriteLetterTo2 = driver.findElement(By.name("Subject"));
		testEMailWriteLetterTo2.sendKeys("Test eMail Darya Kostuk ");

		WebElement iframe = driver.findElement(By.xpath("//iframe[@tabindex='10']"));
		driver.switchTo().frame(iframe);
		WebElement body = driver.findElement(By.id("tinymce"));
		body.sendKeys("Test text");
		driver.switchTo().defaultContent();
		Thread.sleep(300);

		
		WebElement send = driver.findElement(By.xpath("//*[@id='b-toolbar__right']/div[3]/div/div[2]/div[1]/div/span"));
		send.click();
		
		Thread.sleep(9000);
		WebElement sent = driver.findElement(By.xpath("//*[@id=\"b-nav_folders\"]/div/div[2]/a"));
		sent.click();
		
		/*
		Thread.sleep(10000);
		WebElement sentLetter = driver.findElement(By.xpath("//*[@id='b-letters']/div/div[5]/div/div[2]/div[1]/div/a"));
		if(sentLetter.equals(sentLetter.findElement(By.xpath("//*[@id=\"b-letters\"]/div/div[5]/div/div[2]/div[1]/div/a")))){
			System.out.println("The letter sent");
			sentLetter.click();
		}else {
			System.out.println("The letter didn't sent");
		}
		
		*/
		
		
		/*
		List<WebElement> mails = driver.findElements(By.className("b-datalist__item js-datalist-item"));
		System.out.println(mails.size());
		
		for (WebElement mail : mails){
			WebElement elmTo = mail.findElement(By.className("b-datalist__item__addr"));
			String to = elmTo.getText();
			System.out.println(to);
		}
		
		*/
		
		
		List<WebElement> mails = driver.findElements(By.xpath("//*[@class='b-datalist__item__body']"));
		System.out.println(mails.size());
		Date date = new Date();
		System.out.println(date.toString());
		SimpleDateFormat formatForDateNow = new SimpleDateFormat("hh:mm");
		System.out.println("Текущее время " + formatForDateNow.format(date));
		
		
		for (WebElement mail : mails){
			
			WebElement a = mail.findElement(By.xpath("//*[@id='b-letters']/div/div[5]/div/div[2]/div[1]/div/a/div[4]/div[3]/div[1]/div"));
					//tagName("a"));
			//System.out.println("tag name " + a.getTagName());
			System.out.println("get text " + a.getText());
			
			//*[@id="b-letters"]/div/div[5]/div/div[2]/div[1]/div/a/div[4]/div[3]/div[1]/div
			
//			String to = a.getAttribute("data-title");
//			String subject = a.getAttribute("data-subject");
//			System.out.println("--------");
//			if(to!=null && subject!=null){		
//			 if("dokape@mail.ru".equalsIgnoreCase(to.trim())&&"Test eMail Darya Kostuk Test text".equalsIgnoreCase(subject.trim())){
//				 System.out.println("The letter sent");
//				// break;
//			 }
//			}
			 
		}
	//	Thread.sleep(3000);
		///driver.close();
		
		
		
		
		// WebElement compose =
		// driver.findElement(By.xpath("//*[text()='Compose']"));
		// compose.click();

		/*
		 * WebElement iframe =
		 * driver.findElement(By.xpath("//iframe[@tabindex='10']")); new
		 * WebDriverWait(driver,
		 * 10).until(ExpectedConditions.visibilityOf(iframe));
		 * driver.switchTo().frame(iframe); WebElement body =
		 * driver.findElement(By.id("tinymce")); body.click(); body.clear();
		 * body.sendKeys("Hi!"); Thread.sleep(3000);
		 */

		/*
		 * driver.switchTo().frame(0); WebElement textFild =
		 * driver.findElement(By.id("tinymce")); textFild.sendKeys("Test text");
		 * //driver.switchTo().defaultContent();
		 */

		/*
		 * WebDriver driverFrame = new ChromeDriver();
		 * driverFrame.manage().window().maximize();
		 * driverFrame.get("https://e.mail.ru/compose/?1519311637831");
		 * driverFrame.switchTo().frame(0);
		 */
		/*
		 * WebElement testEMailWriteLetterTo4 = driver.findElement(By.xpath(
		 * "//*[@id='b-toolbar__right']/div[3]/div/div[2]/div[1]/div"));
		 * testEMailWriteLetterTo4.click();
		 */
		// (new WebDriverWait(driver,
		// 10)).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("toolkit-151922624549041composeEditor_ifr_name"));

		/*
		 * WebElement testEMailWriteLetterText =
		 * driver.findElement(By.xpath("//*[@id='tinymce']"));
		 * testEMailWriteLetterText.sendKeys("Test eMail Darya Kostuk ");
		 * driver.switchTo().defaultContent();
		 */

		// WebElement testEMailWriteLetterTo1 =
		// driver.findElement(By.xpath("//*[@id=\"b-compose\"]/div/div"));
		// testEMailWriteLetterTo1.findElement(By.id("toolkit-151898622908041composeForm"));

		/*
		 * WebElement testEMailWriteLetter =
		 * driver.findElement(By.className("threads-enabled"));
		 * testEMailWriteLetter.findElement(By.xpath(
		 * "//*[@id=\"b-toolbar__left\"]/div/div/div[2]/div/a/span"));
		 * testEMailWriteLetter.click();
		 */

		/*
		 * WebElement testEMailWriteLetter =
		 * driver.findElement(By.className("b-toolbar__group b-toolbar__group_left"
		 * )); testEMailWriteLetter.click();
		 * 
		 * WebElement testEMailWriteLetter2 = driver.findElement(By.xpath(
		 * "//*[@id=\"b-toolbar__left\"]/div/div/div[2]/div/a"));
		 * testEMailWriteLetter2.click();
		 */

	}
}
