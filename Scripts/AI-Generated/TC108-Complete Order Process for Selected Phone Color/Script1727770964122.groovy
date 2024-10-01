import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.fillPersonalDetailsForOrderProcessing
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.common.selectPhoneColorAndProceedToCheckout
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Hover over item productCategories (PhoneBrands)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_home/item_productCategories'))

WebUI.takeScreenshot(reportLocation + '/TC108/Step 2-Hover over item productCategories PhoneBrands.png')

"Step 3: Click on link brandNames (Samsung) -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_brandNames"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_brandNames', ['link_brandNames_nthChild': link_brandNames_nthChild, 'link_brandNames_category_id': link_brandNames_category_id]))

WebUI.takeScreenshot(reportLocation + '/TC108/Step 3-Click on link brandNames Samsung - Navigate to page category.png')

"Step 4: Click on link sortOptions (byTitle)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_sortOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_sortOptions', ['link_sortOptions_nthChild': link_sortOptions_nthChild, 'link_sortOptions_internalRoleLinkName': link_sortOptions_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC108/Step 4-Click on link sortOptions byTitle.png')

"Step 5: Click on link sortOptions (ByPrice)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_sortOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_sortOptions', ['link_sortOptions_nthChild': link_sortOptions_nthChild_1, 'link_sortOptions_internalRoleLinkName': link_sortOptions_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC108/Step 5-Click on link sortOptions ByPrice.png')

"Step 6: Click on link brandLinks (googlePixel)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_brandLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_brandLinks', ['link_brandLinks_class': link_brandLinks_class, 'link_brandLinks_internalRoleLinkName': link_brandLinks_internalRoleLinkName, 'link_brandLinks_category_id': link_brandLinks_category_id]))

WebUI.takeScreenshot(reportLocation + '/TC108/Step 6-Click on link brandLinks googlePixel.png')

"Step 7: Click on link productModels (GooglePixel8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_productModels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_productModels', ['link_productModels_class': link_productModels_class, 'link_productModels_internalRoleLinkName': link_productModels_internalRoleLinkName, 'link_productModels_product_id': link_productModels_product_id]))

WebUI.takeScreenshot(reportLocation + '/TC108/Step 7-Click on link productModels GooglePixel8.png')

"Step 8: Select phone color and proceed to checkout"

selectPhoneColorAndProceedToCheckout.execute(data_path_0, Integer.valueOf(index_0))

"Step 9: Fill out personal details for order processing"

fillPersonalDetailsForOrderProcessing.execute(data_path_1, Integer.valueOf(index_1))

"Step 10: Click on button CompleteOrder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC108/Step 10-Click on button CompleteOrder.png')

"Step 11: Click on button CompleteOrder -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC108/Step 11-Click on button CompleteOrder - Navigate to page .png')

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC108-Complete Order Process for Selected Phone Color_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}