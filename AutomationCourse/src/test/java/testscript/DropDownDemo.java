package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo extends Base {
	
	public void verifyDropdown()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php"); // Navigate to the dropdown demo page
		WebElement dropdown=driver.findElement(By.xpath("//select[@id=\'single-input-field\']"));
		Select select=new Select(dropdown); // Locate the dropdown element
		select.selectByValue("Red"); // Select by value
		select.selectByVisibleText("Yellow"); // Select by VisibleText
		select.selectByIndex(2);//Select by Index
		
	}

	public static void main(String[] args)  {
		

		DropDownDemo dropdowndemo=new DropDownDemo();
		dropdowndemo.initialiseBrowser();
		dropdowndemo.verifyDropdown();
		dropdowndemo.browserQuit();

	}

}
