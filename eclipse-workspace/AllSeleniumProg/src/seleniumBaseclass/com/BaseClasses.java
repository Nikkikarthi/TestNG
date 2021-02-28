package seleniumBaseclass.com;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClasses {
	
	public static WebDriver driver;
	
	public static WebDriver getBrowser(String browserName) throws Exception {
		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				//System.out.println(System.getProperty("user.dir"));
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
				driver = new ChromeDriver();
				}
			else if (browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir")+"\\drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
				}
			else if (browserName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\drivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				} else {
					throw new Exception("Browser Name is invalid");
				}
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			return driver;                  // we re calling the driver in another class
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	
	// check the element whether it is displayed or not
	public static boolean elementIsDisplayed(WebElement element) {
		try {
			boolean displayed = element.isDisplayed();
			return displayed;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();	
		}
	}
	
	
	// check the element whether it is enabled or not
	public static boolean elementIsEnabled(WebElement element) {
		try {
			boolean enabled = element.isEnabled();
			return enabled;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();	
		}
	}
	
	
	//explicit wait
	public static void waitforElementVisibility(WebElement element) {
		try {
			WebDriverWait wb = new WebDriverWait(driver, 60);
			wb.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();	
		}
	}
	
	//input values (sendkeys)
	public static void inputValuestoWebelement(WebElement element, String value) {
		try {
			waitforElementVisibility(element);
			if (elementIsDisplayed(element)&&elementIsEnabled(element)) {
				element.sendKeys(value);
				}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	// click log in button
	public static void clickonWebelement(WebElement element) {
       try {
		waitforElementVisibility(element);
		   if (elementIsDisplayed(element)) {
			   element.click();	
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		throw new RuntimeException();
		}
    }
	
	
	//DropDown 
	public static void selectDropDownOption(WebElement element, String option, String value) {
       try {
		waitforElementVisibility(element);
		   Select s = new Select(element);
		   if (option.equalsIgnoreCase("value")) {
			   s.selectByValue(value);
			   } else if (option.equalsIgnoreCase("visibletext")) {
				   s.selectByVisibleText(value);
			        } else if (option.equalsIgnoreCase("index")) {
			        	s.selectByIndex(Integer.parseInt(value));
						}
	} catch (NumberFormatException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		throw new RuntimeException();
	     }
    }
	
	//to take a screenshot
	public static void takeScreenShot(String fileName) throws IOException {
		try {
			File des = new File(System.getProperty("user.dir")+"\\Screenshots\\"+fileName+".png");
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, des);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}			
	}
	
	// MouseHover
	public static void mouseHoverToElement(WebElement element) {
         try {
			waitforElementVisibility(element);
			 Actions ac = new Actions(driver);
			 ac.moveToElement(element).build().perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}     
	}
	
	//scrollUsingElement
	public static void scrollUsingElement(WebElement element, String option) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			   if (option.equalsIgnoreCase("down")) {
				   js.executeScript("arguments[0].scrollIntoView(false);", element);
				} else if (option.equalsIgnoreCase("up")) {
					 js.executeScript("arguments[0].scrollIntoView(true);", element);
				}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
			}
	   }
	
     //Scrollwithoutelement
	public static void scrollUsingCoOrdinates(String width, String height) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(" + width + "," + height + ")");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}	
	}
	
	//full scrolldown
	public static void scrollToBottomOfThePage() {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}	
	}
	
	
	//full scrollup
	public static void scrollToTopOfThePage() {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}	
	}
	
	//drag and drop
	public static void dragAndDrop(WebElement sourceElement, WebElement placedElement) {
         try {
			Actions ac = new Actions(driver);
			 ac.dragAndDrop(sourceElement, placedElement).build().perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
    }

     //simple Alert
	public static void simpleAlert(WebElement element) {
          try {
			waitforElementVisibility(element);
			  Alert simpleAlert = driver.switchTo().alert();
			  simpleAlert.accept();
			  driver.switchTo().defaultContent();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	//confirm Alert
	public static void confirmAlert(WebElement element, String condition) {
        try {
			waitforElementVisibility(element);
			  Alert confirmAlert = driver.switchTo().alert();
			  if (condition.equalsIgnoreCase("accept")) {
				  confirmAlert.accept();
				  driver.switchTo().defaultContent();
				} else if (condition.equalsIgnoreCase("dismiss")) {
			  confirmAlert.dismiss();
			  driver.switchTo().defaultContent();
				  }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	//prompt alert
	public static void promptAlert(WebElement element, String condition, String value) {
        try {
			waitforElementVisibility(element);
			  Alert promptAlert = driver.switchTo().alert();
			  if (condition.equalsIgnoreCase("accept")) {
				  promptAlert.sendKeys(value);
				  promptAlert.accept();
				  driver.switchTo().defaultContent();
				} else if (condition.equalsIgnoreCase("dismiss")) {
			  promptAlert.dismiss();
			 // promptAlert.sendKeys(value);
			  driver.switchTo().defaultContent();
				  }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	//right click
	public void rightClick(WebElement element) {
        try {
			waitforElementVisibility(element);
			Actions ac = new Actions(driver);
			ac.contextClick(element).build().perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	//double click
	public void doubleClick(WebElement element) {
        try {
			waitforElementVisibility(element);
			Actions ac = new Actions(driver);
			ac.doubleClick(element).build().perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	//
	
	
	
}



