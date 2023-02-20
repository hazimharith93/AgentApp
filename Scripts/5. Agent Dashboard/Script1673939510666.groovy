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

Mobile.setText(findTestObject('Object Repository/agent dashboard/android.widget.EditText - Username'), 'marcile@zoho.com', 
    0)

Mobile.setText(findTestObject('Object Repository/agent dashboard/android.widget.EditText - Password'), '123', 0)

'tick on the agreement'
Mobile.tap(findTestObject('Object Repository/agent dashboard/android.widget.TextView -'), 0)

'click sign in button'
Mobile.tap(findTestObject('Object Repository/agent dashboard/android.widget.TextView - Sign In'), 0)

'click not now'
Mobile.tap(findTestObject('Object Repository/agent dashboard/android.widget.TextView - Not Now'), 0)

agentDashboard = WS.sendRequest(findTestObject('agent dashboard/Public agent dashboard', [('packageName') : GlobalVariable.packageName, ('activeListingAllowed') : GlobalVariable.packageActiveListing
            , ('propertyImageAllowed') : GlobalVariable.packageImageAllowed, ('totalActiveProperty') : GlobalVariable.totalActiveProperty
            , ('totalInactiveProperty') : GlobalVariable.totalInactiveProperty, ('plottedAddress') : GlobalVariable.plottedAddress
            , ('totalMessage') : GlobalVariable.totalMessage, ('totalAppointment') : GlobalVariable.totalAppointment, ('totalGuidance') : GlobalVariable.totalGuidance]))

def slurper = new groovy.json.JsonSlurper()

def result = slurper.parseText(agentDashboard.getResponseBodyContent())

def packageName = result.package.name

def activeListingAllowed = result.package.activeListingAllowed

def totalImageAllowed = result.package.propertyImageAllowed

def activeProperties = result.properties.true

def inactiveProperties = result.properties.false

def messages = result.messages

def appointment = result.appointment

def guidance = result.guidance

def plottedAddress = result.plottedAddress

def totalListing = activeProperties + inactiveProperties

println(packageName)

println(activeListingAllowed)

println(totalImageAllowed)

println(activeProperties)

println(inactiveProperties)

println(messages)

println(appointment)

println(guidance)

println(plottedAddress)

println(totalListing)


agentPackage = Mobile.verifyElementText(findTestObject('Object Repository/agent dashboard/android.widget.TextView - Kick Starter Pack (Free) (1)'), 
    'Kick Starter Pack (Free)')

agentPackage = packageName

Mobile.verifyElementText(findTestObject('Object Repository/agent dashboard/android.widget.TextView - Up to 5 Active Listing (1)'), 
    'Up to 5 Active Listing')

imageAllowed = Mobile.verifyElementText(findTestObject('Object Repository/agent dashboard/android.widget.TextView - 15 Photos (1)'), '15 Photos')

imageAllowed = totalImageAllowed+' Photos'

'total message'
totalMessage = Mobile.verifyElementText(findTestObject('Object Repository/agent dashboard/android.widget.TextView - 1 (1)'), '1')

totalMessage = messages

'total appointment'
totalAppointment = Mobile.verifyElementText(findTestObject('Object Repository/agent dashboard/android.widget.TextView - 0 (1)'), '0')

totalAppointment = appointment

'total guidance'
totalGuidance = Mobile.verifyElementText(findTestObject('Object Repository/agent dashboard/android.widget.TextView - 2 (1)'), '2')

totalGuidance = guidance

'click listing'
Mobile.tap(findTestObject('Object Repository/agent dashboard/android.widget.TextView - Listing (1)'), 0)

'total active listing '
activeListing = Mobile.verifyElementText(findTestObject('Object Repository/agent dashboard/android.widget.TextView - 5 Active (1)'), '5 Active')

activeListing = activeProperties+ ' Active'

'total inactive listing '
inactiveListing = Mobile.verifyElementText(findTestObject('Object Repository/agent dashboard/android.widget.TextView - 36 Inactive (1)'), 
    '36 Inactive')

inactiveListing = inactiveProperties+ ' Inactive'

'total listing'
agentTotalListing = Mobile.verifyElementText(findTestObject('Object Repository/agent dashboard/android.widget.TextView - 41 (1)'), '41')

agentTotalListing = totalListing

'click plotting'
Mobile.tap(findTestObject('Object Repository/agent dashboard/android.widget.TextView - Plotting (1)'), 0)

WebUI.delay(3)

AgentPlottedAddress = Mobile.verifyElementText(findTestObject('Object Repository/android.widget.TextView - No. A-0-3A, Jalan 1127, Kuchai Business Park, Wilayah Persekutuan, Kuchai Entrepreneurs Park, 58200 Kuala Lumpur, Federal Territory of Kuala Lumpur, Malaysia'), 
    'No. A-0-3A, Jalan 1/127, Kuchai Business Park, Wilayah Persekutuan, Kuchai Entrepreneurs Park, 58200 Kuala Lumpur, Federal Territory of Kuala Lumpur, Malaysia')

AgentPlottedAddress = plottedAddress

Mobile.closeApplication()

