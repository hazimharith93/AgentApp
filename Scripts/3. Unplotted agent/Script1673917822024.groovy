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

Mobile.setText(findTestObject('Object Repository/Unplotted Agent/android.widget.EditText - Username'), 'test0104@gmail.com', 
    0)

Mobile.setText(findTestObject('Object Repository/Unplotted Agent/android.widget.EditText - Password'), '123', 0)

Mobile.tap(findTestObject('Object Repository/Unplotted Agent/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/Unplotted Agent/android.widget.TextView - Sign In'), 0)

Mobile.tap(findTestObject('Object Repository/Unplotted Agent/android.view.ViewGroup'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Unplotted Agent/android.widget.TextView - Looks like you are yet to be plotted. Get your plotting now to go online'), 
    'Looks like you are yet to be plotted. Get your plotting now to go online!')

Mobile.tap(findTestObject('Object Repository/Unplotted Agent/android.widget.TextView - Plot Now'), 0)

/*Mobile.verifyElementText(findTestObject(''), '46, Jalan SS 19/6d, 47500, Subang Jaya, Selangor')*/
Mobile.tap(findTestObject('Object Repository/Unplotted Agent/android.view.ViewGroup (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Unplotted Agent/android.widget.TextView - Plot Now (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Unplotted Agent/android.widget.TextView - Confirm Location'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Unplotted Agent/android.widget.TextView - Location'), 'Location')

Mobile.verifyElementText(findTestObject('Object Repository/Unplotted Agent/android.widget.TextView - Confirmation'), 'Confirmation')

Mobile.verifyElementText(findTestObject('Object Repository/Unplotted Agent/android.widget.TextView - Please confirm your specialized  state and area'), 
    'Please confirm your specialized \n state and area')

Mobile.tap(findTestObject('Object Repository/Unplotted Agent/android.widget.TextView - (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Unplotted Agent/android.widget.TextView - Ampang'), 0)

Mobile.takeScreenshot('C:\\Users\\Nextsix\\git\\katalon-agentapp\\Screenshot\\image.png')

Mobile.tap(findTestObject('Object Repository/Unplotted Agent/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Unplotted Agent/android.widget.TextView - (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Unplotted Agent/android.widget.TextView - Account'), 0)

Mobile.tap(findTestObject('Object Repository/Unplotted Agent/android.widget.ImageView (1)'), 0)

Mobile.closeApplication()

