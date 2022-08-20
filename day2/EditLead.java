package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/main");
driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Find Leads")).click();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
//driver.findElement(By.linkText("Sowmya")).click();
String title = driver.getTitle();
System.out.println("Title of Page is :  " +title);
driver.findElement(By.linkText("Edit")).click();
WebElement companyName = driver.findElement(By.id("updateLeadForm_companyName"));
companyName.clear();
companyName.sendKeys("Infy");
driver.findElement(By.className("smallSubmit")).click();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

String textVerify = driver.findElement(By.id("viewLead_companyName_sp")).getText();
if(textVerify.contains("Infy")) {
	System.out.println("Company Name Updated Successfully");
}else {
System.out.println("Company Name not Updated");
	}
driver.close();
	}}
