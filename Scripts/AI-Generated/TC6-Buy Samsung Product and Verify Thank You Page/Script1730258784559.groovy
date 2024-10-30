import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.common.completeCheckoutShippingInformation
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Hover over item object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_object'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 2-Hover over item object.png')

"Step 3: Click on link samsung -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_samsung_1'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 3-Click on link samsung - Navigate to page category.png')

"Step 4: Click on link productDetails (samsungGalaxyS23Ultra) -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_productDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_productDetails', ['link_productDetails_class': link_productDetails_class, 'link_productDetails_product_id': link_productDetails_product_id]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 4-Click on link productDetails samsungGalaxyS23Ultra - Navigate to page product.png')

"Step 5: Click on button Buy2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_Buy2'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 5-Click on button Buy2.png')

"Step 6: Hover over link GoToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_product/link_GoToCart'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 6-Hover over link GoToCart.png')

"Step 7: Click on span object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/span_object'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 7-Click on span object.png')

"Step 8: Fill out shipping information and proceed to payment"

completeCheckoutShippingInformation.execute(data_path_0, Integer.valueOf(index_0))

"Step 9: Click on button CompleteOrder -> Navigate to page 'thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 9-Click on button CompleteOrder - Navigate to page thank-you.png')

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Buy Samsung Product and Verify Thank You Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}