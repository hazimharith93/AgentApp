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

/**
WebUI.openBrowser('')

WebUI.navigateToUrl('http://sit-agent.iproforma.com/')

WebUI.setText(findTestObject('Object Repository/Iprofroma (Developer Sales Form)/Page_iProforma (SIT)/input_Username_username'), 
    'ecard4')

WebUI.setEncryptedText(findTestObject('Object Repository/Iprofroma (Developer Sales Form)/Page_iProforma (SIT)/input_Password_password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Iprofroma (Developer Sales Form)/Page_iProforma (SIT)/button_LOG IN'))

WebUI.click(findTestObject('Object Repository/Iprofroma (Developer Sales Form)/Page_iProforma (SIT)/svg'))

WebUI.click(findTestObject('Object Repository/Iprofroma (Developer Sales Form)/Page_iProforma (SIT)/div_Developer Sales Form'))

WebUI.click(findTestObject('Object Repository/Iprofroma (Developer Sales Form)/Page_iProforma (SIT)/button_New Developer Sales Form'))

WebUI.click(findTestObject('Object Repository/Iprofroma (Developer Sales Form)/Page_iProforma (SIT)/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Iprofroma (Developer Sales Form)/Page_iProforma (SIT)/div_Project Name is required'), 
    'Project Name is required')

WebUI.setText(findTestObject('Page_iProforma (SIT)/input__DeveloperSalesProjectName'), 'Sandilands Project')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Iprofroma (Developer Sales Form)/Page_iProforma (SIT)/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Iprofroma (Developer Sales Form)/Page_iProforma (SIT)/div_Property Address is required'), 
    'Property Address is required')

WebUI.setText(findTestObject('Page_iProforma (SIT)/input__DeveloperSalesPropertyAddress'), 'Sandiland, Gat Lebuh Sandilands, Georgetown, 10300 George Town, Penang')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Iprofroma (Developer Sales Form)/Page_iProforma (SIT)/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Iprofroma (Developer Sales Form)/Page_iProforma (SIT)/div_Purchaser Name (1) is required'), 
    'Purchaser Name (1) is required')

WebUI.setText(findTestObject('Page_iProforma (SIT)/input__DeveloperSalesPurchaserName1'), 'Klinton Harry')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Iprofroma (Developer Sales Form)/Page_iProforma (SIT)/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Iprofroma (Developer Sales Form)/Page_iProforma (SIT)/div_NRIC (1) is required'), 
    'NRIC (1) is required')

WebUI.setText(findTestObject('Object Repository/Iprofroma (Developer Sales Form)/Page_iProforma (SIT)/input__DeveloperSalesPurchaserNRIC1'), 
    '940106-12-7653')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Iprofroma (Developer Sales Form)/Page_iProforma (SIT)/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Iprofroma (Developer Sales Form)/Page_iProforma (SIT)/div_Contact No. (1) is required'), 
    'Contact No. (1) is required')

WebUI.setText(findTestObject('Object Repository/Iprofroma (Developer Sales Form)/Page_iProforma (SIT)/input__DeveloperSalesPurchaserContactNo1'), 
    '0195236235')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Iprofroma (Developer Sales Form)/Page_iProforma (SIT)/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Iprofroma (Developer Sales Form)/Page_iProforma (SIT)/div_Initial Payment Amount (RM) is required'), 
    'Initial Payment Amount (RM) is required')

WebUI.scrollToElement(findTestObject('Page_iProforma (SIT)/input__DeveloperSalesAgentCommission'), 30)

WebUI.setText(findTestObject('Object Repository/Iprofroma (Developer Sales Form)/Page_iProforma (SIT)/input__DeveloperSalesInitialPaymentAmount'), 
    '25000')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Iprofroma (Developer Sales Form)/Page_iProforma (SIT)/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Iprofroma (Developer Sales Form)/Page_iProforma (SIT)/div_List Price (RM) is required'), 
    'List Price (RM) is required')

WebUI.setText(findTestObject('Object Repository/Iprofroma (Developer Sales Form)/Page_iProforma (SIT)/input__DeveloperSalesListPrice'), 
    '600000')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Iprofroma (Developer Sales Form)/Page_iProforma (SIT)/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Iprofroma (Developer Sales Form)/Page_iProforma (SIT)/div_SPA Price (RM) is required'), 
    'SPA Price (RM) is required')

WebUI.setText(findTestObject('Object Repository/Iprofroma (Developer Sales Form)/Page_iProforma (SIT)/input__DeveloperSalesSPAPrice'), 
    '25000')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Iprofroma (Developer Sales Form)/Page_iProforma (SIT)/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Iprofroma (Developer Sales Form)/Page_iProforma (SIT)/div_Agent Commission (RM) is required'), 
    'Agent Commission (RM) is required')

WebUI.setText(findTestObject('Object Repository/Iprofroma (Developer Sales Form)/Page_iProforma (SIT)/input__DeveloperSalesCommission'), 
    '3500')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Iprofroma (Developer Sales Form)/Page_iProforma (SIT)/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Iprofroma (Developer Sales Form)/Page_iProforma (SIT)/div_Total Agent Commission (RM) is required'), 
    'Total Agent Commission (RM) is required')

WebUI.setText(findTestObject('Object Repository/Iprofroma (Developer Sales Form)/Page_iProforma (SIT)/input__DeveloperSalesTotalCommission'), 
    '4500')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Iprofroma (Developer Sales Form)/Page_iProforma (SIT)/button_Save'))
**/



response = WS.sendRequest(findTestObject('Admin Portal-Enquiry Reminder/Page_The Next Six Admin (SIT)/Get Enquiry List', [('Enquiry') : GlobalVariable.Enquiry]))

def slurper = new groovy.json.JsonSlurper()

def result = slurper.parseText(response.getResponseBodyContent())

def value = result.authenticatedLink

GlobalVariable.Enquiry

println(GlobalVariable.URL)



