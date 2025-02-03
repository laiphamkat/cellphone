import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import archived.archived_20250203.truetest.common.fillShippingDetailsAndCompleteOrder
import archived.archived_20250203.truetest.common.selectProductAndPurchase
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Hover over item object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('Archived/Archived_20250203/Page_home/item_object2'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 2-Hover over item object2.png')

"Step 3: Select product options and complete the purchase"

selectProductAndPurchase.execute(data_path_0, Integer.valueOf(index_0))

"Step 4: Click on link GoToCart -> Navigate to page 'cart#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250203/Page_product/link_GoToCart'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 4-Click on link GoToCart - Navigate to page cartcart.png')

"Step 5: Click on button ProceedToCheckout -> Navigate to page 'checkout info#checkout/info'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_ProceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 5-Click on button ProceedToCheckout - Navigate to page checkout infocheckoutinfo.png')

"Step 6: Hover over div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_info/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 6-Hover over div object.png')

"Step 7: Click on input Email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_Email'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 7-Click on input Email.png')

"Step 8: Enter input value in input Email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_Email'), input_Email)

WebUI.takeScreenshot(reportLocation + '/TC7/Step 8-Enter input value in input Email.png')

"Step 9: Click on button ContinueToShipping"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_ContinueToShipping'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 9-Click on button ContinueToShipping.png')

"Step 10: Hover over div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_info/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 10-Hover over div object.png')

"Step 11: Click on input Email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_Email'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 11-Click on input Email.png')

"Step 12: Enter input value in input Email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_Email'), input_Email_1)

WebUI.takeScreenshot(reportLocation + '/TC7/Step 12-Enter input value in input Email.png')

"Step 13: Click on button ContinueToShipping"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_ContinueToShipping'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 13-Click on button ContinueToShipping.png')

"Step 14: Fill in shipping details and complete the order process"

fillShippingDetailsAndCompleteOrder.execute(data_path_1, Integer.valueOf(index_1))

"Step 15: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC7-Select Product Options and Finalize Purchase from Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}