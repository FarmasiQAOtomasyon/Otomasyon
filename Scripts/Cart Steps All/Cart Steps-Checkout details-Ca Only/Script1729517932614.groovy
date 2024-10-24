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

WebUI.click(findTestObject('Object Repository/Cart Steps-Checkout details-Ca Only/Page_Homepage  Farmasi/svg'))

WebUI.setText(findTestObject('Object Repository/Cart Steps-Checkout details-Ca Only/Page_Homepage  Farmasi/input_EN_email'), 
    'testautomation@farmasitest.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Cart Steps-Checkout details-Ca Only/Page_Homepage  Farmasi/input_E-mail_passwordLogin'), 
    'Lj6COquByXHkrCnO0yj9Nw==')

WebUI.click(findTestObject('Object Repository/Cart Steps-Checkout details-Ca Only/Page_Homepage  Farmasi/span_Login'))

WebUI.delay(7)

'sabit bir ürün kodu yazılır'
WebUI.setText(findTestObject('Object Repository/Cart Steps-Checkout details-Ca Only/Page_Shampoo  Farmasi/input_Hotlist_styles_searchInput__i1gZE false'), 
    '1119082')

WebUI.click(findTestObject('Object Repository/Cart Steps-Checkout details-Ca Only/Page_Shampoo  Farmasi/svg'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Cart Steps-Checkout details-Ca Only/Page_Search Result for 1119082  Farmasi/svg'), 
    5)

'ürün addtocart butonu tıklanır'
WebUI.click(findTestObject('Object Repository/Cart Steps-Checkout details-Ca Only/Page_Search Result for 1119082  Farmasi/svg'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Cart Steps-Checkout details-Ca Only/Page_Men  Farmasi/path'), 
    5)

'sepete gidilir'
WebUI.click(findTestObject('Object Repository/Cart Steps-Checkout details-Ca Only/Page_Men  Farmasi/path'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Cart Steps-Checkout details-Ca Only/Page_Basket  Farmasi/span_Checkout'), 
    5)

'üründen 10 adet eklenir'
WebUI.setText(findTestObject('Cart Steps-Checkout details-Ca Only/Page_Basket  Farmasi/count'), '10')

WebUI.sendKeys(findTestObject('Cart Steps-Checkout details-Ca Only/Page_Basket  Farmasi/count'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

'checkout tıklanır'
WebUI.click(findTestObject('Cart Steps-Checkout details-Ca Only/Page_Basket  Farmasi/span_Checkout'))

WebUI.delay(8)

'tax price değişken olarak get text alınır'
taxPrice = WebUI.getText(findTestObject('Cart Steps-Checkout details-Ca Only/Page_Checkout  Farmasi/Tax price'))

'ürün fiyatı 40 dolardan fazla olduğu için Tax price 0 dan farklı olduğu verify edilir'
WebUI.verifyNotMatch(taxPrice, '$0', false)

WebUI.delay(3)

'sepet ikonuna tıklanır'
WebUI.click(findTestObject('Cart Steps-Checkout details-Ca Only/Page_Men  Farmasi/path'))

WebUI.delay(5)

'ürün adedi 1 tıklanır'
WebUI.setText(findTestObject('Cart Steps-Checkout details-Ca Only/Page_Basket  Farmasi/count'), '1')

WebUI.sendKeys(findTestObject('Cart Steps-Checkout details-Ca Only/Page_Basket  Farmasi/count'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

'checkout butonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Cart Steps-Checkout details-Ca Only/Page_Basket  Farmasi/span_Checkout'))

WebUI.delay(5)

'Sales Tax elementi verify edilir'
WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps-Checkout details-Ca Only/Page_Checkout  Farmasi/span_Sales Tax'))

'tax ücreti verify edilir'
WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps-Checkout details-Ca Only/Page_Checkout  Farmasi/Tax price'), 
    '$0')

selectedshippingmethod = WebUI.getText(findTestObject('Object Repository/Cart Steps-Checkout details-Ca Only/Page_Checkout  Farmasi/span_9.99'))

WebUI.comment('selectedshippingmethod: ' + selectedshippingmethod // Değişkenin değerini konsola yazdırır
    )

'Shipping Costs elementi verify edilir'
WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps-Checkout details-Ca Only/Page_Checkout  Farmasi/span_Shipping Costs'))

shippingCosts = WebUI.getText(findTestObject('Object Repository/Cart Steps-Checkout details-Ca Only/Page_Checkout  Farmasi/span_9.99_1'))

WebUI.comment('shippingCosts: ' + shippingCosts // Değişkenin değerini konsola yazdırır
    )

String shippingCosts = shippingCosts.replace('$', '')

'Seçili Shipping Methods ile sağda ki shipping Costs aynı olduğu verify edilir'
WebUI.verifyEqual(selectedshippingmethod, shippingCosts)

pricedefault = WebUI.getText(findTestObject('Object Repository/Cart Steps-Checkout details-Ca Only/Page_Checkout  Farmasi/span_19.25'))

WebUI.comment('pricedefault: ' + pricedefault // Değişkenin değerini konsola yazdırır
    )

String pricedefault = pricedefault.replace('$', '')

'farklı kargo seçeneği seçilir, fiyatı yüksek olan'
WebUI.click(findTestObject('Object Repository/Cart Steps-Checkout details-Ca Only/Page_Checkout  Farmasi/div_DHL_styles_methodsOption__99Sb5'))

WebUI.delay(7)

priceafter = WebUI.getText(findTestObject('Object Repository/Cart Steps-Checkout details-Ca Only/Page_Checkout  Farmasi/span_25.67'))

WebUI.comment('priceafter: ' + priceafter // Değişkenin değerini konsola yazdırır
    )

String priceafter = priceafter.replace('$', '')

'kargo değişimi sonrası fiyatın aynı olmadığı verify edilir'
WebUI.verifyNotEqual(pricedefault, priceafter)

shippingCostsAfter = WebUI.getText(findTestObject('Object Repository/Cart Steps-Checkout details-Ca Only/Page_Checkout  Farmasi/span_15.99'))

WebUI.comment('shippingCostsAfter: ' + shippingCostsAfter // Değişkenin değerini konsola yazdırır
    )

String shippingCostsAfter = shippingCostsAfter.replace('$', '')

WebUI.verifyNotEqual(shippingCosts, shippingCostsAfter)

'İlk kargo seçimi için default kargo butonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Cart Steps-Checkout details-Ca Only/Page_Checkout  Farmasi/div_Shipping Methods_styles_methodsOption__99Sb5'))

WebUI.delay(5)

lastprice = WebUI.getText(findTestObject('Object Repository/Cart Steps-Checkout details-Ca Only/Page_Checkout  Farmasi/span_19.25'))

WebUI.comment('lastprice: ' + lastprice // Değişkenin değerini konsola yazdırır
    )

String lastprice = lastprice.replace('$', '')

'Price in ilk price ile aynı olduğu verify edilir (Checkout butonu üstündeki)'
WebUI.verifyEqual(lastprice, pricedefault)

lastshippingCosts = WebUI.getText(findTestObject('Object Repository/Cart Steps-Checkout details-Ca Only/Page_Checkout  Farmasi/span_9.99_1'))

WebUI.comment('lastshippingCosts: ' + lastshippingCosts // Değişkenin değerini konsola yazdırır
    )

String lastshippingCosts = lastshippingCosts.replace('$', '')

'Shipping Cotst un ilk hali ile aynı olduğu verify edilir'
WebUI.verifyEqual(lastshippingCosts, shippingCosts)

'Balance için yes butonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Cart Steps-Checkout details-Ca Only/Page_Checkout  Farmasi/span_Yes, Use It'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Cart Steps-Checkout details-Ca Only/Page_Checkout  Farmasi/p_Cancel Using Balance'), 
    5)

'Cancel butonu clickable kontrolü yapılır'
WebUI.verifyElementClickable(findTestObject('Object Repository/Cart Steps-Checkout details-Ca Only/Page_Checkout  Farmasi/p_Cancel Using Balance'))

'Apply butonu clickable kontrolü yapılır'
WebUI.verifyElementClickable(findTestObject('Object Repository/Cart Steps-Checkout details-Ca Only/Page_Checkout  Farmasi/span_Apply'))

WebUI.delay(2)

balancedefaultprice = WebUI.getAttribute(findTestObject('Cart Steps-Checkout details-Ca Only/Page_Checkout  Farmasi/input_1274.45_walletBalance'), 
    'data-value')

WebUI.comment('balancedefaultprice: ' + balancedefaultprice // Değişkenin değerini konsola yazdırır
    )

WebUI.delay(2)

WebUI.verifyEqual(balancedefaultprice, lastprice)

'apply butonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Cart Steps-Checkout details-Ca Only/Page_Checkout  Farmasi/span_Apply'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps-Checkout details-Ca Only/Page_Checkout  Farmasi/span_0.00'), 
    '$0.00')

'sepet ikonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Cart Steps-Checkout details-Ca Only/Page_Checkout  Farmasi/svg'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Cart Steps-Checkout details-Ca Only/Page_Basket  Farmasi/span_Delete All Items'), 
    5)

WebUI.click(findTestObject('Object Repository/Cart Steps-Checkout details-Ca Only/Page_Basket  Farmasi/span_Delete All Items'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Cart Steps-Checkout details-Ca Only/Page_Basket  Farmasi/span_Yes, Delete It'), 
    3)

'all delete butonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Cart Steps-Checkout details-Ca Only/Page_Basket  Farmasi/span_Yes, Delete It'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Cart Steps-Checkout details-Ca Only/Page_Basket  Farmasi/h2_Cart Empty'), 
    3)

WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps-Checkout details-Ca Only/Page_Basket  Farmasi/h2_Cart Empty'))

WebUI.closeBrowser()

