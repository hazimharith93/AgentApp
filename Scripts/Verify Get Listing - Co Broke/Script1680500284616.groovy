import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.StaleElementReferenceException as StaleElementReferenceException
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import io.appium.java_client.MobileElement as MobileElement
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('C:\\Users\\user\\Downloads\\NextSix Agent(1).apk', true)

Mobile.setText(findTestObject('Object Repository/Get listing Co broke/android.widget.EditText - UsernameEmail Address (1)'), 
    'Jehu', 0)

Mobile.setText(findTestObject('Object Repository/Get listing Co broke/android.widget.EditText - Password'), 'ziqhru95', 
    0)

Mobile.tap(findTestObject('Object Repository/Get listing Co broke/android.widget.TextView - Sign In'), 0)

Mobile.tap(findTestObject('Object Repository/Get listing Co broke/android.widget.TextView - Agree  Login'), 0)

Mobile.tap(findTestObject('Object Repository/Get listing Co broke/android.widget.TextView - Not Now'), 0)

Mobile.tap(findTestObject('Object Repository/Get listing Co broke/android.widget.TextView - Get Listing'), 0)

Mobile.verifyElementText(findTestObject('Get listing Co broke/android.widget.TextView - V11 5.0, Teoloyucan'), 'V11 5.0, Teoloyucan')

Mobile.waitForElementPresent(findTestObject('Object Repository/Get listing Co broke/android.widget.TextView - Bandar Sunway,Selangor'), 
    0)

Mobile.verifyElementText(findTestObject('Get listing Co broke/android.widget.TextView - Bandar Sunway,Selangor'), 'Bandar Sunway,Selangor')

Mobile.waitForElementPresent(findTestObject('Object Repository/Get listing Co broke/android.widget.TextView - 5'), 0)

Mobile.verifyElementText(findTestObject('Get listing Co broke/android.widget.TextView - 5'), '5')

Mobile.verifyElementText(findTestObject('Object Repository/Get listing Co broke/android.widget.TextView - 4'), '4')

Mobile.waitForElementPresent(findTestObject('Get listing Co broke/android.widget.TextView - 4'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Get listing Co broke/android.widget.TextView - 2'), '2')

Mobile.verifyElementText(findTestObject('Object Repository/Get listing Co broke/android.widget.TextView - 2000 ft'), '2000 ft²')

Mobile.verifyElementText(findTestObject('Object Repository/Get listing Co broke/android.widget.TextView - RM 700,000.00'), 
    'RM 700,000.00')

Mobile.verifyElementText(findTestObject('Object Repository/Get listing Co broke/android.widget.TextView - mike tyson'), 
    'mike tyson')

Mobile.closeApplication()

