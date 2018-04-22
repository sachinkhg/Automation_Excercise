import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonClassMethods {
	WebDriver driver;
	WebElement element;
	Wait wait;
	Actions action;

	//Open browser in Firefox
	public void openBrowser(String base_url) {
		driver = new FirefoxDriver();
		driver.get(base_url);
	}
	
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public String getText(String locator_used, String locator_value) {
		String text = null;
		switch(locator_used){
			case("partialLinkText"): text = driver.findElement(By.partialLinkText(locator_value)).getText();break;
			case("cssSelector"): text = driver.findElement(By.cssSelector(locator_value)).getText();break;
			case("className"): text = driver.findElement(By.className(locator_value)).getText();break;
			case("linkText"): text = driver.findElement(By.linkText(locator_value)).getText();break;
			case("tagName"): text = driver.findElement(By.tagName(locator_value)).getText();break;
			case("xpath"): text = driver.findElement(By.xpath(locator_value)).getText();break;
			case("name"): text = driver.findElement(By.name(locator_value)).getText();break;
			case("id"): text = driver.findElement(By.id(locator_value)).getText();break;
		}
		return text;
	}
	
	
	//To click an attribute in Webpage
	public void clickAttribute(String locator_used, String locator_value) {
		switch(locator_used){
			case("partialLinkText"): driver.findElement(By.partialLinkText(locator_value)).click();break;
			case("cssSelector"): driver.findElement(By.cssSelector(locator_value)).click();break;
			case("className"): driver.findElement(By.className(locator_value)).click();break;
			case("linkText"): driver.findElement(By.linkText(locator_value)).click();break;
			case("tagName"): driver.findElement(By.tagName(locator_value)).click();break;
			case("xpath"): driver.findElement(By.xpath(locator_value)).click();break;
			case("name"): driver.findElement(By.name(locator_value)).click();break;
			case("id"): driver.findElement(By.id(locator_value)).click();break;	
		}
	}
	
	//To Enter Text in Textbox
	public void enterOnTextbox(String locator_used, String locator_value, String value_on_taxtbox) {
		switch(locator_used){
			case("partialLinkText"): driver.findElement(By.partialLinkText(locator_value)).sendKeys(value_on_taxtbox);break;
			case("cssSelector"): driver.findElement(By.cssSelector(locator_value)).sendKeys(value_on_taxtbox);break;
			case("className"): driver.findElement(By.className(locator_value)).sendKeys(value_on_taxtbox);break;
			case("linkText"): driver.findElement(By.linkText(locator_value)).sendKeys(value_on_taxtbox);break;
			case("tagName"): driver.findElement(By.tagName(locator_value)).sendKeys(value_on_taxtbox);break;
			case("xpath"): driver.findElement(By.xpath(locator_value)).sendKeys(value_on_taxtbox);break;
			case("name"): driver.findElement(By.name(locator_value)).sendKeys(value_on_taxtbox);break;
			case("id"): driver.findElement(By.id(locator_value)).sendKeys(value_on_taxtbox);break;	
		}
	}
	
	//To Clear Text from Textbox
	public void clearTextFromTexBox(String locator_used, String locator_value) {
		switch(locator_used){
			case("partialLinkText"): driver.findElement(By.partialLinkText(locator_value)).clear();break;
			case("cssSelector"): driver.findElement(By.cssSelector(locator_value)).clear();break;
			case("className"): driver.findElement(By.className(locator_value)).clear();break;
			case("linkText"): driver.findElement(By.linkText(locator_value)).clear();break;
			case("tagName"): driver.findElement(By.tagName(locator_value)).clear();break;
			case("xpath"): driver.findElement(By.xpath(locator_value)).clear();break;
			case("name"): driver.findElement(By.name(locator_value)).clear();break;
			case("id"): driver.findElement(By.id(locator_value)).clear();break;			
		}
	}
	
	public void mouseHoverAndClick(String parent_locator_used, String parent_locator_value
			, String child_locator_used, String child_locator_value) {
		action = new Actions(driver);
		WebElement parent_element = null;
		WebElement child_element = null;
		switch(parent_locator_used) {
			case("partialLinkText"): parent_element = driver.findElement(By.partialLinkText(parent_locator_value));break;
			case("cssSelector"): parent_element = driver.findElement(By.cssSelector(parent_locator_value));break;
			case("className"): parent_element = driver.findElement(By.className(parent_locator_value));break;
			case("linkText"): parent_element = driver.findElement(By.linkText(parent_locator_value));break;
			case("tagName"): parent_element = driver.findElement(By.tagName(parent_locator_value));break;
			case("xpath"): parent_element = driver.findElement(By.xpath(parent_locator_value));break;
			case("name"): parent_element = driver.findElement(By.name(parent_locator_value));break;
			case("id"): parent_element = driver.findElement(By.id(parent_locator_value));break;			
		}
		switch(child_locator_used) {
			case("partialLinkText"): child_element = driver.findElement(By.partialLinkText(child_locator_value));break;
			case("cssSelector"): child_element = driver.findElement(By.cssSelector(child_locator_value));break;
			case("className"): child_element = driver.findElement(By.className(child_locator_value));break;
			case("linkText"): child_element = driver.findElement(By.linkText(child_locator_value));break;
			case("tagName"): child_element = driver.findElement(By.tagName(child_locator_value));break;
			case("xpath"): child_element = driver.findElement(By.xpath(child_locator_value));break;
			case("name"): child_element = driver.findElement(By.name(child_locator_value));break;
			case("id"): child_element = driver.findElement(By.id(child_locator_value));break;			
		}
		action.moveToElement(parent_element).build().perform();
		 wait = new WebDriverWait(driver,20);
		 wait.until(ExpectedConditions.visibilityOf(child_element));
		 child_element.click();
	}
	
	public void doubleMouseHoverAndClick(String parent_locator_used, String parent_locator_value
			, String sub_parent_locator_used, String sub_parent_locator_value
			, String child_locator_used, String child_locator_value) {
		action = new Actions(driver);
		WebElement parent_element = null;
		WebElement child_element = null;
		WebElement sub_parent_element = null;
		switch(parent_locator_used) {
			case("partialLinkText"): parent_element = driver.findElement(By.partialLinkText(parent_locator_value));break;
			case("cssSelector"): parent_element = driver.findElement(By.cssSelector(parent_locator_value));break;
			case("className"): parent_element = driver.findElement(By.className(parent_locator_value));break;
			case("linkText"): parent_element = driver.findElement(By.linkText(parent_locator_value));break;
			case("tagName"): parent_element = driver.findElement(By.tagName(parent_locator_value));break;
			case("xpath"): parent_element = driver.findElement(By.xpath(parent_locator_value));break;
			case("name"): parent_element = driver.findElement(By.name(parent_locator_value));break;
			case("id"): parent_element = driver.findElement(By.id(parent_locator_value));break;			
		}
		switch(sub_parent_locator_used) {
			case("partialLinkText"): sub_parent_element = driver.findElement(By.partialLinkText(sub_parent_locator_value));break;
			case("cssSelector"): sub_parent_element = driver.findElement(By.cssSelector(sub_parent_locator_value));break;
			case("className"): sub_parent_element = driver.findElement(By.className(sub_parent_locator_value));break;
			case("linkText"): sub_parent_element = driver.findElement(By.linkText(sub_parent_locator_value));break;
			case("tagName"): sub_parent_element = driver.findElement(By.tagName(sub_parent_locator_value));break;
			case("xpath"): sub_parent_element = driver.findElement(By.xpath(sub_parent_locator_value));break;
			case("name"): sub_parent_element = driver.findElement(By.name(sub_parent_locator_value));break;
			case("id"): sub_parent_element = driver.findElement(By.id(sub_parent_locator_value));break;			
		}
		action.moveToElement(parent_element).build().perform();
		wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(sub_parent_element));
		action.moveToElement(sub_parent_element).build().perform();
		switch(child_locator_used) {
			case("partialLinkText"): child_element = driver.findElement(By.partialLinkText(child_locator_value));break;
			case("cssSelector"): child_element = driver.findElement(By.cssSelector(child_locator_value));break;
			case("className"): child_element = driver.findElement(By.className(child_locator_value));break;
			case("linkText"): child_element = driver.findElement(By.linkText(child_locator_value));break;
			case("tagName"): child_element = driver.findElement(By.tagName(child_locator_value));break;
			case("xpath"): child_element = driver.findElement(By.xpath(child_locator_value));break;
			case("name"): child_element = driver.findElement(By.name(child_locator_value));break;
			case("id"): child_element = driver.findElement(By.id(child_locator_value));break;			
		}
		wait.until(ExpectedConditions.visibilityOf(child_element));
		child_element.click();

	}
	
	public void takeScreenShot() {
			WebDriver augmentedDriver = new Augmenter().augment(driver);
	       File screenshot = ((TakesScreenshot)augmentedDriver).
	       getScreenshotAs(OutputType.FILE);
	       
			try {
				FileHandler.copy(screenshot, new File("Screenshot"
						+ new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date())
						+".png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
	}
	
}
