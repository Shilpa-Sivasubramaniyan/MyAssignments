package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	String text = driver.findElement(By.xpath("//div[text()='Sign Up']")).getText();
	if(text.contains("Sign Up")) {
		System.out.println("Sign Up Page Opened Successfully");
	}else {
		System.out.println("Sign Up Page not opened");
	}
	driver.findElement(By.name("firstname")).sendKeys("Shilpa");
	driver.findElement(By.name("lastname")).sendKeys("Praveen");
	driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("1234567890");
	driver.findElement(By.id("password_step_input")).sendKeys("Tiago@123");
	WebElement dayDD = driver.findElement(By.id("day"));
	Select dd=new Select(dayDD);
	dd.selectByIndex(17);
	WebElement monthDD = driver.findElement(By.id("month"));
	Select dd1=new Select (monthDD);
	dd1.selectByVisibleText("Aug");
	
	WebElement yearDD = driver.findElement(By.id("year"));
	Select dd2=new Select(yearDD);
	dd2.selectByValue("1996");
	
	driver.findElement(By.xpath("//label[text()='Female']")).click();

	
}
}
