package testscript;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class DropDownDemo extends Base {
	
	public void verifyDropdown()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php"); // Navigate to the dropdown demo page
		WebElement dropdown=driver.findElement(By.xpath("//select[@id=\'single-input-field\']"));
		Select select=new Select(dropdown); // Locate the dropdown element
		select.selectByValue("Red"); // Select by value
		select.selectByVisibleText("Yellow"); // Select by VisibleText
		select.selectByIndex(2);//Select by Index
		
		select.getOptions();
		List<WebElement> options=select.getOptions();
		int numberofOptions=options.size();
	}
	public void dropdownMethods()
	{
		driver.navigate().to("https://www.selenium.dev/");
		WebElement element=driver.findElement(By.xpath("//a[@href='/pt-br/']//ancestor::div[@class=\'dropdown\']"));
		element.click();
		
		WebElement uIDropdown=driver.findElement(By.xpath("//div[@class='dropdown']//child::a[@class=\"dropdown-item\"]"));		
		uIDropdown.click();
		
		List<WebElement> dropdownOptions=driver.findElements(By.xpath("//div[@class='dropdown']//child::a[@class=\"dropdown-item\"]"));
		for(WebElement option:dropdownOptions)
		{
			String language=option.getText();
			if(language.equals("Português (Brasileiro)"))
			{
				option.click();
				break;
			}
		}
		
	
	}

	public static void main(String[] args)  {
		

		DropDownDemo dropdowndemo=new DropDownDemo();
		dropdowndemo.initialiseBrowser();
		dropdowndemo.verifyDropdown();
		dropdowndemo.dropdownMethods();
		dropdowndemo.browserQuit();

	}

}
