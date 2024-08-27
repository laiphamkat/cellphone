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

"Step 2: Click on div newIphone15Plus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_newIphone15Plus'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 2-Click on div newIphone15Plus.png')

"Step 3: Click on button addToCart (addToCart2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_addToCart', ['button_addToCart_class': button_addToCart_class, 'button_addToCart_internalHasText': button_addToCart_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 3-Click on button addToCart addToCart2.png')

"Step 4: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 4-Click on button close.png')

"Step 5: Hover over link itemCategories (accessories)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_itemCategories'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 5-Hover over link itemCategories accessories.png')

"Step 6: Click on link samsung2 -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_samsung2'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 6-Click on link samsung2 - Navigate to page category.png')

"Step 7: Click on button saleItems (samsungGalaxyZfold5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_saleItems_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_saleItems_1', ['button_saleItems_class': button_saleItems_class, 'button_saleItems_internalHasText': button_saleItems_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 7-Click on button saleItems samsungGalaxyZfold5.png')

"Step 8: Click on button saleItems (sale20WusbtypeCadapter)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_saleItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_saleItems', ['button_saleItems_class': button_saleItems_class, 'button_saleItems_internalHasText': button_saleItems_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 8-Click on button saleItems sale20WusbtypeCadapter.png')

"Step 9: Click on link samsungGalaxyS23Ultra -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_samsungGalaxyS23Ultra'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 9-Click on link samsungGalaxyS23Ultra - Navigate to page product.png')

"Step 10: Hover over link itemCategories (phone)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/link_itemCategories_1"
WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_itemCategories_1', ['link_itemCategories_internalHasText': link_itemCategories_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 10-Hover over link itemCategories phone.png')

"Step 11: Click on link brandOptions (samsung) -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/link_brandOptions_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_brandOptions_2', ['link_brandOptions_nthChild': link_brandOptions_nthChild, 'link_brandOptions_internalRoleLinkName': link_brandOptions_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 11-Click on link brandOptions samsung - Navigate to page category.png')

"Step 12: Click on button addToCart (addToCart2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_addToCart_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_addToCart_1', ['button_addToCart_class': button_addToCart_class, 'button_addToCart_internalHasText': button_addToCart_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 12-Click on button addToCart addToCart2.png')

"Step 13: Click on div chooseVariant"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/div_chooseVariant'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 13-Click on div chooseVariant.png')

"Step 14: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 14-Click on button close.png')

"Step 15: Click on button saleItems (samsungGalaxyZfold5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_saleItems_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_saleItems_1', ['button_saleItems_class': button_saleItems_class, 'button_saleItems_internalHasText': button_saleItems_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 15-Click on button saleItems samsungGalaxyZfold5.png')

"Step 16: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 16-Click on button close.png')

"Step 17: Click on link brandOptions (samsung)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_brandOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_brandOptions', ['link_brandOptions_class': link_brandOptions_class, 'link_brandOptions_internalRoleLinkName': link_brandOptions_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 17-Click on link brandOptions samsung.png')

"Step 18: Click on link brandOptions (googlePixel)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_brandOptions_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_brandOptions_1', ['link_brandOptions_class': link_brandOptions_class, 'link_brandOptions_internalRoleLinkName': link_brandOptions_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 18-Click on link brandOptions googlePixel.png')

"Step 19: Click on link brandOptions (samsung)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_brandOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_brandOptions', ['link_brandOptions_class': link_brandOptions_class, 'link_brandOptions_internalRoleLinkName': link_brandOptions_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 19-Click on link brandOptions samsung.png')

"Step 20: Hover over link itemCategories (phone)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_itemCategories_1"
WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_itemCategories_1', ['link_itemCategories_internalHasText': link_itemCategories_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 20-Hover over link itemCategories phone.png')

"Step 21: Click on span phoneAppleSamsungGooglePixelAccessories"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/span_phoneAppleSamsungGooglePixelAccessories'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 21-Click on span phoneAppleSamsungGooglePixelAccessories.png')

"Step 22: Click on link brandOptions (googlePixel2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_brandOptions_3"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_brandOptions_3', ['link_brandOptions_nthChild': link_brandOptions_nthChild, 'link_brandOptions_internalRoleLinkName': link_brandOptions_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 22-Click on link brandOptions googlePixel2.png')

"Step 23: Click on link phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_phone'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 23-Click on link phone.png')

"Step 24: Click on main pageLayout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/main_pageLayout'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 24-Click on main pageLayout.png')

"Step 25: Hover over link itemCategories (phone)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_itemCategories_1"
WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_itemCategories_1', ['link_itemCategories_internalHasText': link_itemCategories_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 25-Hover over link itemCategories phone.png')

"Step 26: Click on link brandOptions (samsung2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_brandOptions_4"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_brandOptions_4', ['link_brandOptions_nthChild': link_brandOptions_nthChild, 'link_brandOptions_internalRoleLinkName': link_brandOptions_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 26-Click on link brandOptions samsung2.png')

"Step 27: Click on link brandOptions (googlePixel)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_brandOptions_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_brandOptions_1', ['link_brandOptions_class': link_brandOptions_class, 'link_brandOptions_internalRoleLinkName': link_brandOptions_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 27-Click on link brandOptions googlePixel.png')

"Step 28: Click on link brandOptions (samsung)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_brandOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_brandOptions', ['link_brandOptions_class': link_brandOptions_class, 'link_brandOptions_internalRoleLinkName': link_brandOptions_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 28-Click on link brandOptions samsung.png')

"Step 29: Click on button saleItems (sale20WusbtypeCadapter)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_saleItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_saleItems', ['button_saleItems_class': button_saleItems_class, 'button_saleItems_internalHasText': button_saleItems_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 29-Click on button saleItems sale20WusbtypeCadapter.png')

"Step 30: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 30-Click on button close.png')

"Step 31: Click on link productItems (20WusbtypeCadapter) -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_productItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_productItems', ['link_productItems_class': link_productItems_class, 'link_productItems_internalRoleLinkName': link_productItems_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 31-Click on link productItems 20WusbtypeCadapter - Navigate to page product.png')

"Step 32: Click on label storageOptions (256Gb)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_storageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_storageOptions', ['label_storageOptions_for': label_storageOptions_for, 'label_storageOptions_internalText': label_storageOptions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 32-Click on label storageOptions 256Gb.png')

"Step 33: Hover over link itemCategories (accessories)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/link_itemCategories"
WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_itemCategories', ['link_itemCategories_internalHasText': link_itemCategories_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 33-Hover over link itemCategories accessories.png')

"Step 34: Click on link brandOptions (apple) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/link_brandOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_brandOptions', ['link_brandOptions_nthChild': link_brandOptions_nthChild, 'link_brandOptions_internalRoleLinkName': link_brandOptions_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 34-Click on link brandOptions apple - Navigate to page .png')

"Step 35: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC12-Explore Products and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}