package testscript;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion extends BaseTestNg{
	
	@Test(description="verifyTheBackgroundColorOfShowmessageButton")
	
	public void backGroundColor()
	{
		String expectedShowMessageButton = "rgba(0, 123, 255, 1)";

		WebElement showMessagebutton = driver.findElement(By.xpath("//button[@id='button-one']"));
		String actualBackgroundcolor=showMessagebutton.getCssValue("background-color");
		
		assertEquals(expectedShowMessageButton,actualBackgroundcolor,"Expected background color"+expectedShowMessageButton+"but it is"+actualBackgroundcolor);
	}
		
	@Test(description = "TheShowMessageButtonISAvailableInTheHomePage")
	public void verifyWheatherTheShowMessageButtonISAvailableInTheHomePage()
	{
		WebElement showMessagebutton = driver.findElement(By.xpath("//button[@id='button-one']"));
		boolean isShowMessageButtonDisplayed = showMessagebutton.isDisplayed();
		assertTrue(isShowMessageButtonDisplayed,"Show Message button is not available");
	}

	@Test(description = "verifySingleInputField")
	public void verifySingleInputField()
	{
		String value = "Your Message :";
        String input = "hello";
        String expectedMessage = value + " " + input; // Dynamically create expected message
        WebElement singleInputField = driver.findElement(By.xpath("//input[@id='single-input-field']"));
        singleInputField.sendKeys(input);
        WebElement showMessage = driver.findElement(By.xpath("//button[@id='button-one']"));
        showMessage.click();
      
        WebElement yourMessage = driver.findElement(By.xpath("//div[@id='message-one']"));

        String yourMessageText = yourMessage.getText(); // Get message to compare
        
        
        
        
        assertEquals(expectedMessage,yourMessageText,"Expected test message is"+expectedMessage + "But it is " +yourMessageText);



	}
	
		@Test(description ="Verify user is able to click on the male radio button")
		public void verifyUserIsAbleToSelectMaleOption()
		{

		WebElement radioButtonpage=driver.findElement(By.xpath("//a[@href='radio-button-demo.php']"));
		radioButtonpage.click();
		WebElement maleRadioButton = driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		 
		boolean isMaleButtonDisplayed = maleRadioButton.isDisplayed();
		assertTrue(isMaleButtonDisplayed,"User can't able to click the male radio button");

		boolean flag=false;
		assertFalse(flag,"Expected message is true but it is false");
        
        int a=5,b=4;
        assertNotEquals(a,b,"a and b are equal");
        
        String str=null;
        assertNull(str,"str is not null");
        
        String s="Renu";
        assertNotNull(s,"s is null");

	}
		@Test()
		public void softAssert() 
		{

		SoftAssert softassert=new SoftAssert();
		boolean flag=true;

		softassert.assertFalse(flag,"Expected message is true but it is false");

		int a=5;
		int b=4;
		softassert.assertNotEquals(a, b,"A and B are equals");

		String str=null;
		softassert.assertNull(str,"str is not null");
		softassert.assertAll();
		}
}
	
