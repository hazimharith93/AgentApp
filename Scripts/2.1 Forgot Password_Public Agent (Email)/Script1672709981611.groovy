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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

String randomPassword = RandomStringUtils.randomAlphanumeric(8)

println(randomPassword)

/*
WebUI.openBrowser('')

WebUI.navigateToUrl('https://login.live.com/')

WebUI.setText(findTestObject('Object Repository/Forget Password Public Agent/Page_Sign in to your Microsoft account/input_Sign in_loginfmt'), 
    'testernext61@outlook.com')

WebUI.click(findTestObject('Object Repository/Forget Password Public Agent/Page_Sign in to your Microsoft account/input_Create one_idSIButton9'))

WebUI.setEncryptedText(findTestObject('Object Repository/Forget Password Public Agent/Page_Sign in to your Microsoft account/input_Enter password_passwd'), 
    'jPcswhigjFb707CIDnhMhA==')

WebUI.click(findTestObject('Object Repository/Forget Password Public Agent/Page_Sign in to your Microsoft account/input_Create one_idSIButton9'))

WebUI.click(findTestObject('Object Repository/Forget Password Public Agent/Page_Microsoft account/input_concat(Don, , t show this again)_idBtn_Back'))

WebUI.click(findTestObject('Object Repository/Forget Password Public Agent/Page_Microsoft account  Home/button_Skip to main content_O365_MainLink_NavMenu'))

WebUI.click(findTestObject('Object Repository/Forget Password Public Agent/Page_Microsoft account  Home/span_Outlook'))

WebUI.switchToWindowTitle('Email - tester next6 - Outlook')

WebUI.click(findTestObject('Object Repository/Forget Password Public Agent/Page_Email - tester next6 - Outlook/input_All folders_topSearchInput'))

WebUI.setText(findTestObject('Object Repository/Forget Password Public Agent/Page_Email - tester next6 - Outlook/input_Suggestions available. Press updown a_f67195'), 
    'Reset your password')

WebUI.sendKeys(findTestObject('Object Repository/Forget Password Public Agent/Page_Email - tester next6 - Outlook/input_Suggestions available. Press updown a_f67195'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Forget Password Public Agent/Page_Email - tester next6 - Outlook/div_NextSix'))

WebUI.click(findTestObject('Object Repository/Forget Password Public Agent/Page_Email - tester next6 - Outlook/a_Visit this link to reset your password'))
*/
'Switch To Window Index'
WebUI.openBrowser('https://sit-verify.nextsix.com/reset/e04fdf2967b5443b397e9f7a488bbc0a4ccd433359101bf1c5de3fa280974269')

WebUI.setEncryptedText(findTestObject('Object Repository/Forget Password Public Agent/Page_Nextsix Verification/input_New password_password'), '12345677890')

WebUI.setEncryptedText(findTestObject('Object Repository/Forget Password Public Agent/Page_Nextsix Verification/input_Confirm new password_confirmPassword'), '12345677890')

