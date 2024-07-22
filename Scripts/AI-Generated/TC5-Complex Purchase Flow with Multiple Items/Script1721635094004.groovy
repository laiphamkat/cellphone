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

WebUI.takeScreenshot(reportLocation + '/TC5/Step 2: Hover over item phoneAppleSamsungGooglePixel.png')

"Step 3: Click on link samsung -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_samsung', ['dynamicInternalRoleLinkNameVariable': GlobalVariable.link_samsung_dynamicInternalRoleLinkNameVariable, 'dynamicNthChildIndex': GlobalVariable.link_samsung_dynamicNthChildIndex]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 3: Click on link samsung - Navigate to page category.png')

"Step 4: Click on link iPhone15HotNew -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_iPhone15HotNew'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 4: Click on link iPhone15HotNew - Navigate to page product.png')

"Step 5: Click on list horizontalMenuList"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/list_horizontalMenuList'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 5: Click on list horizontalMenuList.png')

"Step 6: Click on button plus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_plus', ['dynamicInternalRoleButtonNameVariable': GlobalVariable.button_plus_dynamicInternalRoleButtonNameVariable]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 6: Click on button plus.png')

"Step 7: Click on label 256Gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_256Gb', ['dynamicInternalTextVariable': GlobalVariable.label_256Gb_dynamicInternalTextVariable, 'dynamicForVariable': GlobalVariable.label_256Gb_dynamicForVariable]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 7: Click on label 256Gb.png')

"Step 8: Click on label 256Gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_256Gb', ['dynamicInternalTextVariable': GlobalVariable.label_256Gb_dynamicInternalTextVariable, 'dynamicForVariable': GlobalVariable.label_256Gb_dynamicForVariable]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 8: Click on label 256Gb.png')

"Step 9: Click on button plus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_plus', ['dynamicInternalRoleButtonNameVariable': GlobalVariable.button_plus_dynamicInternalRoleButtonNameVariable]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 9: Click on button plus.png')

"Step 10: Click on button plus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_plus', ['dynamicInternalRoleButtonNameVariable': GlobalVariable.button_plus_dynamicInternalRoleButtonNameVariable]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 10: Click on button plus.png')

"Step 11: Click on link goToCart -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_goToCart', ['dynamicInternalRoleLinkNameIndex': GlobalVariable.link_goToCart_dynamicInternalRoleLinkNameIndex]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 11: Click on link goToCart - Navigate to page cart.png')

"Step 12: Click on button proceedToCheckout -> Navigate to page 'checkout/info'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 12: Click on button proceedToCheckout - Navigate to page checkoutinfo.png')

"Step 13: Hover over div emailMeWithNews"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_info/div_emailMeWithNews'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 13: Hover over div emailMeWithNews.png')

"Step 14: Click on input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_email'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 14: Click on input email.png')

"Step 15: Enter input value in input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_email'), var_1_input_email)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 15: Enter input value in input email.png')

"Step 16: Click on link backToTheCart -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/link_backToTheCart'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 16: Click on link backToTheCart - Navigate to page cart.png')

"Step 17: Hover over item phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_cart/item_phone'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 17: Hover over item phone.png')

"Step 18: Click on link apple2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_apple2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 18: Click on link apple2.png')

"Step 19: Click on link apple2 -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_apple2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 19: Click on link apple2 - Navigate to page category.png')

"Step 20: Click on button newiPhone15Plus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_newiPhone15Plus'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 20: Click on button newiPhone15Plus.png')

"Step 21: Click on button newiPhone15Plus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_newiPhone15Plus'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 21: Click on button newiPhone15Plus.png')

"Step 22: Click on label 1Tb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/label_1Tb', ['dynamicInternalTextVariable': GlobalVariable.label_1Tb_dynamicInternalTextVariable, 'dynamicForVariable': GlobalVariable.label_1Tb_dynamicForVariable]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 22: Click on label 1Tb.png')

"Step 23: Click on label 1Tb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/label_1Tb', ['dynamicInternalTextVariable': GlobalVariable.label_1Tb_dynamicInternalTextVariable, 'dynamicForVariable': GlobalVariable.label_1Tb_dynamicForVariable]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 23: Click on label 1Tb.png')

"Step 24: Click on label 1Tb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/label_1Tb', ['dynamicInternalTextVariable': GlobalVariable.label_1Tb_dynamicInternalTextVariable, 'dynamicForVariable': GlobalVariable.label_1Tb_dynamicForVariable]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 24: Click on label 1Tb.png')

"Step 25: Click on label 1Tb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/label_1Tb', ['dynamicInternalTextVariable': GlobalVariable.label_1Tb_dynamicInternalTextVariable, 'dynamicForVariable': GlobalVariable.label_1Tb_dynamicForVariable]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 25: Click on label 1Tb.png')

"Step 26: Click on button buy2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_buy2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 26: Click on button buy2.png')

"Step 27: Click on button buy2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_buy2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 27: Click on button buy2.png')

"Step 28: Click on link goToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_goToCart', ['dynamicInternalRoleLinkNameIndex': GlobalVariable.link_goToCart_dynamicInternalRoleLinkNameIndex]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 28: Click on link goToCart.png')

"Step 29: Click on link goToCart -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_goToCart', ['dynamicInternalRoleLinkNameIndex': GlobalVariable.link_goToCart_dynamicInternalRoleLinkNameIndex]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 29: Click on link goToCart - Navigate to page cart.png')

"Step 30: Click on button proceedToCheckout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 30: Click on button proceedToCheckout.png')

"Step 31: Click on button proceedToCheckout -> Navigate to page 'checkout/info'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 31: Click on button proceedToCheckout - Navigate to page checkoutinfo.png')

"Step 32: Hover over div emailMeWithNews"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_info/div_emailMeWithNews'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 32: Hover over div emailMeWithNews.png')

"Step 33: Click on input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_email'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 33: Click on input email.png')

"Step 34: Enter input value in input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_email'), var_2_input_email)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 34: Enter input value in input email.png')

"Step 35: Click on button continueToShipping -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_continueToShipping'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 35: Click on button continueToShipping - Navigate to page .png')

"Step 36: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Complex Purchase Flow with Multiple Items_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}