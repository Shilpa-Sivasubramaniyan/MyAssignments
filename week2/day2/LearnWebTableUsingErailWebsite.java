package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTableUsingErailWebsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver =new ChromeDriver();
driver.get("https://erail.in/");
driver.manage().window().maximize();

driver.findElement(By.id("txtStationFrom")).clear();
driver.findElement(By.id("txtStationFrom")).sendKeys("MS",Keys.TAB);

driver.findElement(By.id("txtStationTo")).clear();
driver.findElement(By.id("txtStationTo")).sendKeys("PDY",Keys.TAB);

driver.findElement(By.id("chkSelectDateOnly")).click();
  List<WebElement> elementRows = driver.findElements(By.xpath("(//table)[3]/tbody/tr"));
List<WebElement> elementColumn = driver.findElements(By.xpath("(//table)[3]/tbody/tr[1]/td"));

for(int i=1;i<=elementRows.size();i++) {
	for(int j=1;j<=9;j++) {
		String text = driver.findElement(By.xpath("(//table)[3]/tbody/tr["+i+"]/td["+j+"]")).getText();
		System.out.print(text+" ");
	}
	System.out.println();
}


	}
}


