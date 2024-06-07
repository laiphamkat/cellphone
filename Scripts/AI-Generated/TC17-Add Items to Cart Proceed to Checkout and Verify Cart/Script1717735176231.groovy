import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.common.selectPhoneAndBuyGoToCart
import katalon.truetest.TrueTestScripts
import internal.GlobalVariable
import katalon.common.inputShippingInformationContinueToPayment
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://cellphone-staging.aut.katalon.com/"

TrueTestScripts.navigate('/')

"Step 2: Select phone, buy it, and go to cart"

selectPhoneAndBuyGoToCart.execute()

"Step 3: Click on button proceedToCheckout -> Navigate to page 'checkout/info'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 3: Click on button proceedToCheckout - Navigate to page checkoutinfo.png')

"Step 4: Hover over div emailMeWithNews"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_info/div_emailMeWithNews'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 4: Hover over div emailMeWithNews.png')

"Step 5: Click on input email"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_email'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 5: Click on input email.png')

"Step 6: Enter input value in input email"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_email'), input_email)

WebUI.takeScreenshot(reportLocation + '/TC17/Step 6: Enter input value in input email.png')

"Step 7: Click on button continueToShipping"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_continueToShipping'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 7: Click on button continueToShipping.png')

"Step 8: Input shipping information and continue to payment"

inputShippingInformationContinueToPayment.execute(data_path_0, Integer.valueOf(index_0))

"Step 9: Click on button completeOrder -> Navigate to page 'thank-you/*'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_completeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 9: Click on button completeOrder - Navigate to page thank-you.png')

"Step 10: Hover over item listitem2"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/thank-you/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_thank_you/item_listitem2'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 10: Hover over item listitem2.png')

"Step 11: Click on link apple -> Navigate to page 'category/*'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/thank-you/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_thank_you/link_apple'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 11: Click on link apple - Navigate to page category.png')

"Step 12: Click on button sale20WusbpowerAdapter"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_sale20WusbpowerAdapter'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 12: Click on button sale20WusbpowerAdapter.png')

"Step 13: Click on link goToCart -> Navigate to page 'cart'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_goToCart'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 13: Click on link goToCart - Navigate to page cart.png')

"Step 14: Click on button proceedToCheckout -> Navigate to page 'checkout/info'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 14: Click on button proceedToCheckout - Navigate to page checkoutinfo.png')

"Step 15: Hover over div emailMeWithNews"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_info/div_emailMeWithNews'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 15: Hover over div emailMeWithNews.png')

"Step 16: Click on input email"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_email'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 16: Click on input email.png')

"Step 17: Enter input value in input email"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_email'), input_email_1)

WebUI.takeScreenshot(reportLocation + '/TC17/Step 17: Enter input value in input email.png')

"Step 18: Click on button continueToShipping"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_continueToShipping'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 18: Click on button continueToShipping.png')

"Step 19: Input shipping information and continue to payment"

inputShippingInformationContinueToPayment.execute(data_path_1, Integer.valueOf(index_1))

"Step 20: Click on button completeOrder -> Navigate to page 'thank-you/*'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_completeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 20: Click on button completeOrder - Navigate to page thank-you.png')

"Step 21: Hover over item listitem"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/thank-you/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_thank_you/item_listitem'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 21: Hover over item listitem.png')

"Step 22: Click on link apple2 -> Navigate to page 'category/*'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/thank-you/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_thank_you/link_apple2'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 22: Click on link apple2 - Navigate to page category.png')

"Step 23: Click on button sale20WusbpowerAdapter"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_sale20WusbpowerAdapter'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 23: Click on button sale20WusbpowerAdapter.png')

"Step 24: Click on button newiPhone15Plus"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_newiPhone15Plus'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 24: Click on button newiPhone15Plus.png')

"Step 25: Click on div hotNewBestChoice"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/div_hotNewBestChoice'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 25: Click on div hotNewBestChoice.png')

"Step 26: Click on link iPhone15ProHotNewBest -> Navigate to page 'product/*'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_iPhone15ProHotNewBest'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 26: Click on link iPhone15ProHotNewBest - Navigate to page product.png')

"Step 27: Click on label 512Gb"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_512Gb'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 27: Click on label 512Gb.png')

"Step 28: Click on label blue"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_blue'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 28: Click on label blue.png')

"Step 29: Click on button buyButton"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buyButton'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 29: Click on button buyButton.png')

"Step 30: Click on link goToCart -> Navigate to page 'cart'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_goToCart'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 30: Click on link goToCart - Navigate to page cart.png')

"Step 31: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC17-Add Items to Cart Proceed to Checkout and Verify Cart_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
