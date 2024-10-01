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

"Step 2: Click on div NewProductInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_NewProductInfo'))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 2-Click on div NewProductInfo.png')

"Step 3: Click on button addToCart (addToCart)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_addToCart', ['button_addToCart_class': button_addToCart_class, 'button_addToCart_internalHasText': button_addToCart_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 3-Click on button addToCart addToCart.png')

"Step 4: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 4-Click on button close.png')

"Step 5: Hover over item productCategories (Accessories)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_home/item_productCategories'))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 5-Hover over item productCategories Accessories.png')

"Step 6: Click on link brandNames (Samsung2) -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_brandNames"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_brandNames', ['link_brandNames_nthChild': link_brandNames_nthChild, 'link_brandNames_category_id': link_brandNames_category_id]))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 6-Click on link brandNames Samsung2 - Navigate to page category.png')

"Step 7: Click on button addToCartMultiple (AddToCart2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_addToCartMultiple"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_addToCartMultiple', ['button_addToCartMultiple_class': button_addToCartMultiple_class, 'button_addToCartMultiple_internalHasText': button_addToCartMultiple_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 7-Click on button addToCartMultiple AddToCart2.png')

"Step 8: Click on button addToCartMultiple (AddToCart3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_addToCartMultiple"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_addToCartMultiple', ['button_addToCartMultiple_class': button_addToCartMultiple_class_1, 'button_addToCartMultiple_internalHasText': button_addToCartMultiple_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 8-Click on button addToCartMultiple AddToCart3.png')

"Step 9: Click on link SamsungGalaxyS23Ultra2 -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_SamsungGalaxyS23Ultra2'))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 9-Click on link SamsungGalaxyS23Ultra2 - Navigate to page product.png')

"Step 10: Hover over item productCategories (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_product/item_productCategories'))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 10-Hover over item productCategories object.png')

"Step 11: Click on link brandNames (Samsung2) -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/link_brandNames"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_brandNames', ['link_brandNames_nthChild': link_brandNames_nthChild_1, 'link_brandNames_internalRoleLinkName': link_brandNames_internalRoleLinkName, 'link_brandNames_category_id': link_brandNames_category_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 11-Click on link brandNames Samsung2 - Navigate to page category.png')

"Step 12: Click on button addToCart (AddToCart4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_addToCart', ['button_addToCart_class': button_addToCart_class_1, 'button_addToCart_internalHasText': button_addToCart_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 12-Click on button addToCart AddToCart4.png')

"Step 13: Click on div ChooseVariant"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/div_ChooseVariant'))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 13-Click on div ChooseVariant.png')

"Step 14: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 14-Click on button close.png')

"Step 15: Click on button addToCartMultiple (SamsungGalaxyZFold5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_addToCartMultiple"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_addToCartMultiple', ['button_addToCartMultiple_class': button_addToCartMultiple_class_2, 'button_addToCartMultiple_internalHasText': button_addToCartMultiple_internalHasText_2]))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 15-Click on button addToCartMultiple SamsungGalaxyZFold5.png')

"Step 16: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 16-Click on button close.png')

"Step 17: Click on link brandLinks (Samsung2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_brandLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_brandLinks', ['link_brandLinks_class': link_brandLinks_class, 'link_brandLinks_category_id': link_brandLinks_category_id]))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 17-Click on link brandLinks Samsung2.png')

"Step 18: Click on link brandLinks (googlePixel)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_brandLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_brandLinks', ['link_brandLinks_class': link_brandLinks_class_1, 'link_brandLinks_internalRoleLinkName': link_brandLinks_internalRoleLinkName, 'link_brandLinks_category_id': link_brandLinks_category_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 18-Click on link brandLinks googlePixel.png')

"Step 19: Click on link brandLinks (samsung)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_brandLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_brandLinks', ['link_brandLinks_class': link_brandLinks_class_2, 'link_brandLinks_internalRoleLinkName': link_brandLinks_internalRoleLinkName_1, 'link_brandLinks_category_id': link_brandLinks_category_id_2]))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 19-Click on link brandLinks samsung.png')

"Step 20: Hover over item productCategories (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/item_productCategories"
WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_category/item_productCategories', ['item_productCategories_internalHasText': item_productCategories_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 20-Hover over item productCategories object.png')

"Step 21: Click on span object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/span_object'))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 21-Click on span object.png')

"Step 22: Click on link brandOptions (GooglePixel)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_brandOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_brandOptions', ['link_brandOptions_nthChild': link_brandOptions_nthChild, 'link_brandOptions_internalRoleLinkName': link_brandOptions_internalRoleLinkName, 'link_brandOptions_category_id': link_brandOptions_category_id]))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 22-Click on link brandOptions GooglePixel.png')

"Step 23: Click on link Phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_Phone'))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 23-Click on link Phone.png')

"Step 24: Click on main object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/main_object'))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 24-Click on main object.png')

"Step 25: Hover over item productCategories (phone)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_category/item_productCategories'))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 25-Hover over item productCategories phone.png')

"Step 26: Click on link brandOptions (Samsung3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_brandOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_brandOptions', ['link_brandOptions_nthChild': link_brandOptions_nthChild_1, 'link_brandOptions_category_id': link_brandOptions_category_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 26-Click on link brandOptions Samsung3.png')

"Step 27: Click on link brandLinks (googlePixel)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_brandLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_brandLinks', ['link_brandLinks_class': link_brandLinks_class_3, 'link_brandLinks_internalRoleLinkName': link_brandLinks_internalRoleLinkName_2, 'link_brandLinks_category_id': link_brandLinks_category_id_3]))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 27-Click on link brandLinks googlePixel.png')

"Step 28: Click on link brandLinks (samsung)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_brandLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_brandLinks', ['link_brandLinks_class': link_brandLinks_class_4, 'link_brandLinks_internalRoleLinkName': link_brandLinks_internalRoleLinkName_3, 'link_brandLinks_category_id': link_brandLinks_category_id_4]))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 28-Click on link brandLinks samsung.png')

"Step 29: Click on button addToCartMultiple (AddToCart5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_addToCartMultiple"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_addToCartMultiple', ['button_addToCartMultiple_class': button_addToCartMultiple_class_3, 'button_addToCartMultiple_internalHasText': button_addToCartMultiple_internalHasText_3]))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 29-Click on button addToCartMultiple AddToCart5.png')

"Step 30: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 30-Click on button close.png')

"Step 31: Click on link productModels (SamsungGalaxyS23Ultra) -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_productModels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_productModels', ['link_productModels_class': link_productModels_class, 'link_productModels_internalRoleLinkName': link_productModels_internalRoleLinkName, 'link_productModels_product_id': link_productModels_product_id]))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 31-Click on link productModels SamsungGalaxyS23Ultra - Navigate to page product.png')

"Step 32: Click on label storageOptions (256GB2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_storageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_storageOptions', ['label_storageOptions_for': label_storageOptions_for, 'label_storageOptions_internalText': label_storageOptions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 32-Click on label storageOptions 256GB2.png')

"Step 33: Hover over item productCategories (accessories)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/item_productCategories"
WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_product/item_productCategories', ['item_productCategories_internalHasText': item_productCategories_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 33-Hover over item productCategories accessories.png')

"Step 34: Click on link brandNames (apple) -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/link_brandNames"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_brandNames', ['link_brandNames_nthChild': link_brandNames_nthChild_2, 'link_brandNames_internalRoleLinkName': link_brandNames_internalRoleLinkName_1, 'link_brandNames_category_id': link_brandNames_category_id_2]))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 34-Click on link brandNames apple - Navigate to page category.png')

"Step 35: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC116-Verify Product Category Navigation and Selection_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}