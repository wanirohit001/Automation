package commonUsedMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class browseroperation3 {
public static void main(String[] args) 
  {
	System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
	ChromeDriver cdriver = new ChromeDriver();
	cdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    cdriver.get("https://www.techlistic.com/p/java/html"); //(page URL)
    String pageTitle = cdriver.getTitle();
    System.out.println("page title "+pageTitle);              //PAGE TITLE NOT PRINT 
	//Maximize page 
	cdriver.manage().window().maximize();
    cdriver.findElement(By.className("dropbtn")).click();
	//validation of selenium page Title
    cdriver.get("https://www.techlistic.com/p/selenium-tutorials.html");
    String SeleniumpageTitle = cdriver.getTitle();
    //Printing page Title                                        //PAGE TITLE NOT PRINT
    System.out.println("Page Title ="+SeleniumpageTitle);
    //page Title validation
    System.out.println("Selenium pageTitle validation= "+SeleniumpageTitle.equals("https://www.techlistic.com/p/selenium-tutorials.html")); 
    //Open API
    cdriver.findElement(By.linkText("API")).click();
    //Back to home page
    cdriver.navigate().back();
    //Open JAVA
  	cdriver.findElement(By.linkText("JAVA")).click();
  	//Back to Home page
  	cdriver.navigate().back();
  	//Open selenium link
  }

}
