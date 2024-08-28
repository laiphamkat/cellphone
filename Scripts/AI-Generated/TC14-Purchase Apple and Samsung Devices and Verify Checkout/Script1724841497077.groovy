import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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

"Step 2: Hover over item dynamicObject (item2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_dynamicObject_1'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 2-Hover over item dynamicObject item2.png')

"Step 3: Click on link apple2 -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_apple2'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 3-Click on link apple2 - Navigate to page category.png')

"Step 4: Click on button productPurchase (newIphone15SiliconeCase)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_productPurchase"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_productPurchase', ['button_productPurchase_class': button_productPurchase_class, 'button_productPurchase_internalHasText': button_productPurchase_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 4-Click on button productPurchase newIphone15SiliconeCase.png')

"Step 5: Click on button dynamicObject (increased2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_dynamicObject', ['button_dynamicObject_internalRoleButtonName': button_dynamicObject_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 5-Click on button dynamicObject increased2.png')

"Step 6: Click on label storageColorModel (cypress)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_storageColorModel"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_storageColorModel', ['label_storageColorModel_for': label_storageColorModel_for, 'label_storageColorModel_internalText': label_storageColorModel_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 6-Click on label storageColorModel cypress.png')

"Step 7: Click on label storageColorModel (iphone15Plus)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_storageColorModel"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_storageColorModel', ['label_storageColorModel_for': label_storageColorModel_for_1, 'label_storageColorModel_internalText': label_storageColorModel_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 7-Click on label storageColorModel iphone15Plus.png')

"Step 8: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 8-Click on button buy.png')

"Step 9: Click on link mobileDevices (iphone15ProMax) -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_mobileDevices"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_mobileDevices', ['link_mobileDevices_class': link_mobileDevices_class, 'link_mobileDevices_internalRoleLinkName': link_mobileDevices_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 9-Click on link mobileDevices iphone15ProMax - Navigate to page product.png')

"Step 10: Click on label colorModelStorage (iphone15)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_colorModelStorage"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_colorModelStorage', ['label_colorModelStorage_for': label_colorModelStorage_for, 'label_colorModelStorage_internalText': label_colorModelStorage_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 10-Click on label colorModelStorage iphone15.png')

"Step 11: Click on label colorModelStorage (blue)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_colorModelStorage"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_colorModelStorage', ['label_colorModelStorage_for': label_colorModelStorage_for_1, 'label_colorModelStorage_internalText': label_colorModelStorage_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 11-Click on label colorModelStorage blue.png')

"Step 12: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 12-Click on button buy.png')

"Step 13: Hover over item dynamicObject (phone)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/item_dynamicObject"
WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_product/item_dynamicObject', ['item_dynamicObject_internalHasText': item_dynamicObject_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 13-Hover over item dynamicObject phone.png')

"Step 14: Click on link mobileBrands (samsung) -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/link_mobileBrands"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_mobileBrands', ['link_mobileBrands_nthChild': link_mobileBrands_nthChild, 'link_mobileBrands_internalRoleLinkName': link_mobileBrands_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 14-Click on link mobileBrands samsung - Navigate to page category.png')

"Step 15: Click on link mobileBrands (googlePixel)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_mobileBrands"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_mobileBrands', ['link_mobileBrands_class': link_mobileBrands_class, 'link_mobileBrands_internalRoleLinkName': link_mobileBrands_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 15-Click on link mobileBrands googlePixel.png')

"Step 16: Click on link sortOptions (byTitle)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_sortOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_sortOptions', ['link_sortOptions_nthChild': link_sortOptions_nthChild, 'link_sortOptions_internalRoleLinkName': link_sortOptions_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 16-Click on link sortOptions byTitle.png')

"Step 17: Click on link sortOptions (byPrice)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_sortOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_sortOptions', ['link_sortOptions_nthChild': link_sortOptions_nthChild_1, 'link_sortOptions_internalRoleLinkName': link_sortOptions_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 17-Click on link sortOptions byPrice.png')

"Step 18: Click on link mobileDevices (samsungGalaxyZfold5) -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_mobileDevices"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_mobileDevices', ['link_mobileDevices_class': link_mobileDevices_class_1, 'link_mobileDevices_internalRoleLinkName': link_mobileDevices_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 18-Click on link mobileDevices samsungGalaxyZfold5 - Navigate to page product.png')

"Step 19: Click on label colorModelStorage (iphone15)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_colorModelStorage"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_colorModelStorage', ['label_colorModelStorage_for': label_colorModelStorage_for_2, 'label_colorModelStorage_internalText': label_colorModelStorage_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 19-Click on label colorModelStorage iphone15.png')

"Step 20: Click on label colorModelStorage (black)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_colorModelStorage"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_colorModelStorage', ['label_colorModelStorage_for': label_colorModelStorage_for_3, 'label_colorModelStorage_internalText': label_colorModelStorage_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 20-Click on label colorModelStorage black.png')

"Step 21: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 21-Click on button buy.png')

"Step 22: Click on link placeAnOrder -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_placeAnOrder'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 22-Click on link placeAnOrder - Navigate to page cart.png')

"Step 23: Click on button remove"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_remove'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 23-Click on button remove.png')

"Step 24: Hover over item listItem"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_cart/item_listItem'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 24-Hover over item listItem.png')

"Step 25: Click on link apple -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_apple'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 25-Click on link apple - Navigate to page category.png')

"Step 26: Click on link sortOptions (byTitle)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_sortOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_sortOptions', ['link_sortOptions_nthChild': link_sortOptions_nthChild_2, 'link_sortOptions_internalRoleLinkName': link_sortOptions_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 26-Click on link sortOptions byTitle.png')

"Step 27: Click on link mobileBrands (samsung)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_mobileBrands"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_mobileBrands', ['link_mobileBrands_class': link_mobileBrands_class_1, 'link_mobileBrands_internalRoleLinkName': link_mobileBrands_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 27-Click on link mobileBrands samsung.png')

"Step 28: Click on link mobileDevices (samsungGalaxyZfold5) -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_mobileDevices"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_mobileDevices', ['link_mobileDevices_class': link_mobileDevices_class_2, 'link_mobileDevices_internalRoleLinkName': link_mobileDevices_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 28-Click on link mobileDevices samsungGalaxyZfold5 - Navigate to page product.png')

"Step 29: Click on button buy3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy3'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 29-Click on button buy3.png')

"Step 30: Click on link placeAnOrder -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_placeAnOrder'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 30-Click on link placeAnOrder - Navigate to page cart.png')

"Step 31: Click on button proceedToCheckout -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 31-Click on button proceedToCheckout - Navigate to page .png')

"Step 32: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC14-Purchase Apple and Samsung Devices and Verify Checkout_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}