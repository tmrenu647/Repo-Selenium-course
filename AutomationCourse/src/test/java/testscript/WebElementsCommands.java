package testscript;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementsCommands extends Base {
	
	
   
	
	public void webElementCommand()
	{
		String expectedBackGroundColor = "rgba(0, 123, 255, 1)";
		
		
		/*//WebElement singleInputField = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		//singleInputField.sendKeys("hello");
		//singleInputField.clear();
		//
		//showMessage.click();
		
		
		boolean isShowMessageButtonEnabled =showMessage.isEnabled();
		boolean isShowMessageIsDiplsayed=showMessage.isDisplayed();
		//WebElement yourMessage = driver.findElement(By.xpath("//div[@id='message-one']"));
		
		//String yourMessageText = yourMessage.getText(); // compare,get message to compare*/
		
		WebElement showMessage =driver.findElement(By.xpath("//button[@id='button-one']"));
		String attribute =showMessage.getAttribute("type");
		String attribute2 =showMessage.getAttribute("class");
		String attribute3 =showMessage.getAttribute("id");
		//String attribute4 =singleInputField.getAttribute("class");
		//String attribute5 =yourMessage.getAttribute("class");
		String backgroundColor =showMessage.getCssValue("background-color");
		String tagname = showMessage.getTagName();
	}
		
		public void backGroundColor()
		{
			String expectedShowMessageButton = "rgba(0, 123, 255, 1)";

			WebElement showMessagebutton = driver.findElement(By.xpath("//button[@id='button-one']"));
			String actualBackgroundcolor=showMessagebutton.getCssValue("background-color");
			if(actualBackgroundcolor.equals(expectedShowMessageButton))
			{
				System.out.println("Matches");
			}
			else
			{
				System.out.println("Doesn't Matches");
			}
		}
		
		public void borderColor()
		{
			String expectedBorderColor = "rgb(0, 123, 255)";
			WebElement showMessagebutton = driver.findElement(By.xpath("//button[@id='button-one']"));
			String actualBorderColor = showMessagebutton.getCssValue("border-color");
			if(actualBorderColor.equals(expectedBorderColor))
			{
				System.out.println("Matches");
		
			}
			else
			{
				System.out.println("Doesn't Matches");
			}
			
		}
		
		public void fontWeight()
		{
			String expectedFontWeight = "400";
			WebElement showMessagebutton = driver.findElement(By.xpath("//button[@id='button-one']"));
			String actualFontWeight = showMessagebutton.getCssValue("font-weight");
			if(expectedFontWeight.equals(actualFontWeight))
			{
				System.out.println("Matches");
		
			}
			else
			{
				System.out.println("Doesn't Matches");
			}
			
		
		
		
	}
	
    public void verifySingleInputField() {
    	
    	String value = "Your Message :";
        String input = "hello";
        String expectedMessage = value + " " + input; // Dynamically create expected message
        WebElement singleInputField = driver.findElement(By.xpath("//input[@id='single-input-field']"));
        singleInputField.sendKeys(input);
        WebElement showMessage = driver.findElement(By.xpath("//button[@id='button-one']"));
        //showMessage.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));// syntax of explicit
		wait.until(ExpectedConditions.elementToBeClickable(showMessage));//same this is also for syntax complete


        JavascriptExecutor js=(JavascriptExecutor)driver;
        
        //Scroll
        js.executeScript("window.scrollBy(0,200)","");//up
        js.executeScript("window.scrollBy(0,-200)","");//down
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)","");
        WebElement yourMessage = driver.findElement(By.xpath("//div[@id='message-one']"));

        String yourMessageText = yourMessage.getText(); // Get message to compare
       

        if (yourMessageText.equals(expectedMessage)) {
            System.out.println("Test Pass");
        } else {
            System.out.println("Test Fail");
        }
    }

    public void verifyTwoInputField() {
    	String A = "10", B = "20";
        WebElement ValueA = driver.findElement(By.xpath("//input[@id='value-a']"));
        WebElement ValueB = driver.findElement(By.xpath("//input[@id='value-b']"));
        int expectedTotal = Integer.parseInt(A) + Integer.parseInt(B); // Calculate expected total
        String expectedMessage = "Total A + B : " + expectedTotal;

        ValueA.sendKeys(A);
        ValueB.sendKeys(B);

        WebElement GetTotal = driver.findElement(By.xpath("//button[@id='button-two']"));
        
        Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(3))
                .ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.elementToBeClickable(GetTotal));

        GetTotal.click();

        WebElement Total = driver.findElement(By.xpath("//div[@id='message-two']"));

        String totalMessageText = Total.getText(); // Get message to compare
        
        if (totalMessageText.equals(expectedMessage)) {
            System.out.println("Test Pass");
        } else {
            System.out.println("Test Fail");
        }
	}
	

		
		
	
	public static void main(String[] args) {
		WebElementsCommands webelementscommands = new WebElementsCommands();
		webelementscommands.initialiseBrowser();
		webelementscommands.webElementCommand();
		webelementscommands.verifySingleInputField();
		webelementscommands.verifyTwoInputField();
		
		webelementscommands.browserQuit();
	}

}
