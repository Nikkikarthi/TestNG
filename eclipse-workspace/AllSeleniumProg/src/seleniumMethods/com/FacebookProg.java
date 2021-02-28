package seleniumMethods.com;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class FacebookProg {
	public static void chromeBrowserLaunch() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Home Pc\\eclipse-workspace\\GreenTech\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");

	// to maximize the window
	driver.manage().window().maximize();

	//to pause your code
	Thread.sleep(2000);

	//to navigate to url
	driver.navigate().to("https://www.facebook.com/");

	//navigate to back
	driver.navigate().back();
	Thread.sleep(2000);

	//navigate to forward
	driver.navigate().forward();
	Thread.sleep(2000);

	//navigate refresh
	driver.navigate().refresh();
	Thread.sleep(2000);

	//to get page title(sign up or log in is title which action perform by clicking)
	String title = driver.getTitle();
	System.out.println(title);

	//to get current url
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);

	//to find web element
	WebElement emailField = driver.findElement(By.id("email"));
	emailField.sendKeys("9042152959");

	WebElement passwordField = driver.findElement(By.id("pass"));
	passwordField.sendKeys("ghasgddd");

	WebElement logInButton = driver.findElement(By.xpath("//input[@value='Log In']"));
	logInButton.click();

	// to quit your browser
	driver.quit();

	}

	public static void main(String[] args) throws InterruptedException {
		chromeBrowserLaunch();
	}
	}



