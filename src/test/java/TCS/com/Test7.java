package TCS.com;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {
	WebDriver driver;
	
	@Before
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\workspace\\webdriver\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@After
	public void teardown() {
		driver.quit();
		
	}
	
	@Test
	public void test7() {
		driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
		
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle="Amazon.com.Spend less.Smile more";
		System.out.println("test6() is passed");
	}

}
