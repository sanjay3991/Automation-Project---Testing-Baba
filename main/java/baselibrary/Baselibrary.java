package baselibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Baselibrary {
	public static WebDriver driver;
	public void getLaunchUrl(String url) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91639\\eclipse-workspace1\\NewAutomation_test_NG\\driver\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"myModal2\"]/div/div/div[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"kt\"]/li[6]/a")).click();
	}
	
//	@AfterClass
//	public void teardown() {
//		
//		driver.quit();
//	}

}
