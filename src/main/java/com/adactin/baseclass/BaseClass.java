package com.adactin.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

//import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.devtools.v85.input.Input;

public class BaseClass {
	public static WebDriver driver;
	public static WebDriver getBrowser(String browsername) { //1.Browser Launch
		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\com.java.base\\Driver\\chromedriver.exe");
				driver=new ChromeDriver();
					}
			else if (browsername.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver","C:\\Users\\ADMIN\\eclipse-workspace\\com.java.base\\Driver\\chromedriver.exe");
			} 
			else {
				System.out.println("Invalid browser");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		return driver;
		}
	
	public static void getUrl(String url) { //2.Get
			try {
				driver.get(url);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	public static void inPut(WebElement element,String value) {	//3.Send Keys
	try {
		element.sendKeys(value);
	} catch (Exception e) {
		e.printStackTrace();
	}
	}	
	public static void navigateTo(String navito) { //4. Navigate To
	try {
		driver.navigate().to(navito);
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
	public static void navigateBack() { //5.Navigate Back
		try {
			driver.navigate().back();	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void navigateFrwd() { //6.Navigate Frwd
		try {
			driver.navigate().forward();
		} catch (Exception e) {
			e.printStackTrace();
		}
	    }
	public static void navigateRefresh() { //7.Navigate Refresh
	try {
		driver.navigate().refresh();
	} catch (Exception e) {
		e.printStackTrace();
	}
    }
	public static void cloSe() { //8.Close
		try {
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
 	    }
	public static void quIt() { //9.Quit
		try {
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	    }
	public static void getCurrenturl() { //10.Get current url
	try {
		System.out.println(driver.getCurrentUrl());
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
	public static void getTitle() { //11. Get title
	try {
		System.out.println(driver.getTitle());
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
	public static void getText(WebElement element) { //12. Get Text
	try {
		System.out.println(element.getText());
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
	public static void waIt() { //13. Wait(5000)
		try {
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
	public static void screenShot() throws IOException { //14. Screenshot
		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File("C:\\Users\\ADMIN\\eclipse-workspace\\com.java.base\\ScreenShot\\image1.png");
//			FileUtils.copyFile(screenshotAs, destination);
		} catch (WebDriverException e) {
			e.printStackTrace();
//	} catch (IOException e) {
			e.printStackTrace();
		}
		}
	public static void getAttribute(WebElement element,String value) { //15. Get Attribute
		try {
			System.out.println(element.getAttribute(value));
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
	public static void simpleAlert() { //16. Alerts a)simple
		try {
			driver.switchTo().alert().accept();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    public static void confirmAlert1() { //b)confirm -accept
    	try {
			driver.switchTo().alert().accept();
		} catch (Exception e) {
			e.printStackTrace();
		}
    	    }
    public static void confirmAlert2() { //b)confirm - dismiss 
       	try {
			driver.switchTo().alert().dismiss();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    public static void promptAlert(String value) { //c) prompt-accept or dismiss
    	try {
			driver.switchTo().alert().sendKeys(value);
			driver.switchTo().alert().accept();
		} catch (Exception e) {
			e.printStackTrace();
		}
    	}
    public static void dropDown(WebElement element,String value) { //17.DropDown=====if condition
    	try {
    		Select sel=new Select(element);
			sel.selectByVisibleText(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
    	}
    public static void scrollDown() {//18.ScrollUpandDown
    	
    	try {
			JavascriptExecutor je= (JavascriptExecutor) driver;
			je.executeScript("window.scrollBy(0,3000)");
		} catch (Exception e) {
			e.printStackTrace();
		}
    	 }
    public static void scrollUp() {
    	try {
			JavascriptExecutor je=(JavascriptExecutor) driver;
			je.executeScript("window.scrollBy(0,-2000)");
		} catch (Exception e) {
			e.printStackTrace();
		}
    	}
    //Actions
    public static void actiOns(WebElement element1,WebElement element2) { //19. Drag and Drop
    	try {
			Actions ac = new Actions(driver);
			ac.dragAndDrop(element1, element2).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
    	}
    public static void clickElement(WebElement element) { //20.click
    	try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
    	}
    //Multiple DropDown
    
    public static void multiDrop(WebElement element){  //21.isMultiple
        try {
			Select select = new Select(element);
			select.isMultiple();
		} catch (Exception e) {
			e.printStackTrace();
		}
    	}
    
    public static void getOptions(WebElement element) {	 //22.Get All Options
    	try {
			Select s = new Select(element);    
			s.isMultiple();
			List<WebElement> alloptions = s.getOptions();      
			for (WebElement options : alloptions) {
				System.out.println(options.getText()); 
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
        }
    public static void getAllselected(WebElement element) {  //23. getAllSelected  
    	try {
			Select s = new Select(element);
			s.isMultiple();
			List<WebElement> alloptions = s.getOptions();
			int size = alloptions.size();
			for (int i = 0; i <size; i++) {
				if(i==1 || i==3||i==6)
					s.selectByIndex(i);
			}
			List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
			for (WebElement options : allSelectedOptions) {
				String text = options.getText();
				System.out.println(text);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
    	}
    public static void getFirstselected(WebElement element) {  //24. Get First Selected
    	Select s = new Select(element);
    	s.isMultiple();
   		List<WebElement> alloptions = s.getOptions();
   		int size = alloptions.size();
    	for (int i = 0; i <size; i++) {
		if(i==3 || i==1||i==6)
		s.selectByIndex(i);
    	}
    	WebElement firstselectedOption = s.getFirstSelectedOption();
    	System.out.println(firstselectedOption.getText());
    	}
    	
    
    public static void isDisplayed(WebElement element) {   //25. Is Displayed
    	try {
			System.out.println(element.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    public static void isSelected(WebElement element) {   //26. Is Selected
    	try {
			System.out.println(element.isSelected());
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    public static void isEnabled(WebElement element) {		//27. Is Enabled
    	try {
			System.out.println(element.isEnabled());
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    public static void action(WebElement element) {      //28. move element
    	try {
			Actions me = new Actions(driver);
			me.moveToElement(element).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    
}

