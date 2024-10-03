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

WebUI.click(findTestObject('RegisterBI/Page_Login  Farmasi/span_Register as a Customer'))

WebUI.verifyTextPresent('Let’s Get You Registered!', false)

WebUI.setText(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/input_Register to_email'), GlobalVariable.email)

WebUI.setText(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/input_E-mail_name'), GlobalVariable.customName)

WebUI.setText(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/input_Name_surname'), 'test')

WebUI.click(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/svg'))

WebUI.selectOptionByValue(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/select_190019011902190319041905190619071908_246ee1'), 
    '2000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/select_JanuaryFebruaryMarchAprilMayJuneJuly_566629'), 
    '0', true)

WebUI.click(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/div_1'))

WebUI.click(findTestObject('RegisterBI/Page_Farmasi Influencer  Farmasi/div_gender_b2c'))

WebUI.click(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/input_Male_genderId'))

WebUI.setText(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/input_Gender_address.addressLine'), 
    'roa')

WebUI.click(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/span_Roadsport Honda, Ellesmere Road, Scarb_09c585'))

WebUI.setText(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/input_Select City_address.mobilePhone'), 
    GlobalVariable.randomPhoneNumber)

WebUI.setEncryptedText(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/input_Is This a PO Box_password'), 
    'Lj6COquByXHkrCnO0yj9Nw==')

WebUI.setText(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/input_concat(Please enter your sponsor, , s_5139a9'), 
    'CA-01691041')

WebUI.click(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/button_Check'))

WebUI.click(findTestObject('RegisterBI/Page_Farmasi Influencer  Farmasi/input_Check_agreement'))

WebUI.click(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/input_Farmasi BI Agreement_smsConsent'))

WebUI.click(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/button_Register'))

WebUI.click(findTestObject('RegisterBI/Page_Farmasi Influencer  Farmasi/button_submit_sponsor_modal'))

WebUI.verifyTextNotPresent('To become a FARMASI Influencer', false)

WebUI.verifyTextNotPresent('Starter Kit', false)

WebUI.click(findTestObject('RegisterBI/Page_Homepage  Farmasi/svg'))

WebUI.verifyElementClickable(findTestObject('RegisterBI/Page_Homepage  Farmasi/button_logoutLink'))

WebUI.click(findTestObject('RegisterBI/Page_Homepage  Farmasi/button_logoutLink'))


} catch (Exception e) {
	// Hata durumunda ekran görüntüsü al ve proje dizininde belirli bir klasöre kaydet
	WebUI.takeScreenshot(screenshotPath)
	
	KeywordUtil.markFailedAndStop("Bir hata oluştu: " + e.getMessage() + "\nEkran görüntüsü alındı: " + screenshotPath)
} finally {
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

