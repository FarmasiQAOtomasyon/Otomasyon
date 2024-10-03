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
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration

// Projenin kök dizinini alır
String projectDir = RunConfiguration.getProjectDir()

// Ekran görüntüsünün kaydedileceği yolu belirler (örneğin: /Screenshots klasörü)
String screenshotPath = projectDir + '/Screenshots/' + System.currentTimeMillis() + '.png'

try {
WebUI.openBrowser('')

WebUI.navigateToUrl('https://preprod.farmasi.ca/farmasi')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Hotlist Create/Page_Homepage  Farmasi/path'))

WebUI.setText(findTestObject('Object Repository/Hotlist Create/Page_Homepage  Farmasi/input_EN_email'), 'siparis3@pinar.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Hotlist Create/Page_Homepage  Farmasi/input_E-mail_passwordLogin'), 
    'Lj6COquByXHkrCnO0yj9Nw==')

WebUI.click(findTestObject('Object Repository/Hotlist Create/Page_Homepage  Farmasi/span_Login'))

WebUI.click(findTestObject('Object Repository/Hotlist Create/Page_Homepage  Farmasi/img_EN_styles_image__qb0tG'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Hotlist Create/Page_Starter Kit  Farmasi/span_Hotlist'))

WebUI.click(findTestObject('Object Repository/Hotlist Create/Page_Starter Kit  Farmasi/span_Hotlist'))

WebUI.verifyElementText(findTestObject('Object Repository/Hotlist Create/Page_Wishlist  Farmasi/h1_Hotlist'), 'Hotlist')

WebUI.click(findTestObject('Object Repository/Hotlist Create/Page_Wishlist  Farmasi/span_Add New List'))

WebUI.enableSmartWait()

WebUI.verifyElementText(findTestObject('Object Repository/Hotlist Create/Page_Wishlist  Farmasi/h5_Create a New List'), 
    'Create a New List')

WebUI.setText(findTestObject('Object Repository/Hotlist Create/Page_Wishlist  Farmasi/input_Create a New List_wishlistName'), 
    'Otomasyon')

WebUI.click(findTestObject('Object Repository/Hotlist Create/Page_Wishlist  Farmasi/span_Create List'))

WebUI.waitForElementVisible(findTestObject('Hotlist Create/Page_Wishlist  Farmasi/p_Wishlist Add Successed'), 1)

WebUI.verifyElementText(findTestObject('Object Repository/Hotlist Create/Page_Wishlist  Farmasi/p_Wishlist Add Successed'), 
    'Wishlist Add Successed')

WebUI.click(findTestObject('Object Repository/Hotlist Create/Page_Wishlist  Farmasi/h3_Otomasyon'))

WebUI.click(findTestObject('Object Repository/Hotlist Create/Page_Wishlist Detail  Farmasi/svg'))

WebUI.setText(findTestObject('Object Repository/Hotlist Create/Page_Wishlist Detail  Farmasi/input_Add Product to List_styles_searchInpu_d23341'), 
    'mascara')

WebUI.click(findTestObject('Object Repository/Hotlist Create/Page_Wishlist Detail  Farmasi/span_Add to List'))

WebUI.waitForElementVisible(findTestObject('Page_Wishlist Detail  Farmasi/p_Added to List'), 3)

WebUI.click(findTestObject('Object Repository/Hotlist Create/Page_Wishlist Detail  Farmasi/span_Choose Shade'))

WebUI.click(findTestObject('Object Repository/Hotlist Create/Page_Wishlist Detail  Farmasi/div_Color Variants_styles_variantPickerItem__DTB5D'))

WebUI.click(findTestObject('Object Repository/Hotlist Create/Page_Wishlist Detail  Farmasi/span_Add to List_1'))

WebUI.click(findTestObject('Object Repository/Hotlist Create/Page_Wishlist Detail  Farmasi/svg_1'))

WebUI.click(findTestObject('Object Repository/Hotlist Create/Page_Wishlist Detail  Farmasi/span_Done'))

WebUI.click(findTestObject('Object Repository/Hotlist Create/Page_Wishlist Detail  Farmasi/span_Add All to Cart'))

WebUI.click(findTestObject('Object Repository/Hotlist Create/Page_Wishlist Detail  Farmasi/svg_1_2'))

WebUI.click(findTestObject('Object Repository/Hotlist Create/Page_Basket  Farmasi/svg'))

WebUI.waitForElementVisible(findTestObject('Hotlist Create/Page_Basket  Farmasi/h5_Choose Shade and Add to Your Hotlist'), 
    3)

WebUI.verifyElementText(findTestObject('Object Repository/Hotlist Create/Page_Basket  Farmasi/h5_Choose Shade and Add to Your Hotlist'), 
    'Choose Shade and Add to Your Hotlist')

WebUI.click(findTestObject('Object Repository/Hotlist Create/Page_Basket  Farmasi/span_Choose Shade'))

WebUI.waitForPageLoad(3)

WebUI.verifyElementChecked(findTestObject('Object Repository/Hotlist Create/Page_Basket  Farmasi/input_Otomasyon_id'), 0)

WebUI.click(findTestObject('Object Repository/Hotlist Create/Page_Basket  Farmasi/svg_1'))

WebUI.click(findTestObject('Object Repository/Hotlist Create/Page_Basket  Farmasi/span_Delete All Items'))

WebUI.verifyElementText(findTestObject('Object Repository/Hotlist Create/Page_Basket  Farmasi/h5_Delete Your Cart'), 'Delete Your Cart')

WebUI.click(findTestObject('Object Repository/Hotlist Create/Page_Basket  Farmasi/span_Yes, Delete It'))

WebUI.click(findTestObject('Object Repository/Hotlist Create/Page_Basket  Farmasi/img_EN_styles_image__qb0tG'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Hotlist Create/Page_Basket  Farmasi/span_Hotlist'))

WebUI.click(findTestObject('Object Repository/Hotlist Create/Page_Basket  Farmasi/span_Hotlist'))

WebUI.verifyElementText(findTestObject('Object Repository/Hotlist Create/Page_Wishlist  Farmasi/h1_Hotlist'), 'Hotlist')

WebUI.click(findTestObject('Object Repository/Hotlist Create/Page_Wishlist  Farmasi/svg'))

WebUI.click(findTestObject('Object Repository/Hotlist Create/Page_Wishlist  Farmasi/h6_Remove List'))

WebUI.verifyElementText(findTestObject('Object Repository/Hotlist Create/Page_Wishlist  Farmasi/h6_Delete List'), 'Delete List')

WebUI.click(findTestObject('Object Repository/Hotlist Create/Page_Wishlist  Farmasi/span_Yes, Delete It_1'))

WebUI.verifyTextNotPresent('Otomasyon', false)

WebUI.click(findTestObject('Object Repository/Hotlist Create/Page_Wishlist  Farmasi/img_EN_styles_image__qb0tG'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Hotlist Create/Page_Wishlist  Farmasi/span_Sign Out'))

WebUI.click(findTestObject('Object Repository/Hotlist Create/Page_Wishlist  Farmasi/span_Sign Out'))
} catch (Exception e) {
	// Hata durumunda ekran görüntüsü al ve proje dizininde belirli bir klasöre kaydet
	WebUI.takeScreenshot(screenshotPath)
	
	KeywordUtil.markFailedAndStop("Bir hata oluştu: " + e.getMessage() + "\nEkran görüntüsü alındı: " + screenshotPath)
} finally {
	// Tarayıcıyı kapatma işlemi
	WebUI.closeBrowser()
}
