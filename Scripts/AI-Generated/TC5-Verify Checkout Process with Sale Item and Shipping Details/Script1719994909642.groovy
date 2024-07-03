import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts
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

"Step 2: Hover over item accessories"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_accessories'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 2: Hover over item accessories.png')

"Step 3: Click on link apple -> Navigate to page 'category/*'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_apple'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 3: Click on link apple - Navigate to page category.png')

"Step 4: Click on item sale20WusbcpowerAdapter"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/item_sale20WusbcpowerAdapter'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 4: Click on item sale20WusbcpowerAdapter.png')

"Step 5: Click on button sale20WusbpowerAdapter"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_sale20WusbpowerAdapter'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 5: Click on button sale20WusbpowerAdapter.png')

"Step 6: Click on link goToCart -> Navigate to page '/cart'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_goToCart'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 6: Click on link goToCart - Navigate to page cart.png')

"Step 7: Click on button proceedToCheckout -> Navigate to page 'checkout/info'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 7: Click on button proceedToCheckout - Navigate to page checkoutinfo.png')

"Step 8: Hover over div emailMeWithNews"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_info/div_emailMeWithNews'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 8: Hover over div emailMeWithNews.png')

"Step 9: Click on input email"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_email'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 9: Click on input email.png')

"Step 10: Enter input value in input email"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_email'), input_email)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 10: Enter input value in input email.png')

"Step 11: Click on button continueToShipping -> Navigate to page 'checkout/shipping-address'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_continueToShipping'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 11: Click on button continueToShipping - Navigate to page checkoutshipping-address.png')

"Step 12: Hover over div muiInputBaseRoot"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiInputBaseRoot'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 12: Hover over div muiInputBaseRoot.png')

"Step 13: Click on input firstName"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_firstName'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 13: Click on input firstName.png')

"Step 14: Hover over div muiFormControlRoot"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControlRoot'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 14: Hover over div muiFormControlRoot.png')

"Step 15: Enter input value in input firstName"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_firstName'), input_shipping_address_first_name)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 15: Enter input value in input firstName.png')

"Step 16: Click on input lastName"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_lastName'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 16: Click on input lastName.png')

"Step 17: Hover over div muiFormControlRoot"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControlRoot_1'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 17: Hover over div muiFormControlRoot.png')

"Step 18: Enter input value in input lastName"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_lastName'), input_shipping_address_last_name)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 18: Enter input value in input lastName.png')

"Step 19: Click on input address"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_address'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 19: Click on input address.png')

"Step 20: Hover over div muiFormControlRoot"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControlRoot_2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 20: Hover over div muiFormControlRoot.png')

"Step 21: Enter input value in input address"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_address'), input_shipping_address_address_line_1)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 21: Enter input value in input address.png')

"Step 22: Click on input zipCode"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_zipCode'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 22: Click on input zipCode.png')

"Step 23: Hover over div muiFormControlRoot"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControlRoot_3'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 23: Hover over div muiFormControlRoot.png')

"Step 24: Enter input value in input zipCode"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_zipCode'), input_shipping_address_zip)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 24: Enter input value in input zipCode.png')

"Step 25: Click on input city"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_city'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 25: Click on input city.png')

"Step 26: Hover over div muiFormControlRoot"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControlRoot_5'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 26: Hover over div muiFormControlRoot.png')

"Step 27: Enter input value in input city"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_city'), input_shipping_address_city)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 27: Enter input value in input city.png')

"Step 28: Click on input state"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_state'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 28: Click on input state.png')

"Step 29: Hover over div muiFormControlRoot"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControlRoot_4'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 29: Hover over div muiFormControlRoot.png')

"Step 30: Enter input value in input state"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_state'), input_shipping_address_state)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 30: Enter input value in input state.png')

"Step 31: Click on input shippingAddressPhone"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressPhone'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 31: Click on input shippingAddressPhone.png')

"Step 32: Enter input value in input shippingAddressPhone"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressPhone'), input_shipping_address_phone)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 32: Enter input value in input shippingAddressPhone.png')

"Step 33: Click on button continueToPayment -> Navigate to page 'checkout/payment'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/button_continueToPayment'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 33: Click on button continueToPayment - Navigate to page checkoutpayment.png')

"Step 34: Click on button completeOrder -> Navigate to page 'thank-you/*'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_completeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 34: Click on button completeOrder - Navigate to page thank-you.png')

"Step 35: Hover over item listitem"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/thank-you/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_thank_you/item_listitem'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 35: Hover over item listitem.png')

"Step 36: Click on link apple2 -> Navigate to page 'category/*'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/thank-you/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_thank_you/link_apple2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 36: Click on link apple2 - Navigate to page category.png')

"Step 37: Hover over item accessoriesAppleSamsung"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_category/item_accessoriesAppleSamsung'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 37: Hover over item accessoriesAppleSamsung.png')

"Step 38: Click on link apple"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_apple'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 38: Click on link apple.png')

"Step 39: Click on button sale20WusbcpowerAdapter -> Navigate to page ''"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_sale20WusbcpowerAdapter'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 39: Click on button sale20WusbcpowerAdapter - Navigate to page .png')

"Step 40: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Verify Checkout Process with Sale Item and Shipping Details_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
