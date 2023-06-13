package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import genericPages.CommonMethods;
import genericPages.MasterPage;
import pages.HomePage;

public class CheckTitleTest extends CommonMethods {

	
	public CheckTitleTest() throws Exception {
	}

	@BeforeTest
	public void beforeTest() {
		// Open the browser and hit the url
		initializeBrowser();
	}

	@Test(enabled=false)
	public void checkTitle() throws Exception {
		test = reports.startTest("Verify all menu's on the home page");
		HomePage homePage = new HomePage();
		
		// Verify beauty page title
		homePage.verifyBeautyPageTitle();
		
		// Verify hair page title
		homePage.verifyHairPageTitle();
		
		// Verify face page title
		homePage.verifyFacePageTitle();
		
		// Verify body page title
		homePage.verifyBodyPageTitle();
		
		// Verify makeup page title
		homePage.verifyMakeupPageTitle();
	}

	
	
	@Test
	public void searchAndAddToCart() throws Exception {
		test = reports.startTest("Search and add product to cart");
		HomePage homePage = new HomePage();
		
		// Search the product
		homePage.searchProduct();
		
		// Add product to the cart and verify it is added successfully
		homePage.addToCart();
		
		// Remove product from cart
		homePage.removeFromCart();
		
	}
	
	@AfterTest
	public void afterTest() {
		// Close the browser
		driver.quit();
		reports.endTest(test);
		reports.flush();
	}

}
