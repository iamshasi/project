package TCS.com;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {
	WebDriver driver;
	@Before
	
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\workspace\\webdriver\\driver\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
	}
	@After
	public void teardown()
	{
		driver.quit();
		
		
	}
	@Test
	public void test() throws InterruptedException
	{
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.excutescript("windows.scrollTo(0,document.body.scrollHeight)")
		driver.findElement(By.linkText("Careers")).click();
		Thread.sleep(1000);
		
		
		
		
		
		
	}
	

}
