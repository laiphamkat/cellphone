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

"Step 1: Navigate to https://cellphone-staging.aut.katalon.com"

TrueTestScripts.navigate('')

"Step 2: Hover over list item"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_phone'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 3: Hover over list item.png')

"Step 3: Click on link 'Phone' -> Navigate to page 'category/*'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_phone'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 4: Click on link Phone - Navigate to page category.png')

"Step 4: Hover over list item"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_category/item_accessories'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 5: Hover over list item.png')

"Step 5: Click on link 'Apple'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_apple'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 6: Click on link Apple.png')

"Step 6: Hover over list item"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_category/item_accessories'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 7: Hover over list item.png')

"Step 7: Click on link 'Accessories'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_accessories2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 8: Click on link Accessories.png')

"Step 8: Click on button 'Add to cart'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_sale20WusbcpowerAdapter'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 9: Click on button Add to cart.png')

"Step 9: Click on link 'Go to cart' -> Navigate to page 'cart'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_goToCart1'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 10: Click on link Go to cart - Navigate to page cart.png')

"Step 10: Click on link 'Go to cart'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_goToCart2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 11: Click on link Go to cart.png')

"Step 11: Fill shipping address details and proceed to payment"

fillShippingAddressAndProceedToPayment.execute(data_path_0, Integer.valueOf(index_0))

"Step 12: Click on button 'COMPLETE ORDER' -> Navigate to page 'thank-you/*'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_completeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 13: Click on button COMPLETE ORDER - Navigate to page thank-you.png')

"Step 13: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Purchase Apple Accessories and Complete Order_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
