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

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/summary_Condos  Serviced Residences for Sale'))

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/a_Condos  Serviced Residences for Sale in Malaysia'))

def url = WebUI.getUrl()

WebUI.verifyEqual(url, 'https://sit.nextsix.com/properties-for-sale/malaysia/condo-serviced-residence')

//Selangor
WebUI.navigateToUrl('https://sit.nextsix.com/')

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/summary_Condos  Serviced Residences for Sale'))

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/a_Condos  Serviced Residences for Sale in Selangor'))

def url2 = WebUI.getUrl()

WebUI.verifyEqual(url2, 'https://sit.nextsix.com/properties-for-sale/selangor/condo-serviced-residence')

//Kuala Lumpur
WebUI.navigateToUrl('https://sit.nextsix.com/')

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/summary_Condos  Serviced Residences for Sale'))

'xxxxxxxxxxxxxxxxxxxxxxxxxx'
WebUI.scrollToPosition(0, 6)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/a_Condos  Serviced Residences for Sale in K_b73149_1'))

def url3 = WebUI.getUrl()

WebUI.verifyEqual(url3, 'https://sit.nextsix.com/properties-for-sale/kuala-lumpur/condo-serviced-residence')

//Johor
WebUI.navigateToUrl('https://sit.nextsix.com/')

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/summary_Condos  Serviced Residences for Sale'))

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/a_Condos  Serviced Residences for Sale in Johor'))

def url4 = WebUI.getUrl()

WebUI.verifyEqual(url4, 'https://sit.nextsix.com/properties-for-sale/johor/condo-serviced-residence')

//Penang
WebUI.navigateToUrl('https://sit.nextsix.com/')

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/summary_Condos  Serviced Residences for Sale'))

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/a_Condos  Serviced Residences for Sale in Penang'))

def url5 = WebUI.getUrl()

WebUI.verifyEqual(url5, 'https://sit.nextsix.com/properties-for-sale/penang/condo-serviced-residence')

//Putrajaya
WebUI.navigateToUrl('https://sit.nextsix.com/')

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/summary_Condos  Serviced Residences for Sale'))

'xxxxxxxxxxxxxxxxxxxxxxxxxx'
WebUI.scrollToPosition(0, 6)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/a_Condos  Serviced Residences for Sale in P_642512'))

def url6 = WebUI.getUrl()

WebUI.verifyEqual(url6, 'https://sit.nextsix.com/properties-for-sale/putrajaya/condo-serviced-residence')

//Melaka
WebUI.navigateToUrl('https://sit.nextsix.com/')

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/summary_Condos  Serviced Residences for Sale'))

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/a_Condos  Serviced Residences for Sale in Melaka'))

def url7 = WebUI.getUrl()

WebUI.verifyEqual(url7, 'https://sit.nextsix.com/properties-for-sale/melaka/condo-serviced-residence')

//Negeri Sembilan
WebUI.navigateToUrl('https://sit.nextsix.com/')

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/summary_Condos  Serviced Residences for Sale'))

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/a_Condos  Serviced Residences for Sale in N_9880ad'))

def url8 = WebUI.getUrl()

WebUI.verifyEqual(url8, 'https://sit.nextsix.com/properties-for-sale/negeri-sembilan/condo-serviced-residence')

//Sarawak
WebUI.navigateToUrl('https://sit.nextsix.com/')

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/summary_Condos  Serviced Residences for Sale'))

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/a_Condos  Serviced Residences for Sale in Sarawak'))

def url9 = WebUI.getUrl()

WebUI.verifyEqual(url9, 'https://sit.nextsix.com/properties-for-sale/sarawak/condo-serviced-residence')

//Kedah
WebUI.navigateToUrl('https://sit.nextsix.com/')

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/summary_Condos  Serviced Residences for Sale'))

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/a_Condos  Serviced Residences for Sale in Kedah'))

def url10 = WebUI.getUrl()

WebUI.verifyEqual(url10, 'https://sit.nextsix.com/properties-for-sale/kedah/condo-serviced-residence')

//Kelantan
WebUI.navigateToUrl('https://sit.nextsix.com/')

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/summary_Condos  Serviced Residences for Sale'))

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/a_Condos  Serviced Residences for Sale in Kelantan'))

def url11 = WebUI.getUrl()

WebUI.verifyEqual(url11, 'https://sit.nextsix.com/properties-for-sale/kelantan/condo-serviced-residence')

//Pahang
WebUI.navigateToUrl('https://sit.nextsix.com/')

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/summary_Condos  Serviced Residences for Sale'))

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/a_Condos  Serviced Residences for Sale in Pahang'))

def url12 = WebUI.getUrl()

WebUI.verifyEqual(url12, 'https://sit.nextsix.com/properties-for-sale/pahang/condo-serviced-residence')

//Perak
WebUI.navigateToUrl('https://sit.nextsix.com/')

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/summary_Condos  Serviced Residences for Sale'))

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/a_Condos  Serviced Residences for Sale in Perak'))

def url13 = WebUI.getUrl()

WebUI.verifyEqual(url13, 'https://sit.nextsix.com/properties-for-sale/perak/condo-serviced-residence')

//Perlis
WebUI.navigateToUrl('https://sit.nextsix.com/')

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/summary_Condos  Serviced Residences for Sale'))

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/a_Condos  Serviced Residences for Sale in Perlis'))

def url14 = WebUI.getUrl()

WebUI.verifyEqual(url14, 'https://sit.nextsix.com/properties-for-sale/perlis/condo-serviced-residence')

//Sabah
WebUI.navigateToUrl('https://sit.nextsix.com/')

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/summary_Condos  Serviced Residences for Sale'))

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/a_Condos  Serviced Residences for Sale in Sabah'))

def url15 = WebUI.getUrl()

WebUI.verifyEqual(url15, 'https://sit.nextsix.com/properties-for-sale/sabah/condo-serviced-residence')

//Terengganu
WebUI.navigateToUrl('https://sit.nextsix.com/')

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/summary_Condos  Serviced Residences for Sale'))

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/a_Condos  Serviced Residences for Sale in T_1a1705'))

def url16 = WebUI.getUrl()

WebUI.verifyEqual(url16, 'https://sit.nextsix.com/properties-for-sale/terengganu/condo-serviced-residence')

//Labuan
WebUI.navigateToUrl('https://sit.nextsix.com/')

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/summary_Condos  Serviced Residences for Sale'))

WebUI.scrollToElement(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/span_Copyright  2020-2022. The Next Six Sdn_555e03'), 
    30)

WebUI.click(findTestObject('Object Repository/Others OR/Web Footer URL/Web Footer URL (Condos and Serviced Residence for Sale)/Page_The Next Six (SIT)/a_Condos  Serviced Residences for Sale in Labuan'))

def url17 = WebUI.getUrl()

WebUI.verifyEqual(url17, 'https://sit.nextsix.com/properties-for-sale/labuan/condo-serviced-residence')

