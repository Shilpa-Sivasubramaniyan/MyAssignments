package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
//driver.get("https://www.leafground.com");
driver.get("https://www.leafground.com/input.xhtml;jsessionid=node0ag14mkbibq6v1vzn5371ybtl491000.node0");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//Type your name
driver.findElement(By.xpath("//div[@class='col-12']/input")).sendKeys("Shilpa S");

//Append Country to this City.
WebElement appendCountry = driver.findElement(By.xpath("//div[@class='col-12']/following::input"));
appendCountry.sendKeys(",INDIA");

//Verify if text box is disabled
WebElement disabledtextVerify = driver.findElement(By.xpath("//div[@class='col-12']/following::input[2]"));
//disabledtextVerify.sendKeys("abc");
//disabledtextVerify.click();
String text = disabledtextVerify.getText();
System.out.println(text);
if(text.contains("Disabled")) {
	System.out.println("Textbox is disabled");
}

//Clearing typed text
driver.findElement(By.xpath("//div[@class='col-12']/following::input[3]")).clear();

//Retrieve typed text


//Type email and Tab. Confirm control moved to next element.
driver.findElement(By.xpath("//div[@class='col-12']/following::input[5]")).sendKeys("abc@gmail.com",Keys.TAB);
	
//Type about yourself
WebElement elementAbtYourself = driver.findElement(By.xpath("//textarea[@placeholder='About yourself']"));
elementAbtYourself.sendKeys("I am learning Selenium from TestLeaf.Automation technology is now everywhere.Future is full of automation");


//Text Editor


	
//Just Press Enter and confirm error message*
driver.findElement(By.xpath("//div[@class='col-12 mb-2 lg:col-4']/following::input[1]")).sendKeys(Keys.ENTER);
String text2 = driver.findElement(By.xpath("//span[contains(text(),'Age is mandatory')]")).getText();
System.out.println(text2);
if(text2.contains("Age is mandatory")) {
	System.out.println("Error message is displayed");
}else {
	System.out.println("Error message not displayed");
}


	
	}

}
