import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.common.completePurchaseAndContinueToShipping
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

"Step 2: Click on button newiPhone15Plus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_home/button_newiPhone15Plus', ['classVariable': button_newiPhone15Plus_classVariable, 'internalHasTextVariable': button_newiPhone15Plus_internalHasTextVariable]))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 2: Click on button newiPhone15Plus.png')

"Step 3: Click on label 256Gb2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_home/label_256Gb2', ['internalTextVariable': label_256Gb2_internalTextVariable, 'forVariable': label_256Gb2_forVariable]))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 3: Click on label 256Gb2.png')

"Step 4: Click on label 256Gb2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_home/label_256Gb2', ['internalTextVariable': label_256Gb2_internalTextVariable, 'forVariable': label_256Gb2_forVariable]))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 4: Click on label 256Gb2.png')

"Step 5: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 5: Click on button buy.png')

"Step 6: Click on link placeAnOrder -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_placeAnOrder'))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 6: Click on link placeAnOrder - Navigate to page cart.png')

"Step 7: Click on button proceedToCheckout -> Navigate to page 'checkout/info'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 7: Click on button proceedToCheckout - Navigate to page checkoutinfo.png')

"Step 8: Hover over div emailMeWithNews"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_info/div_emailMeWithNews'))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 8: Hover over div emailMeWithNews.png')

"Step 9: Click on input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_email'))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 9: Click on input email.png')

"Step 10: Enter input value in input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_email'), var_1_input_email)

WebUI.takeScreenshot(reportLocation + '/TC30/Step 10: Enter input value in input email.png')

"Step 11: Click on button continueToShipping"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_continueToShipping'))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 11: Click on button continueToShipping.png')

"Step 12: Fill shipping address details and continue to payment"

fillShippingAddressAndProceedToPayment.execute(data_path_0, Integer.valueOf(index_0))

"Step 13: Click on button completeOrder -> Navigate to page 'thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_completeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 13: Click on button completeOrder - Navigate to page thank-you.png')

"Step 14: Hover over item listitem"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/thank-you/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Parameterized Objects/Page_thank_you/item_listitem', ['nthIndex': item_listitem_nthIndex]))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 14: Hover over item listitem.png')

"Step 15: Click on link phone -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/thank-you/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_thank_you/link_phone'))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 15: Click on link phone - Navigate to page category.png')

"Step 16: Click on div samsung"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/div_samsung'))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 16: Click on div samsung.png')

"Step 17: Click on link samsung"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_samsung'))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 17: Click on link samsung.png')

"Step 18: Click on button sale20WusbtypeCadapter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_category/button_sale20WusbtypeCadapter', ['classVariable': button_sale20WusbtypeCadapter_classVariable, 'internalHasTextVariable': button_sale20WusbtypeCadapter_internalHasTextVariable]))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 18: Click on button sale20WusbtypeCadapter.png')

"Step 19: Click on label 1Tb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_category/label_1Tb', ['internalTextVariable': label_1Tb_internalTextVariable, 'forVariable': label_1Tb_forVariable]))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 19: Click on label 1Tb.png')

"Step 20: Click on label 1Tb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_category/label_1Tb', ['internalTextVariable': label_1Tb_internalTextVariable, 'forVariable': label_1Tb_forVariable]))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 20: Click on label 1Tb.png')

"Step 21: Select product, go to cart, and fill in shipping details"

completePurchaseAndContinueToShipping.execute(data_path_1, Integer.valueOf(index_1))

"Step 22: Fill shipping address details and continue to payment"

fillShippingAddressAndProceedToPayment.execute(data_path_2, Integer.valueOf(index_2))

"Step 23: Click on button completeOrder -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_completeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 23: Click on button completeOrder - Navigate to page .png')

"Step 24: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC30-Complete Multiple Orders with Shipping Details_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}