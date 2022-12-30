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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

WebUI.openBrowser('')

WebUI.navigateToUrl('https://sit-admin.nextsix.com/')

WebUI.setText(findTestObject('null'), 
    'hazim')

WebUI.setEncryptedText(findTestObject('null'), 
    '/NwwjlhlEjM=')

WebUI.click(findTestObject('null'))

/**
response = WS.sendRequest(findTestObject('null'))

def slurper = new groovy.json.JsonSlurper()

def result = slurper.parseText(response.getResponseBodyContent())

WebUI.delay(120)
**/
response = WS.sendRequest(findTestObject('null'))

def slurper1 = new groovy.json.JsonSlurper()

def result1 = slurper1.parseText(response.getResponseBodyContent())

def userName = result1.data[0].userName

def timestamp = result1.data[0].enquiryTimestamp

def agentName = result1.data[0].agentName

def agentNickname = result1.data[0].agentNickname

def agentMobile = result1.data[0].agentMobile

def propertyName = result1.data[0].enquiredPropertyName

def records = result1.summary.records

def finalrecord = 'h2_'+records


def finalname = (agentName + ' @ ') + agentNickname

String input = result1.data[0].enquiryTimestamp

String timestamp1 = Date.parse('yyyy-MM-dd\'T\'HH:mm:ss', input, TimeZone.getTimeZone('UTC +8')).format('MM/dd/yyyy hh:mm a')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.verifyElementText(findTestObject('null'), 
    userName)

WebUI.verifyElementText(findTestObject('null'), 
    timestamp1.toLowerCase())

WebUI.verifyElementText(findTestObject('null'), 
    finalname)

WebUI.verifyElementText(findTestObject('null'), 
    agentMobile)

WebUI.verifyElementText(findTestObject('null'), 
    propertyName)

WebUI.click(findTestObject('null'))

WebUI.verifyElementText(findTestObject('null'), 
    finalrecord)

