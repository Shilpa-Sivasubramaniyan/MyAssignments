package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();

	driver.get("http://leaftaps.com/opentaps");
	driver.manage().window().maximize();

	WebElement elementUsername = driver.findElement(By.id("username"));
	elementUsername.sendKeys("Demosalesmanager");

	WebElement elementPassword = driver.findElement(By.id("password"));
	elementPassword.sendKeys("crmsfa");

	WebElement elementLogin = driver.findElement(By.className("decorativeSubmit"));
	elementLogin.click();

	WebElement elementCRMSFALink = driver.findElement(By.linkText("CRM/SFA"));
	elementCRMSFALink.click();

	WebElement elementLeadPage = driver.findElement(By.linkText("Leads"));
	elementLeadPage.click();

	WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
	elementCreateLead.click();

	WebElement elementCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
	elementCompanyName.sendKeys("TCS");

	WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
	elementFirstName.sendKeys("Shilpa");

	WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
	elementLastName.sendKeys("Praveen");

	WebElement elementDeptName = driver.findElement(By.name("departmentName"));
	elementDeptName.sendKeys("Software");

	WebElement elementDescription = driver.findElement(By.id("createLeadForm_description"));
	elementDescription.sendKeys("Testing Automation Flow using LeafTaps Website");

	WebElement elementEmail = driver.findElement(By.id("createLeadForm_primaryEmail"));
	elementEmail.sendKeys("abc123@gmail.com");

	WebElement elementState = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	Select dd=new Select(elementState);
	dd.selectByVisibleText("New York");

	WebElement elementCreateLeadButton = driver.findElement(By.name("submitButton"));
	elementCreateLeadButton.click();

	String title = driver.getTitle();
	System.out.println("Title of my page is : " +title);
	
	WebElement elementDuplicateLead = driver.findElement(By.linkText("Duplicate Lead"));
	elementDuplicateLead.click();
	
	WebElement elementCompanyNameClear = driver.findElement(By.id("createLeadForm_companyName"));
	elementCompanyNameClear.clear();
	elementCompanyNameClear.sendKeys("TestLeaf Org");
	
	WebElement elementFirstNameClear = driver.findElement(By.id("createLeadForm_firstName"));
	elementFirstNameClear.clear();
	elementFirstNameClear.sendKeys("Priya");
	
	WebElement elementCreateLead1 = driver.findElement(By.name("submitButton"));
	elementCreateLead1.click();
	
	String title2 = driver.getTitle();
	System.out.println("Current title of my page is : " +title2);
	
}
}
