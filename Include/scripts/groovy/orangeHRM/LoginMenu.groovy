package orangeHRM
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

public class LoginMenu {
	@Given("User open the browser")
	public void user_open_the_browser() {
		println " User open the browser"
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')
	}

	@When("User enters (.*) and (.*) with valid credentials")
	public void user_enters_username_and_password_with_valid_credentials(String username, String password) {
		println " User enters username and password with valid credentials"
		WebUI.setText(findTestObject('project/OrangeHRM_Website/Login/input-textFieldUsername'), username)
		WebUI.setText(findTestObject('project/OrangeHRM_Website/Login/input-textFieldPassword'), password)
	}

	@And("User clicks on login button")
	public void user_clicks_on_login_button() {
		println " User clicks on login button"
		WebUI.click(findTestObject('project/OrangeHRM_Website/Login/btnLogin'))
	}

	@Then("User has successfully logged in to the website OrangeHRM")
	public void user_has_successfully_logged_in_to_the_website() {
		println " User has successfully logged in to the website OrangeHRM"
		WebUI.verifyElementText(findTestObject('project/OrangeHRM_Website/Home/h6_Dashboard'), 'Dashboard')
		WebUI.closeBrowser()
	}
}
