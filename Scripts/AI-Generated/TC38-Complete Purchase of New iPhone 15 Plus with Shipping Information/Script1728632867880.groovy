import com.kms.katalon.core.configuration.RunConfiguration
import truetest.common.fillShippingDetailsAndProceedToPayment
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

"Step 2: Click on button NewiPhone15Plus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_NewiPhone15Plus'))

WebUI.takeScreenshot(reportLocation + '/TC38/Step 2-Click on button NewiPhone15Plus.png')

"Step 3: Click on button purchaseActions (IncreaseQuantity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_purchaseActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_purchaseActions', ['button_purchaseActions_internalRoleButtonName': button_purchaseActions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC38/Step 3-Click on button purchaseActions IncreaseQuantity.png')

"Step 4: Click on label colorAndStorageOptions (256GB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_colorAndStorageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_colorAndStorageOptions', ['label_colorAndStorageOptions_for': label_colorAndStorageOptions_for, 'label_colorAndStorageOptions_internalText': label_colorAndStorageOptions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC38/Step 4-Click on label colorAndStorageOptions 256GB.png')

"Step 5: Click on label colorAndStorageOptions (ColorSelection)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_colorAndStorageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_colorAndStorageOptions', ['label_colorAndStorageOptions_for': label_colorAndStorageOptions_for_1, 'label_colorAndStorageOptions_internalText': label_colorAndStorageOptions_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC38/Step 5-Click on label colorAndStorageOptions ColorSelection.png')

"Step 6: Click on button purchaseActions (Buy)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_purchaseActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_purchaseActions', ['button_purchaseActions_internalRoleButtonName': button_purchaseActions_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC38/Step 6-Click on button purchaseActions Buy.png')

"Step 7: Hover over link CartNavigation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/link_CartNavigation'))

WebUI.takeScreenshot(reportLocation + '/TC38/Step 7-Hover over link CartNavigation.png')

"Step 8: Click on span informationLinks (link) -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/span_informationLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/span_informationLinks', ['span_informationLinks_internalRoleLinkName': span_informationLinks_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC38/Step 8-Click on span informationLinks link - Navigate to page cart.png')

"Step 9: Click on button IncreaseQuantity"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_IncreaseQuantity'))

WebUI.takeScreenshot(reportLocation + '/TC38/Step 9-Click on button IncreaseQuantity.png')

"Step 10: Input shipping information and continue to payment step"

fillShippingDetailsAndProceedToPayment.execute(data_path_0, Integer.valueOf(index_0))

"Step 11: Click on button CompleteOrder -> Navigate to page 'thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC38/Step 11-Click on button CompleteOrder - Navigate to page thank-you.png')

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC38-Complete Purchase of New iPhone 15 Plus with Shipping Information_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}