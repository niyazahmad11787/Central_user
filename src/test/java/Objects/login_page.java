package Objects;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.asm.Advice.Exit;

public class login_page {

	WebDriver driver;
	JFrame jFrame=new JFrame();
	public login_page(WebDriver driver)

	{
		this.driver = driver;
	}

	By user_roleListBy = By.xpath("//select[@name='role']");
	By nationaladminBy = By.xpath("//option[@value='227']");
	By stateadminBy = By.xpath("//option[@value='326']");
	By districtadminBy = By.xpath("//option[@value='327']");
	By blockadminBy = By.xpath("//option[@value='328']");
	By user_idBy = By.xpath("//input[@id='loginId']");
	By passwordBy = By.xpath("//input[@id='password']");
	By captchaInputBy = By.xpath("//input[@id='BDC_VCID_yourFirstCaptchaStyle']");
	By login_buttonBy = By.xpath("//button[normalize-space()='Login']");
	By login_textBy = By.xpath("//p[normalize-space()='NATIONALADMIN']");

	public void login_page_function()

	{
		try {
//			WebElement role_listElement=driver.findElement(user_roleListBy);
//			driver.findElement(user_roleListBy).click();
//			Select select = new Select(role_listElement);
//		     select.selectByValue("227");
//			String NationalText = "NATIONAL ADMIN";
//			String stateText = "STATE ADMIN";
//			String districtText = "DISTRICT ADMIN";
//			String blockText = "BLOCK ADMIN";
//			String roleInput = JOptionPane.showInputDialog("Enter N, S , D, B ");
			
			
			String[] options = { "NATIONAL ADMIN", "STATE ADMIN", "DISTRICT ADMIN" , "BLOCK ADMIN" };
		
		    int roleInput = JOptionPane.showOptionDialog(null, "Select ROle to Login...", "Select one:", 
		                                                      0, 3, null, options, options[0]);			
		
			
			
			switch (roleInput) {
			case 0:
				driver.findElement(user_roleListBy).click();
				driver.findElement(nationaladminBy).click();
				driver.findElement(user_idBy).sendKeys("NationalAdmin");
				driver.findElement(passwordBy).sendKeys("National@123");
				String Captcha_data = JOptionPane.showInputDialog("Enter Captcha Value");
				driver.findElement(captchaInputBy).sendKeys(Captcha_data);
				driver.findElement(login_buttonBy).click();
				Thread.sleep(2000);
				String expectedURL = driver.getCurrentUrl();
				String actualURL = "https://stg-um.dhwaniris.com/admin/userManagement/9";
				Thread.sleep(1000);
				if (expectedURL.equalsIgnoreCase(actualURL)) {
					System.out.println(expectedURL + " LOgin Successfully");
				} else {
					System.out.println("Login Failed!");
				}
//				Create_user cUser=new Create_user(driver);
//				cUser.MissionuserCreate();
				
				break;
				
			case 1:
				driver.findElement(user_roleListBy).click();
				driver.findElement(stateadminBy).click();
				driver.findElement(user_idBy).sendKeys("StateAdmin");
				driver.findElement(passwordBy).sendKeys("State@123");
				String Captcha_data1 = JOptionPane.showInputDialog("Enter Captcha Value");
				driver.findElement(captchaInputBy).sendKeys(Captcha_data1);
				driver.findElement(login_buttonBy).click();
				Thread.sleep(2000);
				String expectedURL1 = driver.getCurrentUrl();
				String actualURL1 = "https://stg-um.dhwaniris.com/admin/userManagement/9";
				Thread.sleep(1000);
				if (expectedURL1.equalsIgnoreCase(actualURL1)) {

					System.out.println(expectedURL1 + " LOgin Successfully");
				} else {
					System.out.println("Login Failed!");
				}
			case 2:
				driver.findElement(user_roleListBy).click();
				driver.findElement(districtadminBy).click();
				driver.findElement(user_idBy).sendKeys("DISCTUSERNIYAZ");
				driver.findElement(passwordBy).sendKeys("Niyazl@123");
				String Captcha_data2 = JOptionPane.showInputDialog("Enter Captcha Value");
				driver.findElement(captchaInputBy).sendKeys(Captcha_data2);
				driver.findElement(login_buttonBy).click();
				Thread.sleep(2000);
				String expectedURL2 = driver.getCurrentUrl();
				String actualURL2 = "https://stg-um.dhwaniris.com/admin/userManagement/9";
				Thread.sleep(1000);
				if (expectedURL2.equalsIgnoreCase(actualURL2)) {

					System.out.println(expectedURL2 + " LOgin Successfully");
				} else {
					System.out.println("Login Failed!");
				}
				
				case 3:
					driver.findElement(user_roleListBy).click();
					driver.findElement(blockadminBy).click();
					driver.findElement(user_idBy).sendKeys("BlockAdmin");
					driver.findElement(passwordBy).sendKeys("Block@123");
					String Captcha_data3 = JOptionPane.showInputDialog("Enter Captcha Value");
					driver.findElement(captchaInputBy).sendKeys(Captcha_data3);
					driver.findElement(login_buttonBy).click();
					Thread.sleep(2000);
					String expectedURL3 = driver.getCurrentUrl();
					String actualURL3 = "https://stg-um.dhwaniris.com/admin/userManagement/9";
					Thread.sleep(1000);
					if (expectedURL3.equalsIgnoreCase(actualURL3)) {

						System.out.println(expectedURL3 + " LOgin Successfully");
					} else {
						System.out.println("Login Failed!");
					}
			default:
				driver.close();
			}

//			driver.findElement(user_idBy).sendKeys("NationalAdmin");
//			driver.findElement(passwordBy).sendKeys("National@123");
//			String Captcha_data = JOptionPane.showInputDialog("Enter Captcha Value");
//			driver.findElement(captchaInputBy).sendKeys(Captcha_data);

//			driver.findElement(login_buttonBy).click();
//			String alert_text = driver.switchTo().alert().getText();
//			System.out.println(alert_text);
//			Thread.sleep(2000);
//			String expectedURL = driver.getCurrentUrl();
//			String actualURL = "https://stg-um.dhwaniris.com/admin/userManagement/9";
//			Thread.sleep(1000);
//			if (expectedURL.equalsIgnoreCase(actualURL)) 
//			{
//				
//				System.out.println(expectedURL+" LOgin Successfully");
//			}
//			else {
//				System.out.println("Login Failed!");
//			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception in Login function" + e);
		}

	}

}
