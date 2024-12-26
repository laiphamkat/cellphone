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

"Step 2: Click on button NewIphone15Plus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20241226/Page_home/button_NewIphone15Plus'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 2-Click on button NewIphone15Plus.png')

"Step 3: Click on button purchaseOptions (Increased)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20241226/Dynamic Objects/Page_home/button_purchaseOptions"
WebUI.enhancedClick(findTestObject('Archived/Archived_20241226/Dynamic Objects/Page_home/button_purchaseOptions', ['button_purchaseOptions_internalRoleButtonName': button_purchaseOptions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 3-Click on button purchaseOptions Increased.png')

"Step 4: Click on label colorStorageCapacity (256GB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20241226/Dynamic Objects/Page_home/label_colorStorageCapacity"
WebUI.enhancedClick(findTestObject('Archived/Archived_20241226/Dynamic Objects/Page_home/label_colorStorageCapacity', ['label_colorStorageCapacity_for': label_colorStorageCapacity_for, 'label_colorStorageCapacity_internalText': label_colorStorageCapacity_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 4-Click on label colorStorageCapacity 256GB.png')

"Step 5: Click on label colorStorageCapacity (Pink)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20241226/Dynamic Objects/Page_home/label_colorStorageCapacity"
WebUI.enhancedClick(findTestObject('Archived/Archived_20241226/Dynamic Objects/Page_home/label_colorStorageCapacity', ['label_colorStorageCapacity_for': label_colorStorageCapacity_for_1, 'label_colorStorageCapacity_internalText': label_colorStorageCapacity_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 5-Click on label colorStorageCapacity Pink.png')

"Step 6: Click on button purchaseOptions (Buy)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20241226/Dynamic Objects/Page_home/button_purchaseOptions"
WebUI.enhancedClick(findTestObject('Archived/Archived_20241226/Dynamic Objects/Page_home/button_purchaseOptions', ['button_purchaseOptions_internalRoleButtonName': button_purchaseOptions_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 6-Click on button purchaseOptions Buy.png')

"Step 7: Hover over link GoToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('Archived/Archived_20241226/Page_home/link_GoToCart'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 7-Hover over link GoToCart.png')

"Step 8: Click on span dynamicObject (2) -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20241226/Dynamic Objects/Page_home/span_dynamicObject"
WebUI.enhancedClick(findTestObject('Archived/Archived_20241226/Dynamic Objects/Page_home/span_dynamicObject', ['span_dynamicObject_internalRoleLinkName': span_dynamicObject_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 8-Click on span dynamicObject 2 - Navigate to page cart.png')

"Step 9: Click on button quantityAdjustment (quantityAdjustment3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20241226/Dynamic Objects/Page_cart/button_quantityAdjustment_2"
WebUI.enhancedClick(findTestObject('Archived/Archived_20241226/Dynamic Objects/Page_cart/button_quantityAdjustment_2', ['button_quantityAdjustment_nthChild': button_quantityAdjustment_nthChild, 'button_quantityAdjustment_internalRoleButtonName': button_quantityAdjustment_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 9-Click on button quantityAdjustment quantityAdjustment3.png')

"Step 10: Click on button ProceedToCheckout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20241226/Page_cart/button_ProceedToCheckout2'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 10-Click on button ProceedToCheckout.png')

"Step 11: Complete shipping address form and proceed to payment"

fillShippingAddressDetailsAndContinueToPayment.execute(data_path_0, Integer.valueOf(index_0))

"Step 12: Click on button CompleteOrder -> Navigate to page 'thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 12-Click on button CompleteOrder - Navigate to page thank-you.png')

"Step 13: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC7-Purchase New iPhone and Complete Checkout_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}