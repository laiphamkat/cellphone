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

"Step 3: Click on button"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/button_hotSamsungGalaxyS23'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_hotSamsungGalaxyS23'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 3: Click on button.png')

"Step 4: Click on label"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/label_2'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/label_2'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 4: Click on label.png')

"Step 5: Click on label"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/label_white'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/label_white'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 5: Click on label.png')

"Step 6: Click on label"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/label_black'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/label_black'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 6: Click on label.png')

"Step 7: Click on button 'Buy'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/button_buy'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 7: Click on button Buy.png')

"Step 8: Click on link '1' -> Navigate to page 'cart'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/link_goToCart'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_goToCart'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 8: Click on link 1 - Navigate to page cart.png')

"Step 9: Click on button 'Proceed to checkout' -> Navigate to page 'checkout/info'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 9: Click on button Proceed to checkout - Navigate to page checkoutinfo.png')

"Step 10: Click on input field 'email'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_info/input_email'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_email'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 10: Click on input field email.png')

"Step 11: Enter input value in input field 'email'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_info/input_email'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_email'), input_email)

WebUI.takeScreenshot(reportLocation + '/TC20/Step 11: Enter input value in input field email.png')

"Step 12: Click on input field 'receive marketing info'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_info/checkbox_receiveMarketingInfo'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/checkbox_receiveMarketingInfo'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 12: Click on input field receive marketing info.png')

"Step 13: Click on button 'CONTINUE TO SHIPPING'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_info/button_continueToShipping'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_continueToShipping'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 13: Click on button CONTINUE TO SHIPPING.png')

"Step 14: Call function actionSequence 1"

actionSequence_1.execute(data_path_0, Integer.valueOf(index_0))

"Step 15: Click on input field 'payment method id'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_payment/radio_cashOnDelivery'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/radio_cashOnDelivery'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 15: Click on input field payment method id.png')

"Step 16: Click on button 'COMPLETE ORDER'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_payment/button_completeOrder'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_completeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 16: Click on button COMPLETE ORDER.png')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
