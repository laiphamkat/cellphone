import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.common.fillShippingDetailsAndCompleteOrder
import com.kms.katalon.core.configuration.RunConfiguration
import katalon.truetest.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Hover over item item"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_item'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 2-Hover over item item.png')

"Step 3: Click on link apple -> Navigate to page '/category/chekhly-na-iphone'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_apple'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 3-Click on link apple - Navigate to page categorychekhly-na-iphone.png')

"Step 4: Click on button newIphone15SiliconeCase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/chekhly-na-iphone?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_chekhly_na_iphone/button_newIphone15SiliconeCase'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 4-Click on button newIphone15SiliconeCase.png')

"Step 5: Click on label iphoneModelColor (iphone15Plus)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/chekhly-na-iphone?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_chekhly_na_iphone/label_iphoneModelColor"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_chekhly_na_iphone/label_iphoneModelColor', ['label_iphoneModelColor_for': label_iphoneModelColor_for, 'label_iphoneModelColor_internalText': label_iphoneModelColor_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 5-Click on label iphoneModelColor iphone15Plus.png')

"Step 6: Click on label iphoneModelColor (cypress)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/chekhly-na-iphone?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_chekhly_na_iphone/label_iphoneModelColor"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_chekhly_na_iphone/label_iphoneModelColor', ['label_iphoneModelColor_for': label_iphoneModelColor_for_1, 'label_iphoneModelColor_internalText': label_iphoneModelColor_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 6-Click on label iphoneModelColor cypress.png')

"Step 7: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/chekhly-na-iphone?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_chekhly_na_iphone/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 7-Click on button buy.png')

"Step 8: Click on link cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/chekhly-na-iphone?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_chekhly_na_iphone/link_cart'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 8-Click on link cart.png')

"Step 9: Fill shipping details and complete order in checkout"

fillShippingDetailsAndCompleteOrder.execute(data_path_0, Integer.valueOf(index_0))

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Order New iPhone 15 Silicone Case with Color Selection_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}