import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.common.completeShippingDetailsAndProceed
import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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

"Step 2: Hover over item dynamicObject (item)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_dynamicObject'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 2-Hover over item dynamicObject item.png')

"Step 3: Click on link samsung2 -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_samsung2'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 3-Click on link samsung2 - Navigate to page category.png')

"Step 4: Click on link mobileDevices (samsungGalaxyS23Ultra) -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_mobileDevices"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_mobileDevices', ['link_mobileDevices_class': link_mobileDevices_class, 'link_mobileDevices_internalRoleLinkName': link_mobileDevices_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 4-Click on link mobileDevices samsungGalaxyS23Ultra - Navigate to page product.png')

"Step 5: Click on link productGallery"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_productGallery'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 5-Click on link productGallery.png')

"Step 6: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 6-Click on button close.png')

"Step 7: Click on link accessories -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_accessories'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 7-Click on link accessories - Navigate to page category.png')

"Step 8: Click on link mobileDevices (iphone15ClearCaseWithMagSafe) -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_mobileDevices"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_mobileDevices', ['link_mobileDevices_class': link_mobileDevices_class_1, 'link_mobileDevices_internalRoleLinkName': link_mobileDevices_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 8-Click on link mobileDevices iphone15ClearCaseWithMagSafe - Navigate to page product.png')

"Step 9: Click on label colorModelStorage (iphone15)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_colorModelStorage"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_colorModelStorage', ['label_colorModelStorage_for': label_colorModelStorage_for, 'label_colorModelStorage_internalText': label_colorModelStorage_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 9-Click on label colorModelStorage iphone15.png')

"Step 10: Click on label colorModelStorage (blue)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_colorModelStorage"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_colorModelStorage', ['label_colorModelStorage_for': label_colorModelStorage_for_1, 'label_colorModelStorage_internalText': label_colorModelStorage_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 10-Click on label colorModelStorage blue.png')

"Step 11: Hover over div productsSlider"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_product/div_productsSlider'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 11-Hover over div productsSlider.png')

"Step 12: Click on button addToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_addToCart'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 12-Click on button addToCart.png')

"Step 13: Click on label 512Gb2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_512Gb2'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 13-Click on label 512Gb2.png')

"Step 14: Click on label 512Gb2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_512Gb2'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 14-Click on label 512Gb2.png')

"Step 15: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 15-Click on button buy.png')

"Step 16: Click on link goToCart (goToCart) -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_goToCart'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 16-Click on link goToCart goToCart - Navigate to page cart.png')

"Step 17: Click on button dynamicObject (increased)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_dynamicObject', ['button_dynamicObject_nthChild': button_dynamicObject_nthChild, 'button_dynamicObject_class': button_dynamicObject_class, 'button_dynamicObject_internalRoleButtonName': button_dynamicObject_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 17-Click on button dynamicObject increased.png')

"Step 18: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 18-Click on button close.png')

"Step 19: Click on button proceedToCheckout -> Navigate to page 'checkout/info'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 19-Click on button proceedToCheckout - Navigate to page checkoutinfo.png')

"Step 20: Click on div backToTheCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/div_backToTheCart'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 20-Click on div backToTheCart.png')

"Step 21: Complete all shipping details and continue to the next step"

completeShippingDetailsAndProceed.execute(data_path_0, Integer.valueOf(index_0))

"Step 22: Hover over link backToTheCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/link_backToTheCart'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 22-Hover over link backToTheCart.png')

"Step 23: Click on link backToTheCart2 -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/link_backToTheCart2'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 23-Click on link backToTheCart2 - Navigate to page cart.png')

"Step 24: Hover over item listItem"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_cart/item_listItem'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 24-Hover over item listItem.png')

"Step 25: Click on link apple -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_apple'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 25-Click on link apple - Navigate to page category.png')

"Step 26: Click on button addToCart (addToCart2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_addToCart', ['button_addToCart_class': button_addToCart_class, 'button_addToCart_internalHasText': button_addToCart_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 26-Click on button addToCart addToCart2.png')

"Step 27: Click on button addToCart (addToCart2) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_addToCart', ['button_addToCart_class': button_addToCart_class_1, 'button_addToCart_internalHasText': button_addToCart_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 27-Click on button addToCart addToCart2 - Navigate to page .png')

"Step 28: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC16-Purchase Accessories and Verify Checkout Process_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}