package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumSetUp {
	
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
//driver.get("https://leaftaps.com/opentaps/control/main");	
	driver.get("https:www.google.com");
}
}