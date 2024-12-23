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

"Step 2: Hover over item object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_object2'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 2-Hover over item object2.png')

"Step 3: Click on link mobileBrands (SamsungCategory) -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_mobileBrands"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_mobileBrands', ['link_mobileBrands_nthChild': link_mobileBrands_nthChild, 'link_mobileBrands_internalRoleLinkName': link_mobileBrands_internalRoleLinkName, 'category_id': category_id]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 3-Click on link mobileBrands SamsungCategory - Navigate to page category.png')

"Step 4: Click on link ByTitle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_ByTitle'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 4-Click on link ByTitle.png')

"Step 5: Click on link productOptions (SamsungGalaxyZFold5) -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_productOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_productOptions', ['link_productOptions_class': link_productOptions_class, 'link_productOptions_internalRoleLinkName': link_productOptions_internalRoleLinkName, 'product_id': product_id]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 5-Click on link productOptions SamsungGalaxyZFold5 - Navigate to page product.png')

"Step 6: Click on label colorStorageOptions (colorStorageOptions)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_colorStorageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_colorStorageOptions', ['label_colorStorageOptions_for': label_colorStorageOptions_for, 'label_colorStorageOptions_internalText': label_colorStorageOptions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 6-Click on label colorStorageOptions colorStorageOptions.png')

"Step 7: Click on label colorStorageOptions (colorStorageOptions2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_colorStorageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_colorStorageOptions', ['label_colorStorageOptions_for': label_colorStorageOptions_for_1, 'label_colorStorageOptions_internalText': label_colorStorageOptions_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 7-Click on label colorStorageOptions colorStorageOptions2.png')

"Step 8: Click on link cartNavigation (GoToCart) -> Navigate to page 'checkout/info'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/link_cartNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_cartNavigation', ['link_cartNavigation_internalRoleLinkName': link_cartNavigation_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 8-Click on link cartNavigation GoToCart - Navigate to page checkoutinfo.png')

"Step 9: Hover over div checkoutInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_info/div_checkoutInfo'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 9-Hover over div checkoutInfo.png')

"Step 10: Click on input Email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_Email'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 10-Click on input Email.png')

"Step 11: Enter input value in input Email2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_Email'), input_Email2)

WebUI.takeScreenshot(reportLocation + '/TC20/Step 11-Enter input value in input Email2.png')

"Step 12: Click on button ContinueToShipping -> Navigate to page 'checkout/shipping-address'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_ContinueToShipping'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 12-Click on button ContinueToShipping - Navigate to page checkoutshipping-address.png')

"Step 13: Hover over div checkoutShippingAddress"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_checkoutShippingAddress'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 13-Hover over div checkoutShippingAddress.png')

"Step 14: Click on input FirstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_FirstName'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 14-Click on input FirstName.png')

"Step 15: Hover over div checkoutShippingAddress2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_checkoutShippingAddress2'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 15-Hover over div checkoutShippingAddress2.png')

"Step 16: Enter input value in input FirstName2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_FirstName'), input_FirstName2)

WebUI.takeScreenshot(reportLocation + '/TC20/Step 16-Enter input value in input FirstName2.png')

"Step 17: Click on input LastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_LastName'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 17-Click on input LastName.png')

"Step 18: Hover over div checkoutShippingAddress3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_checkoutShippingAddress3'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 18-Hover over div checkoutShippingAddress3.png')

"Step 19: Enter input value in input LastName2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_LastName'), input_LastName2)

WebUI.takeScreenshot(reportLocation + '/TC20/Step 19-Enter input value in input LastName2.png')

"Step 20: Click on input Address"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_Address'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 20-Click on input Address.png')

"Step 21: Hover over div checkoutShippingAddress4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_checkoutShippingAddress4'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 21-Hover over div checkoutShippingAddress4.png')

"Step 22: Enter input value in input Address2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_Address'), input_Address2)

WebUI.takeScreenshot(reportLocation + '/TC20/Step 22-Enter input value in input Address2.png')

"Step 23: Click on input ZipCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_ZipCode'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 23-Click on input ZipCode.png')

"Step 24: Hover over div checkoutShippingAddress5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_checkoutShippingAddress5'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 24-Hover over div checkoutShippingAddress5.png')

"Step 25: Enter input value in input ZipCode2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_ZipCode'), input_ZipCode2)

WebUI.takeScreenshot(reportLocation + '/TC20/Step 25-Enter input value in input ZipCode2.png')

"Step 26: Click on input City"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_City'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 26-Click on input City.png')

"Step 27: Hover over div checkoutShippingAddress6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_checkoutShippingAddress6'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 27-Hover over div checkoutShippingAddress6.png')

"Step 28: Enter input value in input City2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_City'), input_City2)

WebUI.takeScreenshot(reportLocation + '/TC20/Step 28-Enter input value in input City2.png')

"Step 29: Click on input State"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_State'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 29-Click on input State.png')

"Step 30: Hover over div checkoutShippingAddress7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_checkoutShippingAddress7'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 30-Hover over div checkoutShippingAddress7.png')

"Step 31: Enter input value in input State2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_State'), input_State2)

WebUI.takeScreenshot(reportLocation + '/TC20/Step 31-Enter input value in input State2.png')

"Step 32: Click on input Phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_Phone'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 32-Click on input Phone.png')

"Step 33: Enter input value in input Phone2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_Phone'), input_Phone2)

WebUI.takeScreenshot(reportLocation + '/TC20/Step 33-Enter input value in input Phone2.png')

"Step 34: Click on button ContinueToPayment -> Navigate to page 'checkout/payment'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/button_ContinueToPayment'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 34-Click on button ContinueToPayment - Navigate to page checkoutpayment.png')

"Step 35: Click on button CompleteOrder -> Navigate to page 'thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 35-Click on button CompleteOrder - Navigate to page thank-you.png')

"Step 36: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC20-Complete Checkout Process with Shipping Information for Mobile Brands_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}