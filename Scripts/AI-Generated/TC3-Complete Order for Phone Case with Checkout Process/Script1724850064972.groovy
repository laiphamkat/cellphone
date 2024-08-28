import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.truetest.TrueTestScripts
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

"Step 2: Hover over item item2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_item2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 2-Hover over item item2.png')

"Step 3: Click on link mobileBrands (samsung) -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_mobileBrands"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_mobileBrands', ['link_mobileBrands_nthChild': link_mobileBrands_nthChild, 'link_mobileBrands_internalRoleLinkName': link_mobileBrands_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 3-Click on link mobileBrands samsung - Navigate to page category.png')

"Step 4: Click on link phoneCases (googlePixel8) -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_phoneCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_phoneCases', ['link_phoneCases_class': link_phoneCases_class, 'link_phoneCases_internalRoleLinkName': link_phoneCases_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 4-Click on link phoneCases googlePixel8 - Navigate to page product.png')

"Step 5: Click on label productSpecifications (512Gb)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_productSpecifications"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_productSpecifications', ['label_productSpecifications_for': label_productSpecifications_for, 'label_productSpecifications_internalText': label_productSpecifications_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 5-Click on label productSpecifications 512Gb.png')

"Step 6: Click on label productSpecifications (blue)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_productSpecifications"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_productSpecifications', ['label_productSpecifications_for': label_productSpecifications_for_1, 'label_productSpecifications_internalText': label_productSpecifications_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 6-Click on label productSpecifications blue.png')

"Step 7: Click on button buy2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 7-Click on button buy2.png')

"Step 8: Hover over link cart (cart)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/link_cart"
WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_cart', ['link_cart_internalRoleLinkName': link_cart_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 8-Hover over link cart cart.png')

"Step 9: Click on span shoppingCart -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/span_shoppingCart'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 9-Click on span shoppingCart - Navigate to page cart.png')

"Step 10: Click on button proceedToCheckout -> Navigate to page 'checkout/payment'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 10-Click on button proceedToCheckout - Navigate to page checkoutpayment.png')

"Step 11: Click on button completeOrder -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_completeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 11-Click on button completeOrder - Navigate to page .png')

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Complete Order for Phone Case with Checkout Process_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}