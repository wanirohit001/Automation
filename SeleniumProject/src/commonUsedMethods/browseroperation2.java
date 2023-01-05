package commonUsedMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
public class browseroperation2 {
public static void main(String[] args) 
{ 
	System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
	ChromeDriver cdriver = new ChromeDriver();
	cdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	cdriver.get("https://www.amazon.in/"); //page URL
	//cdriver.getCurrentUrl();
	System.out.println("Print the URL ="+cdriver.getCurrentUrl());
	//maximize the page
	cdriver.manage().window().maximize();
	//minimize & set size of browser
	String pageTitle = cdriver.getTitle();
	//print page Title
	System.out.println("Print page Title ="+pageTitle);
	//Printing Fasion page Title 
	String pageFasionTitle =cdriver.getTitle();
	//Open fashion
	cdriver.findElement(By.linkText("Fashion")).click();
	System.out.println("Page fasion title ="+cdriver.getCurrentUrl());
	cdriver.navigate().back();
	//Open Electronics
	cdriver.findElement(By.linkText("Electronics")).click();
	cdriver.navigate().back();
  }
}
