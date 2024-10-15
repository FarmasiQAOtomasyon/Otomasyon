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

WebUI.click(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Wrong inputs/Page_Homepage  Farmasi/svg'))

WebUI.setText(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Wrong inputs/Page_Homepage  Farmasi/input_EN_email'), 
    'siparis3@pinar.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Wrong inputs/Page_Homepage  Farmasi/input_E-mail_passwordLogin'), 
    'Lj6COquByXHkrCnO0yj9Nw==')

WebUI.click(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Wrong inputs/Page_Homepage  Farmasi/span_Login'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Wrong inputs/Page_Homepage  Farmasi/img_EN_styles_image__qb0tG'), 
    5)

'profil simgesine tıklanır'
WebUI.click(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Wrong inputs/Page_Homepage  Farmasi/img_EN_styles_image__qb0tG'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Wrong inputs/Page_Homepage  Farmasi/span_My Addresses'), 
    3)

'my adress tıklanır'
WebUI.click(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Wrong inputs/Page_Homepage  Farmasi/span_My Addresses'))

WebUI.delay(3)

'add new adress tıklanır'
WebUI.click(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Wrong inputs/Page_My Addresses  Farmasi/span_Add a New Address'))

WebUI.delay(3)

'name alanına sayı özel karakter girilir'
WebUI.setText(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Wrong inputs/Page_My Addresses  Farmasi/input_Address Label (i.e. Home, Work, etc.)_name'), 
    '22--..66')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Wrong inputs/Page_My Addresses  Farmasi/input_Mobile Phone_styles_searchInput__i1gZ_ebfd0c'))

WebUI.delay(2)

'hiç bir input girilmediği verify edilir'
WebUI.verifyElementVisible(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Wrong inputs/Page_My Addresses  Farmasi/p_Name is Required'))

WebUI.delay(2)

'lastname alanına sayı özel karakter girilir'
WebUI.setText(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Wrong inputs/Page_My Addresses  Farmasi/input_First Name_surname'), 
    '22--..66')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Wrong inputs/Page_My Addresses  Farmasi/input_Mobile Phone_styles_searchInput__i1gZ_ebfd0c'))

WebUI.delay(2)

'hiç bir input girilmediği verify edilir'
WebUI.verifyElementVisible(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Wrong inputs/Page_My Addresses  Farmasi/p_Last Name is required'))

WebUI.delay(2)

'phone alanına harf özel karakter girilir'
WebUI.setText(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Wrong inputs/Page_My Addresses  Farmasi/input_Last Name_phone'), 
    'ert*-.ip')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Wrong inputs/Page_My Addresses  Farmasi/input_Mobile Phone_styles_searchInput__i1gZ_ebfd0c'))

WebUI.delay(2)

'hiç bir input girilmediği verify edilir'
WebUI.verifyElementVisible(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Wrong inputs/Page_My Addresses  Farmasi/p_You entered a missing phone number'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Wrong inputs/Page_My Addresses  Farmasi/span_Cancel'))

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
