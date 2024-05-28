import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.truetest.TrueTestScripts
import katalon.common.actionSequence_1
import com.kms.katalon.core.configuration.RunConfiguration

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 2: Navigate to https://cellphone-staging.aut.katalon.com/"

TrueTestScripts.navigate('/')

"Step 3: Click on link 'Google Pixel' -> Navigate to page 'category/*'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/link_googlePixel'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_googlePixel'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 3: Click on link Google Pixel - Navigate to page category.png')

"Step 4: Click on button"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_category/button_sale20WusbpowerAdapter'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_sale20WusbpowerAdapter'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 4: Click on button.png')

"Step 5: Click on span  -> Navigate to page 'cart'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_category/span_goToCart'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/span_goToCart'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 5: Click on span  - Navigate to page cart.png')

"Step 6: Click on button '+'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_cart/button_i'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_i'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 6: Click on button .png')

"Step 7: Click on button 'Proceed to checkout' -> Navigate to page 'checkout/info'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 7: Click on button Proceed to checkout - Navigate to page checkoutinfo.png')

"Step 8: Click on input field 'email'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_info/input_email'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_email'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 8: Click on input field email.png')

"Step 9: Enter input value in input field 'email'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_info/input_email'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_email'), input_email)

WebUI.takeScreenshot(reportLocation + '/TC11/Step 9: Enter input value in input field email.png')

"Step 10: Click on input field 'receive marketing info'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_info/checkbox_receiveMarketingInfo'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/checkbox_receiveMarketingInfo'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 10: Click on input field receive marketing info.png')

"Step 11: Click on button 'CONTINUE TO SHIPPING'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_info/button_continueToShipping'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_continueToShipping'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 11: Click on button CONTINUE TO SHIPPING.png')

"Step 12: Call function actionSequence 1"

actionSequence_1.execute(data_path_0, Integer.valueOf(index_0))

"Step 13: Click on button 'COMPLETE ORDER' -> Navigate to page 'thank-you/*'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_payment/button_completeOrder'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_completeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 13: Click on button COMPLETE ORDER - Navigate to page thank-you.png')

"Step 14: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC11-Verify Order Placement for Google Pixel Products_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
