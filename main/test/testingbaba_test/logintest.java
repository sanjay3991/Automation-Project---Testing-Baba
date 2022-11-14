package testingbaba_test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;


import baselibrary.Baselibrary;
import testingbaba_pages.loginpage;

public class logintest extends Baselibrary{
	
	loginpage ob;
	
	@BeforeTest
	public void getlaunchurltestingbaba() {
		
		getLaunchUrl("https://www.testingbaba.com/");
		ob=new loginpage();
	}
	 
	@Test(priority = 0)
	public void gettitle() {
		
		ob.gettitletestingbaba();
	}
	

}
