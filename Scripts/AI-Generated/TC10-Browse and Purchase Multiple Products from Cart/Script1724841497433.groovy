import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.common.completeShippingDetailsAndProceed
import katalon.common.browseCategoryAndPurchaseProduct
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

"Step 2: Browse category and purchase selected product from cart"

browseCategoryAndPurchaseProduct.execute(data_path_0, Integer.valueOf(index_0))

"Step 3: Click on label storageColorModel (iphone15Plus)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_storageColorModel"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_storageColorModel', ['label_storageColorModel_for': label_storageColorModel_for, 'label_storageColorModel_internalText': label_storageColorModel_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 3-Click on label storageColorModel iphone15Plus.png')

"Step 4: Click on label storageColorModel (cypress)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_storageColorModel"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_storageColorModel', ['label_storageColorModel_for': label_storageColorModel_for_1, 'label_storageColorModel_internalText': label_storageColorModel_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 4-Click on label storageColorModel cypress.png')

"Step 5: Click on link cart (cart) -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_cart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_cart', ['link_cart_class': link_cart_class, 'link_cart_internalRoleLinkName': link_cart_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 5-Click on link cart cart - Navigate to page cart.png')

"Step 6: Click on label dynamicObject (iphone15Plus)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/label_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/label_dynamicObject', ['label_dynamicObject_for': label_dynamicObject_for, 'label_dynamicObject_internalText': label_dynamicObject_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 6-Click on label dynamicObject iphone15Plus.png')

"Step 7: Click on label dynamicObject (cypress)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/label_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/label_dynamicObject', ['label_dynamicObject_for': label_dynamicObject_for_1, 'label_dynamicObject_internalText': label_dynamicObject_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 7-Click on label dynamicObject cypress.png')

"Step 8: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 8-Click on button buy.png')

"Step 9: Hover over link goToCart (goToCart)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/link_goToCart"
WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_cart/link_goToCart', ['link_goToCart_internalRoleLinkName': link_goToCart_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 9-Hover over link goToCart goToCart.png')

"Step 10: Click on span shoppingCart (shoppingCart)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/span_shoppingCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/span_shoppingCart', ['span_shoppingCart_internalRoleLinkName': span_shoppingCart_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 10-Click on span shoppingCart shoppingCart.png')

"Step 11: Hover over link goToCart (goToCart)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/link_goToCart"
WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_cart/link_goToCart', ['link_goToCart_internalRoleLinkName': link_goToCart_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 11-Hover over link goToCart goToCart.png')

"Step 12: Click on span shoppingCart (shoppingCart)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/span_shoppingCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/span_shoppingCart', ['span_shoppingCart_internalRoleLinkName': span_shoppingCart_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 12-Click on span shoppingCart shoppingCart.png')

"Step 13: Click on link goShopping -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_goShopping'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 13-Click on link goShopping - Navigate to page .png')

"Step 14: Click on button addToCart (addToCart2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_addToCart', ['button_addToCart_class': button_addToCart_class, 'button_addToCart_internalHasText': button_addToCart_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 14-Click on button addToCart addToCart2.png')

"Step 15: Click on label storageColor (256Gb)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_storageColor"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_storageColor', ['label_storageColor_for': label_storageColor_for, 'label_storageColor_internalText': label_storageColor_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 15-Click on label storageColor 256Gb.png')

"Step 16: Click on label storageColor (blueTitanium)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_storageColor"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_storageColor', ['label_storageColor_for': label_storageColor_for_1, 'label_storageColor_internalText': label_storageColor_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 16-Click on label storageColor blueTitanium.png')

"Step 17: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 17-Click on button close.png')

"Step 18: Click on button hotNewIphone (hotNewBestChoiceIphone)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_hotNewIphone"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_hotNewIphone', ['button_hotNewIphone_class': button_hotNewIphone_class, 'button_hotNewIphone_internalHasText': button_hotNewIphone_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 18-Click on button hotNewIphone hotNewBestChoiceIphone.png')

"Step 19: Click on label storageColor (tb)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_storageColor"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_storageColor', ['label_storageColor_for': label_storageColor_for_2, 'label_storageColor_internalText': label_storageColor_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 19-Click on label storageColor tb.png')

"Step 20: Click on label storageColor (blueTitanium)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_storageColor"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_storageColor', ['label_storageColor_for': label_storageColor_for_3, 'label_storageColor_internalText': label_storageColor_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 20-Click on label storageColor blueTitanium.png')

"Step 21: Click on button buy2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_buy2'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 21-Click on button buy2.png')

"Step 22: Hover over link goToCart (goToCart)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_goToCart"
WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_goToCart', ['link_goToCart_internalRoleLinkName': link_goToCart_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 22-Hover over link goToCart goToCart.png')

"Step 23: Click on span shoppingCart (shoppingCart) -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/span_shoppingCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/span_shoppingCart', ['span_shoppingCart_internalRoleLinkName': span_shoppingCart_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 23-Click on span shoppingCart shoppingCart - Navigate to page cart.png')

"Step 24: Click on button proceedToCheckout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 24-Click on button proceedToCheckout.png')

"Step 25: Complete all shipping details and continue to the next step"

completeShippingDetailsAndProceed.execute(data_path_1, Integer.valueOf(index_1))

"Step 26: Click on button contactInfo -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/button_contactInfo'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 26-Click on button contactInfo - Navigate to page .png')

"Step 27: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC10-Browse and Purchase Multiple Products from Cart_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}