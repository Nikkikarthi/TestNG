package seleniumMethods.com;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class FramesProg {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Home Pc\\eclipse-workspace\\GreenTech\\Drivers\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.get("http://demo.automationtesting.in/Frames.html");
		    
		    // inspect to overall frame screen in that page
		    WebElement frame = driver.findElement(By.id("singleframe"));
		    
		    // to go for that frame place
		    driver.switchTo().frame(frame);
		    
		    // inside the frame textbox
		    WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));
		    textbox.sendKeys("Vini");
		    Thread.sleep(2000);
		    
		    //driver.quit();
		    
		
		}
	}



