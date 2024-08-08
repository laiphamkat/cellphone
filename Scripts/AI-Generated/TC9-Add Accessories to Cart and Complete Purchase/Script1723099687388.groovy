import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.common.subscribeEmailUpdatesAndContinueShipping
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable

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

WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_home/item_accessories'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 2-Hover over item accessories.png')

"Step 3: Click on link samsungPowerAndCables -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_samsungPowerAndCables'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 3-Click on link samsungPowerAndCables - Navigate to page category.png')

"Step 4: Click on link productApple20Wusbadapter -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_productApple20Wusbadapter"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_productApple20Wusbadapter', ['class': link_productApple20Wusbadapter_class, 'internalRoleLinkName': link_productApple20Wusbadapter_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 4-Click on link productApple20Wusbadapter - Navigate to page product.png')

"Step 5: Click on link productGallery"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_productGallery'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 5-Click on link productGallery.png')

"Step 6: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 6-Click on button close.png')

"Step 7: Click on link accessories -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_accessories'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 7-Click on link accessories - Navigate to page category.png')

"Step 8: Click on link productApple20Wusbadapter -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_productApple20Wusbadapter"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_productApple20Wusbadapter', ['class': link_productApple20Wusbadapter_class, 'internalRoleLinkName': link_productApple20Wusbadapter_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 8-Click on link productApple20Wusbadapter - Navigate to page product.png')

"Step 9: Click on label object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_object"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_object', ['for': label_object_for, 'internalText': label_object_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 9-Click on label object.png')

"Step 10: Click on label object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_object"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_object', ['for': label_object_for, 'internalText': label_object_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 10-Click on label object.png')

"Step 11: Hover over div productsSliderProduct"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_product/div_productsSliderProduct'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 11-Hover over div productsSliderProduct.png')

"Step 12: Click on button addToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_addToCart'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 12-Click on button addToCart.png')

"Step 13: Click on label 512Gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_512Gb'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 13-Click on label 512Gb.png')

"Step 14: Click on label 512Gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_512Gb'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 14-Click on label 512Gb.png')

"Step 15: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 15-Click on button buy.png')

"Step 16: Click on link goToCart -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_goToCart'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 16-Click on link goToCart - Navigate to page cart.png')

"Step 17: Click on button increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_increased'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 17-Click on button increased.png')

"Step 18: Click on button closeButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_closeButton'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 18-Click on button closeButton.png')

"Step 19: Click on button proceedToCheckout -> Navigate to page 'checkout/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 19-Click on button proceedToCheckout - Navigate to page checkout.png')

"Step 20: Click on div headerBody"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/div_headerBody'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 20-Click on div headerBody.png')

"Step 21: Subscribe to email updates and proceed to shipping"

subscribeEmailUpdatesAndContinueShipping.execute(data_path_0, Integer.valueOf(index_0))

"Step 22: Hover over link backToTheCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/link_backToTheCart'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 22-Hover over link backToTheCart.png')

"Step 23: Click on link chevronLeftIcon -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/link_chevronLeftIcon'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 23-Click on link chevronLeftIcon - Navigate to page cart.png')

"Step 24: Hover over item listitem2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_cart/item_listitem2'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 24-Hover over item listitem2.png')

"Step 25: Click on link apple -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_apple'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 25-Click on link apple - Navigate to page category.png')

"Step 26: Click on button addToCartNewIphone15SiliconeCase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_addToCartNewIphone15SiliconeCase'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 26-Click on button addToCartNewIphone15SiliconeCase.png')

"Step 27: Click on button addToCartNewIphone15SiliconeCase -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_addToCartNewIphone15SiliconeCase'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 27-Click on button addToCartNewIphone15SiliconeCase - Navigate to page .png')

"Step 28: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC9-Add Accessories to Cart and Complete Purchase_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}