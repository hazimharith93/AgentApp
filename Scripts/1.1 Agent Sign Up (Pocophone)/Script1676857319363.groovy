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

Mobile.startApplication('C:\\Users\\Nextsix\\git\\NextSix_Agent_base.apk', true)

Mobile.tap(findTestObject('Object Repository/Sign Up (Pocophone)/android.widget.TextView - Sign Up'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Sign Up (Pocophone)/android.widget.TextView - KICK STARTER PACK'), 
    0)

device_Height = Mobile.getDeviceHeight()

device_Width = Mobile.getDeviceWidth()

int startY = device_Height / 2

int endY = startY

int startX = device_Width * 0.70

int endX = device_Width * 0.30

Mobile.swipe(startX, startY, endX, endY)

Mobile.verifyElementExist(findTestObject('Object Repository/Sign Up (Pocophone)/android.widget.TextView - ESSENTIAL PACK'), 
    0)

device_Height = Mobile.getDeviceHeight()

device_Width = Mobile.getDeviceWidth()

int startY1 = device_Height / 2

int endY1 = startY1

int startX1 = device_Width * 0.70

int endX1 = device_Width * 0.30

Mobile.swipe(startX1, startY1, endX1, endY1)

Mobile.verifyElementExist(findTestObject('Object Repository/Sign Up (Pocophone)/android.widget.TextView - PRO PACK'), 0)

Mobile.tap(findTestObject('Object Repository/Sign Up (Pocophone)/android.widget.TextView - Choose This Package'), 0)

Mobile.tap(findTestObject('Object Repository/Sign Up (Pocophone)/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/Sign Up (Pocophone)/android.widget.TextView - Kick Started Pack (Free)'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Sign Up (Pocophone)/android.widget.TextView - Kick Started Pack (Free) (1)'), 
    0)

Mobile.setText(findTestObject('Object Repository/Sign Up (Pocophone)/android.widget.EditText - Full Name'), 'fg', 0)

Mobile.setText(findTestObject('Object Repository/Sign Up (Pocophone)/android.widget.EditText - Email'), 'fg@gmail.com', 
    0)

Mobile.setText(findTestObject('Object Repository/Sign Up (Pocophone)/android.widget.EditText - Phone Number'), '147523625', 
    0)

Mobile.setText(findTestObject('Object Repository/Sign Up (Pocophone)/android.widget.EditText - Ren ID'), '123', 0)

Mobile.tap(findTestObject('Object Repository/Sign Up (Pocophone)/android.widget.TextView - Submit'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Sign Up (Pocophone)/android.widget.TextView - Thank You'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Sign Up (Pocophone)/android.widget.TextView - Our friendly team members will'), 
    0)

Mobile.verifyElementExist(findTestObject('Object Repository/Sign Up (Pocophone)/android.widget.TextView - reach out you soon'), 
    0)

Mobile.tap(findTestObject('Object Repository/Sign Up (Pocophone)/android.widget.TextView - Ok'), 0)

Mobile.closeApplication()

