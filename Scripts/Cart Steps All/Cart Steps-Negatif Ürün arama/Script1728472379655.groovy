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

WebUI.click(findTestObject('Object Repository/Cart Steps-Negatif Ürün arama/Page_Homepage  Farmasi/svg'))

WebUI.setText(findTestObject('Object Repository/Cart Steps-Negatif Ürün arama/Page_Homepage  Farmasi/input_EN_email'), 'siparis3@pinar.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Cart Steps-Negatif Ürün arama/Page_Homepage  Farmasi/input_E-mail_passwordLogin'), 
    'Lj6COquByXHkrCnO0yj9Nw==')

WebUI.click(findTestObject('Object Repository/Cart Steps-Negatif Ürün arama/Page_Homepage  Farmasi/span_Login'))

WebUI.delay(5)

'welcome mesajı ile login olunduğu verify edilir'
WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps-Negatif Ürün arama/Page_Starter Kit  Farmasi/div_Welcome to Farmasi'))

'search kısmınada arama yapılır'
WebUI.setText(findTestObject('Object Repository/Cart Steps-Negatif Ürün arama/Page_Starter Kit  Farmasi/input_Hotlist_styles_searchInput__i1gZE false'), 
    'aaaa')

'Enter a basılır'
WebUI.sendKeys(findTestObject('Object Repository/Cart Steps-Negatif Ürün arama/Page_Starter Kit  Farmasi/input_Hotlist_styles_searchInput__i1gZE false'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(3)

'no result mesajı verify edilir'
WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps-Negatif Ürün arama/Page_Search Result for aaaa  Farmasi/div_Sorry, no results found aaaa'), 
    'Sorry, no results found ‘’aaaa’’')

'search kısmına sayı ile arama yapılır'
WebUI.setText(findTestObject('Object Repository/Cart Steps-Negatif Ürün arama/Page_Search Result for aaaa  Farmasi/input_Hotlist_styles_searchInput__i1gZE false'), 
    '123456789')

'Enter a basılır'
WebUI.sendKeys(findTestObject('Object Repository/Cart Steps-Negatif Ürün arama/Page_Search Result for aaaa  Farmasi/input_Hotlist_styles_searchInput__i1gZE false'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(3)

'no result mesajı verify edilir'
WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps-Negatif Ürün arama/Page_Search Result for 123456789  Farmasi/div_Sorry, no results found 123456789'), 
    'Sorry, no results found ‘’123456789’’')

'özel karakter search yapılır'
WebUI.setText(findTestObject('Object Repository/Cart Steps-Negatif Ürün arama/Page_Search Result for mascara  Farmasi/input_Hotlist_styles_searchInput__i1gZE false'), 
    'mascara½§')

'Enter a basılır'
WebUI.sendKeys(findTestObject('Object Repository/Cart Steps-Negatif Ürün arama/Page_Search Result for mascara  Farmasi/input_Hotlist_styles_searchInput__i1gZE false'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(3)

'no result mesajı verify edilir'
WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps-Negatif Ürün arama/Page_Search Result for mascara  Farmasi/div_Sorry, no results found mascara'), 
    'Sorry, no results found ‘’mascara½§’’')

WebUI.setText(findTestObject('Object Repository/Cart Steps-Negatif Ürün arama/Page_Homepage  Farmasi/input_Hotlist_styles_searchInput__i1gZE false'), 
    'mascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascara')

WebUI.sendKeys(findTestObject('Object Repository/Cart Steps-Negatif Ürün arama/Page_Homepage  Farmasi/input_Hotlist_styles_searchInput__i1gZE false'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps-Negatif Ürün arama/Page_Search Result for mascaramascaramascar_dd342b/div_Sorry, no results found mascaramascaram_15c050'), 
    'Sorry, no results found ‘’mascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascaramascara’’')

'SQL Injection denemesi input girilmiştir'
WebUI.setText(findTestObject('Object Repository/Cart Steps-Negatif Ürün arama/Page_Homepage  Farmasi/input_Hotlist_styles_searchInput__i1gZE false'), 
    '\' OR 1=1; --')

WebUI.sendKeys(findTestObject('Object Repository/Cart Steps-Negatif Ürün arama/Page_Homepage  Farmasi/input_Hotlist_styles_searchInput__i1gZE false'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps-Negatif Ürün arama/Page_Search Result for  OR 11 --  Farmasi/div_Sorry, no results found  OR 11 --'), 
    'Sorry, no results found ‘’\' OR 1=1; --’’')

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
