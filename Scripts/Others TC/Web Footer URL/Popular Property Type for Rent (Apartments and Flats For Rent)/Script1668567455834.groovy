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

WebUI.openBrowser('')

//Malaysia
WebUI.navigateToUrl('https://sit.nextsix.com/')

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/summary_Apartments  Flats for Rent'))

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/a_Apartments  Flats for Rent in Malaysia'))

def url = WebUI.getUrl()

WebUI.verifyEqual(url, 'https://sit.nextsix.com/properties-for-rent/malaysia/apartment-flat')

//Selangor
WebUI.navigateToUrl('https://sit.nextsix.com/')

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/summary_Apartments  Flats for Rent'))

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/a_Apartments  Flats for Rent in Selangor'))

def url2 = WebUI.getUrl()

WebUI.verifyEqual(url2, 'https://sit.nextsix.com/properties-for-rent/selangor/apartment-flat')

//Kuala Lumpur
WebUI.navigateToUrl('https://sit.nextsix.com/')

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/summary_Apartments  Flats for Rent'))

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/a_Apartments  Flats for Rent in Kuala Lumpur'))

def url3 = WebUI.getUrl()

WebUI.verifyEqual(url3, 'https://sit.nextsix.com/properties-for-rent/kuala-lumpur/apartment-flat')

//Johor
WebUI.navigateToUrl('https://sit.nextsix.com/')

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/summary_Apartments  Flats for Rent'))

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/a_Apartments  Flats for Rent in Johor'))

def url4 = WebUI.getUrl()

WebUI.verifyEqual(url4, 'https://sit.nextsix.com/properties-for-rent/johor/apartment-flat')

//Penang
WebUI.navigateToUrl('https://sit.nextsix.com/')

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/summary_Apartments  Flats for Rent'))

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/a_Apartments  Flats for Rent in Penang'))

def url5 = WebUI.getUrl()

WebUI.verifyEqual(url5, 'https://sit.nextsix.com/properties-for-rent/penang/apartment-flat')

//Putrajaya
WebUI.navigateToUrl('https://sit.nextsix.com/')

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/summary_Apartments  Flats for Rent'))

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/a_Apartments  Flats for Rent in Putrajaya'))

def url6 = WebUI.getUrl()

WebUI.verifyEqual(url6, 'https://sit.nextsix.com/properties-for-rent/putrajaya/apartment-flat')

//Melaka
WebUI.navigateToUrl('https://sit.nextsix.com/')

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/summary_Apartments  Flats for Rent'))

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/a_Apartments  Flats for Rent in Melaka'))

def url7 = WebUI.getUrl()

WebUI.verifyEqual(url7, 'https://sit.nextsix.com/properties-for-rent/melaka/apartment-flat')

//Negeri Sembilan
WebUI.navigateToUrl('https://sit.nextsix.com/')

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/summary_Apartments  Flats for Rent'))

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/a_Apartments  Flats for Rent in Negeri Sembilan'))

def url8 = WebUI.getUrl()

WebUI.verifyEqual(url8, 'https://sit.nextsix.com/properties-for-rent/negeri-sembilan/apartment-flat')

//Sarawak
WebUI.navigateToUrl('https://sit.nextsix.com/')

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/summary_Apartments  Flats for Rent'))

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/a_Apartments  Flats for Rent in Sarawak'))

def url9 = WebUI.getUrl()

WebUI.verifyEqual(url9, 'https://sit.nextsix.com/properties-for-rent/sarawak/apartment-flat')

//Kedah
WebUI.navigateToUrl('https://sit.nextsix.com/')

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/summary_Apartments  Flats for Rent'))

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/a_Apartments  Flats for Rent in Kedah'))

def url10 = WebUI.getUrl()

WebUI.verifyEqual(url10, 'https://sit.nextsix.com/properties-for-rent/kedah/apartment-flat')

//Kelantan
WebUI.navigateToUrl('https://sit.nextsix.com/')

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/summary_Apartments  Flats for Rent'))

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/a_Apartments  Flats for Rent in Kelantan'))

def url11 = WebUI.getUrl()

WebUI.verifyEqual(url11, 'https://sit.nextsix.com/properties-for-rent/kelantan/apartment-flat')

//Pahang
WebUI.navigateToUrl('https://sit.nextsix.com/')

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/summary_Apartments  Flats for Rent'))

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/a_Apartments  Flats for Rent in Pahang'))

def url12 = WebUI.getUrl()

WebUI.verifyEqual(url12, 'https://sit.nextsix.com/properties-for-rent/pahang/apartment-flat')

//Perak
WebUI.navigateToUrl('https://sit.nextsix.com/')

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/summary_Apartments  Flats for Rent'))

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/a_Apartments  Flats for Rent in Perak'))

def url13 = WebUI.getUrl()

WebUI.verifyEqual(url13, 'https://sit.nextsix.com/properties-for-rent/perak/apartment-flat')

//Perlis
WebUI.navigateToUrl('https://sit.nextsix.com/')

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/summary_Apartments  Flats for Rent'))

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/a_Apartments  Flats for Rent in Perlis'))

def url14 = WebUI.getUrl()

WebUI.verifyEqual(url14, 'https://sit.nextsix.com/properties-for-rent/perlis/apartment-flat')

//Sabah
WebUI.navigateToUrl('https://sit.nextsix.com/')

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/summary_Apartments  Flats for Rent'))

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/a_Apartments  Flats for Rent in Sabah'))

def url15 = WebUI.getUrl()

WebUI.verifyEqual(url15, 'https://sit.nextsix.com/properties-for-rent/sabah/apartment-flat')

//Terengganu
WebUI.navigateToUrl('https://sit.nextsix.com/')

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/summary_Apartments  Flats for Rent'))

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/a_Apartments  Flats for Rent in Terengganu'))

def url16 = WebUI.getUrl()

WebUI.verifyEqual(url16, 'https://sit.nextsix.com/properties-for-rent/terengganu/apartment-flat')

//Labuan
WebUI.navigateToUrl('https://sit.nextsix.com/')

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/summary_Apartments  Flats for Rent'))

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer (Apartment and Flats for Rent)/Page_The Next Six (SIT)/a_Apartments  Flats for Rent in Labuan'))

def url17 = WebUI.getUrl()

WebUI.verifyEqual(url17, 'https://sit.nextsix.com/properties-for-rent/labuan/apartment-flat')

