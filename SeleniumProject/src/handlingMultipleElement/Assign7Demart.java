package handlingMultipleElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign7Demart {
public static void main(String[] args) 
 {
    //Path of Chrome driver
    System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
    //Launching of chrome driver
	ChromeDriver cdriver = new ChromeDriver();
	//Implicit wait
	cdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//Maximize window
	cdriver.manage().window().maximize();
	//URL of Webpage
	cdriver.get("https://www.dmart.in/");
	//Locator css-selector for all title name
	List<WebElement> suggestList = cdriver.findElements(By.cssSelector("div.src-client-components-categories-header-__categories-header-module___list-div>ul>li>a"));

	//WebElement Total count
	int suggCount=suggestList.size();
	System.out.println(suggCount);
	//To access one by one list element
		for(int i=0;i<suggCount;i++) 
			{
				System.out.println(suggestList.get(i).getText());
			}	
	 }

}
