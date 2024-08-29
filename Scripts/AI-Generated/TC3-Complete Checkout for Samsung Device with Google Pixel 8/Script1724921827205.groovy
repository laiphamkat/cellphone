import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Hover over item item2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_item2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 2-Hover over item item2.png')

"Step 3: Click on link samsung -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_samsung'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 3-Click on link samsung - Navigate to page category.png')

"Step 4: Click on link googlePixel8 -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_googlePixel8'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 4-Click on link googlePixel8 - Navigate to page product.png')

"Step 5: Click on label 512Gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_512Gb'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 5-Click on label 512Gb.png')

"Step 6: Click on label blue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_blue'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 6-Click on label blue.png')

"Step 7: Click on button buy2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 7-Click on button buy2.png')

"Step 8: Hover over link cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_product/link_cart'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 8-Hover over link cart.png')

"Step 9: Click on span shoppingCart -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/span_shoppingCart'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 9-Click on span shoppingCart - Navigate to page cart.png')

"Step 10: Click on button proceedToCheckout -> Navigate to page 'checkout/payment'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 10-Click on button proceedToCheckout - Navigate to page checkoutpayment.png')

"Step 11: Click on button completeOrder -> Navigate to page 'thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_completeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 11-Click on button completeOrder - Navigate to page thank-you.png')

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Complete Checkout for Samsung Device with Google Pixel 8_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}