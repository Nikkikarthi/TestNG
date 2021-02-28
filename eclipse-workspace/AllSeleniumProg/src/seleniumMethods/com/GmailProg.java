package seleniumMethods.com;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class GmailProg {
		public static void chromeBrowserLaunch() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Home Pc\\eclipse-workspace\\GreenTech\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");

	driver.manage().window().maximize();

	Thread.sleep(3000);

	driver.navigate().to("https://accounts.google.com");
	Thread.sleep(3000);

	String title = driver.getTitle();
	System.out.println(title);

	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);

	WebElement emailfield = driver.findElement(By.id("identifierId"));
	emailfield.sendKeys("nikkithakarthi@gmail.com");

	WebElement next = driver.findElement(By.xpath("//*[@id=\'identifierNext\']/span"));
	next.click();

	Thread.sleep(5000);
	WebElement password = driver.findElement(By.name("password"));
	password.sendKeys("pinkyklv");

	Thread.sleep(5000);
	WebElement next1 = driver.findElement(By.xpath("//span[text()='Next']"));
	next1.click();
	Thread.sleep(5000);

driver.quit();
		}
	public static void main(String[] args) throws InterruptedException {
		chromeBrowserLaunch();
		
	}
	}


