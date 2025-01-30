package testscript;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Assertion extends BaseTestNg{
	
	@Test(description="verifyTheBackgroundColorOfShowmessageButton")
	
	public void backGroundColor()
	{
		String expectedShowMessageButton = "rgba(0, 123, 255, 1)";

		WebElement showMessagebutton = driver.findElement(By.xpath("//button[@id='button-one']"));
		String actualBackgroundcolor=showMessagebutton.getCssValue("background-color");
		
		assertEquals(expectedShowMessageButton,actualBackgroundcolor,"Expected background color"+expectedShowMessageButton+"but it is"+actualBackgroundcolor);
	}
		
	@Test(description = "")
	public void verifyWheatherTheShowMessageButtonISAvailableInTheHomePage()
	{
		WebElement showMessagebutton = driver.findElement(By.xpath("//button[@id='button-one']"));
		boolean isShowMessageButtonDisplayed = showMessagebutton.isDisplayed();
		assertTrue(isShowMessageButtonDisplayed,"Show Message button is not available");
	}


	

}
