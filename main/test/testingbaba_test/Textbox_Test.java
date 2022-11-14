package testingbaba_test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;


import baselibrary.Baselibrary;
import testingbaba_pages.Textbox_page;


public class Textbox_Test extends Baselibrary{
	
	Textbox_page ob;
	
	@BeforeTest
	public void getlaunchurltestingbaba() {
		
		getLaunchUrl("https://www.testingbaba.com/");
		ob=new Textbox_page();
	}
	 
	@Test(priority = 0)
	public void clickonelements() {
		
		ob.clickonelements();
	}
	
	@Test(priority = 1)
	public void clickontextbox() {
		
		ob.clickontextbox();
	}
	
	@Test(priority = 2)
	public void filldetails() {
		
		ob.filldetails();
	}
	
	@Test(priority =3)
	public void getverify(){
		
		ob.getverify();
	}
	
}
