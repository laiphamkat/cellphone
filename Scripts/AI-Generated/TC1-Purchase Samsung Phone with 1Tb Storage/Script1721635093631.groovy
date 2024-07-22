import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
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

"Step 2: Hover over item phoneAppleSamsungGooglePixel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_phoneAppleSamsungGooglePixel'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2: Hover over item phoneAppleSamsungGooglePixel.png')

"Step 3: Click on link samsung -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_samsung', ['dynamicInternalRoleLinkNameVariable': GlobalVariable.link_samsung_dynamicInternalRoleLinkNameVariable, 'dynamicNthChildIndex': GlobalVariable.link_samsung_dynamicNthChildIndex]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3: Click on link samsung - Navigate to page category.png')

"Step 4: Click on button productsItemInStock"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_productsItemInStock', ['dynamicClassVariable': GlobalVariable.button_productsItemInStock_dynamicClassVariable, 'dynamicInternalHasTextVariable': GlobalVariable.button_productsItemInStock_dynamicInternalHasTextVariable]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4: Click on button productsItemInStock.png')

"Step 5: Click on label 1Tb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/label_1Tb', ['dynamicInternalTextVariable': GlobalVariable.label_1Tb_dynamicInternalTextVariable, 'dynamicForVariable': GlobalVariable.label_1Tb_dynamicForVariable]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5: Click on label 1Tb.png')

"Step 6: Click on label 1Tb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/label_1Tb', ['dynamicInternalTextVariable': GlobalVariable.label_1Tb_dynamicInternalTextVariable, 'dynamicForVariable': GlobalVariable.label_1Tb_dynamicForVariable]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6: Click on label 1Tb.png')

"Step 7: Click on button increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_increased'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7: Click on button increased.png')

"Step 8: Click on div priceAndBuyBtns"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/div_priceAndBuyBtns'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8: Click on div priceAndBuyBtns.png')

"Step 9: Click on button buy2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_buy2'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9: Click on button buy2.png')

"Step 10: Click on link goToCart -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_goToCart', ['dynamicInternalRoleLinkNameIndex': GlobalVariable.link_goToCart_dynamicInternalRoleLinkNameIndex]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10: Click on link goToCart - Navigate to page cart.png')

"Step 11: Click on button increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_increased', ['dynamicClassVariable': GlobalVariable.button_increased_dynamicClassVariable]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 11: Click on button increased.png')

"Step 12: Click on button proceedToCheckout -> Navigate to page 'checkout/payment'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 12: Click on button proceedToCheckout - Navigate to page checkoutpayment.png')

"Step 13: Click on button completeOrder -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_completeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 13: Click on button completeOrder - Navigate to page .png')

"Step 14: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Purchase Samsung Phone with 1Tb Storage_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}