package handlingMultipleElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6Demoblaze {
public static void main(String[] args) 
 {  //set path for chrome browser
	System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
	//Launching chrome driver
		WebDriver cdriver = new ChromeDriver();
	cdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//URL of Demoblaze 
	cdriver.get("https://demoblaze.com/");
	//Maximize Window
	cdriver.manage().window().maximize();
	//Printing name of mobiles using CSS selector
	List<WebElement> suggestList = cdriver.findElements(By.cssSelector("div.row>div.col-lg-4.col-md-6.mb-4>div>div>h4>a"));
	//Printing Prize of mobiles 
	List<WebElement> suggest = cdriver.findElements(By.cssSelector("div.row>div.col-lg-4.col-md-6.mb-4>div>div>h5"));
	//WebElement Total count
		int suggCount=suggestList.size();
		System.out.println(suggCount);
	//To access one by one list Mobiles
		for(int i=0;i<suggCount;i++) 
		{
			System.out.println(suggestList.get(i).getText());
		}
	//To Print Prize of mobile 
		for(int i=0;i<suggCount;i++) 
		{
			System.out.println(suggest.get(i).getAttribute("innerHTML"));
		}
	  }	
  }


