import katalon.common.fillShippingAddressAndProceedToPayment
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
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

"Step 1: Navigate to https://cellphone-staging.aut.katalon.com/"

TrueTestScripts.navigate('/')

"Step 2: Hover over list item"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_phone'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 3: Hover over list item.png')

"Step 3: Click on link 'Apple' -> Navigate to page 'category/*'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_apple2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 4: Click on link Apple - Navigate to page category.png')

"Step 4: Click on input field 'price min'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/input_priceMin'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 5: Click on input field price min.png')

"Step 5: Click on input field 'price min'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/input_priceMin'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 6: Click on input field price min.png')

"Step 6: Click on button"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_hotNewiPhone15'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 7: Click on button.png')

"Step 7: Click on label"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/label_256Gb'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 8: Click on label.png')

"Step 8: Click on label"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/label_yellow'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 9: Click on label.png')

"Step 9: Click on button 'Buy'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_buy2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 10: Click on button Buy.png')

"Step 10: Click on link 'Go to cart' -> Navigate to page 'cart'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_goToCart1'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 11: Click on link Go to cart - Navigate to page cart.png')

"Step 11: Click on button 'Proceed to checkout' -> Navigate to page 'checkout/info'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 12: Click on button Proceed to checkout - Navigate to page checkoutinfo.png')

"Step 12: Hover over div"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_info/div_emailMeWithNews'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 13: Hover over div.png')

"Step 13: Click on input field 'email'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_email'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 14: Click on input field email.png')

"Step 14: Enter input value in input field 'email'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_email'), input_email)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 15: Enter input value in input field email.png')

"Step 15: Click on div"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/div_email'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 16: Click on div.png')

"Step 16: Hover over div"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_info/div_emailMeWithNews'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 17: Hover over div.png')

"Step 17: Click on input field 'email'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_email'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 18: Click on input field email.png')

"Step 18: Enter input value in input field 'email'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_email'), input_email_1)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 19: Enter input value in input field email.png')

"Step 19: Click on button 'CONTINUE TO SHIPPING'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_continueToShipping'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 20: Click on button CONTINUE TO SHIPPING.png')

"Step 20: Fill shipping address details and proceed to payment"

fillShippingAddressAndProceedToPayment.execute(data_path_0, Integer.valueOf(index_0))

"Step 21: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Purchase Apple Product within Price Range_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
