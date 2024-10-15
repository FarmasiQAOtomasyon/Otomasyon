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

WebUI.click(findTestObject('Object Repository/Adress Steps-Cart_Add Edit Delete Adress/Page_Homepage  Farmasi/svg'))

WebUI.setText(findTestObject('Object Repository/Adress Steps-Cart_Add Edit Delete Adress/Page_Homepage  Farmasi/input_EN_email'), 
    'siparis3@pinar.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Adress Steps-Cart_Add Edit Delete Adress/Page_Homepage  Farmasi/input_E-mail_passwordLogin'), 
    'Lj6COquByXHkrCnO0yj9Nw==')

WebUI.click(findTestObject('Object Repository/Adress Steps-Cart_Add Edit Delete Adress/Page_Homepage  Farmasi/span_Login'))

WebUI.delay(5)

'Hair submenü mouse over yapılır'
WebUI.mouseOver(findTestObject('Object Repository/Adress Steps-Cart_Add Edit Delete Adress/Page_Starter Kit  Farmasi/div_Hair Care'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Adress Steps-Cart_Add Edit Delete Adress/Page_Starter Kit  Farmasi/div_Shampoo'), 
    0)

'Shampoo tıklanır'
WebUI.click(findTestObject('Object Repository/Adress Steps-Cart_Add Edit Delete Adress/Page_Starter Kit  Farmasi/div_Shampoo'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Adress Steps-Cart_Add Edit Delete Adress/Page_Shampoo  Farmasi/h4_Shampoo'), 
    5)

WebUI.verifyElementVisible(findTestObject('Object Repository/Adress Steps-Cart_Add Edit Delete Adress/Page_Shampoo  Farmasi/h4_Shampoo'))

WebUI.scrollToPosition(0, 300)

WebUI.delay(3)

'İlk ürün add tıklanır'
WebUI.click(findTestObject('Object Repository/Adress Steps-Cart_Add Edit Delete Adress/Page_Shampoo  Farmasi/svg'))

WebUI.delay(3)

'seper ikonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Adress Steps-Cart_Add Edit Delete Adress/Page_Shampoo  Farmasi/path'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Adress Steps-Cart_Add Edit Delete Adress/Page_Basket  Farmasi/span_Checkout'), 
    5)

'Checkout butonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Adress Steps-Cart_Add Edit Delete Adress/Page_Basket  Farmasi/span_Checkout'))

WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('Object Repository/Adress Steps-Cart_Add Edit Delete Adress/Page_Checkout  Farmasi/span_Add a new one'), 
    3)

'Add a new one butonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Adress Steps-Cart_Add Edit Delete Adress/Page_Checkout  Farmasi/span_Add a new one'))

'tüm bilgiler doldurulur'
WebUI.setText(findTestObject('Object Repository/Adress Steps-Cart_Add Edit Delete Adress/Page_Checkout  Farmasi/input_Address Type_title'), 
    'otomasyon')

WebUI.setText(findTestObject('Object Repository/Adress Steps-Cart_Add Edit Delete Adress/Page_Checkout  Farmasi/input_Address Label (i.e. Home, Work, etc.)_name'), 
    'katalon')

WebUI.setText(findTestObject('Object Repository/Adress Steps-Cart_Add Edit Delete Adress/Page_Checkout  Farmasi/input_First Name_surname'), 
    'stdyo')

WebUI.setText(findTestObject('Object Repository/Adress Steps-Cart_Add Edit Delete Adress/Page_Checkout  Farmasi/input_Last Name_phone'), 
    '(378) 970-8675')

WebUI.setText(findTestObject('Object Repository/Adress Steps-Cart_Add Edit Delete Adress/Page_Checkout  Farmasi/input_Mobile Phone_styles_searchInput__i1gZ_ebfd0c'), 
    'texas')

WebUI.waitForElementVisible(findTestObject('Object Repository/Adress Steps-Cart_Add Edit Delete Adress/Page_Checkout  Farmasi/span_Texas Road, Amherstburg, ON, Canada'), 
    3)

WebUI.click(findTestObject('Object Repository/Adress Steps-Cart_Add Edit Delete Adress/Page_Checkout  Farmasi/span_Texas Road, Amherstburg, ON, Canada'))

WebUI.delay(3)

'apply butonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Adress Steps-Cart_Add Edit Delete Adress/Page_Checkout  Farmasi/span_Apply'))

WebUI.delay(3)

'otomasyon yazısı verify edilir'
WebUI.verifyElementText(findTestObject('Object Repository/Adress Steps-Cart_Add Edit Delete Adress/Page_Checkout  Farmasi/h6_otomasyon'), 
    'otomasyon')

'edit butonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Adress Steps-Cart_Add Edit Delete Adress/Page_Checkout  Farmasi/span_Edit'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Adress Steps-Cart_Add Edit Delete Adress/Page_Checkout  Farmasi/input_First Name_surname'), 
    3)

WebUI.setText(findTestObject('Object Repository/Adress Steps-Cart_Add Edit Delete Adress/Page_Checkout  Farmasi/input_First Name_surname'), 
    'stdyoedit')

'apply butonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Adress Steps-Cart_Add Edit Delete Adress/Page_Checkout  Farmasi/span_Apply'))

WebUI.delay(3)

'stdyoedit yazısı verify edilir'
WebUI.verifyElementText(findTestObject('Object Repository/Adress Steps-Cart_Add Edit Delete Adress/Page_Checkout  Farmasi/span_katalon stdyoedit'), 
    'katalon stdyoedit')

'diğer adres radio buton tıklanır'
WebUI.click(findTestObject('Object Repository/Adress Steps-Cart_Add Edit Delete Adress/Page_Checkout  Farmasi/div_zferfgrg_styles_cardHeaderRadioActive___d44e8e'))

WebUI.click(findTestObject('Object Repository/Adress Steps-Cart_Add Edit Delete Adress/Page_Checkout  Farmasi/div_otomasyon_styles_cardHeaderRadioActive__39e170'))

'sağ kırmızı ok ve sol kırmızı ok lara basılır kontrol edilir'
WebUI.click(findTestObject('Object Repository/Adress Steps-Cart_Add Edit Delete Adress/Page_Checkout  Farmasi/path'))

WebUI.click(findTestObject('Object Repository/Adress Steps-Cart_Add Edit Delete Adress/Page_Checkout  Farmasi/path'))

WebUI.click(findTestObject('Object Repository/Adress Steps-Cart_Add Edit Delete Adress/Page_Checkout  Farmasi/svg'))

WebUI.click(findTestObject('Object Repository/Adress Steps-Cart_Add Edit Delete Adress/Page_Checkout  Farmasi/svg'))

'see all butonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Adress Steps-Cart_Add Edit Delete Adress/Page_Checkout  Farmasi/span_See All'))

'sağda ki açılan frame verify edilir'
WebUI.verifyElementVisible(findTestObject('Object Repository/Adress Steps-Cart_Add Edit Delete Adress/Page_Checkout  Farmasi/h5_Registered Addresses'))

'otomasyon adresi delete tıklanır'
WebUI.click(findTestObject('Object Repository/Adress Steps-Cart_Add Edit Delete Adress/Page_Checkout  Farmasi/span_Delete'))

'delete yes tıklanır'
WebUI.click(findTestObject('Object Repository/Adress Steps-Cart_Add Edit Delete Adress/Page_Checkout  Farmasi/span_Yes, Delete It'))

'sağ üst x butonuna tıklanır pencere kapatılır'
WebUI.click(findTestObject('Object Repository/Adress Steps-Cart_Add Edit Delete Adress/Page_Checkout  Farmasi/svg_1'))

WebUI.delay(3)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Adress Steps-Cart_Add Edit Delete Adress/Page_Checkout  Farmasi/h6_otomasyon'), 
    3)

'use same fır checkbox tıklanır unchecked yapılır'
WebUI.click(findTestObject('Object Repository/Adress Steps-Cart_Add Edit Delete Adress/Page_Checkout  Farmasi/input_Delete_checkoutCheckBox'))

'altta açılan başlıklar verify edilir'
WebUI.verifyElementVisible(findTestObject('Object Repository/Adress Steps-Cart_Add Edit Delete Adress/Page_Checkout  Farmasi/h5_Billing Address'))

'altta açılan add butonu clickable verify edilir'
WebUI.verifyElementClickable(findTestObject('Object Repository/Adress Steps-Cart_Add Edit Delete Adress/Page_Checkout  Farmasi/span_Add a new one_1'))

'unchecked olan checkbox a tekrar tıklanır ve checked yapılır'
WebUI.click(findTestObject('Object Repository/Adress Steps-Cart_Add Edit Delete Adress/Page_Checkout  Farmasi/input_Delete_checkoutCheckBox'))

'altta açılan blling başlığı gözükmediği verify edilir'
WebUI.verifyElementNotPresent(findTestObject('Object Repository/Adress Steps-Cart_Add Edit Delete Adress/Page_Checkout  Farmasi/h5_Billing Address'), 
    3)

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
