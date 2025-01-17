import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
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

"Step 2: Hover over item object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_object4'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 2-Hover over item object4.png')

"Step 3: Click on link brandCategories (GooglePixel) -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_brandCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_brandCategories', ['link_brandCategories_nthChild': link_brandCategories_nthChild, 'link_brandCategories_internalRoleLinkName': link_brandCategories_internalRoleLinkName, 'category_id': category_id]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 3-Click on link brandCategories GooglePixel - Navigate to page category.png')

"Step 4: Click on link GoToCart3 -> Navigate to page 'checkout/info'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20241226/Page_category/link_GoToCart3'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 4-Click on link GoToCart3 - Navigate to page checkoutinfo.png')

"Step 5: Hover over div checkoutInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_info/div_checkoutInfo'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 5-Hover over div checkoutInfo.png')

"Step 6: Click on input Email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_Email'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 6-Click on input Email.png')

"Step 7: Enter input value in input Email2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_Email'), input_Email2)

WebUI.takeScreenshot(reportLocation + '/TC13/Step 7-Enter input value in input Email2.png')

"Step 8: Click on button ContinueToShipping -> Navigate to page 'checkout/shipping-address'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_ContinueToShipping'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 8-Click on button ContinueToShipping - Navigate to page checkoutshipping-address.png')

"Step 9: Hover over div checkoutShippingAddress"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_checkoutShippingAddress'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 9-Hover over div checkoutShippingAddress.png')

"Step 10: Click on input Phone3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20241226/Page_checkout_shipping_address/input_Phone_1'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 10-Click on input Phone3.png')

"Step 11: Hover over div checkoutShippingAddress2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_checkoutShippingAddress2'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 11-Hover over div checkoutShippingAddress2.png')

"Step 12: Enter input value in input Phone3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('Archived/Archived_20241226/Page_checkout_shipping_address/input_Phone_1'), input_Phone3)

WebUI.takeScreenshot(reportLocation + '/TC13/Step 12-Enter input value in input Phone3.png')

"Step 13: Click on input ZipCode22"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20241226/Page_checkout_shipping_address/input_ZipCode_1'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 13-Click on input ZipCode22.png')

"Step 14: Hover over div checkoutShippingAddress3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_checkoutShippingAddress3'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 14-Hover over div checkoutShippingAddress3.png')

"Step 15: Enter input value in input City3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('Archived/Archived_20241226/Page_checkout_shipping_address/input_City_1'), input_City3)

WebUI.takeScreenshot(reportLocation + '/TC13/Step 15-Enter input value in input City3.png')

"Step 16: Click on input FirstName4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20241226/Page_checkout_shipping_address/input_FirstName4'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 16-Click on input FirstName4.png')

"Step 17: Hover over div checkoutShippingAddress4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_checkoutShippingAddress4'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 17-Hover over div checkoutShippingAddress4.png')

"Step 18: Enter input value in input LastName3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('Archived/Archived_20241226/Page_checkout_shipping_address/input_LastName_1'), input_LastName3)

WebUI.takeScreenshot(reportLocation + '/TC13/Step 18-Enter input value in input LastName3.png')

"Step 19: Click on input LastName4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20241226/Page_checkout_shipping_address/input_LastName_1'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 19-Click on input LastName4.png')

"Step 20: Hover over div checkoutShippingAddress5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_checkoutShippingAddress5'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 20-Hover over div checkoutShippingAddress5.png')

"Step 21: Enter input value in input Address3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('Archived/Archived_20241226/Page_checkout_shipping_address/input_Address_1'), input_Address3)

WebUI.takeScreenshot(reportLocation + '/TC13/Step 21-Enter input value in input Address3.png')

"Step 22: Click on input Address4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20241226/Page_checkout_shipping_address/input_Address_1'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 22-Click on input Address4.png')

"Step 23: Hover over div checkoutShippingAddress6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_checkoutShippingAddress6'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 23-Hover over div checkoutShippingAddress6.png')

"Step 24: Enter input value in input ZipCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('Archived/Archived_20241226/Page_checkout_shipping_address/input_ZipCode_1'), input_ZipCode)

WebUI.takeScreenshot(reportLocation + '/TC13/Step 24-Enter input value in input ZipCode.png')

"Step 25: Click on input City4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20241226/Page_checkout_shipping_address/input_City_1'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 25-Click on input City4.png')

"Step 26: Hover over div checkoutShippingAddress7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_checkoutShippingAddress7'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 26-Hover over div checkoutShippingAddress7.png')

"Step 27: Enter input value in input State3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('Archived/Archived_20241226/Page_checkout_shipping_address/input_State_1'), input_State3)

WebUI.takeScreenshot(reportLocation + '/TC13/Step 27-Enter input value in input State3.png')

"Step 28: Click on input State4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20241226/Page_checkout_shipping_address/input_State_1'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 28-Click on input State4.png')

"Step 29: Enter input value in input Phone3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('Archived/Archived_20241226/Page_checkout_shipping_address/input_Phone_1'), input_Phone3_1)

WebUI.takeScreenshot(reportLocation + '/TC13/Step 29-Enter input value in input Phone3.png')

"Step 30: Click on link Iphone15"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20241226/Page_checkout_shipping_address/link_Iphone15'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 30-Click on link Iphone15.png')

"Step 31: Click on button ContinueToPayment -> Navigate to page 'checkout/payment'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/button_ContinueToPayment'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 31-Click on button ContinueToPayment - Navigate to page checkoutpayment.png')

"Step 32: Click on button CompleteOrder -> Navigate to page 'thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 32-Click on button CompleteOrder - Navigate to page thank-you.png')

"Step 33: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC13-Complete Order with Shipping Information for iPhone_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}