package genericutility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import objectrepository.LoginPage;
import objectrepository.WelcomePage;

public class BaseClass {
	public WebDriverUtility wutil=new WebDriverUtility();
	public FileUtility futil=new FileUtility();
	
	public static WebDriver driver;
	
	
	@BeforeClass
	public void openBrowser()
	driver=new ChromeDriver();
	wutil.maximize(driver);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get(futil.getDataFrmProperty("url"));
}
   
   @BeforeMethod
   public void login() throws IOException{
     WelcomePage wp=new WelcomePage(driver);
     wp.getLoginLink().click();
     
     LoginPage lp=new LoginPage();
     lp.getEmailTextField().sendkeys(futil.getDataFrmProperty("email"));
     lp.getPasswordTextField().sendkeys(futil.getDataFrmProperty("password"));
     lp.getLoginButton().click();
     
     }
     
   @AfterClass
   public void closeBrowser() {
	   driver.quit();
   }
	  

}
