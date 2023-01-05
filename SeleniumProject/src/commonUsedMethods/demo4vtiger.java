package commonUsedMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class demo4vtiger {
public static void main(String[] args)
 {
	System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
	ChromeDriver cdriver = new ChromeDriver();
	
	cdriver.get("https://demo.vtiger.com/vtigercrm/index.php");
	String pageTitle = cdriver.getTitle();
	System.out.println("validation of page Title= "+pageTitle.equals("vtiger"));
	System.out.println("printing page URL= "+cdriver.getCurrentUrl());
	System.out.println("page URL validation/login page ="+cdriver.equals(cdriver));
	
	String sourcecode = cdriver.getPageSource();
	System.out.println("page source code length is ="+sourcecode.length());
	
	cdriver.findElement(By.tagName("button")).click();
	
   }
}
