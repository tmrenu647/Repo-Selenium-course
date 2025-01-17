package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckboxAndRadioButton extends Base{
	
	/*Check box
	 -----------*/
	public void checkBox()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement checkBoxSelection = driver.findElement(By.xpath("//input[@id='gridCheck']"));
		checkBoxSelection.click();
		boolean isCheckBoxSelected=checkBoxSelection.isSelected();
	}
	
	
	/*Radio button
	---------------*/
	public void radioButton()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
	}
	public void verifyAbleToSelectMaleOption()
	{
		WebElement maleRadioButton = driver.findElement(By.xpath("//input[@id=\'inlineRadio1\']"));
        WebElement femaleRadioButton = driver.findElement(By.xpath("//input[@id=\'inlineRadio2\']"));
        WebElement showSelectedValueButton = driver.findElement(By.xpath("//button[@id=\'button-one\']")); 
        
        // Step 1: Verify initially both male and female options are unselected
        if (!maleRadioButton.isSelected() && !femaleRadioButton.isSelected()) {
            System.out.println("Initially, both Male and Female radio buttons are unselected.");
        } else {
            System.out.println("Initial state of radio buttons is incorrect.");
        }

        // Step 2: Click the "Male" radio button
        maleRadioButton.click();
        
        // Step 3: Verify "Male" option is selected after clicking
        if (maleRadioButton.isSelected()) {
            System.out.println("Male radio button is  selected.");
        } 
        else {
            System.out.println("Failed to select the Male radio button.");
        }

        // Step 4: Click the "Show Selected Value" button
        showSelectedValueButton.click();

        // Step 5: Verify the displayed message for the selected value
        WebElement displayedMessage = driver.findElement(By.xpath("//div[@id='message-one']")); 
        String messageText = displayedMessage.getText();
        if (messageText.contains("Male")) {
            System.out.println("The correct value is displayed: " + messageText);
        } else {
            System.out.println("Incorrect value displayed: " + messageText);
        }

	}

	public static void main(String[] args) {
		CheckboxAndRadioButton checkboxandradiobutton = new CheckboxAndRadioButton();
		checkboxandradiobutton.initialiseBrowser();
		checkboxandradiobutton.checkBox();
		checkboxandradiobutton.radioButton();
		checkboxandradiobutton.verifyAbleToSelectMaleOption();
		checkboxandradiobutton.browserQuit();
	}

}
