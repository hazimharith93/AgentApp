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

Mobile.startApplication('C:\\Users\\Nextsix\\git\\NextSix_Agent_base (3).apk', true)

Mobile.setText(findTestObject('Object Repository/Others OR/The Will OR/The Will (Agent App)/android.widget.EditText - Username (1)'), 'hazim', 
    0)

Mobile.setText(findTestObject('Object Repository/Others OR/The Will OR/The Will (Agent App)/android.widget.EditText - Password (1)'), 'hazim93', 
    0)

'Tick TOU'
Mobile.tap(findTestObject('Object Repository/Others OR/The Will OR/The Will (Agent App)/android.widget.TextView - (1)'), 0)

'Click Sign in '
Mobile.tap(findTestObject('Object Repository/Others OR/The Will OR/The Will (Agent App)/android.widget.TextView - Sign In (1)'), 0)

'Click Not Now'
Mobile.tap(findTestObject('Object Repository/Others OR/The Will OR/The Will (Agent App)/android.widget.TextView - Not Now (1)'), 0)

Mobile.scrollToText('Get My Referrals', FailureHandling.STOP_ON_FAILURE)

'Click The Will'
Mobile.tap(findTestObject('Object Repository/Others OR/The Will OR/The Will (Agent App)/android.widget.TextView - The Will'), 0)

'Click Paid'
Mobile.tap(findTestObject('Object Repository/Others OR/The Will OR/The Will (Agent App)/android.widget.Button - Paid'), 0)

Mobile.scrollToText('Created Date : 2022-11-07 14:35:20', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Others OR/The Will OR/The Will (Agent App)/android.widget.TextView - Client Name  Carla'), 
    'Client Name : Carla')

Mobile.verifyElementText(findTestObject('Object Repository/Others OR/The Will OR/The Will (Agent App)/android.widget.TextView - Progress  Paid'), 
    'Progress : Paid')

WebUI.delay(5)

Mobile.tap(findTestObject('Object Repository/Others OR/The Will OR/The Will (Agent App)/android.widget.Button - Pending Approval'), 0)

Mobile.scrollToText('Created Date : 2022-11-07 14:40:40', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Others OR/The Will OR/The Will (Agent App)/android.widget.TextView - Client Name  Helen'), 
    'Client Name : Helen')

Mobile.verifyElementText(findTestObject('Object Repository/Others OR/The Will OR/The Will (Agent App)/android.widget.TextView - Progress  Pending Approved'), 
    'Progress : Pending Approved')


WebUI.delay(5)


Mobile.tap(findTestObject('Object Repository/Others OR/The Will OR/The Will (Agent App)/android.widget.Button - Approved'), 0)

Mobile.scrollToText('Created Date : 2022-11-07 14:44:57', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Others OR/The Will OR/The Will (Agent App)/android.widget.TextView - Client Name  Tammy'), 
    'Client Name : Tammy')

Mobile.verifyElementText(findTestObject('Object Repository/Others OR/The Will OR/The Will (Agent App)/android.widget.TextView - Progress  Approved'), 
    'Progress : Approved')


WebUI.delay(5)



Mobile.tap(findTestObject('Object Repository/Others OR/The Will OR/The Will (Agent App)/android.widget.Button - Submitted'), 0)

Mobile.scrollToText('Created Date : 2022-11-07 14:49:15', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Others OR/The Will OR/The Will (Agent App)/android.widget.TextView - Client Name  William'), 
    'Client Name : William')

Mobile.verifyElementText(findTestObject('Object Repository/Others OR/The Will OR/The Will (Agent App)/android.widget.TextView - Progress  Submitted'), 
    'Progress : Submitted')


WebUI.delay(5)



Mobile.tap(findTestObject('Object Repository/Others OR/The Will OR/The Will (Agent App)/android.widget.Button - Completed'), 0)

Mobile.scrollToText('Created Date : 2022-11-07 14:52:44', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject(''), 'Client Name : Marten')

Mobile.verifyElementText(findTestObject('Object Repository/Others OR/The Will OR/The Will (Agent App)/android.widget.TextView - Progress  Completed'), 
    'Progress : Completed')


WebUI.delay(5)



Mobile.tap(findTestObject('Object Repository/Others OR/The Will OR/The Will (Agent App)/android.widget.Button - Rejected'), 0)

Mobile.scrollToText('Created Date : 2022-11-07 14:55:46', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Others OR/The Will OR/The Will (Agent App)/android.widget.TextView - Client Name  Gerard'), 
    'Client Name : Gerard')

Mobile.verifyElementText(findTestObject('Object Repository/Others OR/The Will OR/The Will (Agent App)/android.widget.TextView - Progress  Rejected'), 
    'Progress : Rejected')


WebUI.delay(5)



Mobile.tap(findTestObject('Object Repository/Others OR/The Will OR/The Will (Agent App)/android.widget.Button - Rewrite'), 0)

Mobile.scrollToText('Created Date : 2022-11-07 15:09:30', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Others OR/The Will OR/The Will (Agent App)/android.widget.TextView - Client Name  Kurt'), 
    'Client Name : Kurt')

Mobile.verifyElementText(findTestObject('Object Repository/Others OR/The Will OR/The Will (Agent App)/android.widget.TextView - Progress  Rewrite'), 
    'Progress : Rewrite')


WebUI.delay(5)




Mobile.tap(findTestObject('Object Repository/Others OR/The Will OR/The Will (Agent App)/android.widget.Button - Deleted'), 0)

Mobile.scrollToText('Created Date : 2022-11-07 15:09:30', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Others OR/The Will OR/The Will (Agent App)/android.widget.TextView - Client Name  Steve'), 
    'Client Name : Steve')

Mobile.verifyElementText(findTestObject('Object Repository/Others OR/The Will OR/The Will (Agent App)/android.widget.TextView - Progress  Deleted'), 
    'Progress : Deleted')

