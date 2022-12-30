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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.AppiumDriver as AppiumDriver


 Mobile.startApplication('C:\\Users\\Nextsix\\git\\NextSix_base (3).apk', true)

Mobile.tap(findTestObject('Object Repository/Others OR/Enquiry (2)/enquiry reminder/android.widget.TextView - Lets Get Started'), 0)

Mobile.tap(findTestObject('Object Repository/Others OR/Enquiry (2)/enquiry reminder/android.widget.TextView - Skip'), 0)

Mobile.tap(findTestObject('Object Repository/Others OR/Enquiry (2)/enquiry reminder/android.widget.TextView - Profile'), 0)

Mobile.tap(findTestObject('Object Repository/Others OR/Enquiry (2)/enquiry reminder/android.widget.TextView - Sign In'), 0)

Mobile.setText(findTestObject('Object Repository/Others OR/Enquiry (2)/enquiry reminder/android.widget.EditText - Email'), 'peter@gmail.com', 
    0)

Mobile.setText(findTestObject('Object Repository/Others OR/Enquiry (2)/enquiry reminder/android.widget.EditText - Password'), '1', 0)

Mobile.tap(findTestObject('Object Repository/Others OR/Enquiry (2)/enquiry reminder/android.widget.TextView - Sign In (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Others OR/Enquiry (2)/enquiry reminder/android.widget.TextView - Home'), 0)

Mobile.tap(findTestObject('Object Repository/Others OR/Enquiry (2)/enquiry reminder/android.widget.TextView - Get Agent'), 0)

Mobile.setText(findTestObject('Object Repository/Others OR/Enquiry (2)/enquiry reminder/android.widget.EditText - Search agent here'), 'ecard4', 
    0)

Mobile.tap(findTestObject('Object Repository/Others OR/Enquiry (2)/enquiry reminder/android.widget.TextView - ecard4'), 0)

WebUI.delay(30)

Mobile.tap(findTestObject('Object Repository/Others OR/Enquiry (2)/enquiry reminder/android.view.View'), 0)

Mobile.tap(findTestObject('Object Repository/Others OR/Enquiry (2)/enquiry reminder/android.widget.TextView - ecard4 (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Others OR/Enquiry (2)/enquiry reminder/android.widget.TextView - Mercure Kuala Lumpur Glenmarie'), 
    0)

Mobile.tap(findTestObject('Object Repository/Others OR/Enquiry (2)/enquiry reminder/android.widget.ImageView'), 0)

WebUI.delay(130)

response = WS.sendRequest(findTestObject('null'))

def slurper = new groovy.json.JsonSlurper()

def result = slurper.parseText(response.getResponseBodyContent())

def userName = result.data[0].userName

def agentName = result.data[0].agentName

def agentMobile = result.data[0].agentMobile

def propertyName = result.data[0].enquiredPropertyName

result.data[0].userName = 'Parker'

result.data[0].agentName = 'ecard4'

result.data[0].agentMobile = '018-3451234'

result.data[0].enquiredPropertyName = 'Mercure Kuala Lumpur Glenmarie'

/**
Mobile.startExistingApplication('com.google.android.gm', FailureHandling.STOP_ON_FAILURE)

Mobile.startApplication('C:\\Users\\Nextsix\\git\\Gmail_base.apk', false)

**/

Mobile.startExistingApplication('com.google.android.gm', FailureHandling.STOP_ON_FAILURE)



