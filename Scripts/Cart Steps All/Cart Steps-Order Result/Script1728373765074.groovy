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

    WebUI.click(findTestObject('Object Repository/Cart Steps-Order Result/Page_Homepage  Farmasi/svg'))

    WebUI.setText(findTestObject('Object Repository/Cart Steps-Order Result/Page_Homepage  Farmasi/input_EN_email'), 'siparis3@pinar.com')

    WebUI.setEncryptedText(findTestObject('Object Repository/Cart Steps-Order Result/Page_Homepage  Farmasi/input_E-mail_passwordLogin'), 
        'Lj6COquByXHkrCnO0yj9Nw==')

    'Login butonu tıklanır'
    WebUI.click(findTestObject('Object Repository/Cart Steps-Order Result/Page_Homepage  Farmasi/button_Login'))

    WebUI.delay(5)

    WebUI.waitForElementVisible(findTestObject('Object Repository/Cart Steps-Order Result/Page_Starter Kit  Farmasi/div_Hair Care'), 
        5)

    'Hair submenüye mouse over yapılır'
    WebUI.mouseOver(findTestObject('Object Repository/Cart Steps-Order Result/Page_Starter Kit  Farmasi/div_Hair Care'))

    'shampoo ya tıklanır'
    WebUI.click(findTestObject('Object Repository/Cart Steps-Order Result/Page_Starter Kit  Farmasi/div_Shampoo'))

    WebUI.delay(5)

    WebUI.scrollToPosition(0, 500)

    WebUI.delay(5)

    'ilk ürün eklenir'
    WebUI.click(findTestObject('Object Repository/Cart Steps-Order Result/Page_Shampoo  Farmasi/svg'))

    WebUI.delay(2)

    'sepet ikonuna tıklanır'
    WebUI.click(findTestObject('Object Repository/Cart Steps-Order Result/Page_Shampoo  Farmasi/svg_1'))

    WebUI.delay(5)

    WebUI.refresh()

    WebUI.delay(3)

    WebUI.waitForElementVisible(findTestObject('Object Repository/Cart Steps-Order Result/Page_Basket  Farmasi/span_Checkout'), 
        3)

    'ürün ismi değişken olarak kaydedilir'
    String ürünismi = WebUI.getText(findTestObject('Cart Steps-Order Result/Page_Basket  Farmasi/h6_Shield Man Shampoo'))

    WebUI.comment('ürünismi: ' + ürünismi // Değişkenin değerini konsola yazdırır
        )

    WebUI.delay(2)

    'ürün kodu değişken olarak kaydedilir'
    String ürünkodu = WebUI.getText(findTestObject('Cart Steps-Order Result/Page_Basket  Farmasi/span_1119082'))

    WebUI.comment('ürünkodu: ' + ürünkodu // Değişkenin değerini konsola yazdırır
        )

    'checkout butonuna tıklanır'
    WebUI.click(findTestObject('Object Repository/Cart Steps-Order Result/Page_Basket  Farmasi/span_Checkout'))

    WebUI.delay(5)

    WebUI.scrollToPosition(0, 300)

    WebUI.delay(3)

    'balance kullanımı yapılır'
    WebUI.click(findTestObject('Object Repository/Cart Steps-Order Result/Page_Checkout  Farmasi/span_Yes, Use It'))

    WebUI.click(findTestObject('Object Repository/Cart Steps-Order Result/Page_Checkout  Farmasi/span_Apply'))

    WebUI.delay(3)

    'contract checkbox ı tıklanır'
    WebUI.click(findTestObject('Object Repository/Cart Steps-Order Result/Page_Checkout  Farmasi/input_Choose another way to pay_agreements'))

    WebUI.delay(2)

    'checkout butonuna tıklanır'
    WebUI.click(findTestObject('Object Repository/Cart Steps-Order Result/Page_Checkout  Farmasi/span_Checkout'))

    WebUI.delay(8)

    WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps-Order Result/Page_Checkout  Farmasi/h4_Thank you for your order'))

    'Order no elementi visible olduğu verify edilir'
    WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps-Order Result/Page_Checkout  Farmasi/p_CA-13283148'))

    'Order no değişken olarak kaydedilir'
    orderno = WebUI.getText(findTestObject('Object Repository/Cart Steps-Order Result/Page_Checkout  Farmasi/p_CA-13283148'))

    WebUI.comment('orderno: ' + orderno // Değişkenin değerini konsola yazdırır
        )

    WebUI.delay(2)

    'Shipping Address alanının dolu olduğu visible olduğu verify edilir'
    WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps-Order Result/Page_Checkout  Farmasi/span_fdfsfggdfsdeasdfbfd, Gogama, Canada. t3r 4f5'))

    'Billing Address alanının dolu olduğu visible olduğu verify edilir'
    WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps-Order Result/Page_Checkout  Farmasi/span_fdfsfggdfsdeasdfbfd, Gogama, Canada. t3r 4f5_1'))

    'Price alanının visible olduğu verify edilir'
    WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps-Order Result/Page_Checkout  Farmasi/p_19.25'))

    WebUI.scrollToPosition(0, 500)

    WebUI.delay(3)

    'aşağıda products alanını visible verify edilir'
    WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps-Order Result/Page_Checkout  Farmasi/h5_Products'))

    'ürün ismi değişken olarak kaydedilir'
    ürünismimyorderspage = WebUI.getText(findTestObject('Object Repository/Cart Steps-Order Result/Page_Checkout  Farmasi/p_Shield Man Shampoo'))

    WebUI.comment('ürünismimyorderspage: ' + ürünismimyorderspage // Değişkenin değerini konsola yazdırır
        )

    'ürün kodu değişken olarak kaydedilir'
    ürünkodumyorderspage = WebUI.getText(findTestObject('Object Repository/Cart Steps-Order Result/Page_Checkout  Farmasi/p_1119082'))

    WebUI.comment('ürünkodumyorderspage: ' + ürünkodumyorderspage // Değişkenin değerini konsola yazdırır
        )

    WebUI.delay(2)

    'ürün isimleri equal kontrolü yapılır'
    WebUI.verifyEqual(ürünismimyorderspage, ürünismi)

    'ürün kodları equal kontrolü yapılır'
    WebUI.verifyEqual(ürünkodumyorderspage, ürünkodu)

    WebUI.scrollToPosition(400, 0)

    WebUI.delay(3)

    'my orders yazısına tıklanır'
    WebUI.click(findTestObject('Object Repository/Cart Steps-Order Result/Page_Checkout  Farmasi/a_My Orders'))

    WebUI.waitForElementVisible(findTestObject('Object Repository/Cart Steps-Order Result/Page_My Orders  Farmasi/h1_My Orders'), 
        3)

    'my orders page i beklenir'
    WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps-Order Result/Page_My Orders  Farmasi/h1_My Orders'))

    WebUI.delay(3)

    WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps-Order Result/Page_My Orders  Farmasi/p_Order Processing'), 
        'Order Processing')

    'detay sayfasına gidilmesi için tıklanır'
    WebUI.click(findTestObject('Object Repository/Cart Steps-Order Result/Page_My Orders  Farmasi/div_Order Number CA-1328395310.08.2024 - 9._633e28'))

    WebUI.delay(3)

    'orderno değişken olarak keydedilir'
    ordernomyorderspagedetail = WebUI.getText(findTestObject('Object Repository/Cart Steps-Order Result/Page_Order Detail  Farmasi/span_CA-13283953'))

    WebUI.comment('ordernomyorderspagedetail: ' + ordernomyorderspagedetail // Değişkenin değerini konsola yazdırır
        )

    'ordernolar equal kontrolü yapılır'
    WebUI.verifyEqual(orderno, ordernomyorderspagedetail)

    WebUI.scrollToPosition(0, 350)

    WebUI.delay(3)

    'ürün ismi değişken olarak keydedilir'
    ürünismidetail = WebUI.getText(findTestObject('Object Repository/Cart Steps-Order Result/Page_Order Detail  Farmasi/h6_Shield Man Shampoo'))

    WebUI.comment('ürünismidetail: ' + ürünismidetail // Değişkenin değerini konsola yazdırır
        )

    'ürün kodu değişken olarak kaydedilir'
    ürünkodudetail = WebUI.getText(findTestObject('Object Repository/Cart Steps-Order Result/Page_Order Detail  Farmasi/span_1119082'))

    WebUI.comment('ürünkodudetail: ' + ürünkodudetail // Değişkenin değerini konsola yazdırır
        )

    'ürün isimleri equal kontrolü yapılır'
    WebUI.verifyEqual(ürünismi, ürünismidetail)

    'ürün kodları equal kontrolü yapılır'
    WebUI.verifyEqual(ürünkodu, ürünkodudetail)

    'farmasi wallet elementi visible verify edilir'
    WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps-Order Result/Page_Order Detail  Farmasi/span_Farmasi Wallet'))

    'wallet price verify edilir'
    WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps-Order Result/Page_Order Detail  Farmasi/span_19.25'), 
        '$19.25')

    'shipping adres change butonu clickable kontrolü yapılır'
    WebUI.verifyElementClickable(findTestObject('Object Repository/Cart Steps-Order Result/Page_Order Detail  Farmasi/span_Change'))

    'total price elementi verify edilir'
    WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps-Order Result/Page_Order Detail  Farmasi/h6_Total Product Price'))

    'points verify edilir'
    WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps-Order Result/Page_Order Detail  Farmasi/span_5.93 Points'), 
        '5.93 Points')

    WebUI.scrollToPosition(500, 0)

    WebUI.delay(3)

    'cancel order butonuna tıklanır ve cancel edilir'
    WebUI.click(findTestObject('Object Repository/Cart Steps-Order Result/Page_Order Detail  Farmasi/span_Cancel Order'))

    WebUI.waitForElementVisible(findTestObject('Object Repository/Cart Steps-Order Result/Page_Order Detail  Farmasi/span_Yes, Cancel It'), 
        3)

    WebUI.click(findTestObject('Object Repository/Cart Steps-Order Result/Page_Order Detail  Farmasi/span_Yes, Cancel It'))

    WebUI.delay(3)

    WebUI.waitForElementVisible(findTestObject('Object Repository/Cart Steps-Order Result/Page_Order Detail  Farmasi/div_Return Payment Type_styles_radio__4_6lP'), 
        3)

    WebUI.click(findTestObject('Object Repository/Cart Steps-Order Result/Page_Order Detail  Farmasi/div_Return Payment Type_styles_radio__4_6lP'))

    WebUI.setText(findTestObject('Object Repository/Cart Steps-Order Result/Page_Order Detail  Farmasi/textarea_test'), 
        'test')

    WebUI.click(findTestObject('Object Repository/Cart Steps-Order Result/Page_Order Detail  Farmasi/span_Select'))

    WebUI.delay(3)

    WebUI.waitForElementVisible(findTestObject('Object Repository/Cart Steps-Order Result/Page_Order Detail  Farmasi/h4_Order Cancelled'), 
        5)

    WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps-Order Result/Page_Order Detail  Farmasi/h4_Order Cancelled'))

    'bu adımlarda order ın cancel olduğu verify edilir'
    WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps-Order Result/Page_Order Detail  Farmasi/h4_Order Cancelled'), 
        'Order Cancelled')

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

