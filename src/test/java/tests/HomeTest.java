package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import genericPages.CommonMethods;
import pages.*;

public class HomeTest extends CommonMethods {

	public HomeTest() throws Exception {
	}

	@BeforeTest
	public void beforeTest() {
		// Open the browser and hit the url
		initializeBrowser();
	}

	@Test
	public void checkTitle() throws Exception {
		test = reports.startTest("TC001 Verify all menu's on the home page");
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
		test = reports.startTest("TC002 Search and add product to cart");
		HomePage homePage = new HomePage();

		// Search the product
		homePage.searchProduct();

		// Add product to the cart and verify it is added successfully
		homePage.addToCart();

		// Remove product from cart
		homePage.removeFromCart();
	}

	@Test
	public void loginWithInvalidNumber() throws Exception {
		test = reports.startTest("TC003 Verify login functionality with invalid mobile number");
		LoginPage loginPage = new LoginPage();

		// Open login page
		loginPage.login();

		// Verify login functionality with invalid mobile number
		loginPage.enterInvalidMobileNumber();
	}

	@AfterTest
	public void afterTest() {
		// Close the browser
		driver.quit();
		reports.endTest(test);
		reports.flush();
	}

}
