import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import truetest.common.fillShippingDetailsAndProceedToPayment

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

WebUI.takeScreenshot(reportLocation + '/TC41/Step 2-Click on button addToCart.png')

"Step 3: Click on button purchaseActions (IncreaseQuantity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_purchaseActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_purchaseActions', ['button_purchaseActions_internalRoleButtonName': button_purchaseActions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 3-Click on button purchaseActions IncreaseQuantity.png')

"Step 4: Click on button purchaseActions (IncreaseQuantity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_purchaseActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_purchaseActions', ['button_purchaseActions_internalRoleButtonName': button_purchaseActions_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 4-Click on button purchaseActions IncreaseQuantity.png')

"Step 5: Click on button purchaseActions (IncreaseQuantity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_purchaseActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_purchaseActions', ['button_purchaseActions_internalRoleButtonName': button_purchaseActions_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 5-Click on button purchaseActions IncreaseQuantity.png')

"Step 6: Click on button purchaseActions (IncreaseQuantity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_purchaseActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_purchaseActions', ['button_purchaseActions_internalRoleButtonName': button_purchaseActions_internalRoleButtonName_3]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 6-Click on button purchaseActions IncreaseQuantity.png')

"Step 7: Click on button purchaseActions (IncreaseQuantity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_purchaseActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_purchaseActions', ['button_purchaseActions_internalRoleButtonName': button_purchaseActions_internalRoleButtonName_4]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 7-Click on button purchaseActions IncreaseQuantity.png')

"Step 8: Click on label colorAndStorageOptions (256GB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_colorAndStorageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_colorAndStorageOptions', ['label_colorAndStorageOptions_for': label_colorAndStorageOptions_for, 'label_colorAndStorageOptions_internalText': label_colorAndStorageOptions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 8-Click on label colorAndStorageOptions 256GB.png')

"Step 9: Click on label colorAndStorageOptions (256GB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_colorAndStorageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_colorAndStorageOptions', ['label_colorAndStorageOptions_for': label_colorAndStorageOptions_for_1, 'label_colorAndStorageOptions_internalText': label_colorAndStorageOptions_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 9-Click on label colorAndStorageOptions 256GB.png')

"Step 10: Click on label colorAndStorageOptions (256GB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_colorAndStorageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_colorAndStorageOptions', ['label_colorAndStorageOptions_for': label_colorAndStorageOptions_for_2, 'label_colorAndStorageOptions_internalText': label_colorAndStorageOptions_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 10-Click on label colorAndStorageOptions 256GB.png')

"Step 11: Click on label colorAndStorageOptions (ColorSelection)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_colorAndStorageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_colorAndStorageOptions', ['label_colorAndStorageOptions_for': label_colorAndStorageOptions_for_3, 'label_colorAndStorageOptions_internalText': label_colorAndStorageOptions_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 11-Click on label colorAndStorageOptions ColorSelection.png')

"Step 12: Click on label colorAndStorageOptions (ColorSelection2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_colorAndStorageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_colorAndStorageOptions', ['label_colorAndStorageOptions_for': label_colorAndStorageOptions_for_4]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 12-Click on label colorAndStorageOptions ColorSelection2.png')

"Step 13: Click on label colorAndStorageOptions (ColorSelection)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_colorAndStorageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_colorAndStorageOptions', ['label_colorAndStorageOptions_for': label_colorAndStorageOptions_for_5, 'label_colorAndStorageOptions_internalText': label_colorAndStorageOptions_internalText_4]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 13-Click on label colorAndStorageOptions ColorSelection.png')

"Step 14: Click on button purchaseActions (Buy)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_purchaseActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_purchaseActions', ['button_purchaseActions_internalRoleButtonName': button_purchaseActions_internalRoleButtonName_5]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 14-Click on button purchaseActions Buy.png')

"Step 15: Click on link CartNavigation2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_CartNavigation2'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 15-Click on link CartNavigation2.png')

"Step 16: Input shipping information and continue to payment step"

fillShippingDetailsAndProceedToPayment.execute(data_path_0, Integer.valueOf(index_0))

"Step 17: Click on button CompleteOrder -> Navigate to page 'thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 17-Click on button CompleteOrder - Navigate to page thank-you.png')

"Step 18: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC41-Complete Purchase with Multiple Color and Storage Options for iPhone_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}