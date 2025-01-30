package testscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert extends Base {
	private static Base alert;


	public void alertsByClick()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement javaScriptAlertBoxClickme = driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		javaScriptAlertBoxClickme.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());//explicit wait
		
		String alertBoxTextVerifying = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		WebElement javaScriptConfirmBoxClickme = driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		javaScriptConfirmBoxClickme.click();
		//driver.switchTo().alert().accept();// this code is for ok button press
		driver.switchTo().alert().dismiss();// this codeis for cancel the alert screen
		WebElement javaScriptClickForPromptBox = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		javaScriptClickForPromptBox.click();
		driver.switchTo().alert().sendKeys("Renu"); //value entering in the alert box /////doubt
		driver.switchTo().alert().accept();
	}
	

	public static void main(String[] args) {
		
		Alert alert = new Alert();
		alert.initialiseBrowser();
		alert.alertsByClick();
		//alerts.browserQuit();

	}

}