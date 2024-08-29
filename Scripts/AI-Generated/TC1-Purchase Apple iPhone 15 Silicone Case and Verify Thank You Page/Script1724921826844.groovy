import katalon.common.completeCheckoutProcessWithShippingDetails
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts
import internal.GlobalVariable
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

"Step 2: Hover over item item"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_item'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Hover over item item.png')

"Step 3: Click on link apple -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_apple'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on link apple - Navigate to page category.png')

"Step 4: Click on button newIphone15SiliconeCase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_newIphone15SiliconeCase'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on button newIphone15SiliconeCase.png')

"Step 5: Click on label iphone15Plus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/label_iphone15Plus'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on label iphone15Plus.png')

"Step 6: Click on label cypress"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/label_cypress'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on label cypress.png')

"Step 7: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on button buy.png')

"Step 8: Click on link cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_cart'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on link cart.png')

"Step 9: Fill in shipping details and complete the checkout process"

completeCheckoutProcessWithShippingDetails.execute(data_path_0, Integer.valueOf(index_0))

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Purchase Apple iPhone 15 Silicone Case and Verify Thank You Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}