package testscript;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//tstNg is a frame work and nextgeneration
public class Annotations {
	
	
	@Test(description="Test Case1",priority=1)
	public void testCase()
	{
		System.out.println("Test case");
	}
	
	@Test(description="Test Case2")
	public void testCase2()
	{
		System.out.println("Test case2");
	}
	
	@BeforeMethod// This will be execute before every @test annotation method
	public void beforeMethod()
{
	System.out.println("Before method");
}
	@AfterMethod        //This will be executed after every @test annotated method
	
	public void afterMethod()
	{
		System.out.println("After method");
	}
	
	
	@BeforeTest// This will be execute before  first tescase
	public void beforeTest()
{
	System.out.println("Before Test");
}
	@AfterTest     //executed after every testcase
	
	public void afterTest()
	{
		System.out.println("After Test");
	}
	
	
	
	@BeforeClass// it will be executed before before first  test case in the class
	public void beforeClass()
{
	System.out.println("Before Class");
}
	@AfterClass//it will be executed after every test case in the class
	
	public void afterClass()
	{
		System.out.println("After Class");
	}
	
	@BeforeSuite// it will be executed before the first run in your suite
	public void beforeSuite()
{
	System.out.println("Before Suite");
}
	@AfterSuite//after execution of all test and report generation
	
	public void afterSuite()
	{
		System.out.println("After Suite");
	}
	
	
	
}
