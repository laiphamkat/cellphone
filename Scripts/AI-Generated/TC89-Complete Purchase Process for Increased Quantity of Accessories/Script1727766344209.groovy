import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.common.fillPersonalDetailsForOrderProcessing
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
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

"Step 2: Hover over item Accessories"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_Accessories'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 2-Hover over item Accessories.png')

"Step 3: Click on link apple -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_apple'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 3-Click on link apple - Navigate to page category.png')

"Step 4: Click on link productAccessory (20WUSBAdapter) -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_productAccessory"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_productAccessory', ['link_productAccessory_class': link_productAccessory_class, 'link_productAccessory_internalRoleLinkName': link_productAccessory_internalRoleLinkName, 'link_productAccessory_product_id': link_productAccessory_product_id]))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 4-Click on link productAccessory 20WUSBAdapter - Navigate to page product.png')

"Step 5: Click on button increased2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_increased2'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 5-Click on button increased2.png')

"Step 6: Click on button increased2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_increased2'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 6-Click on button increased2.png')

"Step 7: Hover over link GoToCart3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_product/link_GoToCart3'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 7-Hover over link GoToCart3.png')

"Step 8: Click on span dynamicObject (object) -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/span_dynamicObject', ['span_dynamicObject_internalRoleLinkName': span_dynamicObject_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 8-Click on span dynamicObject object - Navigate to page cart.png')

"Step 9: Click on button ProceedToCheckout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 9-Click on button ProceedToCheckout.png')

"Step 10: Fill out personal details for order processing"

fillPersonalDetailsForOrderProcessing.execute(data_path_0, Integer.valueOf(index_0))

"Step 11: Click on button CompleteOrder -> Navigate to page 'thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 11-Click on button CompleteOrder - Navigate to page thank-you.png')

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC89-Complete Purchase Process for Increased Quantity of Accessories_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}