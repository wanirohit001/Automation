package calenderHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign3Indigo {
public static void main(String[] args) 
 {
	System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
	ChromeDriver cdriver = new ChromeDriver();
	cdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//URL of Indigo
	cdriver.get("https://www.goindigo.in/"); 
	//maximize the page
	cdriver.manage().window().maximize();
	//click on from
    cdriver.findElement(By.cssSelector("input[placeholder='From']")).click();
	//select city from-Guwahati
	cdriver.findElement(By.cssSelector("div[aria-label='0results available, use arrow to navigate.']>div>div>div:nth-child(10)")).click();
	//select city of Destination
	cdriver.findElement(By.cssSelector("div[class='autocomplete-wrapper station-wrapper']>input[placeholder='To']")).sendKeys("Mumbai");
	
	cdriver.findElement(By.cssSelector("input[placeholder='To']")).click();
	//click date in calender
	cdriver.findElement(By.cssSelector(".form-control.or-depart.igInitCalendar.focus")).click();
	}

}
