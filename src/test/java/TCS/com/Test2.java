package TCS.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
	
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\workspace\\webdriver\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().minimize();
	/*	
	WebElement name=driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
	name.sendKeys("Jehovah");
	WebElement button=driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"));
	button.click();
	*/
	
		/* realtive path
	WebElement name=driver.findElement(By.xpath("//form/div[1]/div[1]/div[1]/div/div[2]/input"));
	name.sendKeys("Jehovah");
	WebElement button=driver.findElement(By.xpath("//form/div[1]/div[1]/div[3]/center/input[1]"));
	button.click();
		
	*/ 
		
	/*	single
	WebElement name=driver.findElement(By.xpath("//input[@title='search]"));
	name.sendKeys("Jehovah");
	WebElement button=driver.findElement(By.xpath("//input[@name='btnk']"));
	*/
	
	/*	
	WebElement name=driver.findElement(By.xpath("//input[@title='search][@name='q"));
	name.sendKeys("Jehovah");
	WebElement button=driver.findElement(By.xpath("//input[@name='btnk'][@value='Google Search']"));
	*/
	
	WebElement name=driver.findElement(By.xpath("//input[@title='search' AND @name='q']"));
	name.sendKeys("Jehovah");
	WebElement button=driver.findElement(By.xpath("//input[@value='Google Search'and @name='btnk']"));
	
	
	
	}

}
