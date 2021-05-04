package Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test04 {
	@Test (priority=1) 
	public void verifyTitle(){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); //WebDriver=interface
		WebDriver driver =  new ChromeDriver();// ChromeDriver=class,RemoteWebDriver=SuperClass
		driver.get("file:///F:/SELENIUM%20TESTING/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
		String title = driver.getTitle();
		Assert.assertEquals(title,"JavaByKiran | Log in");	
		driver.close();
	} 
}
