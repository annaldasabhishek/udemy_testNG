package Day_4;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Parallel_testing_parallel 
{

	   WebDriver driver;
	   @BeforeClass
	   @Parameters({"browser"})
	   void setup(String BR) throws Exception
	   {
		   if(BR.equals("chrome"))
		   {
			   WebDriverManager.chromedriver().setup();
			   driver = new ChromeDriver(); 
		   }
		   else if(BR.equals("edge"))
		   {
            WebDriverManager.edgedriver().setup();
			   driver = new EdgeDriver(); 
		   }
		   else
		   {
			   WebDriverManager.firefoxdriver().setup();
			   driver = new FirefoxDriver(); 
		   }
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		   driver.manage().window().maximize();
		   Thread.sleep(5000);
	   }
	   @Test(priority=1)
	   void testlog()
	   {
		   try
		   {
		   boolean status = driver.findElement(By.xpath("//img[@alt='company-branding'] ")).isDisplayed();
		   Assert.assertEquals(status, true);
		   }
		   catch(Exception e)
		   {
			   Assert.fail(); 
		   }
	   }
	   @Test(priority=2)
	   void testhomepagetitle()
	   {
		   Assert.assertEquals(driver.getTitle(),"OrangeHRM", "titles are not matched");
	   }
	   @AfterClass
	   void closeapp()
	   {
		   driver.close();
		   
	   }
}
