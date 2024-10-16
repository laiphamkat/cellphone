import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.completeCheckoutInformationForm
import truetest.custom.TrueTestScripts
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

WebUI.takeScreenshot(reportLocation + '/TC15/Step 2-Hover over item object.png')

"Step 3: Click on link mobileBrands (Apple) -> Navigate to page 'category page#category/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_mobileBrands"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_mobileBrands', ['link_mobileBrands_nthChild': link_mobileBrands_nthChild, 'link_mobileBrands_internalRoleLinkName': link_mobileBrands_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 3-Click on link mobileBrands Apple - Navigate to page category pagecategory.png')

"Step 4: Click on button newIPhoneOptions (NewIPhone15Plus)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_page/button_newIPhoneOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_page/button_newIPhoneOptions', ['button_newIPhoneOptions_class': button_newIPhoneOptions_class, 'button_newIPhoneOptions_internalHasText': button_newIPhoneOptions_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 4-Click on button newIPhoneOptions NewIPhone15Plus.png')

"Step 5: Click on label colorStorageOptions (Storage256GB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_page/label_colorStorageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_page/label_colorStorageOptions', ['label_colorStorageOptions_for': label_colorStorageOptions_for, 'label_colorStorageOptions_internalText': label_colorStorageOptions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 5-Click on label colorStorageOptions Storage256GB.png')

"Step 6: Click on label colorStorageOptions (ColorGreen)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_page/label_colorStorageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_page/label_colorStorageOptions', ['label_colorStorageOptions_for': label_colorStorageOptions_for_1, 'label_colorStorageOptions_internalText': label_colorStorageOptions_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 6-Click on label colorStorageOptions ColorGreen.png')

"Step 7: Click on button purchaseActions (Buy)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_page/button_purchaseActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_page/button_purchaseActions', ['button_purchaseActions_internalRoleButtonName': button_purchaseActions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 7-Click on button purchaseActions Buy.png')

"Step 8: Click on link GoToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_page/link_GoToCart'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 8-Click on link GoToCart.png')

"Step 9: Fill out the checkout information form and proceed to payment"

completeCheckoutInformationForm.execute(data_path_0, Integer.valueOf(index_0))

"Step 10: Click on button CompleteOrder -> Navigate to page 'thank you page#thank-you/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 10-Click on button CompleteOrder - Navigate to page thank you pagethank-you.png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC15-Complete Purchase of New iPhone with Color and Storage Options_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}