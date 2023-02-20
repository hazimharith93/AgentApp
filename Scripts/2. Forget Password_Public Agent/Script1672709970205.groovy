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

Mobile.setText(findTestObject('Object Repository/Forget Password Public Agent/android.widget.EditText - Username'), 'testernext61@outlook.com', 
    0)

Mobile.setText(findTestObject('Object Repository/Forget Password Public Agent/android.widget.EditText - Password'), 'asdf', 
    0)

Mobile.tap(findTestObject('Object Repository/Forget Password Public Agent/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/Forget Password Public Agent/android.widget.TextView - Sign In'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Forget Password Public Agent/android.widget.TextView - Failed'), 
    0)

Mobile.verifyElementExist(findTestObject('Object Repository/Forget Password Public Agent/android.widget.TextView - The username or password you entered is incorrect'), 
    0)

Mobile.tap(findTestObject('Object Repository/Forget Password Public Agent/android.widget.TextView - Try Again'), 0)

Mobile.tap(findTestObject('Object Repository/Forget Password Public Agent/android.widget.TextView - forgot password'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Forget Password Public Agent/android.widget.TextView - Forgot'), 
    0)

Mobile.verifyElementExist(findTestObject('Object Repository/Forget Password Public Agent/android.widget.TextView - Password'), 
    0)

Mobile.verifyElementExist(findTestObject('Object Repository/Forget Password Public Agent/android.widget.TextView - Dont worry we got you covered, just enter your registered email'), 
    0)

Mobile.setText(findTestObject('Object Repository/Forget Password Public Agent/android.widget.EditText - Username (1)'), 
    'testernext61@outlook.com', 0)

Mobile.tap(findTestObject('Object Repository/Forget Password Public Agent/android.widget.TextView - Send'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Forget Password Public Agent/android.widget.TextView - Reset'), 
    0)

Mobile.verifyElementExist(findTestObject('Object Repository/Forget Password Public Agent/android.widget.TextView - Password (1)'), 
    0)

Mobile.verifyElementExist(findTestObject('Object Repository/Forget Password Public Agent/android.widget.TextView - An email with instructions to reset your password has been sent to your email account'), 
    0)

Mobile.tap(findTestObject('Object Repository/Forget Password Public Agent/android.widget.TextView - Ok'), 0)

