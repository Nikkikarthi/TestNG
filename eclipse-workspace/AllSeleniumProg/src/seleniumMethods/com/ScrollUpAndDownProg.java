package seleniumMethods.com;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class ScrollUpAndDownProg {

		public static void chromerBrowser() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Home Pc\\eclipse-workspace\\GreenTech\\Drivers\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.amazon.com/");
	        
	        driver.manage().window().maximize();
	        Thread.sleep(2000);

	        //WebElement mobile = driver.findElement(By.xpath("//img[contains(@alt,'Essential Phone in Halo')]"));
	       
	        //WebElement startpage = driver.findElement(By.xpath("//div[@id='nav-logo']"));
	        
	        JavascriptExecutor js = (JavascriptExecutor)driver;
	        /*js.executeScript("arguments[0].scrollIntoView();",mobile);
	        js.executeScript("arguments[0].scrollIntoView(false);",mobile);
	        Thread.sleep(5000);
	        js.executeScript("arguments[0].scrollIntoView();",startpage); 
	        js.executeScript("arguments[0].scrollIntoView(true);",startpage);*/
	        
	        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	        Thread.sleep(3000);
	        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
	        Thread.sleep(3000);
	        
	        driver.quit();
	        
		}	
	public static void main(String[] args) throws InterruptedException {
		chromerBrowser();
	}
	}




