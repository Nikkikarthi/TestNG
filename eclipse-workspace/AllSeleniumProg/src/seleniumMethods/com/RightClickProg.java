package seleniumMethods.com;

	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.util.Set;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class RightClickProg {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Home Pc\\eclipse-workspace\\GreenTech\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.google.com/");
	    
	    driver.manage().window().maximize();
	   // Thread.sleep(2000);
	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    driver.manage().deleteAllCookies();
	    /*driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	    driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
	    */
	    
	 // 1st window id - google
	    String fid = driver.getWindowHandle();
	    System.out.println(fid);
	   
	    WebElement images = driver.findElement(By.xpath("//a[text()='Images']"));
	    WebDriverWait wb = new WebDriverWait(driver, 70);
	    wb.until(ExpectedConditions.visibilityOf(images));
	    
	    Actions ma = new Actions(driver);
	    ma.contextClick(images).build().perform(); //rightclick = contextclick  
	    
	    //keyboard interactions = class is robot from java.awt
	    
	    Robot ro = new Robot();
	    
	    ro.keyPress(KeyEvent.VK_DOWN); //vk- virtual key
	    ro.keyRelease(KeyEvent.VK_DOWN);
	   
	    ro.keyPress(KeyEvent.VK_DOWN);
	    ro.keyRelease(KeyEvent.VK_DOWN);
	    
	    ro.keyPress(KeyEvent.VK_ENTER);
	    ro.keyRelease(KeyEvent.VK_ENTER);
	    
	    Thread.sleep(3000);
	    
	    //includes image window id and also google window id, multiple windows - handles
	    Set<String> mid = driver.getWindowHandles();  //set not allow duplicate
	    System.out.println(mid);
	    
	    for (String x : mid) {
	    	if (!x.equals(fid)) { //not equal to 1st id 
	    		driver.switchTo().window(x);   // back to main window
	    		WebElement search = driver.findElement(By.name("q"));
	    		search.sendKeys("Mobile");
	    		Thread.sleep(3000);   
				driver.close();       // close - close only particular window
			}
	    	
			
		}
	}
	}

