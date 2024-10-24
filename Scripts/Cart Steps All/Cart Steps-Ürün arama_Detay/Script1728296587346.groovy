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

WebUI.click(findTestObject('Object Repository/Cart Steps-Ürün arama_Detay/Page_Homepage  Farmasi/svg'))

WebUI.setText(findTestObject('Object Repository/Cart Steps-Ürün arama_Detay/Page_Homepage  Farmasi/input_EN_email'), 'testautomation@farmasitest.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Cart Steps-Ürün arama_Detay/Page_Homepage  Farmasi/input_E-mail_passwordLogin'), 
    'Lj6COquByXHkrCnO0yj9Nw==')

WebUI.click(findTestObject('Object Repository/Cart Steps-Ürün arama_Detay/Page_Homepage  Farmasi/span_Login'))

WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('Object Repository/Cart Steps-Ürün arama_Detay/Page_Starter Kit  Farmasi/img_EN_styles_image__qb0tG'), 
    5)

'Login olduğunu verify için profil ikonuna tıklayıp Sign out check edilir'
WebUI.click(findTestObject('Object Repository/Cart Steps-Ürün arama_Detay/Page_Starter Kit  Farmasi/img_EN_styles_image__qb0tG'))

'search yerine ürün kodu yazılır'
WebUI.setText(findTestObject('Object Repository/Cart Steps-Ürün arama_Detay/Page_Homepage  Farmasi/input_Hotlist_styles_searchInput__i1gZE false'), 
    '1119082')

WebUI.waitForElementVisible(findTestObject('Object Repository/Cart Steps-Ürün arama_Detay/Page_Homepage  Farmasi/span_Add To Cart'), 
    3)

'altta açılan pop-up kısmında add to cart yapılır'
WebUI.verifyElementClickable(findTestObject('Object Repository/Cart Steps-Ürün arama_Detay/Page_Homepage  Farmasi/span_Add To Cart'))

WebUI.click(findTestObject('Object Repository/Cart Steps-Ürün arama_Detay/Page_Homepage  Farmasi/span_Add To Cart'))

WebUI.delay(3)

'search ikonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Cart Steps-Ürün arama_Detay/Page_Homepage  Farmasi/svg_1'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Cart Steps-Ürün arama_Detay/Page_Search Result for 1119082  Farmasi/svg'), 
    5)

'add to cart clickable kontrolü yapılır'
WebUI.verifyElementClickable(findTestObject('Object Repository/Cart Steps-Ürün arama_Detay/Page_Search Result for 1119082  Farmasi/svg'))

'sol üstte 1 products verify edilir'
WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps-Ürün arama_Detay/Page_Search Result for 1119082  Farmasi/div_1 Products'), 
    '1 Products')

'add to cart butonuna tıklanır ve aynı ürün 2.defa sepete eklenmiş olur'
WebUI.click(findTestObject('Object Repository/Cart Steps-Ürün arama_Detay/Page_Search Result for 1119082  Farmasi/svg'))

WebUI.delay(3)

'ürün üstüne tıklanır ve ürün detay sayfasına gidilir'
WebUI.click(findTestObject('Object Repository/Cart Steps-Ürün arama_Detay/Page_Search Result for 1119082  Farmasi/img_Copy Link Address_styles_cardImg__783fd'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Cart Steps-Ürün arama_Detay/Page_Shield Man Shampoo  Farmasi/h1_Shield Man Shampoo'), 
    3)

'ürün detay sayfası açıldığı verify edilir'
WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps-Ürün arama_Detay/Page_Shield Man Shampoo  Farmasi/h1_Shield Man Shampoo'))

'ürün ismi verify edilir'
WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps-Ürün arama_Detay/Page_Shield Man Shampoo  Farmasi/h1_Shield Man Shampoo'), 
    'Shield Man Shampoo')

'ürün kodu verify edilir'
WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps-Ürün arama_Detay/Page_Shield Man Shampoo  Farmasi/span_1119082'), 
    '1119082')

'Altta ki Reviews butonu clickable kontrolü yapılır'
WebUI.verifyElementClickable(findTestObject('Object Repository/Cart Steps-Ürün arama_Detay/Page_Shield Man Shampoo  Farmasi/button_Reviews'))

'Altta ki Description butonu clickable kontrolü yapılır'
WebUI.verifyElementClickable(findTestObject('Object Repository/Cart Steps-Ürün arama_Detay/Page_Shield Man Shampoo  Farmasi/button_Description'))

'detay sayfasında da add to cart butonuna tıklanır(3.defa ürün eklenmiş oldu)'
WebUI.click(findTestObject('Object Repository/Cart Steps-Ürün arama_Detay/Page_Shield Man Shampoo  Farmasi/span_Add To Cart'))

WebUI.delay(2)

'+ butonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Cart Steps-Ürün arama_Detay/Page_Shield Man Shampoo  Farmasi/svg'))

WebUI.delay(2)

'add to cart butonuna tıklanır(bu adımda 2 tane daha eklendi, toplamda 5 olmalı)'
WebUI.click(findTestObject('Object Repository/Cart Steps-Ürün arama_Detay/Page_Shield Man Shampoo  Farmasi/span_Add To Cart'))

WebUI.delay(2)

'- butonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Cart Steps-Ürün arama_Detay/Page_Shield Man Shampoo  Farmasi/svg_1'))

WebUI.delay(2)

'sepet ikonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Cart Steps-Ürün arama_Detay/Page_Shield Man Shampoo  Farmasi/svg_1_2'))

WebUI.delay(20)

WebUI.waitForElementVisible(findTestObject('Cart Steps-Ürün arama_Detay/Page_Basket  Farmasi/h2_Your Cart'), 5)

'sepet sayfası verify edilir(your cart elementi ile)'
WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps-Ürün arama_Detay/Page_Basket  Farmasi/h2_Your Cart'))

'ürün ismi verify edilir'
WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps-Ürün arama_Detay/Page_Basket  Farmasi/h6_Shield Man Shampoo'), 
    'Shield Man Shampoo')

'ürün sayısı verify edilir'
WebUI.verifyElementAttributeValue(findTestObject('Cart Steps-Ürün arama_Detay/Page_Basket  Farmasi/input_40.00_styles_input__TfQ13'), 
    'data-value', '5', 3)

'ürün kodu verify edilir'
WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps-Ürün arama_Detay/Page_Basket  Farmasi/span_1119082'), 
    '1119082')

WebUI.click(findTestObject('Object Repository/Cart Steps-Ürün arama_Detay/Page_Basket  Farmasi/span_Delete All Items'))

WebUI.delay(2)

'sepet silinir'
WebUI.click(findTestObject('Object Repository/Cart Steps-Ürün arama_Detay/Page_Basket  Farmasi/span_Yes, Delete It'))

WebUI.delay(2)

WebUI.closeBrowser()

