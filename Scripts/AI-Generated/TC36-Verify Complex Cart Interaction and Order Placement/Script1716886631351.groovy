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

"Step 3: Click on svg"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/svg_productsSliderNext'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/svg_productsSliderNext'))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 3: Click on svg.png')

"Step 4: Click on svg"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/svg_productsSliderNext'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/svg_productsSliderNext'))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 4: Click on svg.png')

"Step 5: Click on svg"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/svg_productsSliderNext'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/svg_productsSliderNext'))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 5: Click on svg.png')

"Step 6: Click on svg"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/svg_productsSliderNext'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/svg_productsSliderNext'))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 6: Click on svg.png')

"Step 7: Click on svg"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/svg_productsSliderNext'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/svg_productsSliderNext'))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 7: Click on svg.png')

"Step 8: Click on svg"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/svg_productsSliderNext'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/svg_productsSliderNext'))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 8: Click on svg.png')

"Step 9: Click on svg"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/svg_productsSliderNext'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/svg_productsSliderNext'))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 9: Click on svg.png')

"Step 10: Click on svg"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/svg_productsSliderNext'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/svg_productsSliderNext'))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 10: Click on svg.png')

"Step 11: Click on svg"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/svg_productsSliderNext'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/svg_productsSliderNext'))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 11: Click on svg.png')

"Step 12: Click on svg"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/svg_productsSliderNext'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/svg_productsSliderNext'))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 12: Click on svg.png')

"Step 13: Click on svg"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/svg_productsSliderNext'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/svg_productsSliderNext'))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 13: Click on svg.png')

"Step 14: Click on svg"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/svg_productsSliderNext'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/svg_productsSliderNext'))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 14: Click on svg.png')

"Step 15: Click on svg"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/svg_productsSliderNext'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/svg_productsSliderNext'))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 15: Click on svg.png')

"Step 16: Click on button 'Add to cart'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/button_addToCart'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_addToCart'))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 16: Click on button Add to cart.png')

"Step 17: Click on link 'Place an order' -> Navigate to page 'cart'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/link_placeAnOrder'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_placeAnOrder'))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 17: Click on link Place an order - Navigate to page cart.png')

"Step 18: Click on button '+'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_cart/button_i'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_i'))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 18: Click on button .png')

"Step 19: Click on button 'Proceed to checkout' -> Navigate to page 'checkout/info'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 19: Click on button Proceed to checkout - Navigate to page checkoutinfo.png')

"Step 20: Click on input field 'email'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_info/input_email'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_email'))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 20: Click on input field email.png')

"Step 21: Enter input value in input field 'email'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_info/input_email'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_email'), input_email)

WebUI.takeScreenshot(reportLocation + '/TC36/Step 21: Enter input value in input field email.png')

"Step 22: Click on input field 'receive marketing info'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_info/checkbox_receiveMarketingInfo'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/checkbox_receiveMarketingInfo'))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 22: Click on input field receive marketing info.png')

"Step 23: Click on button 'CONTINUE TO SHIPPING'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_info/button_continueToShipping'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_continueToShipping'))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 23: Click on button CONTINUE TO SHIPPING.png')

"Step 24: Call function actionSequence 1"

actionSequence_1.execute(data_path_0, Integer.valueOf(index_0))

"Step 25: Click on button 'COMPLETE ORDER' -> Navigate to page 'thank-you/*'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_payment/button_completeOrder'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_completeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 25: Click on button COMPLETE ORDER - Navigate to page thank-you.png')

"Step 26: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC36-Verify Complex Cart Interaction and Order Placement_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
