import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import katalon.truetest.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://cellphone-staging.aut.katalon.com/"

TrueTestScripts.navigate('/')

"Step 2: Hover over item phoneAppleSamsungGooglePixel"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_phoneAppleSamsungGooglePixel'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2: Hover over item phoneAppleSamsungGooglePixel.png')

"Step 3: Click on link apple2 -> Navigate to page 'category/*'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_apple2'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3: Click on link apple2 - Navigate to page category.png')

"Step 4: Click on button newIphone15Plus"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_newIphone15Plus'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4: Click on button newIphone15Plus.png')

"Step 5: Click on button closeButton"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_closeButton'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5: Click on button closeButton.png')

"Step 6: Click on link goToCart -> Navigate to page 'cart'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_goToCart'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6: Click on link goToCart - Navigate to page cart.png')

"Step 7: Click on link goToCart"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_goToCart'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7: Click on link goToCart.png')

"Step 8: Click on button proceedToCheckout -> Navigate to page 'checkout/shipping-address'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8: Click on button proceedToCheckout - Navigate to page checkoutshipping-address.png')

"Step 9: Hover over div muiInputBaseRoot"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiInputBaseRoot'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9: Hover over div muiInputBaseRoot.png')

"Step 10: Click on input firstName"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_firstName'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10: Click on input firstName.png')

"Step 11: Hover over div muiFormControlRoot"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControlRoot'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 11: Hover over div muiFormControlRoot.png')

"Step 12: Enter input value in input firstName"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_firstName'), input_shipping_address_first_name)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 12: Enter input value in input firstName.png')

"Step 13: Click on input lastName"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_lastName'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 13: Click on input lastName.png')

"Step 14: Hover over div muiFormControlRoot"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControlRoot_1'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 14: Hover over div muiFormControlRoot.png')

"Step 15: Enter input value in input lastName"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_lastName'), input_shipping_address_last_name)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 15: Enter input value in input lastName.png')

"Step 16: Click on input address"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_address'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 16: Click on input address.png')

"Step 17: Hover over div muiFormControlRoot"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControlRoot_2'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 17: Hover over div muiFormControlRoot.png')

"Step 18: Enter input value in input address"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_address'), input_shipping_address_address_line_1)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 18: Enter input value in input address.png')

"Step 19: Click on input zipCode"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_zipCode'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 19: Click on input zipCode.png')

"Step 20: Hover over div muiFormControlRoot"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControlRoot_3'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 20: Hover over div muiFormControlRoot.png')

"Step 21: Enter input value in input zipCode"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_zipCode'), input_shipping_address_zip)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 21: Enter input value in input zipCode.png')

"Step 22: Click on input city"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_city'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 22: Click on input city.png')

"Step 23: Enter input value in input city"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_city'), input_shipping_address_city)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 23: Enter input value in input city.png')

"Step 24: Hover over div muiFormControlRoot"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControlRoot_4'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 24: Hover over div muiFormControlRoot.png')

"Step 25: Enter input value in input state"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_state'), input_shipping_address_state)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 25: Enter input value in input state.png')

"Step 26: Click on input shippingAddressPhone"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressPhone'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 26: Click on input shippingAddressPhone.png')

"Step 27: Enter input value in input shippingAddressPhone"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressPhone'), input_shipping_address_phone)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 27: Enter input value in input shippingAddressPhone.png')

"Step 28: Click on button continueToPayment -> Navigate to page 'thank-you/*'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/button_continueToPayment'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 28: Click on button continueToPayment - Navigate to page thank-you.png')

"Step 29: Hover over item accessoriesAppleSamsung"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/thank-you/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_thank_you/item_accessoriesAppleSamsung'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 29: Hover over item accessoriesAppleSamsung.png')

"Step 30: Click on link apple -> Navigate to page ''"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/thank-you/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_thank_you/link_apple'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 30: Click on link apple - Navigate to page .png')

"Step 31: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Complete Purchase of New iPhone 15 Plus_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
