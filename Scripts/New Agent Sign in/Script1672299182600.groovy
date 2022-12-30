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

Mobile.startApplication('C:\\Users\\Nextsix\\git\\agent-SDK46-EAS-Tester.apk', true)

Mobile.setText(findTestObject('Object Repository/Agent Sign Up/android.widget.EditText - Username'), 'testernext6@outlook.com', 
    0)

Mobile.setText(findTestObject('Object Repository/Agent Sign Up/android.widget.EditText - Password'), '123456', 0)

Mobile.tap(findTestObject('Object Repository/Agent Sign Up/android.widget.TextView - (6)'), 0)

Mobile.tap(findTestObject('Object Repository/Agent Sign Up/android.widget.TextView - Sign In'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Agent Sign Up/android.widget.TextView - Welcome to'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Agent Sign Up/android.widget.TextView - Accelerate your business growth  get seen by potential customers with GPSYourAgent'), 
    0)

Mobile.tap(findTestObject('Object Repository/Agent Sign Up/android.widget.TextView - Lets Get Started'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Agent Sign Up/android.widget.TextView - Heres an overview of your account'), 
    0)

Mobile.tap(findTestObject('Object Repository/Agent Sign Up/android.widget.TextView - Kick Starter Pack (Free)'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Agent Sign Up/android.widget.TextView - Add new property listing here'), 
    0)

Mobile.verifyElementExist(findTestObject('Object Repository/Agent Sign Up/android.widget.TextView - Add Property'), 0)

'Add Property'
Mobile.tap(findTestObject('Object Repository/Agent Sign Up/android.widget.TextView - Add Property (1)'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Agent Sign Up/android.view.ViewGroup'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Agent Sign Up/android.widget.TextView - Edit Profile'), 0)

'Edit Property'
Mobile.tap(findTestObject('Object Repository/Agent Sign Up/android.widget.TextView - Edit Profile (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Agent Sign Up/android.widget.ImageView'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Agent Sign Up/android.widget.TextView - Access available tutorials and guides'), 
    0)

Mobile.tap(findTestObject('Object Repository/Agent Sign Up/android.widget.ImageView (1)'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Agent Sign Up/android.widget.TextView - Click here for any appointment request from customers'), 
    0)

Mobile.tap(findTestObject('Object Repository/Agent Sign Up/android.widget.ImageView (2)'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Agent Sign Up/android.widget.TextView - Any inbound message can be accessed here'), 
    0)

Mobile.tap(findTestObject('Object Repository/Agent Sign Up/android.widget.ImageView (3)'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Agent Sign Up/android.widget.TextView - Lastly, turn ONLINE to stay active and ahead of competition'), 
    0)

Mobile.tap(findTestObject('Object Repository/Agent Sign Up/android.view.ViewGroup (2)'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Agent Sign Up/android.widget.TextView - Agent Dashboard'), 0)

Mobile.tap(findTestObject('Object Repository/Agent Sign Up/android.widget.TextView - Account'), 0)

Mobile.tap(findTestObject('Object Repository/Agent Sign Up/android.widget.ImageView (4)'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Agent Sign Up/android.widget.TextView - Welcome Back Agent, (4)'), 
    0)

WS.sendRequest(findTestObject('Delete Agent (AgentDrafts)'))

WS.sendRequest(findTestObject('Delete Agent (Agents)'))

