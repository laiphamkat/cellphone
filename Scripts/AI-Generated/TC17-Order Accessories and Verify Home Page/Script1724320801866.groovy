import internal.GlobalVariable
import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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

"Step 2: Hover over item accessories"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_home/item_phone_7'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 2-Hover over item accessories.png')

"Step 3: Click on link samsungPowerAndCables -> Navigate to page '/category/power-and-cables'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_samsungPowerAndCables'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 3-Click on link samsungPowerAndCables - Navigate to page categorypower-and-cables.png')

"Step 4: Click on link samsungGalaxyS23UltraSmartviewCases -> Navigate to page '/product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/power-and-cables?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_power_and_cables/link_samsungGalaxyZfold4SiliconCover_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_power_and_cables/link_samsungGalaxyZfold4SiliconCover_1', ['link_samsungGalaxyZfold4SiliconCover_class': link_samsungGalaxyZfold4SiliconCover_class, 'link_samsungGalaxyZfold4SiliconCover_internalRoleHeadingName': link_samsungGalaxyZfold4SiliconCover_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 4-Click on link samsungGalaxyS23UltraSmartviewCases - Navigate to page product.png')

"Step 5: Click on link productGallery"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_productGallery'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 5-Click on link productGallery.png')

"Step 6: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 6-Click on button close.png')

"Step 7: Click on link accessories -> Navigate to page '/category/accessories'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_accessories'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 7-Click on link accessories - Navigate to page categoryaccessories.png')

"Step 8: Click on link iphone15SiliconeCaseWithMagSafe -> Navigate to page '/product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/accessories?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_accessories/link_iphone15SiliconeCaseWithMagSafe'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 8-Click on link iphone15SiliconeCaseWithMagSafe - Navigate to page product.png')

"Step 9: Click on label 256Gb1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_black_3"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_black_3', ['label_black_for': label_black_for, 'label_black_internalText': label_black_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 9-Click on label 256Gb1.png')

"Step 10: Click on label blueTitanium"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_blueTitanium_9"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_blueTitanium_9', ['label_blueTitanium_for': label_blueTitanium_for, 'label_blueTitanium_internalText': label_blueTitanium_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 10-Click on label blueTitanium.png')

"Step 11: Hover over div productsSliderProduct"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_product/div_productsSliderProduct'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 11-Hover over div productsSliderProduct.png')

"Step 12: Click on button addToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_addToCart'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 12-Click on button addToCart.png')

"Step 13: Click on label 512Gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_512Gb'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 13-Click on label 512Gb.png')

"Step 14: Click on label 512Gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_512Gb'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 14-Click on label 512Gb.png')

"Step 15: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 15-Click on button buy.png')

"Step 16: Click on link goToCart -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/link_goToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_goToCart', ['link_goToCart_internalRoleLinkName': link_goToCart_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 16-Click on link goToCart - Navigate to page cart.png')

"Step 17: Click on button increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_decreased_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_decreased_1', ['button_decreased_class': button_decreased_class, 'button_decreased_nthChild': button_decreased_nthChild, 'button_decreased_internalRoleButtonName': button_decreased_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 17-Click on button increased.png')

"Step 18: Click on button closeButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_closeButton'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 18-Click on button closeButton.png')

"Step 19: Click on button proceedToCheckout -> Navigate to page '/checkout/info'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 19-Click on button proceedToCheckout - Navigate to page checkoutinfo.png')

"Step 20: Click on div headerBody"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/div_headerBody'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 20-Click on div headerBody.png')

"Step 21: Fill in shipping address details for order processing"

completeShippingAddressForm.execute(data_path_0, Integer.valueOf(index_0))

"Step 22: Hover over link backToTheCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/link_backToTheCart'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 22-Hover over link backToTheCart.png')

"Step 23: Click on link chevronLeftIcon -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/link_chevronLeftIcon'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 23-Click on link chevronLeftIcon - Navigate to page cart.png')

"Step 24: Hover over item listitem2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_cart/item_listitem2'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 24-Hover over item listitem2.png')

"Step 25: Click on link apple -> Navigate to page '/category/chekhly-na-iphone'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_apple'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 25-Click on link apple - Navigate to page categorychekhly-na-iphone.png')

"Step 26: Click on button addToCartNewIphone15SiliconeCase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/chekhly-na-iphone?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_chekhly_na_iphone/button_addToCartNewIphone15SiliconeCase'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 26-Click on button addToCartNewIphone15SiliconeCase.png')

"Step 27: Click on button addToCartNewIphone15SiliconeCase -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/chekhly-na-iphone?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_chekhly_na_iphone/button_addToCartNewIphone15SiliconeCase'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 27-Click on button addToCartNewIphone15SiliconeCase - Navigate to page .png')

"Step 28: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC17-Order Accessories and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}