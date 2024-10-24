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

WebUI.click(findTestObject('Object Repository/Hotlist Steps-From Product to Hotlist Create/Page_Homepage  Farmasi/svg'))

WebUI.setText(findTestObject('Object Repository/Hotlist Steps-From Product to Hotlist Create/Page_Homepage  Farmasi/input_EN_email'), 
    'testautomation@farmasitest.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Hotlist Steps-From Product to Hotlist Create/Page_Homepage  Farmasi/input_E-mail_passwordLogin'), 
    'Lj6COquByXHkrCnO0yj9Nw==')

WebUI.click(findTestObject('Object Repository/Hotlist Steps-From Product to Hotlist Create/Page_Homepage  Farmasi/span_Login'))

WebUI.delay(5)

'Hair Submenü mouse over yapılır'
WebUI.mouseOver(findTestObject('Object Repository/Hotlist Steps-From Product to Hotlist Create/Page_Homepage  Farmasi/div_Hair Care'))

'shampoo tıklanır'
WebUI.click(findTestObject('Object Repository/Hotlist Steps-From Product to Hotlist Create/Page_Homepage  Farmasi/div_Shampoo'))

WebUI.delay(5)

WebUI.scrollToPosition(0, 400)

WebUI.delay(4)

'ilk ürün kalp butonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Hotlist Steps-From Product to Hotlist Create/Page_Shampoo  Farmasi/svg_1'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Hotlist Steps-From Product to Hotlist Create/Page_Shampoo  Farmasi/h5_Choose Shade and Add to Your Hotlist'), 
    3)

'choose shade ekranının açıldığı verify edilir'
WebUI.verifyElementVisible(findTestObject('Object Repository/Hotlist Steps-From Product to Hotlist Create/Page_Shampoo  Farmasi/h5_Choose Shade and Add to Your Hotlist'))

'create new list butonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Hotlist Steps-From Product to Hotlist Create/Page_Shampoo  Farmasi/span_Create a New List'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Hotlist Steps-From Product to Hotlist Create/Page_Shampoo  Farmasi/h5_Create a New List'), 
    3)

'create new list ekranı verify edilir'
WebUI.verifyElementVisible(findTestObject('Object Repository/Hotlist Steps-From Product to Hotlist Create/Page_Shampoo  Farmasi/h5_Create a New List'))

'otomasyon yazılır'
WebUI.setText(findTestObject('Object Repository/Hotlist Steps-From Product to Hotlist Create/Page_Shampoo  Farmasi/input_Create a New List_wishlistName'), 
    'otomasyon')

WebUI.delay(3)

'create list butonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Hotlist Steps-From Product to Hotlist Create/Page_Shampoo  Farmasi/span_Create List'))

WebUI.delay(3)

'ekranda otomasyon elementi verify edilir'
WebUI.verifyElementVisible(findTestObject('Object Repository/Hotlist Steps-From Product to Hotlist Create/Page_Shampoo  Farmasi/h6_otomasyon'))

'yanında ki checkbox  checked olduğu verify edilir'
WebUI.verifyElementChecked(findTestObject('Hotlist Steps-From Product to Hotlist Create/Page_Shampoo  Farmasi/otomasyon checkbox'), 
    3)

'sağ üst köşe x butonu ile pencere kapatılır'
WebUI.click(findTestObject('Object Repository/Hotlist Steps-From Product to Hotlist Create/Page_Shampoo  Farmasi/svg_1_2'))

WebUI.delay(1)

'ilk ürün kalp butonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Hotlist Steps-From Product to Hotlist Create/Page_Shampoo  Farmasi/svg_1'))

WebUI.delay(1)

'listede ki 2. listeye de eklenmesi için 2. checkbox a tıklanır'
WebUI.click(findTestObject('Object Repository/Hotlist Steps-From Product to Hotlist Create/Page_Shampoo  Farmasi/input_otomasyon_id'))

WebUI.delay(1)

'select butonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Hotlist Steps-From Product to Hotlist Create/Page_Shampoo  Farmasi/span_Select'))

WebUI.delay(1)

'thank you ve added mesajı ekranı verify edilir ve tıklanır'
WebUI.click(findTestObject('Object Repository/Hotlist Steps-From Product to Hotlist Create/Page_Shampoo  Farmasi/span_Ok, Thank You'))

WebUI.delay(1)

'profil ikonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Hotlist Steps-From Product to Hotlist Create/Page_Shampoo  Farmasi/img_EN_styles_image__qb0tG'))

WebUI.delay(1)

'Hotlist e tıklanır'
WebUI.click(findTestObject('Object Repository/Hotlist Steps-From Product to Hotlist Create/Page_Shampoo  Farmasi/span_Hotlist'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Hotlist Steps-From Product to Hotlist Create/Page_Wishlist  Farmasi/svg'), 
    5)

'otomasyon yanında li 3 noktaya tıklanır'
WebUI.click(findTestObject('Object Repository/Hotlist Steps-From Product to Hotlist Create/Page_Wishlist  Farmasi/svg'))

WebUI.delay(1)

WebUI.verifyElementVisible(findTestObject('Hotlist Steps-From Product to Hotlist Create/Page_Wishlist  Farmasi/otomasyonhotlist'))

'remove a tıklanır'
WebUI.click(findTestObject('Object Repository/Hotlist Steps-From Product to Hotlist Create/Page_Wishlist  Farmasi/h6_Remove List'))

WebUI.delay(1)

'yes delete e tıklanır'
WebUI.click(findTestObject('Object Repository/Hotlist Steps-From Product to Hotlist Create/Page_Wishlist  Farmasi/span_Yes, Delete It'))

WebUI.delay(2)

WebUI.refresh()

WebUI.delay(7)

WebUI.verifyElementNotPresent(findTestObject('Hotlist Steps-From Product to Hotlist Create/Page_Wishlist  Farmasi/otomasyonhotlist'), 
    3)

WebUI.click(findTestObject('Hotlist Steps-From Product to Hotlist Create/Page_Wishlist  Farmasi/Hotlist başlık'))

WebUI.delay(2)

WebUI.click(findTestObject('Hotlist Steps-From Product to Hotlist Create/Page_Wishlist  Farmasi/3nokta ilk ürün'))

WebUI.delay(2)

WebUI.click(findTestObject('Hotlist Steps-From Product to Hotlist Create/Page_Wishlist  Farmasi/removebutonu'))

WebUI.delay(2)

WebUI.click(findTestObject('Hotlist Steps-From Product to Hotlist Create/Page_Wishlist  Farmasi/yesdeletebutonu'))

WebUI.delay(2)

WebUI.closeBrowser()

