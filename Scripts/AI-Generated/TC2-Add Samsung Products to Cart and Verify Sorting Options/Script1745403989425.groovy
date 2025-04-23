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

"Step 2: Hover over span object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/span_object'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 2-Hover over span object.png')

"Step 3: Click on link samsung -> Navigate to page '/category/samsung'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_samsung'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 3-Click on link samsung - Navigate to page categorysamsung.png')

"Step 4: Click on button addToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_samsung/button_addToCart'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Click on button addToCart.png')

"Step 5: Click on input storageColorOption ( 512Gb)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_samsung/input_storageColorOption"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_samsung/input_storageColorOption', ['input_storageColorOption_id': input_storageColorOption_id, 'input_storageColorOption_internalLabel': input_storageColorOption_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Click on input storageColorOption  512Gb.png')

"Step 6: Click on input storageColorOption (white)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_samsung/input_storageColorOption"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_samsung/input_storageColorOption', ['input_storageColorOption_id': input_storageColorOption_id_1, 'input_storageColorOption_internalLabel': input_storageColorOption_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 6-Click on input storageColorOption white.png')

"Step 7: Click on input storageColorOption (black)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_samsung/input_storageColorOption"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_samsung/input_storageColorOption', ['input_storageColorOption_id': input_storageColorOption_id_2, 'input_storageColorOption_internalLabel': input_storageColorOption_internalLabel_2]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 7-Click on input storageColorOption black.png')

"Step 8: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_samsung/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 8-Click on button buy.png')

"Step 9: Hover over link samsungGalaxyZfold5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_category_samsung/link_samsungGalaxyZfold5'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 9-Hover over link samsungGalaxyZfold5.png')

"Step 10: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_samsung/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 10-Click on button object.png')

"Step 11: Click on link sortOptions (byTitle)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_samsung/link_sortOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_samsung/link_sortOptions', ['link_sortOptions_internalText': link_sortOptions_internalText, 'link_sortOptions_liNthOfType': link_sortOptions_liNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 11-Click on link sortOptions byTitle.png')

"Step 12: Click on link sortOptions (byPrice)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_samsung/link_sortOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_samsung/link_sortOptions', ['link_sortOptions_internalText': link_sortOptions_internalText_1, 'link_sortOptions_liNthOfType': link_sortOptions_liNthOfType_1]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 12-Click on link sortOptions byPrice.png')

"Step 13: Hover over link accessories"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_category_samsung/link_accessories'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 13-Hover over link accessories.png')

"Step 14: Click on link samsung -> Navigate to page '/category/power-and-cables'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_samsung/link_samsung'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 14-Click on link samsung - Navigate to page categorypower-and-cables.png')

"Step 15: Click on link home -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/power-and-cables?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_power_and_cables/link_home'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 15-Click on link home - Navigate to page .png')

"Step 16: Click on link iphone15Plus -> Navigate to page '/product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_iphone15Plus'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 16-Click on link iphone15Plus - Navigate to page product.png')

"Step 17: Click on input storageOption ( 256Gb)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/input_storageOption"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/input_storageOption', ['input_storageOption_id': input_storageOption_id, 'input_storageOption_internalLabel': input_storageOption_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 17-Click on input storageOption  256Gb.png')

"Step 18: Click on input storageOption (yellow)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/input_storageOption"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/input_storageOption', ['input_storageOption_id': input_storageOption_id_1, 'input_storageOption_internalLabel': input_storageOption_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 18-Click on input storageOption yellow.png')

"Step 19: Click on input storageOption ( 512Gb) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/input_storageOption"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/input_storageOption', ['input_storageOption_id': input_storageOption_id_2, 'input_storageOption_internalLabel': input_storageOption_internalLabel_2]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 19-Click on input storageOption  512Gb - Navigate to page .png')

"Step 20: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Add Samsung Products to Cart and Verify Sorting Options_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}