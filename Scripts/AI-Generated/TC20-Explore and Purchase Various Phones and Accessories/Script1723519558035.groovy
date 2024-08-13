import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to"

TrueTestScripts.navigate("")

"Step 2: Hover over item phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_home/item_phone_14'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 2-Hover over item phone.png')

"Step 3: Click on link apple2 -> Navigate to page 'category/apple'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_apple2'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 3-Click on link apple2 - Navigate to page categoryapple.png')

"Step 4: Click on button newIphone15Plus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_apple/button_newIphone15Plus_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_apple/button_newIphone15Plus_1', ['button_newIphone15Plus_class': button_newIphone15Plus_class, 'button_newIphone15Plus_internalHasText': button_newIphone15Plus_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 4-Click on button newIphone15Plus.png')

"Step 5: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_apple/button_object_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_apple/button_object_1', ['button_object_internalRoleButtonName': button_object_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 5-Click on button object.png')

"Step 6: Click on label pink"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_apple/label_pink_3"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_apple/label_pink_3', ['label_pink_for': label_pink_for, 'label_pink_internalText': label_pink_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 6-Click on label pink.png')

"Step 7: Click on label 1Tb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_apple/label_pink_3"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_apple/label_pink_3', ['label_pink_for': label_pink_for, 'label_pink_internalText': label_pink_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 7-Click on label 1Tb.png')

"Step 8: Click on button buy2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_apple/button_buy2'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 8-Click on button buy2.png')

"Step 9: Click on link iphone15ProMax -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_apple/link_iphone15ProMax'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 9-Click on link iphone15ProMax - Navigate to page product.png')

"Step 10: Click on label 256Gb1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_512Gb_12"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_512Gb_12', ['label_512Gb_for': label_512Gb_for, 'label_512Gb_internalText': label_512Gb_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 10-Click on label 256Gb1.png')

"Step 11: Click on label blueTitanium"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_blueTitanium_14"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_blueTitanium_14', ['label_blueTitanium_for': label_blueTitanium_for, 'label_blueTitanium_internalText': label_blueTitanium_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 11-Click on label blueTitanium.png')

"Step 12: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 12-Click on button buy.png')

"Step 13: Hover over item phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/item_accessories_3"
WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_product/item_accessories_3', ['item_accessories_internalHasText': item_accessories_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 13-Hover over item phone.png')

"Step 14: Click on link samsung -> Navigate to page 'category/samsung'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_samsung'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 14-Click on link samsung - Navigate to page categorysamsung.png')

"Step 15: Click on link googlePixel -> Navigate to page 'category/google-pixel'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_samsung/link_googlePixel'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 15-Click on link googlePixel - Navigate to page categorygoogle-pixel.png')

"Step 16: Click on link byTitle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/google-pixel?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_google_pixel/link_byPrice"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_google_pixel/link_byPrice', ['link_byPrice_nthChild': link_byPrice_nthChild, 'link_byPrice_internalRoleLinkName': link_byPrice_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 16-Click on link byTitle.png')

"Step 17: Click on link byPrice"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/google-pixel?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_google_pixel/link_byPrice_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_google_pixel/link_byPrice_1', ['link_byPrice_nthChild': link_byPrice_nthChild, 'link_byPrice_internalRoleLinkName': link_byPrice_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 17-Click on link byPrice.png')

"Step 18: Click on link googlePixel8 -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/google-pixel?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_google_pixel/link_googlePixel8'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 18-Click on link googlePixel8 - Navigate to page product.png')

"Step 19: Click on label 256Gb1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_blueTitanium_14"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_blueTitanium_14', ['label_blueTitanium_for': label_blueTitanium_for, 'label_blueTitanium_internalText': label_blueTitanium_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 19-Click on label 256Gb1.png')

"Step 20: Click on label black"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_black_3"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_black_3', ['label_black_for': label_black_for, 'label_black_internalText': label_black_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 20-Click on label black.png')

"Step 21: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 21-Click on button buy.png')

"Step 22: Click on link placeAnOrder -> Navigate to page 'cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_placeAnOrder'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 22-Click on link placeAnOrder - Navigate to page cart.png')

"Step 23: Click on button removeButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_removeButton_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_removeButton_1', ['button_removeButton_class': button_removeButton_class, 'button_removeButton_nth': button_removeButton_nth]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 23-Click on button removeButton.png')

"Step 24: Hover over item listitem2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/item_phone_3"
WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_cart/item_phone_3', ['item_phone_nth': item_phone_nth]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 24-Hover over item listitem2.png')

"Step 25: Click on link apple -> Navigate to page 'category/chekhly-na-iphone'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_apple'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 25-Click on link apple - Navigate to page categorychekhly-na-iphone.png')

"Step 26: Click on link byTitle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/chekhly-na-iphone?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_chekhly_na_iphone/link_byPrice_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_chekhly_na_iphone/link_byPrice_1', ['link_byPrice_nthChild': link_byPrice_nthChild, 'link_byPrice_internalRoleLinkName': link_byPrice_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 26-Click on link byTitle.png')

"Step 27: Click on link samsung -> Navigate to page 'category/power-and-cables'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/chekhly-na-iphone?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_chekhly_na_iphone/link_samsung'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 27-Click on link samsung - Navigate to page categorypower-and-cables.png')

"Step 28: Click on link samsungGalaxyZfold4SiliconCover -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/power-and-cables?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_power_and_cables/link_samsungGalaxyZfold4SiliconCover_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_power_and_cables/link_samsungGalaxyZfold4SiliconCover_1', ['link_samsungGalaxyZfold4SiliconCover_class': link_samsungGalaxyZfold4SiliconCover_class, 'link_samsungGalaxyZfold4SiliconCover_internalRoleHeadingName': link_samsungGalaxyZfold4SiliconCover_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 28-Click on link samsungGalaxyZfold4SiliconCover - Navigate to page product.png')

"Step 29: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy_1'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 29-Click on button buy.png')

"Step 30: Click on link placeAnOrder -> Navigate to page 'cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_placeAnOrder'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 30-Click on link placeAnOrder - Navigate to page cart.png')

"Step 31: Click on button proceedToCheckout -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 31-Click on button proceedToCheckout - Navigate to page .png')

"Step 32: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC20-Explore and Purchase Various Phones and Accessories_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}