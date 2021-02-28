package seleniumMethods.com;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class MouseHoverProg {
		public static void mouseAction() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Home Pc\\eclipse-workspace\\GreenTech\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");

	WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));

	WebElement Tshirts = driver.findElement(By.xpath("(//a[text()='T-shirts'])[1]"));

	Actions ma = new Actions(driver); //Mouse class =Actions
	ma.moveToElement(women).build().perform(); //build and perform is used to complete an action

	Thread.sleep(2000);
	ma.click(Tshirts).build().perform();
		}
		
		
	public static void main(String[] args) throws InterruptedException {
		mouseAction();
	}
	}



