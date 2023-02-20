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

propertyDetails = WS.sendRequest(findTestObject('Property Detail List - Sale/PropertyDetails-Sale', [('propertyName') : GlobalVariable.propertyName
            , ('area') : GlobalVariable.propertyAddressArea, ('state') : GlobalVariable.propertyAddressState, ('propertyPrice') : GlobalVariable.propertyPrice
            , ('bed') : GlobalVariable.propertyBed, ('bath') : GlobalVariable.propertyBath, ('carPark') : GlobalVariable.propertyCarPark
            , ('buildUp') : GlobalVariable.propertyBuildUp, ('lastUpdated') : GlobalVariable.propertyUpdated, ('published') : GlobalVariable.propertyCreated
            , ('addressLine1') : GlobalVariable.propertyAddress1, ('postcode') : GlobalVariable.propertyPostcode, ('highlight') : GlobalVariable.propertyHighlight
            , ('propertyCategory') : GlobalVariable.propertyCategoryListing, ('propertyTitle') : GlobalVariable.propertyTitle
            , ('propertyTenure') : GlobalVariable.propertyTenure, ('propertyFurnishing') : GlobalVariable.propertyFurnishing
            , ('propertyDirection') : GlobalVariable.propertyDirection, ('propertyOccupied') : GlobalVariable.propertyOccupied
            , ('propertyUnitType') : GlobalVariable.propertyUnitType, ('propertyDescription') : GlobalVariable.propertyDescription
            , ('facilities0') : GlobalVariable.propertyFacilities0, ('memo') : GlobalVariable.memo]))

def slurper = new groovy.json.JsonSlurper()

def result = slurper.parseText(propertyDetails.getResponseBodyContent())

def propertyName = result.name

def propertyArea = result.address.area

def propertyState = result.address.state

def propertyPrice = result.buy.price

def propertyBed = result.beds

def propertyBaths = result.baths

def propertyCarParks = result.carParks

def propertyBuildup = result.buildup

def propertyUpdated = result.updated

def propertyCreated = result.created

def propertyAddress1 = result.address.line1

def propertyPostcode = result.address.postcode

def propertyHighlight = result.hightlight

def propertyCategory = result.categoryListing

def propertyTitle = result.title

def propertyTenure = result.tenure

def propertyFurnishing = result.furnishing

def propertyDirection = result.direction

def propertyOccupied = result.occupied

def propertyUnitType = result.unitType

def propertyDescription = result.description

def propertyFacilties0 = result.facilities[0]

def propertyMemo = result.memo

propertyName = propertyName.toString().replace('[', '').replace(']', '')

propertyArea = propertyArea.toString().replace('[', '').replace(']', '')

propertyState = propertyState.toString().replace('[', '').replace(']', '')

propertyPrice = propertyPrice.toString().replace('[', '').replace(']', '')

propertyBed = propertyBed.toString().replace('[', '').replace(']', '')

propertyBaths = propertyBaths.toString().replace('[', '').replace(']', '')

propertyCarParks = propertyCarParks.toString().replace('[', '').replace(']', '')

propertyBuildup = propertyBuildup.toString().replace('[', '').replace(']', '')

'Date Update'
propertyUpdated = propertyUpdated.toString().replace('[', '').replace(']', '')

String inputUpdated = propertyUpdated

String finalPropertyUpdated = Date.parse('yyyy-MM-dd\'T\'HH:mm:ss', inputUpdated, TimeZone.getTimeZone('UTC +8')).format('d/M/yyyy')

'Date Created'
propertyCreated = propertyCreated.toString().replace('[', '').replace(']', '')

String inputCreated = propertyCreated

String finalPropertyCreated = Date.parse('yyyy-MM-dd\'T\'HH:mm:ss', inputCreated, TimeZone.getTimeZone('UTC +8')).format('d/M/yyyy')

propertyAddress1 = propertyAddress1.toString().replace('[', '').replace(']', '')

propertyPostcode = propertyPostcode.toString().replace('[', '').replace(']', '')

propertyHighlight = propertyHighlight.toString().replace('[', '').replace(']', '')

propertyCategory = propertyCategory.toString().replace('[', '').replace(']', '')

propertyTitle = propertyTitle.toString().replace('[', '').replace(']', '')

propertyTenure = propertyTenure.toString().replace('[', '').replace(']', '')

propertyFurnishing = propertyFurnishing.toString().replace('[', '').replace(']', '')

propertyDirection = propertyDirection.toString().replace('[', '').replace(']', '')

propertyOccupied = propertyOccupied.toString().replace('[', '').replace(']', '')

propertyUnitType = propertyUnitType.toString().replace('[', '').replace(']', '')

propertyDescription = propertyDescription.toString().replace('[', '').replace(']', '')

propertyFacilties0 = propertyFacilties0.toString().replace('[', '').replace(']', '')

propertyMemo = propertyMemo.toString().replace('[', '').replace(']', '')

println(propertyName)

println(propertyArea)

println(propertyState)

println(propertyPrice)

println(propertyBed)

println(propertyBaths)

println(propertyCarParks)

println(propertyBuildup)

println(finalPropertyUpdated)

println(finalPropertyCreated)

println(propertyAddress1)

println(propertyPostcode)

println(propertyHighlight)

println(propertyCategory)

println(propertyTitle)

println(propertyTenure)

println(propertyFurnishing)

println(propertyDirection)

println(propertyOccupied)

println(propertyUnitType)

println(propertyDescription)

println(propertyFacilties0)

println(propertyMemo)

Mobile.startApplication('C:\\Users\\Nextsix\\git\\agent-SDK46-EAS-Tester.apk', true)

Mobile.setText(findTestObject('Object Repository/Property Detail List - Sale/android.widget.EditText - Username'), 'testernext6po@outlook.com', 0)

Mobile.setText(findTestObject('Object Repository/Property Detail List - Sale/android.widget.EditText - Password'), '123', 0)

'tick on agreement'
Mobile.tap(findTestObject('Object Repository/Property Detail List - Sale/android.widget.TextView -'), 0)

'click sign in button'
Mobile.tap(findTestObject('Object Repository/Property Detail List - Sale/android.widget.TextView - Sign In'), 0)

'click not now'
Mobile.tap(findTestObject('Object Repository/Property Detail List - Sale/android.widget.TextView - Not Now'), 0)

'click \'My Property\''
Mobile.tap(findTestObject('Object Repository/Property Detail List - Sale/android.widget.TextView - My Property'), 0)

WebUI.delay(5)

'property name'
propName = Mobile.verifyElementText(findTestObject('Object Repository/Property Detail List - Sale/android.widget.TextView - Kurtalan Residence (3)'), 
    'Kurtalan Residence')

propName = propertyName

'property area, state'
propAreaState = Mobile.verifyElementText(findTestObject('Object Repository/Property Detail List - Sale/android.widget.TextView - Subang Jaya, Selangor'), 
    'Subang Jaya, Selangor')

propAreaState = propertyArea+', '+propertyState

'property price'
propPrice = Mobile.verifyElementText(findTestObject('Object Repository/Property Detail List - Sale/android.widget.TextView - RM 650,000.00 (2)'), 
    'RM 650,000.00')

newPrice = propPrice.substring(0, propPrice.lastIndexOf("."))

newPrice1 = newPrice.replaceAll("[^0-9]", "")

newPrice1 = propertyPrice

'property bedroom'
propBed = Mobile.verifyElementText(findTestObject('Object Repository/Property Detail List - Sale/android.widget.TextView - 5'), '5')

propBed = propertyBed

'property bathroom'
propBath = Mobile.verifyElementText(findTestObject('Object Repository/Property Detail List - Sale/android.widget.TextView - 3'), '3')

propBath = propertyBaths

'property car park'
propPark = Mobile.verifyElementText(findTestObject('Object Repository/Property Detail List - Sale/android.widget.TextView - 3 (1)'), '3')

propPark = propertyCarParks

'property sqft'
propSqft = Mobile.verifyElementText(findTestObject('Object Repository/Property Detail List - Sale/android.widget.TextView - 3200 ft'), '3200 ft²')

propSqft = propertyBuildup+ ' ft²'

'click property details'
Mobile.tap(findTestObject('Object Repository/Property Detail List - Sale/android.widget.TextView - Kurtalan Residence (3)'), 0)

'property name'
propName1 = Mobile.verifyElementText(findTestObject('Object Repository/Property Detail List - Sale/android.widget.TextView - Kurtalan Residence (1)'), 
    'Kurtalan Residence')

propName1 = propertyName

'last updated date'
propUpdated = Mobile.verifyElementText(findTestObject('Object Repository/Property Detail List - Sale/android.widget.TextView - Last updated on 1812023'),'Last updated on: 18/1/2023')

propUpdated = 'Last updated on: '+finalPropertyUpdated

'published date'
propPublish = Mobile.verifyElementText(findTestObject('Object Repository/Property Detail List - Sale/android.widget.TextView - Published on 972021'), 'Published on: 9/7/2021')

propPublish = 'Published on: '+finalPropertyCreated

'property price'
propPrice1 = Mobile.verifyElementText(findTestObject('Object Repository/Property Detail List - Sale/android.widget.TextView - RM 650,000.00 (1)'), 
    'RM 650,000.00')

newPrice = propPrice1.substring(0, propPrice1.lastIndexOf("."))

newPrice2 = newPrice.replaceAll("[^0-9]", "")

newPrice2 = propertyPrice

'property name'
propName2 = Mobile.verifyElementText(findTestObject('Object Repository/Property Detail List - Sale/android.widget.TextView - Kurtalan Residence (2)'), 'Kurtalan Residence')

propName2 = propertyName

'property address'
propAddress = Mobile.verifyElementText(findTestObject('Object Repository/Property Detail List - Sale/android.widget.TextView - 42, SS 171B, Subang Jaya, 46150 Subang Jaya, Selangor'), 
    '42, SS 17/1B, Subang Jaya, 46150 Subang Jaya, Selangor')

propAddress = propertyAddress1+', '+propertyPostcode+', '+propertyArea+','+propertyState

'property bedroom'
propBed1 = Mobile.verifyElementText(findTestObject('Object Repository/Property Detail List - Sale/android.widget.TextView - 5 (2)'), '5')

propBed1 = propertyBed

'property bathroom'
propBath1 = Mobile.verifyElementText(findTestObject('Object Repository/Property Detail List - Sale/android.widget.TextView - 3 (4)'), '3')

propBath1 = propertyBaths

'property car park'
propPark1 = Mobile.verifyElementText(findTestObject('Object Repository/Property Detail List - Sale/android.widget.TextView - 3 (3)'), '3')

propPark1 = propertyCarParks

'property sqft'
propSqft1 = Mobile.verifyElementText(findTestObject('Object Repository/Property Detail List - Sale/android.widget.TextView - 3200'), '3200')

propSqft1 = propertyBuildup

'property highlight'
propHighlight = Mobile.verifyElementText(findTestObject('Object Repository/Property Detail List - Sale/android.widget.TextView - Area Type  Cluster Factory'), 'Area :\nType : Cluster Factory \n')

propHighlight = propertyHighlight

Mobile.scrollToText('24hr Security', FailureHandling.STOP_ON_FAILURE)  

'Land title'
propLandTitle = Mobile.verifyElementText(findTestObject('Object Repository/Property Detail List - Sale/android.widget.TextView - Residential (1)'), 'Residential')

propLandTitle = propertyCategory

'property title type'
propTitleType = Mobile.verifyElementText(findTestObject('Object Repository/Property Detail List - Sale/android.widget.TextView - Semi-DBungalow'), 'Semi-D/Bungalow')

propTitleType = propertyTitle

'tenure'
propTenure = Mobile.verifyElementText(findTestObject('Object Repository/Property Detail List - Sale/android.widget.TextView - Leasehold'), 'Leasehold')

propTenure = propertyTenure

'furnishing'
propFurnish = Mobile.verifyElementText(findTestObject('Object Repository/Property Detail List - Sale/android.widget.TextView - Fully Furnished'),'Fully Furnished')

propFurnish = propertyFurnishing

'direction'
propDirection = Mobile.verifyElementText(findTestObject('Object Repository/Property Detail List - Sale/android.widget.TextView - East'), 'East')

propDirection = propertyDirection

'occupancy'
propOccupancy = Mobile.verifyElementText(findTestObject('Object Repository/Property Detail List - Sale/android.widget.TextView - Vacant'), 'Vacant')

propOccupancy = propertyOccupied

'unit type'
propUnitType = Mobile.verifyElementText(findTestObject('Object Repository/Property Detail List - Sale/android.widget.TextView - Corner'), 'Corner')

propUnitType = propertyUnitType

'description'
propDescripton = Mobile.verifyElementText(findTestObject('Object Repository/Property Detail List - Sale/android.widget.TextView - Big Land n Spacious'), 'Big Land n Spacious')

propDescripton = propertyDescription

Mobile.verifyElementText(findTestObject('Object Repository/Property Detail List - Sale/android.widget.TextView - BBQ (1)'), 
    'BBQ')


Mobile.verifyElementText(findTestObject('Object Repository/Property Detail List - Sale/android.widget.TextView - Business Centre'), 
    'Business Centre')

Mobile.verifyElementText(findTestObject('Object Repository/Property Detail List - Sale/android.widget.TextView - Club House'), 
    'Club House')

Mobile.verifyElementText(findTestObject('Object Repository/Property Detail List - Sale/android.widget.TextView - Parking'), 
    'Parking')

Mobile.verifyElementText(findTestObject('Object Repository/Property Detail List - Sale/android.widget.TextView - Gymnasium'), 
    'Gymnasium')

Mobile.verifyElementText(findTestObject('Object Repository/Property Detail List - Sale/android.widget.TextView - Jacuzzi'), 
    'Jacuzzi')

Mobile.verifyElementText(findTestObject('Object Repository/Property Detail List - Sale/android.widget.TextView - Jogging Track'), 
    'Jogging Track')

Mobile.verifyElementText(findTestObject('Object Repository/Property Detail List - Sale/android.widget.TextView - Mini Market'), 
    'Mini Market')

Mobile.verifyElementText(findTestObject('Object Repository/Property Detail List - Sale/android.widget.TextView - Nursery'), 
    'Nursery')

Mobile.verifyElementText(findTestObject('Object Repository/Property Detail List - Sale/android.widget.TextView - Playground'), 
    'Playground')

Mobile.verifyElementText(findTestObject('Object Repository/Property Detail List - Sale/android.widget.TextView - Salon'), 
    'Salon')

Mobile.verifyElementText(findTestObject('Object Repository/Property Detail List - Sale/android.widget.TextView - Sauna'), 
    'Sauna')

Mobile.verifyElementText(findTestObject('Object Repository/Property Detail List - Sale/android.widget.TextView - Squash Court'), 
    'Squash Court')

Mobile.verifyElementText(findTestObject('Object Repository/Property Detail List - Sale/android.widget.TextView - Swimming Pool'), 
    'Swimming Pool')

Mobile.verifyElementText(findTestObject('Object Repository/Property Detail List - Sale/android.widget.TextView - Wading Pool'), 
    'Wading Pool')

Mobile.verifyElementText(findTestObject('Object Repository/Property Detail List - Sale/android.widget.TextView - Tennis Court'), 
    'Tennis Court')

Mobile.verifyElementText(findTestObject('Object Repository/Property Detail List - Sale/android.widget.TextView - 24hr Security'), 
    '24hr Security')

Mobile.verifyElementText(findTestObject('Object Repository/Property Detail List - Sale/android.widget.TextView - Cafeteria'), 
    'Cafeteria')

'click memo button'
Mobile.tap(findTestObject('Object Repository/Property Detail List - Sale/android.widget.ImageView'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Property Detail List - Sale/android.widget.EditText - very good condition'), 
    'very good condition')

'click \'X\' in memo'
Mobile.tap(findTestObject('Object Repository/Property Detail List - Sale/android.widget.ImageView (1)'), 0)

Mobile.closeApplication()







