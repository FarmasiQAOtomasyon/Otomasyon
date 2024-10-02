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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration

// Projenin kök dizinini alın
String projectDir = RunConfiguration.getProjectDir()

// Ekran görüntüsünün kaydedileceği yolu belirleyin (örneğin: /Screenshots klasörü)
String screenshotPath = projectDir + '/Screenshots/' + System.currentTimeMillis() + '.png'

try {
WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://preprod.farmasi.ca/farmasi')

WebUI.click(findTestObject('Object Repository/Hotlist Steps/Page_Homepage  Farmasi/svg'))

WebUI.setText(findTestObject('Object Repository/Hotlist Steps/Page_Homepage  Farmasi/input_EN_email'), 'siparis3@pinar.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Hotlist Steps/Page_Homepage  Farmasi/input_E-mail_passwordLogin'), 
    'Lj6COquByXHkrCnO0yj9Nw==')

WebUI.click(findTestObject('Object Repository/Hotlist Steps/Page_Homepage  Farmasi/span_Login'))

WebUI.waitForPageLoad(3)

'profil ikonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Hotlist Steps/Page_Starter Kit  Farmasi/img_EN_styles_image__qb0tG'))

'menü de hotlist clickable kontrol edilir ve tıklanır'
WebUI.verifyElementClickable(findTestObject('Object Repository/Hotlist Steps/Page_Starter Kit  Farmasi/span_Hotlist'))

WebUI.click(findTestObject('Object Repository/Hotlist Steps/Page_Starter Kit  Farmasi/span_Hotlist'))

WebUI.waitForPageLoad(3)

WebUI.verifyElementText(findTestObject('Object Repository/Hotlist Steps/Page_Wishlist  Farmasi/h1_Hotlist'), 'Hotlist')

WebUI.verifyElementClickable(findTestObject('Object Repository/Hotlist Steps/Page_Wishlist  Farmasi/span_Add New List'))

'new list create etme butonuna tıklanır\n'
WebUI.click(findTestObject('Object Repository/Hotlist Steps/Page_Wishlist  Farmasi/span_Add New List'))

WebUI.waitForElementVisible(findTestObject('Hotlist Steps/Page_Wishlist  Farmasi/h5_Create a New List'), 3)

WebUI.verifyElementText(findTestObject('Object Repository/Hotlist Steps/Page_Wishlist  Farmasi/h5_Create a New List'), 'Create a New List')

WebUI.setText(findTestObject('Object Repository/Hotlist Steps/Page_Wishlist  Farmasi/input_Create a New List_wishlistName'), 
    'otomasyon')

WebUI.click(findTestObject('Object Repository/Hotlist Steps/Page_Wishlist  Farmasi/span_Create List'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Hotlist Steps/Page_Wishlist  Farmasi/h3_otomasyon'), 3)

WebUI.verifyElementVisible(findTestObject('Object Repository/Hotlist Steps/Page_Wishlist  Farmasi/h3_otomasyon'))

'create edilen otomasyon adlı listenin üstüne tıklanıp içine girilir\n'
WebUI.click(findTestObject('Object Repository/Hotlist Steps/Page_Homepage  Farmasi/h3_otomasyon'))

WebUI.waitForPageLoad(3)

WebUI.verifyElementText(findTestObject('Object Repository/Hotlist Steps/Page_Wishlist Detail  Farmasi/h1_otomasyon'), 'otomasyon')

'+ simgesine tıklanır ve ürün ekleme penceresi açılır'
WebUI.click(findTestObject('Object Repository/Hotlist Steps/Page_Wishlist Detail  Farmasi/svg'))

WebUI.waitForElementVisible(findTestObject('Hotlist Steps/Page_Wishlist Detail  Farmasi/h5_Add Product to List'), 3)

WebUI.verifyElementText(findTestObject('Object Repository/Hotlist Steps/Page_Wishlist Detail  Farmasi/h5_Add Product to List'), 
    'Add Product to List')

WebUI.setText(findTestObject('Object Repository/Hotlist Steps/Page_Wishlist Detail  Farmasi/input_Add Product to List_styles_searchInpu_d23341'), 
    'mascara')

'arama butonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Hotlist Steps/Page_Wishlist Detail  Farmasi/svg_1'))

'mascara yazılıp herhangi bir ürün eklenir'
WebUI.click(findTestObject('Object Repository/Hotlist Steps/Page_Wishlist Detail  Farmasi/span_Add to List'))

WebUI.click(findTestObject('Object Repository/Hotlist Steps/Page_Wishlist Detail  Farmasi/span_Done'))

WebUI.verifyElementText(findTestObject('Object Repository/Hotlist Steps/Page_Wishlist Detail  Farmasi/h5_1 Product'), '1 Product')

WebUI.verifyElementClickable(findTestObject('Object Repository/Hotlist Steps/Page_Wishlist Detail  Farmasi/span_Add All to Cart'))

'add all to cart ve add to cart butonları clikable kontrol edilir'
WebUI.verifyElementClickable(findTestObject('Object Repository/Hotlist Steps/Page_Wishlist Detail  Farmasi/span_Add To Cart'))

'kalem simgesine tıklanır ve  isim düzenleme açıldığı görülür'
WebUI.click(findTestObject('Object Repository/Hotlist Steps/Page_Wishlist Detail  Farmasi/svg_1_2_3'))

WebUI.waitForElementVisible(findTestObject('Hotlist Steps/Page_Wishlist Detail  Farmasi/h5_Change List Name'), 3)

WebUI.verifyElementText(findTestObject('Object Repository/Hotlist Steps/Page_Wishlist Detail  Farmasi/h5_Change List Name'), 
    'Change List Name')

WebUI.setText(findTestObject('Object Repository/Hotlist Steps/Page_Wishlist Detail  Farmasi/input_Change List Name_wishlistName'), 
    'otomasyon2')

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Hotlist Steps/Page_Wishlist Detail  Farmasi/span_Change Name'))

WebUI.refresh()

WebUI.waitForElementVisible(findTestObject('Hotlist Steps/Page_Wishlist Detail  Farmasi/h1_otomasyon2'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Hotlist Steps/Page_Wishlist Detail  Farmasi/h1_otomasyon2'), 'otomasyon2')

'paylaş ikonuna tıklanır ve liste paylaşma fonksiyonları butonları kontrol edilir'
WebUI.click(findTestObject('Object Repository/Hotlist Steps/Page_Wishlist Detail  Farmasi/svg_1_2_3_4'))

WebUI.waitForElementVisible(findTestObject('Hotlist Steps/Page_Share your Hotlist  Farmasi/h1_Share your Hotlist'), 3)

WebUI.verifyElementText(findTestObject('Object Repository/Hotlist Steps/Page_Share your Hotlist  Farmasi/h1_Share your Hotlist'), 
    'Share your Hotlist')

WebUI.verifyElementClickable(findTestObject('Object Repository/Hotlist Steps/Page_Share your Hotlist  Farmasi/span_Copy'))

WebUI.click(findTestObject('Object Repository/Hotlist Steps/Page_Share your Hotlist  Farmasi/span_Save'))

'back to hotlist butonu kontrol edilir ve tıklanarak liste içerik sayfasına dönülür'
WebUI.verifyElementClickable(findTestObject('Object Repository/Hotlist Steps/Page_Share your Hotlist  Farmasi/span_Back to Hotlist Archive'))

WebUI.click(findTestObject('Object Repository/Hotlist Steps/Page_Share your Hotlist  Farmasi/span_Back to Hotlist Archive'))

WebUI.waitForElementVisible(findTestObject('Hotlist Steps/Page_Wishlist Detail  Farmasi/h1_otomasyon2'), 3)

WebUI.verifyElementText(findTestObject('Object Repository/Hotlist Steps/Page_Wishlist Detail  Farmasi/h1_otomasyon2'), 'otomasyon2')

'add to cart butonuna tıklanır ve sepete gidilir'
WebUI.click(findTestObject('Object Repository/Hotlist Steps/Page_Wishlist Detail  Farmasi/span_Add To Cart'))

'sepete gidilir'
WebUI.click(findTestObject('Object Repository/Hotlist Steps/Page_Wishlist Detail  Farmasi/svg_1_2'))

WebUI.waitForPageLoad(3)

WebUI.refresh()

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Object Repository/Hotlist Steps/Page_Basket  Farmasi/h2_Your Cart'), 'Your Cart')

WebUI.verifyElementText(findTestObject('Object Repository/Hotlist Steps/Page_Basket  Farmasi/h5_(1 items)'), '(1 items)')

'sepette ki ürünün kalp(hotlist) ikonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Hotlist Steps/Page_Basket  Farmasi/svg'))

WebUI.waitForElementVisible(findTestObject('Hotlist Steps/Page_Basket  Farmasi/h5_Choose Shade and Add to Your Hotlist'), 
    3)

WebUI.verifyElementText(findTestObject('Object Repository/Hotlist Steps/Page_Basket  Farmasi/h5_Choose Shade and Add to Your Hotlist'), 
    'Choose Shade and Add to Your Hotlist')

WebUI.click(findTestObject('Object Repository/Hotlist Steps/Page_Basket  Farmasi/span_Choose Shade'))

'otomasyon2 isimli liste de ekli olduğu ekran görüntüsü alınır'
WebUI.takeScreenshot('hotlist check kontrol')

'otomasyon2 listesinde check olduğu  metodla kontrol edilir '
WebUI.verifyElementChecked(findTestObject('Object Repository/Hotlist Steps/Page_Basket  Farmasi/input_otomasyon2_id'), 2)

'pencere kapatılır'
WebUI.click(findTestObject('Object Repository/Hotlist Steps/Page_Basket  Farmasi/svg_1'))

WebUI.click(findTestObject('Object Repository/Hotlist Steps/Page_Basket  Farmasi/span_Delete All Items'))

'sepetten ürün silinir'
WebUI.click(findTestObject('Object Repository/Hotlist Steps/Page_Basket  Farmasi/span_Yes, Delete It'))

WebUI.click(findTestObject('Object Repository/Hotlist Steps/Page_Basket  Farmasi/img_EN_styles_image__qb0tG'))

WebUI.click(findTestObject('Object Repository/Hotlist Steps/Page_Basket  Farmasi/span_Hotlist'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Hotlist Steps/Page_Wishlist  Farmasi/h3_otomasyon2'), 3)

WebUI.verifyElementText(findTestObject('Object Repository/Hotlist Steps/Page_Wishlist  Farmasi/h3_otomasyon2'), 'otomasyon2')

'hotlist sayfasında otomasyon2 listesinin 3 noktasına tıklanır'
WebUI.click(findTestObject('Object Repository/Hotlist Steps/Page_Wishlist  Farmasi/svg'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Hotlist Steps/Page_Wishlist  Farmasi/h6_Remove List'))

WebUI.click(findTestObject('Object Repository/Hotlist Steps/Page_Wishlist  Farmasi/h6_Remove List'))

WebUI.waitForElementVisible(findTestObject('Hotlist Steps/Page_Wishlist  Farmasi/h6_Delete List'), 3)

'remove a tıklanır ve pencerenin açıldığı kontrol edilir'
WebUI.verifyElementText(findTestObject('Object Repository/Hotlist Steps/Page_Wishlist  Farmasi/h6_Delete List'), 'Delete List')

WebUI.click(findTestObject('Object Repository/Hotlist Steps/Page_Wishlist  Farmasi/span_Yes, Delete It'))

'otomasyon2 listesinin olmadığı kontrol edilir'
WebUI.waitForElementNotVisible(findTestObject('Object Repository/Hotlist Steps/Page_Wishlist  Farmasi/h3_otomasyon2'), 5)

WebUI.click(findTestObject('Object Repository/Hotlist Steps/Page_Wishlist  Farmasi/img_EN_styles_image__qb0tG'))

'çıkış yapılır'
WebUI.verifyElementClickable(findTestObject('Object Repository/Hotlist Steps/Page_Wishlist  Farmasi/span_Sign Out'))

WebUI.click(findTestObject('Object Repository/Hotlist Steps/Page_Wishlist  Farmasi/span_Sign Out'))

WebUI.delay(5)

'log out kontrol edilir'
WebUI.click(findTestObject('Object Repository/Hotlist Steps/Page_Homepage  Farmasi/svg'))

WebUI.waitForElementVisible(findTestObject('Hotlist Steps/Page_Homepage  Farmasi/span_Login'), 3)

WebUI.verifyElementText(findTestObject('Object Repository/Hotlist Steps/Page_Homepage  Farmasi/span_Login'), 'Login')

WebUI.closeBrowser()

} catch (Exception e) {
	// Hata durumunda ekran görüntüsü al ve proje dizininde belirli bir klasöre kaydet
	WebUI.takeScreenshot(screenshotPath)
	
	KeywordUtil.markFailedAndStop("Bir hata oluştu: " + e.getMessage() + "\nEkran görüntüsü alındı: " + screenshotPath)
} finally {
	// Tarayıcıyı kapatma işlemi
	WebUI.closeBrowser()
}

