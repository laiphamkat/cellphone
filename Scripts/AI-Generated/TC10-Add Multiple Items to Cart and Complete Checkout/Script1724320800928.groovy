import internal.GlobalVariable
import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.common.addAccessoriesToCart
import katalon.common.completeShippingAddressForm
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Select accessories and add them to the shopping cart"

addAccessoriesToCart.execute(data_path_0, Integer.valueOf(index_0))

"Step 3: Click on label iPhone15Plus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/chekhly-na-iphone?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_chekhly_na_iphone/label_cypress_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_chekhly_na_iphone/label_cypress_1', ['label_cypress_for': label_cypress_for, 'label_cypress_internalText': label_cypress_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 3-Click on label iPhone15Plus.png')

"Step 4: Click on label cypress"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/chekhly-na-iphone?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_chekhly_na_iphone/label_cypress_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_chekhly_na_iphone/label_cypress_2', ['label_cypress_for': label_cypress_for, 'label_cypress_internalText': label_cypress_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 4-Click on label cypress.png')

"Step 5: Click on link goToCart -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/chekhly-na-iphone?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_chekhly_na_iphone/link_goToCart'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 5-Click on link goToCart - Navigate to page cart.png')

"Step 6: Click on label iPhone15Plus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/label_cypress"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/label_cypress', ['label_cypress_for': label_cypress_for, 'label_cypress_internalText': label_cypress_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 6-Click on label iPhone15Plus.png')

"Step 7: Click on label cypress"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/label_cypress_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/label_cypress_1', ['label_cypress_for': label_cypress_for, 'label_cypress_internalText': label_cypress_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 7-Click on label cypress.png')

"Step 8: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 8-Click on button buy.png')

"Step 9: Hover over link goToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/link_goToCart"
WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_cart/link_goToCart', ['link_goToCart_internalRoleLinkName': link_goToCart_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 9-Hover over link goToCart.png')

"Step 10: Click on span object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/span_object"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/span_object', ['span_object_internalRoleLinkName': span_object_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 10-Click on span object.png')

"Step 11: Hover over link goToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/link_goToCart"
WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_cart/link_goToCart', ['link_goToCart_internalRoleLinkName': link_goToCart_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 11-Hover over link goToCart.png')

"Step 12: Click on span object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/span_object"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/span_object', ['span_object_internalRoleLinkName': span_object_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 12-Click on span object.png')

"Step 13: Click on link goShopping -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_goShopping'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 13-Click on link goShopping - Navigate to page .png')

"Step 14: Click on button addToCartSamsungGalaxyS23"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_addToCartNewiPhone15Plus"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_addToCartNewiPhone15Plus', ['button_addToCartNewiPhone15Plus_class': button_addToCartNewiPhone15Plus_class, 'button_addToCartNewiPhone15Plus_internalHasText': button_addToCartNewiPhone15Plus_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 14-Click on button addToCartSamsungGalaxyS23.png')

"Step 15: Click on label 256Gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_yellow_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_yellow_1', ['label_yellow_for': label_yellow_for, 'label_yellow_internalText': label_yellow_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 15-Click on label 256Gb.png')

"Step 16: Click on label white"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_white_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_white_2', ['label_white_for': label_white_for, 'label_white_internalText': label_white_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 16-Click on label white.png')

"Step 17: Click on button closeButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_closeButton'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 17-Click on button closeButton.png')

"Step 18: Click on button addToCartBestChoiceIphone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_hotNewiPhone15_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_hotNewiPhone15_1', ['button_hotNewiPhone15_class': button_hotNewiPhone15_class, 'button_hotNewiPhone15_internalHasText': button_hotNewiPhone15_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 18-Click on button addToCartBestChoiceIphone.png')

"Step 19: Click on label object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_object_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_object_1', ['label_object_for': label_object_for, 'label_object_internalText': label_object_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 19-Click on label object.png')

"Step 20: Click on label white"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_white_3"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_white_3', ['label_white_for': label_white_for, 'label_white_internalText': label_white_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 20-Click on label white.png')

"Step 21: Click on button buy2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_buy2'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 21-Click on button buy2.png')

"Step 22: Hover over link goToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/link_goToCart'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 22-Hover over link goToCart.png')

"Step 23: Click on span shoppingCart -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/span_shoppingCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/span_shoppingCart', ['span_shoppingCart_internalRoleLinkName': span_shoppingCart_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 23-Click on span shoppingCart - Navigate to page cart.png')

"Step 24: Click on button proceedToCheckout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 24-Click on button proceedToCheckout.png')

"Step 25: Fill in shipping address details for order processing"

completeShippingAddressForm.execute(data_path_1, Integer.valueOf(index_1))

"Step 26: Click on button contactInfo -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/button_contactInfo'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 26-Click on button contactInfo - Navigate to page .png')

"Step 27: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC10-Add Multiple Items to Cart and Complete Checkout_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}