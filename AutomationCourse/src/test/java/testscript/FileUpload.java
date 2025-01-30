package testscript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends Base {
	
	public void fileUploadUsingSendKeys()
	{
		driver.navigate().to("https://demo.guru99.com/test/upload");	
		WebElement ChooseFile=driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		ChooseFile.sendKeys("C:\\Users\\LENOVO\\OneDrive\\Desktop\\achan.pdf");
	}
	public void fileUploadUsingRobotClass() throws AWTException
	{
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement SelectPDFfile=driver.findElement(By.xpath("//a[@id='pickfiles']"));
		SelectPDFfile.click();
		StringSelection stringselection=new StringSelection("C:\\Users\\LENOVO\\OneDrive\\Desktop\\achan.pdf");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection,null);
		Robot robot = new Robot();  //used to handlekeyboard activities
		 robot.keyPress(KeyEvent.VK_ENTER);
	      //releasing enter
	      robot.keyRelease(KeyEvent.VK_ENTER);
	      robot.delay(90);
robot.keyPress(KeyEvent.VK_CONTROL);
	      robot.keyPress(KeyEvent.VK_V);//two
	     
	     
	      robot.keyRelease(KeyEvent.VK_CONTROL);//release command
	      robot.keyRelease(KeyEvent.VK_V);
	      robot.keyPress(KeyEvent.VK_ENTER);
	     
	     // r.delay(90);
	      robot.keyRelease(KeyEvent.VK_ENTER);
	      robot.delay(50);
	}

	public static void main(String[] args) {
		
		FileUpload fileupload = new FileUpload();
		fileupload.initialiseBrowser();
		
		try {
			fileupload.fileUploadUsingRobotClass();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		fileupload.browserQuit();
		
	}

}
