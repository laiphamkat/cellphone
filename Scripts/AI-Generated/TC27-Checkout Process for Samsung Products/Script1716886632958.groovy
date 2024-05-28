import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import katalon.common.actionSequence_3
import katalon.common.actionSequence_4
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.truetest.TrueTestScripts
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

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/item_accessories'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_accessories'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 3: Hover over list item.png')

"Step 4: Click on link 'Samsung' -> Navigate to page 'category/*'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/link_samsung_1'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_samsung_1'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 4: Click on link Samsung - Navigate to page category.png')

"Step 5: Click on list"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_category/list_breadcrumb'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/list_breadcrumb'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 5: Click on list.png')

"Step 6: Click on link '1' -> Navigate to page 'cart'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_category/link_goToCart'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_goToCart'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 6: Click on link 1 - Navigate to page cart.png')

"Step 7: Click on button 'Proceed to checkout' -> Navigate to page 'checkout/info'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 7: Click on button Proceed to checkout - Navigate to page checkoutinfo.png')

"Step 8: Click on input field 'email'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_info/input_email'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_email'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 8: Click on input field email.png')

"Step 9: Enter input value in input field 'email'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_info/input_email'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_email'), input_email)

WebUI.takeScreenshot(reportLocation + '/TC27/Step 9: Enter input value in input field email.png')

"Step 10: Click on input field 'receive marketing info'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_info/checkbox_receiveMarketingInfo'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/checkbox_receiveMarketingInfo'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 10: Click on input field receive marketing info.png')

"Step 11: Click on button 'CONTINUE TO SHIPPING'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_info/button_continueToShipping'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_continueToShipping'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 11: Click on button CONTINUE TO SHIPPING.png')

"Step 12: Call function actionSequence 3"

actionSequence_3.execute(data_path_0, Integer.valueOf(index_0))

"Step 13: Click on span  -> Navigate to page 'checkout/info'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/span_completedIcon'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/span_completedIcon'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 13: Click on span  - Navigate to page checkoutinfo.png')

"Step 14: Click on input field 'email'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_info/input_email'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_email'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 14: Click on input field email.png')

"Step 15: Enter input value in input field 'email'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_info/input_email'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_email'), input_email_1)

WebUI.takeScreenshot(reportLocation + '/TC27/Step 15: Enter input value in input field email.png')

"Step 16: Click on input field 'receive marketing info'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_info/checkbox_receiveMarketingInfo'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/checkbox_receiveMarketingInfo'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 16: Click on input field receive marketing info.png')

"Step 17: Click on button 'CONTINUE TO SHIPPING'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_info/button_continueToShipping'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_continueToShipping'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 17: Click on button CONTINUE TO SHIPPING.png')

"Step 18: Call function actionSequence 3"

actionSequence_3.execute(data_path_1, Integer.valueOf(index_1))

"Step 19: Click on button 'Contact Info'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/button_contactInfo'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/button_contactInfo'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 19: Click on button Contact Info.png')

"Step 20: Call function actionSequence 4"

actionSequence_4.execute(data_path_2, Integer.valueOf(index_2))

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
