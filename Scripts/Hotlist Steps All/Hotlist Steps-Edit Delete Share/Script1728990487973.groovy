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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

// Projenin kök dizinini alın
String projectDir = RunConfiguration.getProjectDir()

// Ekran görüntüsünün kaydedileceği yolu belirleyin (örneğin: /Screenshots klasörü)
String screenshotPath = ((projectDir + '/Screenshots/') + System.currentTimeMillis()) + '.png'

try {
    WebUI.openBrowser('')

    WebUI.navigateToUrl('https://preprod.farmasi.ca/farmasi')

    WebUI.maximizeWindow()

    WebUI.click(findTestObject('Object Repository/Hotlist Steps-Edit Delete Share/Page_Homepage  Farmasi/svg'))

    WebUI.setText(findTestObject('Object Repository/Hotlist Steps-Edit Delete Share/Page_Homepage  Farmasi/input_EN_email'), 
        'siparis3@pinar.com')

    WebUI.setEncryptedText(findTestObject('Object Repository/Hotlist Steps-Edit Delete Share/Page_Homepage  Farmasi/input_E-mail_passwordLogin'), 
        'Lj6COquByXHkrCnO0yj9Nw==')

    WebUI.click(findTestObject('Object Repository/Hotlist Steps-Edit Delete Share/Page_Homepage  Farmasi/span_Login'))

    WebUI.delay(3)

    'profil ikonuna tıklanır'
    WebUI.click(findTestObject('Object Repository/Hotlist Steps-Edit Delete Share/Page_Starter Kit  Farmasi/img_EN_styles_image__qb0tG'))

    WebUI.waitForElementVisible(findTestObject('Object Repository/Hotlist Steps-Edit Delete Share/Page_Starter Kit  Farmasi/span_Hotlist'), 
        3)

    'Hotlist e tıklanır'
    WebUI.click(findTestObject('Object Repository/Hotlist Steps-Edit Delete Share/Page_Starter Kit  Farmasi/span_Hotlist'))

    WebUI.waitForElementVisible(findTestObject('Object Repository/Hotlist Steps-Edit Delete Share/Page_Wishlist  Farmasi/span_Add New List'), 
        5)

    'Add new list e tıklanır'
    WebUI.click(findTestObject('Object Repository/Hotlist Steps-Edit Delete Share/Page_Wishlist  Farmasi/span_Add New List'))

    WebUI.delay(3)

    'otomasyon texti yazılır'
    WebUI.setText(findTestObject('Object Repository/Hotlist Steps-Edit Delete Share/Page_Wishlist  Farmasi/input_Create a New List_wishlistName'), 
        'otomasyon')

    'create tıklanır'
    WebUI.click(findTestObject('Object Repository/Hotlist Steps-Edit Delete Share/Page_Wishlist  Farmasi/span_Create List'))

    WebUI.delay(3)

    'otomasyon texti verify ediliir'
    WebUI.verifyElementText(findTestObject('Object Repository/Hotlist Steps-Edit Delete Share/Page_Wishlist  Farmasi/h3_otomasyon'), 
        'otomasyon')

    'listeye tıklanır detay sayfasına gider'
    WebUI.click(findTestObject('Object Repository/Hotlist Steps-Edit Delete Share/Page_Wishlist  Farmasi/h3_otomasyon'))

    WebUI.delay(5)

    '+ butonu clickable kontrolü yapılır'
    WebUI.verifyElementClickable(findTestObject('Object Repository/Hotlist Steps-Edit Delete Share/Page_Wishlist Detail  Farmasi/svg'))

    'kalem butonu clickable kontrolü yapılır'
    WebUI.verifyElementClickable(findTestObject('Object Repository/Hotlist Steps-Edit Delete Share/Page_Wishlist Detail  Farmasi/svg_1'))

    'paylaş butonu clickable kontrolü yapılır'
    WebUI.verifyElementClickable(findTestObject('Object Repository/Hotlist Steps-Edit Delete Share/Page_Wishlist Detail  Farmasi/svg_1_2'))

    '+ butonuna tıklanır'
    WebUI.click(findTestObject('Object Repository/Hotlist Steps-Edit Delete Share/Page_Wishlist Detail  Farmasi/svg'))

    'sağda ki açılan frame verify edilir'
    WebUI.verifyElementVisible(findTestObject('Object Repository/Hotlist Steps-Edit Delete Share/Page_Wishlist Detail  Farmasi/h5_Add Product to List'))

    WebUI.setText(findTestObject('Object Repository/Hotlist Steps-Edit Delete Share/Page_Wishlist Detail  Farmasi/input_Add Product to List_styles_searchInpu_d23341'), 
        'shampoo')

    'arama butonuna tıklanır'
    WebUI.click(findTestObject('Object Repository/Hotlist Steps-Edit Delete Share/Page_Wishlist Detail  Farmasi/svg_1_2_3'))

    WebUI.delay(1)

    'ilk ürün add to list butonuna tıklar'
    WebUI.click(findTestObject('Object Repository/Hotlist Steps-Edit Delete Share/Page_Wishlist Detail  Farmasi/span_Add to List'))

    WebUI.delay(1)

    'ikinci ürün add to list butonuna tıklar'
    WebUI.click(findTestObject('Object Repository/Hotlist Steps-Edit Delete Share/Page_Wishlist Detail  Farmasi/span_Add to List_1'))

    WebUI.delay(1)

    'altta ki done butonuna tıklanır'
    WebUI.click(findTestObject('Object Repository/Hotlist Steps-Edit Delete Share/Page_Wishlist Detail  Farmasi/span_Done'))

    WebUI.delay(1)

    'ilk ürün 3 noktaya tıklanır'
    WebUI.click(findTestObject('Object Repository/Hotlist Steps-Edit Delete Share/Page_Wishlist Detail  Farmasi/svg_1_2_3_4'))

    WebUI.delay(1)

    'remove a tıklanır'
    WebUI.click(findTestObject('Object Repository/Hotlist Steps-Edit Delete Share/Page_Wishlist Detail  Farmasi/h6_Remove From List'))

    WebUI.delay(1)

    'yes delete e tıklanır'
    WebUI.click(findTestObject('Object Repository/Hotlist Steps-Edit Delete Share/Page_Wishlist Detail  Farmasi/span_Yes, Delete It'))

    WebUI.delay(1)

    'ürün yanında ki add clickable kontrolü yapılır'
    WebUI.verifyElementClickable(findTestObject('Object Repository/Hotlist Steps-Edit Delete Share/Page_Wishlist Detail  Farmasi/span_Add To Cart'))

    'üstte ki add all butonu clickable kontrolü yapılır'
    WebUI.verifyElementClickable(findTestObject('Object Repository/Hotlist Steps-Edit Delete Share/Page_Wishlist Detail  Farmasi/span_Add All to Cart'))

    'kalem butonuna tıklanır'
    WebUI.click(findTestObject('Object Repository/Hotlist Steps-Edit Delete Share/Page_Wishlist Detail  Farmasi/svg_1'))

    WebUI.delay(1)

    WebUI.setText(findTestObject('Object Repository/Hotlist Steps-Edit Delete Share/Page_Wishlist Detail  Farmasi/input_Change List Name_wishlistName'), 
        'otomasyonedit')

    WebUI.delay(1)

    'changename butonuna tıklanır'
    WebUI.click(findTestObject('Object Repository/Hotlist Steps-Edit Delete Share/Page_Wishlist Detail  Farmasi/span_Change Name'))

    WebUI.delay(3)

    'refresh yapmadan otomasyonedit i görmüyor, önce ki otomasyon yazısını görüyor hala'
    WebUI.refresh()

    WebUI.delay(5)

    'edit yazılı text verify edilir'
    WebUI.verifyElementText(findTestObject('Object Repository/Hotlist Steps-Edit Delete Share/Page_Wishlist Detail  Farmasi/h1_otomasyonedit'), 
        'otomasyonedit')

    'paylaş ikonuna tıklanır'
    WebUI.click(findTestObject('Object Repository/Hotlist Steps-Edit Delete Share/Page_Wishlist Detail  Farmasi/svg_1_2_3_4_5'))

    WebUI.delay(3)

    'text verify edilir'
    WebUI.verifyElementText(findTestObject('Object Repository/Hotlist Steps-Edit Delete Share/Page_Share your Hotlist  Farmasi/h1_Share your Hotlist'), 
        'Share your Hotlist')

    'copy butonu cliakable kontrolü yapılır'
    WebUI.verifyElementClickable(findTestObject('Object Repository/Hotlist Steps-Edit Delete Share/Page_Share your Hotlist  Farmasi/span_Copy'))

    'save butonu clickable kontrolü yapılır'
    WebUI.verifyElementClickable(findTestObject('Object Repository/Hotlist Steps-Edit Delete Share/Page_Share your Hotlist  Farmasi/span_Save'))

    WebUI.delay(1)

    'back to butonuna tıklanır'
    WebUI.click(findTestObject('Object Repository/Hotlist Steps-Edit Delete Share/Page_Share your Hotlist  Farmasi/span_Back to Hotlist Archive'))

    WebUI.delay(2)

    'profil ikonuna tıklanır'
    WebUI.click(findTestObject('Object Repository/Hotlist Steps-Edit Delete Share/Page_Wishlist Detail  Farmasi/img_EN_styles_image__qb0tG'))

    WebUI.delay(2)

    'hotlist e tıklanır'
    WebUI.click(findTestObject('Object Repository/Hotlist Steps-Edit Delete Share/Page_Wishlist Detail  Farmasi/span_Hotlist'))

    WebUI.waitForElementVisible(findTestObject('Hotlist Steps-Edit Delete Share/Page_Wishlist  Farmasi/svg'), 5)

    '3 noktaya tıklanır'
    WebUI.click(findTestObject('Object Repository/Hotlist Steps-Edit Delete Share/Page_Wishlist  Farmasi/svg'))

    WebUI.delay(2)

    'remove tıklanır'
    WebUI.click(findTestObject('Object Repository/Hotlist Steps-Edit Delete Share/Page_Wishlist  Farmasi/h6_Remove List'))

    WebUI.delay(2)

    'yes tıklanır'
    WebUI.click(findTestObject('Object Repository/Hotlist Steps-Edit Delete Share/Page_Wishlist  Farmasi/span_Yes, Delete It'))

    WebUI.delay(3)

    WebUI.closeBrowser()
}
catch (Exception e) {
    WebUI.takeScreenshot(screenshotPath)

    KeywordUtil.markFailedAndStop((('Bir hata oluştu: ' + e.getMessage()) + '\nEkran görüntüsü alındı: ') + screenshotPath)
} 
// Hata durumunda ekran görüntüsü al ve proje dizininde belirli bir klasöre kaydet
finally { 
    // Tarayıcıyı kapatma işlemi
    WebUI.closeBrowser()
}

