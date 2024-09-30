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

WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Homepage  Farmasi/svg'))

WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Homepage  Farmasi/input_EN_email'))

WebUI.setText(findTestObject('Object Repository/Cart Steps/Page_Homepage  Farmasi/input_EN_email'), 'siparis3@pinar.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Cart Steps/Page_Homepage  Farmasi/input_E-mail_passwordLogin'), 
    'Lj6COquByXHkrCnO0yj9Nw==')

WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Homepage  Farmasi/span_Login'))

WebUI.waitForPageLoad(3)

WebUI.setText(findTestObject('Object Repository/Cart Steps/Page_Starter Kit  Farmasi/input_Hotlist_styles_searchInput__i1gZE false'), 
    'mascara')

WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Starter Kit  Farmasi/svg'))

WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Search Result for mascara  Farmasi/svg'))

WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Search Result for mascara  Farmasi/svg_1'))

WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Search Result for mascara  Farmasi/svg_1_2'))

WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps/Page_Search Result for mascara  Farmasi/h5_Choose Shade and Add to Cart'), 
    'Choose Shade and Add to Cart')

WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Search Result for mascara  Farmasi/div_Color Variants_styles_variantPickerItem__DTB5D'))

WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Search Result for mascara  Farmasi/span_Add to Cart'))

WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Search Result for mascara  Farmasi/svg_1_2_3'))

WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Search Result for mascara  Farmasi/svg_1_2_3_4'))

WebUI.waitForPageLoad(3)

WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/h2_Your Cart'), 'Your Cart')

WebUI.verifyElementClickable(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/span_Delete All Items'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/span_Checkout'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/span_Continue Shopping'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/span_Remove'))

WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/svg'))

WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/h5_(2 items)'), '(2 items)')

WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/button_13.45_styles_counterButton__hPMj0 false'))

WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/input_26.90_styles_input__TfQ13'), 
    '2')

WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/svg_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/input_26.90_styles_input__TfQ13'), 
    '3')

WebUI.setText(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/input_26.90_styles_input__TfQ13'), '15')

WebUI.sendKeys(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/input_26.90_styles_input__TfQ13'), Keys.chord(
        Keys.ENTER))

WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/input_26.90_styles_input__TfQ13'), 
    '15')

WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/span_Remove'))

WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/h5_(1 items)'), '(1 items)')

WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/span_Continue Shopping'))

WebUI.waitForPageLoad(3)

WebUI.mouseOver(findTestObject('Object Repository/Cart Steps/Page_Homepage  Farmasi/div_Makeup'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Cart Steps/Page_Homepage  Farmasi/div_Eyes'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Cart Steps/Page_Homepage  Farmasi/div_Lips'))

WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Homepage  Farmasi/div_Lips'))

WebUI.waitForPageLoad(3)

WebUI.mouseOver(findTestObject('Object Repository/Cart Steps/Page_Lips  Farmasi/h4_Lips'))

WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps/Page_Lips  Farmasi/h4_Lips'), 'Lips')

WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Lips  Farmasi/svg'))

WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Lips  Farmasi/path'))

WebUI.waitForPageLoad(3)

WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/h2_Your Cart'), 'Your Cart')

WebUI.verifyElementClickable(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/span_Delete All Items'))

WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/span_Delete All Items'))

WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/h5_Delete Your Cart'), 'Delete Your Cart')

WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/span_Yes, Delete It'))

WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/h2_Cart Empty'), 'Cart Empty')

WebUI.verifyElementClickable(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/span_Go to Category Page'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/span_Go to Wishlist'))

WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/span_Go to Category Page'))

WebUI.scrollToElement(findTestObject('Object Repository/Cart Steps/Page_Homepage  Farmasi/h2_New Products'), 5)

WebUI.verifyElementVisible(findTestObject('Object Repository/Cart Steps/Page_Homepage  Farmasi/h2_New Products'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Cart Steps/Page_Homepage  Farmasi/span_See All'))

WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Homepage  Farmasi/span_See All'))

WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps/Page_New Arrivals  Farmasi/h4_New Arrivals'), 'New Arrivals')

WebUI.setText(findTestObject('Object Repository/Cart Steps/Page_New Arrivals  Farmasi/input_Hotlist_styles_searchInput__i1gZE false'), 
    'cream')

WebUI.sendKeys(findTestObject('Object Repository/Cart Steps/Page_New Arrivals  Farmasi/input_Hotlist_styles_searchInput__i1gZE false'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Search Result for cream  Farmasi/svg'))

WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps/Page_Search Result for cream  Farmasi/h5_Choose Shade and Add to Cart'), 
    'Choose Shade and Add to Cart')

WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Search Result for cream  Farmasi/div_Color Variants_styles_variantPickerItem__DTB5D'))

WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Search Result for cream  Farmasi/span_Add to Cart'))

WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Search Result for cream  Farmasi/div_FARMAS  All rights reserved_styles_icon_6b799d'))

WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Search Result for cream  Farmasi/svg_1'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/svg_1_2'))

WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/h5_Choose Shade and Add to Your Hotlist'), 
    'Choose Shade and Add to Your Hotlist')

WebUI.verifyElementClickable(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/span_Choose Shade'))

WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/span_Choose Shade'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/span_Create a New List'))

WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/span_Create a New List'))

WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/h5_Create a New List'), 'Create a New List')

WebUI.setText(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/input_Create a New List_wishlistName'), 
    'otomasyon')

WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/span_Create List'))

WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/h6_otomasyon'), 'otomasyon')

WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/span_Select'))

WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/h4_Added to Lists'), 'Added to Lists')

WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/span_Ok, Thank You'))

WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/img_EN_styles_image__qb0tG'))

WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/span_Hotlist'), 'Hotlist')

WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/span_Hotlist'))

WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps/Page_Wishlist  Farmasi/h1_Hotlist'), 'Hotlist')

WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps/Page_Wishlist  Farmasi/h3_otomasyon'), 'otomasyon')

WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Wishlist  Farmasi/path'))

WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Wishlist  Farmasi/h6_Remove List'))

WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Wishlist  Farmasi/span_Yes, Delete It'))

WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Wishlist  Farmasi/path'))

WebUI.click(findTestObject('Object Repository/Cart Steps/Page_Basket  Farmasi/span_Checkout'))

WebUI.verifyElementText(findTestObject('Object Repository/Cart Steps/Page_Checkout  Farmasi/h5_Shipping Address'), 'Shipping Address')

WebUI.closeBrowser()

