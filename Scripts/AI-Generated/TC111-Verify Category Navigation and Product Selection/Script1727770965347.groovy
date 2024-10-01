import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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

"Step 2: Hover over item productCategories (Phone)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_home/item_productCategories'))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 2-Hover over item productCategories Phone.png')

"Step 3: Click on link brandNames (Samsung) -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_brandNames"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_brandNames', ['link_brandNames_nthChild': link_brandNames_nthChild, 'link_brandNames_category_id': link_brandNames_category_id]))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 3-Click on link brandNames Samsung - Navigate to page category.png')

"Step 4: Click on button addToCartMultiple (SamsungGalaxyZFold5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_addToCartMultiple"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_addToCartMultiple', ['button_addToCartMultiple_class': button_addToCartMultiple_class, 'button_addToCartMultiple_internalHasText': button_addToCartMultiple_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 4-Click on button addToCartMultiple SamsungGalaxyZFold5.png')

"Step 5: Click on button IncreaseQuantity"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_IncreaseQuantity'))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 5-Click on button IncreaseQuantity.png')

"Step 6: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 6-Click on button close.png')

"Step 7: Click on link productModels (SamsungGalaxyS23Ultra) -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_productModels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_productModels', ['link_productModels_class': link_productModels_class, 'link_productModels_internalRoleLinkName': link_productModels_internalRoleLinkName, 'link_productModels_product_id': link_productModels_product_id]))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 7-Click on link productModels SamsungGalaxyS23Ultra - Navigate to page product.png')

"Step 8: Hover over item productCategories (accessories)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/item_productCategories"
WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_product/item_productCategories', ['item_productCategories_internalHasText': item_productCategories_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 8-Hover over item productCategories accessories.png')

"Step 9: Click on link brandNames (apple) -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/link_brandNames"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_brandNames', ['link_brandNames_nthChild': link_brandNames_nthChild_1, 'link_brandNames_internalRoleLinkName': link_brandNames_internalRoleLinkName, 'link_brandNames_category_id': link_brandNames_category_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 9-Click on link brandNames apple - Navigate to page category.png')

"Step 10: Click on link productModels (iphone15ClearCase) -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_productModels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_productModels', ['link_productModels_class': link_productModels_class_1, 'link_productModels_internalRoleLinkName': link_productModels_internalRoleLinkName_1, 'link_productModels_product_id': link_productModels_product_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 10-Click on link productModels iphone15ClearCase - Navigate to page product.png')

"Step 11: Hover over item productCategories (phone)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/item_productCategories"
WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_product/item_productCategories', ['item_productCategories_internalHasText': item_productCategories_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 11-Hover over item productCategories phone.png')

"Step 12: Click on link brandNames (apple2) -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/link_brandNames"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_brandNames', ['link_brandNames_nthChild': link_brandNames_nthChild_2, 'link_brandNames_internalRoleLinkName': link_brandNames_internalRoleLinkName_1, 'link_brandNames_category_id': link_brandNames_category_id_2]))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 12-Click on link brandNames apple2 - Navigate to page category.png')

"Step 13: Click on link brandLinks (samsung)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_brandLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_brandLinks', ['link_brandLinks_class': link_brandLinks_class, 'link_brandLinks_internalRoleLinkName': link_brandLinks_internalRoleLinkName, 'link_brandLinks_category_id': link_brandLinks_category_id]))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 13-Click on link brandLinks samsung.png')

"Step 14: Click on link brandLinks (googlePixel)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_brandLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_brandLinks', ['link_brandLinks_class': link_brandLinks_class_1, 'link_brandLinks_internalRoleLinkName': link_brandLinks_internalRoleLinkName_1, 'link_brandLinks_category_id': link_brandLinks_category_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 14-Click on link brandLinks googlePixel.png')

"Step 15: Hover over item productCategories (accessories)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/item_productCategories"
WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_category/item_productCategories', ['item_productCategories_internalHasText': item_productCategories_internalHasText_2]))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 15-Hover over item productCategories accessories.png')

"Step 16: Click on link brandOptions (apple)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_brandOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_brandOptions', ['link_brandOptions_nthChild': link_brandOptions_nthChild, 'link_brandOptions_internalRoleLinkName': link_brandOptions_internalRoleLinkName, 'link_brandOptions_category_id': link_brandOptions_category_id]))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 16-Click on link brandOptions apple.png')

"Step 17: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC111-Verify Category Navigation and Product Selection_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}