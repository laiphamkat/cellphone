import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.truetest.TrueTestScripts
import internal.GlobalVariable
import katalon.common.completeCheckoutProcessWithShippingDetails

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

WebUI.takeScreenshot(reportLocation + '/TC6/Step 2-Hover over item item.png')

"Step 3: Click on link mobileBrands (apple) -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_mobileBrands"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_mobileBrands', ['link_mobileBrands_nthChild': link_mobileBrands_nthChild, 'link_mobileBrands_internalRoleLinkName': link_mobileBrands_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 3-Click on link mobileBrands apple - Navigate to page category.png')

"Step 4: Click on link phoneCases (iphone15ClearCaseWithMagSafe) -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_phoneCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_phoneCases', ['link_phoneCases_class': link_phoneCases_class, 'link_phoneCases_internalRoleLinkName': link_phoneCases_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 4-Click on link phoneCases iphone15ClearCaseWithMagSafe - Navigate to page product.png')

"Step 5: Click on button buy3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy3'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 5-Click on button buy3.png')

"Step 6: Click on link placeAnOrder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_placeAnOrder'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 6-Click on link placeAnOrder.png')

"Step 7: Fill in shipping details and complete the checkout process"

completeCheckoutProcessWithShippingDetails.execute(data_path_0, Integer.valueOf(index_0))

"Step 8: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Purchase Phone Case and Complete Checkout_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}