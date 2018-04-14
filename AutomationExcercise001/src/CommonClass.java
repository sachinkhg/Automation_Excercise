import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonClass {
	WebDriver driver;
	WebElement element;
	
	//Open browser in Firefox
	public void openBrowser(String base_url) {
		driver = new FirefoxDriver();
		driver.get(base_url);
	}
	
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public String getText(String locator_name, String locator_value) {
		String text = null;
		switch(locator_name){
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
	public void clickAttribute(String locator_name, String locator_value) {
		switch(locator_name){
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
	public void enterOnTextbox(String locator_name, String locator_value, String value_on_taxtbox) {
		switch(locator_name){
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
	public void clearTextFromTexBox(String locator_name, String locator_value) {
		switch(locator_name){
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
}
