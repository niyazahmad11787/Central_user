package Objects;

import java.util.List;
import java.util.Scanner;

import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v108.page.Page;
import org.openqa.selenium.devtools.v85.applicationcache.ApplicationCache;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.CaseFormat;

public class Create_user 

{
WebDriver driver;
JFrame jFrame=new JFrame();

public Create_user(WebDriver driver) 
{
	this.driver=driver;
	
}

	By createUserbuttonBy=By.xpath("//button[normalize-space()='CREATE USER']");
	By resourceUserBy=By.xpath("//button[normalize-space()='Resource User']");
	By missionUserBy=By.xpath("//button[normalize-space()='Mission User']");
	By userNameBy=By.xpath("//input[@placeholder='Enter User Name']");
	By loginIdBy=By.xpath("//input[@placeholder='Enter User ID']");
	By emailidBy=By.xpath("//input[@placeholder='Enter Mail ID']");
	By mobileNumberBy=By.xpath("//input[@placeholder='Enter mobile number']");
	By designationBy=By.xpath("//input[@placeholder='Enter designation']");
	By passwordBy=By.xpath("//input[@placeholder='Enter Password']");
	By confirmPasswordBy=By.xpath("//input[@placeholder=' Enter Confirm Password']");
	By applicationDropdwonBy=By.xpath("//ng-select[@placeholder='Select Application']//input[@type='text']");
	By applicationCadreBy=By.xpath("//span[normalize-space()='Cadre Management Application']");
	By applicationCUMBy=By.xpath("//span[normalize-space()='Central User Management']"); 
	By categoryDropdownBy=By.xpath("//ng-select[@placeholder='Select Category']//div[@class='ng-select-container']");
	By categoryInputBy=By.xpath("//div[@aria-expanded='true']//input[@type='text']");
	By categoryNationalBy= By.xpath("(//span[@class='ng-option-label'])[1]");
	By categoryStateBy=By.xpath("(//span[normalize-space()='State'])[1]");
	By categorydistrictBy=By.xpath("//span[normalize-space()='District']");
	By categoryBlockBy=By.xpath("//span[@class='ng-option-label'][normalize-space()='Block']");
	By roleDropdowBy = By.xpath("//ng-select[@placeholder='Select Role']//input[@type='text']");
	
//	Cadre Roles //
	By roleNMMBy=By.xpath("(//span[@class='ng-option-label'])[1]");
	By roleSMMBy=By.xpath("//span[normalize-space()='SMM']");
	By roleDMMBy=By.xpath("//span[normalize-space()='DMM']");
	By roleBMMBy=By.xpath("//span[normalize-space()='BMM']");
	
//	CUM Roles //
	By roleNationalAdminBy=By.xpath("//span[normalize-space()='NATIONAL ADMIN']");
	By rolestateAdminBy=By.xpath("//span[normalize-space()='STATE ADMIN']");
	By roledistrictAdminBy=By.xpath("//span[normalize-space()='DISTRICT ADMIN']");
	By roleblockAdminBy=By.xpath("//span[normalize-space()='BLOCK ADMIN']");
//	-------------------------------------------------------------------------------------
	By AlldropdownBy=By.xpath("//div[@class='ng-select-container']//input[@type='text']");
	By upstateBy=By.xpath("//span[normalize-space()='UTTAR PRADESH']");
	By knpDistrictBy=By.xpath("//span[normalize-space()='KANPUR NAGAR']");
	By kalyanBlockBy=By.xpath("//span[normalize-space()='KALYANPUR']");
	By addDataBy=By.xpath("//tbody//tr");
	By addRolebuttonBy=By.xpath("//button[normalize-space()='ADD ROLE']");
	By submitbutBy=By.xpath("(//button[normalize-space()='SUBMIT'])[1]");
	 
	public void createUserButton() 
	{
		try {
			 WebElement create_buttonElement=driver.findElement(createUserbuttonBy);
			 if (create_buttonElement.isDisplayed() && create_buttonElement.isEnabled()) 
			 {
				 create_buttonElement.click();
			}
			 else 
			 {
				 
				 String button_text = driver.findElement(createUserbuttonBy).getText();
				System.out.println(button_text+ " is not enable or clickable!");
			}
			
			
		
		} 
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception in createuserbutton");
		}
		
	}
	
	public void MissionuserCreate() 
	{
		Actions action=new Actions(driver);
		try {
		
		
			driver.findElement(missionUserBy).click();	
			String missionText = driver.findElement(missionUserBy).getText();
			String expectedmissiontext = "Mission User";
			if (missionText.equals(expectedmissiontext))
			{
				Random_text random=new Random_text();
				String randomValue = random.r_functionality();
				driver.findElement(userNameBy).sendKeys(randomValue);
				Thread.sleep(1000);
				randomLoginID random_id=new randomLoginID();
				String randomIdValue = random_id.r_functionality();
				driver.findElement(loginIdBy).sendKeys(randomIdValue);
				Thread.sleep(1000);
				randomEmail randomEmailValue=new randomEmail();
				String randomEmaildata = randomEmailValue.emailString();
				driver.findElement(emailidBy).sendKeys(randomEmaildata);
				Thread.sleep(1000);
				Random_mobile random_mobile=new Random_mobile();	
				String random_mobileNumber = random_mobile.r_number();
				driver.findElement(mobileNumberBy).sendKeys(random_mobileNumber);
				Thread.sleep(1000);
				String randomdesignation = random.r_functionality();
				driver.findElement(designationBy).sendKeys(randomdesignation);
				Thread.sleep(1000);
				RandomPassword r_Password=new RandomPassword();
				String RandomPass = r_Password.r_functionality();
				driver.findElement(passwordBy).sendKeys(RandomPass);
				driver.findElement(confirmPasswordBy).sendKeys(RandomPass);
				
				Thread.sleep(1000);
//				Actions action=new Actions(driver);
				action.sendKeys(Keys.PAGE_DOWN).build().perform();
				
				Thread.sleep(500);
			
				
				driver.findElement(applicationDropdwonBy).click();
//				 Scanner sc = new Scanner(System.in); 
//				 System.out.println("Enter Application Name: ");
//				 String Application_name = sc.nextLine();
//				String Application_name = JOptionPane.showInputDialog("Enter 1 for Cadre or 2 for CUM");
				String[] options = { " Cadre ", " CUM " };
				
			    int Application_name = JOptionPane.showOptionDialog(null, "Which Application?", "Select one Application:", 
			                                                      0, 1, null, options, options[0]);	
				

				 switch (Application_name)
				 {
				case 0:
					driver.findElement(applicationCadreBy).click();
					String expected_applicationrole = "Cadre Management Application";
					String text = driver.findElement(applicationCadreBy).getText();
					if (text.equalsIgnoreCase(expected_applicationrole))
					{
						Thread.sleep(1000);
						/*
						 * String Category_name =
						 * JOptionPane.showInputDialog("National as N,State as S,District as D.... ");
						 */		
						String[] options1 = { " NATIONAL ", " STATE ", "DISTRICT " , " BLOCK " };
						
					    int Category_name = JOptionPane.showOptionDialog(null, "Select Category:-", "Select one:", 
					                                                      0, 3, null, options1, options[0]);	
						
						switch (Category_name) {
						case 0:
							driver.findElement(categoryDropdownBy).click();
//							driver.findElement(categoryInputBy).sendKeys(Category_name);
//							Thread.sleep(1000);
							driver.findElement(categoryNationalBy).click();
							Thread.sleep(1000);
							driver.findElement(roleDropdowBy).click();
							
							driver.findElement(roleDropdowBy).sendKeys("NMM");
							driver.findElement(roleNMMBy).click();
							Thread.sleep(1000);
							driver.findElement(addRolebuttonBy).click();
							Thread.sleep(2000);
							String addedText = driver.findElement(addDataBy).getText();
							System.out.println(addedText);
							driver.findElement(submitbutBy).click();
							JOptionPane.showMessageDialog(jFrame,"Successfully Created.","Alert",JOptionPane.WARNING_MESSAGE); 

							break;
							
							
						case 1:	
							driver.findElement(categoryDropdownBy).click();
							Thread.sleep(500);
//							driver.findElement(categoryInputBy).sendKeys(Category_name);
//							Thread.sleep(1000);
							driver.findElement(categoryStateBy).click();
							driver.findElement(roleDropdowBy).click();
							driver.findElement(roleDropdowBy).sendKeys("SMM");
							Thread.sleep(1000);
							driver.findElement(roleSMMBy).click();
							Thread.sleep(1000);
							driver.findElement(AlldropdownBy).click();
							Thread.sleep(500);
							driver.findElement(upstateBy).click();
							Thread.sleep(1000);
							driver.findElement(addRolebuttonBy).click();
							Thread.sleep(2000);
							String addedText1 = driver.findElement(addDataBy).getText();
							System.out.println(addedText1);
							driver.findElement(submitbutBy).click();
							break;
							
						case 2:
							driver.findElement(categoryDropdownBy).click();
							Thread.sleep(1000);
							driver.findElement(categorydistrictBy).click();
							driver.findElement(roleDropdowBy).click();
							Thread.sleep(1000);
							driver.findElement(roleDMMBy).click();
							Thread.sleep(1000);
							driver.findElement(AlldropdownBy).click();
							Thread.sleep(500);
							driver.findElement(upstateBy).click();
							Thread.sleep(1000);
							driver.findElement(AlldropdownBy).click();
							driver.findElement(knpDistrictBy).click();
							action.sendKeys(Keys.PAGE_DOWN).build().perform();
							driver.findElement(addRolebuttonBy).click();
							Thread.sleep(2000);
							String addedText2 = driver.findElement(addDataBy).getText();
							System.out.println(addedText2);
							driver.findElement(submitbutBy).click();
							break;
							
						case 3:
							driver.findElement(categoryDropdownBy).click();
							Thread.sleep(1000);
							driver.findElement(categoryBlockBy).click();
							driver.findElement(roleDropdowBy).click();
							Thread.sleep(1000);
							driver.findElement(roleBMMBy).click();
							Thread.sleep(1000);
							driver.findElement(AlldropdownBy).click();
							Thread.sleep(500);
							driver.findElement(upstateBy).click();
							Thread.sleep(1000);
							driver.findElement(AlldropdownBy).click();
							driver.findElement(knpDistrictBy).click();
							Thread.sleep(500);
							Thread.sleep(500);
							driver.findElement(AlldropdownBy).click();
							driver.findElement(kalyanBlockBy).click();
							action.sendKeys(Keys.PAGE_DOWN).build().perform();
							driver.findElement(addRolebuttonBy).click();
							Thread.sleep(2000);
							String addedText3 = driver.findElement(addDataBy).getText();
							System.out.println(addedText3);
							driver.findElement(submitbutBy).click();
							break;
						}

					}
					break;
				 case 1:
					driver.findElement(applicationCUMBy).click();
					String expected_applicationrole1 = "Central User Management";
					String text1 = driver.findElement(applicationCUMBy).getText();
					if(text1.equalsIgnoreCase(expected_applicationrole1))
					{
						Thread.sleep(1000);
//						String Category_name1 = JOptionPane.showInputDialog("National as N,State as S,District as D.... ");
						
						String[] options2 = { "NATIONAL ADMIN", "STATE ADMIN", "DISTRICT ADMIN" , "BLOCK ADMIN" };
						
					    int Category_name1 = JOptionPane.showOptionDialog(null, "Select Role", "Select one:", 
					                                                      0, 3, null, options2, options[0]);	
						switch (Category_name1) {
						case 0:
							
							driver.findElement(roleDropdowBy).click();
//							driver.findElement(roleDropdowBy).sendKeys(Category_name1);
							Thread.sleep(1000);
							driver.findElement(roleNationalAdminBy).click();
							Thread.sleep(1000);
							driver.findElement(addRolebuttonBy).click();
							Thread.sleep(2000);
							String addedText = driver.findElement(addDataBy).getText();
							System.out.println(addedText);
							driver.findElement(submitbutBy).click();
							break;
							
						case 1:
							
							driver.findElement(roleDropdowBy).click();
							driver.findElement(rolestateAdminBy).click();
							Thread.sleep(1000);
							driver.findElement(AlldropdownBy).click();
							Thread.sleep(500);
							driver.findElement(upstateBy).click();
							Thread.sleep(1000);
							driver.findElement(addRolebuttonBy).click();
							Thread.sleep(2000);
							String addedText1 = driver.findElement(addDataBy).getText();
							System.out.println(addedText1);
							driver.findElement(submitbutBy).click();
							break;
							
						case 2:
							
							driver.findElement(roleDropdowBy).click();
							Thread.sleep(1000);
							driver.findElement(roledistrictAdminBy).click();
							Thread.sleep(1000);
							driver.findElement(AlldropdownBy).click();
							Thread.sleep(500);
							driver.findElement(upstateBy).click();
							Thread.sleep(1000);
							driver.findElement(AlldropdownBy).click();
							driver.findElement(knpDistrictBy).click();
							action.sendKeys(Keys.PAGE_DOWN).build().perform();
							driver.findElement(addRolebuttonBy).click();
							Thread.sleep(2000);
							String addedText2 = driver.findElement(addDataBy).getText();
							System.out.println(addedText2);
							driver.findElement(submitbutBy).click();
							break;
							
						case 3:
							
							driver.findElement(roleDropdowBy).click();
							Thread.sleep(1000);
							driver.findElement(roleblockAdminBy).click();
							Thread.sleep(1000);
							driver.findElement(AlldropdownBy).click();
							Thread.sleep(500);
							driver.findElement(upstateBy).click();
							Thread.sleep(1000);
							driver.findElement(AlldropdownBy).click();
							driver.findElement(knpDistrictBy).click();
							Thread.sleep(500);
							Thread.sleep(500);
							driver.findElement(AlldropdownBy).click();
							driver.findElement(kalyanBlockBy).click();
							action.sendKeys(Keys.PAGE_DOWN).build().perform();
							driver.findElement(addRolebuttonBy).click();
							Thread.sleep(2000);
							String addedText3 = driver.findElement(addDataBy).getText();
							System.out.println(addedText3);
							driver.findElement(submitbutBy).click();
							break;
							
							
						default:
							break;
						}
					}
					
					
					
					
					break;	
				default:
					System.out.println("Wrong input!");;
				}
				 

				
			}
			
			
			
				
			else{
				
				System.out.println(missionText+" this is not mission user section!");
			}
			
		}
		
		
		
		
		
		
		
		
		
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println("Exception in MissionuserCreate"+e);
		}
		
	}}

