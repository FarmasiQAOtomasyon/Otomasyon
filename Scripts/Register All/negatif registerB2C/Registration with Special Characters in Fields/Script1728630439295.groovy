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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

// Projenin kök dizinini alır
String projectDir = RunConfiguration.getProjectDir()

// Ekran görüntüsünün kaydedileceği yolu belirler (örneğin: /Screenshots klasörü)
String screenshotPath = ((projectDir + '/Screenshots/') + System.currentTimeMillis()) + '.png'

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

    WebUI.setText(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/input_Register to_email'), 
        GlobalVariable.email)

    //WebUI.setText(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/input_Register to_email'), GlobalVariable.email)
    // Geçersiz karakterleri bir listeye ekliyoruz
    List<Integer> invalidCharacters = [' ', '"', '\\', '(', ')', ',', ':', ';', '<', '>', '[', ']']

    for (String character : invalidCharacters) {
        // E-posta alanına her bir geçersiz karakteri sırayla setText komutuyla yazdırıyoruz
        WebUI.setText(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/input_Register to_email'), 
            ('qaautomation' + character) + 'email@example.com')

        WebUI.click(findTestObject('RegisterBI/Page_Farmasi Influencer  Farmasi/input_E-mail_name'))

        // Burada email alanını kontrol ederek geçerli olup olmadığını test edebilirsin
        'varning text check'
        WebUI.verifyElementText(findTestObject('RegisterBI/Page_Farmasi Influencer  Farmasi/Page_Farmasi Influencer  Farmasi/Page_Farmasi Influencer  Farmasi/p_Please enter valid email'), 
            'Please enter valid email')

        WebUI.click(findTestObject('RegisterBI/Page_Farmasi Influencer  Farmasi/input_E-mail_name'))
    }
    
    List<Integer> nameInvalidCharacters = [' ', '"', '\'', '\\', '/', '(', ')', ',', ':', ';', '<', '>', '[', ']', '{', '}'
        , '|', '+', '=', '!', '&', '^', '*', '%', '$', '#', '?', '0', '1', '2', '3']

    for (String character : nameInvalidCharacters) {
        WebUI.setText(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/input_E-mail_name'), 
            'qaautomationeos' + nameInvalidCharacters)

        String actualValue = WebUI.getAttribute(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/input_E-mail_name'), 
            'value').trim()

        WebUI.verifyEqual(actualValue, 'qaautomationeos' /*'varning text check'
        WebUI.verifyElementAttributeValue(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/input_E-mail_name'), 
            'value', 'qaautomationeos', 3)*/ )
    }
    
    for (String character : invalidCharacters) {
        // Name alanına setText işlemi
        WebUI.setText(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/input_Name_surname'), 
            'test' + nameInvalidCharacters)

        // Boşlukları göz ardı ederek value'yu al ve karşılaştır
        String actualValue = WebUI.getAttribute(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/input_Name_surname'), 
            'value').trim()

        // Doğru değeri doğrula
        WebUI.verifyEqual(actualValue, 'test' // Alternatif olarak bu şekilde de trim edilmiş attribute değeriyle doğrulama yapabilirsin
            ) //WebUI.verifyElementAttributeValue(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/input_Name_surname'), 'value', 'test', 3)
    }
    
    List<Integer> dateInvalidCharacters = ['!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '=', '+', 'a', 'b', 'c'
        , '~', '`']

    for (String character : dateInvalidCharacters) {
        WebUI.setText(findTestObject('RegisterBI/Page_Farmasi Influencer  Farmasi/birthday'), '' + dateInvalidCharacters)

        'varning text check'
        WebUI.verifyElementAttributeValue(findTestObject('RegisterBI/Page_Farmasi Influencer  Farmasi/birthday'), 'value', 
            '', 3)
    }
    
    WebUI.scrollToPosition(0, 400)

    WebUI.click(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/button_Check Link'))

    WebUI.click(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/svg'))

    WebUI.selectOptionByValue(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/select_190019011902190319041905190619071908_246ee1'), 
        '2000', true)

    WebUI.selectOptionByValue(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/select_JanuaryFebruaryMarchAprilMayJuneJuly_566629'), 
        '0', true)

    WebUI.click(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/div_1'))

    WebUI.scrollToPosition(0, 800)

    WebUI.click(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/div_Gender'))

    WebUI.click(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/input_Male_genderId'))

    WebUI.setText(findTestObject('RegisterBI/Page_Farmasi Influencer  Farmasi/search_address'), 'roa')

    WebUI.click(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/span_Roadsport Honda, Ellesmere Road, Scarb_09c585'))

    List<Integer> phoneInvalidCharacters = ['!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '=', '+', 'a', 'b', 'c'
        , '~', '`']

    for (String character : phoneInvalidCharacters) {
        WebUI.setText(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/input_Select City_address.mobilePhone'), 
            '123' + phoneInvalidCharacters)

        'varning text check'
        WebUI.verifyElementAttributeValue(findTestObject('Object Repository/RegisterBI/Page_Farmasi Influencer  Farmasi/input_Select City_address.mobilePhone'), 
            'value', '(123) ', 3)
    }
    
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

