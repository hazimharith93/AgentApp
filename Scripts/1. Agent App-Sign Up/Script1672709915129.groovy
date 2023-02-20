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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import java.util.regex.Matcher as Matcher
import java.util.regex.Pattern as Pattern
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import junit.framework.Assert as Assert


Mobile.startApplication('C:\\Users\\Nextsix\\git\\agent-SDK46-EAS-Tester.apk', true)

Mobile.tap(findTestObject('Object Repository/Agent Sign Up/android.widget.TextView - Sign Up (2)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Agent Sign Up/android.widget.TextView - Choose Package thatSuitable for You (1)'), 
    'Choose Package that\nSuitable for You')

Mobile.verifyElementExist(findTestObject('Object Repository/Agent Sign Up/android.widget.TextView - FREE'), 0)

device_Height = Mobile.getDeviceHeight()

device_Width = Mobile.getDeviceWidth()

int startY = device_Height / 2

int endY = startY

int startX = device_Width * 0.70

int endX = device_Width * 0.30

Mobile.swipe(startX, startY, endX, endY)

Mobile.verifyElementExist(findTestObject('Object Repository/Agent Sign Up/android.widget.TextView - ESSENTIAL PACK (3)'), 
    0)

device_Height = Mobile.getDeviceHeight()

device_Width = Mobile.getDeviceWidth()

int startY1 = device_Height / 2

int endY1 = startY1

int startX1 = device_Width * 0.70

int endX1 = device_Width * 0.30

Mobile.swipe(startX1, startY1, endX1, endY1)

Mobile.verifyElementExist(findTestObject('Object Repository/Agent Sign Up/android.widget.TextView - PRO PACK (5)'), 0)

Mobile.scrollToText('Choose This Package')

Mobile.tap(findTestObject('Object Repository/Agent Sign Up/android.widget.TextView - Choose This Package (2)'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Agent Sign Up/android.widget.TextView - How to get startedJust one easy step away (2)'), 
    0)

Mobile.verifyElementExist(findTestObject('Object Repository/Agent Sign Up/android.widget.TextView - Drop us your contact details and agent info here, and let our team do the rest of the heavy lifting (2)'), 
    0)

Mobile.verifyElementExist(findTestObject('Object Repository/Agent Sign Up/android.widget.TextView - Pro Pack (6)'), 0)

Mobile.tap(findTestObject('Object Repository/Agent Sign Up/android.widget.TextView - (4)'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Agent Sign Up/android.widget.TextView - Pro Pack (7)'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Agent Sign Up/android.widget.TextView - Essential Pack (4)'), 
    0)

Mobile.verifyElementExist(findTestObject('Object Repository/Agent Sign Up/android.widget.TextView - Kick Started Pack (Free) (3)'), 
    0)

Mobile.tap(findTestObject('Object Repository/Agent Sign Up/android.widget.TextView - (5)'), 0)

Mobile.scrollToText('Submit')


fakedata = WS.sendRequest(findTestObject('Get user fake data', [('fakename') : GlobalVariable.fakename, ('fakephone') : GlobalVariable.fakephone
	, ('fakeemail') : GlobalVariable.fakeemail]))

def slurper = new groovy.json.JsonSlurper()

def result = slurper.parseText(fakedata.getResponseBodyContent())

def fakename = result.address.Full_Name

def fakephone = result.address.Telephone



Pattern regexPat = Pattern.compile('.{0,11}$')

Matcher mat = regexPat.matcher(fakephone)

if (mat.find()) {
String res = mat.group()

res2 = res.replaceAll(~('\\s') , '')

GlobalVariable.fakephone = res2

// println GlobalVariable.fakephone+1

if (GlobalVariable.fakephone.length() == 9) {
	println('...Number is good')
	println(GlobalVariable.fakephone)
} else {
	String res3 = GlobalVariable.fakephone+1
	GlobalVariable.fakephone = res3
	println GlobalVariable.fakephone
}
}

if (GlobalVariable.fakephone.length() == 9) {
	println('...Number is good')
	println(GlobalVariable.fakephone)
	if (GlobalVariable.fakephone.startsWith("11")) {String res4 = GlobalVariable.fakephone+'1'
		println GlobalVariable.fakephone}
	}


Mobile.setText(findTestObject('Object Repository/Agent Sign Up/android.widget.EditText - Full Name (4)'), fakename, 0)

Mobile.setText(findTestObject('Object Repository/Agent Sign Up/android.widget.EditText - Email (4)'), 'testernext6@outlook.com', 
    0)

Mobile.setText(findTestObject('Object Repository/Agent Sign Up/android.widget.EditText - Phone Number (4)'), GlobalVariable.fakephone , 
    0)

Mobile.setText(findTestObject('Object Repository/Agent Sign Up/android.widget.EditText - Ren ID (4)'), '123', 0)

Mobile.tap(findTestObject('Object Repository/Agent Sign Up/android.widget.TextView - Submit (4)'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Agent Sign Up/android.widget.TextView - Thank You (4)'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Agent Sign Up/android.widget.TextView - Our friendly team members will (4)'), 
    0)

Mobile.verifyElementExist(findTestObject('Object Repository/Agent Sign Up/android.widget.TextView - reach out you soon (4)'), 
    0)

Mobile.tap(findTestObject('Object Repository/Agent Sign Up/android.widget.TextView - Ok'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Agent Sign Up/android.widget.TextView - Welcome Back Agent, (3)'), 
    0)

