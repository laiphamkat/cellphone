import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.fillPersonalDetailsForOrderProcessing
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
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

"Step 2: Hover over item productCategories (Accessories)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_home/item_productCategories'))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 2-Hover over item productCategories Accessories.png')

"Step 3: Click on link brandNames (Samsung2) -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_brandNames"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_brandNames', ['link_brandNames_nthChild': link_brandNames_nthChild, 'link_brandNames_category_id': link_brandNames_category_id]))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 3-Click on link brandNames Samsung2 - Navigate to page category.png')

"Step 4: Click on link productModels (samsungGalaxyS23Ultra) -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_productModels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_productModels', ['link_productModels_class': link_productModels_class, 'link_productModels_product_id': link_productModels_product_id]))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 4-Click on link productModels samsungGalaxyS23Ultra - Navigate to page product.png')

"Step 5: Click on link object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_object'))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 5-Click on link object.png')

"Step 6: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 6-Click on button Close.png')

"Step 7: Click on link accessories -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_accessories'))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 7-Click on link accessories - Navigate to page category.png')

"Step 8: Click on link productModels (iphone15SiliconeCase) -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_productModels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_productModels', ['link_productModels_class': link_productModels_class_1, 'link_productModels_internalRoleLinkName': link_productModels_internalRoleLinkName, 'link_productModels_product_id': link_productModels_product_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 8-Click on link productModels iphone15SiliconeCase - Navigate to page product.png')

"Step 9: Click on label storageOptions (iphone15)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_storageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_storageOptions', ['label_storageOptions_for': label_storageOptions_for]))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 9-Click on label storageOptions iphone15.png')

"Step 10: Click on label storageOptions (cypress)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_storageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_storageOptions', ['label_storageOptions_for': label_storageOptions_for_1, 'label_storageOptions_internalText': label_storageOptions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 10-Click on label storageOptions cypress.png')

"Step 11: Hover over div ProductSlider"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_product/div_ProductSlider'))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 11-Hover over div ProductSlider.png')

"Step 12: Click on button AddToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_AddToCart'))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 12-Click on button AddToCart.png')

"Step 13: Click on label Storage512GB3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_Storage512GB3'))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 13-Click on label Storage512GB3.png')

"Step 14: Click on label Storage512GB3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_Storage512GB3'))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 14-Click on label Storage512GB3.png')

"Step 15: Click on button Buy3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_Buy3'))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 15-Click on button Buy3.png')

"Step 16: Click on link goToCartMultiple (GoToCart3) -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/link_goToCartMultiple_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_goToCartMultiple_1', ['link_goToCartMultiple_internalRoleLinkName': link_goToCartMultiple_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 16-Click on link goToCartMultiple GoToCart3 - Navigate to page cart.png')

"Step 17: Click on button quantityAdjustment (IncreaseQuantity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_quantityAdjustment"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_quantityAdjustment', ['button_quantityAdjustment_class': button_quantityAdjustment_class, 'button_quantityAdjustment_nthChild': button_quantityAdjustment_nthChild, 'button_quantityAdjustment_internalRoleButtonName': button_quantityAdjustment_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 17-Click on button quantityAdjustment IncreaseQuantity.png')

"Step 18: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 18-Click on button Close.png')

"Step 19: Click on button ProceedToCheckout -> Navigate to page 'checkout/info'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_ProceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 19-Click on button ProceedToCheckout - Navigate to page checkoutinfo.png')

"Step 20: Click on div BackToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/div_BackToCart'))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 20-Click on div BackToCart.png')

"Step 21: Hover over div EmailSubscription"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_info/div_EmailSubscription'))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 21-Hover over div EmailSubscription.png')

"Step 22: Click on input Email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_Email'))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 22-Click on input Email.png')

"Step 23: Enter input value in input Email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_Email'), input_Email)

WebUI.takeScreenshot(reportLocation + '/TC113/Step 23-Enter input value in input Email.png')

"Step 24: Click on button ContinueToShipping"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_ContinueToShipping'))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 24-Click on button ContinueToShipping.png')

"Step 25: Fill out personal details for order processing"

fillPersonalDetailsForOrderProcessing.execute(data_path_0, Integer.valueOf(index_0))

"Step 26: Hover over link BackToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/link_BackToCart'))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 26-Hover over link BackToCart.png')

"Step 27: Click on link object -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/link_object'))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 27-Click on link object - Navigate to page cart.png')

"Step 28: Hover over item CartItems"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_cart/item_CartItems'))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 28-Hover over item CartItems.png')

"Step 29: Click on link Apple -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_Apple'))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 29-Click on link Apple - Navigate to page category.png')

"Step 30: Click on button addToCart (AddToCart)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_addToCart', ['button_addToCart_class': button_addToCart_class, 'button_addToCart_internalHasText': button_addToCart_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 30-Click on button addToCart AddToCart.png')

"Step 31: Click on button addToCart (AddToCart) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_addToCart', ['button_addToCart_class': button_addToCart_class_1, 'button_addToCart_internalHasText': button_addToCart_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 31-Click on button addToCart AddToCart - Navigate to page .png')

"Step 32: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC113-Complete Order Process for Multiple Products with Various Options_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}