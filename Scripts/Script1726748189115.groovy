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
import com.kms.katalon.core.testobject.SelectorMethod

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join
import org.testng.asserts.SoftAssert
import com.kms.katalon.core.testdata.CSVData
import org.openqa.selenium.Keys as Keys

SoftAssert softAssertion = new SoftAssert();
WebUI.openBrowser('https://www.google.com/')
def driver = DriverFactory.getWebDriver()
String baseUrl = "https://www.google.com/"
selenium = new WebDriverBackedSelenium(driver, baseUrl)
selenium.open("https://preprod.farmasi.ca/farmasi")
selenium.click("css=div[data-testid=\"profileIcon\"]")
Thread.sleep(1000);
selenium.click("css=button[data-testid=\"registerButton\"]")
Thread.sleep(1000);
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Say YES'])[3]/following::button[1]")
String email = selenium.getEval("  " + "var email = 'qaautomation_' + Math.random().toString(36).substr(2, 5) + '@example.com'; email;")
Thread.sleep(1000);
String sin = selenium.getEval(" var email = \"" + email + "\";var storedVars = { 'email': email }; " + "var sin = (function() { function generateRandomSIN() { let sin = []; for (let i = 0; i < 8; i++) { sin.push(Math.floor(Math.random() * 10)); } sin.push(calculateLuhnChecksum(sin)); return sin.join(''); } function calculateLuhnChecksum(digits) { let reversedDigits = digits.slice().reverse(); let total = 0; for (let i = 0; i < reversedDigits.length; i++) { let n = reversedDigits[i]; if (i % 2 === 0) { n *= 2; if (n > 9) { n -= 9; } } total += n; } return (10 - (total % 10)) % 10; } return generateRandomSIN(); })(); sin;")
Thread.sleep(1000);
String //The_steps_below_will_empty_the_cart_ = WebUI.executeJavaScript("", null)
String customName = selenium.getEval(" var email = \"" + email + "\";var sin = \"" + sin + "\";var storedVars = { 'email': email,'sin': sin,'//The_steps_below_will_empty_the_cart_': //The_steps_below_will_empty_the_cart_ }; " + "function generateCustomName() { const prefix = 'qaautomation'; const randomSuffix = Math.random().toString(36).substr(2, 4); return prefix + randomSuffix; } var customName = generateCustomName(); customName;")
Thread.sleep(3000);
assertEquals("Canada", selenium.getText("xpath=//div[@id='__next']/div/main/div/div/div/div/div/p"));
assertEquals("https://preprod.farmasi.ca/", selenium.getText("xpath=//div[@id='__next']/div/main/div/div[2]/form/div[5]/div/div/span"));
selenium.click("id=email")
selenium.type("id=email", (email).toString())
Thread.sleep(1000);
selenium.click("id=name")
selenium.type("id=name", (customName).toString())
Thread.sleep(1000);
selenium.click("id=surname")
selenium.type("id=surname", "test")
Thread.sleep(1000);
selenium.click("id=ssn")
selenium.type("id=ssn", (sin).toString())
WebUI.executeJavaScript("window.scrollBy(0, 400);", null)
selenium.click("xpath=//button[@type='button']")
selenium.click("")
selenium.click("xpath=//div[@id='__next']/div/main/div/div[2]/form/div[6]/div/div/div/div[2]/div[2]/div/div/div/div/div/div/div[2]/div[2]/select")
selenium.select("xpath=//div[@id='__next']/div/main/div/div[2]/form/div[6]/div/div/div/div[2]/div[2]/div/div/div/div/div/div/div[2]/div[2]/select", "label=2000")
selenium.click("xpath=//div[@id='__next']/div/main/div/div[2]/form/div[6]/div/div/div/div[2]/div[2]/div/div/div/div/div/div/div[2]/div/select")
selenium.select("xpath=//div[@id='__next']/div/main/div/div[2]/form/div[6]/div/div/div/div[2]/div[2]/div/div/div/div/div/div/div[2]/div/select", "label=January")
selenium.click("xpath=//div[@id='__next']/div/main/div/div[2]/form/div[6]/div/div/div/div[2]/div[2]/div/div/div/div/div/div[2]/div/div[6]")
selenium.click("css=div.styles_rowHalf__ORrbU.styles_rowGroupedDestroyed__WMdQJ > div > div.styles_dropdown__1NxXw > div.styles_dropdownButton__zG2iF.false.false.false.false.undefined > div.styles_iconContainer__pEpPp > div.styles_icon__pqVcT > svg > path")
selenium.click("id=1")
selenium.click("id=address.addressLine")
selenium.type("id=address.addressLine", ("200 Tremblay Road").toString())
Thread.sleep(3000);
selenium.click("xpath=//div[@id='__next']/div/main/div/div[2]/form/div[8]/div/div/div[3]/div/div[2]/ul/li/span")
selenium.waitForPageToLoad("30000")
String phoneNumber = selenium.getEval(" var email = \"" + email + "\";var sin = \"" + sin + "\";var customName = \"" + customName + "\";var storedVars = { 'email': email,'sin': sin,'//The_steps_below_will_empty_the_cart_': //The_steps_below_will_empty_the_cart_,'customName': customName }; " + "function generateRandomPhoneNumber() { var areaCode = '(432)'; var firstPart = Math.floor(100 + Math.random() * 900).toString(); var secondPart = Math.floor(1000 + Math.random() * 9000).toString(); return areaCode + ' ' + firstPart + '-' + secondPart; } generateRandomPhoneNumber();")
selenium.click("id=address.mobilePhone")
selenium.type("id=address.mobilePhone", (phoneNumber).toString())
selenium.click("name=password")
selenium.type("name=password", "Farmasi1")
selenium.click("xpath=//div[@id='__next']/div/main")
Thread.sleep(2000);
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Password'])[1]/following::*[name()='svg'][2]")
selenium.click("name=sponsorCode")
selenium.waitForPageToLoad("30000")
selenium.type("name=sponsorCode", ("CA-01691041").toString())
selenium.click("xpath=//div[@id='__next']/div/main/div/div[2]/form/div[16]/div/div[2]/div/div[2]/button/span")
selenium.click("id=agreement")
selenium.waitForPageToLoad("30000")
selenium.click("id=agreement2")
selenium.waitForPageToLoad("30000")
selenium.click("id=smsConsent")
selenium.waitForPageToLoad("30000")
selenium.click("xpath=//button[@type='submit']")
selenium.waitForPageToLoad("30000")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Cancel'])[1]/following::button[1]")
Thread.sleep(3000);
assertEquals("To become a FARMASI Influencer", selenium.getText("xpath=//div[@id='__next']/div/main/div/div/div/div[1]"));
assertEquals("Starter Kit", selenium.getText("xpath=//div[@id='__next']/div/main/div/div/div[2]/div/div[2]/h4"));
selenium.click("css=div[data-testid=\"profileIcon\"]")
assertEquals("Profile", selenium.getText("xpath=//header[@id='header']/div[2]/div[2]/div[2]/div[2]/div[2]/div/a/div/div/span"));
selenium.click("xpath=//header[@id='header']/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div")
