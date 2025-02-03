import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.fillShippingAddressDetailsAndContinueToPayment
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

"Step 2: Hover over item object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('Archived/Archived_20250203/Page_home/item_object2'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Hover over item object.png')

"Step 3: Click on link Apple -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20241226/Page_home/link_Apple'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on link Apple - Navigate to page cart.png')

"Step 4: Click on button quantityAdjustment (IncreaseQuantity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20241226/Dynamic Objects/Page_cart/button_quantityAdjustment"
WebUI.enhancedClick(findTestObject('Archived/Archived_20241226/Dynamic Objects/Page_cart/button_quantityAdjustment', ['button_quantityAdjustment_nthChild': button_quantityAdjustment_nthChild, 'button_quantityAdjustment_class': button_quantityAdjustment_class]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on button quantityAdjustment IncreaseQuantity.png')

"Step 5: Complete shipping address form and proceed to payment"

fillShippingAddressDetailsAndContinueToPayment.execute(data_path_0, Integer.valueOf(index_0))

"Step 6: Click on button CompleteOrder -> Navigate to page 'thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on button CompleteOrder - Navigate to page thank-you.png')

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Complete Order Process with Shipping Information_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}