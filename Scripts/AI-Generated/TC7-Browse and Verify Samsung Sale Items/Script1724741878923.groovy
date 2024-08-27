import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
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

"Step 2: Hover over link itemCategories (phone)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_itemCategories_1'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 2-Hover over link itemCategories phone.png')

"Step 3: Click on link samsung -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_samsung'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 3-Click on link samsung - Navigate to page category.png')

"Step 4: Click on button saleItems (samsungGalaxyZfold5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_saleItems_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_saleItems_1', ['button_saleItems_class': button_saleItems_class, 'button_saleItems_internalHasText': button_saleItems_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 4-Click on button saleItems samsungGalaxyZfold5.png')

"Step 5: Click on button increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_increased'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 5-Click on button increased.png')

"Step 6: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 6-Click on button close.png')

"Step 7: Click on link productItems (20WusbtypeCadapter) -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_productItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_productItems', ['link_productItems_class': link_productItems_class, 'link_productItems_internalRoleLinkName': link_productItems_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 7-Click on link productItems 20WusbtypeCadapter - Navigate to page product.png')

"Step 8: Hover over link itemCategories (accessories)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/link_itemCategories"
WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_itemCategories', ['link_itemCategories_internalHasText': link_itemCategories_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 8-Hover over link itemCategories accessories.png')

"Step 9: Click on link brandOptions (apple) -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/link_brandOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_brandOptions', ['link_brandOptions_nthChild': link_brandOptions_nthChild, 'link_brandOptions_internalRoleLinkName': link_brandOptions_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 9-Click on link brandOptions apple - Navigate to page category.png')

"Step 10: Click on link productItems (iphone15ClearCaseWithMagSafe) -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_productItems_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_productItems_1', ['link_productItems_class': link_productItems_class, 'link_productItems_internalRoleLinkName': link_productItems_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 10-Click on link productItems iphone15ClearCaseWithMagSafe - Navigate to page product.png')

"Step 11: Hover over link itemCategories (phone)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/link_itemCategories_1"
WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_itemCategories_1', ['link_itemCategories_internalHasText': link_itemCategories_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 11-Hover over link itemCategories phone.png')

"Step 12: Click on link brandOptions (apple2) -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/link_brandOptions_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_brandOptions_1', ['link_brandOptions_nthChild': link_brandOptions_nthChild, 'link_brandOptions_internalRoleLinkName': link_brandOptions_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 12-Click on link brandOptions apple2 - Navigate to page category.png')

"Step 13: Click on link brandOptions (samsung)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_brandOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_brandOptions', ['link_brandOptions_class': link_brandOptions_class, 'link_brandOptions_internalRoleLinkName': link_brandOptions_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 13-Click on link brandOptions samsung.png')

"Step 14: Click on link brandOptions (googlePixel)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_brandOptions_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_brandOptions_1', ['link_brandOptions_class': link_brandOptions_class, 'link_brandOptions_internalRoleLinkName': link_brandOptions_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 14-Click on link brandOptions googlePixel.png')

"Step 15: Hover over link itemCategories (accessories)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_itemCategories"
WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_itemCategories', ['link_itemCategories_internalHasText': link_itemCategories_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 15-Hover over link itemCategories accessories.png')

"Step 16: Click on link brandOptions (apple) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_brandOptions_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_brandOptions_2', ['link_brandOptions_nthChild': link_brandOptions_nthChild, 'link_brandOptions_internalRoleLinkName': link_brandOptions_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 16-Click on link brandOptions apple - Navigate to page .png')

"Step 17: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC7-Browse and Verify Samsung Sale Items_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}