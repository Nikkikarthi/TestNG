package seleniumMethods.com;

	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class WebTablePath {
		
	public static WebDriver driver;

		public static void allData()  {
		    List<WebElement> alldata = driver.findElements(By.xpath("//table/tbody/tr/td"));
		    for (WebElement data : alldata) {
		    	System.out.println(data.getText());
		    }
		    }
			
		 
	public static void rowWise(int row) {
		System.out.println("==========row-wise========");
		List<WebElement> SecondRow = driver.findElements(By.xpath("//table/tbody/tr[" + row + "]/td"));
		for (WebElement data : SecondRow) {
			System.out.println(data.getText());
		}
			
		}


	public static void columnWise(int column) {
		System.out.println("==========colum-wise========");
		List<WebElement> thirdColumn = driver.findElements(By.xpath("//table/tbody/tr/td[" + column + "]"));
		for (WebElement data : thirdColumn) {
			System.out.println(data.getText());
		}
	}

	public static void particularData(int row, int column) {
		System.out.println("==========particular data========");
		WebElement particularData = driver.findElement(By.xpath("//table/tbody/tr[" + row + "]/td[" + column + "]"));
		System.out.println(particularData.getText());	
	}
	
	public static void headsInTable() {
   WebElement head1 = driver.findElement(By.xpath("//table/thead/tr/th"));
   System.out.println(head1.getText());
	}

	public static void webTable() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Home Pc\\eclipse-workspace\\GreenTech\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.toolsqa.com/automation-practice-table/");
	    
	driver.manage().window().maximize();
	//Thread.sleep(2000);

	}

	public static void main(String[] args){
		webTable();
		allData();
		rowWise(2);
		columnWise(4);
		particularData(4, 3);
		headsInTable();
	}
	}
