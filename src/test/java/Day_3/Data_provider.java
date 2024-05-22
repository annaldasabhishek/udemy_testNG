package Day_3;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
public class Data_provider
{
	
	WebDriver driver;
	
  @Test(dataProvider="DP")
  void testlogin(String email,String password) 
  {

          driver.findElement(By.xpath("//input[@name='username']")).sendKeys("rockychintu594@gmail.com");
          driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Abhishek@5678");
          driver.findElement(By.xpath("//button[@type='submit']")).click();
          /* String  exp_title =" Save your login info?";
          String  act_title =driver.getTitle();
          
          Assert.assertEquals(exp_title, act_title);  */
  }
   
  
  @DataProvider(name="DP")
  String[][]logindata()
  {
	  String data[][]= {
			            {"rockychintu594@gmail.com","Abhishek@5678"},
			           };
			        
	return data;
	  
  }
 
  @BeforeClass
  void setup()
  {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.instagram.com/");
	  driver.manage().window().maximize();
	 
	  
  }

  @AfterClass
  void teardown() 
  {
	  
  }

}
