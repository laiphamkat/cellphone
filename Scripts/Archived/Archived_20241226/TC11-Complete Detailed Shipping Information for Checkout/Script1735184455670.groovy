import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import archived.archived_20241226.truetest.common.proceedToCheckoutAndContinueToShipping
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

"Step 2: Click on button AddToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20241226/Page_home/button_AddToCart'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 2-Click on button AddToCart.png')

"Step 3: Click on button purchaseOptions (Increased)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20241226/Dynamic Objects/Page_home/button_purchaseOptions"
WebUI.enhancedClick(findTestObject('Archived/Archived_20241226/Dynamic Objects/Page_home/button_purchaseOptions', ['button_purchaseOptions_internalRoleButtonName': button_purchaseOptions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 3-Click on button purchaseOptions Increased.png')

"Step 4: Click on label colorStorageCapacity (256GB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20241226/Dynamic Objects/Page_home/label_colorStorageCapacity"
WebUI.enhancedClick(findTestObject('Archived/Archived_20241226/Dynamic Objects/Page_home/label_colorStorageCapacity', ['label_colorStorageCapacity_for': label_colorStorageCapacity_for, 'label_colorStorageCapacity_internalText': label_colorStorageCapacity_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 4-Click on label colorStorageCapacity 256GB.png')

"Step 5: Click on label colorStorageCapacity (Pink)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20241226/Dynamic Objects/Page_home/label_colorStorageCapacity"
WebUI.enhancedClick(findTestObject('Archived/Archived_20241226/Dynamic Objects/Page_home/label_colorStorageCapacity', ['label_colorStorageCapacity_for': label_colorStorageCapacity_for_1, 'label_colorStorageCapacity_internalText': label_colorStorageCapacity_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 5-Click on label colorStorageCapacity Pink.png')

"Step 6: Click on button Buy2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20241226/Page_home/button_Buy2'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 6-Click on button Buy2.png')

"Step 7: Click on link cartNavigation (GoToCart2) -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20241226/Dynamic Objects/Page_home/link_cartNavigation"
WebUI.enhancedClick(findTestObject('Archived/Archived_20241226/Dynamic Objects/Page_home/link_cartNavigation', ['link_cartNavigation_internalRoleLinkName': link_cartNavigation_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 7-Click on link cartNavigation GoToCart2 - Navigate to page cart.png')

"Step 8: Click on button quantityAdjustment (quantityAdjustment3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20241226/Dynamic Objects/Page_cart/button_quantityAdjustment_2"
WebUI.enhancedClick(findTestObject('Archived/Archived_20241226/Dynamic Objects/Page_cart/button_quantityAdjustment_2', ['button_quantityAdjustment_nthChild': button_quantityAdjustment_nthChild, 'button_quantityAdjustment_internalRoleButtonName': button_quantityAdjustment_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 8-Click on button quantityAdjustment quantityAdjustment3.png')

"Step 9: Proceed to checkout and enter email for shipping details"

proceedToCheckoutAndContinueToShipping.execute(data_path_0, Integer.valueOf(index_0))

"Step 10: Hover over div checkoutShippingAddress"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_checkoutShippingAddress'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 10-Hover over div checkoutShippingAddress.png')

"Step 11: Click on input Phone3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20241226/Page_checkout_shipping_address/input_Phone_1'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 11-Click on input Phone3.png')

"Step 12: Click on input Phone3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20241226/Page_checkout_shipping_address/input_Phone_1'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 12-Click on input Phone3.png')

"Step 13: Hover over div checkoutShippingAddress2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_checkoutShippingAddress2'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 13-Hover over div checkoutShippingAddress2.png')

"Step 14: Enter input value in input Phone3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('Archived/Archived_20241226/Page_checkout_shipping_address/input_Phone_1'), input_Phone3)

WebUI.takeScreenshot(reportLocation + '/TC11/Step 14-Enter input value in input Phone3.png')

"Step 15: Click on input ZipCode22"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20241226/Page_checkout_shipping_address/input_ZipCode_1'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 15-Click on input ZipCode22.png')

"Step 16: Hover over div checkoutShippingAddress3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_checkoutShippingAddress3'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 16-Hover over div checkoutShippingAddress3.png')

"Step 17: Enter input value in input City3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('Archived/Archived_20241226/Page_checkout_shipping_address/input_City_1'), input_City3)

WebUI.takeScreenshot(reportLocation + '/TC11/Step 17-Enter input value in input City3.png')

"Step 18: Click on input FirstName4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20241226/Page_checkout_shipping_address/input_FirstName4'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 18-Click on input FirstName4.png')

"Step 19: Hover over div checkoutShippingAddress4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_checkoutShippingAddress4'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 19-Hover over div checkoutShippingAddress4.png')

"Step 20: Enter input value in input LastName3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('Archived/Archived_20241226/Page_checkout_shipping_address/input_LastName_1'), input_LastName3)

WebUI.takeScreenshot(reportLocation + '/TC11/Step 20-Enter input value in input LastName3.png')

"Step 21: Click on input LastName4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20241226/Page_checkout_shipping_address/input_LastName_1'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 21-Click on input LastName4.png')

"Step 22: Hover over div checkoutShippingAddress5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_checkoutShippingAddress5'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 22-Hover over div checkoutShippingAddress5.png')

"Step 23: Enter input value in input Address3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('Archived/Archived_20241226/Page_checkout_shipping_address/input_Address_1'), input_Address3)

WebUI.takeScreenshot(reportLocation + '/TC11/Step 23-Enter input value in input Address3.png')

"Step 24: Click on input Address4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20241226/Page_checkout_shipping_address/input_Address_1'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 24-Click on input Address4.png')

"Step 25: Hover over div checkoutShippingAddress6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_checkoutShippingAddress6'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 25-Hover over div checkoutShippingAddress6.png')

"Step 26: Enter input value in input ZipCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('Archived/Archived_20241226/Page_checkout_shipping_address/input_ZipCode_1'), input_ZipCode)

WebUI.takeScreenshot(reportLocation + '/TC11/Step 26-Enter input value in input ZipCode.png')

"Step 27: Click on input City4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20241226/Page_checkout_shipping_address/input_City_1'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 27-Click on input City4.png')

"Step 28: Hover over div checkoutShippingAddress7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_checkoutShippingAddress7'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 28-Hover over div checkoutShippingAddress7.png')

"Step 29: Enter input value in input State3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('Archived/Archived_20241226/Page_checkout_shipping_address/input_State_1'), input_State3)

WebUI.takeScreenshot(reportLocation + '/TC11/Step 29-Enter input value in input State3.png')

"Step 30: Click on input State4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20241226/Page_checkout_shipping_address/input_State_1'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 30-Click on input State4.png')

"Step 31: Enter input value in input Phone3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('Archived/Archived_20241226/Page_checkout_shipping_address/input_Phone_1'), input_Phone3_1)

WebUI.takeScreenshot(reportLocation + '/TC11/Step 31-Enter input value in input Phone3.png')

"Step 32: Click on button ContinueToPayment -> Navigate to page 'checkout/payment'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/button_ContinueToPayment'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 32-Click on button ContinueToPayment - Navigate to page checkoutpayment.png')

"Step 33: Click on button CompleteOrder -> Navigate to page 'thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 33-Click on button CompleteOrder - Navigate to page thank-you.png')

"Step 34: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC11-Complete Detailed Shipping Information for Checkout_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}