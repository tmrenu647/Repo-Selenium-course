package testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Table extends Base {

	public void elementPresentOrNot()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement element=driver.findElement(By.xpath("//div[@class=\"col-sm-12\"]//child::tbody//tr[td[text()='Ashton Cox']]"));
		
		List<WebElement> elementname=driver.findElements(By.xpath("//div[@class=\"col-sm-12\"]//child::tbody//tr[td[text()='Ashton Cox']]"));
		for(WebElement option:elementname)
		{
			
			String name=option.getText();
			if(name.equals("Ashton Cox Junior Technical Author San Francisco 66 2009/01/12 $86,000"))
			{
				System.out.println("Name is present");
				break;
			}
			else
			{
				System.out.println("Name is not present");
			}
		}
		/*String name=element.getText();
		System.out.println(name);
		if(name.equals("Ashton Cox Junior Technical Author San Francisco 66 2009/01/12 $86,000"))
		{
			System.out.println("Ashton Cox is presnet");
		}*/
	}
	public static void main(String[] args) {
		Table table=new Table();
		table.initialiseBrowser();
		table.elementPresentOrNot();
		table.browserQuit();


	}

}
