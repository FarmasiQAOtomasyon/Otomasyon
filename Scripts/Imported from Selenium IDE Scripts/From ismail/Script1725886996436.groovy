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
WebUI.navigateToUrl('https://preprod.farmasi.ca/farmasi/')
WebUI.click(findTestObject('Object Repository/Page_Homepage  Farmasi/svg'))
WebUI.setText(findTestObject('Object Repository/Page_Homepage  Farmasi/input_Catalog_email'), 'siparis3@pinar.com')
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Homepage  Farmasi/input_E-mail_passwordLogin'), 'Lj6COquByXHkrCnO0yj9Nw==')
WebUI.click(findTestObject('Object Repository/Page_Homepage  Farmasi/button_Login'))
WebUI.click(findTestObject('Object Repository/Page_Starter Kit  Farmasi/label_See More_styles_radioContainer__JpZ8s_12111c'))
WebUI.click(findTestObject('Object Repository/Page_Starter Kit  Farmasi/button_Continue'))
WebUI.click(findTestObject('Object Repository/Page_Basket  Farmasi/button_Checkout'))
WebUI.closeBrowser()
WebUI.closeBrowser()









