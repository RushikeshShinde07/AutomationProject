package pages;

import genericPages.CommonMethods;

public class HomePage extends CommonMethods {

	public HomePage() throws Exception {
	}

	public void verifyBeautyPageTitle() throws Exception {
		click("beautyMenu");
		verifyElementPresent("beautyPageTitle");
	}

	public void verifyHairPageTitle() throws Exception {
		click("hairMenu");
		waitForElementToBeVisible("hairPageTitle",10);
		verifyElementPresent("hairPageTitle");
	}

	public void verifyFacePageTitle() throws Exception {
		click("faceMenu");
		waitForElementToBeVisible("facePageTitle",10);
		verifyElementPresent("facePageTitle");
	}

	public void verifyBodyPageTitle() throws Exception {
		click("bodyMenu");
		waitForElementToBeVisible("bodyPageTitle", 10);
		verifyElementPresent("bodyPageTitle");
	}

	public void verifyMakeupPageTitle() throws Exception {
		click("makeupMenu");
		waitForElementToBeVisible("makeupPageTitle", 10);
		verifyElementPresent("makeupPageTitle");
	}

	public void searchProduct() throws Exception {
		click("searchBox");
		enterData("searchInputBox", "searchText");
		Thread.sleep(1000);
	}

	public void addToCart() throws Exception {
		scrollDown();
		waitForElementToBeVisible("addToCartButton", 10);
		click("addToCartButton");
		verifyElementPresent("saveToCartDisplayMessage");
		click("addToCartLogo");
		verifyElementPresent("cartItemTitle");
	}

	public void removeFromCart() throws Exception {
		click("removeItemMinusButton");
		verifyElementPresent("removedFromCartMessage");
	}


}
