import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.proceedToCheckoutFromInfo
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

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_AddToCart'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 2-Click on button AddToCart.png')

"Step 3: Click on button purchaseActions (Increased)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_purchaseActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_purchaseActions', ['button_purchaseActions_internalRoleButtonName': button_purchaseActions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 3-Click on button purchaseActions Increased.png')

"Step 4: Click on label storageOptions (256GB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_storageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_storageOptions', ['label_storageOptions_for': label_storageOptions_for, 'label_storageOptions_internalText': label_storageOptions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 4-Click on label storageOptions 256GB.png')

"Step 5: Click on label storageOptions (Pink)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_storageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_storageOptions', ['label_storageOptions_for': label_storageOptions_for_1, 'label_storageOptions_internalText': label_storageOptions_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 5-Click on label storageOptions Pink.png')

"Step 6: Click on button Buy2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_Buy2'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 6-Click on button Buy2.png')

"Step 7: Click on link cartNavigation (GoToCart2) -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_cartNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_cartNavigation', ['link_cartNavigation_internalRoleLinkName': link_cartNavigation_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 7-Click on link cartNavigation GoToCart2 - Navigate to page cart.png')

"Step 8: Click on button quantityAdjustment (IncreaseQuantity2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_quantityAdjustment"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_quantityAdjustment', ['button_quantityAdjustment_nthChild': button_quantityAdjustment_nthChild, 'button_quantityAdjustment_class': button_quantityAdjustment_class, 'button_quantityAdjustment_internalRoleButtonName': button_quantityAdjustment_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 8-Click on button quantityAdjustment IncreaseQuantity2.png')

"Step 9: Proceed to checkout after entering email and continue to shipping."

proceedToCheckoutFromInfo.execute(data_path_0, Integer.valueOf(index_0))

"Step 10: Hover over div checkoutShippingAddress"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_checkoutShippingAddress'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 10-Hover over div checkoutShippingAddress.png')

"Step 11: Click on input FirstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_FirstName'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 11-Click on input FirstName.png')

"Step 12: Click on input FirstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_FirstName'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 12-Click on input FirstName.png')

"Step 13: Hover over div checkoutShippingAddress2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_checkoutShippingAddress2'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 13-Hover over div checkoutShippingAddress2.png')

"Step 14: Enter input value in input FirstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_FirstName'), input_FirstName)

WebUI.takeScreenshot(reportLocation + '/TC11/Step 14-Enter input value in input FirstName.png')

"Step 15: Click on input LastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_LastName'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 15-Click on input LastName.png')

"Step 16: Hover over div checkoutShippingAddress3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_checkoutShippingAddress3'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 16-Hover over div checkoutShippingAddress3.png')

"Step 17: Enter input value in input LastName2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_LastName'), input_LastName2)

WebUI.takeScreenshot(reportLocation + '/TC11/Step 17-Enter input value in input LastName2.png')

"Step 18: Click on input Address"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_Address'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 18-Click on input Address.png')

"Step 19: Hover over div checkoutShippingAddress4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_checkoutShippingAddress4'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 19-Hover over div checkoutShippingAddress4.png')

"Step 20: Enter input value in input Address2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_Address'), input_Address2)

WebUI.takeScreenshot(reportLocation + '/TC11/Step 20-Enter input value in input Address2.png')

"Step 21: Click on input ZipCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_ZipCode'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 21-Click on input ZipCode.png')

"Step 22: Hover over div checkoutShippingAddress5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_checkoutShippingAddress5'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 22-Hover over div checkoutShippingAddress5.png')

"Step 23: Enter input value in input ZipCode2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_ZipCode'), input_ZipCode2)

WebUI.takeScreenshot(reportLocation + '/TC11/Step 23-Enter input value in input ZipCode2.png')

"Step 24: Click on input City"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_City'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 24-Click on input City.png')

"Step 25: Hover over div checkoutShippingAddress6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_checkoutShippingAddress6'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 25-Hover over div checkoutShippingAddress6.png')

"Step 26: Enter input value in input City2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_City'), input_City2)

WebUI.takeScreenshot(reportLocation + '/TC11/Step 26-Enter input value in input City2.png')

"Step 27: Click on input State"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_State'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 27-Click on input State.png')

"Step 28: Hover over div checkoutShippingAddress7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_checkoutShippingAddress7'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 28-Hover over div checkoutShippingAddress7.png')

"Step 29: Enter input value in input State2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_State'), input_State2)

WebUI.takeScreenshot(reportLocation + '/TC11/Step 29-Enter input value in input State2.png')

"Step 30: Click on input Phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_Phone'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 30-Click on input Phone.png')

"Step 31: Enter input value in input Phone2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_Phone'), input_Phone2)

WebUI.takeScreenshot(reportLocation + '/TC11/Step 31-Enter input value in input Phone2.png')

"Step 32: Click on button ContinueToPayment -> Navigate to page 'checkout/payment'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/button_ContinueToPayment'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 32-Click on button ContinueToPayment - Navigate to page checkoutpayment.png')

"Step 33: Click on button CompleteOrder -> Navigate to page 'thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 33-Click on button CompleteOrder - Navigate to page thank-you.png')

"Step 34: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC11-Complete Checkout After Filling Shipping Address Form_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}