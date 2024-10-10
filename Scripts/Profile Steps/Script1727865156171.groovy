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

    WebUI.click(findTestObject('Object Repository/Profile Steps/Page_Homepage  Farmasi/svg'))

    WebUI.setText(findTestObject('Object Repository/Profile Steps/Page_Homepage  Farmasi/input_EN_email'), 'siparis3@pinar.com')

    WebUI.setEncryptedText(findTestObject('Object Repository/Profile Steps/Page_Homepage  Farmasi/input_E-mail_passwordLogin'), 
        'Lj6COquByXHkrCnO0yj9Nw==')

    WebUI.click(findTestObject('Object Repository/Profile Steps/Page_Homepage  Farmasi/span_Login'))

    WebUI.waitForElementVisible(findTestObject('Object Repository/Profile Steps/Page_Starter Kit  Farmasi/img_EN_styles_image__qb0tG'), 
        3)

    'Profil ikonuna tıklanır'
    WebUI.click(findTestObject('Object Repository/Profile Steps/Page_Starter Kit  Farmasi/img_EN_styles_image__qb0tG'))

    WebUI.waitForElementVisible(findTestObject('Object Repository/Profile Steps/Page_Starter Kit  Farmasi/span_Profile'), 
        3)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Profile Steps/Page_Starter Kit  Farmasi/span_Profile'))

    'Profil menü butonuna tıklanır'
    WebUI.click(findTestObject('Object Repository/Profile Steps/Page_Starter Kit  Farmasi/span_Profile'))

    WebUI.waitForElementVisible(findTestObject('Object Repository/Profile Steps/Page_Profile  Farmasi/h1_Profile'), 3)

    'profil sayfası açıldığı verify edilir'
    WebUI.verifyElementVisible(findTestObject('Object Repository/Profile Steps/Page_Profile  Farmasi/h1_Profile'))

    'Change profile picture clickable olduğu kontrol edilir'
    WebUI.verifyElementClickable(findTestObject('Object Repository/Profile Steps/Page_Profile  Farmasi/span_Change Profile Picture'))

    'Personel information Edit butonu clickable olduğu kontrol edilir'
    WebUI.verifyElementClickable(findTestObject('Object Repository/Profile Steps/Page_Profile  Farmasi/span_Edit'))

    'Personel website Edit butonu clickable olduğu kontrol edilir'
    WebUI.verifyElementClickable(findTestObject('Object Repository/Profile Steps/Page_Profile  Farmasi/span_Edit_1'))

    WebUI.scrollToPosition(0, 700)

    WebUI.delay(3)

    'My social media accounts başlığı verify edilir'
    WebUI.verifyElementVisible(findTestObject('Object Repository/Profile Steps/Page_Profile  Farmasi/h6_My Social Media Accounts'))

    'Social media butonları clikable kontolü yapılır'
    WebUI.verifyElementClickable(findTestObject('Object Repository/Profile Steps/Page_Profile  Farmasi/label_farmasi_styles_switchLabel__DenrI'))

    'Social media butonları clikable kontolü yapılır'
    WebUI.verifyElementClickable(findTestObject('Object Repository/Profile Steps/Page_Profile  Farmasi/label_farmasi_styles_switchLabel__DenrI_1'))

    'Social media butonları clikable kontolü yapılır'
    WebUI.verifyElementClickable(findTestObject('Object Repository/Profile Steps/Page_Profile  Farmasi/label_farmasi_styles_switchLabel__DenrI_1_2'))

    'Social media butonları clikable kontolü yapılır'
    WebUI.verifyElementClickable(findTestObject('Object Repository/Profile Steps/Page_Profile  Farmasi/label_farmasi_styles_switchLabel__DenrI_1_2_3'))

    'Social media butonları clikable kontolü yapılır'
    WebUI.verifyElementClickable(findTestObject('Object Repository/Profile Steps/Page_Profile  Farmasi/label_farmasi_styles_switchLabel__DenrI_1_2_3_4'))

    'Social media butonları clikable kontolü yapılır'
    WebUI.verifyElementClickable(findTestObject('Object Repository/Profile Steps/Page_Profile  Farmasi/label_farmasi_styles_switchLabel__DenrI_1_2_3_4_5'))

    'Social media butonları clikable kontolü yapılır'
    WebUI.verifyElementClickable(findTestObject('Object Repository/Profile Steps/Page_Profile  Farmasi/label_farmasi_styles_switchLabel__DenrI_1_2_3_4_5_6'))

    WebUI.scrollToElement(findTestObject('Profile Steps/Page_Profile  Farmasi/label_farmasi_styles_switchLabel__DenrI_1_2_3_4_5'), 
        3)

    WebUI.delay(3)

    'Welcome Message on Personal Page Başlığı verify edilir'
    WebUI.verifyElementVisible(findTestObject('Object Repository/Profile Steps/Page_Profile  Farmasi/h6_Welcome Message on Personal Page'))

    'Your Personal Website Başlığı verify edilir'
    WebUI.verifyElementVisible(findTestObject('Object Repository/Profile Steps/Page_Profile  Farmasi/h6_Your Personal Website'))

    'Copy butonuPersonel website  clickable olduğu kontrol edilir'
    WebUI.verifyElementClickable(findTestObject('Object Repository/Profile Steps/Page_Profile  Farmasi/span_Copy'))

    'Copy butonu Sign up clickable olduğu kontrol edilir'
    WebUI.verifyElementClickable(findTestObject('Object Repository/Profile Steps/Page_Profile  Farmasi/span_Copy_1'))

    WebUI.scrollToElement(findTestObject('Profile Steps/Page_Profile  Farmasi/span_Sponsor'), 3)

    WebUI.delay(3)

    'Copy butonu Customer sign up clickable olduğu kontrol edilir'
    WebUI.verifyElementClickable(findTestObject('Object Repository/Profile Steps/Page_Profile  Farmasi/span_Copy_1_2'))

    'if you would like to use embedded Copy linkleri clickable kontrolü yapılır'
    WebUI.verifyElementClickable(findTestObject('Object Repository/Profile Steps/Page_Profile  Farmasi/span_copy the link by clicking here'))

    'if you would like to use embedded Copy linkleri clickable kontrolü yapılır'
    WebUI.verifyElementClickable(findTestObject('Object Repository/Profile Steps/Page_Profile  Farmasi/span_copy the link by clicking here_1'))

    'Sponsor başlığı verify edilir'
    WebUI.verifyElementVisible(findTestObject('Object Repository/Profile Steps/Page_Profile  Farmasi/span_Sponsor'))

    'Contact information başlığı verify edilir'
    WebUI.verifyElementVisible(findTestObject('Object Repository/Profile Steps/Page_Profile  Farmasi/span_Contact Information'))

    'change password butonu clickable konrolü yapılır'
    WebUI.verifyElementClickable(findTestObject('Object Repository/Profile Steps/Page_Profile  Farmasi/span_Change Password'))

    'set communication preferences  butonu clickable konrolü yapılır'
    WebUI.verifyElementClickable(findTestObject('Object Repository/Profile Steps/Page_Profile  Farmasi/span_Set Communication Preferences'))

    'logout butonu clickable konrolü yapılır'
    WebUI.verifyElementClickable(findTestObject('Object Repository/Profile Steps/Page_Profile  Farmasi/span_Logout'))

    WebUI.click(findTestObject('Object Repository/Profile Steps/Page_Profile  Farmasi/span_Set Communication Preferences'))

    'set communication preferences  butonuna tıklanır'
    WebUI.waitForElementVisible(findTestObject('Object Repository/Profile Steps/Page_Communication Preferences  Farmasi/h2_Communication Preferences'), 
        2)

    WebUI.verifyElementVisible(findTestObject('Object Repository/Profile Steps/Page_Communication Preferences  Farmasi/h2_Communication Preferences'))

    'save my preferences  butonuna tıklanır'
    WebUI.click(findTestObject('Object Repository/Profile Steps/Page_Communication Preferences  Farmasi/span_Save My Preferences'))

    WebUI.waitForElementVisible(findTestObject('Object Repository/Profile Steps/Page_Profile  Farmasi/h1_Profile'), 3)

    'Profil sayfasının açıldığı verify edilir'
    WebUI.verifyElementVisible(findTestObject('Object Repository/Profile Steps/Page_Profile  Farmasi/h1_Profile'))

    'personel information edit butonuna tıklanır'
    WebUI.click(findTestObject('Object Repository/Profile Steps/Page_Profile  Farmasi/span_Edit'))

    WebUI.waitForElementVisible(findTestObject('Object Repository/Profile Steps/Page_Personal Info  Farmasi/span_Personal Information'), 
        3)

    'edit sayfası açıldığı verify edilir'
    WebUI.verifyElementVisible(findTestObject('Object Repository/Profile Steps/Page_Personal Info  Farmasi/span_Personal Information'))

    WebUI.takeScreenshot()

    'Gender butonuna tıklanır'
    WebUI.click(findTestObject('Object Repository/Profile Steps/Page_Personal Info  Farmasi/path'))

    WebUI.delay(2)

    '3 cinsiyet seçimi clickable kontrolü yapılır'
    WebUI.verifyElementClickable(findTestObject('Object Repository/Profile Steps/Page_Personal Info  Farmasi/input_Female_gender'))

    '3 cinsiyet seçimi clickable kontrolü yapılır'
    WebUI.verifyElementClickable(findTestObject('Object Repository/Profile Steps/Page_Personal Info  Farmasi/input_Not Specified_gender'))

    '3 cinsiyet seçimi clickable kontrolü yapılır'
    WebUI.verifyElementClickable(findTestObject('Object Repository/Profile Steps/Page_Personal Info  Farmasi/input_Male_gender'))

    'male seçilir'
    WebUI.click(findTestObject('Object Repository/Profile Steps/Page_Personal Info  Farmasi/input_Male_gender'))

    'Gender da male text olduğu verify edilir'
    WebUI.verifyElementText(findTestObject('Object Repository/Profile Steps/Page_Personal Info  Farmasi/p_Male'), 'Male')

    'save butonuna tıklanır'
    WebUI.click(findTestObject('Object Repository/Profile Steps/Page_Personal Info  Farmasi/span_Save My Information'))

    WebUI.waitForElementVisible(findTestObject('Object Repository/Profile Steps/Page_Profile  Farmasi/h1_Profile'), 3)

    WebUI.verifyElementVisible(findTestObject('Object Repository/Profile Steps/Page_Profile  Farmasi/h1_Profile'))

    'personel website Edit butonuna tıklanır'
    WebUI.click(findTestObject('Object Repository/Profile Steps/Page_Profile  Farmasi/span_Edit_1'))

    WebUI.waitForElementVisible(findTestObject('Object Repository/Profile Steps/Page_Update Personal Web Site  Farmasi/h2_Personal Website'), 
        3)

    WebUI.verifyElementVisible(findTestObject('Object Repository/Profile Steps/Page_Update Personal Web Site  Farmasi/h2_Personal Website'))

    'Link uzantısı değiştirilir'
    WebUI.setText(findTestObject('Object Repository/Profile Steps/Page_Update Personal Web Site  Farmasi/input_dln951_nickName'), 
        'dln950')

    'Check link butonuna tıklanır'
    WebUI.click(findTestObject('Object Repository/Profile Steps/Page_Update Personal Web Site  Farmasi/span_Check Link'))

    'Başarılı valid texti görülür'
    WebUI.verifyElementText(findTestObject('Object Repository/Profile Steps/Page_Update Personal Web Site  Farmasi/p_NickNameValid'), 
        'NickNameValid')

    WebUI.scrollToElement(findTestObject('Profile Steps/Page_Update Personal Web Site  Farmasi/span_Check Link'), 3)

    WebUI.delay(3)

    'Phone on my  website butonu clickable kontrolü yapılır'
    WebUI.verifyElementClickable(findTestObject('Object Repository/Profile Steps/Page_Update Personal Web Site  Farmasi/label_Show phone on my personal website_sty_21aad0'))

    WebUI.verifyElementVisible(findTestObject('Object Repository/Profile Steps/Page_Update Personal Web Site  Farmasi/h6_My Social Media Accounts'))

    WebUI.scrollToElement(findTestObject('Profile Steps/Page_Update Personal Web Site  Farmasi/label_Show phone on my personal website_sty_21aad0'), 
        3)

    WebUI.delay(2)

    WebUI.verifyElementVisible(findTestObject('Object Repository/Profile Steps/Page_Update Personal Web Site  Farmasi/h6_Welcome Message on Personal Page'))

    'Welcome mesajı set edilir'
    WebUI.setText(findTestObject('Object Repository/Profile Steps/Page_Update Personal Web Site  Farmasi/textarea_deneme1'), 
        '1')

    WebUI.delay(2)

    'save butonuna tıklanır'
    WebUI.click(findTestObject('Object Repository/Profile Steps/Page_Update Personal Web Site  Farmasi/span_Save My Information'))

    WebUI.waitForElementVisible(findTestObject('Object Repository/Profile Steps/Page_Profile  Farmasi/h1_Profile'), 3)

    WebUI.verifyElementVisible(findTestObject('Object Repository/Profile Steps/Page_Profile  Farmasi/h1_Profile'))

    WebUI.scrollToPosition(0, 1000)

    WebUI.delay(2)

    '75. stepte ki set işlemi verify edilir'
    WebUI.verifyElementText(findTestObject('Object Repository/Profile Steps/Page_Profile  Farmasi/span_deneme1'), 'deneme1')

    WebUI.scrollToElement(findTestObject('Profile Steps/Page_Profile  Farmasi/h1_Profile'), 3)

    WebUI.delay(3)

    WebUI.click(findTestObject('Object Repository/Profile Steps/Page_Profile  Farmasi/span_Edit_1'))

    WebUI.waitForElementVisible(findTestObject('Profile Steps/Page_Update Personal Web Site  Farmasi/span_Check Link'), 
        5)

    'Bu 5 adımda link tekrar önceki haline çevirilir'
    WebUI.setText(findTestObject('Object Repository/Profile Steps/Page_Update Personal Web Site  Farmasi/input_dln951_nickName'), 
        'dln951')

    'Check link butonuna tıklanır'
    WebUI.click(findTestObject('Object Repository/Profile Steps/Page_Update Personal Web Site  Farmasi/span_Check Link'))

    WebUI.scrollToElement(findTestObject('Profile Steps/Page_Update Personal Web Site  Farmasi/label_Show phone on my personal website_sty_21aad0'), 
        3)

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Profile Steps/Page_Update Personal Web Site  Farmasi/CleartextField'), FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(2)

    'save butonuna tıklanır'
    WebUI.click(findTestObject('Object Repository/Profile Steps/Page_Update Personal Web Site  Farmasi/span_Save My Information'))

    WebUI.waitForElementVisible(findTestObject('Object Repository/Profile Steps/Page_Profile  Farmasi/h1_Profile'), 3)

    WebUI.verifyElementVisible(findTestObject('Object Repository/Profile Steps/Page_Profile  Farmasi/h1_Profile'))

    WebUI.delay(1)

    WebUI.scrollToPosition(0, 1900)

    WebUI.delay(3)

    'En altta ki log out click yapılır'
    WebUI.click(findTestObject('Object Repository/Profile Steps/Page_Profile  Farmasi/span_Logout'))

    WebUI.delay(5)

    WebUI.waitForElementVisible(findTestObject('Object Repository/Profile Steps/Page_Homepage  Farmasi/svg'), 5)

    WebUI.click(findTestObject('Object Repository/Profile Steps/Page_Homepage  Farmasi/svg'))

    WebUI.delay(3)

    WebUI.verifyElementVisible(findTestObject('Object Repository/Profile Steps/Page_Homepage  Farmasi/span_Login'))

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

