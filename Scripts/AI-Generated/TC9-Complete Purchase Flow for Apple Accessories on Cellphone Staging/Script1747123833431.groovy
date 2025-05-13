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

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Hover over link accessories"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/link_accessories'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 2-Hover over link accessories.png')

"Step 3: Click on link apple2 -> Navigate to page '/category/chekhly-na-iphone'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_apple2'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 3-Click on link apple2 - Navigate to page categorychekhly-na-iphone.png')

"Step 4: Click on link productAppleAdapter -> Navigate to page '/product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/chekhly-na-iphone?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_chekhly_na_iphone/link_productAppleAdapter'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 4-Click on link productAppleAdapter - Navigate to page product.png')

"Step 5: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 5-Click on button buy.png')

"Step 6: Click on link placeOrder -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_placeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 6-Click on link placeOrder - Navigate to page cart.png')

"Step 7: Click on button proceedToCheckout -> Navigate to page '/checkout/info'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 7-Click on button proceedToCheckout - Navigate to page checkoutinfo.png')

"Step 8: Click on input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_email'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 8-Click on input email.png')

"Step 9: Enter input value in input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_email'), input_email)

WebUI.takeScreenshot(reportLocation + '/TC9/Step 9-Enter input value in input email.png')

"Step 10: Press key Tab on input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Page_checkout_info/input_email'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 10-Press key Tab on input email.png')

"Step 11: Click on button continueToShipping -> Navigate to page '/checkout/shipping-address'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_continueToShipping'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 11-Click on button continueToShipping - Navigate to page checkoutshipping-address.png')

"Step 12: Click on input firstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_firstName'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 12-Click on input firstName.png')

"Step 13: Enter input value in input firstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_firstName'), input_firstName)

WebUI.takeScreenshot(reportLocation + '/TC9/Step 13-Enter input value in input firstName.png')

"Step 14: Press key Tab on input firstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Page_checkout_shipping_address/input_firstName'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 14-Press key Tab on input firstName.png')

"Step 15: Enter input value in input lastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_lastName'), input_lastName)

WebUI.takeScreenshot(reportLocation + '/TC9/Step 15-Enter input value in input lastName.png')

"Step 16: Press key Tab on input lastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Page_checkout_shipping_address/input_lastName'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 16-Press key Tab on input lastName.png')

"Step 17: Click on input address"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_address'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 17-Click on input address.png')

"Step 18: Enter input value in input address"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_address'), input_address)

WebUI.takeScreenshot(reportLocation + '/TC9/Step 18-Enter input value in input address.png')

"Step 19: Press key Tab on input address"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Page_checkout_shipping_address/input_address'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 19-Press key Tab on input address.png')

"Step 20: Press key Tab on input zipCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Page_checkout_shipping_address/input_zipCode'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 20-Press key Tab on input zipCode.png')

"Step 21: Press key Tab on input city"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Page_checkout_shipping_address/input_city'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 21-Press key Tab on input city.png')

"Step 22: Click on input state"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_state'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 22-Click on input state.png')

"Step 23: Enter input value in input state"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_state'), input_state)

WebUI.takeScreenshot(reportLocation + '/TC9/Step 23-Enter input value in input state.png')

"Step 24: Click on input phone -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_phone'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 24-Click on input phone - Navigate to page .png')

"Step 25: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC9-Complete Purchase Flow for Apple Accessories on Cellphone Staging_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}