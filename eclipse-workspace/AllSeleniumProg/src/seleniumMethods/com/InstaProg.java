package seleniumMethods.com;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class InstaProg {
		public static void chromeBrowserLaunch() throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Home Pc\\eclipse-workspace\\GreenTech\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.google.com/");
		
		//to maximize the Screen
	    driver.manage().window().maximize();
		
		//to pause your code
		Thread.sleep(3000);

		// to navigate the url
		driver.navigate().to("https://www.instagram.com/accounts/login/");
		Thread.sleep(3000);
		
		//to get page title
		String title = driver.getTitle();
		System.out.println(title);
		
		//to get currentUrl
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		//to find web element
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("nameis6un");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Arun@219");
		Thread.sleep(5000);
		
	    WebElement logInButton = driver.findElement(By.xpath("//button[@type='submit']"));
		logInButton.click();
		Thread.sleep(5000);
		

		// to quit your browser
		driver.quit();

		}

		public static void main(String[] args) throws InterruptedException {
			chromeBrowserLaunch();
		}
		}

