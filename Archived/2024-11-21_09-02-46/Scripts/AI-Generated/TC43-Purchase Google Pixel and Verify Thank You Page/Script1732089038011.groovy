import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
import truetest.custom.TrueTestScripts
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

"Step 2: Hover over item object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_object2'))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 2-Hover over item object2.png')

"Step 3: Click on link GooglePixel -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_GooglePixel'))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 3-Click on link GooglePixel - Navigate to page category.png')

"Step 4: Click on link GoToCart2 -> Navigate to page 'checkout/info'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_GoToCart2'))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 4-Click on link GoToCart2 - Navigate to page checkoutinfo.png')

"Step 5: Hover over div CheckoutInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_info/div_CheckoutInfo'))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 5-Hover over div CheckoutInfo.png')

"Step 6: Click on input Email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_Email'))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 6-Click on input Email.png')

"Step 7: Enter input value in input Email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_Email'), input_Email)

WebUI.takeScreenshot(reportLocation + '/TC43/Step 7-Enter input value in input Email.png')

"Step 8: Click on button ContinueToShipping -> Navigate to page 'checkout/shipping-address'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_ContinueToShipping'))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 8-Click on button ContinueToShipping - Navigate to page checkoutshipping-address.png')

"Step 9: Hover over div CheckoutShippingAddress7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_CheckoutShippingAddress7'))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 9-Hover over div CheckoutShippingAddress7.png')

"Step 10: Click on input FirstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_FirstName'))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 10-Click on input FirstName.png')

"Step 11: Hover over div CheckoutShippingAddress"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_CheckoutShippingAddress'))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 11-Hover over div CheckoutShippingAddress.png')

"Step 12: Enter input value in input FirstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_FirstName'), input_FirstName)

WebUI.takeScreenshot(reportLocation + '/TC43/Step 12-Enter input value in input FirstName.png')

"Step 13: Click on input LastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_LastName'))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 13-Click on input LastName.png')

"Step 14: Hover over div CheckoutShippingAddress2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_CheckoutShippingAddress2'))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 14-Hover over div CheckoutShippingAddress2.png')

"Step 15: Enter input value in input LastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_LastName'), input_LastName)

WebUI.takeScreenshot(reportLocation + '/TC43/Step 15-Enter input value in input LastName.png')

"Step 16: Click on input Address"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_Address'))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 16-Click on input Address.png')

"Step 17: Hover over div CheckoutShippingAddress3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_CheckoutShippingAddress3'))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 17-Hover over div CheckoutShippingAddress3.png')

"Step 18: Enter input value in input Address"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_Address'), input_Address)

WebUI.takeScreenshot(reportLocation + '/TC43/Step 18-Enter input value in input Address.png')

"Step 19: Click on input ZipCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_ZipCode'))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 19-Click on input ZipCode.png')

"Step 20: Hover over div CheckoutShippingAddress4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_CheckoutShippingAddress4'))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 20-Hover over div CheckoutShippingAddress4.png')

"Step 21: Enter input value in input ZipCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_ZipCode'), input_ZipCode)

WebUI.takeScreenshot(reportLocation + '/TC43/Step 21-Enter input value in input ZipCode.png')

"Step 22: Click on input ShippingCity"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_ShippingCity'))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 22-Click on input ShippingCity.png')

"Step 23: Hover over div CheckoutShippingAddress5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_CheckoutShippingAddress5'))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 23-Hover over div CheckoutShippingAddress5.png')

"Step 24: Enter input value in input ShippingCity"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_ShippingCity'), input_ShippingCity)

WebUI.takeScreenshot(reportLocation + '/TC43/Step 24-Enter input value in input ShippingCity.png')

"Step 25: Click on input State"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_State'))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 25-Click on input State.png')

"Step 26: Hover over div CheckoutShippingAddress6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_CheckoutShippingAddress6'))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 26-Hover over div CheckoutShippingAddress6.png')

"Step 27: Enter input value in input State"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_State'), input_State)

WebUI.takeScreenshot(reportLocation + '/TC43/Step 27-Enter input value in input State.png')

"Step 28: Click on input Phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_Phone'))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 28-Click on input Phone.png')

"Step 29: Enter input value in input Phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_Phone'), input_Phone)

WebUI.takeScreenshot(reportLocation + '/TC43/Step 29-Enter input value in input Phone.png')

"Step 30: Click on div deliveryInformation (DeliveryInformation)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_checkout_shipping_address/div_deliveryInformation'))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 30-Click on div deliveryInformation DeliveryInformation.png')

"Step 31: Click on button ContinueToPayment -> Navigate to page 'checkout/payment'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/button_ContinueToPayment'))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 31-Click on button ContinueToPayment - Navigate to page checkoutpayment.png')

"Step 32: Click on button CompleteOrder -> Navigate to page 'thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 32-Click on button CompleteOrder - Navigate to page thank-you.png')

"Step 33: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC43-Purchase Google Pixel and Verify Thank You Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}