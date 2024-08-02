import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
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

"Step 2: Hover over item accessories"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_home/item_accessories'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 2-Hover over item accessories.png')

"Step 3: Click on link categoryChekhlyNaIphone -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_categoryChekhlyNaIphone'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 3-Click on link categoryChekhlyNaIphone - Navigate to page category.png')

"Step 4: Click on link goToCart -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_goToCart', ['class': link_goToCart_class, 'internalRoleLinkName': link_goToCart_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 4-Click on link goToCart - Navigate to page cart.png')

"Step 5: Click on button increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_increased'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 5-Click on button increased.png')

"Step 6: Click on button increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_increased'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 6-Click on button increased.png')

"Step 7: Click on button proceedToCheckout -> Navigate to page 'checkout/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 7-Click on button proceedToCheckout - Navigate to page checkout.png')

"Step 8: Click on button completeOrder -> Navigate to page 'thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_completeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 8-Click on button completeOrder - Navigate to page thank-you.png')

"Step 9: Hover over item accessories"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/thank-you/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_thank_you/item_accessories'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 9-Hover over item accessories.png')

"Step 10: Click on link apple -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/thank-you/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_thank_you/link_apple'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 10-Click on link apple - Navigate to page category.png')

"Step 11: Hover over item accessories"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_category/item_accessories'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 11-Hover over item accessories.png')

"Step 12: Click on link apple -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_apple_1'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 12-Click on link apple - Navigate to page .png')

"Step 13: Click on button addToCartSamsungGalaxyS23"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_addToCartSamsungGalaxyS23', ['class': button_addToCartSamsungGalaxyS23_class, 'internalHasText': button_addToCartSamsungGalaxyS23_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 13-Click on button addToCartSamsungGalaxyS23.png')

"Step 14: Click on label 256Gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_256Gb', ['for': label_256Gb_for, 'internalText': label_256Gb_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 14-Click on label 256Gb.png')

"Step 15: Click on label 256Gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_256Gb', ['for': label_256Gb_for, 'internalText': label_256Gb_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 15-Click on label 256Gb.png')

"Step 16: Click on button buy2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_buy2'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 16-Click on button buy2.png')

"Step 17: Click on link goToCart -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_goToCart', ['internalRoleLinkName': link_goToCart_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 17-Click on link goToCart - Navigate to page cart.png')

"Step 18: Click on button increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_increased'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 18-Click on button increased.png')

"Step 19: Hover over item listitem2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_cart/item_listitem2', ['nth': item_listitem2_nth]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 19-Hover over item listitem2.png')

"Step 20: Click on link apple2 -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_apple2'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 20-Click on link apple2 - Navigate to page category.png')

"Step 21: Click on button newiPhone15Plus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_newiPhone15Plus', ['class': button_newiPhone15Plus_class, 'internalHasText': button_newiPhone15Plus_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 21-Click on button newiPhone15Plus.png')

"Step 22: Click on label 512Gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_512Gb', ['for': label_512Gb_for, 'internalText': label_512Gb_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 22-Click on label 512Gb.png')

"Step 23: Click on label 512Gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_512Gb', ['for': label_512Gb_for, 'internalText': label_512Gb_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 23-Click on label 512Gb.png')

"Step 24: Click on button buy2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_buy2'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 24-Click on button buy2.png')

"Step 25: Click on link goToCart -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_goToCart', ['class': link_goToCart_class, 'internalRoleLinkName': link_goToCart_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 25-Click on link goToCart - Navigate to page cart.png')

"Step 26: Click on button increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_increased'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 26-Click on button increased.png')

"Step 27: Click on button proceedToCheckout -> Navigate to page 'checkout/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 27-Click on button proceedToCheckout - Navigate to page checkout.png')

"Step 28: Click on link backToTheCart -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/link_backToTheCart'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 28-Click on link backToTheCart - Navigate to page cart.png')

"Step 29: Hover over item listitem2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_cart/item_listitem2', ['nth': item_listitem2_nth]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 29-Hover over item listitem2.png')

"Step 30: Click on link apple2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_apple2'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 30-Click on link apple2.png')

"Step 31: Click on link apple2 -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_apple2'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 31-Click on link apple2 - Navigate to page category.png')

"Step 32: Click on button sale20WusbpowerAdapter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_sale20WusbpowerAdapter', ['class': button_sale20WusbpowerAdapter_class, 'internalHasText': button_sale20WusbpowerAdapter_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 32-Click on button sale20WusbpowerAdapter.png')

"Step 33: Click on button sale20WusbpowerAdapter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_sale20WusbpowerAdapter', ['class': button_sale20WusbpowerAdapter_class, 'internalHasText': button_sale20WusbpowerAdapter_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 33-Click on button sale20WusbpowerAdapter.png')

"Step 34: Click on label 512Gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_512Gb', ['for': label_512Gb_for, 'internalText': label_512Gb_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 34-Click on label 512Gb.png')

"Step 35: Click on label 512Gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_512Gb', ['for': label_512Gb_for, 'internalText': label_512Gb_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 35-Click on label 512Gb.png')

"Step 36: Click on label 512Gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_512Gb', ['for': label_512Gb_for, 'internalText': label_512Gb_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 36-Click on label 512Gb.png')

"Step 37: Click on label 512Gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_512Gb', ['for': label_512Gb_for, 'internalText': label_512Gb_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 37-Click on label 512Gb.png')

"Step 38: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_object', ['internalRoleButtonName': button_object_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 38-Click on button object.png')

"Step 39: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_object', ['internalRoleButtonName': button_object_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 39-Click on button object.png')

"Step 40: Click on link goToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_goToCart', ['class': link_goToCart_class, 'internalRoleLinkName': link_goToCart_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 40-Click on link goToCart.png')

"Step 41: Click on link goToCart -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_goToCart', ['class': link_goToCart_class, 'internalRoleLinkName': link_goToCart_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 41-Click on link goToCart - Navigate to page cart.png')

"Step 42: Click on button increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_increased'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 42-Click on button increased.png')

"Step 43: Click on button increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_increased'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 43-Click on button increased.png')

"Step 44: Click on button proceedToCheckout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 44-Click on button proceedToCheckout.png')

"Step 45: Click on button proceedToCheckout -> Navigate to page 'checkout/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 45-Click on button proceedToCheckout - Navigate to page checkout.png')

"Step 46: Hover over div emailMeWithNews"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_emailMeWithNews'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 46-Hover over div emailMeWithNews.png')

"Step 47: Click on input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_email'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 47-Click on input email.png')

"Step 48: Enter input value in input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_email'), var_1_input_email)

WebUI.takeScreenshot(reportLocation + '/TC14/Step 48-Enter input value in input email.png')

"Step 49: Click on button continueToShipping -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_continueToShipping'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 49-Click on button continueToShipping - Navigate to page .png')

"Step 50: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC14-Purchase Accessories and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}