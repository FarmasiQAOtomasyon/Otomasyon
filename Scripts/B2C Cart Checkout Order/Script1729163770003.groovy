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

WebUI.click(findTestObject('Object Repository/B2C Cart Checkout Order/Page_Homepage  Farmasi/svg'))

WebUI.setText(findTestObject('Object Repository/B2C Cart Checkout Order/Page_Homepage  Farmasi/input_EN_email'), 'beynacanlitestca@test.com')

WebUI.setEncryptedText(findTestObject('Object Repository/B2C Cart Checkout Order/Page_Homepage  Farmasi/input_E-mail_passwordLogin'), 
    'Lj6COquByXHkrCnO0yj9Nw==')

WebUI.click(findTestObject('Object Repository/B2C Cart Checkout Order/Page_Homepage  Farmasi/span_Login'))

WebUI.waitForElementVisible(findTestObject('Object Repository/B2C Cart Checkout Order/Page_Homepage  Farmasi/span_Ok, I got it'), 
    5)

'ilk girince çıkan pop up a ok tıklanır'
WebUI.click(findTestObject('Object Repository/B2C Cart Checkout Order/Page_Homepage  Farmasi/span_Ok, I got it'))

WebUI.waitForElementVisible(findTestObject('Object Repository/B2C Cart Checkout Order/Page_Homepage  Farmasi/div_Hair Care'), 
    5)

'Hair submenü mouse over yapılır'
WebUI.mouseOver(findTestObject('Object Repository/B2C Cart Checkout Order/Page_Homepage  Farmasi/div_Hair Care'))

WebUI.delay(2)

'Shampoo tıklanır'
WebUI.click(findTestObject('Object Repository/B2C Cart Checkout Order/Page_Homepage  Farmasi/div_Shampoo'))

WebUI.waitForElementVisible(findTestObject('Object Repository/B2C Cart Checkout Order/Page_Shampoo  Farmasi/svg'), 5)

WebUI.scrollToPosition(0, 300)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/B2C Cart Checkout Order/Page_Shampoo  Farmasi/svg'))

WebUI.delay(3)

'sepet ikonuna tıklanır'
WebUI.click(findTestObject('Object Repository/B2C Cart Checkout Order/Page_Shampoo  Farmasi/svg_1'))

WebUI.delay(3)

'ürün elementi verify edilir'
WebUI.verifyElementVisible(findTestObject('Object Repository/B2C Cart Checkout Order/Page_Basket  Farmasi/h6_Shield Man Shampoo'))

'delete all items butonu clickable kontrolü yapılır'
WebUI.verifyElementClickable(findTestObject('Object Repository/B2C Cart Checkout Order/Page_Basket  Farmasi/span_Delete All Items'))

'continue shopping  butonu clickable kontrolü yapılır'
WebUI.verifyElementClickable(findTestObject('Object Repository/B2C Cart Checkout Order/Page_Basket  Farmasi/span_Continue Shopping'))

'total price elementi verify edilir'
WebUI.verifyElementVisible(findTestObject('Object Repository/B2C Cart Checkout Order/Page_Basket  Farmasi/span_Total Retail Price'))

'Kalp butonu clickable kontrolü yapılır'
WebUI.verifyElementClickable(findTestObject('Object Repository/B2C Cart Checkout Order/Page_Basket  Farmasi/svg'))

'+ butonu clickable kontrolü yapılır'
WebUI.verifyElementClickable(findTestObject('Object Repository/B2C Cart Checkout Order/Page_Basket  Farmasi/svg_1'))

'çöp kutus butonu clickable kontrolü yapılır'
WebUI.verifyElementClickable(findTestObject('Object Repository/B2C Cart Checkout Order/Page_Basket  Farmasi/svg_1_2'))

'Remove butonu clickable kontrolü yapılır'
WebUI.verifyElementClickable(findTestObject('Object Repository/B2C Cart Checkout Order/Page_Basket  Farmasi/span_Remove'))

'puan türlerinin olmadığı verify edilir'
WebUI.verifyElementNotPresent(findTestObject('B2C Cart Checkout Order/Page_Basket  Farmasi/Point 1'), 0)

'puan türlerinin olmadığı verify edilir'
WebUI.verifyElementNotPresent(findTestObject('B2C Cart Checkout Order/Page_Basket  Farmasi/Point 2'), 0)

WebUI.click(findTestObject('Object Repository/B2C Cart Checkout Order/Page_Basket  Farmasi/span_Checkout'))

WebUI.delay(5)

'puan türlerinin olmadığı verify edilir'
WebUI.verifyElementNotPresent(findTestObject('B2C Cart Checkout Order/Page_Basket  Farmasi/Point 1'), 0)

'puan türlerinin olmadığı verify edilir'
WebUI.verifyElementNotPresent(findTestObject('B2C Cart Checkout Order/Page_Basket  Farmasi/Point 2'), 0)

'add new adress clickable kontrolü yapılır'
WebUI.verifyElementClickable(findTestObject('Object Repository/B2C Cart Checkout Order/Page_Checkout  Farmasi/span_Add a new one'))

WebUI.scrollToPosition(0, 300)

WebUI.delay(3)

'contract checkbox tıklanır'
WebUI.click(findTestObject('Object Repository/B2C Cart Checkout Order/Page_Checkout  Farmasi/input_Choose another way to pay_agreements'))

'wallet yes use it tıklanır'
WebUI.click(findTestObject('Object Repository/B2C Cart Checkout Order/Page_Checkout  Farmasi/span_Yes, Use It'))

'cancel using balance clickable kontrolü yapılır'
WebUI.verifyElementClickable(findTestObject('Object Repository/B2C Cart Checkout Order/Page_Checkout  Farmasi/p_Cancel Using Balance'))

'apply butonuna tıklanır'
WebUI.click(findTestObject('Object Repository/B2C Cart Checkout Order/Page_Checkout  Farmasi/button_Apply'))

WebUI.delay(7)

'0 ücret text verify edilir'
WebUI.verifyElementText(findTestObject('Object Repository/B2C Cart Checkout Order/Page_Checkout  Farmasi/span_0.00'), '$0.00')

'checkout tıklanır'
WebUI.click(findTestObject('Object Repository/B2C Cart Checkout Order/Page_Checkout  Farmasi/span_Checkout'))

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('Object Repository/B2C Cart Checkout Order/Page_Checkout Result  Farmasi/h4_Thank you for your order'), 
    10)

WebUI.verifyElementText(findTestObject('Object Repository/B2C Cart Checkout Order/Page_Checkout Result  Farmasi/h4_Thank you for your order'), 
    'Thank you for your order!')

'ücret ve tax textleri verify edilir'
WebUI.verifyElementText(findTestObject('Object Repository/B2C Cart Checkout Order/Page_Checkout Result  Farmasi/h6_Total Product Price'), 
    'Total Product Price')

'ücret ve tax textleri verify edilir'
WebUI.verifyElementText(findTestObject('Object Repository/B2C Cart Checkout Order/Page_Checkout Result  Farmasi/h6_Shipping Costs'), 
    'Shipping Costs')

'ücret ve tax textleri verify edilir'
WebUI.verifyElementText(findTestObject('Object Repository/B2C Cart Checkout Order/Page_Checkout Result  Farmasi/h6_Sales Tax'), 
    'Sales Tax')

'my orders a tıklanır'
WebUI.click(findTestObject('Object Repository/B2C Cart Checkout Order/Page_Checkout Result  Farmasi/a_My Orders'))

WebUI.delay(5)

'order detail için ürün üstüne tıklanır'
WebUI.click(findTestObject('Object Repository/B2C Cart Checkout Order/Page_My Orders  Farmasi/div_1Order Number CA-1338230910.17.2024 - 8_28486c'))

WebUI.delay(5)

'puan türlerinin olmadığı verify edilir'
WebUI.verifyElementNotPresent(findTestObject('B2C Cart Checkout Order/Page_Order Detail  Farmasi/Total Point'), 0)

'puan türlerinin olmadığı verify edilir'
WebUI.verifyElementNotPresent(findTestObject('B2C Cart Checkout Order/Page_Order Detail  Farmasi/Point below'), 0)

'Cancel order a tıklanır'
WebUI.click(findTestObject('Object Repository/B2C Cart Checkout Order/Page_Order Detail  Farmasi/span_Cancel Order'))

WebUI.delay(1)

'Yes tıklanır'
WebUI.click(findTestObject('Object Repository/B2C Cart Checkout Order/Page_Order Detail  Farmasi/span_Yes, Cancel It'))

WebUI.delay(1)

'wallet radio button seçilir'
WebUI.click(findTestObject('Object Repository/B2C Cart Checkout Order/Page_Order Detail  Farmasi/span_Farmasi Wallet'))

WebUI.delay(1)

'açıklamaya test yazılır'
WebUI.setText(findTestObject('Object Repository/B2C Cart Checkout Order/Page_Order Detail  Farmasi/textarea_Test'), 'Test')

WebUI.delay(1)

'select tıklanır'
WebUI.click(findTestObject('Object Repository/B2C Cart Checkout Order/Page_Order Detail  Farmasi/span_Select'))

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('Object Repository/B2C Cart Checkout Order/Page_Order Detail  Farmasi/h4_Order Cancelled'), 
    5)

'Order canceled verify edilir'
WebUI.verifyElementText(findTestObject('Object Repository/B2C Cart Checkout Order/Page_Order Detail  Farmasi/h4_Order Cancelled'), 
    'Order Cancelled')

WebUI.delay(3)

WebUI.closeBrowser()

