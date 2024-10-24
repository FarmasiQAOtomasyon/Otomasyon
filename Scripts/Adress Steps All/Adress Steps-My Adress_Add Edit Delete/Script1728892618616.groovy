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

WebUI.click(findTestObject('Object Repository/Adress Steps-My Adress_Add Edit Delete/Page_Homepage  Farmasi/path'))

WebUI.setText(findTestObject('Object Repository/Adress Steps-My Adress_Add Edit Delete/Page_Homepage  Farmasi/input_EN_email'), 
    'testautomation@farmasitest.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Adress Steps-My Adress_Add Edit Delete/Page_Homepage  Farmasi/input_E-mail_passwordLogin'), 
    'Lj6COquByXHkrCnO0yj9Nw==')

WebUI.click(findTestObject('Object Repository/Adress Steps-My Adress_Add Edit Delete/Page_Homepage  Farmasi/span_Login'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Adress Steps-My Adress_Add Edit Delete/Page_Starter Kit  Farmasi/img_EN_styles_image__qb0tG'), 
    5)

'profil ikonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Adress Steps-My Adress_Add Edit Delete/Page_Starter Kit  Farmasi/img_EN_styles_image__qb0tG'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Adress Steps-My Adress_Add Edit Delete/Page_Starter Kit  Farmasi/span_My Addresses'), 
    3)

'my adress tıklaır'
WebUI.click(findTestObject('Object Repository/Adress Steps-My Adress_Add Edit Delete/Page_Starter Kit  Farmasi/span_My Addresses'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Adress Steps-My Adress_Add Edit Delete/Page_My Addresses  Farmasi/span_Add a New Address'), 
    5)

'add new butonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Adress Steps-My Adress_Add Edit Delete/Page_My Addresses  Farmasi/span_Add a New Address'))

'tüm bilgiler doldurulur'
WebUI.setText(findTestObject('Object Repository/Adress Steps-My Adress_Add Edit Delete/Page_My Addresses  Farmasi/input_Address Type_title'), 
    'otomasyon')

WebUI.setText(findTestObject('Object Repository/Adress Steps-My Adress_Add Edit Delete/Page_My Addresses  Farmasi/input_Address Label (i.e. Home, Work, etc.)_name'), 
    'katalon')

WebUI.setText(findTestObject('Object Repository/Adress Steps-My Adress_Add Edit Delete/Page_My Addresses  Farmasi/input_First Name_surname'), 
    'stdyo')

WebUI.setText(findTestObject('Object Repository/Adress Steps-My Adress_Add Edit Delete/Page_My Addresses  Farmasi/input_Last Name_phone'), 
    '(234) 567-8997')

WebUI.setText(findTestObject('Object Repository/Adress Steps-My Adress_Add Edit Delete/Page_My Addresses  Farmasi/input_Mobile Phone_styles_searchInput__i1gZ_ebfd0c'), 
    'ter')

WebUI.click(findTestObject('Object Repository/Adress Steps-My Adress_Add Edit Delete/Page_My Addresses  Farmasi/span_Terminal 3, Mississauga, ON, Canada'))

WebUI.delay(5)

'apply butonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Adress Steps-My Adress_Add Edit Delete/Page_My Addresses  Farmasi/span_Apply'))

WebUI.delay(3)

'otomasyon yazısı verify edilir'
WebUI.verifyElementText(findTestObject('Object Repository/Adress Steps-My Adress_Add Edit Delete/Page_My Addresses  Farmasi/h6_otomasyon'), 
    'otomasyon')

'otomasyon adresinin altında ki edit butonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Adress Steps-My Adress_Add Edit Delete/Page_My Addresses  Farmasi/span_Edit'))

WebUI.delay(2)

'stdyoedit yazısı eklenir'
WebUI.setText(findTestObject('Object Repository/Adress Steps-My Adress_Add Edit Delete/Page_My Addresses  Farmasi/input_First Name_surname'), 
    'stdyoedit')

'apply butonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Adress Steps-My Adress_Add Edit Delete/Page_My Addresses  Farmasi/span_Apply'))

WebUI.delay(3)

'katalon stdyoedit texti verify edilir'
WebUI.verifyElementText(findTestObject('Object Repository/Adress Steps-My Adress_Add Edit Delete/Page_My Addresses  Farmasi/span_katalon stdyoedit'), 
    'katalon stdyoedit')

'delete butonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Adress Steps-My Adress_Add Edit Delete/Page_My Addresses  Farmasi/span_Delete'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Adress Steps-My Adress_Add Edit Delete/Page_My Addresses  Farmasi/span_Yes, Delete It'), 
    3)

'yes delete tıklanır'
WebUI.click(findTestObject('Object Repository/Adress Steps-My Adress_Add Edit Delete/Page_My Addresses  Farmasi/span_Yes, Delete It'))

WebUI.delay(3)

'otomasyon yazılı adresin silindiği verify edilir'
WebUI.verifyElementNotPresent(findTestObject('Object Repository/Adress Steps-My Adress_Add Edit Delete/Page_My Addresses  Farmasi/h6_otomasyon'), 
    3)

WebUI.delay(3)

WebUI.closeBrowser()

