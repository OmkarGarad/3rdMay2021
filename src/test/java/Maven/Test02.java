package Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test02 {
	@Test
	public void verifySubTitle(){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/SELENIUM%20TESTING/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
		
		String subtitle=driver.findElement(By.xpath("/html/body/div/div[2]/p")).getText();
		//find element is in WebDriver Class with return type WebElement
		Assert.assertEquals(subtitle, "Sign in to start your session");
		//driver.close();
	} 


}
