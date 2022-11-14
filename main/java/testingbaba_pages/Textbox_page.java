package testingbaba_pages;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.testng.reporters.EmailableReporter;

import baselibrary.Baselibrary;
import excelutility.ExcelUtility;

public class Textbox_page extends Baselibrary
{

	public Textbox_page() {
		PageFactory.initElements(driver,this);
	}
	
	String path="C:\\Users\\91639\\eclipse-workspace1\\NewAutomation_test_NG\\testdata\\testdata_first.xlsx";
	
	@FindBy(xpath = "//*[@data-target=\"#elements\"]")
	private WebElement elements;
	
	@FindBy(xpath = "//*[text()='text box']")
	private WebElement textbox;
	
	@FindBy(xpath = "//*[@id=\"fullname1\"]")
	private WebElement fullname;
	
	@FindBy(xpath = "//*[@id=\"fullemail1\"]")
	private WebElement fullemail;
	
	@FindBy(xpath = "//*[@id=\"fulladdresh1\"]")
	private WebElement fulladdress;
	
	@FindBy(xpath = "//*[@id=\"paddresh1\"]")
	private WebElement permanantaddress;
	
	@FindBy(xpath = "//*[@id=\"tab_1\"]/div/div[1]/form/input[3]")
	private WebElement submit;
	
	
	@FindBy(xpath = "//*[@id=\"tab_1\"]/div/div[2]/label")
	private List<WebElement> actualelements;
	
	public void clickonelements() {
		
		elements.click();
	}
	
	public void clickontextbox() {
		
		textbox.click();
	}
	
	public void filldetails() {
		
		fullname.sendKeys(ExcelUtility.getReaddata(path, 1, 0));
		fullemail.sendKeys(ExcelUtility.getReaddata(path, 1, 1));
		fulladdress.sendKeys(ExcelUtility.getReaddata(path, 1, 2));
		permanantaddress.sendKeys(ExcelUtility.getReaddata(path, 1, 3));
		submit.click();	
	}
	public void getverify() {
		ArrayList<String> actual=new ArrayList<String>();
		ArrayList<String> expected=new ArrayList<String>();
		
		
		for(int i=1;i<actualelements.size();i++) {
			
			actual.add(actualelements.get(i).getText());
			i++;
		}
		
		expected.add(ExcelUtility.getReaddata(path, 1, 0));
		expected.add(ExcelUtility.getReaddata(path, 1, 1));
		expected.add(ExcelUtility.getReaddata(path, 1, 2));
		expected.add(ExcelUtility.getReaddata(path, 1, 3));
		SoftAssert assertt=new SoftAssert();
		for(int i=0;i<=actual.size()-1;i++) {
			
			assertt.assertEquals(actual.get(i), expected.get(i));
		}
		assertt.assertAll();
	}
}
