package genericPages;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.io.FileInputStream;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class MasterPage {

	public static WebDriver driver;
	public Properties propConfig;
	public Properties propLocator;
	public Properties propTestData;
	
	
	// Constructor Implementation
	public MasterPage() throws Exception {
		
		// Configuration properties file Implementation
		FileInputStream fisConfig = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\resources\\repository\\configuration.properties");
		propConfig = new Properties();
		propConfig.load(fisConfig);

		// Locators properties file Implementation
		FileInputStream fisLoc = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\resources\\repository\\locators.properties");
		propLocator = new Properties();
		propLocator.load(fisLoc);

		// Test data Properties file Implementation
		FileInputStream fisTestData = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\resources\\repository\\testData.properties");
		propTestData = new Properties();
		propTestData.load(fisTestData);

		// Launching the browser
		/*if (propConfig.getProperty("browser").equalsIgnoreCase("chrome")) {
			ChromeOptions o = new ChromeOptions();
			o.addArguments("--disable-notifications");
			o.addArguments("--remote-allow-origins=*");
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver.exe");
			driver = new ChromeDriver(o);
		} else if (propConfig.getProperty("browser").equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\geckodriver.exe");
		} else {
			System.out.println("Open IE Browser");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(propConfig.getProperty("url"));*/
		
	}

}
