package commonUsedMethods;

import org.openqa.selenium.chrome.ChromeDriver;
public class demo1sampleapp {
public static void main(String[] args) 
 { 
	System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
	ChromeDriver cdriver = new ChromeDriver();
	
	cdriver.get("http://sampleapp.tricentis.com/101/");
    
	String pageTitle = cdriver.getTitle();
	System.out.println("page Title validation is= " +pageTitle.equals("Tricentis Vehicle Insurance"));
	System.out.println("Printing page URL= "+cdriver.getCurrentUrl());
	System.out.println("Validation of page URL is= "+cdriver.equals(cdriver));
	
	String sourcecode = cdriver.getPageSource();
	System.out.println("Printing length of source code= "+sourcecode.length());
	
  }
}
