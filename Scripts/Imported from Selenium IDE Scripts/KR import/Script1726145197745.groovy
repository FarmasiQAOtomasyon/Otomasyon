import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.testobject.SelectorMethod as SelectorMethod
import com.thoughtworks.selenium.Selenium as Selenium
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.WebDriver as WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern as Pattern
import static org.apache.commons.lang3.StringUtils.join
import org.testng.asserts.SoftAssert as SoftAssert
import com.kms.katalon.core.testdata.CSVData as CSVData
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

SoftAssert softAssertion = new SoftAssert()

WebUI.openBrowser('https://www.google.com/')

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://www.google.com/'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

selenium.open('https://preprod.farmasi.ca/farmasi')

WebUI.waitForPageLoad(0, FailureHandling.STOP_ON_FAILURE)

Thread.sleep(5000)

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'EN\'])[1]/following::*[name()=\'svg\'][2]')

selenium.click('name=email')

selenium.type('name=email', 'siparis3@pinar.com'.toString())

selenium.click('name=passwordLogin')

selenium.type('name=passwordLogin', 'Farmasi1')

WebUI.click(findTestObject('Page_Homepage Farmasi Local/EmailField'))

WebUI.click(findTestObject('Page_Homepage Farmasi Local/login'))

Thread.sleep(5000)

WebUI.mouseOver(findTestObject('Page_Homepage Farmasi Local/Makeup submenü'))

WebUI.click(findTestObject('Page_Homepage Farmasi Local/Eyeliner alt menü'))

WebUI.scrollToElement(findTestObject('Page_Homepage Farmasi Local/add first p'), 0)

WebUI.click(findTestObject('Page_Homepage Farmasi Local/add first p'))

assertEquals('1 product added to your cart. View Cart.', selenium.getText('xpath=//div[@id=\'__next\']/div/main/div[2]/div/div/div[2]/p'))

softAssertion.assertEquals('1', selenium.getText('xpath=//header[@id=\'header\']/div[2]/div[2]/a[2]/div/div'))

selenium.click('xpath=//*[@id="__next"]/div[1]/main/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[4]/div[3]/button')

selenium.waitForPageToLoad('30000')

Thread.sleep(3000)

selenium.click('xpath=//div[2]/div/div/div[5]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Color Variants:\'])[1]/following::span[1]')

selenium.click('xpath=//div[@id=\'__next\']/div/main/div[2]/div/div/div[2]/p')

selenium.click('xpath=//div[@id=\'__next\']/div/main/div[2]/div/div/div[2]/p')

selenium.click('xpath=//div[@id=\'__next\']/div/main/div[2]/div/div/div[2]/p')

assertEquals('1 product added to your cart. View Cart.', selenium.getText('xpath=//div[@id=\'__next\']/div/main/div[2]/div/div/div[2]/p'))

selenium.click('xpath=//header[@id=\'header\']/div[2]/div[2]/a[2]/div/div')

selenium.click('xpath=//div[@id=\'__next\']/div/main/div/div/div/div/div/h5')

Thread.sleep(3000)

selenium.refresh()

selenium.waitForPageToLoad('30000')

Thread.sleep(3000)

assertEquals('(2 items)', selenium.getText('xpath=//div[@id=\'__next\']/div/main/div/div/div/div/div/h5'))

selenium.click('xpath=//div[@id=\'__next\']/div/main/div/div/div/div[3]/div/div/div/div')

softAssertion.assertEquals('Eye Liner Pencil - 05 Nude', selenium.getText(''))

selenium.click('xpath=//div[@id=\'__next\']/div/main/div/div/div/div[3]/div[2]/div/div/div/div')

Thread.sleep(3000)

softAssertion.assertEquals('Ink Liner Black', selenium.getText(''))

selenium.click('xpath=//div[@id=\'__next\']/div/main/div/div/div/div[3]/div/div/div/div[2]/div[2]/span')

softAssertion.assertEquals('9.75', selenium.getText(''))

selenium.click('xpath=//div[@id=\'__next\']/div/main/div/div/div/div[3]/div[2]/div')

softAssertion.assertEquals('13.25', selenium.getText(''))

selenium.click('xpath=//div[@id=\'__next\']/div/main/div/div/div[2]/div/div/span')

selenium.refresh()

selenium.waitForPageToLoad('30000')

assertEquals('23.00', selenium.getText('xpath=//div[@id=\'__next\']/div/main/div/div/div[2]/div/div/span'))

selenium.click('xpath=//div[@id=\'__next\']/div/main/div/div/div[2]/div/div/h6')

assertEquals('2 products', selenium.getText('xpath=//div[@id=\'__next\']/div/main/div/div/div[2]/div/div/h6'))

selenium.click('xpath=//div[@id=\'__next\']/div/main/div/div/div/div/div[2]/span')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Delete Your Cart\'])[1]/following::button[1]')

selenium.click('xpath=//div[@id=\'__next\']/div/main/div[3]/div/div/div[2]/p')

selenium.click('xpath=//div[@id=\'__next\']/div/main/div[3]/div/div/div[2]/p')

selenium.click('xpath=//div[@id=\'__next\']/div/main/div[3]/div/div/div[2]/p')

softAssertion.assertEquals(selenium.isElementPresent('xpath=//div[@id=\'__next\']/div/main/div[3]/div/div/div[2]/p'), true)

Thread.sleep(1000)

assertEquals('The products deleted from your cart', selenium.getText('xpath=//div[@id=\'__next\']/div/main/div[3]/div/div/div[2]/p'))

selenium.click('xpath=//img[@alt=\'User Profile Picture\']')

selenium.click('xpath=//header[@id=\'header\']/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'EN\'])[1]/following::*[name()=\'svg\'][2]')

Thread.sleep(3000)

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'EN\'])[1]/following::*[name()=\'svg\'][2]')

selenium.waitForPageToLoad('30000')

Thread.sleep(3000)

assertEquals('Login', selenium.getText('xpath=//header[@id=\'header\']/div[2]/div[2]/div[2]/div[2]/div[2]/div/form/div'))

