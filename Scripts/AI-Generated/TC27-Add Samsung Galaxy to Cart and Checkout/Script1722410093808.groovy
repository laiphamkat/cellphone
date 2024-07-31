import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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

WebUI.takeScreenshot(reportLocation + '/TC27/Step 2: Hover over item item.png')

"Step 3: Click on link samsung -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_samsung'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 3: Click on link samsung - Navigate to page category.png')

"Step 4: Click on link googlePixel7Pro -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_category/link_googlePixel7Pro'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 4: Click on link googlePixel7Pro - Navigate to page product.png')

"Step 5: Click on label 256Gb2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_product/label_256Gb2', ['internalTextVariable': label_256Gb2_internalTextVariable, 'forVariable': label_256Gb2_forVariable]))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 5: Click on label 256Gb2.png')

"Step 6: Click on label 256Gb2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_product/label_256Gb2', ['internalTextVariable': label_256Gb2_internalTextVariable, 'forVariable': label_256Gb2_forVariable]))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 6: Click on label 256Gb2.png')

"Step 7: Hover over div productsSlider"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Parameterized Objects/Page_product/div_productsSlider', ['divNthChildIndex': div_productsSlider_divNthChildIndex]))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 7: Hover over div productsSlider.png')

"Step 8: Click on button addToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_addToCart_1'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 8: Click on button addToCart.png')

"Step 9: Click on label gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_product/label_gb', ['internalTextVariable': label_gb_internalTextVariable, 'forVariable': label_gb_forVariable]))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 9: Click on label gb.png')

"Step 10: Click on label gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_product/label_gb', ['internalTextVariable': label_gb_internalTextVariable, 'forVariable': label_gb_forVariable]))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 10: Click on label gb.png')

"Step 11: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy_1'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 11: Click on button buy.png')

"Step 12: Click on link goToCart -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_goToCart'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 12: Click on link goToCart - Navigate to page cart.png')

"Step 13: Click on button increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_cart/button_increased', ['classVariable': button_increased_classVariable]))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 13: Click on button increased.png')

"Step 14: Click on button proceedToCheckout -> Navigate to page 'checkout/info'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 14: Click on button proceedToCheckout - Navigate to page checkoutinfo.png')

"Step 15: Hover over div emailMeWithNews"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_info/div_emailMeWithNews'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 15: Hover over div emailMeWithNews.png')

"Step 16: Click on input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_email'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 16: Click on input email.png')

"Step 17: Enter input value in input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_email'), var_1_input_email)

WebUI.takeScreenshot(reportLocation + '/TC27/Step 17: Enter input value in input email.png')

"Step 18: Click on button continueToShipping -> Navigate to page 'checkout/shipping-address'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_continueToShipping'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 18: Click on button continueToShipping - Navigate to page checkoutshipping-address.png')

"Step 19: Hover over div element"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_element'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 19: Hover over div element.png')

"Step 20: Click on input shippingAddressFirstName -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressFirstName'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 20: Click on input shippingAddressFirstName - Navigate to page .png')

"Step 21: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC27-Add Samsung Galaxy to Cart and Checkout_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}