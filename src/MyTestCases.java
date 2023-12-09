import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTestCases 
{
	WebDriver driver =new FirefoxDriver();
	
	@BeforeTest
	public void setup() {
		driver.get("http://127.0.0.1:5500/index.html");
		driver.manage().window().maximize();
		
	}
	
	@Test()
	public void myFirstTest() throws InterruptedException 
	{
		//driver.findElement(By.tagName("input")).sendKeys("ahmad");
		//driver.findElement(By.tagName("input")).sendKeys("55hadeel");
		
		driver.findElement(By.name("inputForTheName")).sendKeys("hadeel");
		driver.findElement(By.name("inputForThePassword")).sendKeys("had2023");
		driver.findElement(By.id("email")).sendKeys("hadeel@gmail.com");
		
		driver.findElement(By.name("inputForColor ")).sendKeys("Red");
		driver.findElement(By.id("month")).sendKeys("2018-05");
		driver.findElement(By.tagName("inputForTheDateOfBirth")).sendKeys("03/18/1996");
		Thread.sleep(3000);
		driver.findElement(By.id("submiButton")).click();


	}
	
	
	
	@AfterTest
	public void PostTesting() {
		
	}
}
