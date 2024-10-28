import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import truetest.common.enterEmailAndProceedToShipping
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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

"Step 2: Click on button addToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_addToCart'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 2-Click on button addToCart.png')

"Step 3: Click on button purchaseOptions (IncreaseQuantity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_purchaseOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_purchaseOptions', ['button_purchaseOptions_internalRoleButtonName': button_purchaseOptions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 3-Click on button purchaseOptions IncreaseQuantity.png')

"Step 4: Click on button purchaseOptions (IncreaseQuantity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_purchaseOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_purchaseOptions', ['button_purchaseOptions_internalRoleButtonName': button_purchaseOptions_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 4-Click on button purchaseOptions IncreaseQuantity.png')

"Step 5: Click on button purchaseOptions (IncreaseQuantity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_purchaseOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_purchaseOptions', ['button_purchaseOptions_internalRoleButtonName': button_purchaseOptions_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 5-Click on button purchaseOptions IncreaseQuantity.png')

"Step 6: Click on button purchaseOptions (IncreaseQuantity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_purchaseOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_purchaseOptions', ['button_purchaseOptions_internalRoleButtonName': button_purchaseOptions_internalRoleButtonName_3]))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 6-Click on button purchaseOptions IncreaseQuantity.png')

"Step 7: Click on div ProductDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_ProductDetails'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 7-Click on div ProductDetails.png')

"Step 8: Click on label storageColorOptions (256GB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_storageColorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_storageColorOptions', ['label_storageColorOptions_for': label_storageColorOptions_for, 'label_storageColorOptions_internalText': label_storageColorOptions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 8-Click on label storageColorOptions 256GB.png')

"Step 9: Click on label storageColorOptions (ColorSelection)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_storageColorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_storageColorOptions', ['label_storageColorOptions_for': label_storageColorOptions_for_1, 'label_storageColorOptions_internalText': label_storageColorOptions_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 9-Click on label storageColorOptions ColorSelection.png')

"Step 10: Click on button Buy2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_Buy2'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 10-Click on button Buy2.png')

"Step 11: Hover over link CartNavigation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/link_CartNavigation'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 11-Hover over link CartNavigation.png')

"Step 12: Click on span additionalInformation (AdditionalLink) -> Navigate to page 'display list of items:/{fixed page}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/span_additionalInformation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/span_additionalInformation', ['span_additionalInformation_internalRoleLinkName': span_additionalInformation_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 12-Click on span additionalInformation AdditionalLink - Navigate to page display list of itemsfixed page.png')

"Step 13: Click on button IncreaseQuantity"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_list_of_items:/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_list_of_items_fixed_page/button_IncreaseQuantity'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 13-Click on button IncreaseQuantity.png')

"Step 14: Click on button IncreaseQuantity"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_list_of_items:/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_list_of_items_fixed_page/button_IncreaseQuantity'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 14-Click on button IncreaseQuantity.png')

"Step 15: Click on button IncreaseQuantity"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_list_of_items:/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_list_of_items_fixed_page/button_IncreaseQuantity'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 15-Click on button IncreaseQuantity.png')

"Step 16: Click on button IncreaseQuantity"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_list_of_items:/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_list_of_items_fixed_page/button_IncreaseQuantity'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 16-Click on button IncreaseQuantity.png')

"Step 17: Enter email and proceed through shipping form"

enterEmailAndProceedToShipping.execute(data_path_0, Integer.valueOf(index_0))

"Step 18: Click on button CompleteOrder -> Navigate to page 'display single item:/{fixed page}/{item id or slug}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 18-Click on button CompleteOrder - Navigate to page display single itemfixed pageitem id or slug.png')

"Step 19: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC78-Purchase Cellphone with Detailed Options and Quantity Increase_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}