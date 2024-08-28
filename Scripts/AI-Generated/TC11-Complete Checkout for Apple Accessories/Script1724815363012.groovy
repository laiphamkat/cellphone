import katalon.truetest.TrueTestScripts
import katalon.common.fillShippingDetailsAndContinueToPayment
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Hover over item productCategories (accessories)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_home/item_productCategories'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 2-Hover over item productCategories accessories.png')

"Step 3: Click on link apple -> Navigate to page '/category/chekhly-na-iphone'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_apple'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 3-Click on link apple - Navigate to page categorychekhly-na-iphone.png')

"Step 4: Click on button newIphone15SiliconeCase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/chekhly-na-iphone?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_chekhly_na_iphone/button_newIphone15SiliconeCase'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 4-Click on button newIphone15SiliconeCase.png')

"Step 5: Click on label iphoneAccessories (iphone15Plus)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/chekhly-na-iphone?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_chekhly_na_iphone/label_iphoneAccessories"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_chekhly_na_iphone/label_iphoneAccessories', ['label_iphoneAccessories_for': label_iphoneAccessories_for, 'label_iphoneAccessories_internalText': label_iphoneAccessories_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 5-Click on label iphoneAccessories iphone15Plus.png')

"Step 6: Click on label iphoneAccessories (cypress)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/chekhly-na-iphone?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_chekhly_na_iphone/label_iphoneAccessories"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_chekhly_na_iphone/label_iphoneAccessories', ['label_iphoneAccessories_for': label_iphoneAccessories_for_1, 'label_iphoneAccessories_internalText': label_iphoneAccessories_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 6-Click on label iphoneAccessories cypress.png')

"Step 7: Click on button buy2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/chekhly-na-iphone?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_chekhly_na_iphone/button_buy2'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 7-Click on button buy2.png')

"Step 8: Click on link iphoneAccessories (iphone15ClearCaseWithMagSafe) -> Navigate to page '/product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/chekhly-na-iphone?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_chekhly_na_iphone/link_iphoneAccessories"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_chekhly_na_iphone/link_iphoneAccessories', ['link_iphoneAccessories_class': link_iphoneAccessories_class, 'link_iphoneAccessories_internalRoleLinkName': link_iphoneAccessories_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 8-Click on link iphoneAccessories iphone15ClearCaseWithMagSafe - Navigate to page product.png')

"Step 9: Click on button buy2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy2'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 9-Click on button buy2.png')

"Step 10: Click on link cartNavigation (goToCart) -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/link_cartNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_cartNavigation', ['link_cartNavigation_internalRoleLinkName': link_cartNavigation_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 10-Click on link cartNavigation goToCart - Navigate to page cart.png')

"Step 11: Click on button proceedToCheckout -> Navigate to page '/checkout/info'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 11-Click on button proceedToCheckout - Navigate to page checkoutinfo.png')

"Step 12: Hover over div email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_info/div_email'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 12-Hover over div email.png')

"Step 13: Click on input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_email'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 13-Click on input email.png')

"Step 14: Enter input value in input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_email'), input_email)

WebUI.takeScreenshot(reportLocation + '/TC11/Step 14-Enter input value in input email.png')

"Step 15: Click on button continueToShipping"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_continueToShipping'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 15-Click on button continueToShipping.png')

"Step 16: Fill in shipping details and proceed to payment section"

fillShippingDetailsAndContinueToPayment.execute(data_path_0, Integer.valueOf(index_0))

"Step 17: Click on button completeOrder -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_completeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 17-Click on button completeOrder - Navigate to page .png')

"Step 18: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC11-Complete Checkout for Apple Accessories_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}