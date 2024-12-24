import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.fillShippingAddressAndProceed
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

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_object2'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 2-Hover over item object.png')

"Step 3: Click on link productBrands (Apple3) -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_productBrands"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_productBrands', ['link_productBrands_nthChild': link_productBrands_nthChild, 'link_productBrands_internalRoleLinkName': link_productBrands_internalRoleLinkName, 'category_id': category_id]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 3-Click on link productBrands Apple3 - Navigate to page category.png')

"Step 4: Click on link productDetails (iPhone15Case) -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_productDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_productDetails', ['link_productDetails_class': link_productDetails_class, 'link_productDetails_internalRoleHeadingName': link_productDetails_internalRoleHeadingName, 'product_id': product_id]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 4-Click on link productDetails iPhone15Case - Navigate to page product.png')

"Step 5: Click on label productAttributes (ProductName)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_productAttributes"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_productAttributes', ['label_productAttributes_for': label_productAttributes_for, 'label_productAttributes_internalText': label_productAttributes_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 5-Click on label productAttributes ProductName.png')

"Step 6: Click on label productAttributes (colorStorageOptions5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_productAttributes"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_productAttributes', ['label_productAttributes_for': label_productAttributes_for_1, 'label_productAttributes_internalText': label_productAttributes_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 6-Click on label productAttributes colorStorageOptions5.png')

"Step 7: Click on link cartNavigationMultiple (GoToCart5) -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/link_cartNavigationMultiple"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_cartNavigationMultiple', ['link_cartNavigationMultiple_internalRoleLinkName': link_cartNavigationMultiple_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 7-Click on link cartNavigationMultiple GoToCart5 - Navigate to page cart.png')

"Step 8: Click on button quantityAdjustment (IncreaseQuantity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_quantityAdjustment_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_quantityAdjustment_1', ['button_quantityAdjustment_nthChild': button_quantityAdjustment_nthChild, 'button_quantityAdjustment_class': button_quantityAdjustment_class]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 8-Click on button quantityAdjustment IncreaseQuantity.png')

"Step 9: Complete shipping address form after entering email and continue to payment."

fillShippingAddressAndProceed.execute(data_path_0, Integer.valueOf(index_0))

"Step 10: Click on button CompleteOrder3 -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 10-Click on button CompleteOrder3 - Navigate to page .png')

"Step 11: Hover over item object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_object2'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 11-Hover over item object2.png')

"Step 12: Click on link productBrands (Apple3) -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_productBrands"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_productBrands', ['link_productBrands_nthChild': link_productBrands_nthChild_1, 'link_productBrands_internalRoleLinkName': link_productBrands_internalRoleLinkName_1, 'category_id': category_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 12-Click on link productBrands Apple3 - Navigate to page category.png')

"Step 13: Click on label storageColorCapacity (storageColorOptions)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_storageColorCapacity"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_storageColorCapacity', ['label_storageColorCapacity_for': label_storageColorCapacity_for, 'label_storageColorCapacity_internalText': label_storageColorCapacity_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 13-Click on label storageColorCapacity storageColorOptions.png')

"Step 14: Click on label winterBlue2 -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/label_winterBlue2'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 14-Click on label winterBlue2 - Navigate to page cart.png')

"Step 15: Click on button quantityAdjustment (IncreaseQuantity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_quantityAdjustment_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_quantityAdjustment_1', ['button_quantityAdjustment_nthChild': button_quantityAdjustment_nthChild_1, 'button_quantityAdjustment_class': button_quantityAdjustment_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 15-Click on button quantityAdjustment IncreaseQuantity.png')

"Step 16: Complete shipping address form after entering email and continue to payment."

fillShippingAddressAndProceed.execute(data_path_1, Integer.valueOf(index_1))

"Step 17: Click on button CompleteOrder -> Navigate to page 'thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 17-Click on button CompleteOrder - Navigate to page thank-you.png')

"Step 18: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC22-Complete Checkout for Multiple Products with Attributes_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}