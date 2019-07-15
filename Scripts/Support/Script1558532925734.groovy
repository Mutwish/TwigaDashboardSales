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

WebUI.setText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/input_Please input your user number Min length is 4_user_no (1)'), 
    '0702')

WebUI.setText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/input_Remember me_user_no (1)'), '0702597429 ')

WebUI.setEncryptedText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/input_Please input your Password Min length is 4_password (1)'), 
    'uGm5FnNz+pk=')

WebUI.setEncryptedText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/input_Remember me_password (1)'), 'uGm5FnNz+pk=')

WebUI.click(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/span_Remember me'))

WebUI.click(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/button_Log in (1)'))

WebUI.click(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/button_Support'))

WebUI.setText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/textarea_How can we help you_description'), 'K')

WebUI.setText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/textarea_K'), 'Ka')

WebUI.setText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/textarea_Ka'), 'Kat')

WebUI.setText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/textarea_Kat'), 'Kata')

WebUI.setText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/textarea_Kata'), 'Katal')

WebUI.setText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/textarea_Katal'), 'Katalo')

WebUI.setText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/textarea_Katalo'), 'Katalom')

WebUI.setText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/textarea_Katalom'), 'Katalom ')

WebUI.setText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/textarea_Katalom_1'), 'Katalom')

WebUI.setText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/textarea_Katalom'), 'Katalo')

WebUI.setText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/textarea_Katalo'), 'Katal')

WebUI.setText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/textarea_Katal'), 'Kataln')

WebUI.setText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/textarea_Kataln'), 'Kataln ')

WebUI.setText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/textarea_Kataln_1'), 'Kataln')

WebUI.setText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/textarea_Kataln'), 'Katal')

WebUI.setText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/textarea_Katal'), 'Katalo')

WebUI.setText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/textarea_Katalo'), 'Katalon')

WebUI.setText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/textarea_Katalon'), 'Katalon ')

WebUI.setText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/textarea_Katalon_1'), 'Katalon s')

WebUI.setText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/textarea_Katalon s'), 'Katalon su')

WebUI.setText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/textarea_Katalon su'), 'Katalon sup')

WebUI.setText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/textarea_Katalon sup'), 'Katalon supp')

WebUI.setText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/textarea_Katalon supp'), 'Katalon suppo')

WebUI.setText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/textarea_Katalon suppo'), 'Katalon suppot')

WebUI.setText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/textarea_Katalon suppot'), 'Katalon suppo')

WebUI.setText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/textarea_Katalon suppo'), 'Katalon supp')

WebUI.setText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/textarea_Katalon supp'), 'Katalon suppr')

WebUI.setText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/textarea_Katalon suppr'), 'Katalon supp')

WebUI.setText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/textarea_Katalon supp'), 'Katalon suppp')

WebUI.setText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/textarea_Katalon suppp'), 'Katalon supp')

WebUI.setText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/textarea_Katalon supp'), 'Katalon suppo')

WebUI.setText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/textarea_Katalon suppo'), 'Katalon suppor')

WebUI.setText(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/textarea_Katalon suppor'), 'Katalon support')

WebUI.click(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/div_Add up to 5 files'))

WebUI.click(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/button_Send'))

WebUI.click(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/button_Done'))

WebUI.click(findTestObject('Object Repository/TWIGA/Page_Twiga Dashboard/p_Logout (1)'))

WebUI.closeBrowser()

