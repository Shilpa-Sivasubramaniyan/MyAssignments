package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Learnxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();

driver.get("http://leaftaps.com/opentaps");
driver.manage().window().maximize();
WebElement username = driver.findElement(By.xpath("(//input[@class='inputLogin'])[1]"));
username.sendKeys("Demosalesmanager");

WebElement password = driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]"));
password.sendKeys("crmsfa");

WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
login.click();


//a[contains (text(),'CRM/SFA')]

WebElement elementCRMSFALink = driver.findElement(By.xpath("//a[contains (text(),'CRM/SFA')]"));
elementCRMSFALink.click();

WebElement elementLeadPage = driver.findElement(By.xpath("//a[contains (text(),'Leads')]"));
elementLeadPage.click();

WebElement elementCreateLead = driver.findElement(By.xpath("//a[contains (text(),'Create Lead')]"));
elementCreateLead.click();

WebElement elementCompanyName = driver.findElement(By.xpath("(//input[@name='companyName'])[2]"));
		elementCompanyName.sendKeys("TCS");

WebElement elementFirstName = driver.findElement(By.xpath("(//input[@name='firstName'])[3]"));
elementFirstName.sendKeys("Shilpa");

WebElement elementLastName = driver.findElement(By.xpath("(//input[@name='lastName'])[3]"));
elementLastName.sendKeys("Praveen");

WebElement elementCreateLeadButton = driver.findElement(By.xpath("//input[@class='smallSubmit']"));
elementCreateLeadButton.click();



	}

}
