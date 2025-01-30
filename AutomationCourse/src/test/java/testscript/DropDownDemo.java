package testscript;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.Desktop.Action;
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
	/*public void multiSelect()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement dropdown=driver.findElement(By.xpath("//select[@id=\'single-input-field\']"));
		Select select=new Select(dropdown);
		select.selectByValue("Red");
		select.selectByVisibleText("Yellow");
		select.selectByIndex(2);
		select.isMultiple();
		boolean isDropdown=select is.multiple
		
		select.getOptions();
		List<WebElement> options=select.getOptions();
		int numberofOptions=options.size();
	}*/
	public void multiSelect() {
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement twoInputField = driver.findElement(By.xpath("//select[@id='multi-select-field']"));
		Select select = new Select(twoInputField);
		boolean isDropDownIsMultiSelect =select.isMultiple();//to check whether it is multi select
		select.selectByIndex(1);
		select.selectByIndex(2);
	}
	
	public void actionsClass()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement draggable1 = driver.findElement(By.xpath("//span[text() ='Draggable n°1']"));
		WebElement dottedBox = driver.findElement(By.xpath("//div[@id='mydropzone']"));
		Actions action=new Actions(driver);
		
		//actions.dragAndDrop=
		
		
		
		
	}
	
	public void hndlingFrames()
	{
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		WebElement jmeter = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		jmeter.click();
		
	}

	public static void main(String[] args)  {
		

		DropDownDemo dropdowndemo=new DropDownDemo();
		dropdowndemo.initialiseBrowser();
		dropdowndemo.verifyDropdown();
		dropdowndemo.dropdownMethods();
		dropdowndemo.multiSelect();
		dropdowndemo.browserQuit();

	}

}
