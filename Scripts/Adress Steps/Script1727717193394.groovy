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

WebUI.click(findTestObject('Object Repository/Adress Steps/Page_Homepage  Farmasi/svg'))

WebUI.setText(findTestObject('Object Repository/Adress Steps/Page_Homepage  Farmasi/input_EN_email'), 'siparis3@pinar.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Adress Steps/Page_Homepage  Farmasi/input_E-mail_passwordLogin'), 
    'Lj6COquByXHkrCnO0yj9Nw==')

WebUI.click(findTestObject('Object Repository/Adress Steps/Page_Homepage  Farmasi/span_Login'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Adress Steps/Page_Starter Kit  Farmasi/img_EN_styles_image__qb0tG'))

'profil ikonundan my adress butonuna tıklanır'
WebUI.waitForElementVisible(findTestObject('Object Repository/Adress Steps/Page_Starter Kit  Farmasi/span_My Addresses'), 
    3)

WebUI.verifyElementClickable(findTestObject('Object Repository/Adress Steps/Page_Starter Kit  Farmasi/span_My Addresses'))

WebUI.click(findTestObject('Object Repository/Adress Steps/Page_Starter Kit  Farmasi/span_My Addresses'))

WebUI.waitForPageLoad(3)

WebUI.verifyElementText(findTestObject('Object Repository/Adress Steps/Page_My Addresses  Farmasi/h1_My Addresses'), 'My Addresses')

'billing adress ve shipping adres butonları clickable kontrolü yapılır\n'
WebUI.verifyElementClickable(findTestObject('Object Repository/Adress Steps/Page_My Addresses  Farmasi/span_Billing Addresses'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Adress Steps/Page_My Addresses  Farmasi/div_Shipping AddressesBilling Addresses'))

'+ add new adres butonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Adress Steps/Page_My Addresses  Farmasi/span_Add a New Address'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Adress Steps/Page_My Addresses  Farmasi/h5_Add a New Address'), 
    3)

WebUI.verifyElementVisible(findTestObject('Object Repository/Adress Steps/Page_My Addresses  Farmasi/h5_Add a New Address'))

WebUI.setText(findTestObject('Object Repository/Adress Steps/Page_My Addresses  Farmasi/input_Address Type_title'), 'otomasyon')

WebUI.setText(findTestObject('Object Repository/Adress Steps/Page_My Addresses  Farmasi/input_Address Label (i.e. Home, Work, etc.)_name'), 
    'katolon')

WebUI.setText(findTestObject('Object Repository/Adress Steps/Page_My Addresses  Farmasi/input_First Name_surname'), 'stdyo')

WebUI.setText(findTestObject('Object Repository/Adress Steps/Page_My Addresses  Farmasi/input_Last Name_phone'), '(123) 456-7889')

WebUI.setText(findTestObject('Object Repository/Adress Steps/Page_My Addresses  Farmasi/input_Mobile Phone_address'), 'ter')

'adress kısmına "ter" yazılıp altta adres şehirlerin vs çıkması beklenir, daha sonra terminal ile başlayan seçilir'
WebUI.waitForElementVisible(findTestObject('Object Repository/Adress Steps/Page_My Addresses  Farmasi/span_Terminal 3, Mississauga, ON, Canada'), 
    3)

WebUI.click(findTestObject('Object Repository/Adress Steps/Page_My Addresses  Farmasi/span_Terminal 3, Mississauga, ON, Canada'))

WebUI.click(findTestObject('Object Repository/Adress Steps/Page_My Addresses  Farmasi/span_Apply'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Adress Steps/Page_My Addresses  Farmasi/h6_otomasyon'), 5)

WebUI.verifyElementVisible(findTestObject('Object Repository/Adress Steps/Page_My Addresses  Farmasi/h6_otomasyon'))

'adres altında ki edit ve delete butonları clickable kontrolü yapılır'
WebUI.verifyElementClickable(findTestObject('Object Repository/Adress Steps/Page_My Addresses  Farmasi/span_Delete'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Adress Steps/Page_My Addresses  Farmasi/span_Edit'))

'edit tuşuna basılır'
WebUI.click(findTestObject('Object Repository/Adress Steps/Page_My Addresses  Farmasi/span_Edit'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Adress Steps/Page_My Addresses  Farmasi/h5_Edit Address'), 
    3)

WebUI.verifyElementVisible(findTestObject('Object Repository/Adress Steps/Page_My Addresses  Farmasi/h5_Edit Address'))

'lastname alanına edit yazılır ve apply ile kaydedilir'
WebUI.setText(findTestObject('Object Repository/Adress Steps/Page_My Addresses  Farmasi/input_First Name_surname'), 'stdyoedit')

WebUI.click(findTestObject('Object Repository/Adress Steps/Page_My Addresses  Farmasi/span_Apply'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Adress Steps/Page_My Addresses  Farmasi/h6_otomasyon'), 3)

'edit in doğru çalıştığını teyit etmek için name-last name alanı verify edilir'
WebUI.verifyElementText(findTestObject('Object Repository/Adress Steps/Page_My Addresses  Farmasi/span_katolon stdyoedit'), 
    'katolon stdyoedit')

WebUI.click(findTestObject('Object Repository/Adress Steps/Page_My Addresses  Farmasi/div_Men'))

'submenüden men\'e tıklanır'
WebUI.waitForElementVisible(findTestObject('Object Repository/Adress Steps/Page_Men  Farmasi/h4_Men'), 5)

WebUI.verifyElementVisible(findTestObject('Object Repository/Adress Steps/Page_Men  Farmasi/h4_Men'))

WebUI.scrollToPosition(0, 150)

'ürün eklenir'
WebUI.click(findTestObject('Adress Steps/Page_Men  Farmasi/addtocart buton'))

'sepet ikonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Adress Steps/Page_Men  Farmasi/svg_1'))

WebUI.refresh()

WebUI.waitForElementVisible(findTestObject('Object Repository/Adress Steps/Page_Basket  Farmasi/h2_Your Cart'), 5)

WebUI.verifyElementVisible(findTestObject('Object Repository/Adress Steps/Page_Basket  Farmasi/h2_Your Cart'))

'checkout butonu clickable kontrolü yapılır'
WebUI.verifyElementClickable(findTestObject('Object Repository/Adress Steps/Page_Basket  Farmasi/span_Checkout'))

WebUI.click(findTestObject('Object Repository/Adress Steps/Page_Basket  Farmasi/span_Checkout'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Adress Steps/Page_Checkout  Farmasi/h5_Shipping Address'), 
    5)

WebUI.verifyElementVisible(findTestObject('Object Repository/Adress Steps/Page_Checkout  Farmasi/h5_Shipping Address'))

'Add a new one \' kırmızı yazının clickable kontrolü yapılır'
WebUI.verifyElementClickable(findTestObject('Object Repository/Adress Steps/Page_Checkout  Farmasi/span_Add a new one'))

'See all clickable kontrolü yapılır'
WebUI.verifyElementClickable(findTestObject('Object Repository/Adress Steps/Page_Checkout  Farmasi/span_See All'))

'See all butonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Adress Steps/Page_Checkout  Farmasi/span_See All'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Adress Steps/Page_Checkout  Farmasi/h5_Registered Addresses'), 
    3)

'açılan sayfada ki Registered Addresses başlığı check edilir'
WebUI.verifyElementVisible(findTestObject('Object Repository/Adress Steps/Page_Checkout  Farmasi/h5_Registered Addresses'))

'Edit butonu clickable kontrolü yapılır'
WebUI.verifyElementClickable(findTestObject('Object Repository/Adress Steps/Page_Checkout  Farmasi/span_Edit'))

'Delete butonu clickable kontrolü yapılır'
WebUI.verifyElementClickable(findTestObject('Object Repository/Adress Steps/Page_Checkout  Farmasi/span_Delete'))

'Adres seçimleri radio butonu  clickable kontrolü yapılır'
WebUI.verifyElementClickable(findTestObject('Object Repository/Adress Steps/Page_Checkout  Farmasi/div_zferfgrg_styles_cardHeaderRadioActive___dc40d8'))

'Yanda ki Registered ekranında ki adress search kısmında arama yapılır'
WebUI.setText(findTestObject('Object Repository/Adress Steps/Page_Checkout  Farmasi/input_Registered Addresses_styles_searchInp_1c5f53'), 
    'otomasyon')

'search butonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Adress Steps/Page_Checkout  Farmasi/svg_1_2'))

'Ekran görüntüsü alınır'
WebUI.takeScreenshot()

WebUI.verifyElementVisible(findTestObject('Object Repository/Adress Steps/Page_Checkout  Farmasi/h6_otomasyon'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Adress Steps/Page_Checkout  Farmasi/span_Add a New Address'))

'Add q new adress butonuna tıklanır, yeni pencere açılır'
WebUI.click(findTestObject('Object Repository/Adress Steps/Page_Checkout  Farmasi/span_Add a New Address'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Adress Steps/Page_Checkout  Farmasi/h5_Add a New Address'), 
    3)

'yeni adres ekleme buradan da denenir'
WebUI.verifyElementVisible(findTestObject('Object Repository/Adress Steps/Page_Checkout  Farmasi/h5_Add a New Address'))

WebUI.setText(findTestObject('Object Repository/Adress Steps/Page_Checkout  Farmasi/input_Address Type_title'), 'otomasyonlast')

WebUI.setText(findTestObject('Object Repository/Adress Steps/Page_Checkout  Farmasi/input_Address Label (i.e. Home, Work, etc.)_name'), 
    'katalonee')

WebUI.setText(findTestObject('Object Repository/Adress Steps/Page_Checkout  Farmasi/input_First Name_surname'), 'studyone')

WebUI.setText(findTestObject('Object Repository/Adress Steps/Page_Checkout  Farmasi/input_Last Name_phone'), '(765) 434-5678')

'adress şehir kısmına tea yazılıp beklenir, seçenekler görülür'
WebUI.setText(findTestObject('Object Repository/Adress Steps/Page_Checkout  Farmasi/input_Mobile Phone_address'), 'tea')

WebUI.waitForElementVisible(findTestObject('Object Repository/Adress Steps/Page_Checkout  Farmasi/span_Teeswater, ON, Canada'), 
    5)

WebUI.verifyElementClickable(findTestObject('Object Repository/Adress Steps/Page_Checkout  Farmasi/span_Teeswater, ON, Canada'))

WebUI.click(findTestObject('Object Repository/Adress Steps/Page_Checkout  Farmasi/span_Teeswater, ON, Canada'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Adress Steps/Page_Checkout  Farmasi/span_Apply'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Object Repository/Adress Steps/Page_Checkout  Farmasi/h6_otomasyonlast'), 'otomasyonlast')

'otomasyonlast radio buton seçilir'
WebUI.click(findTestObject('Object Repository/Adress Steps/Page_Checkout  Farmasi/div_otomasyonlast_styles_cardHeaderRadioAct_aaefbe'))

WebUI.click(findTestObject('Object Repository/Adress Steps/Page_Checkout  Farmasi/span_Select'))

'Yanda ki pencerenin kapandığı kontrol edilir, see all butonu visible kontrolü yapılır'
WebUI.waitForElementVisible(findTestObject('Object Repository/Adress Steps/Page_Checkout  Farmasi/span_See All'), 3)

WebUI.verifyElementVisible(findTestObject('Object Repository/Adress Steps/Page_Checkout  Farmasi/span_See All'))

'otomasyon yazan adress altında ki delete butonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Adress Steps/Page_Checkout  Farmasi/span_Delete_1'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Adress Steps/Page_Checkout  Farmasi/h5_Delete Address'), 3)

WebUI.verifyElementVisible(findTestObject('Object Repository/Adress Steps/Page_Checkout  Farmasi/h5_Delete Address'))

'No keep it butonu clickable kontrolü yapılır'
WebUI.verifyElementClickable(findTestObject('Object Repository/Adress Steps/Page_Checkout  Farmasi/span_No, Keep It'))

'yes delete it butonu clickable kontrolü yapılır'
WebUI.verifyElementClickable(findTestObject('Object Repository/Adress Steps/Page_Checkout  Farmasi/span_Yes, Delete It'))

WebUI.click(findTestObject('Object Repository/Adress Steps/Page_Checkout  Farmasi/span_Yes, Delete It'))

WebUI.delay(5)

WebUI.verifyElementNotHasAttribute(findTestObject('Adress Steps/Page_Checkout  Farmasi/adresHeadline'), 'otomasyon', 0)

'profil ikonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Adress Steps/Page_Homepage  Farmasi/img_EN_styles_image__qb0tG'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Adress Steps/Page_Starter Kit  Farmasi/span_My Addresses'), 
    3)

WebUI.verifyElementVisible(findTestObject('Object Repository/Adress Steps/Page_Homepage  Farmasi/span_My Addresses'))

'my adress butonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Adress Steps/Page_Homepage  Farmasi/span_My Addresses'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Adress Steps/Page_My Addresses  Farmasi/h1_My Addresses'), 
    5)

WebUI.verifyElementVisible(findTestObject('Object Repository/Adress Steps/Page_My Addresses  Farmasi/h1_My Addresses'))

'otomasyonlast check edilir'
WebUI.verifyElementVisible(findTestObject('Object Repository/Adress Steps/Page_My Addresses  Farmasi/h6_otomasyonlast'))

WebUI.click(findTestObject('Object Repository/Adress Steps/Page_My Addresses  Farmasi/span_Delete'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Adress Steps/Page_Checkout  Farmasi/h5_Delete Address'), 3)

'delete ile silinir ve silindiği check edilir'
WebUI.verifyElementVisible(findTestObject('Object Repository/Adress Steps/Page_My Addresses  Farmasi/h5_Delete Address'))

WebUI.click(findTestObject('Object Repository/Adress Steps/Page_My Addresses  Farmasi/span_Yes, Delete It'))

WebUI.delay(3)

WebUI.verifyElementNotHasAttribute(findTestObject('Object Repository/Adress Steps/Page_Checkout  Farmasi/h6_otomasyonlast'), 
    'otomasyonlast', 0)

'sepete gidilip sepet silinir'
WebUI.click(findTestObject('Object Repository/Adress Steps/Page_My Addresses  Farmasi/div_1'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Adress Steps/Page_Basket  Farmasi/span_Delete All Items'), 
    3)

WebUI.click(findTestObject('Object Repository/Adress Steps/Page_Basket  Farmasi/span_Delete All Items'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Adress Steps/Page_Checkout  Farmasi/span_Yes, Delete It'), 
    3)

WebUI.click(findTestObject('Object Repository/Adress Steps/Page_Basket  Farmasi/span_Yes, Delete It'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Adress Steps/Page_Basket  Farmasi/h2_Cart Empty'), 3)

WebUI.verifyElementVisible(findTestObject('Object Repository/Adress Steps/Page_Basket  Farmasi/h2_Cart Empty'))

'profil ikonuna tıklanır sign out verify edilir'
WebUI.click(findTestObject('Object Repository/Adress Steps/Page_Basket  Farmasi/img_EN_styles_image__qb0tG'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Adress Steps/Page_Basket  Farmasi/span_Sign Out'), 3)

WebUI.click(findTestObject('Object Repository/Adress Steps/Page_Basket  Farmasi/span_Sign Out'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Adress Steps/Page_Homepage  Farmasi/svg'), 5)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Adress Steps/Page_Homepage  Farmasi/svg'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Adress Steps/Page_Basket  Farmasi/span_Login'))

} catch (Exception e) {
	// Hata durumunda ekran görüntüsü al ve proje dizininde belirli bir klasöre kaydet
	WebUI.takeScreenshot(screenshotPath)
	
	KeywordUtil.markFailedAndStop("Bir hata oluştu: " + e.getMessage() + "\nEkran görüntüsü alındı: " + screenshotPath)
} finally {
	// Tarayıcıyı kapatma işlemi
	WebUI.closeBrowser()
}
