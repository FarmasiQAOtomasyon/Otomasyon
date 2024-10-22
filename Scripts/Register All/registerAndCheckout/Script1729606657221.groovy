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

// Projenin kök dizinini alır
String projectDir = RunConfiguration.getProjectDir()

// Ekran görüntüsünün kaydedileceği yolu belirler (örneğin: /Screenshots klasörü)
String screenshotPath = ((projectDir + '/Screenshots/') + System.currentTimeMillis()) + '.png'

// Sipariş numarasını tutmak için değişkeni başta tanımlayın
String orderNumber = null

WebUI.comment('yeni register olan bir userda balance olmadığı için bu casede balance odeme bloğunu comment satırına aldım')

try {
    WebUI.openBrowser('')

    WebUI.navigateToUrl('https://preprod.farmasi.ca/farmasi')

    WebUI.maximizeWindow()

    // E-posta oluşturma
    String email = generateRandomEmail()

    GlobalVariable.email = email

    // Custom name oluşturma
    String customName = generateCustomName()

    GlobalVariable.customName = customName

    // SIN oluşturma - Integer olduğundan emin olun
    String sin = generateRandomSIN()

    GlobalVariable.sin = sin

    // Rastgele telefon numarası oluşturma
    String randomPhoneNumber = generateRandomPhoneNumber()

    GlobalVariable.randomPhoneNumber = randomPhoneNumber

    WebUI.click(findTestObject('Object Repository/RegisterBI/Page_Homepage  Farmasi/svg'))

    WebUI.click(findTestObject('Object Repository/RegisterBI/Page_Homepage  Farmasi/button_Register Now'))

    WebUI.waitForElementVisible(findTestObject('RegisterBI/Page_Homepage  Farmasi/register_pop_up'), 0)

    WebUI.verifyElementVisible(findTestObject('RegisterBI/Page_Homepage  Farmasi/register_pop_up'))

    WebUI.click(findTestObject('Object Repository/RegisterBI/Page_Login  Farmasi/button_Become a FARMASI Influencer'))

    WebUI.delay(3)

    WebUI.waitForPageLoad(3)

    WebUI.verifyTextPresent('Glad You’re Interested In', false)

    WebUI.setText(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/input_Register to_email'), 
        GlobalVariable.email)

    WebUI.setText(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/input_E-mail_name'), GlobalVariable.customName)

    WebUI.setText(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/input_Name_surname'), 'test')

    WebUI.setText(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/input_Last Name_ssn'), GlobalVariable.sin)

    WebUI.scrollToPosition(0, 400)

    WebUI.click(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/button_Check Link'))

    WebUI.click(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/svg'))

    WebUI.selectOptionByValue(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/select_190019011902190319041905190619071908_246ee1'), 
        '2000', true)

    WebUI.selectOptionByValue(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/select_JanuaryFebruaryMarchAprilMayJuneJuly_566629'), 
        '0', true)

    WebUI.scrollToPosition(0, 550)

    WebUI.click(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/div_1'))

    WebUI.click(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/div_Gender'))

    WebUI.click(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/input_Male_genderId'))

    WebUI.setText(findTestObject('RegisterBI/Page_Farmasi Influencer  Farmasi/search_address'), 'roa')

    WebUI.click(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/span_Roadsport Honda, Ellesmere Road, Scarb_09c585'))

    WebUI.setText(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/input_Select City_address.mobilePhone'), 
        GlobalVariable.randomPhoneNumber)

    WebUI.setEncryptedText(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/input_Is This a PO Box_password'), 
        'Lj6COquByXHkrCnO0yj9Nw==')

    WebUI.setText(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/input_concat(Please enter your sponsor, , s_5139a9'), 
        'CA-01691041')

    WebUI.click(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/button_Check'))

    WebUI.scrollToPosition(0, 1500)

    WebUI.click(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/input_Check_agreement'))

    WebUI.click(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/input_Farmasi and Privacy Policy_agreement2'))

    WebUI.click(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/input_Farmasi BI Agreement_smsConsent'))

    WebUI.click(findTestObject('RegisterBI/Page_Farmasi Influencer  Farmasi/button_Register'))

    WebUI.click(findTestObject('RegisterBI/Page_Farmasi Influencer  Farmasi/button_submit_sponsor_modal'))

    WebUI.delay(5)

    WebUI.waitForPageLoad(5)

    WebUI.verifyTextPresent('Welcome to Farmasi', false)

    WebUI.verifyTextPresent('Starter Kit', false)

    WebUI.verifyTextPresent('optional', false)

    WebUI.scrollToPosition(0, 500)

    WebUI.click(findTestObject('Object Repository/RegisterBI/Page_Starter Kit  Farmasi/img_You can choose from 7 options_styles_ca_3548b8'))

    WebUI.verifyElementClickable(findTestObject('RegisterBI/Page_Homepage  Farmasi/button_continue'))

    WebUI.click(findTestObject('RegisterBI/Page_Starter Kit  Farmasi/button_Continue'))

    WebUI.waitForElementVisible(findTestObject('Cart Steps/Page_Basket  Farmasi/span_Checkout'), 5)

    'login sonrası sepetten checkout butona basıldı'
    WebUI.click(findTestObject('Cart Steps/Page_Basket  Farmasi/span_Checkout'))

    /*

    WebUI.waitForElementVisible(findTestObject('Cart Steps/Page_Checkout  Farmasi/span_Yes, Use It'), 0)

    'Yesy use it seçeneği balance butonu clickable kontrolü yapılır'
    WebUI.verifyElementClickable(findTestObject('Cart Steps/Page_Checkout  Farmasi/span_Yes, Use It'))

    WebUI.click(findTestObject('Cart Steps/Page_Checkout  Farmasi/span_Yes, Use It'))

    WebUI.waitForElementVisible(findTestObject('Object Repository/Cart Steps/Page_Checkout  Farmasi/span_Apply'), 3)

    'Apply butonu clickable kontrolü yapılır'
    WebUI.verifyElementClickable(findTestObject('Object Repository/Cart Steps/Page_Checkout  Farmasi/span_Apply'))

    'Cancel butonu clickable kontrolü yapılır'
    WebUI.verifyElementClickable(findTestObject('Object Repository/Cart Steps/Page_Checkout  Farmasi/p_Cancel Using Balance'))

    WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Checkout  Farmasi/span_Apply'))

    'Balance apply sonrası ödeme miktarı 0 olduğu verify edilir'
    WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps/Page_Checkout  Farmasi/span_0.00'), '$0.00')

    WebUI.waitForElementVisible(findTestObject('Object Repository/Cart Steps/Page_Checkout  Farmasi/span_0.00'), 5)
    */
    WebUI.scrollToPosition(0, 300)

    'Contract butonu clikable kontrolü yapılır'
    WebUI.verifyElementClickable(findTestObject('Object Repository/Cart Steps/Page_Checkout  Farmasi/span_Distance selling contract and terms of_822ccd'))

    'Contract radio buton tıklanır'
    WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Checkout  Farmasi/input_Choose another way to pay_agreements'))

    WebUI.waitForElementClickable(findTestObject('Object Repository/Cart Steps/Page_Checkout  Farmasi/span_Checkout'), 5)

    'Checkout tıklanır'
    WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Checkout  Farmasi/span_Checkout'))

    WebUI.verifyElementText(findTestObject('RegisterBI/Page_Farmasi Influencer  Farmasi/toast _text'), 'You haven\'t selected any payment method yet.')

    WebUI.verifyTextPresent('You haven\'t selected any payment method yet.', false)

    WebUI.delay(5)

    /*

    WebUI.waitForElementVisible(findTestObject('Cart Steps/Page_Checkout Result  Farmasi/h4_Thank you for your order'), 
        8)

    'Order mesajı verify edilir'
    WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps/Page_Checkout Result  Farmasi/h4_Thank you for your order'))

    'Myorders clickable kontrolü yapılır'
    WebUI.verifyElementClickable(findTestObject('Object Repository/Cart Steps/Page_Checkout Result  Farmasi/a_My Orders'))

    'Altta Products elementi verify edilir'
    WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps/Page_Checkout Result  Farmasi/h5_Products'))

    'Sipariş özeti tüm bilgileri verify edilir'
    WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps/Page_Checkout Result  Farmasi/h6_Shipping Address'))

    WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps/Page_Checkout Result  Farmasi/h6_Order No'))

    WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps/Page_Checkout Result  Farmasi/h6_Billing Address'))

    'get text ile order numberın değerini alıyoruz '
    orderNumber = WebUI.getText(findTestObject('BI_link/Page_Checkout Result  Farmasi/order_no_value'))

    WebUI.comment('orderNumber:' + orderNumber // Değişkenin değerini konsola yazdırır
        // Değişkenin değerini konsola yazdırır
        )

    'ordernumber değerini verify ediyoruz '
    WebUI.verifyElementText(findTestObject('BI_link/Page_Checkout Result  Farmasi/order_no_value'), orderNumber)

    WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps/Page_Checkout Result  Farmasi/h6_Shipping Price'))

    cancelOrder(orderNumber) */
    WebUI.click(findTestObject('RegisterBI/Page_Homepage  Farmasi/svg'))

    WebUI.verifyElementClickable(findTestObject('RegisterBI/Page_Homepage  Farmasi/button_logoutLink'))

    WebUI.click(findTestObject('RegisterBI/Page_Homepage  Farmasi/button_logoutLink'))
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
} 
// Hata durumunda ekran görüntüsü al ve proje dizininde belirli bir klasöre kaydet
finally { 
    // Tarayıcıyı kapatma işlemi
    WebUI.closeBrowser()
}

String generateRandomPhoneNumber() {
    String areaCode = '(432)'

    String firstPart = (100 + (Math.random() * 900)).toInteger().toString()

    String secondPart = (1000 + (Math.random() * 9000)).toInteger().toString()

    return (((areaCode + ' ') + firstPart) + '-') + secondPart
}

String generateRandomSIN() {
    List<Integer> sin = []

    for (int i = 0; i < 8; i++) {
        sin.add(((Math.random() * 10) as int))
    }
    
    sin.add(calculateLuhnChecksum(sin))

    return sin.join('')
}

int calculateLuhnChecksum(List<Integer> digits) {
    List<Integer> reversedDigits = digits.reverse()

    int total = 0

    for (int i = 0; i < reversedDigits.size(); i++) {
        int n = reversedDigits[i]

        if ((i % 2) == 0) {
            n *= 2

            if (n > 9) {
                n -= 9
            }
        }
        
        total += n
    }
    
    return (10 - (total % 10)) % 10
}

String generateCustomName() {
    String prefix = 'qaautomation'

    String randomSuffix = UUID.randomUUID().toString().replaceAll('-', '').substring(0, 4)

    return prefix + randomSuffix
}

String generateRandomEmail() {
    String email = ('qaautomation_' + UUID.randomUUID().toString().replaceAll('-', '').substring(0, 5)) + '@example.com'

    return email
}

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

