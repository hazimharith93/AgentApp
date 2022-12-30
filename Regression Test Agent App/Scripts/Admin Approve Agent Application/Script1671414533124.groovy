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

 agentApplication = WS.sendRequest(findTestObject('Get agent application', [('name') : GlobalVariable.agentApplicationName
			 , ('renId') : GlobalVariable.agentApplicationRenId, ('mobile') : GlobalVariable.agentApplicationMobile, ('email') : GlobalVariable.agentApplicationEmail
			 , ('package') : GlobalVariable.agentApplicationPackage, ('appliedOn') : GlobalVariable.agentApplicationAppliedOn
			 , ('status') : GlobalVariable.agentApplicationStatus]))
 
 def slurper = new groovy.json.JsonSlurper()
 
 def result = slurper.parseText(agentApplication.getResponseBodyContent())
 
 def name = result.documents[0].name
 
 def renId = result.documents[0].renId
 
 def mobile = result.documents[0].mobile
 
 def email = result.documents[0].email
 
 def agentPackage = result.documents[0].package //Got issue to pass the value to'Get agent package'
 
 def appliedOn = result.documents[0].appliedOn
 
 def status = result.documents[0].status
 
 String input = appliedOn
 
 String finalAppliedOn = Date.parse('yyyy-MM-dd\'T\'HH:mm:ss', input, TimeZone.getTimeZone('UTC +8')).format('MM/dd/yyyy')
 
 WebUI.openBrowser('')
 
 WebUI.navigateToUrl('https://sit-admin.nextsix.com/')
 
 WebUI.setText(findTestObject('Object Repository/Agent Sign Up/Page_The Next Six Admin (SIT)/input_User Name_username'),
	 'hazim')
 
 WebUI.setEncryptedText(findTestObject('Object Repository/Agent Sign Up/Page_The Next Six Admin (SIT)/input_Password_password'),
	 '/NwwjlhlEjM=')
 
 WebUI.click(findTestObject('Object Repository/Agent Sign Up/Page_The Next Six Admin (SIT)/button_Sign in'))
 
 WebUI.click(findTestObject('Object Repository/Agent Sign Up/Page_The Next Six Admin (SIT)/span_agency'))
 
 WebUI.click(findTestObject('Object Repository/Agent Sign Up/Page_The Next Six Admin (SIT)/span_agent application'))
 
 applicantName = WebUI.getText(findTestObject('Object Repository/Agent Sign Up/Page_The Next Six Admin (SIT)/a_Deb Rishi Agent App'))
 
 applicantName = name
 
 applicantRenID = WebUI.getText(findTestObject('Object Repository/Agent Sign Up/Page_The Next Six Admin (SIT)/td_123'), FailureHandling.STOP_ON_FAILURE)
 
 applicantRenID = renId
 
 applicantMobile = WebUI.getText(findTestObject('Object Repository/Agent Sign Up/Page_The Next Six Admin (SIT)/td_60126924497'),
	 FailureHandling.STOP_ON_FAILURE)
 
 applicantMobile = mobile
 
 applicantEmail = WebUI.getText(findTestObject('Object Repository/Agent Sign Up/Page_The Next Six Admin (SIT)/td_wgerard381gmail.com'),
	 FailureHandling.STOP_ON_FAILURE)
 
 applicantEmail = email
 
 applicantAppliedDate = WebUI.getText(findTestObject('Object Repository/Agent Sign Up/Page_The Next Six Admin (SIT)/td_12192022'),
	 FailureHandling.STOP_ON_FAILURE)
 
 applicantAppliedDate = finalAppliedOn
 
 applicantStatus = WebUI.getText(findTestObject('Object Repository/Agent Sign Up/Page_The Next Six Admin (SIT)/td_Pending'),
	 FailureHandling.STOP_ON_FAILURE)
 
 applicantStatus = status
 
 WebUI.click(findTestObject('Object Repository/Agent Sign Up/Page_The Next Six Admin (SIT)/a_Deb Rishi Agent App'))
 
 WebUI.scrollToElement(findTestObject('Object Repository/Agent Sign Up/Page_The Next Six Admin (SIT)/h3_Pending'), 30)
 
 WebUI.selectOptionByValue(findTestObject('Object Repository/Agent Sign Up/Page_The Next Six Admin (SIT)/select_DisabledIn ServiceTemporary Out of Service'),
	 'In Service', true)
 
 WebUI.setText(findTestObject('Object Repository/Agent Sign Up/Page_The Next Six Admin (SIT)/input__firstName'), name)
 
 WebUI.setText(findTestObject('Object Repository/Agent Sign Up/Page_The Next Six Admin (SIT)/input__lastName'), name)
 
 WebUI.setText(findTestObject('Object Repository/Agent Sign Up/Page_The Next Six Admin (SIT)/input__mobile'), '013-2358516')
 
 WebUI.setText(findTestObject('Object Repository/Agent Sign Up/Page_The Next Six Admin (SIT)/input__icno'), '940125-12-8454')
 
 WebUI.click(findTestObject('Object Repository/Agent Sign Up/Page_The Next Six Admin (SIT)/div_Type to search company name'))
 
 WebUI.setText(findTestObject('Object Repository/Agent Sign Up/Page_The Next Six Admin (SIT)/input__react-select-5-input'),
	 'w')
 
 WebUI.click(findTestObject('Object Repository/Agent Sign Up/Page_The Next Six Admin (SIT)/span_orth Real Estate'))
 
 WebUI.scrollToElement(findTestObject('Object Repository/Agent Sign Up/Page_The Next Six Admin (SIT)/strong_Verification Photos'),
	 30)
 
 WebUI.uploadFile(findTestObject('Object Repository/Agent Sign Up/Page_The Next Six Admin (SIT)/input__ics'), 'C:\\Users\\user\\Pictures\\Nextsix\\Agentimage\\IC.jpg')
 
 WebUI.click(findTestObject('Object Repository/Agent Sign Up/Page_The Next Six Admin (SIT)/button_Approve'))
 
 WebUI.delay(5)
 
 WebUI.click(findTestObject('Object Repository/Agent Sign Up/Page_The Next Six Admin (SIT)/button_Okay_1'))
 
 WebUI.delay(10)
 
 agentApplication1 = WS.sendRequest(findTestObject('Get agent application', [('name') : GlobalVariable.agentApplicationName
			 , ('renId') : GlobalVariable.agentApplicationRenId, ('mobile') : GlobalVariable.agentApplicationMobile, ('email') : GlobalVariable.agentApplicationEmail
			 , ('package') : GlobalVariable.agentApplicationPackage, ('appliedOn') : GlobalVariable.agentApplicationAppliedOn
			 , ('status') : GlobalVariable.agentApplicationStatus, ('processedBy') : GlobalVariable.agentApplicationProcessedBy
			 , ('processedOn') : GlobalVariable.agentApplicationProcessedOn]))
 
 def slurper1 = new groovy.json.JsonSlurper()
 
 def result1 = slurper1.parseText(agentApplication1.getResponseBodyContent())
 
 def name1 = result1.documents[0].name
 
 def renId1 = result1.documents[0].renId
 
 def mobile1 = result1.documents[0].mobile
 
 def email1 = result1.documents[0].email
 
 def agentPackage1 = result1.documents[0].package //Got issue to pass the value to'Get agent package'
 
 def appliedOn1 = result1.documents[0].appliedOn
 
 def status1 = result1.documents[0].status
 
 def processedOn = result1.documents[0].processedOn
 
 def processedBy = result1.documents[0].processedById //Got issue on passing the value
 
 String input1 = appliedOn1
 
 String finalAppliedOn1 = Date.parse('yyyy-MM-dd\'T\'HH:mm:ss', input1, TimeZone.getTimeZone('UTC +8')).format('MM/dd/yyyy')
 
 String input2 = processedOn
 
 String finalprocessedOn = Date.parse('yyyy-MM-dd\'T\'HH:mm:ss', input2, TimeZone.getTimeZone('UTC +8')).format('MM/dd/yyyy')
 
 applicantName1 = WebUI.getText(findTestObject('Object Repository/Agent Sign Up/Page_The Next Six Admin (SIT)/a_Boni Solli Agent App'),
	 FailureHandling.STOP_ON_FAILURE)
 
 applicantName1 = name1
 
 applicantRenID1 = WebUI.getText(findTestObject('Object Repository/Agent Sign Up/Page_The Next Six Admin (SIT)/td_123'),
	 FailureHandling.STOP_ON_FAILURE)
 
 applicantRenID1 = renId1
 
 applicantMobile1 = WebUI.getText(findTestObject('Object Repository/Agent Sign Up/Page_The Next Six Admin (SIT)/td_60132358516'),
	 FailureHandling.STOP_ON_FAILURE)
 
 applicantMobile1 = mobile1
 
 applicantEmail1 = WebUI.getText(findTestObject('Object Repository/Agent Sign Up/Page_The Next Six Admin (SIT)/td_wgerard381gmail.com'),
	 FailureHandling.STOP_ON_FAILURE)
 
 applicantEmail1 = email1
 
 //WebUI.verifyElementText(findTestObject('Object Repository/Agent Sign Up/Page_The Next Six Admin (SIT)/td_Kick Starter Pack (Free)'),'Kick Starter Pack (Free)')
 applicantAppliedOn1 = WebUI.getText(findTestObject('Object Repository/Agent Sign Up/Page_The Next Six Admin (SIT)/td_12202022'),
	 FailureHandling.STOP_ON_FAILURE)
 
 applicantAppliedOn1 = finalAppliedOn1
 
 applicantStatus1 = WebUI.getText(findTestObject('Object Repository/Agent Sign Up/Page_The Next Six Admin (SIT)/td_Approved'),
	 FailureHandling.STOP_ON_FAILURE)
 
 applicantStatus1 = status1
 
 applicantProcessedOn1 = WebUI.getText(findTestObject('Object Repository/Agent Sign Up/Page_The Next Six Admin (SIT)/td_12202022'),
	 FailureHandling.STOP_ON_FAILURE)
 
 applicantProcessedOn1 = finalprocessedOn




WebUI.openBrowser('')

WebUI.navigateToUrl('https://login.live.com/')

WebUI.setText(findTestObject('Object Repository/Agent Sign Up/Page_Sign in to your Microsoft account/input_Sign in_loginfmt'), 
    'testernext6@outlook.com')

'Click Next '
WebUI.click(findTestObject('Object Repository/Agent Sign Up/Page_Sign in to your Microsoft account/input_Create one_idSIButton9'))

WebUI.setEncryptedText(findTestObject('Object Repository/Agent Sign Up/Page_Sign in to your Microsoft account/input_Enter password_passwd'), 
    'y/S8OZynvn3rTsrW056Ccg==')

'Click Sign in'
WebUI.click(findTestObject('Object Repository/Agent Sign Up/Page_Sign in to your Microsoft account/input_Create one_idSIButton9'))

'Click No'
WebUI.click(findTestObject('Object Repository/Agent Sign Up/Page_Microsoft account/input_concat(Don, , t show this again)_idBtn_Back'))

'Click App Launcher'
WebUI.click(findTestObject('Object Repository/Agent Sign Up/Page_Microsoft account  Home/span_Skip to main content_ms-Icon--WaffleOf_363005'))

'Click Outlook'
WebUI.click(findTestObject('Object Repository/Agent Sign Up/Page_Microsoft account  Home/span_Outlook'))

WebUI.switchToWindowTitle('Email - tester next6 - Outlook')

WebUI.switchToWindowIndex('1')

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Agent Sign Up/Page_Email - tester next6 - Outlook/input_Outlook_topSearchInput'))

WebUI.setText(findTestObject('Object Repository/Agent Sign Up/Page_Email - tester next6 - Outlook/input_Suggestions available. Press updown a_f67195'), name1 )

WebUI.sendKeys(findTestObject('Object Repository/Agent Sign Up/Page_Email - tester next6 - Outlook/input_Suggestions available. Press updown a_f67195'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Agent Sign Up/Page_Email - tester next6 - Outlook/span_NextSix'))

WebUI.verifyElementText(findTestObject('Object Repository/Agent Sign Up/Page_Email - tester next6 - Outlook/b_testernext6outlook.com'), 
    'testernext6@outlook.com')

WebUI.click(findTestObject('Object Repository/Agent Sign Up/Page_Email - tester next6 - Outlook/a_Visit this link to create your password'))

WebUI.switchToWindowIndex('2')

WebUI.delay(10)

WebUI.setEncryptedText(findTestObject('Object Repository/Agent Sign Up/Page_Nextsix Verification/input_New password_password'), 
    'aeHFOx8jV/A=')

WebUI.setEncryptedText(findTestObject('Object Repository/Agent Sign Up/Page_Nextsix Verification/input_Confirm new password_confirmPassword'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Agent Sign Up/Page_Nextsix Verification/button_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Agent Sign Up/Page_Nextsix Verification/h2_Successfully change password, please log_d03edf'), 
    'Successfully change password, please login via app.')

