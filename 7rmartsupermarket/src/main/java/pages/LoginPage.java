package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{	
	public WebDriver driver;
	public LoginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	
	@FindBy(xpath = "//*[@id=\"login-form\"]/div/div/div[1]/input") WebElement userNameField;
	@FindBy(xpath = "//*[@id=\"login-form\"]/div/div/div[2]/input") WebElement passwordField;	
	@FindBy(xpath = "//button[@class='btn btn-dark btn-block']") WebElement loginButton;
	@FindBy(xpath = "/html/body/div/nav/ul[2]/li/a") WebElement tileIsAvailable;
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")  WebElement alertIsAvailable;
	public void enterUserNameOnUserNameField(String Username){
		userNameField.sendKeys(Username);
	}	
	public void enterPasswordOnPasswordField(String Password){
		passwordField.sendKeys(Password);
	}
	public void clickOnLoginButton(){
		loginButton.click(); 
	}
	public boolean isDashboardTileAvailable(){
        return tileIsAvailable.isDisplayed();
    }
    public boolean isAlertDisplayed() {
        return alertIsAvailable.isDisplayed();
	}
}
