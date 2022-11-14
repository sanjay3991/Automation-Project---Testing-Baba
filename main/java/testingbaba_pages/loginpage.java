package testingbaba_pages;

import baselibrary.Baselibrary;

public class loginpage extends Baselibrary
{
	
	public void gettitletestingbaba() {
		
		
		String title=driver.getTitle();
		System.out.println("Testing baba title is"+title);
	}

}
