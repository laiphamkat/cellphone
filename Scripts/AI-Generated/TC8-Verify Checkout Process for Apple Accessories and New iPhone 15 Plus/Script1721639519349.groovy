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

"Step 2: Hover over item phoneAppleSamsungGooglePixel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_phoneAppleSamsungGooglePixel'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 2: Hover over item phoneAppleSamsungGooglePixel.png')

"Step 3: Click on link samsung -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_samsung', ['internalRoleLinkNameVariable': GlobalVariable.link_samsung_internalRoleLinkNameVariable, 'nthChildIndex': GlobalVariable.link_samsung_nthChildIndex]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 3: Click on link samsung - Navigate to page category.png')

"Step 4: Click on link goToCart -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_goToCart', ['internalRoleLinkNameIndex': GlobalVariable.link_goToCart_internalRoleLinkNameIndex]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 4: Click on link goToCart - Navigate to page cart.png')

"Step 5: Click on button increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_increased', ['classVariable': GlobalVariable.button_increased_classVariable, 'nthIndex': GlobalVariable.button_increased_nthIndex]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 5: Click on button increased.png')

"Step 6: Click on button increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_increased', ['classVariable': GlobalVariable.button_increased_classVariable, 'nthIndex': GlobalVariable.button_increased_nthIndex]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 6: Click on button increased.png')

"Step 7: Click on button proceedToCheckout -> Navigate to page 'checkout/payment'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 7: Click on button proceedToCheckout - Navigate to page checkoutpayment.png')

"Step 8: Click on button completeOrder -> Navigate to page 'thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_completeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 8: Click on button completeOrder - Navigate to page thank-you.png')

"Step 9: Hover over item accessories"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/thank-you/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_thank_you/item_accessories'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 9: Hover over item accessories.png')

"Step 10: Click on link apple -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/thank-you/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_thank_you/link_apple'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 10: Click on link apple - Navigate to page category.png')

"Step 11: Hover over item phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_category/item_phone'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 11: Hover over item phone.png')

"Step 12: Click on link apple -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_apple'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 12: Click on link apple - Navigate to page .png')

"Step 13: Click on button addToCartNewiPhone15Plus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_addToCartNewiPhone15Plus'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 13: Click on button addToCartNewiPhone15Plus.png')

"Step 14: Click on label 256Gb2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/label_256Gb2', ['forVariable': GlobalVariable.label_256Gb2_forVariable, 'internalTextVariable': GlobalVariable.label_256Gb2_internalTextVariable]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 14: Click on label 256Gb2.png')

"Step 15: Click on label 256Gb2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/label_256Gb2', ['forVariable': GlobalVariable.label_256Gb2_forVariable, 'internalTextVariable': GlobalVariable.label_256Gb2_internalTextVariable]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 15: Click on label 256Gb2.png')

"Step 16: Click on button buy2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_buy2'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 16: Click on button buy2.png')

"Step 17: Click on link goToCart -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_goToCart', ['internalRoleLinkNameIndex': GlobalVariable.link_goToCart_internalRoleLinkNameIndex]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 17: Click on link goToCart - Navigate to page cart.png')

"Step 18: Click on button increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_increased', ['classVariable': GlobalVariable.button_increased_classVariable, 'nthIndex': GlobalVariable.button_increased_nthIndex]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 18: Click on button increased.png')

"Step 19: Hover over item phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_cart/item_phone', ['nthIndex': GlobalVariable.item_phone_nthIndex]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 19: Hover over item phone.png')

"Step 20: Click on link apple2 -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_apple2'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 20: Click on link apple2 - Navigate to page category.png')

"Step 21: Click on button newiPhone15Plus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_newiPhone15Plus', ['internalHasTextVariable': GlobalVariable.button_newiPhone15Plus_internalHasTextVariable, 'classVariable': GlobalVariable.button_newiPhone15Plus_classVariable]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 21: Click on button newiPhone15Plus.png')

"Step 22: Click on label 1Tb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/label_1Tb', ['forVariable': GlobalVariable.label_1Tb_forVariable, 'internalTextVariable': GlobalVariable.label_1Tb_internalTextVariable]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 22: Click on label 1Tb.png')

"Step 23: Click on label 1Tb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/label_1Tb', ['forVariable': GlobalVariable.label_1Tb_forVariable, 'internalTextVariable': GlobalVariable.label_1Tb_internalTextVariable]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 23: Click on label 1Tb.png')

"Step 24: Click on button buy2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_buy2'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 24: Click on button buy2.png')

"Step 25: Click on link goToCart -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_goToCart', ['internalRoleLinkNameIndex': GlobalVariable.link_goToCart_internalRoleLinkNameIndex]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 25: Click on link goToCart - Navigate to page cart.png')

"Step 26: Click on button increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_increased', ['classVariable': GlobalVariable.button_increased_classVariable, 'nthIndex': GlobalVariable.button_increased_nthIndex]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 26: Click on button increased.png')

"Step 27: Click on button proceedToCheckout -> Navigate to page 'checkout/info'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 27: Click on button proceedToCheckout - Navigate to page checkoutinfo.png')

"Step 28: Click on link backToTheCart -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/link_backToTheCart'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 28: Click on link backToTheCart - Navigate to page cart.png')

"Step 29: Hover over item phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_cart/item_phone', ['nthIndex': GlobalVariable.item_phone_nthIndex]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 29: Hover over item phone.png')

"Step 30: Click on link apple2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_apple2'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 30: Click on link apple2.png')

"Step 31: Click on link apple2 -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_apple2'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 31: Click on link apple2 - Navigate to page category.png')

"Step 32: Click on button productsItemInStock"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_productsItemInStock', ['internalHasTextVariable': GlobalVariable.button_productsItemInStock_internalHasTextVariable, 'classVariable': GlobalVariable.button_productsItemInStock_classVariable]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 32: Click on button productsItemInStock.png')

"Step 33: Click on button productsItemInStock"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_productsItemInStock', ['internalHasTextVariable': GlobalVariable.button_productsItemInStock_internalHasTextVariable, 'classVariable': GlobalVariable.button_productsItemInStock_classVariable]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 33: Click on button productsItemInStock.png')

"Step 34: Click on label 1Tb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/label_1Tb', ['forVariable': GlobalVariable.label_1Tb_forVariable, 'internalTextVariable': GlobalVariable.label_1Tb_internalTextVariable]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 34: Click on label 1Tb.png')

"Step 35: Click on label 1Tb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/label_1Tb', ['forVariable': GlobalVariable.label_1Tb_forVariable, 'internalTextVariable': GlobalVariable.label_1Tb_internalTextVariable]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 35: Click on label 1Tb.png')

"Step 36: Click on label 1Tb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/label_1Tb', ['forVariable': GlobalVariable.label_1Tb_forVariable, 'internalTextVariable': GlobalVariable.label_1Tb_internalTextVariable]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 36: Click on label 1Tb.png')

"Step 37: Click on label 1Tb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/label_1Tb', ['forVariable': GlobalVariable.label_1Tb_forVariable, 'internalTextVariable': GlobalVariable.label_1Tb_internalTextVariable]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 37: Click on label 1Tb.png')

"Step 38: Click on button dialogButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_dialogButton'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 38: Click on button dialogButton.png')

"Step 39: Click on button dialogButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_dialogButton'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 39: Click on button dialogButton.png')

"Step 40: Click on link goToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_goToCart', ['internalRoleLinkNameIndex': GlobalVariable.link_goToCart_internalRoleLinkNameIndex]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 40: Click on link goToCart.png')

"Step 41: Click on link goToCart -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_goToCart', ['internalRoleLinkNameIndex': GlobalVariable.link_goToCart_internalRoleLinkNameIndex]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 41: Click on link goToCart - Navigate to page cart.png')

"Step 42: Click on button increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_increased', ['classVariable': GlobalVariable.button_increased_classVariable, 'nthIndex': GlobalVariable.button_increased_nthIndex]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 42: Click on button increased.png')

"Step 43: Click on button increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_increased', ['classVariable': GlobalVariable.button_increased_classVariable, 'nthIndex': GlobalVariable.button_increased_nthIndex]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 43: Click on button increased.png')

"Step 44: Click on button proceedToCheckout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 44: Click on button proceedToCheckout.png')

"Step 45: Click on button proceedToCheckout -> Navigate to page 'checkout/info'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 45: Click on button proceedToCheckout - Navigate to page checkoutinfo.png')

"Step 46: Hover over div emailMeWithNews"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_info/div_emailMeWithNews'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 46: Hover over div emailMeWithNews.png')

"Step 47: Click on input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_email'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 47: Click on input email.png')

"Step 48: Enter input value in input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_email'), var_1_input_email)

WebUI.takeScreenshot(reportLocation + '/TC8/Step 48: Enter input value in input email.png')

"Step 49: Click on button continueToShipping -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_continueToShipping'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 49: Click on button continueToShipping - Navigate to page .png')

"Step 50: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC8-Verify Checkout Process for Apple Accessories and New iPhone 15 Plus_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}