import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on link apple -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_apple"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_apple', ['link_apple_nthChild': link_apple_nthChild, 'link_apple_internalRoleLinkName': link_apple_internalRoleLinkName, 'link_apple_category_id': link_apple_category_id]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 2-Click on link apple - Navigate to page category.png')

"Step 3: Click on link byTitle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_byTitle'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 3-Click on link byTitle.png')

"Step 4: Click on link apple20wUsbCpowerAdapter -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_apple20wUsbCpowerAdapter"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_apple20wUsbCpowerAdapter', ['link_apple20wUsbCpowerAdapter_product_id': link_apple20wUsbCpowerAdapter_product_id]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 4-Click on link apple20wUsbCpowerAdapter - Navigate to page product.png')

"Step 5: Click on button increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_increased'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 5-Click on button increased.png')

"Step 6: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 6-Click on button buy.png')

"Step 7: Click on link cart -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_cart'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 7-Click on link cart - Navigate to page cart.png')

"Step 8: Click on button proceedToCheckout -> Navigate to page 'checkout/info'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 8-Click on button proceedToCheckout - Navigate to page checkoutinfo.png')

"Step 9: Click on input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_email'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 9-Click on input email.png')

"Step 10: Enter input value in input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_email'), input_email)

WebUI.takeScreenshot(reportLocation + '/TC9/Step 10-Enter input value in input email.png')

"Step 11: Click on button continueToShipping -> Navigate to page 'checkout/shipping-address'"

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

"Step 14: Click on input lastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_lastName'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 14-Click on input lastName.png')

"Step 15: Enter input value in input lastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_lastName'), input_lastName)

WebUI.takeScreenshot(reportLocation + '/TC9/Step 15-Enter input value in input lastName.png')

"Step 16: Click on input address"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_address'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 16-Click on input address.png')

"Step 17: Enter input value in input address"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_address'), input_address)

WebUI.takeScreenshot(reportLocation + '/TC9/Step 17-Enter input value in input address.png')

"Step 18: Click on input zipCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_zipCode'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 18-Click on input zipCode.png')

"Step 19: Enter input value in input zipCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_zipCode'), input_zipCode)

WebUI.takeScreenshot(reportLocation + '/TC9/Step 19-Enter input value in input zipCode.png')

"Step 20: Click on input city"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_city'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 20-Click on input city.png')

"Step 21: Enter input value in input city"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_city'), input_city)

WebUI.takeScreenshot(reportLocation + '/TC9/Step 21-Enter input value in input city.png')

"Step 22: Click on input state"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_state'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 22-Click on input state.png')

"Step 23: Enter input value in input state"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_state'), input_state)

WebUI.takeScreenshot(reportLocation + '/TC9/Step 23-Enter input value in input state.png')

"Step 24: Click on input phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_phone'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 24-Click on input phone.png')

"Step 25: Enter input value in input phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_phone'), input_phone)

WebUI.takeScreenshot(reportLocation + '/TC9/Step 25-Enter input value in input phone.png')

"Step 26: Click on button continueToPayment -> Navigate to page 'checkout/payment'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/button_continueToPayment'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 26-Click on button continueToPayment - Navigate to page checkoutpayment.png')

"Step 27: Click on link backToTheCart -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/link_backToTheCart'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 27-Click on link backToTheCart - Navigate to page cart.png')

"Step 28: Click on button increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_increased'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 28-Click on button increased.png')

"Step 29: Click on button proceedToCheckout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 29-Click on button proceedToCheckout.png')

"Step 30: Click on button proceedToCheckout -> Navigate to page 'checkout/payment'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 30-Click on button proceedToCheckout - Navigate to page checkoutpayment.png')

"Step 31: Click on button completeOrder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_completeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 31-Click on button completeOrder.png')

"Step 32: Click on button completeOrder -> Navigate to page 'thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_completeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 32-Click on button completeOrder - Navigate to page thank-you.png')

"Step 33: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC9-Complete Purchase of Apple Accessories through Checkout Process_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}