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

WebUI.click(findTestObject('RegisterBI/Page_Login  Farmasi/span_Register as a Customer'))

WebUI.verifyTextPresent('Let’s Get You Registered!', false)

WebUI.scrollToPosition(0, 1500)

WebUI.click(findTestObject('RegisterBI/Page_Farmasi Influencer  Farmasi/button_Register'))

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/Page_Farmasi Influencer  Farmasi/Page_Farmasi Influencer  Farmasi/p_Email Address is Required'), 
    0)

WebUI.verifyElementPresent(findTestObject('RegisterBI/Page_Farmasi Influencer  Farmasi/name_is_req'), 0)

WebUI.verifyElementPresent(findTestObject('RegisterBI/Page_Farmasi Influencer  Farmasi/surname_is_req'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/Page_Farmasi Influencer  Farmasi/p_Please check your nickname'))

WebUI.verifyElementVisible(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/Page_Farmasi Influencer  Farmasi/span_Birthday is Required'))

WebUI.verifyElementVisible(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/Page_Farmasi Influencer  Farmasi/span_Gender is Required'))

WebUI.scrollToPosition(0, 800)

WebUI.verifyElementVisible(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/Page_Farmasi Influencer  Farmasi/p_Address is Required'))

WebUI.verifyElementVisible(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/Page_Farmasi Influencer  Farmasi/span_County is Required'))

WebUI.verifyElementVisible(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/Page_Farmasi Influencer  Farmasi/span_City is Required'))

WebUI.verifyElementVisible(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/Page_Farmasi Influencer  Farmasi/p_Post Code is Required'))

WebUI.verifyElementVisible(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/Page_Farmasi Influencer  Farmasi/p_Mobile Phone is Required'))

WebUI.verifyElementVisible(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/Page_Farmasi Influencer  Farmasi/p_Password is Required'))

WebUI.verifyElementVisible(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/Page_Farmasi Influencer  Farmasi/p_Agreement is Required'))

WebUI.verifyElementVisible(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/Page_Farmasi Influencer  Farmasi/p_Agreement is Required_1'))

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

