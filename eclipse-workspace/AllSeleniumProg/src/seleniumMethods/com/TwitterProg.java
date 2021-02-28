package seleniumMethods.com;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class TwitterProg {
		public static void chromeBrowserLaunch() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Home Pc\\eclipse-workspace\\GreenTech\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");

	driver.manage().window().maximize();

	Thread.sleep(3000);

	driver.navigate().to("https://twitter.com/login");
	Thread.sleep(3000);

	String title = driver.getTitle();
	System.out.println(title);

	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);

	WebElement emailfield = driver.findElement(By.xpath("//input[@autocomplete='on']"));
	emailfield.sendKeys("nikkithakarthi@gmail.com");

	WebElement password = driver.findElement(By.xpath("//input[@class='js-password-field']"));
	password.sendKeys("fchjmnncghn");

	Thread.sleep(3000);
	WebElement Loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
	Loginbutton.click();
	Thread.sleep(3000);

	driver.quit();
		}
	public static void main(String[] args) throws InterruptedException {
		chromeBrowserLaunch();
	}
	}

