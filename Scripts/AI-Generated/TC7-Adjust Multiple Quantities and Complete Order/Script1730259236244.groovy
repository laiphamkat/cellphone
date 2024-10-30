import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.fillShippingInformationAndContinueToPayment
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on button addToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_addToCart'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 2-Click on button addToCart.png')

"Step 3: Click on button quantityAdjustment (IncreaseQuantity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_quantityAdjustment"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_quantityAdjustment', ['button_quantityAdjustment_internalRoleButtonName': button_quantityAdjustment_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 3-Click on button quantityAdjustment IncreaseQuantity.png')

"Step 4: Click on button quantityAdjustment (IncreaseQuantity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_quantityAdjustment"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_quantityAdjustment', ['button_quantityAdjustment_internalRoleButtonName': button_quantityAdjustment_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 4-Click on button quantityAdjustment IncreaseQuantity.png')

"Step 5: Click on button quantityAdjustment (IncreaseQuantity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_quantityAdjustment"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_quantityAdjustment', ['button_quantityAdjustment_internalRoleButtonName': button_quantityAdjustment_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 5-Click on button quantityAdjustment IncreaseQuantity.png')

"Step 6: Click on button quantityAdjustment (IncreaseQuantity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_quantityAdjustment"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_quantityAdjustment', ['button_quantityAdjustment_internalRoleButtonName': button_quantityAdjustment_internalRoleButtonName_3]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 6-Click on button quantityAdjustment IncreaseQuantity.png')

"Step 7: Click on div ProductDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_ProductDetails'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 7-Click on div ProductDetails.png')

"Step 8: Click on label colorAndStorage (256GB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_colorAndStorage"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_colorAndStorage', ['label_colorAndStorage_for': label_colorAndStorage_for, 'label_colorAndStorage_internalText': label_colorAndStorage_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 8-Click on label colorAndStorage 256GB.png')

"Step 9: Click on label colorAndStorage (ColorSelection)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_colorAndStorage"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_colorAndStorage', ['label_colorAndStorage_for': label_colorAndStorage_for_1, 'label_colorAndStorage_internalText': label_colorAndStorage_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 9-Click on label colorAndStorage ColorSelection.png')

"Step 10: Click on button Buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_Buy'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 10-Click on button Buy.png')

"Step 11: Hover over link CartNavigation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/link_CartNavigation'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 11-Hover over link CartNavigation.png')

"Step 12: Click on span additionalLinks (AdditionalLink) -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/span_additionalLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/span_additionalLinks', ['span_additionalLinks_internalRoleLinkName': span_additionalLinks_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 12-Click on span additionalLinks AdditionalLink - Navigate to page cart.png')

"Step 13: Click on button IncreaseQuantity"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_IncreaseQuantity'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 13-Click on button IncreaseQuantity.png')

"Step 14: Click on button IncreaseQuantity"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_IncreaseQuantity'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 14-Click on button IncreaseQuantity.png')

"Step 15: Click on button IncreaseQuantity"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_IncreaseQuantity'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 15-Click on button IncreaseQuantity.png')

"Step 16: Click on button IncreaseQuantity"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_IncreaseQuantity'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 16-Click on button IncreaseQuantity.png')

"Step 17: Click on button ProceedToCheckout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_ProceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 17-Click on button ProceedToCheckout.png')

"Step 18: Fill in shipping details and proceed to payment"

fillShippingInformationAndContinueToPayment.execute(data_path_0, Integer.valueOf(index_0))

"Step 19: Click on button CompleteOrder -> Navigate to page 'thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 19-Click on button CompleteOrder - Navigate to page thank-you.png')

"Step 20: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC7-Adjust Multiple Quantities and Complete Order_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}