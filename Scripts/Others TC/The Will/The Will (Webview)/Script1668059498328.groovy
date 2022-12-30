import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

response = WS.sendRequest(findTestObject('Others OR/The Will OR/The Will (Agent App)/Request URL', [('URL') : GlobalVariable.URL]))

def slurper = new groovy.json.JsonSlurper()

def result = slurper.parseText(response.getResponseBodyContent())

def value = result.authenticatedLink

GlobalVariable.URL = value

WebUI.openBrowser('')

WebUI.navigateToUrl(value)

WebUI.click(findTestObject('Object Repository/Others OR/The Will OR/The Will - Webview/Page_React App/button_Create Will'))

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/The Will OR/The Will - Webview/Page_React App/button_Submit'), 30)

WebUI.click(findTestObject('Object Repository/Others OR/The Will OR/The Will - Webview/Page_React App/button_Submit'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Others OR/The Will OR/The Will - Webview/Page_React App/button_Submit_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Others OR/The Will OR/The Will - Webview/Page_React App/div_Client Name cannot be empty'), 
    'Client Name cannot be empty')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Others OR/The Will OR/The Will - Webview/Page_React App/button_Back'))

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/The Will OR/The Will - Webview/Page_React App/b_Personal Detail'), 30)

WebUI.setText(findTestObject('Object Repository/Others OR/The Will OR/The Will - Webview/Page_React App/input__Clients Name'), 'Miko')

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/The Will OR/The Will - Webview/Page_React App/button_Submit'), 30)

WebUI.click(findTestObject('Object Repository/Others OR/The Will OR/The Will - Webview/Page_React App/button_Submit'))

WebUI.click(findTestObject('Object Repository/Others OR/The Will OR/The Will - Webview/Page_React App/button_Submit_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Others OR/The Will OR/The Will - Webview/Page_React App/div_Type of identity cannot be empty'), 
    'Type of identity cannot be empty')

WebUI.click(findTestObject('Object Repository/Others OR/The Will OR/The Will - Webview/Page_React App/button_Back'))

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/The Will OR/The Will - Webview/Page_React App/b_Personal Detail'), 30)

WebUI.click(findTestObject('Object Repository/Others OR/The Will OR/The Will - Webview/Page_React App/button_Select Type of Identity'))

'Make it random later (NRIC, Passport, Company No)'
WebUI.click(findTestObject('Object Repository/Others OR/The Will OR/The Will - Webview/Page_React App/button_NRIC'))

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/The Will OR/The Will - Webview/Page_React App/button_Submit'), 30)

WebUI.click(findTestObject('Object Repository/Others OR/The Will OR/The Will - Webview/Page_React App/button_Submit_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Others OR/The Will OR/The Will - Webview/Page_React App/div_Identity No cannot be empty'), 
    'Identity No cannot be empty')

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/The Will OR/The Will - Webview/Page_React App/b_Personal Detail'), 30)

WebUI.setText(findTestObject('Object Repository/Others OR/The Will OR/The Will - Webview/Page_React App/input__Identity Number'), '970562-14-9565')

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/The Will OR/The Will - Webview/Page_React App/button_Submit'), 30)

WebUI.click(findTestObject('Object Repository/Others OR/The Will OR/The Will - Webview/Page_React App/button_Submit_1'))

WebUI.navigateToUrl('https://sit-thewill.nextsix.com/theWill/signon/pgJLo3jEDviD7tXhHc1MIoPaHNdAebkwxb53z6uWjcJ179R03M8Dydr3id58I0xo')

