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

WebUI.click(findTestObject('Object Repository/Page_Homepage Farmasi Local/Ca Add Cart Steps/Page_Homepage  Farmasi/svg'))

WebUI.click(findTestObject('Object Repository/Page_Homepage Farmasi Local/Ca Add Cart Steps/Page_Homepage  Farmasi/input_Catalog_email'))

WebUI.setEncryptedText(findTestObject('Page_Homepage Farmasi Local/Ca Add Cart Steps/Page_Homepage  Farmasi/input_Catalog_email'), 
    'RrbuUshkUI4CH+EPa+kFD3emG7n4NHVI')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Homepage Farmasi Local/Ca Add Cart Steps/Page_Homepage  Farmasi/input_E-mail_passwordLogin'), 
    '/qFPfLaYtwGjGusC+qcGdx5TGw/fWasx')

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Page_Homepage Farmasi Local/Ca Add Cart Steps/Page_Homepage  Farmasi/span_Login'))

