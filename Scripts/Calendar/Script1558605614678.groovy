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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://staging.portal.twiga.tech/login')

WebUI.click(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/form_Remember meLog in Forgot password'))

WebUI.setText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/input_Please input your user number Min length is 4_user_no (4)'), 
    '0702')

WebUI.setText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/input_Remember me_user_no (4)'), '0702597429')

WebUI.setEncryptedText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/input_Please input your Password Min length is 4_password (4)'), 
    'uGm5FnNz+pk=')

WebUI.setEncryptedText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/input_Remember me_password (4)'), 'uGm5FnNz+pk=')

WebUI.click(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/input_Remember me_remember (2)'))

WebUI.click(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/button_Log in (4)'))

WebUI.click(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/a_Sourcing'))

WebUI.click(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/time_8'))

WebUI.click(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/time_23'))

WebUI.click(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/time_22'))

WebUI.click(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/time_3'))

WebUI.click(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/h2_0'))

WebUI.click(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/h2_0'))

WebUI.click(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/p_Logout (4)'))

WebUI.closeBrowser()

