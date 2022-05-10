package TCS.com;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {
	WebDriver driver;
	@Before
	
	public void setup() {
		//System.setProperty("wedriver.chrome.driver","C:\\Users\\user\\Desktop\\workspace\\webdriver\\driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\workspace\\webdriver\\driver\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
	}
	@After
	public void teardown()
	{
		driver.quit();
		
		
	}
	@Test
	public void test()
	{
		
		driver.get("https://demo.guru99.com/test/delete_customer.php\r\n");
		driver.manage().window().maximize();
		driver.findElement(By.name("cusid")).sendKeys("12345");
		driver.findElement(By.name("submit")).click();
		//driver.switchTo().alert().accept();
		String text=driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().dismiss();
		
	}
	
	

}
