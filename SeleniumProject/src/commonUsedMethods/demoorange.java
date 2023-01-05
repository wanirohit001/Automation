package commonUsedMethods;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoorange {
public static void main(String[] args) 
 {
	System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
	ChromeDriver cdrive = new ChromeDriver();
	cdrive.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	cdrive.get("https://opensource-demo.orangehrmlive.com"); //page URL
	String pageTitle = cdrive.getTitle();
	System.out.println("page Title is ="+pageTitle); //Printing page Title
	System.out.println("page Title validation ="+pageTitle.equals("OrangeHRM"));
	System.out.println("page URL is ="+cdrive.getCurrentUrl());//printing page URL
	System.out.println("validation of URL="+cdrive.equals(cdrive));
    String sourcecode=cdrive.getPageSource();  //source code
    System.out.println("length of source code="+sourcecode.length());
   // WebElement Username = cdrive.findElement(By.name("username")).sendKeys("Admin");
   //Username.sendKeys("Admin");
    cdrive.findElement(By.name("username")).sendKeys("Admin");
    WebElement Password=cdrive.findElement(By.name("password"));
    Password.sendKeys("admin123");
    cdrive.findElement(By.className("oxd-button")).click();
   
   }

}
