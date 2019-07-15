import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://portal.twiga.tech/login')

not_run: WebUI.navigateToUrl('https://staging.portal.twiga.tech/login')

WebUI.setText(findTestObject('Object Repository/Page_Twiga Dashboard/input_Remember me_user_no'), '0702597429')

WebUI.delay(3)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Twiga Dashboard/input_Please input your Password Min length is 4_password'), 
    'lHEPxxbz4rY=')

WebUI.delay(3)

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/Page_Twiga Dashboard/input_Remember me_password'), 'uGm5FnNz+pk=')

WebUI.click(findTestObject('Object Repository/Page_Twiga Dashboard/button_Log in'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Twiga Dashboard/p_Logout'))

not_run: WebUI.closeBrowser()

