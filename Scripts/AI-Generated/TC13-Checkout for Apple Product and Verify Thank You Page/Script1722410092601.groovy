import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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

"Step 2: Hover over item item"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_item'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 2: Hover over item item.png')

"Step 3: Click on link apple -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_home/link_apple', ['nthChildIndex': link_apple_nthChildIndex]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 3: Click on link apple - Navigate to page category.png')

"Step 4: Click on item sale20WusbcpowerAdapter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/item_sale20WusbcpowerAdapter'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 4: Click on item sale20WusbcpowerAdapter.png')

"Step 5: Click on button sale20WusbpowerAdapter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_category/button_sale20WusbpowerAdapter', ['classVariable': button_sale20WusbpowerAdapter_classVariable, 'internalHasTextVariable': button_sale20WusbpowerAdapter_internalHasTextVariable]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 5: Click on button sale20WusbpowerAdapter.png')

"Step 6: Click on link goToCart -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_category/link_goToCart', ['internalRoleLinkNameVariable': link_goToCart_internalRoleLinkNameVariable]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 6: Click on link goToCart - Navigate to page cart.png')

"Step 7: Click on button proceedToCheckout -> Navigate to page 'checkout/info'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 7: Click on button proceedToCheckout - Navigate to page checkoutinfo.png')

"Step 8: Hover over div emailMeWithNews"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_info/div_emailMeWithNews'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 8: Hover over div emailMeWithNews.png')

"Step 9: Click on input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_email'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 9: Click on input email.png')

"Step 10: Enter input value in input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_email'), var_1_input_email)

WebUI.takeScreenshot(reportLocation + '/TC13/Step 10: Enter input value in input email.png')

"Step 11: Click on button continueToShipping"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_continueToShipping'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 11: Click on button continueToShipping.png')

"Step 12: Fill shipping address details and continue to payment"

fillShippingAddressAndProceedToPayment.execute(data_path_0, Integer.valueOf(index_0))

"Step 13: Click on button completeOrder -> Navigate to page 'thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_completeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 13: Click on button completeOrder - Navigate to page thank-you.png')

"Step 14: Hover over item listitem"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/thank-you/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Parameterized Objects/Page_thank_you/item_listitem', ['nthIndex': item_listitem_nthIndex]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 14: Hover over item listitem.png')

"Step 15: Click on link apple2 -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/thank-you/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_thank_you/link_apple2'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 15: Click on link apple2 - Navigate to page category.png')

"Step 16: Hover over item phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Parameterized Objects/Page_category/item_phone', ['internalHasTextVariable': item_phone_internalHasTextVariable]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 16: Hover over item phone.png')

"Step 17: Click on link apple"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_category/link_apple', ['internalRoleLinkNameVariable': link_apple_internalRoleLinkNameVariable, 'nthChildIndex': link_apple_nthChildIndex]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 17: Click on link apple.png')

"Step 18: Click on button sale20WusbtypeCadapter -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_category/button_sale20WusbtypeCadapter', ['classVariable': button_sale20WusbtypeCadapter_classVariable, 'internalHasTextVariable': button_sale20WusbtypeCadapter_internalHasTextVariable]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 18: Click on button sale20WusbtypeCadapter - Navigate to page .png')

"Step 19: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC13-Checkout for Apple Product and Verify Thank You Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}