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

WebUI.navigateToUrl('https://www.tokopedia.com/')

WebUI.click(findTestObject('Object Repository/Page_Tokopedia/btn_Masuk'))

WebUI.click(findTestObject('Object Repository/Page_Tokopedia/span_Metode Lain'))

WebUI.click(findTestObject('Object Repository/Page_Tokopedia/span_Google'))

WebUI.switchToWindowTitle('Login - Akun Google')

WebUI.setText(findTestObject('Object Repository/Page_Login - Akun Google/input_Tokopedia_identifier'), 'testingon')

WebUI.sendKeys(findTestObject('Object Repository/Page_Login - Akun Google/input_Tokopedia_identifier'), Keys.chord(Keys.ENTER))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - Akun Google/input_Terlalu sering gagal_password'), 
    'uahDZ7JOCISxk0c0qERgMQZwB3bYoVZr')

WebUI.click(findTestObject('Object Repository/Page_Login - Akun Google/div_persyaratan layanan_VfPpkd-RLmnJb'))

WebUI.switchToWindowTitle('Situs Jual Beli Online Terlengkap, Mudah & Aman | Tokopedia')

WebUI.click(findTestObject('Object Repository/Page_Tokopedia/div_Maaf permohonan Anda tidak dapat dipros_7bed5a'))

WebUI.click(findTestObject('Object Repository/Page_Tokopedia/button_Komputer  Laptop_css-18i7x95-unf-mod_b26b56'))

WebUI.closeBrowser()

