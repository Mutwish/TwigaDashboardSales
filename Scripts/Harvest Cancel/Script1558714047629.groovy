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

WebUI.setText(findTestObject('Object Repository/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/input_Please input your user number Min length is 4_user_no'), 
    '0702')

WebUI.setText(findTestObject('Object Repository/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/input_Remember me_user_no'), 
    '0702597429')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/input_Please input your Password Min length is 4_password'), 
    'uGm5FnNz+pk=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/input_Remember me_password'), 
    'uGm5FnNz+pk=')

WebUI.click(findTestObject('Object Repository/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/span_Remember me'))

WebUI.click(findTestObject('Object Repository/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/a_Harvest'))

WebUI.click(findTestObject('Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/span_Ayub  Mutangili', 
        [('variable') : '']), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/button_Cancel this Harvest'))

WebUI.setText(findTestObject('Object Repository/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/textarea_K'), 
    'K')

WebUI.setText(findTestObject('Object Repository/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/textarea_Ka'), 
    'Ka')

WebUI.setText(findTestObject('Object Repository/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/textarea_Kat'), 
    'Kat')

WebUI.setText(findTestObject('Object Repository/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/textarea_Kata'), 
    'Kata')

WebUI.setText(findTestObject('Object Repository/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/textarea_Katal'), 
    'Katal')

WebUI.setText(findTestObject('Object Repository/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/textarea_Katalo'), 
    'Katalo')

WebUI.setText(findTestObject('Object Repository/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/textarea_Katalon'), 
    'Katalon')

WebUI.setText(findTestObject('Object Repository/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/textarea_Katalon_1'), 
    'Katalon ')

WebUI.setText(findTestObject('Object Repository/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/textarea_Katalon t'), 
    'Katalon t')

WebUI.setText(findTestObject('Object Repository/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/textarea_Katalon te'), 
    'Katalon te')

WebUI.setText(findTestObject('Object Repository/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/textarea_Katalon tes'), 
    'Katalon tes')

WebUI.setText(findTestObject('Object Repository/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/textarea_Katalon test'), 
    'Katalon test')

WebUI.click(findTestObject('Object Repository/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/Page_Twiga Dashboard/button_Cancel Harvest'))

WebUI.closeBrowser()

