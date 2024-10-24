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

WebUI.click(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Empty inputs/Page_Homepage  Farmasi/path'))

WebUI.setText(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Empty inputs/Page_Homepage  Farmasi/input_EN_email'), 
    'testautomation@farmasitest.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Empty inputs/Page_Homepage  Farmasi/input_E-mail_passwordLogin'), 
    'Lj6COquByXHkrCnO0yj9Nw==')

WebUI.click(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Empty inputs/Page_Homepage  Farmasi/span_Login'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Empty inputs/Page_Homepage  Farmasi/img_EN_styles_image__qb0tG'), 
    5)

'profil simgesine tıklanır'
WebUI.click(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Empty inputs/Page_Homepage  Farmasi/img_EN_styles_image__qb0tG'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Empty inputs/Page_Starter Kit  Farmasi/span_My Addresses'), 
    3)

'my adress e tıklanır'
WebUI.click(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Empty inputs/Page_Starter Kit  Farmasi/span_My Addresses'))

WebUI.delay(3)

'add new adres tıklanır'
WebUI.click(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Empty inputs/Page_My Addresses  Farmasi/span_Add a New Address'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Empty inputs/Page_My Addresses  Farmasi/input_Address Type_title'))

WebUI.click(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Empty inputs/Page_My Addresses  Farmasi/input_Mobile Phone_styles_searchInput__i1gZ_ebfd0c'))

'adress label required hata mesajı görüntülenir'
WebUI.verifyElementVisible(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Empty inputs/Page_My Addresses  Farmasi/p_Title is Required'))

WebUI.click(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Empty inputs/Page_My Addresses  Farmasi/input_Address Label (i.e. Home, Work, etc.)_name'))

WebUI.click(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Empty inputs/Page_My Addresses  Farmasi/form_Address TypeShipping AddressAddress La_a57252'))

'name required hata mesajı görüntülenir'
WebUI.verifyElementVisible(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Empty inputs/Page_My Addresses  Farmasi/p_Name is Required'))

WebUI.click(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Empty inputs/Page_My Addresses  Farmasi/input_First Name_surname'))

WebUI.click(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Empty inputs/Page_My Addresses  Farmasi/form_Address TypeShipping AddressAddress La_a2f409'))

'last name required hata mesajı görüntülenir'
WebUI.verifyElementVisible(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Empty inputs/Page_My Addresses  Farmasi/p_Last Name is required'))

WebUI.click(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Empty inputs/Page_My Addresses  Farmasi/input_Last Name_phone'))

WebUI.click(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Empty inputs/Page_My Addresses  Farmasi/form_Address TypeShipping AddressAddress La_83546b'))

'mobil phone required hata mesajı görüntülenir'
WebUI.verifyElementVisible(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Empty inputs/Page_My Addresses  Farmasi/p_Mobile Phone is Required'))

WebUI.setText(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Empty inputs/Page_My Addresses  Farmasi/input_Mobile Phone_styles_searchInput__i1gZ_ebfd0c'), 
    'ter')

WebUI.delay(3)

'termianl başlayan adres seçilir'
WebUI.click(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Empty inputs/Page_My Addresses  Farmasi/span_Terminal 3, Mississauga, ON, Canada'))

WebUI.delay(5)

'mobile phone hariç hepsi doldurulur'
WebUI.setText(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Empty inputs/Page_My Addresses  Farmasi/input_Address Type_title'), 
    'otomasyon')

WebUI.setText(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Empty inputs/Page_My Addresses  Farmasi/input_Address Label (i.e. Home, Work, etc.)_name'), 
    'katalon')

WebUI.setText(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Empty inputs/Page_My Addresses  Farmasi/input_First Name_surname'), 
    'stdyo')

'apply basılır'
WebUI.click(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Empty inputs/Page_My Addresses  Farmasi/span_Apply'))

'mobile phone required hatası görüntülenir'
WebUI.verifyElementVisible(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Empty inputs/Page_My Addresses  Farmasi/p_Mobile Phone is Required'))

WebUI.setText(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Empty inputs/Page_My Addresses  Farmasi/input_Last Name_phone'), 
    '(234) 455-6677')

'last name silinir'
WebUI.setText(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Empty inputs/Page_My Addresses  Farmasi/input_First Name_surname'), 
    '')

'apply basılır'
WebUI.click(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Empty inputs/Page_My Addresses  Farmasi/span_Apply'))

'last name required mesajı verify edilir'
WebUI.verifyElementVisible(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Empty inputs/Page_My Addresses  Farmasi/p_Last Name is required'))

WebUI.setText(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Empty inputs/Page_My Addresses  Farmasi/input_First Name_surname'), 
    'stdyo')

'first name silinir'
WebUI.setText(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Empty inputs/Page_My Addresses  Farmasi/input_Address Label (i.e. Home, Work, etc.)_name'), 
    '')

'apply tıklanır'
WebUI.click(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Empty inputs/Page_My Addresses  Farmasi/span_Apply'))

'name required verify edilir'
WebUI.verifyElementVisible(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Empty inputs/Page_My Addresses  Farmasi/p_Name is Required'))

WebUI.setText(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Empty inputs/Page_My Addresses  Farmasi/input_Address Label (i.e. Home, Work, etc.)_name'), 
    'katalon')

'adress label silinir'
WebUI.setText(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Empty inputs/Page_My Addresses  Farmasi/input_Address Type_title'), 
    '')

'apply basılır'
WebUI.click(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Empty inputs/Page_My Addresses  Farmasi/span_Apply'))

'tittle required verify edilir'
WebUI.verifyElementVisible(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Empty inputs/Page_My Addresses  Farmasi/p_Title is Required'))

WebUI.setText(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Empty inputs/Page_My Addresses  Farmasi/input_Address Type_title'), 
    'otomasyon')

WebUI.scrollToPosition(0, 300)

WebUI.delay(3)

'postcode tıklanır'
WebUI.click(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Empty inputs/Page_My Addresses  Farmasi/input_Address 2_postCode'))

'postcode silinir'
WebUI.setText(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Empty inputs/Page_My Addresses  Farmasi/input_Address 2_postCode'), 
    '')

'apply basılır'
WebUI.click(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Empty inputs/Page_My Addresses  Farmasi/span_Apply'))

'postcode required verify edilir'
WebUI.verifyElementVisible(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Empty inputs/Page_My Addresses  Farmasi/p_Post Code is Required'))

WebUI.click(findTestObject('Object Repository/Adress Steps-Negatif Add Adress_Empty inputs/Page_My Addresses  Farmasi/span_Cancel'))

WebUI.closeBrowser()

