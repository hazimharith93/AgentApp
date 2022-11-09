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

Mobile.startApplication('C:\\Nextisix App\\NextSix_Agent_base (3).apk', true)

Mobile.setText(findTestObject('android.widget.EditText - Username'), 'hazim', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Password'), 'hazim93', 0)

Mobile.tap(findTestObject('Object Repository/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Sign In'), 0)

Mobile.tap(findTestObject('android.widget.TextView - Not Now'), 0)

Mobile.scrollToText('Get My Referrals')

response = WS.sendRequest(findTestObject('Request URL', [('URL') : GlobalVariable.URL]))

def slurper = new groovy.json.JsonSlurper()

def result = slurper.parseText(response.getResponseBodyContent())

def value = result.authenticatedLink

GlobalVariable.URL = value

println(GlobalVariable.URL)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Message'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Peter'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Type a message'), value, 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Send'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('New Folder/android.widget.TextView -new OJBURL'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

