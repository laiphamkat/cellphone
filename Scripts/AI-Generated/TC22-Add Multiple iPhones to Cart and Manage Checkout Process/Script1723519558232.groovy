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

"Step 2: Click on button newiPhone15Plus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_addToCartBestChoiceIphone_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_addToCartBestChoiceIphone_1', ['button_addToCartBestChoiceIphone_class': button_addToCartBestChoiceIphone_class, 'button_addToCartBestChoiceIphone_internalHasText': button_addToCartBestChoiceIphone_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 2-Click on button newiPhone15Plus.png')

"Step 3: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 3-Click on div object.png')

"Step 4: Click on label 256Gb2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_white_3"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_white_3', ['label_white_for': label_white_for, 'label_white_internalText': label_white_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 4-Click on label 256Gb2.png')

"Step 5: Click on label yellow1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_yellow1_6"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_yellow1_6', ['label_yellow1_for': label_yellow1_for, 'label_yellow1_internalText': label_yellow1_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 5-Click on label yellow1.png')

"Step 6: Click on button buy2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_buy2'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 6-Click on button buy2.png')

"Step 7: Hover over item phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_home/item_phone_15'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 7-Hover over item phone.png')

"Step 8: Click on link apple2 -> Navigate to page 'category/apple'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_apple2'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 8-Click on link apple2 - Navigate to page categoryapple.png')

"Step 9: Click on button newiPhone15Plus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_apple/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_apple/button_addToCart', ['button_addToCart_class': button_addToCart_class, 'button_addToCart_internalHasText': button_addToCart_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 9-Click on button newiPhone15Plus.png')

"Step 10: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_apple/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 10-Click on div object.png')

"Step 11: Click on label 512Gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_apple/label_512Gb_5"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_apple/label_512Gb_5', ['label_512Gb_for': label_512Gb_for, 'label_512Gb_internalText': label_512Gb_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 11-Click on label 512Gb.png')

"Step 12: Click on label yellow1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_apple/label_yellow1_6"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_apple/label_yellow1_6', ['label_yellow1_for': label_yellow1_for, 'label_yellow1_internalText': label_yellow1_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 12-Click on label yellow1.png')

"Step 13: Click on button buy2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_apple/button_buy2'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 13-Click on button buy2.png')

"Step 14: Click on link goToCart -> Navigate to page 'cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_apple/link_goToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_apple/link_goToCart', ['link_goToCart_internalRoleLinkName': link_goToCart_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 14-Click on link goToCart - Navigate to page cart.png')

"Step 15: Click on button increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_increased_5"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_increased_5', ['button_increased_class': button_increased_class, 'button_increased_nthChild': button_increased_nthChild, 'button_increased_internalRoleButtonName': button_increased_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 15-Click on button increased.png')

"Step 16: Click on button remove"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_removeButton_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_removeButton_1', ['button_removeButton_class': button_removeButton_class, 'button_removeButton_nth': button_removeButton_nth]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 16-Click on button remove.png')

"Step 17: Click on button proceedToCheckout -> Navigate to page 'checkout/info'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 17-Click on button proceedToCheckout - Navigate to page checkoutinfo.png')

"Step 18: Click on link backToTheCart -> Navigate to page 'cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/link_backToTheCart'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 18-Click on link backToTheCart - Navigate to page cart.png')

"Step 19: Click on div cartItemRow"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/div_cartItemRow'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 19-Click on div cartItemRow.png')

"Step 20: Click on div cartItemRow"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/div_cartItemRow'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 20-Click on div cartItemRow.png')

"Step 21: Click on button increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_increased_5"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_increased_5', ['button_increased_class': button_increased_class, 'button_increased_nthChild': button_increased_nthChild, 'button_increased_internalRoleButtonName': button_increased_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 21-Click on button increased.png')

"Step 22: Click on button increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_increased_5"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_increased_5', ['button_increased_class': button_increased_class, 'button_increased_nthChild': button_increased_nthChild, 'button_increased_internalRoleButtonName': button_increased_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 22-Click on button increased.png')

"Step 23: Hover over item listitem2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/item_phone_3"
WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_cart/item_phone_3', ['item_phone_nth': item_phone_nth]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 23-Hover over item listitem2.png')

"Step 24: Click on link apple"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_apple'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 24-Click on link apple.png')

"Step 25: Click on link apple -> Navigate to page 'category/chekhly-na-iphone'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_apple'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 25-Click on link apple - Navigate to page categorychekhly-na-iphone.png')

"Step 26: Click on link goToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/chekhly-na-iphone?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_chekhly_na_iphone/link_goToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_chekhly_na_iphone/link_goToCart', ['link_goToCart_class': link_goToCart_class, 'link_goToCart_internalRoleLinkName': link_goToCart_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 26-Click on link goToCart.png')

"Step 27: Click on link goToCart -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/chekhly-na-iphone?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_chekhly_na_iphone/link_goToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_chekhly_na_iphone/link_goToCart', ['link_goToCart_class': link_goToCart_class, 'link_goToCart_internalRoleLinkName': link_goToCart_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 27-Click on link goToCart - Navigate to page .png')

"Step 28: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC22-Add Multiple iPhones to Cart and Manage Checkout Process_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}