package handlingMultipleElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment4Vtiger {
public static void main(String[] args)
 {  //Path of browser
	System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
	//launching chrome browser
	ChromeDriver cdriver = new ChromeDriver();
	cdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//Webpage URL
	cdriver.get("https://demo.vtiger.com/vtigercrm/index.php");
	String pageTitle = cdriver.getTitle();
	//Login vtiger
	cdriver.findElement(By.tagName("button")).click();
   //Printing all Wedges using cssSelector
	List<WebElement> suggestList = cdriver.findElements(By.cssSelector("div.dashBoardTabContainer>div>div>div>ul>li>a"));
	//WebElement Total count
	int suggCount=suggestList.size();
	System.out.println(suggCount);
	//To access one by one list element
	for(int i=0;i<suggCount;i++) 
	    {        //get Attribute() used when print name inside any Dropdown  "innerHTML"-Standard
			System.out.println(suggestList.get(i).getAttribute("innerHTML"));
		}
     }
}
