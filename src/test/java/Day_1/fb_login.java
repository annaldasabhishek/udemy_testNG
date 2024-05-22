package Day_1;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class fb_login 
{ 
	             WebDriver driver;
	    @Test(priority=0)         
        void openapp()
        {
        	WebDriverManager.chromedriver().setup();
        	driver = new ChromeDriver();
        	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        	driver.get("https://www.facebook.com/");
        	driver.manage().window().maximize();
        }
	    @Test(priority=2)    
        void login()
        {

            driver.findElement(By.xpath("//input[@id='email']")).sendKeys(" rockychintu594@gmail.com");
            driver.findElement(By.xpath("//div[@id='passContainer']")).sendKeys("9395591193");
            driver.findElement(By.xpath("//button[@id='u_0_5_CR']")).click();
        }
	    @Test(priority=3)    
        void close()
        {
        	driver.quit();
        }
}
