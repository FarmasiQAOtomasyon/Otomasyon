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

// Sipariş numarasını tutmak için değişkeni başta tanımlayın
String orderNumber = null

try {
    WebUI.openBrowser('')

    WebUI.navigateToUrl('https://www.farmasi.ca/istesttesti')

    WebUI.maximizeWindow()

    WebUI.waitForElementVisible(findTestObject('Object Repository/BI_link/Page_Homepage  Farmasi/button_ITIstest Testi'), 
        0)

    WebUI.verifyElementVisible(findTestObject('Object Repository/BI_link/Page_Homepage  Farmasi/button_ITIstest Testi'))

    WebUI.click(findTestObject('Object Repository/BI_link/Page_Homepage  Farmasi/button_ITIstest Testi'))

    WebUI.verifyElementText(findTestObject('Object Repository/BI_link/Page_Homepage  Farmasi/span_You are shopping with'), 
        'You are shopping with')

    WebUI.verifyElementVisible(findTestObject('Object Repository/BI_link/Page_Homepage  Farmasi/button_Message'))

    WebUI.verifyElementVisible(findTestObject('Object Repository/BI_link/Page_Homepage  Farmasi/profileIcon'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/BI_link/Page_Homepage  Farmasi/profileIcon'))

    WebUI.click(findTestObject('BI_link/Page_Homepage  Farmasi/btn_close_popup'))

    WebUI.click(findTestObject('Object Repository/BI_link/Page_Homepage  Farmasi/div_Hi, Im Istest TestiYou reached to this _05429a'))

    WebUI.verifyElementVisible(findTestObject('Object Repository/BI_link/Page_Homepage  Farmasi/div_Hi, Im Istest Testi'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/BI_link/Page_Homepage  Farmasi/svg_1'))

    WebUI.setText(findTestObject('Object Repository/BI_link/Page_Homepage  Farmasi/input_Become a FARMASI Influencer_styles_se_07b87f'), 
        'sensi')

    'search alanında gelen ürününün addtocart butonuna tıklanarak ürün sepete eklendi '
    WebUI.click(findTestObject('Object Repository/BI_link/Page_Homepage  Farmasi/button_Add To Cart'))

    'Toast mesajdan view cart tıklandı'
    WebUI.click(findTestObject('Object Repository/BI_link/Page_Homepage  Farmasi/a_View Cart'))

    'search alanının close butonuna tıklandı'
    WebUI.click(findTestObject('Object Repository/BI_link/Page_Basket  Farmasi/svg'))

    WebUI.click(findTestObject('Object Repository/BI_link/Page_Basket  Farmasi/button_Checkout'))

    WebUI.click(findTestObject('BI_link/Page_Basket  Farmasi/login_acordion'))

    WebUI.click(findTestObject('BI_link/Page_Basket  Farmasi/checkoutModalLoginEmail'))

    'sepetten checkouta tıklandı login popup açıldı login bilgileri girildi'
    WebUI.setText(findTestObject('BI_link/Page_Basket  Farmasi/checkoutModalLoginEmail'), 'siparis3@pinar.com')

    WebUI.setEncryptedText(findTestObject('BI_link/Page_Basket  Farmasi/checkoutModalLoginPassword'), 'Lj6COquByXHkrCnO0yj9Nw==')

    'B2C user ile login olundu '
    WebUI.click(findTestObject('BI_link/Page_Basket  Farmasi/modalMainButton'))

    WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

    WebUI.waitForElementNotVisible(findTestObject('Object Repository/BI_link/Page_Homepage  Farmasi/button_ITIstest Testi'), 
        0)

    WebUI.verifyElementNotVisible(findTestObject('Object Repository/BI_link/Page_Homepage  Farmasi/button_ITIstest Testi'))

    WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('BI_link/Page_Homepage  Farmasi/cart_icon'))

    WebUI.waitForElementVisible(findTestObject('BI_link/Page_Basket  Farmasi/button_Checkout'), 5)

    'login sonrası sepetten checkout butona basıldı'
    WebUI.click(findTestObject('Object Repository/BI_link/Page_Basket  Farmasi/button_Checkout'))

    WebUI.waitForElementVisible(findTestObject('Object Repository/BI_link/Page_Checkout  Farmasi/span_Yes, Use It'), 0)

    'Yesy use it seçeneği balance butonu clickable kontrolü yapılır'
    WebUI.verifyElementClickable(findTestObject('Object Repository/BI_link/Page_Checkout  Farmasi/span_Yes, Use It'))

    WebUI.click(findTestObject('Object Repository/BI_link/Page_Checkout  Farmasi/span_Yes, Use It'))

    WebUI.waitForElementVisible(findTestObject('Object Repository/Cart Steps/Page_Checkout  Farmasi/span_Apply'), 3)

    'Apply butonu clickable kontrolü yapılır'
    WebUI.verifyElementClickable(findTestObject('Object Repository/Cart Steps/Page_Checkout  Farmasi/span_Apply'))

    'Cancel butonu clickable kontrolü yapılır'
    WebUI.verifyElementClickable(findTestObject('Object Repository/Cart Steps/Page_Checkout  Farmasi/p_Cancel Using Balance'))

    WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Checkout  Farmasi/span_Apply'))

    WebUI.waitForElementVisible(findTestObject('Object Repository/Cart Steps/Page_Checkout  Farmasi/span_0.00'), 5)

    'Balance apply sonrası ödeme miktarı 0 olduğu verify edilir'
    WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps/Page_Checkout  Farmasi/span_0.00'), '$0.00')

    WebUI.scrollToPosition(0, 300)

    'Contract butonu clikable kontrolü yapılır'
    WebUI.verifyElementClickable(findTestObject('Object Repository/Cart Steps/Page_Checkout  Farmasi/span_Distance selling contract and terms of_822ccd'))

    'Contract radio buton tıklanır'
    WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Checkout  Farmasi/input_Choose another way to pay_agreements'))

    WebUI.waitForElementClickable(findTestObject('Object Repository/Cart Steps/Page_Checkout  Farmasi/span_Checkout'), 5)

    WebUI.takeScreenshot()
}
catch (Exception e) {
    WebUI.takeScreenshot(screenshotPath)

    KeywordUtil.markFailedAndStop((('Bir hata oluştu: ' + e.getMessage()) + '\nEkran görüntüsü alındı: ') + screenshotPath)

    if (orderNumber != null) {
        KeywordUtil.logInfo('Sipariş oluşturuldu, iptal işlemi başlatılıyor.')

        cancelOrder(orderNumber)
    } else {
        KeywordUtil.logInfo('Sipariş oluşturulmadı, iptal işlemi gerekmiyor.')
    }
    
    KeywordUtil.markFailedAndStop((('Bir hata oluştu: ' + e.getMessage()) + '\nEkran görüntüsü alındı: ') + screenshotPath)
} 
// Hata durumunda ekran görüntüsü al ve proje dizininde belirli bir klasöre kaydet
finally { 
    // Tarayıcıyı kapatma işlemi
    WebUI.closeBrowser()
}
// İkinci kullanıcı ile giriş yapın
// Kullanıcı giriş durumunu kontrol eden fonksiyon
// İlk olarak, "Sign Out" öğesinin görünür olup olmadığını kontrol edin.
// Menü kapalıysa, profil ikonuna tıklayarak menüyü açın.
// Menünün açılmasını bekleyin ve "Sign Out" öğesinin görünür olup olmadığını tekrar kontrol edin.
// "Sign Out" öğesinin görünür olup olmadığını döndürün.
// Herhangi bir hata durumunda false döndürün.
// Değişkenin değerini konsola yazdırır
// Değişkenin değerini konsola yazdırır
// Değişkenin değerini konsola yazdırır
// Değişkenin değerini konsola yazdırır

def cancelOrder(String orderNumber) {
    try {
        if (isUserLoggedIn()) {
            WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

            KeywordUtil.logInfo('Kullanıcı zaten login')
        } else {
            WebUI.navigateToUrl('https://preprod.farmasi.ca/')

            WebUI.click(findTestObject('Object Repository/BI_link/Page_Homepage  Farmasi/profileIcon'))

            WebUI.waitForElementVisible(findTestObject('BI_link/Page_Homepage  Farmasi/span_Login'), 3)

            WebUI.setText(findTestObject('BI_link/Page_Homepage  Farmasi/input_EN_email'), 'depir28963@padvn.com')

            WebUI.setEncryptedText(findTestObject('BI_link/Page_Homepage  Farmasi/input_E-mail_passwordLogin'), 'Lj6COquByXHkrCnO0yj9Nw==')

            WebUI.click(findTestObject('BI_link/Page_Homepage  Farmasi/span_Login'))

            WebUI.delay(5)
        }
        
        WebUI.click(findTestObject('Object Repository/BI_link/Page_Homepage  Farmasi/profileIcon'))

        WebUI.click(findTestObject('Object Repository/BI_link/Page_Homepage  Farmasi/menu_item_my_order'))

        WebUI.waitForElementVisible(findTestObject('Object Repository/BI_link/Page_My Orders  Farmasi/h1_My Orders'), 5)

        WebUI.delay(5)

        WebUI.verifyElementVisible(findTestObject('BI_link/Page_My Orders  Farmasi/order_number_value'))

        WebUI.verifyElementText(findTestObject('BI_link/Page_My Orders  Farmasi/order_number_value'), orderNumber)

        'order number verify edilir'
        WebUI.verifyElementVisible(findTestObject('Object Repository/BI_link/Page_My Orders  Farmasi/p_Order Processing'), 
            FailureHandling.STOP_ON_FAILURE)

        WebUI.verifyElementVisible(findTestObject('Object Repository/BI_link/Page_My Orders  Farmasi/h1_My Orders'))

        'Order processing tıklanır'
        WebUI.click(findTestObject('Object Repository/BI_link/Page_My Orders  Farmasi/p_Order Processing'))

        WebUI.waitForElementVisible(findTestObject('Object Repository/BI_link/Page_Order Detail  Farmasi/span_Cancel Order'), 
            5)

        'Cancel order butonu verify edilir'
        WebUI.verifyElementVisible(findTestObject('Object Repository/BI_link/Page_Order Detail  Farmasi/span_Cancel Order'))

        WebUI.click(findTestObject('Object Repository/BI_link/Page_Order Detail  Farmasi/span_Cancel Order'))

        WebUI.waitForElementVisible(findTestObject('Object Repository/BI_link/Page_Order Detail  Farmasi/h3_Cancel Order'), 
            3)

        WebUI.verifyElementVisible(findTestObject('Object Repository/BI_link/Page_Order Detail  Farmasi/h3_Cancel Order'))

        'No keep it clickable kontrolü yapılır'
        WebUI.verifyElementClickable(findTestObject('Object Repository/BI_link/Page_Order Detail  Farmasi/span_No, Keep It'))

        'Yes cancel  it butonuna tıklanır'
        WebUI.click(findTestObject('Object Repository/BI_link/Page_Order Detail  Farmasi/span_Yes, Cancel It'))

        WebUI.waitForElementVisible(findTestObject('Object Repository/BI_link/Page_Order Detail  Farmasi/h5_Return Payment Type'), 
            3)

        'Return Payment Type frame i açıldığı verify edilir'
        WebUI.verifyElementVisible(findTestObject('Object Repository/BI_link/Page_Order Detail  Farmasi/h5_Return Payment Type'))

        'Farmasi wallet butonuna tıklanır'
        WebUI.click(findTestObject('Object Repository/BI_link/Page_Order Detail  Farmasi/span_Farmasi Wallet'))

        WebUI.setText(findTestObject('Object Repository/BI_link/Page_Order Detail  Farmasi/textarea_T'), 'Test')

        'Cancel butonu clickable kontrolü yapılır'
        WebUI.verifyElementClickable(findTestObject('Object Repository/BI_link/Page_Order Detail  Farmasi/button_Cancel'))

        'Select butonuna tıklanır'
        WebUI.click(findTestObject('Object Repository/BI_link/Page_Order Detail  Farmasi/span_Select'))

        WebUI.waitForElementVisible(findTestObject('Object Repository/BI_link/Page_Order Detail  Farmasi/h4_Order Cancelled'), 
            5)

        'Order Canceled verify edilir'
        WebUI.verifyElementVisible(findTestObject('Object Repository/BI_link/Page_Order Detail  Farmasi/h4_Order Cancelled'))

        KeywordUtil.logInfo('Sipariş başarıyla iptal edildi: ' + orderNumber)

        String orderNumderTemp = orderNumber

        WebUI.comment('orderNumderTemp:' + orderNumderTemp)

        return orderNumderTemp
    }
    catch (Exception cancelException) {
        WebUI.takeScreenshot()

        KeywordUtil.markFailed('Sipariş iptal edilirken bir hata oluştu: ' + cancelException.getMessage())
    } 
}

def isUserLoggedIn() {
    try {
        boolean isMenuOpen = WebUI.verifyElementVisible(findTestObject('Object Repository/BI_link/Page_Homepage  Farmasi/span_Sign Out'), 
            FailureHandling.OPTIONAL)

        if (!(isMenuOpen)) {
            WebUI.click(findTestObject('Object Repository/BI_link/Page_Homepage  Farmasi/profileIcon'))

            isMenuOpen = WebUI.verifyElementVisible(findTestObject('Object Repository/BI_link/Page_Homepage  Farmasi/span_Sign Out'), 
                5, FailureHandling.OPTIONAL)
        }
        
        return isMenuOpen
    }
    catch (Exception e) {
        return false
    } 
}
