package testscript;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Table extends Base {

	public void elementPresentOrNot()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement element=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
		
		  // Create an empty list to store elements
        /*List<WebElement> allElements = new ArrayList<>();

        // Find and add specific elements to the list
        WebElement element1 = driver.findElement(By.id("element1"));
        WebElement element2 = driver.findElement(By.id("element2"));
        allElements.add(element1);
        allElements.add(element2);*/
		
		//List<WebElement> allElements=driver.findElement(By.name("viewport"));	
		

		List<WebElement> elementname=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
		for(WebElement option:elementname)
		{
			
			String name=option.getText();
			if(name.equals("Cedric Kelly"))
			{
				System.out.println("Name is present");
				break;
			}
			else
			{
				System.out.println("Name is not present");
			}
		}
		
	}
	
	public void VerifyTableHeader()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
				
		// Locate all table header elements
	    List<WebElement> headerElements = driver.findElements(By.xpath("//table[@id='dtBasicExample']//thead//tr//th"));
		

	    // Expected header texts (update this based on the actual table headers on the website)
	    List<String> expectedHeaders = List.of("Name", "Position", "Office", "Age", "Start date", "Salary");

	    // Verify if all expected headers are present
	    for (String expectedHeader : expectedHeaders) {
	        boolean headerFound = false;

	        for (WebElement headerElement : headerElements) {
	            if (headerElement.getText().equals(expectedHeader)) {
	                headerFound = true;
	                System.out.println(expectedHeader + " is present.");
	                break;
	            }
	        }

	        if (!headerFound) {
	            System.out.println(expectedHeader + " is NOT present.");
	        }
	    }
	}
		
		/*public void VerifyTableHeader()
		{
			driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
			WebElement header=driver.findElement(By.xpath("//table[@id=\"dtBasicExample\"]//thead//tr//th"));
			
			//List<WebElement> allElements = driver.findElements(By.name("Name","Position","Office","Age","Start date","Salary"));
			
			List<WebElement> allElements = new ArrayList<>();
			List<WebElement> elementsByName = driver.findElements(By.name("Name"));
	        List<WebElement> elementsByPosition = driver.findElements(By.name("Position"));
	        List<WebElement> elementsByOffice = driver.findElements(By.name("Office"));
	        List<WebElement> elementsByAge = driver.findElements(By.name("Age"));
	        List<WebElement> elementsByStartdate = driver.findElements(By.name("Start date"));
	        List<WebElement> elementsBySalary = driver.findElements(By.name("Salary"));
	        
	        allElements.addAll(elementsByName);
	        allElements.addAll(elementsByPosition);
	        allElements.addAll(elementsByOffice);
	        allElements.addAll(elementsByAge);
	        allElements.addAll(elementsByStartdate);
	        allElements.addAll(elementsBySalary);


			
			List<WebElement> headerelements=driver.findElements(By.xpath("//table[@id=\"dtBasicExample\"]//thead//tr//th"));
			for(WebElement option:headerelements)
			{
				String headerelement=option.getText();
			
				for(WebElement option1:allElements)
				{
				String Storedvalue=option1.getText();
		
				if(headerelement.equals(Storedvalue))
				{
					System.out.println(headerelement+"present");
				}
				else {
				System.out.println("Header not present");
				break;
				}
				
			}
		}
		}*/
	
	public static void main(String[] args) {
		Table table=new Table();
		table.initialiseBrowser();
		table.elementPresentOrNot();
		table.VerifyTableHeader();
		table.browserQuit();


	}

}
