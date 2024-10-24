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

WebUI.click(findTestObject('Object Repository/Cart Steps-Varyant_Sepet Tutar Sayı/Page_Homepage  Farmasi/svg'))

WebUI.setText(findTestObject('Object Repository/Cart Steps-Varyant_Sepet Tutar Sayı/Page_Homepage  Farmasi/input_EN_email'), 
    'testautomation@farmasitest.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Cart Steps-Varyant_Sepet Tutar Sayı/Page_Homepage  Farmasi/input_E-mail_passwordLogin'), 
    'Lj6COquByXHkrCnO0yj9Nw==')

WebUI.click(findTestObject('Object Repository/Cart Steps-Varyant_Sepet Tutar Sayı/Page_Homepage  Farmasi/button_Login'))

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('Object Repository/Cart Steps-Varyant_Sepet Tutar Sayı/Page_Starter Kit  Farmasi/img_EN_styles_image__qb0tG'), 
    3)

'profil ikonuna tıklanr'
WebUI.click(findTestObject('Object Repository/Cart Steps-Varyant_Sepet Tutar Sayı/Page_Starter Kit  Farmasi/img_EN_styles_image__qb0tG'))

'Log in olduğu sign out elementinden verify edilir'
WebUI.waitForElementVisible(findTestObject('Object Repository/Cart Steps-Varyant_Sepet Tutar Sayı/Page_Starter Kit  Farmasi/span_Sign Out'), 
    3)

WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps-Varyant_Sepet Tutar Sayı/Page_Starter Kit  Farmasi/span_Sign Out'))

'Varyantlı olan bir ürün kodu aranır'
WebUI.setText(findTestObject('Object Repository/Cart Steps-Varyant_Sepet Tutar Sayı/Page_Homepage  Farmasi/input_Hotlist_styles_searchInput__i1gZE false'), 
    '1001387')

WebUI.click(findTestObject('Object Repository/Cart Steps-Varyant_Sepet Tutar Sayı/Page_Homepage  Farmasi/svg_1'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Cart Steps-Varyant_Sepet Tutar Sayı/Page_Search Result for 1001387  Farmasi/svg'), 
    3)

WebUI.click(findTestObject('Object Repository/Cart Steps-Varyant_Sepet Tutar Sayı/Page_Search Result for 1001387  Farmasi/svg'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Cart Steps-Varyant_Sepet Tutar Sayı/Page_Search Result for 1001387  Farmasi/span_Add to Cart'), 
    3)

'default gelen ilk varyant sepete eklenir'
WebUI.click(findTestObject('Object Repository/Cart Steps-Varyant_Sepet Tutar Sayı/Page_Search Result for 1001387  Farmasi/span_Add to Cart'))

'2. renk seçilir'
WebUI.click(findTestObject('Object Repository/Cart Steps-Varyant_Sepet Tutar Sayı/Page_Search Result for 1001387  Farmasi/div_Color Variants_styles_variantPickerItem__DTB5D'))

'2. seçenek texti verify edilir'
WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps-Varyant_Sepet Tutar Sayı/Page_Search Result for 1001387  Farmasi/h6_Color Variants 02-Raisin'), 
    'Color Variants: 02-Raisin')

'addtocart butonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Cart Steps-Varyant_Sepet Tutar Sayı/Page_Search Result for 1001387  Farmasi/span_Add to Cart'))

'pencere kapatılır(sağ üst köşe x butonuna tıklanır)'
WebUI.click(findTestObject('Object Repository/Cart Steps-Varyant_Sepet Tutar Sayı/Page_Search Result for 1001387  Farmasi/svg_1_2'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Cart Steps-Varyant_Sepet Tutar Sayı/Page_Search Result for 1001387  Farmasi/svg_1'), 
    3)

'sepet ikonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Cart Steps-Varyant_Sepet Tutar Sayı/Page_Search Result for 1001387  Farmasi/svg_1'))

WebUI.delay(5)

'ürün isimleri verify edilir'
WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps-Varyant_Sepet Tutar Sayı/Page_Basket  Farmasi/h6_Creamy Lipstick - 01 Country Rose'), 
    'Creamy Lipstick - 01 Country Rose')

'ürün isimleri verify edilir'
WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps-Varyant_Sepet Tutar Sayı/Page_Basket  Farmasi/h6_Creamy Lipstick - 02  Raisin'), 
    'Creamy Lipstick - 02 Raisin')

'ürün fiyatı verify edilir'
WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps-Varyant_Sepet Tutar Sayı/Page_Basket  Farmasi/span_10.75'), 
    '$10.75')

'ürün fiyatı verify edilir'
WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps-Varyant_Sepet Tutar Sayı/Page_Basket  Farmasi/span_10.75_1'), 
    '$10.75')

'toplam fiyat verify edilir'
WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps-Varyant_Sepet Tutar Sayı/Page_Basket  Farmasi/span_21.50'), 
    '$21.50')

'+ butonuna basılır'
WebUI.click(findTestObject('Object Repository/Cart Steps-Varyant_Sepet Tutar Sayı/Page_Basket  Farmasi/Addtocart 1. ürün'))

WebUI.delay(5)

'ürün fiyatı verify edilir'
WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps-Varyant_Sepet Tutar Sayı/Page_Basket  Farmasi/span_21.50_1'), 
    '$21.50')

'toplam fiyat verify edilir'
WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps-Varyant_Sepet Tutar Sayı/Page_Basket  Farmasi/span_32.25'), 
    '$32.25')

'2. ürün için + butonuna basılır'
WebUI.click(findTestObject('Cart Steps-Varyant_Sepet Tutar Sayı/Page_Basket  Farmasi/addtocart 2. ürün'))

WebUI.delay(5)

'ürün fiyatı verify edilir'
WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps-Varyant_Sepet Tutar Sayı/Page_Basket  Farmasi/span_21.50_1_2'), 
    '$21.50')

'toplam fiyat verify edilir'
WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps-Varyant_Sepet Tutar Sayı/Page_Basket  Farmasi/span_43.00'), 
    '$43.00')

'- butonuna tıklanır'
WebUI.click(findTestObject('Cart Steps-Varyant_Sepet Tutar Sayı/Page_Basket  Farmasi/removebutton 1. ürün'))

WebUI.delay(5)

'ürün fiyatı verify edilir'
WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps-Varyant_Sepet Tutar Sayı/Page_Basket  Farmasi/span_10.75'), 
    '$10.75')

'toplam fiyat verify edilir'
WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps-Varyant_Sepet Tutar Sayı/Page_Basket  Farmasi/span_32.25'), 
    '$32.25')

'2. ürün - butonuna tıklanır'
WebUI.click(findTestObject('Cart Steps-Varyant_Sepet Tutar Sayı/Page_Basket  Farmasi/removebutton 2. ürün'))

WebUI.delay(5)

'ürün fiyatı verify edilir'
WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps-Varyant_Sepet Tutar Sayı/Page_Basket  Farmasi/span_10.75_1'), 
    '$10.75')

'toplam fiyat verify edilir'
WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps-Varyant_Sepet Tutar Sayı/Page_Basket  Farmasi/span_21.50'), 
    '$21.50')

WebUI.click(findTestObject('Object Repository/Cart Steps-Varyant_Sepet Tutar Sayı/Page_Basket  Farmasi/span_Delete All Items'))

WebUI.delay(2)

'All delete items butonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Cart Steps-Varyant_Sepet Tutar Sayı/Page_Basket  Farmasi/span_Yes, Delete It'))

WebUI.delay(2)

WebUI.closeBrowser()

