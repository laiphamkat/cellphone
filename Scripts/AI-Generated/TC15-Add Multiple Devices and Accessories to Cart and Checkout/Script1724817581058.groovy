import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import katalon.truetest.TrueTestScripts
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

"Step 2: Hover over item productCategories (phone)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_home/item_productCategories'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 2-Hover over item productCategories phone.png')

"Step 3: Click on link apple2 -> Navigate to page '/category/apple'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_apple2'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 3-Click on link apple2 - Navigate to page categoryapple.png')

"Step 4: Click on button newAppleDevices (newIphone15Plus)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_apple/button_newAppleDevices"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_apple/button_newAppleDevices', ['button_newAppleDevices_class': button_newAppleDevices_class, 'button_newAppleDevices_internalHasText': button_newAppleDevices_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 4-Click on button newAppleDevices newIphone15Plus.png')

"Step 5: Click on button increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_apple/button_increased'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 5-Click on button increased.png')

"Step 6: Click on label colorStorageOptions (pink)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_apple/label_colorStorageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_apple/label_colorStorageOptions', ['label_colorStorageOptions_for': label_colorStorageOptions_for, 'label_colorStorageOptions_internalText': label_colorStorageOptions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 6-Click on label colorStorageOptions pink.png')

"Step 7: Click on label colorStorageOptions (1Tb)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_apple/label_colorStorageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_apple/label_colorStorageOptions', ['label_colorStorageOptions_for': label_colorStorageOptions_for_1, 'label_colorStorageOptions_internalText': label_colorStorageOptions_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 7-Click on label colorStorageOptions 1Tb.png')

"Step 8: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_apple/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 8-Click on button buy.png')

"Step 9: Click on link iphone15ProMax -> Navigate to page '/product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_apple/link_iphone15ProMax'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 9-Click on link iphone15ProMax - Navigate to page product.png')

"Step 10: Click on label colorStorageOptions (256Gb)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_colorStorageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_colorStorageOptions', ['label_colorStorageOptions_for': label_colorStorageOptions_for_2, 'label_colorStorageOptions_internalText': label_colorStorageOptions_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 10-Click on label colorStorageOptions 256Gb.png')

"Step 11: Click on label colorStorageOptions (blueTitanium)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_colorStorageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_colorStorageOptions', ['label_colorStorageOptions_for': label_colorStorageOptions_for_3, 'label_colorStorageOptions_internalText': label_colorStorageOptions_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 11-Click on label colorStorageOptions blueTitanium.png')

"Step 12: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 12-Click on button buy.png')

"Step 13: Hover over item productCategories (phone)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/item_productCategories"
WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_product/item_productCategories', ['item_productCategories_internalHasText': item_productCategories_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 13-Hover over item productCategories phone.png')

"Step 14: Click on link brand (samsung) -> Navigate to page '/category/samsung'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_brand'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 14-Click on link brand samsung - Navigate to page categorysamsung.png')

"Step 15: Click on link googlePixel -> Navigate to page '/category/google-pixel'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_samsung/link_googlePixel'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 15-Click on link googlePixel - Navigate to page categorygoogle-pixel.png')

"Step 16: Click on link sortOptions (byTitle)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/google-pixel?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_google_pixel/link_sortOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_google_pixel/link_sortOptions', ['link_sortOptions_nthChild': link_sortOptions_nthChild, 'link_sortOptions_internalRoleLinkName': link_sortOptions_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 16-Click on link sortOptions byTitle.png')

"Step 17: Click on link sortOptions (byPrice)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/google-pixel?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_google_pixel/link_sortOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_google_pixel/link_sortOptions', ['link_sortOptions_nthChild': link_sortOptions_nthChild_1, 'link_sortOptions_internalRoleLinkName': link_sortOptions_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 17-Click on link sortOptions byPrice.png')

"Step 18: Click on link googlePixel8 -> Navigate to page '/product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/google-pixel?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_google_pixel/link_googlePixel8'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 18-Click on link googlePixel8 - Navigate to page product.png')

"Step 19: Click on label colorStorageOptions (256Gb)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_colorStorageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_colorStorageOptions', ['label_colorStorageOptions_for': label_colorStorageOptions_for_4, 'label_colorStorageOptions_internalText': label_colorStorageOptions_internalText_4]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 19-Click on label colorStorageOptions 256Gb.png')

"Step 20: Click on label colorStorageOptions (black)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_colorStorageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_colorStorageOptions', ['label_colorStorageOptions_for': label_colorStorageOptions_for_5, 'label_colorStorageOptions_internalText': label_colorStorageOptions_internalText_5]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 20-Click on label colorStorageOptions black.png')

"Step 21: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 21-Click on button buy.png')

"Step 22: Click on link placeAnOrder -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_placeAnOrder'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 22-Click on link placeAnOrder - Navigate to page cart.png')

"Step 23: Click on button remove"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_remove'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 23-Click on button remove.png')

"Step 24: Hover over item listItem"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_cart/item_listItem'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 24-Hover over item listItem.png')

"Step 25: Click on link apple -> Navigate to page '/category/chekhly-na-iphone'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_apple'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 25-Click on link apple - Navigate to page categorychekhly-na-iphone.png')

"Step 26: Click on link sortOptions (byTitle)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/chekhly-na-iphone?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_chekhly_na_iphone/link_sortOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_chekhly_na_iphone/link_sortOptions', ['link_sortOptions_nthChild': link_sortOptions_nthChild_2, 'link_sortOptions_internalRoleLinkName': link_sortOptions_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 26-Click on link sortOptions byTitle.png')

"Step 27: Click on link samsung -> Navigate to page '/category/power-and-cables'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/chekhly-na-iphone?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_chekhly_na_iphone/link_samsung'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 27-Click on link samsung - Navigate to page categorypower-and-cables.png')

"Step 28: Click on link samsungAccessories (samsungGalaxyZfold4SiliconCover) -> Navigate to page '/product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/power-and-cables?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_power_and_cables/link_samsungAccessories"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_power_and_cables/link_samsungAccessories', ['link_samsungAccessories_class': link_samsungAccessories_class, 'link_samsungAccessories_internalRoleHeadingName': link_samsungAccessories_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 28-Click on link samsungAccessories samsungGalaxyZfold4SiliconCover - Navigate to page product.png')

"Step 29: Click on button buy2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy2'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 29-Click on button buy2.png')

"Step 30: Click on link placeAnOrder -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_placeAnOrder'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 30-Click on link placeAnOrder - Navigate to page cart.png')

"Step 31: Click on button proceedToCheckout -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 31-Click on button proceedToCheckout - Navigate to page .png')

"Step 32: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC15-Add Multiple Devices and Accessories to Cart and Checkout_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}