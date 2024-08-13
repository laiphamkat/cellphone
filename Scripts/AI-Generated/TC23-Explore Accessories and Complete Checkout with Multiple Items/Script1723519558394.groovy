import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to"

TrueTestScripts.navigate("")

"Step 2: Hover over item accessories"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_home/item_phone_15'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 2-Hover over item accessories.png')

"Step 3: Click on link samsungPowerAndCables -> Navigate to page 'category/power-and-cables'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_samsungPowerAndCables'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 3-Click on link samsungPowerAndCables - Navigate to page categorypower-and-cables.png')

"Step 4: Click on link goToCart -> Navigate to page 'cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/power-and-cables?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_power_and_cables/link_goToCart'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 4-Click on link goToCart - Navigate to page cart.png')

"Step 5: Click on button increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_increased_5"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_increased_5', ['button_increased_class': button_increased_class, 'button_increased_nthChild': button_increased_nthChild, 'button_increased_internalRoleButtonName': button_increased_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 5-Click on button increased.png')

"Step 6: Click on button increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_increased_5"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_increased_5', ['button_increased_class': button_increased_class, 'button_increased_nthChild': button_increased_nthChild, 'button_increased_internalRoleButtonName': button_increased_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 6-Click on button increased.png')

"Step 7: Click on button proceedToCheckout -> Navigate to page 'checkout/payment'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 7-Click on button proceedToCheckout - Navigate to page checkoutpayment.png')

"Step 8: Click on button completeOrder -> Navigate to page 'thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_completeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 8-Click on button completeOrder - Navigate to page thank-you.png')

"Step 9: Hover over item accessories"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/thank-you/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_thank_you/item_accessories'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 9-Hover over item accessories.png')

"Step 10: Click on link apple -> Navigate to page 'category/chekhly-na-iphone'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/thank-you/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_thank_you/link_apple'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 10-Click on link apple - Navigate to page categorychekhly-na-iphone.png')

"Step 11: Hover over item phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/chekhly-na-iphone?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_category_chekhly_na_iphone/item_phone'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 11-Hover over item phone.png')

"Step 12: Click on link apple -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/chekhly-na-iphone?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_chekhly_na_iphone/link_apple'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 12-Click on link apple - Navigate to page .png')

"Step 13: Click on button addToCartNewiPhone15Plus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_addToCartSamsungGalaxyS23_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_addToCartSamsungGalaxyS23_1', ['button_addToCartSamsungGalaxyS23_class': button_addToCartSamsungGalaxyS23_class, 'button_addToCartSamsungGalaxyS23_internalHasText': button_addToCartSamsungGalaxyS23_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 13-Click on button addToCartNewiPhone15Plus.png')

"Step 14: Click on label 256Gb2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_yellow1_6"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_yellow1_6', ['label_yellow1_for': label_yellow1_for, 'label_yellow1_internalText': label_yellow1_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 14-Click on label 256Gb2.png')

"Step 15: Click on label yellow1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_yellow1_7"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_yellow1_7', ['label_yellow1_for': label_yellow1_for, 'label_yellow1_internalText': label_yellow1_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 15-Click on label yellow1.png')

"Step 16: Click on button buy2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_buy2'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 16-Click on button buy2.png')

"Step 17: Click on link goToCart -> Navigate to page 'cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_goToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_goToCart', ['link_goToCart_internalRoleLinkName': link_goToCart_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 17-Click on link goToCart - Navigate to page cart.png')

"Step 18: Click on button increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_increased_5"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_increased_5', ['button_increased_class': button_increased_class, 'button_increased_nthChild': button_increased_nthChild, 'button_increased_internalRoleButtonName': button_increased_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 18-Click on button increased.png')

"Step 19: Hover over item phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/item_phone_4"
WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_cart/item_phone_4', ['item_phone_nth': item_phone_nth]))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 19-Hover over item phone.png')

"Step 20: Click on link apple2 -> Navigate to page 'category/apple'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_apple2'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 20-Click on link apple2 - Navigate to page categoryapple.png')

"Step 21: Click on button addToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_apple/button_addToCart_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_apple/button_addToCart_1', ['button_addToCart_class': button_addToCart_class, 'button_addToCart_internalHasText': button_addToCart_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 21-Click on button addToCart.png')

"Step 22: Click on label 1Tb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_apple/label_yellow1_6"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_apple/label_yellow1_6', ['label_yellow1_for': label_yellow1_for, 'label_yellow1_internalText': label_yellow1_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 22-Click on label 1Tb.png')

"Step 23: Click on label yellow1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_apple/label_yellow1_7"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_apple/label_yellow1_7', ['label_yellow1_for': label_yellow1_for, 'label_yellow1_internalText': label_yellow1_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 23-Click on label yellow1.png')

"Step 24: Click on button buy2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_apple/button_buy2'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 24-Click on button buy2.png')

"Step 25: Click on link goToCart -> Navigate to page 'cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_apple/link_goToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_apple/link_goToCart', ['link_goToCart_internalRoleLinkName': link_goToCart_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 25-Click on link goToCart - Navigate to page cart.png')

"Step 26: Click on button increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_increased_6"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_increased_6', ['button_increased_class': button_increased_class, 'button_increased_nthChild': button_increased_nthChild, 'button_increased_internalRoleButtonName': button_increased_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 26-Click on button increased.png')

"Step 27: Click on button proceedToCheckout -> Navigate to page 'checkout/info'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 27-Click on button proceedToCheckout - Navigate to page checkoutinfo.png')

"Step 28: Click on link backToTheCart -> Navigate to page 'cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/link_backToTheCart'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 28-Click on link backToTheCart - Navigate to page cart.png')

"Step 29: Hover over item phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/item_phone_5"
WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_cart/item_phone_5', ['item_phone_nth': item_phone_nth]))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 29-Hover over item phone.png')

"Step 30: Click on link apple2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_apple2'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 30-Click on link apple2.png')

"Step 31: Click on link apple2 -> Navigate to page 'category/apple'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_apple2'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 31-Click on link apple2 - Navigate to page categoryapple.png')

"Step 32: Click on button bestChoiceHotNew"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_apple/button_newIphone15Plus_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_apple/button_newIphone15Plus_1', ['button_newIphone15Plus_class': button_newIphone15Plus_class, 'button_newIphone15Plus_internalHasText': button_newIphone15Plus_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 32-Click on button bestChoiceHotNew.png')

"Step 33: Click on button bestChoiceHotNew"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_apple/button_newIphone15Plus_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_apple/button_newIphone15Plus_1', ['button_newIphone15Plus_class': button_newIphone15Plus_class, 'button_newIphone15Plus_internalHasText': button_newIphone15Plus_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 33-Click on button bestChoiceHotNew.png')

"Step 34: Click on label 1Tb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_apple/label_yellow1_7"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_apple/label_yellow1_7', ['label_yellow1_for': label_yellow1_for, 'label_yellow1_internalText': label_yellow1_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 34-Click on label 1Tb.png')

"Step 35: Click on label 1Tb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_apple/label_yellow1_7"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_apple/label_yellow1_7', ['label_yellow1_for': label_yellow1_for, 'label_yellow1_internalText': label_yellow1_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 35-Click on label 1Tb.png')

"Step 36: Click on label pink"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_apple/label_pink_4"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_apple/label_pink_4', ['label_pink_for': label_pink_for, 'label_pink_internalText': label_pink_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 36-Click on label pink.png')

"Step 37: Click on label pink"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_apple/label_pink_5"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_apple/label_pink_5', ['label_pink_for': label_pink_for, 'label_pink_internalText': label_pink_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 37-Click on label pink.png')

"Step 38: Click on button dialogButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_apple/button_object_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_apple/button_object_1', ['button_object_internalRoleButtonName': button_object_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 38-Click on button dialogButton.png')

"Step 39: Click on button dialogButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_apple/button_object_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_apple/button_object_1', ['button_object_internalRoleButtonName': button_object_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 39-Click on button dialogButton.png')

"Step 40: Click on link goToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_apple/link_goToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_apple/link_goToCart', ['link_goToCart_internalRoleLinkName': link_goToCart_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 40-Click on link goToCart.png')

"Step 41: Click on link goToCart -> Navigate to page 'cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_apple/link_goToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_apple/link_goToCart', ['link_goToCart_internalRoleLinkName': link_goToCart_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 41-Click on link goToCart - Navigate to page cart.png')

"Step 42: Click on button increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_increased_7"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_increased_7', ['button_increased_class': button_increased_class, 'button_increased_nthChild': button_increased_nthChild, 'button_increased_internalRoleButtonName': button_increased_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 42-Click on button increased.png')

"Step 43: Click on button increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_increased_8"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_increased_8', ['button_increased_class': button_increased_class, 'button_increased_nthChild': button_increased_nthChild, 'button_increased_internalRoleButtonName': button_increased_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 43-Click on button increased.png')

"Step 44: Click on button proceedToCheckout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 44-Click on button proceedToCheckout.png')

"Step 45: Click on button proceedToCheckout -> Navigate to page 'checkout/info'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 45-Click on button proceedToCheckout - Navigate to page checkoutinfo.png')

"Step 46: Hover over div emailMeWithNews"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_info/div_emailMeWithNews'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 46-Hover over div emailMeWithNews.png')

"Step 47: Click on input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_email'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 47-Click on input email.png')

"Step 48: Enter input value in input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_email'), input_email)

WebUI.takeScreenshot(reportLocation + '/TC23/Step 48-Enter input value in input email.png')

"Step 49: Click on button continueToShipping -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_continueToShipping'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 49-Click on button continueToShipping - Navigate to page .png')

"Step 50: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC23-Explore Accessories and Complete Checkout with Multiple Items_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}