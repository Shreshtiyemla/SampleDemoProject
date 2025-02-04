package stepDefinations;

import internal.GlobalVariable;
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint;
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase;
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData;
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject;
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject;

import com.kms.katalon.core.annotation.Keyword;
import com.kms.katalon.core.checkpoint.Checkpoint;
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords;
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords;
import com.kms.katalon.core.model.FailureHandling;
import com.kms.katalon.core.testcase.TestCase;
import com.kms.katalon.core.testdata.TestData;
import com.kms.katalon.core.testobject.TestObject;
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords;
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords;
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	@Given("User opens Browser and navigates to URL")
	public void user_navigates_to_URL() {
		WebUiBuiltInKeywords.openBrowser("");
		WebUiBuiltInKeywords.navigateToUrl(GlobalVariable.BrowserURL.toString());
	}
	@When("User enters username and password")
	public void user_enters_username_Password() {
		WebUiBuiltInKeywords.setText(findTestObject("Object Repository/username"), GlobalVariable.Username.toString());
		WebUiBuiltInKeywords.setText(findTestObject("Object Repository/password"), GlobalVariable.Password.toString());
	}
	@Then("User clicks login and logged in successfully")
	public void user_clicks_login() {
		WebUiBuiltInKeywords.click(findTestObject("Object Repository/loginButton"));
		System.out.println("User logged in Successfully");
	}
}