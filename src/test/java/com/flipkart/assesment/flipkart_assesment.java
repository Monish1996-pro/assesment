package com.flipkart.assesment;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;

public class flipkart_assesment {
	
	public static Page page;
	
	//========Browser Launch===========
	public static void Browser_launch() {
		

		Playwright play = Playwright.create(); // Open playwright

		Browser browser = play.chromium().launch(new LaunchOptions().setChannel("chrome").setHeadless(false));// Launch
																												// Browser

		page = browser.newPage(); // new page in browser
		
		page.navigate("https://www.flipkart.com/"); //URL
	}
	
	//==========PRODUCT SEARCH============
	public static void Product_search() {
		
		page.locator(".Pke_EE").fill("Phones");
		page.keyboard().press("Enter");
		
	}
	
	
	//==========ADD TO CART=============
	public static void add_to_cart() {
		
		page.locator("._4WELSP").locator("nth=0").click();
		
		page.navigate("https://www.flipkart.com/vivo-t3x-5g-crimson-bliss-128-gb/p/itm263ed44f56cd5?pid=MOBGZRNEPA4FFHCV&lid=LSTMOBGZRNEPA4FFHCVQ1YECQ&marketplace=FLIPKART&q=phones&store=tyy%2F4io&spotlightTagId=BestsellerId_tyy%2F4io&srno=s_1_1&otracker=search&otracker1=search&fm=Search&iid=0e247b12-da85-474d-8f73-36d70d333078.MOBGZRNEPA4FFHCV.SEARCH&ppt=sp&ppn=sp&ssid=yyk6fzp2zd09hy4g1716805342328&qH=28388ea49f54c5b8");
		page.locator(".QqFHMw").first().click();
	}
	
	//==========TO PLACE ORDER===========
	public static void place_order() {
		
		page.locator(".QqFHMw").last().click();
	}
	
	//==========REGISTRATION NUMBER===========
	public static void Reg_num() {
		
		page.navigate("https://www.flipkart.com/checkout/init?view=FLIPKART&loginFlow=true");
		
		page.locator(".r4vIwl").fill("6369391084");
		
		//I Entered the OTP manually and its navigate to the User address page to place prder
		
	}
	
	//===========USER DETAILS=============
	public static void user_details() {
		
		page.navigate("https://www.flipkart.com/checkout/init?view=FLIPKART&loginFlow=true");
		
		page.locator("input[name='name']").fill("Monish");
		page.locator("input[name='phone']").fill("6369391084");
		page.locator("input[name='pincode']").fill("600018");
		page.locator("input[name='addressLine2']").fill("Tondiarpet");
		page.locator("input[name='addressLine1']").fill("Appartments");
		page.locator("input[name='city']").fill("Chennai");
		page.selectOption(".OZuttk", "Tamil Nadu");
		page.locator("div[class='qsHXPi']").locator("nth=1").check();
		page.locator(".QqFHMw").click();
		
		//Entered Payment details and it navigates to cart page

	}
	
	//=========REMOVE PRODUCT FROM THE CART===========
	
		public static void delete_cart() {
		
		page.locator(".sBxzFz").click();
	}
	
	public static void main(String[] args) {
		
		Browser_launch();
		Product_search();
		add_to_cart();
		place_order();
		Reg_num();
		user_details();
		delete_cart();
	}

	
}
