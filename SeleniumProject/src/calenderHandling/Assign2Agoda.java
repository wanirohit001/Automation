package calenderHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assign2Agoda {
public static void main(String[] args) 
{ 
	System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
	ChromeDriver cdriver = new ChromeDriver();
	cdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	cdriver.get("https://www.agoda.com/?cid=1844104#"); 
	//maximize the page
	cdriver.manage().window().maximize();
	//Select Flight option
	cdriver.findElement(By.id("tab-flight-tab")).click();
	//select flight from option
	cdriver.findElement(By.cssSelector(".AutocompleteSearch.NewDesign>div>div")).click();
	//select flight from Mumbai
	cdriver.findElement(By.cssSelector("ul[class='AutocompleteList']>li:nth-child(2)")).click();
	//select our destination
	cdriver.findElement(By.cssSelector("input[aria-label='Flying to']")).click();
	//select fligth for Banglore
	cdriver.findElement(By.cssSelector("div[class='Popup__content']>ul[class='AutocompleteList']>li:nth-child(2)")).click();
	
	//select future Date from Calender  21/Jan/2023
	cdriver.findElement(By.cssSelector("div.DayPicker-Months>div.DayPicker-Month:nth-child(2)>div>div:nth-child(4)>div:nth-child(6)")).click();
	//click on dropdown arrow
	cdriver.findElement(By.cssSelector("div.FlightSearchOccupancy>div>div>div>div>div>i")).click();
	//click on Different class for passengers
	cdriver.findElement(By.cssSelector("section[class='FlightSearchOccupancy__CabinClass']>div>div:nth-child(4)")).click();
	
	//click on search button
	//cdriver.findElement(By.cssSelector("button[data-selenium=\"searchButton\"]>div>div>span")).sendKeys(Keys.ENTER);
    cdriver.findElement(By.xpath("//button[@data-selenium=\"searchButton\"]/div/div/span")).click();
	
	}

}
