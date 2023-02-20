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
/*
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

assert propertyFacilties0.contains('Jogging Track')

assert propertyFacilties0.contains('BBQ')

assert propertyFacilties0.contains('Jacuzzi')


def price = 'RM 650,000'

newPrice = price.replaceAll("[^0-9]", "")

println(newPrice)
*/


def price = 'RM 650,000.00'

newPrice = price.substring(0, price.lastIndexOf("."))

newPrice1 = newPrice.replaceAll("[^0-9]", "")

println(newPrice1)
