package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnLocatorsSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("http://leaftaps.com/opentaps");
driver.manage().window().maximize();

WebElement username = driver.findElement(By.className("inputLogin"));
username.sendKeys("Demosalesmanager");

WebElement password = driver.findElement(By.id("password"));
password.sendKeys("crmsfa");

WebElement login = driver.findElement(By.className("decorativeSubmit"));
login.click();

WebElement WelcomeMessage = driver.findElement(By.tagName("h2"));
String text = WelcomeMessage.getText();
System.out.println(text);

if(text.contains("Welcome")) {
	System.out.println("Login is successful");
}else {
	System.out.println("Login Failed");
}

WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
crmsfa.click();

WebElement leadPage = driver.findElement(By.linkText("Leads"));
leadPage.click();


WebElement createleadPage = driver.findElement(By.linkText("Create Lead"));
createleadPage.click();

WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
companyName.sendKeys("TestLeaf");
WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
firstName.sendKeys("Shilpa");

WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
lastName.sendKeys("Raj");

WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
sourceDD.sendKeys("Employee");
WebElement industryDD = driver.findElement(By.id("createLeadForm_industryEnumId"));
Select dd=new Select(industryDD);
dd.selectByIndex(3);
WebElement ownershipDD = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
Select dd1=new Select(ownershipDD);
dd1.selectByVisibleText("Sole Proprietorship");
WebElement marketingCampaignDD = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
Select dd2=new Select(marketingCampaignDD);
dd2.selectByValue("CATRQ_AUTOMOBILE");
WebElement createLeadButton = driver.findElement(By.className("smallSubmit"));
createLeadButton.click();




	}

}
