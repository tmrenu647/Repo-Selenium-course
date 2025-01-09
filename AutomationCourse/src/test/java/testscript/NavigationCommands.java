package testscript;

public class NavigationCommands extends Base  {
	public void commands()
	{
		driver.navigate().to("https://www.google.co.in");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

	public static void main(String[] args) {
		NavigationCommands navigationcommands=new NavigationCommands();
		navigationcommands.initialiseBrowser();
		navigationcommands.commands();
		navigationcommands.browserQuit();
		
		
	}

}
