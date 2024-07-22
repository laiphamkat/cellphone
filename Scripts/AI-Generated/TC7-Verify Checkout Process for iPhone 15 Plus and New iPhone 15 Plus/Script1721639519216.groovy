import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

"Step 2: Click on button newiPhone15Plus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_newiPhone15Plus'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 2: Click on button newiPhone15Plus.png')

"Step 3: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 3: Click on div object.png')

"Step 4: Click on label 256Gb2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/label_256Gb2', ['forVariable': GlobalVariable.label_256Gb2_forVariable, 'internalTextVariable': GlobalVariable.label_256Gb2_internalTextVariable]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 4: Click on label 256Gb2.png')

"Step 5: Click on label 256Gb2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/label_256Gb2', ['forVariable': GlobalVariable.label_256Gb2_forVariable, 'internalTextVariable': GlobalVariable.label_256Gb2_internalTextVariable]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 5: Click on label 256Gb2.png')

"Step 6: Click on button buy2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_buy2'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 6: Click on button buy2.png')

"Step 7: Hover over item phoneAppleSamsungGooglePixel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_phoneAppleSamsungGooglePixel'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 7: Hover over item phoneAppleSamsungGooglePixel.png')

"Step 8: Click on link samsung -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_samsung', ['internalRoleLinkNameVariable': GlobalVariable.link_samsung_internalRoleLinkNameVariable, 'nthChildIndex': GlobalVariable.link_samsung_nthChildIndex]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 8: Click on link samsung - Navigate to page category.png')

"Step 9: Click on button newiPhone15Plus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_newiPhone15Plus', ['internalHasTextVariable': GlobalVariable.button_newiPhone15Plus_internalHasTextVariable, 'classVariable': GlobalVariable.button_newiPhone15Plus_classVariable]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 9: Click on button newiPhone15Plus.png')

"Step 10: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 10: Click on div object.png')

"Step 11: Click on label 1Tb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/label_1Tb', ['forVariable': GlobalVariable.label_1Tb_forVariable, 'internalTextVariable': GlobalVariable.label_1Tb_internalTextVariable]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 11: Click on label 1Tb.png')

"Step 12: Click on label 1Tb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/label_1Tb', ['forVariable': GlobalVariable.label_1Tb_forVariable, 'internalTextVariable': GlobalVariable.label_1Tb_internalTextVariable]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 12: Click on label 1Tb.png')

"Step 13: Click on button buy2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_buy2'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 13: Click on button buy2.png')

"Step 14: Click on link goToCart -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_goToCart', ['internalRoleLinkNameIndex': GlobalVariable.link_goToCart_internalRoleLinkNameIndex]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 14: Click on link goToCart - Navigate to page cart.png')

"Step 15: Click on button increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_increased', ['classVariable': GlobalVariable.button_increased_classVariable, 'nthIndex': GlobalVariable.button_increased_nthIndex]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 15: Click on button increased.png')

"Step 16: Click on button remove"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_remove'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 16: Click on button remove.png')

"Step 17: Click on button proceedToCheckout -> Navigate to page 'checkout/info'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 17: Click on button proceedToCheckout - Navigate to page checkoutinfo.png')

"Step 18: Click on link backToTheCart -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/link_backToTheCart'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 18: Click on link backToTheCart - Navigate to page cart.png')

"Step 19: Click on div cartItemRow"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/div_cartItemRow'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 19: Click on div cartItemRow.png')

"Step 20: Click on div cartItemRow"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/div_cartItemRow'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 20: Click on div cartItemRow.png')

"Step 21: Click on button increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_increased', ['classVariable': GlobalVariable.button_increased_classVariable, 'nthIndex': GlobalVariable.button_increased_nthIndex]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 21: Click on button increased.png')

"Step 22: Click on button increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_increased', ['classVariable': GlobalVariable.button_increased_classVariable, 'nthIndex': GlobalVariable.button_increased_nthIndex]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 22: Click on button increased.png')

"Step 23: Hover over item phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_cart/item_phone', ['nthIndex': GlobalVariable.item_phone_nthIndex]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 23: Hover over item phone.png')

"Step 24: Click on link apple"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_apple'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 24: Click on link apple.png')

"Step 25: Click on link apple -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_apple'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 25: Click on link apple - Navigate to page category.png')

"Step 26: Click on link goToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_goToCart', ['internalRoleLinkNameIndex': GlobalVariable.link_goToCart_internalRoleLinkNameIndex]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 26: Click on link goToCart.png')

"Step 27: Click on link goToCart -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_goToCart', ['internalRoleLinkNameIndex': GlobalVariable.link_goToCart_internalRoleLinkNameIndex]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 27: Click on link goToCart - Navigate to page .png')

"Step 28: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC7-Verify Checkout Process for iPhone 15 Plus and New iPhone 15 Plus_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}