package commonUsedMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class browseroperation4 {
public static void main(String[] args) 
{ 
	System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
	ChromeDriver cdriver = new ChromeDriver();
	cdriver.get("https://demo.vtiger.com/vtigercrm/index.php");
	cdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	String pageTitle = cdriver.getCurrentUrl();
	System.out.println("URL validation = "+pageTitle.equals(pageTitle));
	//verifying login page
    System.out.println("verify login page= "+cdriver.equals(cdriver));
    cdriver.findElement(By.tagName("button")).click();
    //Home page validation
    System.out.println("velidation of home page="+cdriver.equals("demo.vtiger.com"));
    //Maximize window size
    cdriver.manage().window().maximize();
	//click on add wedge 
    cdriver.findElement(By.className("addButton")).click();
    //After wedge open select the History for open
    cdriver.findElement(By.tagName("a")).click();
    //open Upcoming Activities 
     cdriver.findElement(By.linkText("Upcoming Activities")).click();
	}

}
