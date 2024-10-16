import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.common.completeCheckoutInformationForm
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
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

"Step 2: Hover over item object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_object'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 2-Hover over item object.png')

"Step 3: Click on link mobileBrands (Apple) -> Navigate to page 'category page#category/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_mobileBrands"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_mobileBrands', ['link_mobileBrands_nthChild': link_mobileBrands_nthChild, 'link_mobileBrands_internalRoleLinkName': link_mobileBrands_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 3-Click on link mobileBrands Apple - Navigate to page category pagecategory.png')

"Step 4: Click on button newIPhoneOptions (HotNewIPhone15)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_page/button_newIPhoneOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_page/button_newIPhoneOptions', ['button_newIPhoneOptions_class': button_newIPhoneOptions_class, 'button_newIPhoneOptions_internalHasText': button_newIPhoneOptions_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 4-Click on button newIPhoneOptions HotNewIPhone15.png')

"Step 5: Click on label colorStorageOptions (Storage512GB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_page/label_colorStorageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_page/label_colorStorageOptions', ['label_colorStorageOptions_for': label_colorStorageOptions_for, 'label_colorStorageOptions_internalText': label_colorStorageOptions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 5-Click on label colorStorageOptions Storage512GB.png')

"Step 6: Click on label colorStorageOptions (ColorYellow)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_page/label_colorStorageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_page/label_colorStorageOptions', ['label_colorStorageOptions_for': label_colorStorageOptions_for_1, 'label_colorStorageOptions_internalText': label_colorStorageOptions_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 6-Click on label colorStorageOptions ColorYellow.png')

"Step 7: Click on button purchaseActions (Increased)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_page/button_purchaseActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_page/button_purchaseActions', ['button_purchaseActions_internalRoleButtonName': button_purchaseActions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 7-Click on button purchaseActions Increased.png')

"Step 8: Click on button purchaseActions (Buy)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_page/button_purchaseActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_page/button_purchaseActions', ['button_purchaseActions_internalRoleButtonName': button_purchaseActions_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 8-Click on button purchaseActions Buy.png')

"Step 9: Hover over link GoToCart2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_category_page/link_GoToCart2'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 9-Hover over link GoToCart2.png')

"Step 10: Click on span dynamicObject (Link2) -> Navigate to page 'cart page#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_page/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_page/span_dynamicObject', ['span_dynamicObject_internalRoleLinkName': span_dynamicObject_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 10-Click on span dynamicObject Link2 - Navigate to page cart pagecart.png')

"Step 11: Click on button Increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart_page/button_Increased'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 11-Click on button Increased.png')

"Step 12: Fill out the checkout information form and proceed to payment"

completeCheckoutInformationForm.execute(data_path_0, Integer.valueOf(index_0))

"Step 13: Click on button CompleteOrder -> Navigate to page 'thank you page#thank-you/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 13-Click on button CompleteOrder - Navigate to page thank you pagethank-you.png')

"Step 14: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC16-Purchase New iPhone with Multiple Actions and Verify Order Completion_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}