package seleniumMethods.com;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class DoubleClickProg {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Home Pc\\eclipse-workspace\\GreenTech\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://artoftesting.com/sampleSiteForSelenium.html");
	    
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    
	    WebElement text = driver.findElement(By.xpath("//input[@id='fname']"));
	    
	    WebElement submit = driver.findElement(By.xpath("//button[@id='idOfButton']"));
	    
	    WebElement box = driver.findElement(By.xpath("//button[@id='dblClkBtn']"));
	    
	    Actions ma = new Actions(driver);
	    ma.sendKeys(text, "Vini").build().perform(); //another method for passing sendkeys
	    //text.sendKeys("Vini");
	    Thread.sleep(2000);
	    ma.click(submit).build().perform();
	    Thread.sleep(2000);
	    ma.doubleClick(box).build().perform();
	    Thread.sleep(2000);
	    
	    driver.quit();
	}
	}



