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

WebUI.navigateToUrl('https://preprod.farmasi.ca/farmasi')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Homepage  Farmasi/svg'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Homepage  Farmasi/input_Catalog_email'), 0)

WebUI.click(findTestObject('Object Repository/Page_Homepage  Farmasi/input_Catalog_email'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Homepage  Farmasi/input_Catalog_email'), 'siparis3@pinar.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Homepage  Farmasi/input_E-mail_passwordLogin'), 'Lj6COquByXHkrCnO0yj9Nw==')

WebUI.click(findTestObject('Object Repository/Page_Homepage  Farmasi/span_Login'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Object Repository/Page_Starter Kit  Farmasi/img_EN_styles_image__qb0tG'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Starter Kit  Farmasi/span_My Addresses'))

WebUI.click(findTestObject('Object Repository/Page_Starter Kit  Farmasi/span_My Addresses'))

WebUI.click(findTestObject('Object Repository/Page_My Addresses  Farmasi/span_Add a New Address'))

WebUI.click(findTestObject('Object Repository/Page_My Addresses  Farmasi/div_Address Type'))

WebUI.click(findTestObject('Object Repository/Page_My Addresses  Farmasi/input_Billing Address_type'))

WebUI.setText(findTestObject('Object Repository/Page_My Addresses  Farmasi/input_Address Type_title'), 'Otomasyon')

WebUI.setText(findTestObject('Object Repository/Page_My Addresses  Farmasi/input_Address Label (i.e. Home, Work, etc.)_name'), 
    'Katalon')

WebUI.setText(findTestObject('Object Repository/Page_My Addresses  Farmasi/input_First Name_surname'), 'Studio')

WebUI.setText(findTestObject('Object Repository/Page_My Addresses  Farmasi/input_Last Name_phone'), '(345) 678-9097')

WebUI.setText(findTestObject('Object Repository/Page_My Addresses  Farmasi/input_Mobile Phone_address'), 'teston')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Addresses  Farmasi/span_Teston Road, Vaughan, ON, Canada'))

WebUI.click(findTestObject('Object Repository/Page_My Addresses  Farmasi/span_Teston Road, Vaughan, ON, Canada'))

WebUI.click(findTestObject('Object Repository/Page_My Addresses  Farmasi/div_Select ProvinceOntario'))

WebUI.click(findTestObject('Object Repository/Page_My Addresses  Farmasi/input_Address 2_search'))

WebUI.click(findTestObject('Object Repository/Page_My Addresses  Farmasi/input_Alberta_region'))

WebUI.scrollToElement(findTestObject('Page_My Addresses  Farmasi/input_Select City_postCode'), 5)

WebUI.click(findTestObject('Object Repository/Page_My Addresses  Farmasi/div_Select City'))

WebUI.click(findTestObject('Object Repository/Page_My Addresses  Farmasi/input_Abee_city'))

WebUI.setText(findTestObject('Object Repository/Page_My Addresses  Farmasi/input_Select City_postCode'), 'h5h 5h5')

WebUI.click(findTestObject('Object Repository/Page_My Addresses  Farmasi/span_Apply'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_My Addresses  Farmasi/h6_Otomasyon'), 'Otomasyon')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_My Addresses  Farmasi/span_Edit'))

WebUI.click(findTestObject('Object Repository/Page_My Addresses  Farmasi/span_Edit'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Addresses  Farmasi/h5_Edit Address'))

WebUI.click(findTestObject('Object Repository/Page_My Addresses  Farmasi/span_Apply'))

WebUI.click(findTestObject('Object Repository/Page_My Addresses  Farmasi/span_Delete'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_My Addresses  Farmasi/h5_Delete Address'), 'Delete Address')

WebUI.click(findTestObject('Object Repository/Page_My Addresses  Farmasi/span_Yes, Delete It'))

WebUI.verifyTextNotPresent('Otomasyon', false)

WebUI.closeBrowser()

