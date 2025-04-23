import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

"Step 2: Hover over link accessories"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/link_accessories'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 2-Hover over link accessories.png')

"Step 3: Click on link samsung2 -> Navigate to page '/category/power-and-cables'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_samsung2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 3-Click on link samsung2 - Navigate to page categorypower-and-cables.png')

"Step 4: Click on input priceMin"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/power-and-cables?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_power_and_cables/input_priceMin'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 4-Click on input priceMin.png')

"Step 5: Enter input value in input priceMin"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/power-and-cables?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_category_power_and_cables/input_priceMin'), input_priceMin)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 5-Enter input value in input priceMin.png')

"Step 6: Click on input priceMax"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/power-and-cables?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_power_and_cables/input_priceMax'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 6-Click on input priceMax.png')

"Step 7: Enter input value in input priceMax"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/power-and-cables?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_category_power_and_cables/input_priceMax'), input_priceMax)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 7-Enter input value in input priceMax.png')

"Step 8: Click on input inStock"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/power-and-cables?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_power_and_cables/input_inStock'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 8-Click on input inStock.png')

"Step 9: Click on link sortOptions (byTitle)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/power-and-cables?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_power_and_cables/link_sortOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_power_and_cables/link_sortOptions', ['link_sortOptions_internalText': link_sortOptions_internalText, 'link_sortOptions_liNthOfType': link_sortOptions_liNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 9-Click on link sortOptions byTitle.png')

"Step 10: Click on link sortOptions (byPrice)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/power-and-cables?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_power_and_cables/link_sortOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_power_and_cables/link_sortOptions', ['link_sortOptions_internalText': link_sortOptions_internalText_1, 'link_sortOptions_liNthOfType': link_sortOptions_liNthOfType_1]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 10-Click on link sortOptions byPrice.png')

"Step 11: Click on link samsungGalaxyS23UltraSmartviewCases -> Navigate to page '/product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/power-and-cables?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_power_and_cables/link_samsungGalaxyS23UltraSmartviewCases'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 11-Click on link samsungGalaxyS23UltraSmartviewCases - Navigate to page product.png')

"Step 12: Click on button purchaseActions (increased)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_purchaseActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_purchaseActions', ['button_purchaseActions_buttonNthOfType': button_purchaseActions_buttonNthOfType, 'button_purchaseActions_buttonTitle': button_purchaseActions_buttonTitle]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 12-Click on button purchaseActions increased.png')

"Step 13: Click on button purchaseActions (buy)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_purchaseActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_purchaseActions', ['button_purchaseActions_buttonNthOfType': button_purchaseActions_buttonNthOfType_1, 'button_purchaseActions_buttonTitle': button_purchaseActions_buttonTitle_1]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 13-Click on button purchaseActions buy.png')

"Step 14: Click on link accessories -> Navigate to page '/category/accessories'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_accessories'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 14-Click on link accessories - Navigate to page categoryaccessories.png')

"Step 15: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/accessories?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_accessories/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 15-Click on button object.png')

"Step 16: Click on button addToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/accessories?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_accessories/button_addToCart'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 16-Click on button addToCart.png')

"Step 17: Hover over link iphone15SiliconeCaseWithMagSafe"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/accessories?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_category_accessories/link_iphone15SiliconeCaseWithMagSafe'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 17-Hover over link iphone15SiliconeCaseWithMagSafe.png')

"Step 18: Click on input accessoryType (iphone15)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/accessories?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_accessories/input_accessoryType"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_accessories/input_accessoryType', ['input_accessoryType_id': input_accessoryType_id, 'input_accessoryType_internalLabel': input_accessoryType_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 18-Click on input accessoryType iphone15.png')

"Step 19: Click on input accessoryType (cypress)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/accessories?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_accessories/input_accessoryType"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_accessories/input_accessoryType', ['input_accessoryType_id': input_accessoryType_id_1, 'input_accessoryType_internalLabel': input_accessoryType_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 19-Click on input accessoryType cypress.png')

"Step 20: Click on button buy -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/accessories?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_accessories/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 20-Click on button buy - Navigate to page .png')

"Step 21: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Purchase Samsung Accessories with Price Filtering_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}