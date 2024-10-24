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

WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Homepage  Farmasi/svg'))

WebUI.setText(findTestObject('Object Repository/Cart Steps/Page_Homepage  Farmasi/input_EN_email'), 'testautomation@farmasitest.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Cart Steps/Page_Homepage  Farmasi/input_E-mail_passwordLogin'), 
    'Lj6COquByXHkrCnO0yj9Nw==')

WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Homepage  Farmasi/span_Login'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Starter Kit  Farmasi/img_EN_styles_image__qb0tG'))

'Login olunduğu verify etmek için profil ikonuna tıklanır ve sign out elementi check edilir'
WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps/Page_Starter Kit  Farmasi/span_Sign Out'))

WebUI.setText(findTestObject('Object Repository/Cart Steps/Page_Starter Kit  Farmasi/input_Hotlist_styles_searchInput__i1gZE false'), 
    'cream')

'search kısmına cream yazılır ve arama butonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Starter Kit  Farmasi/svg'))

WebUI.delay(3)

WebUI.scrollToPosition(0, 450)

'16. sırada ki  ürünü add butonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Search Result for cream  Farmasi/addToCartButton 16'))

'18. sırada ki ürünü add butonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Search Result for cream  Farmasi/addToCartButton 18'))

'sepet ikonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Search Result for cream  Farmasi/cartIcon'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/h2_Your Cart'), 5)

WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/h2_Your Cart'))

'ürün altında ki remove butonu clickable kontrolü yapılır'
WebUI.verifyElementClickable(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/span_Remove'))

'ürün altında ki remove butonu clickable kontrolü yapılır'
WebUI.verifyElementClickable(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/span_Remove_1'))

'ürün yanında ki çöp kutusu butonu clickable kontrolü yapılır'
WebUI.verifyElementClickable(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/svg'))

'ürün yanında ki çöp kutusu butonu clickable kontrolü yapılır'
WebUI.verifyElementClickable(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/svg_1'))

'ürün yanında ki + butonu clickable kontrolü yapılır'
WebUI.verifyElementClickable(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/artı butonu ilk ürün'))

'ürün yanında ki + butonu clickable kontrolü yapılır'
WebUI.verifyElementClickable(findTestObject('Cart Steps/Page_Basket  Farmasi/artı butonu ikinci ürün'))

'Delete All Items butonu clickable kontrolü yapılır'
WebUI.verifyElementClickable(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/span_Delete All Items'))

'Checkout altında ki Continue Shopping butonu clickable kontrolü yapılır'
WebUI.verifyElementClickable(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/span_Continue Shopping'))

'ürün altında ki remove butonu tıklanır'
WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/span_Remove'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/h5_(1 items)'), '(1 items)')

'ürün yanında ki + butonu tıklanır'
WebUI.click(findTestObject('Cart Steps/Page_Basket  Farmasi/artı butonu'))

WebUI.delay(4)

'+ butonu sonra 2 sayısı kontrol edilir, daha sonra sayı yazma editlenir ve 20 yazılıp enter e basılır, 20 verify edilir'
WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/products sayısı sağda ki price üstünde ki'), 
    '2', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Cart Steps/Page_Basket  Farmasi/product count set'), '20')

WebUI.sendKeys(findTestObject('Cart Steps/Page_Basket  Farmasi/product count set'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/products sayısı sağda ki price üstünde ki'), 
    '20')

'Delete All Items butonu tıklanır'
WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/span_Delete All Items'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/h5_Delete Your Cart'), 3)

WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/h5_Delete Your Cart'))

WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/span_Yes, Delete It'))

WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/h2_Cart Empty'), 5)

'Car Empty yazısı verify edilir'
WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/h2_Cart Empty'))

'"Go to Category Page"  ve Go to Wishlist butonları clickable kontrolü yapılır'
WebUI.verifyElementClickable(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/span_Go to Category Page'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/span_Go to Wishlist'))

'"Go to Category Page"  tıklanır'
WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/span_Go to Category Page'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Cart Steps/Page_Homepage  Farmasi/div_Hair Care'), 3)

'Submenü Hair care üstüne mouse over yapılır'
WebUI.mouseOver(findTestObject('Object Repository/Cart Steps/Page_Homepage  Farmasi/div_Hair Care'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps/Page_Homepage  Farmasi/div_Shampoo'))

'shampoo elementi visible kontrolü yapılır ve tıklanır'
WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Homepage  Farmasi/div_Shampoo'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Cart Steps/Page_Shampoo  Farmasi/h4_Shampoo'), 3)

'kategori sayfası açıldığı verify edilir'
WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps/Page_Shampoo  Farmasi/h4_Shampoo'))

WebUI.scrollToPosition(0, 400)

'Kategori sayfasında ürünlerin geldiğini addtocart butonlarının clickable kontrolü ile verify ediliyor'
WebUI.verifyElementClickable(findTestObject('Cart Steps/Page_Shampoo  Farmasi/addToCartButton 6'))

'Kategori sayfasında ürünlerin geldiğini addtocart butonlarının clickable kontrolü ile verify ediliyor'
WebUI.verifyElementClickable(findTestObject('Cart Steps/Page_Shampoo  Farmasi/addToCartButton 8'))

'İlk ürün + işaretine tıklanır sepete eklenir'
WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Shampoo  Farmasi/addToCartButton 2'))

'İkinci ürün + işaretine tıklanır sepete eklenir'
WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Shampoo  Farmasi/addToCartButton 4'))

'Sepet ikonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Shampoo  Farmasi/Carticon'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/h2_Your Cart'), 5)

WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/h2_Your Cart'))

'İlk ürün çöp ikonun tıklanır ve silindiği verify edilir'
WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/svg_1_2_3_4'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/h5_(1 items)'), '(1 items)')

'Continue Shopping butonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/span_Continue Shopping'))

WebUI.delay(3)

'sepet ikonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Homepage  Farmasi/path'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/span_Checkout'), 3)

WebUI.verifyElementClickable(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/span_Checkout'))

'Checkout butonuna taklanır'
WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/span_Checkout'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Cart Steps/Page_Checkout  Farmasi/h5_Shipping Address'), 3)

'Checkout sayfasında olunduğu verify edilir'
WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps/Page_Checkout  Farmasi/h5_Shipping Address'))

WebUI.delay(3)

'Product fiyatını get text ile alır'
a = WebUI.getText(findTestObject('Cart Steps/Page_Checkout  Farmasi/default kargo ile fiyat tutarı'), FailureHandling.STOP_ON_FAILURE)

'Yüksek fiyatlı kargo seçimi yapar'
WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Checkout  Farmasi/div_DHL_styles_methodsOption__99Sb5'))

WebUI.delay(5)

b = WebUI.getText(findTestObject('Cart Steps/Page_Checkout  Farmasi/Yüksek kargo seçimi ile fiyat tutarı'))

'**ELEMENT OLARAK SPAN_25 İ BUL KOY'
WebUI.verifyNotEqual(b, a)

WebUI.scrollToPosition(0, 300)

WebUI.delay(3)

'Yes use it seçeneği balance butonu clickable kontrolü yapılır'
WebUI.verifyElementClickable(findTestObject('Object Repository/Cart Steps/Page_Checkout  Farmasi/span_Yes, Use It'))

WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Checkout  Farmasi/span_Yes, Use It'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Cart Steps/Page_Checkout  Farmasi/span_Apply'), 3)

'Apply butonu clickable kontrolü yapılır'
WebUI.verifyElementClickable(findTestObject('Object Repository/Cart Steps/Page_Checkout  Farmasi/span_Apply'))

'Cancel butonu clickable kontrolü yapılır'
WebUI.verifyElementClickable(findTestObject('Object Repository/Cart Steps/Page_Checkout  Farmasi/p_Cancel Using Balance'))

WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Checkout  Farmasi/span_Apply'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Cart Steps/Page_Checkout  Farmasi/span_0.00'), 5)

'Balance apply sonrası ödeme miktarı 0 olduğu verify edilir'
WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps/Page_Checkout  Farmasi/span_0.00'), '$0.00')

WebUI.scrollToPosition(0, 300)

'Contract butonu clikable kontrolü yapılır'
WebUI.verifyElementClickable(findTestObject('Object Repository/Cart Steps/Page_Checkout  Farmasi/span_Distance selling contract and terms of_822ccd'))

'Contract radio buton tıklanır'
WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Checkout  Farmasi/input_Choose another way to pay_agreements'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Cart Steps/Page_Checkout  Farmasi/span_Checkout'), 5)

'Checkout tıklanır'
WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Checkout  Farmasi/span_Checkout'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Cart Steps/Page_Checkout Result  Farmasi/h4_Thank you for your order'), 
    8)

'Order mesajı verify edilir'
WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps/Page_Checkout Result  Farmasi/h4_Thank you for your order'))

WebUI.takeScreenshot()

'Myorders clickable kontrolü yapılır'
WebUI.verifyElementClickable(findTestObject('Object Repository/Cart Steps/Page_Checkout Result  Farmasi/a_My Orders'))

'Altta Products elementi verify edilir'
WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps/Page_Checkout Result  Farmasi/h5_Products'))

'Sipariş özeti tüm bilgileri verify edilir'
WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps/Page_Checkout Result  Farmasi/h6_Shipping Address'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps/Page_Checkout Result  Farmasi/h6_Billing Address'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps/Page_Checkout Result  Farmasi/h6_Order No'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps/Page_Checkout Result  Farmasi/h6_Shipping Price'))

'My oders butonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Checkout Result  Farmasi/a_My Orders'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Cart Steps/Page_My Orders  Farmasi/h1_My Orders'), 5)

WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps/Page_My Orders  Farmasi/h1_My Orders'))

WebUI.delay(5)

'Order processing check edilir'
WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps/Page_My Orders  Farmasi/p_Order Processing'), 'Order Processing')

'Order processing tıklanır'
WebUI.click(findTestObject('Object Repository/Cart Steps/Page_My Orders  Farmasi/p_Order Processing'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Cart Steps/Page_Order Detail  Farmasi/span_Cancel Order'), 
    5)

'Cancel order butonu verify edilir'
WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps/Page_Order Detail  Farmasi/span_Cancel Order'))

WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Order Detail  Farmasi/span_Cancel Order'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Cart Steps/Page_Order Detail  Farmasi/h3_Cancel Order'), 3)

WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps/Page_Order Detail  Farmasi/h3_Cancel Order'))

'No keep it clickable kontrolü yapılır'
WebUI.verifyElementClickable(findTestObject('Object Repository/Cart Steps/Page_Order Detail  Farmasi/span_No, Keep It'))

'Yes cancel  it butonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Order Detail  Farmasi/span_Yes, Cancel It'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Cart Steps/Page_Order Detail  Farmasi/h5_Return Payment Type'), 
    3)

'Return Payment Type frame i açıldığı verify edilir'
WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps/Page_Order Detail  Farmasi/h5_Return Payment Type'))

'Farmasi wallet butonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Order Detail  Farmasi/span_Farmasi Wallet'))

WebUI.setText(findTestObject('Object Repository/Cart Steps/Page_Order Detail  Farmasi/textarea_T'), 'Test')

'Cancel butonu clickable kontrolü yapılır'
WebUI.verifyElementClickable(findTestObject('Object Repository/Cart Steps/Page_Order Detail  Farmasi/button_Cancel'))

'Select butonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Order Detail  Farmasi/span_Select'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Cart Steps/Page_Order Detail  Farmasi/h4_Order Cancelled'), 
    5)

'Order Canceled verify edilir'
WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps/Page_Order Detail  Farmasi/h4_Order Cancelled'))

WebUI.takeScreenshot()

'Profil ikonuna tıklanır'
WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Order Detail  Farmasi/img_EN_styles_image__qb0tG'))

'Sign out clickable kontrolü yapılır'
WebUI.verifyElementClickable(findTestObject('Object Repository/Cart Steps/Page_Order Detail  Farmasi/span_Sign Out'))

WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Order Detail  Farmasi/span_Sign Out'))

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('Object Repository/Cart Steps/Page_Homepage  Farmasi/svg'), 7)

WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Homepage  Farmasi/svg'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Cart Steps/Page_Homepage  Farmasi/span_Login'), 3)

WebUI.verifyElementClickable(findTestObject('Object Repository/Cart Steps/Page_Homepage  Farmasi/span_Login'))

