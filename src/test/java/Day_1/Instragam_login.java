package Day_1;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Instragam_login 
{
	         WebDriver driver;
	 @BeforeTest
	void openapp()
    {
    	WebDriverManager.chromedriver().setup();
    	driver = new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	driver.get("https://www.instagram.com/accounts/login/?hl=en");
    	driver.manage().window().maximize();
    }
	@Test
	void login()
	{

         driver.findElement(By.xpath("//input[@name='username']")).sendKeys("rockychintu594@gmail.com");
         driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Abhishek@5678");
         driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@AfterTest
	void close()
	{
		driver.close();
		
	}
}
