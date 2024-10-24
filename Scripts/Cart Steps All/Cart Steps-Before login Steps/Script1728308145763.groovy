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

'Nutrition submenüye mouse over yapar'
WebUI.mouseOver(findTestObject('Object Repository/Cart Steps-Before login Steps/Page_Homepage  Farmasi/div_Nutrition'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Cart Steps-Before login Steps/Page_Homepage  Farmasi/div_Shakes'))

'shakes başlığına tıklar'
WebUI.click(findTestObject('Object Repository/Cart Steps-Before login Steps/Page_Homepage  Farmasi/div_Shakes'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Cart Steps-Before login Steps/Page_Shakes  Farmasi/h4_Shakes'), 
    5)

WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps-Before login Steps/Page_Shakes  Farmasi/h4_Shakes'))

WebUI.scrollToPosition(0, 300)

'birinci ürünü sepete ekler'
WebUI.click(findTestObject('Object Repository/Cart Steps-Before login Steps/Page_Shakes  Farmasi/svg'))

'ikinci ürünü sepete ekler'
WebUI.click(findTestObject('Object Repository/Cart Steps-Before login Steps/Page_Shakes  Farmasi/svg_1'))

'sepet ikonuna tıklar'
WebUI.click(findTestObject('Object Repository/Cart Steps-Before login Steps/Page_Shakes  Farmasi/path'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Cart Steps-Before login Steps/Page_Basket  Farmasi/h2_Your Cart'), 
    5)

WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps-Before login Steps/Page_Basket  Farmasi/h2_Your Cart'))

a = WebUI.getText(findTestObject('Object Repository/Cart Steps-Before login Steps/Page_Basket  Farmasi/span_113.00'))

'Order summary kısmı 4 adet puan ve isimlerin olmadığı verify edilir'
WebUI.verifyElementNotPresent(findTestObject('Object Repository/Cart Steps-Before login Steps/Page_Basket  Farmasi/Available Incentive Points'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Cart Steps-Before login Steps/Page_Basket  Farmasi/Total PV From This Order'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Cart Steps-Before login Steps/Page_Basket  Farmasi/IP elementi'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Cart Steps-Before login Steps/Page_Basket  Farmasi/PV elementi'), 
    0)

firstproduct = WebUI.getText(findTestObject('Cart Steps-Before login Steps/Page_Basket  Farmasi/Productnamefirst'))

secondproduct = WebUI.getText(findTestObject('Cart Steps-Before login Steps/Page_Basket  Farmasi/ProductnameSecond'))

'bu adımdan sonra log in olma işlemi var'
WebUI.click(findTestObject('Object Repository/Cart Steps-Before login Steps/Page_Basket  Farmasi/svg'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Cart Steps-Before login Steps/Page_Basket  Farmasi/span_Login'), 
    3)

WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps-Before login Steps/Page_Basket  Farmasi/span_Login'))

WebUI.setText(findTestObject('Object Repository/Cart Steps-Before login Steps/Page_Basket  Farmasi/input_EN_email'), 'testautomation@farmasitest.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Cart Steps-Before login Steps/Page_Basket  Farmasi/input_E-mail_passwordLogin'), 
    'Lj6COquByXHkrCnO0yj9Nw==')

WebUI.click(findTestObject('Object Repository/Cart Steps-Before login Steps/Page_Basket  Farmasi/span_Login'))

WebUI.delay(9)

'sepet ikonuna tıklar'
WebUI.click(findTestObject('Object Repository/Cart Steps-Before login Steps/Page_Starter Kit  Farmasi/svg'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Cart Steps-Before login Steps/Page_Basket  Farmasi/h2_Your Cart'), 
    3)

WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps-Before login Steps/Page_Basket  Farmasi/h2_Your Cart'))

firstproductLogin = WebUI.getText(findTestObject('Cart Steps-Before login Steps/Page_Basket  Farmasi/Productnamefirst'))

secondproductLogin = WebUI.getText(findTestObject('Cart Steps-Before login Steps/Page_Basket  Farmasi/ProductnameSecond'))

WebUI.verifyEqual(firstproduct, firstproductLogin)

WebUI.verifyEqual(secondproduct, secondproductLogin)

b = WebUI.getText(findTestObject('Object Repository/Cart Steps-Before login Steps/Page_Basket  Farmasi/span_63.00'))

'fiyatın log in öncesine göre farklı olduğu verify edilir'
WebUI.verifyNotEqual(a, b)

'Order summary kısmı 4 adet puan ve isimleri verify edilir'
WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps-Before login Steps/Page_Basket  Farmasi/Available Incentive Points'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps-Before login Steps/Page_Basket  Farmasi/Total PV From This Order'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps-Before login Steps/Page_Basket  Farmasi/IP elementi'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps-Before login Steps/Page_Basket  Farmasi/PV elementi'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Cart Steps-Before login Steps/Page_Basket  Farmasi/span_Delete All Items'))

WebUI.click(findTestObject('Object Repository/Cart Steps-Before login Steps/Page_Basket  Farmasi/span_Delete All Items'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Cart Steps-Before login Steps/Page_Basket  Farmasi/h5_Delete Your Cart'), 
    3)

WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps-Before login Steps/Page_Basket  Farmasi/h5_Delete Your Cart'))

WebUI.click(findTestObject('Object Repository/Cart Steps-Before login Steps/Page_Basket  Farmasi/span_Yes, Delete It'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Cart Steps-Before login Steps/Page_Basket  Farmasi/h2_Cart Empty'), 
    3)

WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps-Before login Steps/Page_Basket  Farmasi/h2_Cart Empty'))

WebUI.click(findTestObject('Object Repository/Cart Steps-Before login Steps/Page_Basket  Farmasi/img_EN_styles_image__qb0tG'))

WebUI.click(findTestObject('Object Repository/Cart Steps-Before login Steps/Page_Basket  Farmasi/span_Sign Out'))

WebUI.closeBrowser()

