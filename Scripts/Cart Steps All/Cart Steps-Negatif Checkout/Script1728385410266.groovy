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

WebUI.click(findTestObject('Object Repository/Cart Steps-Negatif Checkout/Page_Homepage  Farmasi/svg'))

WebUI.setText(findTestObject('Object Repository/Cart Steps-Negatif Checkout/Page_Homepage  Farmasi/input_EN_email'), 'testautomation@farmasitest.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Cart Steps-Negatif Checkout/Page_Homepage  Farmasi/input_E-mail_passwordLogin'), 
    'Lj6COquByXHkrCnO0yj9Nw==')

WebUI.click(findTestObject('Object Repository/Cart Steps-Negatif Checkout/Page_Homepage  Farmasi/span_Login'))

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('Object Repository/Cart Steps-Negatif Checkout/Page_Starter Kit  Farmasi/div_Hair Care'), 
    5)

'Hair submenü mouse over yapılır'
WebUI.mouseOver(findTestObject('Object Repository/Cart Steps-Negatif Checkout/Page_Starter Kit  Farmasi/div_Hair Care'))

'shampoo tıklanır'
WebUI.click(findTestObject('Object Repository/Cart Steps-Negatif Checkout/Page_Starter Kit  Farmasi/div_Shampoo'))

WebUI.delay(5)

WebUI.scrollToPosition(0, 500)

WebUI.delay(3)

'ilk ürün eklenir'
WebUI.click(findTestObject('Object Repository/Cart Steps-Negatif Checkout/Page_Shampoo  Farmasi/svg'))

WebUI.delay(3)

'sepet ikonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Cart Steps-Negatif Checkout/Page_Shampoo  Farmasi/path'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Cart Steps-Negatif Checkout/Page_Basket  Farmasi/span_Checkout'), 
    5)

WebUI.delay(5)

WebUI.click(findTestObject('Cart Steps-Negatif Checkout/Page_Basket  Farmasi/Ürün sayısı'))

'ürün sayısı 99 yazılır'
WebUI.setText(findTestObject('Cart Steps-Negatif Checkout/Page_Basket  Farmasi/Ürün sayısı'), '99')

WebUI.sendKeys(findTestObject('Cart Steps-Negatif Checkout/Page_Basket  Farmasi/Ürün sayısı'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

'+ butonunun clickable olmadığı veriy edilir'
WebUI.verifyElementNotClickable(findTestObject('Cart Steps-Negatif Checkout/Page_Basket  Farmasi/artı butonu'))

WebUI.click(findTestObject('Cart Steps-Negatif Checkout/Page_Basket  Farmasi/eksi butonu'))

WebUI.delay(5)

WebUI.click(findTestObject('Cart Steps-Negatif Checkout/Page_Basket  Farmasi/Ürün sayısı'))

WebUI.setText(findTestObject('Cart Steps-Negatif Checkout/Page_Basket  Farmasi/Ürün sayısı'), '1')

WebUI.sendKeys(findTestObject('Cart Steps-Negatif Checkout/Page_Basket  Farmasi/Ürün sayısı'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('Object Repository/Cart Steps-Negatif Checkout/Page_Checkout  Farmasi/span_Checkout'), 
    5)

'checkout butonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Cart Steps-Negatif Checkout/Page_Checkout  Farmasi/span_Checkout'))

WebUI.delay(5)

'Gri checkout butonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Cart Steps-Negatif Checkout/Page_Checkout  Farmasi/div_Checkout'))

WebUI.delay(3)

'contract checkbox tıklanmadığı için İnformation pop up ı açıldığı verify edilir'
WebUI.waitForElementVisible(findTestObject('Object Repository/Cart Steps-Negatif Checkout/Page_Checkout  Farmasi/h5_Distance selling contract and terms of u_68e034'), 
    3)

WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps-Negatif Checkout/Page_Checkout  Farmasi/h5_Distance selling contract and terms of u_68e034'))

'contract checkbox tıklanır'
WebUI.click(findTestObject('Object Repository/Cart Steps-Negatif Checkout/Page_Checkout  Farmasi/input_Distance selling contract and terms o_cd7b5c'))

'pop up da ki checkout botonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Cart Steps-Negatif Checkout/Page_Checkout  Farmasi/span_Checkout_1'))

'pop up x e tıklanarak pop up tan çıkış yapılır'
WebUI.click(findTestObject('Object Repository/Cart Steps-Negatif Checkout/Page_Checkout  Farmasi/svg'))

'sağ üst köşeden "you havent selected any payment method" hatası alındığı verify edilir'
WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps-Negatif Checkout/Page_Checkout  Farmasi/p_You havent selected any payment method yet'))

WebUI.delay(3)

WebUI.scrollToPosition(0, 500)

WebUI.delay(3)

'balance yes use it butonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Cart Steps-Negatif Checkout/Page_Checkout  Farmasi/span_Yes, Use It'))

'yüksek bir rakam yazılır'
WebUI.setText(findTestObject('Object Repository/Cart Steps-Negatif Checkout/Page_Checkout  Farmasi/input_1274.45_walletBalance'), 
    '500')

'sağda applye butonu yanında kırmızı ünlem işareti verify edilir'
WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps-Negatif Checkout/Page_Checkout  Farmasi/circle'))

'deaktif apple butonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Cart Steps-Negatif Checkout/Page_Checkout  Farmasi/div_Apply'))

WebUI.delay(3)

'Altta kırmızı uyarı mesajı verify edilir'
WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps-Negatif Checkout/Page_Checkout  Farmasi/p_You can not enter an amount higher than 19.25'))

'price verify edilir, 0 olmaması lazım'
WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps-Negatif Checkout/Page_Checkout  Farmasi/span_19.25'), 
    '$17.99')

'balance miktarı 1 yazılır'
WebUI.setText(findTestObject('Object Repository/Cart Steps-Negatif Checkout/Page_Checkout  Farmasi/input_1274.45_walletBalance'), 
    '1')

'apply butonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Cart Steps-Negatif Checkout/Page_Checkout  Farmasi/span_Apply'))

WebUI.delay(5)

'miktarın 1 dolar düşük olduğu verify edilir'
WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps-Negatif Checkout/Page_Checkout  Farmasi/span_18.25'), 
    '$16.99')

'Sadece 1 dolarlık balance kullanarak ödeme yapılamadığı verify edilir (kart vs hiç bir başka yöntem seçilmeden)'
WebUI.delay(3)

'checkout butonuna tıklanır'
WebUI.click(findTestObject('Cart Steps-Negatif Checkout/Page_Checkout  Farmasi/checkoutsubmit'))

WebUI.waitForElementVisible(findTestObject('Cart Steps-Negatif Checkout/Page_Checkout  Farmasi/p_You havent selected any payment method yet'), 
    2)

'sağ üstte you havent selected any payment method uyarısı verify edilir'
WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps-Negatif Checkout/Page_Checkout  Farmasi/p_You havent selected any payment method yet'))

WebUI.delay(3)

'sepet ikonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Cart Steps-Negatif Checkout/Page_Checkout  Farmasi/svg_1'))

WebUI.waitForElementVisible(findTestObject('Cart Steps-Negatif Checkout/Page_Basket  Farmasi/span_Delete All Items'), 5)

WebUI.click(findTestObject('Object Repository/Cart Steps-Negatif Checkout/Page_Basket  Farmasi/span_Delete All Items'))

WebUI.click(findTestObject('Object Repository/Cart Steps-Negatif Checkout/Page_Basket  Farmasi/span_Yes, Delete It'))

'sepet silinir ve silindiği verify edilir'
WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps-Negatif Checkout/Page_Basket  Farmasi/h2_Cart Empty'), 
    'Cart Empty')

WebUI.closeBrowser()

