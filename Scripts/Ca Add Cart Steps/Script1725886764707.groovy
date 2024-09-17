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

WebUI.click(findTestObject('Object Repository/Page_Homepage Farmasi Local/Ca Add Cart Steps/Page_Homepage  Farmasi/svg'))

WebUI.click(findTestObject('Object Repository/Page_Homepage Farmasi Local/Ca Add Cart Steps/Page_Homepage  Farmasi/input_Catalog_email'))

WebUI.setEncryptedText(findTestObject('Page_Homepage Farmasi Local/Ca Add Cart Steps/Page_Homepage  Farmasi/input_Catalog_email'), 
    '7kjyK8XPNTfXiTny+yvz+svcsaJKxLEy')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Homepage Farmasi Local/Ca Add Cart Steps/Page_Homepage  Farmasi/input_E-mail_passwordLogin'), 
    'Lj6COquByXHkrCnO0yj9Nw==')

WebUI.click(findTestObject('Object Repository/Page_Homepage Farmasi Local/Ca Add Cart Steps/Page_Homepage  Farmasi/span_Login'))

WebUI.click(findTestObject('Object Repository/Page_Homepage Farmasi Local/Ca Add Cart Steps/Page_Starter Kit  Farmasi/div_CT'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Homepage Farmasi Local/Ca Add Cart Steps/Page_Starter Kit  Farmasi/span_Profile'), 
    'Profile')

WebUI.click(findTestObject('Object Repository/Page_Homepage Farmasi Local/Ca Add Cart Steps/Page_Starter Kit  Farmasi/svg'))

WebUI.click(findTestObject('Object Repository/Page_Homepage Farmasi Local/Ca Add Cart Steps/Page_Basket  Farmasi/span_Delete All Items'))

WebUI.click(findTestObject('Object Repository/Page_Homepage Farmasi Local/Ca Add Cart Steps/Page_Basket  Farmasi/span_Yes, Delete It'))

WebUI.click(findTestObject('Object Repository/Page_Homepage Farmasi Local/Ca Add Cart Steps/Page_Basket  Farmasi/img'))

WebUI.click(findTestObject('Object Repository/Page_Homepage Farmasi Local/Ca Add Cart Steps/Page_Homepage  Farmasi/div_Makeup'))

WebUI.scrollToElement(findTestObject('Page_Homepage Farmasi Local/Ca Add Cart Steps/Page_Makeup  Farmasi/svg'), 0)

WebUI.click(findTestObject('Object Repository/Page_Homepage Farmasi Local/Ca Add Cart Steps/Page_Makeup  Farmasi/svg'))

WebUI.click(findTestObject('Object Repository/Page_Homepage Farmasi Local/Ca Add Cart Steps/Page_Makeup  Farmasi/div_Nutrition'))

WebUI.scrollToElement(findTestObject('Page_Homepage Farmasi Local/Ca Add Cart Steps/Page_Nutrition  Farmasi/svg'), 0)

WebUI.click(findTestObject('Page_Homepage Farmasi Local/Ca Add Cart Steps/Page_Makeup  Farmasi/svg'))

WebUI.click(findTestObject('Object Repository/Page_Homepage Farmasi Local/Ca Add Cart Steps/Page_Nutrition  Farmasi/svg'))

WebUI.click(findTestObject('Page_Homepage Farmasi Local/Ca Add Cart Steps/Page_Nutrition  Farmasi/cartButon'))

WebUI.click(findTestObject('Object Repository/Page_Homepage Farmasi Local/Ca Add Cart Steps/Page_Basket  Farmasi/button_14.95_styles_counterButton__hPMj0 false'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Homepage Farmasi Local/Ca Add Cart Steps/Page_Basket  Farmasi/input_29.90_styles_input__TfQ13'), 
    '')

WebUI.click(findTestObject('Object Repository/Page_Homepage Farmasi Local/Ca Add Cart Steps/Page_Basket  Farmasi/button_14.95_styles_counterButton__hPMj0 false'))

WebUI.click(findTestObject('Object Repository/Page_Homepage Farmasi Local/Ca Add Cart Steps/Page_Basket  Farmasi/button_14.95_styles_counterButton__hPMj0 false'))

WebUI.setText(findTestObject('Object Repository/Page_Homepage Farmasi Local/Ca Add Cart Steps/Page_Basket  Farmasi/input_29.90_styles_input__TfQ13'), 
    '1')

WebUI.sendKeys(findTestObject('Object Repository/Page_Homepage Farmasi Local/Ca Add Cart Steps/Page_Basket  Farmasi/input_29.90_styles_input__TfQ13'), 
    Keys.chord(Keys.ENTER))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Homepage Farmasi Local/Ca Add Cart Steps/Page_Basket  Farmasi/h5_(2 items)'), 
    '(2 items)')

WebUI.click(findTestObject('Object Repository/Page_Homepage Farmasi Local/Ca Add Cart Steps/Page_Basket  Farmasi/span_Checkout'))

WebUI.click(findTestObject('Object Repository/Page_Homepage Farmasi Local/Ca Add Cart Steps/Page_Checkout  Farmasi/span_Yes, Use It'))

WebUI.click(findTestObject('Object Repository/Page_Homepage Farmasi Local/Ca Add Cart Steps/Page_Checkout  Farmasi/span_Apply'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Homepage Farmasi Local/Ca Add Cart Steps/Page_Checkout  Farmasi/span_0.00'), 
    '$0.00')

WebUI.click(findTestObject('Object Repository/Page_Homepage Farmasi Local/Ca Add Cart Steps/Page_Checkout  Farmasi/input_Choose another way to pay_agreements'))

WebUI.click(findTestObject('Object Repository/Page_Homepage Farmasi Local/Ca Add Cart Steps/Page_Checkout  Farmasi/button_Checkout'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Homepage Farmasi Local/Ca Add Cart Steps/Page_Checkout Result  Farmasi/h4_Thank you for your order'), 
    'Thank you for your order!')

WebUI.click(findTestObject('Object Repository/Page_Homepage Farmasi Local/Ca Add Cart Steps/Page_Checkout Result  Farmasi/div_CT'))

WebUI.click(findTestObject('Object Repository/Page_Homepage Farmasi Local/Ca Add Cart Steps/Page_Checkout Result  Farmasi/span_My Orders'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Homepage Farmasi Local/Ca Add Cart Steps/Page_My Orders  Farmasi/h1_My Orders'), 
    'My Orders')

WebUI.click(findTestObject('Object Repository/Page_Homepage Farmasi Local/Ca Add Cart Steps/Page_My Orders  Farmasi/div_1Order Number CA-1292589109.09.2024 - 6_5f3ea1'))

WebUI.click(findTestObject('Object Repository/Page_Homepage Farmasi Local/Ca Add Cart Steps/Page_Order Detail  Farmasi/button_Cancel Order'))

WebUI.click(findTestObject('Object Repository/Page_Homepage Farmasi Local/Ca Add Cart Steps/Page_Order Detail  Farmasi/span_Yes, Cancel It'))

WebUI.click(findTestObject('Object Repository/Page_Homepage Farmasi Local/Ca Add Cart Steps/Page_Order Detail  Farmasi/div_Return Payment Type_styles_radio__4_6lP'))

WebUI.setText(findTestObject('Object Repository/Page_Homepage Farmasi Local/Ca Add Cart Steps/Page_Order Detail  Farmasi/textarea_t'), 
    't')

WebUI.setText(findTestObject('Object Repository/Page_Homepage Farmasi Local/Ca Add Cart Steps/Page_Order Detail  Farmasi/textarea_te'), 
    'te')

WebUI.setText(findTestObject('Object Repository/Page_Homepage Farmasi Local/Ca Add Cart Steps/Page_Order Detail  Farmasi/textarea_tes'), 
    'tes')

WebUI.setText(findTestObject('Object Repository/Page_Homepage Farmasi Local/Ca Add Cart Steps/Page_Order Detail  Farmasi/textarea_test'), 
    'test')

WebUI.click(findTestObject('Object Repository/Page_Homepage Farmasi Local/Ca Add Cart Steps/Page_Order Detail  Farmasi/span_Select'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Homepage Farmasi Local/Ca Add Cart Steps/Page_Order Detail  Farmasi/h4_Order Cancelled'), 
    'Order Cancelled')

WebUI.click(findTestObject('Object Repository/Page_Homepage Farmasi Local/Ca Add Cart Steps/Page_Order Detail  Farmasi/span_CT'))

WebUI.click(findTestObject('Object Repository/Page_Homepage Farmasi Local/Ca Add Cart Steps/Page_Order Detail  Farmasi/span_Sign Out'))

WebUI.closeBrowser()

