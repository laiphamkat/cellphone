import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import katalon.common.fillShippingAddressAndProceedToPayment
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

WebUI.takeScreenshot(reportLocation + '/TC2/Step 2: Hover over item phoneAppleSamsungGooglePixel.png')

"Step 3: Click on link samsung -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_samsung', ['dynamicInternalRoleLinkNameVariable': GlobalVariable.link_samsung_dynamicInternalRoleLinkNameVariable, 'dynamicNthChildIndex': GlobalVariable.link_samsung_dynamicNthChildIndex]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 3: Click on link samsung - Navigate to page category.png')

"Step 4: Click on link samsungGalaxyS23Ultra -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_samsungGalaxyS23Ultra'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4: Click on link samsungGalaxyS23Ultra - Navigate to page product.png')

"Step 5: Click on label 256Gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_256Gb', ['dynamicInternalTextVariable': GlobalVariable.label_256Gb_dynamicInternalTextVariable, 'dynamicForVariable': GlobalVariable.label_256Gb_dynamicForVariable]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 5: Click on label 256Gb.png')

"Step 6: Click on label 256Gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_256Gb', ['dynamicInternalTextVariable': GlobalVariable.label_256Gb_dynamicInternalTextVariable, 'dynamicForVariable': GlobalVariable.label_256Gb_dynamicForVariable]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 6: Click on label 256Gb.png')

"Step 7: Hover over div productsSliderProduct"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_product/div_productsSliderProduct'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 7: Hover over div productsSliderProduct.png')

"Step 8: Click on button addToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_addToCart'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 8: Click on button addToCart.png')

"Step 9: Click on label 512Gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_512Gb', ['dynamicForVariable': GlobalVariable.label_512Gb_dynamicForVariable]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 9: Click on label 512Gb.png')

"Step 10: Click on label 512Gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_512Gb', ['dynamicForVariable': GlobalVariable.label_512Gb_dynamicForVariable]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 10: Click on label 512Gb.png')

"Step 11: Click on button buy2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy2'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 11: Click on button buy2.png')

"Step 12: Click on link goToCart -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_goToCart', ['dynamicInternalRoleLinkNameIndex': GlobalVariable.link_goToCart_dynamicInternalRoleLinkNameIndex]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 12: Click on link goToCart - Navigate to page cart.png')

"Step 13: Click on button increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_increased', ['dynamicClassVariable': GlobalVariable.button_increased_dynamicClassVariable]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 13: Click on button increased.png')

"Step 14: Click on button proceedToCheckout -> Navigate to page 'checkout/info'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 14: Click on button proceedToCheckout - Navigate to page checkoutinfo.png')

"Step 15: Hover over div emailMeWithNews"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_info/div_emailMeWithNews'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 15: Hover over div emailMeWithNews.png')

"Step 16: Click on input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_email'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 16: Click on input email.png')

"Step 17: Enter input value in input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_email'), var_1_input_email)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 17: Enter input value in input email.png')

"Step 18: Click on button continueToShipping"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_continueToShipping'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 18: Click on button continueToShipping.png')

"Step 19: Fill shipping address details and proceed to payment"

fillShippingAddressAndProceedToPayment.execute(data_path_0, Integer.valueOf(index_0))

"Step 20: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Purchase Samsung Galaxy S23 Ultra with 512Gb Storage_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}