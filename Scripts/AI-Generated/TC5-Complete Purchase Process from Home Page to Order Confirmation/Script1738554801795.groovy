import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.fillShippingDetailsAndCompleteOrder
import truetest.common.proceedToCheckoutAndEnterEmail
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

WebUI.takeScreenshot(reportLocation + '/TC5/Step 2-Hover over item object.png')

"Step 3: Click on link brand (Samsung) -> Navigate to page 'category#category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_brand"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_brand', ['link_brand_nthChild': link_brand_nthChild, 'link_brand_internalRoleLinkName': link_brand_internalRoleLinkName, 'category_id': category_id]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 3-Click on link brand Samsung - Navigate to page categorycategory.png')

"Step 4: Click on link productModels (SamsungGalaxyS23UltraSmartviewCases) -> Navigate to page 'product#product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_productDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_productDetails', ['product_id': product_id]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 4-Click on link productModels SamsungGalaxyS23UltraSmartviewCases - Navigate to page productproduct.png')

"Step 5: Click on button purchaseAction (Increased)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_purchaseAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_purchaseAction', ['button_purchaseAction_internalRoleButtonName': button_purchaseAction_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 5-Click on button purchaseAction Increased.png')

"Step 6: Click on button purchaseAction (Increased)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_purchaseAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_purchaseAction', ['button_purchaseAction_internalRoleButtonName': button_purchaseAction_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 6-Click on button purchaseAction Increased.png')

"Step 7: Click on button purchaseAction (Increased)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_purchaseAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_purchaseAction', ['button_purchaseAction_internalRoleButtonName': button_purchaseAction_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 7-Click on button purchaseAction Increased.png')

"Step 8: Click on button purchaseAction (Buy)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_purchaseAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_purchaseAction', ['button_purchaseAction_internalRoleButtonName': button_purchaseAction_internalRoleButtonName_3]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 8-Click on button purchaseAction Buy.png')

"Step 9: Click on link PlaceAnOrder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_PlaceAnOrder'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 9-Click on link PlaceAnOrder.png')

"Step 10: Proceed to checkout and enter email for shipping information"

proceedToCheckoutAndEnterEmail.execute(data_path_0, Integer.valueOf(index_0))

"Step 11: Fill in shipping details and complete the order process"

fillShippingDetailsAndCompleteOrder.execute(data_path_1, Integer.valueOf(index_1))

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Complete Purchase Process from Home Page to Order Confirmation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}