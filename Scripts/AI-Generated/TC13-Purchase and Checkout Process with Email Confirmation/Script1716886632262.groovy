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

"Step 3: Hover over list item"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/item_phone'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_phone'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 3: Hover over list item.png')

"Step 4: Click on link 'Apple' -> Navigate to page 'category/*'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/link_apple_1'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_apple_1'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 4: Click on link Apple - Navigate to page category.png')

"Step 5: Click on link 'New!' -> Navigate to page 'product/*'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_category/link_iPhone15PlusNew'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_iPhone15PlusNew'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 5: Click on link New - Navigate to page product.png')

"Step 6: Click on label"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_product/label_256Gb2'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_256Gb2'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 6: Click on label.png')

"Step 7: Click on label"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_product/label_pink'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_pink'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 7: Click on label.png')

"Step 8: Click on button 'Buy'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_product/button_buy'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 8: Click on button Buy.png')

"Step 9: Click on link '1' -> Navigate to page 'cart'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_product/link_goToCart'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_goToCart'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 9: Click on link 1 - Navigate to page cart.png')

"Step 10: Click on button 'Proceed to checkout' -> Navigate to page 'checkout/info'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 10: Click on button Proceed to checkout - Navigate to page checkoutinfo.png')

"Step 11: Click on input field 'email'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_info/input_email'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_email'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 11: Click on input field email.png')

"Step 12: Enter input value in input field 'email'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_info/input_email'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_email'), input_email)

WebUI.takeScreenshot(reportLocation + '/TC13/Step 12: Enter input value in input field email.png')

"Step 13: Click on input field 'receive marketing info'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_info/checkbox_receiveMarketingInfo'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/checkbox_receiveMarketingInfo'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 13: Click on input field receive marketing info.png')

"Step 14: Click on button 'CONTINUE TO SHIPPING'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_info/button_continueToShipping'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_continueToShipping'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 14: Click on button CONTINUE TO SHIPPING.png')

"Step 15: Call function actionSequence 1"

actionSequence_1.execute(data_path_0, Integer.valueOf(index_0))

"Step 16: Click on button 'COMPLETE ORDER' -> Navigate to page 'thank-you/*'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_payment/button_completeOrder'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_completeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 16: Click on button COMPLETE ORDER - Navigate to page thank-you.png')

"Step 17: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC13-Purchase and Checkout Process with Email Confirmation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
