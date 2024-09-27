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

WebUI.click(findTestObject('Object Repository/team_management/Page_Homepage  Farmasi/svg'))

WebUI.setText(findTestObject('Object Repository/team_management/Page_Homepage  Farmasi/input_EN_email'), 'siparis3@pinar.com')

WebUI.setEncryptedText(findTestObject('Object Repository/team_management/Page_Homepage  Farmasi/input_E-mail_passwordLogin'), 
    'Lj6COquByXHkrCnO0yj9Nw==')

WebUI.click(findTestObject('Object Repository/team_management/Page_Homepage  Farmasi/button_Login'))

WebUI.click(findTestObject('Object Repository/team_management/Page_Starter Kit  Farmasi/img_EN_styles_image__qb0tG'))

WebUI.verifyElementClickable(findTestObject('Object Repository/team_management/Page_Starter Kit  Farmasi/div_Team Management'))

WebUI.click(findTestObject('Object Repository/team_management/Page_Starter Kit  Farmasi/div_Team Management'))

WebUI.verifyElementVisible(findTestObject('Object Repository/team_management/Page_Team Management  Farmasi/div_Team Management'))

WebUI.click(findTestObject('Object Repository/team_management/Page_Team Management  Farmasi/svg'))

WebUI.verifyElementVisible(findTestObject('Object Repository/team_management/Page_Team Management  Farmasi/h5_Contact Information'))

WebUI.verifyElementVisible(findTestObject('Object Repository/team_management/Page_Team Management  Farmasi/a_Phone Number521312432432'))

WebUI.verifyElementVisible(findTestObject('Object Repository/team_management/Page_Team Management  Farmasi/a_Mailqaautomation1211gmail.com'))

WebUI.verifyElementClickable(findTestObject('Object Repository/team_management/Page_Team Management  Farmasi/span_See Orders'))

WebUI.click(findTestObject('Object Repository/team_management/Page_Homepage  Farmasi/span_See Orders'))

WebUI.verifyElementVisible(findTestObject('Object Repository/team_management/Page_Team Orders  Farmasi/div_Team Orders'))

WebUI.verifyElementVisible(findTestObject('Object Repository/team_management/Page_Team Orders  Farmasi/div_All OrdersProcessingShippedCancelled'))

WebUI.closeBrowser()

