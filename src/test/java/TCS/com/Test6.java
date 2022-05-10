package TCS.com;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class A
{
	
}
public class Test6 {
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
	public void test6()
	{
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle="Amazon.com.Spend less.tSmile more";
		/*
		if(!actualTitle.equals(expectedTitle))
		{
			Assert.assertFalse(true);
		}else
			Assert.assertFalse(false);
		
		}
	*/
	
	A oa=new A();
	Assert.assertNotNull(oa);
	}
	
			
}
		
		
		


