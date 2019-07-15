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

WebUI.navigateToUrl('https://portal.twiga.tech/login')

WebUI.setText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/input_Please input your user number Min length is 4_user_no (2)'), 
    '0702')

WebUI.setText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/input_Remember me_user_no (2)'), '0702597429')

WebUI.setEncryptedText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/input_Please input your Password Min length is 4_password (2)'), 
    'lHEPxxbz4rY=')

WebUI.setEncryptedText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/input_Remember me_password (2)'), 'lHEPxxbz4rY=')

WebUI.click(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/button_Log in (2)'))

WebUI.click(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/a_Sales'))

WebUI.setText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/input_Terms of Use_ant-input'), 'rongai ')

WebUI.sendKeys(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/input_Terms of Use_ant-input'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/p_Logout (2)'))

WebUI.closeBrowser()

