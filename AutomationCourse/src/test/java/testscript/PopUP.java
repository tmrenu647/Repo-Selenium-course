package testscript;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PopUP extends Base {
	public void handlingPOPUP()
	{
		driver.navigate().to("https://selenium.qabible.in/window-popup.php");
		WebElement popupFacebookLike = driver.findElement(By.xpath("//a[text()= '  Like us On Facebook ']"));
		popupFacebookLike.click();
		
		String mainWindow = driver.getWindowHandle();// used to identify the id of current or main window
		Set<String> popupWindow = driver.getWindowHandles();// which is used to fetch the id of all the opened windows
		Iterator<String> i1=popupWindow.iterator();
		while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();		
            		
            if(!mainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                 
                    // Switching to Child window
                    driver.switchTo().window(ChildWindow);
            		//WebElement navigateToFacebook = driver.findElement(By.xpath("//div[@class='x1xka2u1 xqfms19']//following::div[@aria-label='Accessible login button']")); 
                    WebElement navigateToFacebook = driver.findElement(By.xpath("(//span[text()='See more from Obsqura Zone | Kazhakuttam '])[1]"));
            }
        }
		
		driver.close();
		driver.switchTo().window(mainWindow);
	}

	public static void main(String[] args) {
		PopUP popup =new PopUP();
		popup.initialiseBrowser();
		popup.handlingPOPUP();
		//popup.browserQuit();

	}

}