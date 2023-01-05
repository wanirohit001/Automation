package commonUsedMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class browseroperation1 {
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
    System.out.println("verify home page="+cdriver.equals("demo.vtiger.com"));
    //Maximize window size
    cdriver.manage().window().maximize();
    //Refresh navigation page
    cdriver.navigate().refresh();
    //navigate to back
    cdriver.navigate().back();
    //navigate to another webpage
    cdriver.navigate().to("https://www.amazon.in/");
 }

}
