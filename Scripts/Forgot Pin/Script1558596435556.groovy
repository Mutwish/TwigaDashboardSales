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

WebUI.click(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/div_Login belowRemember meLog in Forgot password'))

WebUI.setText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/input_Please input your user number Min length is 4_user_no (3)'), 
    '0702')

WebUI.setText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/input_Remember me_user_no (3)'), '0702597429')

WebUI.setEncryptedText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/input_Please input your Password Min length is 4_password (3)'), 
    '4nvbrPglk7k=')

WebUI.setEncryptedText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/input_Remember me_password (3)'), '4nvbrPglk7k=')

WebUI.click(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/button_Log in (3)'))

WebUI.click(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/a_Forgot password'))

WebUI.setText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/input_Phone Number_user_or_phone_no'), '0702597429')

WebUI.click(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/button_Reset'))

WebUI.click(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/a_Login'))

WebUI.setText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/input_Please input your user number Min length is 4_user_no (3)'), 
    '0702')

WebUI.setText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/input_Remember me_user_no (3)'), '0702597429')

WebUI.setEncryptedText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/input_Please input your Password Min length is 4_password (3)'), 
    'uGm5FnNz+pk=')

WebUI.setEncryptedText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/input_Remember me_password (3)'), 'uGm5FnNz+pk=')

WebUI.click(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/input_Remember me_remember (1)'))

WebUI.click(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/button_Log in (3)'))

WebUI.click(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/p_Logout (3)'))

WebUI.closeBrowser()

WebUI.setText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/input_Phone Number_user_or_phone_no'), '0702597429')

