package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.github.javafaker.Faker;

public class RandomUtility {

	public String createNewFakerUserName()
	{
		Faker faker = new Faker();
		String userName = faker.name().fullName();
		return userName;
	}
	
	public long createNewFakerPassword()
	{
		Faker faker = new Faker();
		long password = faker.number().randomNumber();
		return password;
	}
	
	public String createsubCategoryName()
	{
	Faker faker = new Faker();
	String subCategoryname = faker.food().spice();
	return subCategoryname;
	}
	
	public String createCategoryName()
	{
	Faker faker = new Faker();
	String Categoryname = faker.food().spice();
	return Categoryname;
	}


}