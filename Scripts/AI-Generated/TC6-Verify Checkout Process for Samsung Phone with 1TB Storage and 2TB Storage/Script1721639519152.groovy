import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.common.fillShippingAddressAndProceedToPayment
import katalon.truetest.TrueTestScripts

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

WebUI.takeScreenshot(reportLocation + '/TC6/Step 2: Hover over item phoneAppleSamsungGooglePixel.png')

"Step 3: Click on link samsung -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_samsung', ['internalRoleLinkNameVariable': GlobalVariable.link_samsung_internalRoleLinkNameVariable, 'nthChildIndex': GlobalVariable.link_samsung_nthChildIndex]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 3: Click on link samsung - Navigate to page category.png')

"Step 4: Click on button productsItemInStock"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_productsItemInStock', ['internalHasTextVariable': GlobalVariable.button_productsItemInStock_internalHasTextVariable, 'classVariable': GlobalVariable.button_productsItemInStock_classVariable]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 4: Click on button productsItemInStock.png')

"Step 5: Click on label 1Tb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/label_1Tb', ['forVariable': GlobalVariable.label_1Tb_forVariable, 'internalTextVariable': GlobalVariable.label_1Tb_internalTextVariable]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 5: Click on label 1Tb.png')

"Step 6: Click on label 1Tb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/label_1Tb', ['forVariable': GlobalVariable.label_1Tb_forVariable, 'internalTextVariable': GlobalVariable.label_1Tb_internalTextVariable]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 6: Click on label 1Tb.png')

"Step 7: Click on button buy2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_buy2'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 7: Click on button buy2.png')

"Step 8: Click on link goToCart -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_goToCart', ['internalRoleLinkNameIndex': GlobalVariable.link_goToCart_internalRoleLinkNameIndex]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 8: Click on link goToCart - Navigate to page cart.png')

"Step 9: Click on link goToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_goToCart'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 9: Click on link goToCart.png')

"Step 10: Click on button increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_increased', ['classVariable': GlobalVariable.button_increased_classVariable, 'nthIndex': GlobalVariable.button_increased_nthIndex]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 10: Click on button increased.png')

"Step 11: Click on button increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_increased', ['classVariable': GlobalVariable.button_increased_classVariable, 'nthIndex': GlobalVariable.button_increased_nthIndex]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 11: Click on button increased.png')

"Step 12: Click on button proceedToCheckout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 12: Click on button proceedToCheckout.png')

"Step 13: Fill shipping address details and proceed to payment"

fillShippingAddressAndProceedToPayment.execute(data_path_0, Integer.valueOf(index_0))

"Step 14: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Verify Checkout Process for Samsung Phone with 1TB Storage and 2TB Storage_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}