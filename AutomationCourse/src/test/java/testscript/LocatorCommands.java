package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocatorCommands extends Base {
	public void Locators()
	{
		WebElement showMessageButton=driver.findElement(By.id("button-one"));//To identify webelement(find element), By means locator
		//take unique value(mostly id)
		WebElement classNameSample=driver.findElement(By.className("clearfix"));
		WebElement nameSample=driver.findElement(By.name("viewport"));	
		WebElement linkTextSample=driver.findElement(By.linkText("Simple Form Demo"));
		WebElement partiallLinkTextSample=driver.findElement(By.partialLinkText("Simple Form"));
		
		WebElement enterMessage=driver.findElement(By.id("single-input-field"));
		WebElement enterValueA=driver.findElement(By.id("value-a"));
		WebElement grandTotalButton=driver.findElement(By.id("button-two"));
		
		//WebElement containerPage=driver.findElement(By.className("col-lg-3 col-md-3 col-sm-12 col-xs-12"));
		WebElement obsquraLogo=driver.findElement(By.className("top-logo"));
		WebElement copyRightLabel=driver.findElement(By.className("copyright"));
		
		//WebElement linkTextSample1=driver.findElement(By.linkText("Input Form"));
		WebElement linkTextSample2=driver.findElement(By.linkText("Select Input"));
		WebElement linkTextSample3=driver.findElement(By.linkText("Simple Form Demo"));
		WebElement linkTextSample4=driver.findElement(By.linkText("Form Submit"));
		
		WebElement partiallLinkTextSample1=driver.findElement(By.partialLinkText("Input"));
		WebElement partiallLinkTextSample2=driver.findElement(By.partialLinkText("Simple"));
		WebElement partiallLinkTextSample3=driver.findElement(By.partialLinkText("Select"));
		
		
		
		WebElement classNameNew=driver.findElement(By.cssSelector(".clearfix"));
		WebElement classNameNew2=driver.findElement(By.cssSelector("section.clearfix"));
		WebElement classNameNew3=driver.findElement(By.cssSelector("button#button-one"));	
		WebElement classNameNew4=driver.findElement(By.cssSelector("link[href='css/main.css']"));
		
		WebElement tagnameSample=driver.findElement(By.tagName("div"));
		
		WebElement xpathSample1=driver.findElement(By.xpath("//button[@id='button-one']"));
		WebElement xpathSample2=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		WebElement xpathSample3=driver.findElement(By.xpath("//input[@id='value-a']"));
		WebElement xpathSample4=driver.findElement(By.xpath("//a[@id='others']"));
		WebElement xpathSample5=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		WebElement xpathSample6=driver.findElement(By.xpath("//button[@id='button-two']"));
		
		WebElement xpathSample7=driver.findElement(By.xpath("//button[contains(@id,'button-o')]"));
		WebElement xpathSample8=driver.findElement(By.xpath("//button[starts-with(@id,'button-o')]"));
		WebElement xpathSample9=driver.findElement(By.xpath("//button[text()='Show Message']"));
		//button[contains(text(),'Show Message')]
		WebElement xpathSample10=driver.findElement(By.xpath("//button[text()='Show Message'and @id=\"button-one\"]"));
		WebElement xpathSample11=driver.findElement(By.xpath("//button[text()='Show Message' or @id=\"button-three\"]"));
		
		WebElement xpathSample12 = driver.findElement(By.xpath("//button[@id='button-one']//parent::form"));
		WebElement xpathSample13 = driver.findElement(By.xpath("//section[@class='clearfix']//child::div[@class='container page']"));
		WebElement xpathSample14=driver.findElement(By.xpath("//button[@id='button-one']//following::div[@id='message-one']"));
		WebElement xpathSample15=driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class=\'header-top\']"));
		WebElement xpathSample16=driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div[@class=\'container page\']"));
		WebElement xpathSample17=driver.findElement(By.xpath("//button[@id='button-one']//following-sibling::div"));
		
		
	}
	
	public void singleInputField()
	{
		
	}

	public static void main(String[] args) {
		LocatorCommands webelementcommands=new LocatorCommands();
		webelementcommands.initialiseBrowser();
		webelementcommands.Locators();
		webelementcommands.browserQuit();
		

	}

}
