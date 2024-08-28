import katalon.truetest.TrueTestScripts
import internal.GlobalVariable
import katalon.common.browseProductsAndAddToCart
import katalon.common.completeShippingAddressDetails
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Browse product categories and add items to the cart"

browseProductsAndAddToCart.execute(data_path_0, Integer.valueOf(index_0))

"Step 3: Click on label iphoneAccessories (iphone15Plus)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/chekhly-na-iphone?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_chekhly_na_iphone/label_iphoneAccessories"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_chekhly_na_iphone/label_iphoneAccessories', ['label_iphoneAccessories_for': label_iphoneAccessories_for, 'label_iphoneAccessories_internalText': label_iphoneAccessories_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 3-Click on label iphoneAccessories iphone15Plus.png')

"Step 4: Click on label iphoneAccessories (cypress)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/chekhly-na-iphone?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_chekhly_na_iphone/label_iphoneAccessories"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_chekhly_na_iphone/label_iphoneAccessories', ['label_iphoneAccessories_for': label_iphoneAccessories_for_1, 'label_iphoneAccessories_internalText': label_iphoneAccessories_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 4-Click on label iphoneAccessories cypress.png')

"Step 5: Click on link goToCart -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/chekhly-na-iphone?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_chekhly_na_iphone/link_goToCart'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 5-Click on link goToCart - Navigate to page cart.png')

"Step 6: Click on label cartItems (iphone15Plus)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/label_cartItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/label_cartItems', ['label_cartItems_for': label_cartItems_for, 'label_cartItems_internalText': label_cartItems_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 6-Click on label cartItems iphone15Plus.png')

"Step 7: Click on label cartItems (cypress)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/label_cartItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/label_cartItems', ['label_cartItems_for': label_cartItems_for_1, 'label_cartItems_internalText': label_cartItems_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 7-Click on label cartItems cypress.png')

"Step 8: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 8-Click on button buy.png')

"Step 9: Hover over link cartNavigation (goToCart)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/link_cartNavigation"
WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_cart/link_cartNavigation', ['link_cartNavigation_internalRoleLinkName': link_cartNavigation_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 9-Hover over link cartNavigation goToCart.png')

"Step 10: Click on span cartIndicator (shoppingCart)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/span_cartIndicator"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/span_cartIndicator', ['span_cartIndicator_internalRoleLinkName': span_cartIndicator_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 10-Click on span cartIndicator shoppingCart.png')

"Step 11: Hover over link cartNavigation (goToCart)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/link_cartNavigation"
WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_cart/link_cartNavigation', ['link_cartNavigation_internalRoleLinkName': link_cartNavigation_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 11-Hover over link cartNavigation goToCart.png')

"Step 12: Click on span cartIndicator (shoppingCart)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/span_cartIndicator"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/span_cartIndicator', ['span_cartIndicator_internalRoleLinkName': span_cartIndicator_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 12-Click on span cartIndicator shoppingCart.png')

"Step 13: Click on link goShopping -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_goShopping'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 13-Click on link goShopping - Navigate to page .png')

"Step 14: Click on button addToCart (addToCart)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_addToCart', ['button_addToCart_class': button_addToCart_class, 'button_addToCart_internalHasText': button_addToCart_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 14-Click on button addToCart addToCart.png')

"Step 15: Click on label storageOptions (256Gb)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_storageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_storageOptions', ['label_storageOptions_for': label_storageOptions_for, 'label_storageOptions_internalText': label_storageOptions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 15-Click on label storageOptions 256Gb.png')

"Step 16: Click on label storageOptions (white)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_storageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_storageOptions', ['label_storageOptions_for': label_storageOptions_for_1, 'label_storageOptions_internalText': label_storageOptions_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 16-Click on label storageOptions white.png')

"Step 17: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 17-Click on button close.png')

"Step 18: Click on button hotDeals (hotNewBestChoiceIphone)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_hotDeals"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_hotDeals', ['button_hotDeals_class': button_hotDeals_class, 'button_hotDeals_internalHasText': button_hotDeals_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 18-Click on button hotDeals hotNewBestChoiceIphone.png')

"Step 19: Click on label storageOptions (tb)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_storageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_storageOptions', ['label_storageOptions_for': label_storageOptions_for_2, 'label_storageOptions_internalText': label_storageOptions_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 19-Click on label storageOptions tb.png')

"Step 20: Click on label storageOptions (white)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_storageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_storageOptions', ['label_storageOptions_for': label_storageOptions_for_3, 'label_storageOptions_internalText': label_storageOptions_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 20-Click on label storageOptions white.png')

"Step 21: Click on button buy2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_buy2'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 21-Click on button buy2.png')

"Step 22: Hover over link goToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/link_goToCart'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 22-Hover over link goToCart.png')

"Step 23: Click on span cartIndicator (shoppingCart) -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/span_cartIndicator"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/span_cartIndicator', ['span_cartIndicator_internalRoleLinkName': span_cartIndicator_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 23-Click on span cartIndicator shoppingCart - Navigate to page cart.png')

"Step 24: Click on button proceedToCheckout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 24-Click on button proceedToCheckout.png')

"Step 25: Fill in shipping address details and continue to next step"

completeShippingAddressDetails.execute(data_path_1, Integer.valueOf(index_1))

"Step 26: Click on button contactInfo -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/button_contactInfo'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 26-Click on button contactInfo - Navigate to page .png')

"Step 27: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC9-Complex Cart Management and Checkout_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}