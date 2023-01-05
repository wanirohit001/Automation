package xpathAssignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assign3orangeHRM {
public static void main(String[] args) throws InterruptedException 
{   //path for chrome browser
	System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
    //Launching of chrome driver
	WebDriver cdriver = new ChromeDriver();
	//implicit wait
	cdriver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//Maximize window
	cdriver.manage().window().maximize();
	//URL of orange HRM
	cdriver.get("https://opensource-demo.orangehrmlive.com");
	//username
	cdriver.findElement(By.name("username")).sendKeys("Admin");
	//password
	cdriver.findElement(By.name("password")).sendKeys("admin123");
	//click on Login button
	cdriver.findElement(By.cssSelector(".orangehrm-login-button ")).click();
	//Click on PMI 
	cdriver.findElement(By.cssSelector("ul.oxd-main-menu>li:nth-child(2)")).click();
	//click on Add button
	cdriver.findElement(By.cssSelector(".oxd-icon.bi-plus.oxd-button-icon")).click();
	//write First Name
	cdriver.findElement(By.name("firstName")).sendKeys("Rohit");
	//write Middle Name
	cdriver.findElement(By.name("middleName")).sendKeys(" R ");
	//write Last name
	cdriver.findElement(By.name("lastName")).sendKeys("Wani");
	//Firstly clear allready fill Employee Id
	cdriver.findElement(By.cssSelector("div.oxd-grid-2>div>div>div:nth-child(2)>input")).sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.BACK_SPACE));
	//Write Employee Id
	cdriver.findElement(By.cssSelector("div.oxd-grid-2>div>div>div:nth-child(2)>input")).sendKeys("2919");
	//Save the details
	cdriver.findElement(By.cssSelector(".orangehrm-left-space")).click();
	//click on PMI button
	cdriver.findElement(By.cssSelector("ul.oxd-main-menu>li:nth-child(2)")).click();
	//click on Employee List button
	cdriver.findElement(By.cssSelector("nav.oxd-topbar-body-nav>ul>li:nth-child(2)")).click();
	//search our Employee Id
	cdriver.findElement(By.xpath("//div[@class='oxd-form-row']/div/div[2]//div/div[2]/input")).sendKeys("2919",Keys.ENTER);
	//select Job Title
	cdriver.findElement(By.xpath("//div[@class='oxd-form-row']/div/div[6]/div/div/div/div/div/i")).click();
	//.oxd-select-dropdown>div>span--job title path
    //used in HTML console for freeze screen--setTimeout(function(){debugger;}, 5000)
	
	//click on search button
	cdriver.findElement(By.cssSelector("div.oxd-form-actions>button:nth-child(2)")).click();
	//Explicit wait
	WebDriverWait wait= new WebDriverWait(cdriver,30);
	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.oxd-table-card-cell-checkbox>div>label>input")));
	
	//click of select box
	cdriver.findElement(By.cssSelector("div.oxd-table-card-cell-checkbox>div>label>input")).sendKeys(Keys.ENTER);
	//click on Delete ID box
	//cdriver.findElement(By.cssSelector("div.oxd-table-body>div>div>div:nth-child(9)>div>*:nth-child(1)")).click();
	
	}

}
