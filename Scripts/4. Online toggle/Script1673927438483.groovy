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

Mobile.startApplication('C:\\Users\\Nextsix\\git\\NextSix_Agent_base.apk', true)

Mobile.setText(findTestObject('Object Repository/Online toggle/android.widget.EditText - Username (1)'), 'marcile@zoho.com', 
    0)

Mobile.setText(findTestObject('Object Repository/Online toggle/android.widget.EditText - Password (1)'), '123', 0)

'tick on agreement '
Mobile.tap(findTestObject('Object Repository/Online toggle/android.widget.TextView - (1)'), 0)

'click sign in button'
Mobile.tap(findTestObject('Object Repository/Online toggle/android.widget.TextView - Sign In (1)'), 0)

'click not now'
Mobile.tap(findTestObject('Object Repository/Online toggle/android.widget.TextView - Not Now (1)'), 0)

'click toggle to set online'
Mobile.tap(findTestObject('Object Repository/Online toggle/android.view.ViewGroup (1)'), 0)

WebUI.delay(5)

agentStatus = WS.sendRequest(findTestObject('Online toggle/verify online public', [('status') : GlobalVariable.agentApplicationMobile]))

def slurper = new groovy.json.JsonSlurper()

def result = slurper.parseText(agentStatus.getResponseBodyContent())

def status = result.status

println(status)

WebUI.verifyEqual(status, 'online')

'click toggle to set offline'
Mobile.tap(findTestObject('Object Repository/Online toggle/android.view.ViewGroup (2)'), 0)

WebUI.delay(5)

agentStatus = WS.sendRequest(findTestObject('Online toggle/verify online public', [('status') : GlobalVariable.agentApplicationMobile]))

def slurper1 = new groovy.json.JsonSlurper()

def result1 = slurper1.parseText(agentStatus.getResponseBodyContent())

def status1 = result1.status

println(status1)

WebUI.verifyEqual(status1, 'offline')

Mobile.closeApplication()

