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

WebUI.takeScreenshot(reportLocation + '/TC114/Step 2-Hover over item productCategories Phone.png')

"Step 3: Click on link brandNames (Apple) -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_brandNames"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_brandNames', ['link_brandNames_nthChild': link_brandNames_nthChild, 'link_brandNames_internalRoleLinkName': link_brandNames_internalRoleLinkName, 'link_brandNames_category_id': link_brandNames_category_id]))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 3-Click on link brandNames Apple - Navigate to page category.png')

"Step 4: Click on button addToCartMultiple (NewIphone15Plus)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_addToCartMultiple"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_addToCartMultiple', ['button_addToCartMultiple_class': button_addToCartMultiple_class, 'button_addToCartMultiple_internalHasText': button_addToCartMultiple_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 4-Click on button addToCartMultiple NewIphone15Plus.png')

"Step 5: Click on button quantityIncrease (Increased)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_quantityIncrease"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_quantityIncrease', ['button_quantityIncrease_internalRoleButtonName': button_quantityIncrease_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 5-Click on button quantityIncrease Increased.png')

"Step 6: Click on label productAttributes (ColorPink)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_productAttributes"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_productAttributes', ['label_productAttributes_for': label_productAttributes_for, 'label_productAttributes_internalText': label_productAttributes_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 6-Click on label productAttributes ColorPink.png')

"Step 7: Click on label productAttributes (256GB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_productAttributes"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_productAttributes', ['label_productAttributes_for': label_productAttributes_for_1, 'label_productAttributes_internalText': label_productAttributes_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 7-Click on label productAttributes 256GB.png')

"Step 8: Click on button Buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_Buy'))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 8-Click on button Buy.png')

"Step 9: Click on link productModels (Iphone15ProMax) -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_productModels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_productModels', ['link_productModels_class': link_productModels_class, 'link_productModels_internalRoleLinkName': link_productModels_internalRoleLinkName, 'link_productModels_product_id': link_productModels_product_id]))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 9-Click on link productModels Iphone15ProMax - Navigate to page product.png')

"Step 10: Click on label storageOptions (StorageGB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_storageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_storageOptions', ['label_storageOptions_for': label_storageOptions_for, 'label_storageOptions_internalText': label_storageOptions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 10-Click on label storageOptions StorageGB.png')

"Step 11: Click on label storageOptions (BlueTitanium2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_storageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_storageOptions', ['label_storageOptions_for': label_storageOptions_for_1, 'label_storageOptions_internalText': label_storageOptions_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 11-Click on label storageOptions BlueTitanium2.png')

"Step 12: Click on button Buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 12-Click on button Buy.png')

"Step 13: Hover over item productCategories (phone)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/item_productCategories"
WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_product/item_productCategories', ['item_productCategories_internalHasText': item_productCategories_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 13-Hover over item productCategories phone.png')

"Step 14: Click on link brandNames (Samsung) -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/link_brandNames"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_brandNames', ['link_brandNames_nthChild': link_brandNames_nthChild_1, 'link_brandNames_internalRoleLinkName': link_brandNames_internalRoleLinkName_1, 'link_brandNames_category_id': link_brandNames_category_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 14-Click on link brandNames Samsung - Navigate to page category.png')

"Step 15: Click on link brandLinks (googlePixel)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_brandLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_brandLinks', ['link_brandLinks_class': link_brandLinks_class, 'link_brandLinks_internalRoleLinkName': link_brandLinks_internalRoleLinkName, 'link_brandLinks_category_id': link_brandLinks_category_id]))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 15-Click on link brandLinks googlePixel.png')

"Step 16: Click on link sortOptions (byTitle)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_sortOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_sortOptions', ['link_sortOptions_nthChild': link_sortOptions_nthChild, 'link_sortOptions_internalRoleLinkName': link_sortOptions_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 16-Click on link sortOptions byTitle.png')

"Step 17: Click on link sortOptions (ByPrice)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_sortOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_sortOptions', ['link_sortOptions_nthChild': link_sortOptions_nthChild_1, 'link_sortOptions_internalRoleLinkName': link_sortOptions_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 17-Click on link sortOptions ByPrice.png')

"Step 18: Click on link productModels (GooglePixel82) -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_productModels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_productModels', ['link_productModels_class': link_productModels_class_1, 'link_productModels_internalRoleLinkName': link_productModels_internalRoleLinkName_1, 'link_productModels_product_id': link_productModels_product_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 18-Click on link productModels GooglePixel82 - Navigate to page product.png')

"Step 19: Click on label storageOptions (Storage256GB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_storageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_storageOptions', ['label_storageOptions_for': label_storageOptions_for_2, 'label_storageOptions_internalText': label_storageOptions_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 19-Click on label storageOptions Storage256GB.png')

"Step 20: Click on label storageOptions (ColorBlack)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_storageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_storageOptions', ['label_storageOptions_for': label_storageOptions_for_3, 'label_storageOptions_internalText': label_storageOptions_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 20-Click on label storageOptions ColorBlack.png')

"Step 21: Click on button Buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 21-Click on button Buy.png')

"Step 22: Click on link placeOrder -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_placeAnOrder'))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 22-Click on link placeOrder - Navigate to page cart.png')

"Step 23: Click on button Remove"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_Remove'))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 23-Click on button Remove.png')

"Step 24: Hover over item CartItems"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_cart/item_CartItems'))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 24-Hover over item CartItems.png')

"Step 25: Click on link Apple -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_Apple'))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 25-Click on link Apple - Navigate to page category.png')

"Step 26: Click on link sortOptions (byTitle)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_sortOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_sortOptions', ['link_sortOptions_nthChild': link_sortOptions_nthChild_2, 'link_sortOptions_internalRoleLinkName': link_sortOptions_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 26-Click on link sortOptions byTitle.png')

"Step 27: Click on link brandLinks (Samsung)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_brandLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_brandLinks', ['link_brandLinks_class': link_brandLinks_class_1, 'link_brandLinks_internalRoleLinkName': link_brandLinks_internalRoleLinkName_1, 'link_brandLinks_category_id': link_brandLinks_category_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 27-Click on link brandLinks Samsung.png')

"Step 28: Click on link productModels (SamsungGalaxyZFold4) -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_productModels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_productModels', ['link_productModels_class': link_productModels_class_2, 'link_productModels_product_id': link_productModels_product_id_2]))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 28-Click on link productModels SamsungGalaxyZFold4 - Navigate to page product.png')

"Step 29: Click on button Buy4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_Buy4'))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 29-Click on button Buy4.png')

"Step 30: Click on link placeOrder -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_placeAnOrder'))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 30-Click on link placeOrder - Navigate to page cart.png')

"Step 31: Click on button ProceedToCheckout -> Navigate to page 'checkout/info'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_ProceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 31-Click on button ProceedToCheckout - Navigate to page checkoutinfo.png')

"Step 32: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC114-Verify Checkout Information after Multiple Product Selections_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}