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

WebUI.click(findTestObject('Object Repository/Page_Starter Kit  Farmasi/div_Men'))

WebUI.click(findTestObject('Object Repository/Page_Men  Farmasi/svg'))

WebUI.click(findTestObject('Object Repository/Page_Men  Farmasi/svg_1'))

WebUI.click(findTestObject('Object Repository/Page_Men  Farmasi/div_5'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Basket  Farmasi/h2_Your Cart'))

WebUI.click(findTestObject('Object Repository/Page_Basket  Farmasi/span_Checkout'))

WebUI.click(findTestObject('Object Repository/Page_Checkout  Farmasi/span_See All'))

WebUI.click(findTestObject('Object Repository/Page_Checkout  Farmasi/span_Add a New Address'))

WebUI.click(findTestObject('Object Repository/Page_Checkout  Farmasi/div_Address Type'))

WebUI.click(findTestObject('Object Repository/Page_Checkout  Farmasi/input_Shipping Address_type'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Farmasi/input_Address Type_title'), 'otomasyon')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Farmasi/input_Address Label (i.e. Home, Work, etc.)_name'), 
    'katalon')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Farmasi/input_First Name_surname'), 'stdyo')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Farmasi/input_Last Name_phone'), '(234) 456-6776')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Farmasi/input_Mobile Phone_address'), 'tea')

WebUI.click(findTestObject('Object Repository/Page_Checkout  Farmasi/span_Tea Lake, Unorganized South Nipissing _1b1843'))

WebUI.click(findTestObject('Object Repository/Page_Checkout  Farmasi/span_Apply'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Checkout  Farmasi/h6_otomasyon'), 'otomasyon')

WebUI.click(findTestObject('Object Repository/Page_Checkout  Farmasi/div_asfsdaf_styles_cardHeaderRadio__LRBVj'))

WebUI.click(findTestObject('Object Repository/Page_Checkout  Farmasi/span_Select'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Checkout  Farmasi/h6_otomasyon'), 'otomasyon')

WebUI.click(findTestObject('Object Repository/Page_Checkout  Farmasi/div_asfsdaf_styles_cardHeaderRadio__LRBVj'))

WebUI.click(findTestObject('Object Repository/Page_Checkout  Farmasi/svg'))

WebUI.click(findTestObject('Object Repository/Page_Checkout  Farmasi/svg'))

WebUI.click(findTestObject('Object Repository/Page_Checkout  Farmasi/div_asfsdaf_styles_cardHeaderRadio__LRBVj'))

WebUI.click(findTestObject('Object Repository/Page_Checkout  Farmasi/svg'))

WebUI.click(findTestObject('Object Repository/Page_Checkout  Farmasi/div_asfsdaf_styles_cardHeaderRadio__LRBVj'))

WebUI.click(findTestObject('Object Repository/Page_Checkout  Farmasi/span_Edit'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Farmasi/input_Last Name_phone'), '(234) 456-6774')

WebUI.click(findTestObject('Object Repository/Page_Checkout  Farmasi/span_Apply'))

WebUI.click(findTestObject('Object Repository/Page_Checkout  Farmasi/span_Delete'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Checkout  Farmasi/h5_Delete Address'), 'Delete Address')

WebUI.click(findTestObject('Object Repository/Page_Checkout  Farmasi/span_Yes, Delete It'))

WebUI.verifyTextNotPresent('otomasyon', false)

WebUI.closeBrowser()

