import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.truetest.TrueTestScripts
import internal.GlobalVariable
import katalon.common.completeCheckoutProcessWithShippingDetails

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Hover over item item"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_item'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Hover over item item.png')

"Step 3: Click on link mobileBrands (apple) -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_mobileBrands"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_mobileBrands', ['link_mobileBrands_nthChild': link_mobileBrands_nthChild, 'link_mobileBrands_internalRoleLinkName': link_mobileBrands_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on link mobileBrands apple - Navigate to page category.png')

"Step 4: Click on button phoneCase (newIphone15SiliconeCase)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_phoneCase"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_phoneCase', ['button_phoneCase_class': button_phoneCase_class, 'button_phoneCase_internalHasText': button_phoneCase_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on button phoneCase newIphone15SiliconeCase.png')

"Step 5: Click on label deviceSpecifications (iphone15Plus)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_deviceSpecifications"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_deviceSpecifications', ['label_deviceSpecifications_for': label_deviceSpecifications_for, 'label_deviceSpecifications_internalText': label_deviceSpecifications_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on label deviceSpecifications iphone15Plus.png')

"Step 6: Click on label deviceSpecifications (cypress)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_deviceSpecifications"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_deviceSpecifications', ['label_deviceSpecifications_for': label_deviceSpecifications_for_1, 'label_deviceSpecifications_internalText': label_deviceSpecifications_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on label deviceSpecifications cypress.png')

"Step 7: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on button buy.png')

"Step 8: Click on link cart (cart)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_cart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_cart', ['link_cart_internalRoleLinkName': link_cart_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on link cart cart.png')

"Step 9: Fill in shipping details and complete the checkout process"

completeCheckoutProcessWithShippingDetails.execute(data_path_0, Integer.valueOf(index_0))

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Complete Purchase of Phone Case with Shipping Details_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}