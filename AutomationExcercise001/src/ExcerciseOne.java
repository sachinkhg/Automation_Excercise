import org.testng.Assert;
import org.testng.annotations.Test;

public class ExcerciseOne{
	
	String base_url = "https://www.amazon.in/";
	CommonClassMethods common_class = new CommonClassMethods();
	
	@Test
	public void primePageValidation() {
		//M1.S2.TC1
		//Step 1
		common_class.openBrowser(base_url);
		//Step 2
		common_class.clickAttribute("linkText", "Try Prime");
		Assert.assertEquals(common_class.getTitle(), 
				"Amazon.in: Amazon Prime");
		Assert.assertEquals(common_class.getText("id","a-autoid-0-announce"), 
				"Login to join Prime");//Prime Button id: //a-autoid-0-announce
		//Step 3
		common_class.clickAttribute("id", "a-autoid-0-announce");
		Assert.assertEquals(common_class.getTitle(), 
				"Amazon Sign In");
		//Step 4
		common_class.clickAttribute("id", "continue");//continue button id: continue
		Assert.assertEquals(common_class.getText("xpath","//*[@id=\"auth-email-missing-alert\"]/div/div"), 
				"Enter your email or mobile phone number");//Error Label xpath: //*[@id="auth-email-missing-alert"]/div/div
		//Step 5
		common_class.enterOnTextbox("id", "ap_email", "sachin@");
		//Step 6
		common_class.clickAttribute("id", "continue");//continue button id: continue
		Assert.assertEquals(common_class.getText("className","a-list-item"), 
				"We cannot find an account with that email address");//Error Label className: a-list-item
		//Step 7
		common_class.clearTextFromTexBox("id", "ap_email");
		//Step 8
		common_class.enterOnTextbox("id", "ap_email", "1234567");
		//Step 9
		common_class.clickAttribute("id", "continue");//continue button id: continue
		Assert.assertEquals(common_class.getText("className","a-list-item"), 
				"The phone number you entered cannot be used to sign in. Please check that the number you entered is correct or sign in with your email instead.");//Error Label className: a-list-item
		//Step 10
		common_class.clickAttribute("className", "a-link-nav-icon");//Amazon logo className: a-link-nav-icon
		Assert.assertEquals(common_class.getTitle(), 
				"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		
		
	}
}