package TCS.com;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test3 {
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
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		WebElement dropdownElement=driver.findElement(By.id("searchDropdownBox"));
		Select dropdown=new Select(dropdownElement);
		//dropdown.selectByIndex(5);
		dropdown.selectByValue("search-alias=electronics-intl-ship");
		
		
		
		
}
}
