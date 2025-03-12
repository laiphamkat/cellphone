import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to checkout/info"

TrueTestScripts.navigate("checkout/info")

"Step 2: Enter input value in input Email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_Email'), input_Email)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Enter input value in input Email.png')

"Step 3: Press key Enter on input Email -> Navigate to page 'checkout#checkout/shipping-address'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Page_checkout_info/input_Email'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Press key Enter on input Email - Navigate to page checkoutcheckoutshipping-address.png')

"Step 4: Hover over div Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('Archived/Archived_20250312/Page_checkout/div_Object'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Hover over div Object.png')

"Step 5: Click on input FirstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_FirstName'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on input FirstName.png')

"Step 6: Enter input value in input LastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_LastName'), input_LastName)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Enter input value in input LastName.png')

"Step 7: Enter input value in input Address"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_Address'), input_Address)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Enter input value in input Address.png')

"Step 8: Enter input value in input FirstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_FirstName'), input_FirstName)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Enter input value in input FirstName.png')

"Step 9: Press key Tab on input FirstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Page_checkout/input_FirstName'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Press key Tab on input FirstName.png')

"Step 10: Press key Tab on input LastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Page_checkout/input_LastName'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Press key Tab on input LastName.png')

"Step 11: Hover over div Object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('Archived/Archived_20250312/Page_checkout/div_Object2'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Hover over div Object2.png')

"Step 12: Click on input ZipCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_ZipCode'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Click on input ZipCode.png')

"Step 13: Enter input value in input Phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_Phone'), input_Phone)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 13-Enter input value in input Phone.png')

"Step 14: Enter input value in input State"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_State'), input_State)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 14-Enter input value in input State.png')

"Step 15: Enter input value in input City"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_City'), input_City)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 15-Enter input value in input City.png')

"Step 16: Enter input value in input ZipCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_ZipCode'), input_ZipCode)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 16-Enter input value in input ZipCode.png')

"Step 17: Press key Tab on input ZipCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Page_checkout/input_ZipCode'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 17-Press key Tab on input ZipCode.png')

"Step 18: Press key Tab on input City"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Page_checkout/input_City'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 18-Press key Tab on input City.png')

"Step 19: Press key Tab on input State"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Page_checkout/input_State'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 19-Press key Tab on input State.png')

"Step 20: Press key Enter on input Phone -> Navigate to page 'checkout#checkout/payment'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Page_checkout/input_Phone'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 20-Press key Enter on input Phone - Navigate to page checkoutcheckoutpayment.png')

"Step 21: Click on button CompleteOrder -> Navigate to page 'thank you#thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250312/Page_checkout/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 21-Click on button CompleteOrder - Navigate to page thank youthank-you.png')

"Step 22: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Complete Checkout Information for Cellphone Purchase_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}