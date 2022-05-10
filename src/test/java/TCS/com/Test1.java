package TCS.com;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Test1 {
	WebDriver driver;
	@Before
	
	public void setup() {
		//System.setProperty("wedriver.chrome.driver","C:\\Users\\user\\Desktop\\workspace\\webdriver\\driver\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver","C:\\Users\\user\\Desktop\\workspace\\webdriver\\driver\\msedgedriver.exe");
		
		driver=new EdgeDriver();
		
	}
	@After
	public void teardown()
	{
		driver.quit();
		
		
	}
	@Test
	public void test1()
	{
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
	driver.findElement(By.id("search_query_top")).sendKeys("T-shirt");
		
		
	}
	
	
	
	
	

}
