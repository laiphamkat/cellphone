import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on link hotNewProduct (HotNewProduct) -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_hotNewProduct"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_hotNewProduct', ['product_id': product_id]))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 2-Click on link hotNewProduct HotNewProduct - Navigate to page product.png')

"Step 3: Hover over item Product"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_product/item_Product'))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 3-Hover over item Product.png')

"Step 4: Click on link productCategory (AppleCategory) -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/link_productCategory"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_productCategory', ['category_id': category_id]))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 4-Click on link productCategory AppleCategory - Navigate to page category.png')

"Step 5: Click on link brandCategories (AppleCategory)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_brandCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_brandCategories', ['link_brandCategories_class': link_brandCategories_class, 'link_brandCategories_internalRoleLinkName': link_brandCategories_internalRoleLinkName, 'category_id': category_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 5-Click on link brandCategories AppleCategory.png')

"Step 6: Click on button mobileDevices (Sale20WUSBAdapter)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_mobileDevices"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_mobileDevices', ['button_mobileDevices_class': button_mobileDevices_class, 'button_mobileDevices_internalHasText': button_mobileDevices_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 6-Click on button mobileDevices Sale20WUSBAdapter.png')

"Step 7: Hover over item object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_category/item_object'))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 7-Hover over item object.png')

"Step 8: Click on link productCategories (Accessories)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_productCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_productCategories', ['link_productCategories_class': link_productCategories_class, 'link_productCategories_internalRoleLinkName': link_productCategories_internalRoleLinkName, 'category_id': category_id_2]))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 8-Click on link productCategories Accessories.png')

"Step 9: Hover over item object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_category/item_object'))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 9-Hover over item object.png')

"Step 10: Click on link productCategories (Accessories)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_productCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_productCategories', ['link_productCategories_class': link_productCategories_class_1, 'link_productCategories_internalRoleLinkName': link_productCategories_internalRoleLinkName_1, 'category_id': category_id_3]))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 10-Click on link productCategories Accessories.png')

"Step 11: Click on button mobileDevices (SamsungGalaxyS23Ultra)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_mobileDevices"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_mobileDevices', ['button_mobileDevices_class': button_mobileDevices_class_1, 'button_mobileDevices_internalHasText': button_mobileDevices_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 11-Click on button mobileDevices SamsungGalaxyS23Ultra.png')

"Step 12: Click on link KCellphoneShop -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_KCellphoneShop'))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 12-Click on link KCellphoneShop - Navigate to page .png')

"Step 13: Click on button addToCart (AddToCart2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_addToCart', ['button_addToCart_class': button_addToCart_class, 'button_addToCart_internalHasText': button_addToCart_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 13-Click on button addToCart AddToCart2.png')

"Step 14: Click on label colorStorageOptions (iPhone15)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_colorStorageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_colorStorageOptions', ['label_colorStorageOptions_for': label_colorStorageOptions_for, 'label_colorStorageOptions_internalText': label_colorStorageOptions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 14-Click on label colorStorageOptions iPhone15.png')

"Step 15: Click on button purchaseOptions (Buy)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_purchaseOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_purchaseOptions', ['button_purchaseOptions_internalRoleButtonName': button_purchaseOptions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 15-Click on button purchaseOptions Buy.png')

"Step 16: Click on button ProductAddedToCart -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_ProductAddedToCart'))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 16-Click on button ProductAddedToCart - Navigate to page .png')

"Step 17: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC36-Add Hot New Products to Cart and Verify Homepage_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}