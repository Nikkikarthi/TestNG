package seleniumMethods.com;

	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class WindowsHandlingProg {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Home Pc\\eclipse-workspace\\GreenTech\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	 
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    
	    Actions ac = new Actions(driver);
	    
	    WebElement click1 = driver.findElement(By.xpath("//*[@id=\"nav-your-amazon\"]"));
	    ac.contextClick(click1).build().perform();
	    Thread.sleep(3000);
	    
	    Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	    
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    
	    
	    WebElement click2 = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]"));
	    ac.contextClick(click2).build().perform();
	    Thread.sleep(3000);
	    
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	    
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    
	    WebElement click3 = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]"));
	    ac.contextClick(click3).build().perform();
	    Thread.sleep(3000);
	    
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	    
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    
	    WebElement click4 = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]"));
	    ac.contextClick(click4).build().perform();
	    Thread.sleep(3000);
	    
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	    
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    
	    WebElement click5 = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]"));
	    ac.contextClick(click5).build().perform();
	    Thread.sleep(3000);
	    
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	    
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    
	    
	   Set<String> Allid = driver.getWindowHandles();
	   for (String id : Allid) {
		   System.out.println(id);
	   }
	   for (String id : Allid) {
		   Thread.sleep(5000);
		   driver.switchTo().window(id);
		   Thread.sleep(5000);
		   String title = driver.getTitle();
		   System.out.println(title);
		   }
	String actualTitle = "Amazon Sign In";
	for (String id : Allid) {
		if (driver.switchTo().window(id).getTitle().equals(actualTitle)) {
			WebElement email = driver.findElement(By.name("email"));
			email.sendKeys("Vini");
			WebElement submit = driver.findElement(By.id("continue"));
			submit.click();
			break;	
		}
		}
	System.out.println("We are in sign in page");
	}
	}


