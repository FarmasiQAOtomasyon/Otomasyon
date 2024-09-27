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

WebUI.click(findTestObject('Object Repository/Page_Homepage  Farmasi/svg'))

WebUI.waitForElementClickable(findTestObject('Page_Homepage  Farmasi/input_Catalog_email'), 0)

WebUI.click(findTestObject('Page_Homepage  Farmasi/input_Catalog_email'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Homepage  Farmasi/input_Catalog_email'), 'siparis3@pinar.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Homepage  Farmasi/input_E-mail_passwordLogin'), 'Lj6COquByXHkrCnO0yj9Nw==')

WebUI.click(findTestObject('Object Repository/Page_Homepage  Farmasi/span_Login'))

WebUI.setText(findTestObject('Object Repository/Page_Starter Kit  Farmasi/input_Hotlist_styles_searchInput__i1gZE false'), 
    'lipstick')

WebUI.click(findTestObject('Page_Homepage  Farmasi/SearchButton'))

WebUI.waitForElementClickable(findTestObject('Page_Search Result for lipstick  Farmasi/AddtoCart-Creamy Lipstick - 01 Country Rose'), 
    0)

WebUI.click(findTestObject('Page_Search Result for lipstick  Farmasi/AddtoCart-Matte Liquid Lipstick - Merry Berry Celebration'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Search Result for lipstick  Farmasi/p_1 product added to your cart. View Cart'), 
    '1 product added to your cart. View Cart.')

WebUI.click(findTestObject('Object Repository/Page_Search Result for lipstick  Farmasi/AddtoCart-Creamy Lipstick - 01 Country Rose'))

WebUI.click(findTestObject('Object Repository/Page_Search Result for lipstick  Farmasi/div_Color Variants_styles_variantPickerItem__DTB5D'))

WebUI.click(findTestObject('Object Repository/Page_Search Result for lipstick  Farmasi/span_Add to Cart'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Search Result for lipstick  Farmasi/p_1 product added to your cart. View Cart'), 
    '1 product added to your cart. View Cart.')

WebUI.click(findTestObject('Page_Search Result for lipstick  Farmasi/modalCloseButton'))

WebUI.click(findTestObject('Page_Search Result for lipstick  Farmasi/AddtoCart-BB Glaze Lipstick Neutral Nude 01'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Search Result for lipstick  Farmasi/span_Add to Cart'), 'Add to Cart')

WebUI.click(findTestObject('Page_Search Result for lipstick  Farmasi/div_Color Variants_styles_variantPickerItem__DTB5D'))

WebUI.click(findTestObject('Object Repository/Page_Search Result for lipstick  Farmasi/span_Add to Cart'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Search Result for lipstick  Farmasi/p_1 product added to your cart. View Cart'), 
    '1 product added to your cart. View Cart.')

WebUI.click(findTestObject('Page_Search Result for lipstick  Farmasi/modalCloseButton'))

WebUI.click(findTestObject('Page_Search Result for lipstick  Farmasi/AddtoCart-Matte Liquid Lipstick - Merry Berry Celebration'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Search Result for lipstick  Farmasi/p_1 product added to your cart. View Cart'), 
    '1 product added to your cart. View Cart.')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Search Result for lipstick  Farmasi/div_4'), '4')

WebUI.click(findTestObject('Page_Homepage  Farmasi/CartIcon'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Basket  Farmasi/h2_Your Cart'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Basket  Farmasi/h2_Your Cart'), 'Your Cart')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Basket  Farmasi/span_Remove'), 'Remove')

WebUI.click(findTestObject('Object Repository/Page_Basket  Farmasi/span_Remove'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Basket  Farmasi/h5_(2 items)'), '(2 items)')

WebUI.click(findTestObject('Object Repository/Page_Basket  Farmasi/svg'))

WebUI.verifyElementText(findTestObject('Page_Basket  Farmasi/input_22.90_styles_input__TfQ13'), '3')

WebUI.click(findTestObject('Object Repository/Page_Basket  Farmasi/svg'))

WebUI.verifyElementText(findTestObject('Page_Basket  Farmasi/input_22.90_styles_input__TfQ13'), '4')

WebUI.setText(findTestObject('Object Repository/Page_Basket  Farmasi/input_22.90_styles_input__TfQ13'), '40')

WebUI.sendKeys(findTestObject('Object Repository/Page_Basket  Farmasi/input_22.90_styles_input__TfQ13'), Keys.chord(Keys.ENTER))

WebUI.verifyElementText(findTestObject('Page_Basket  Farmasi/input_22.90_styles_input__TfQ13'), '40')

WebUI.click(findTestObject('Object Repository/Page_Basket  Farmasi/span_Remove'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Basket  Farmasi/h5_(1 items)'), '(1 items)')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Basket  Farmasi/span_Continue Shopping'), 'Continue Shopping')

WebUI.click(findTestObject('Object Repository/Page_Basket  Farmasi/span_Continue Shopping'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Homepage  Farmasi/div_Makeup'))

WebUI.click(findTestObject('Object Repository/Page_Homepage  Farmasi/div_Makeup'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Makeup  Farmasi/h4_Makeup'), 'Makeup')

WebUI.click(findTestObject('Object Repository/Page_Makeup  Farmasi/svg'))

WebUI.click(findTestObject('Object Repository/Page_Makeup  Farmasi/input_test afb_id'))

WebUI.click(findTestObject('Object Repository/Page_Makeup  Farmasi/span_Select'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Makeup  Farmasi/h4_Added to Lists'), 'Added to Lists')

WebUI.click(findTestObject('Object Repository/Page_Makeup  Farmasi/span_Ok, Thank You'))

WebUI.click(findTestObject('Object Repository/Page_Makeup  Farmasi/svg_1'))

WebUI.click(findTestObject('Object Repository/Page_Makeup  Farmasi/span_Create a New List'))

WebUI.setText(findTestObject('Object Repository/Page_Makeup  Farmasi/input_Create a New List_wishlistName'), 'testotomasyon')

WebUI.click(findTestObject('Object Repository/Page_Makeup  Farmasi/span_Create List'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Makeup  Farmasi/h6_testotomasyon'), 'testotomasyon')

WebUI.click(findTestObject('Object Repository/Page_Makeup  Farmasi/span_Select'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Makeup  Farmasi/h4_Added to Lists'), 'Added to Lists')

WebUI.click(findTestObject('Object Repository/Page_Makeup  Farmasi/span_Go To Wishlist'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Wishlist  Farmasi/h1_Hotlist'), 'Hotlist')

WebUI.click(findTestObject('Object Repository/Page_Wishlist  Farmasi/svg'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Wishlist  Farmasi/h6_Remove List'), 'Remove List')

WebUI.click(findTestObject('Object Repository/Page_Wishlist  Farmasi/h6_Remove List'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Wishlist  Farmasi/span_Yes, Delete It'), 'Yes, Delete It')

WebUI.click(findTestObject('Object Repository/Page_Wishlist  Farmasi/span_Yes, Delete It'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Wishlist  Farmasi/p_The list successfully deleted'), 'The list successfully deleted.')

WebUI.click(findTestObject('Object Repository/Page_Wishlist  Farmasi/svg'))

WebUI.click(findTestObject('Object Repository/Page_Basket  Farmasi/svg_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Basket  Farmasi/span_Choose Shade'), 'Choose Shade')

WebUI.click(findTestObject('Object Repository/Page_Basket  Farmasi/span_Choose Shade'))

WebUI.click(findTestObject('Object Repository/Page_Basket  Farmasi/input_test afb_id'))

WebUI.click(findTestObject('Object Repository/Page_Basket  Farmasi/span_Select'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Basket  Farmasi/h4_Added to Lists'), 0)

WebUI.click(findTestObject('Object Repository/Page_Basket  Farmasi/span_Ok, Thank You'))

WebUI.click(findTestObject('Object Repository/Page_Basket  Farmasi/span_Checkout'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Checkout  Farmasi/h5_Shipping Address'), 'Shipping Address')

WebUI.click(findTestObject('Object Repository/Page_Checkout  Farmasi/span_See All'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Checkout  Farmasi/h5_Registered Addresses'), 'Registered Addresses')

WebUI.click(findTestObject('Object Repository/Page_Checkout  Farmasi/span_Select'))

WebUI.click(findTestObject('Object Repository/Page_Checkout  Farmasi/div_asfsdaf_styles_cardHeaderRadio__LRBVj'))

WebUI.click(findTestObject('Object Repository/Page_Checkout  Farmasi/div_zferfgrg_styles_cardHeaderRadio__LRBVj'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Checkout  Farmasi/span_DHL'), 'DHL')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Checkout  Farmasi/span_FEDEX'), 'FEDEX')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Checkout  Farmasi/span_UPS'), 'UPS')

WebUI.click(findTestObject('Object Repository/Page_Checkout  Farmasi/div_DHL9.99'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Checkout  Farmasi/span_22.19'), '$22.19')

WebUI.click(findTestObject('Object Repository/Page_Checkout  Farmasi/span_UPS'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Checkout  Farmasi/span_28.61'), '$28.61')

WebUI.click(findTestObject('Object Repository/Page_Checkout  Farmasi/span_FEDEX'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Checkout  Farmasi/span_32.89'), '$32.89')

WebUI.click(findTestObject('Object Repository/Page_Checkout  Farmasi/span_LANDMARK'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Checkout  Farmasi/span_22.19'), '$22.19')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Checkout  Farmasi/span_Yes, Use It'), 'Yes, Use It')

WebUI.click(findTestObject('Object Repository/Page_Checkout  Farmasi/span_Yes, Use It'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Checkout  Farmasi/p_Cancel Using Balance'), 'Cancel Using Balance')

WebUI.click(findTestObject('Object Repository/Page_Checkout  Farmasi/span_Apply'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Checkout  Farmasi/span_0.00'), '$0.00')

WebUI.click(findTestObject('Object Repository/Page_Checkout  Farmasi/input_Choose another way to pay_agreements'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Checkout  Farmasi/div_Products'), 'Products')

WebUI.click(findTestObject('Object Repository/Page_Checkout  Farmasi/div_Products'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Checkout  Farmasi/div_Creamy Lipstick - 14 Scarlet'), 'Creamy Lipstick - 14 Scarlet')

WebUI.click(findTestObject('Object Repository/Page_Checkout  Farmasi/span_Checkout'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Checkout Result  Farmasi/h4_Thank you for your order'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Checkout Result  Farmasi/h4_Thank you for your order'), 'Thank you for your order!')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Checkout Result  Farmasi/p_Creamy Lipstick - 14 Scarlet'), 
    'Creamy Lipstick - 14 Scarlet')

WebUI.click(findTestObject('Object Repository/Page_Checkout Result  Farmasi/a_My Orders'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_My Orders  Farmasi/h1_My Orders'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_My Orders  Farmasi/h1_My Orders'), 'My Orders')

WebUI.verifyElementText(findTestObject('Object Repository/Page_My Orders  Farmasi/p_Order Processing'), 'Order Processing')

WebUI.click(findTestObject('Object Repository/Page_My Orders  Farmasi/div_Order Number CA-1303701009.19.2024 - 6._bebafa'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Order Detail  Farmasi/span_Cancel Order'), 0)

WebUI.click(findTestObject('Object Repository/Page_Order Detail  Farmasi/span_Cancel Order'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Order Detail  Farmasi/span_Yes, Cancel It'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Order Detail  Farmasi/span_Yes, Cancel It'), 'Yes, Cancel It')

WebUI.click(findTestObject('Object Repository/Page_Order Detail  Farmasi/span_Yes, Cancel It'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Order Detail  Farmasi/span_Farmasi Wallet'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Order Detail  Farmasi/span_Farmasi Wallet'), 'Farmasi Wallet')

WebUI.click(findTestObject('Object Repository/Page_Order Detail  Farmasi/span_Farmasi Wallet'))

WebUI.setText(findTestObject('Object Repository/Page_Order Detail  Farmasi/textarea_Test'), 'test')

WebUI.click(findTestObject('Object Repository/Page_Order Detail  Farmasi/span_Select'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Order Detail  Farmasi/h4_Order Cancelled'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Order Detail  Farmasi/h4_Order Cancelled'), 'Order Cancelled')

WebUI.click(findTestObject('Object Repository/Page_Order Detail  Farmasi/img_EN_styles_image__qb0tG'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Order Detail  Farmasi/span_Sign Out'), 'Sign Out')

WebUI.click(findTestObject('Object Repository/Page_Order Detail  Farmasi/span_Sign Out'))

WebUI.click(findTestObject('Object Repository/Page_Homepage  Farmasi/svg'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Homepage  Farmasi/span_Login'), 'Login')

