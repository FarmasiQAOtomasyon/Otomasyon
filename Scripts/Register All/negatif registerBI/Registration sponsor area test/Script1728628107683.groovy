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

WebUI.setText(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/input_Register to_email'), GlobalVariable.email)

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

WebUI.click(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/div_1'))

WebUI.click(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/div_Gender'))

WebUI.click(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/input_Male_genderId'))

WebUI.setText(findTestObject('RegisterBI/Page_Farmasi Influencer  Farmasi/search_address'), 'roa')

WebUI.click(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/span_Roadsport Honda, Ellesmere Road, Scarb_09c585'))

WebUI.scrollToPosition(0, 1000)

WebUI.setText(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/input_Select City_address.mobilePhone'), 
    GlobalVariable.randomPhoneNumber)

WebUI.setEncryptedText(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/input_Is This a PO Box_password'), 
    'Lj6COquByXHkrCnO0yj9Nw==')

'not available sponsor code '
WebUI.setText(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/input_concat(Please enter your sponsor, , s_5139a9'), 
    'CA-0169104')

WebUI.click(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/button_Check'))

WebUI.verifyElementVisible(findTestObject('RegisterBI/Page_Farmasi Influencer  Farmasi/sponsor_area _alert_text'))

WebUI.verifyElementText(findTestObject('RegisterBI/Page_Farmasi Influencer  Farmasi/toast _text'), 'SponsorCodeNotAvailable')

WebUI.verifyTextPresent('SponsorCodeNotAvailable', false)

WebUI.scrollToPosition(0, 1500)

/* 'B2C sponsor code '
    WebUI.setText(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/input_concat(Please enter your sponsor, , s_5139a9'), 
        'test sponsor code')

    WebUI.verifyElementText(findTestObject('RegisterBI/Page_Farmasi Influencer  Farmasi/toast _text'), 'b2c cannot be a sponsor')

    WebUI.verifyTextPresent('b2c cannot be a sponsor', false) */
WebUI.click(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/input_Check_agreement'))

WebUI.click(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/input_Farmasi and Privacy Policy_agreement2'))

WebUI.click(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/input_Farmasi BI Agreement_smsConsent'))

WebUI.click(findTestObject('RegisterBI/Page_Farmasi Influencer  Farmasi/button_Register'))

WebUI.click(findTestObject('RegisterBI/Page_Farmasi Influencer  Farmasi/button_submit_sponsor_modal'))

'register butona basıldıktan sonra gelen toast message check\n'
WebUI.verifyElementText(findTestObject('RegisterBI/Page_Farmasi Influencer  Farmasi/toast _text'), 'SponsorIsNotBI')

WebUI.verifyTextPresent('SponsorIsNotBI', false)

WebUI.delay(2)

WebUI.scrollToPosition(0, 1100)

'incorrect format sponsor code '
WebUI.setText(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/input_concat(Please enter your sponsor, , s_5139a9'), 
    'test sponsor code')

WebUI.click(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/button_Check'))

WebUI.verifyElementText(findTestObject('RegisterBI/Page_Farmasi Influencer  Farmasi/toast _text'), 'SponsorCodeFormatInCorrect')

WebUI.verifyTextPresent('SponsorCodeFormatInCorrect', false)

WebUI.scrollToPosition(0, 1500)

WebUI.click(findTestObject('RegisterBI/Page_Farmasi Influencer  Farmasi/button_Register'))

WebUI.click(findTestObject('RegisterBI/Page_Farmasi Influencer  Farmasi/button_submit_sponsor_modal'))

'register butona basıldıktan sonra gelen toast message check\n'
WebUI.verifyElementText(findTestObject('RegisterBI/Page_Farmasi Influencer  Farmasi/toast _text'), 'SponsorIsNotBI')

WebUI.verifyTextPresent('SponsorIsNotBI', false)

WebUI.delay(2)

WebUI.scrollToPosition(0, 1100)

'empty sponsor code '
WebUI.setText(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/input_concat(Please enter your sponsor, , s_5139a9'), 
    '')

WebUI.click(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/button_Check'))

WebUI.verifyElementText(findTestObject('RegisterBI/Page_Farmasi Influencer  Farmasi/toast _text'), 'This field is required')

WebUI.verifyTextPresent('This field is required', false)

WebUI.scrollToPosition(0, 1500)

WebUI.click(findTestObject('RegisterBI/Page_Farmasi Influencer  Farmasi/button_Register'))

WebUI.click(findTestObject('RegisterBI/Page_Farmasi Influencer  Farmasi/button_submit_sponsor_modal'))

WebUI.delay(5)

WebUI.waitForPageLoad(5)

WebUI.verifyTextPresent('Welcome to Farmasi', false)

WebUI.verifyTextPresent('Starter Kit', false)

WebUI.verifyTextPresent('optional', false)

WebUI.verifyElementClickable(findTestObject('RegisterBI/Page_Homepage  Farmasi/button_continue'))

WebUI.click(findTestObject('RegisterBI/Page_Homepage  Farmasi/svg'))

WebUI.verifyElementClickable(findTestObject('RegisterBI/Page_Homepage  Farmasi/button_logoutLink'))

WebUI.click(findTestObject('RegisterBI/Page_Homepage  Farmasi/button_logoutLink'))

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
    String email = ('qaautomation_' + UUID.randomUUID().toString().replaceAll('-', '').substring(0, 5)) + 'farmasitest.com'

    return email
}

