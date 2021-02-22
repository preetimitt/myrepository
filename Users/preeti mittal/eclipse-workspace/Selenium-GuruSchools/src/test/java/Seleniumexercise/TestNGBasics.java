package Seleniumexercise;


	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	
	public class TestNGBasics {

	
	//Pre-condition
	@BeforeSuite
	public void setUp()
	{	
		System.out.println("Set up system property");
	}
	
	@BeforeTest
	public void launchBrowser()
	{
		System.out.println("Launch the Browser");
	}
	@BeforeClass
	public void enterURL()
	{	
		System.out.println("enter url");
	}
	@BeforeMethod
	public void login()
	{	
		System.out.println("Login");
	}
	
	//Test cases
		@Test(priority=1)
		public void googleTitleTest()
		{	
			System.out.println("google title test");
		}
		@Test(priority=2)
		public void searchTest()
		{	
			System.out.println("search test");
		}
		
		@Test(priority=3)
		public void googlelogoTest()
		{	
			System.out.println("google logo test");
		}
		//Post-conditions
		
		@AfterMethod
		public void logout()
		{
			System.out.println("Logout from the app");
		}
		
		
		@AfterClass
		public void closeBrowser()
		{
			System.out.println("Close Browser");
		}
		
		@AfterTest
		public void deleteAllCookies()
		{
			System.out.println("Delete all cookies");
		}
		@AfterSuite
		public void generateTestReport()
		{
			System.out.println("Generate Report");
		}
		
	}
	

