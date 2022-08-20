package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
		driver.findElement(By.linkText("Phone")).click();
//		driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("+91");
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("4142334456");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		//String leadID = driver.findElement(By.linkText("14052")).getText();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.linkText("14462")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[29]")).sendKeys("14462",Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String textNoRecords = driver.findElement(By.xpath("//div[contains(text(),'No records')]")).getText();
		System.out.println(textNoRecords);
		if(textNoRecords.contains("No records to display")) {
			System.out.println("Deletion of Lead is successful");
		}else {
			System.out.println("Delete Lead not successful");
		}
//		driver.close();
		
		
	}

}
