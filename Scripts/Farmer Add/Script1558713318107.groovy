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

WebUI.setText(findTestObject('Object Repository/Page_Twiga Dashboard/input_Please input your user number Min length is 4_user_no (1)'), 
    '0702')

WebUI.setText(findTestObject('Object Repository/Page_Twiga Dashboard/input_Remember me_user_no (1)'), '0702597429')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Twiga Dashboard/input_Please input your Password Min length is 4_password (1)'), 
    'uGm5FnNz+pk=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Twiga Dashboard/input_Remember me_password (1)'), 'uGm5FnNz+pk=')

WebUI.click(findTestObject('Object Repository/Page_Twiga Dashboard/span_Remember me (1)'))

WebUI.click(findTestObject('Object Repository/Page_Twiga Dashboard/button_Log in (1)'))

WebUI.click(findTestObject('Object Repository/Page_Twiga Dashboard/a_Farmers'))

WebUI.click(findTestObject('Object Repository/Page_Twiga Dashboard/button_ Add Farmer'))

WebUI.setText(findTestObject('Object Repository/Page_Twiga Dashboard/input_First Name_first_name'), 'Claire ')

WebUI.setText(findTestObject('Page_Twiga Dashboard/input_Last Name_last_name'), 'Lashaun3')

WebUI.setText(findTestObject('Page_Twiga Dashboard/input_Uganda_phone_number'), '0793 507778')

WebUI.click(findTestObject('Object Repository/Page_Twiga Dashboard/button_Save Farmer'))

WebUI.closeBrowser()

