package Test_scenerios;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.Create_user;
import Objects.login_page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Main_pageTest {

	
	WebDriver driver;
	@BeforeTest
	public void beforetest() 
	{
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://stg-um.dhwaniris.com/login");
		driver.manage().window().maximize();
	}
	
	@Test(priority = 0)
	public void loginPage()
	{
		login_page log_moduleLogin_page=new login_page(driver);
		log_moduleLogin_page.login_page_function();
	}
	@Test(priority = 1)
	public void create_user()
	{
		Create_user user_module=new Create_user(driver);
		user_module.createUserButton();
	}
	@Test(priority = 2)
	public void mission_UserCreate() {
		Create_user user_module=new Create_user(driver);
		user_module.MissionuserCreate();
	}
	
	@AfterTest
	public void aftertest()
	{
		try {
			Thread.sleep(5000);
			driver.quit();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error!!!!");
		}
	}
	
}
