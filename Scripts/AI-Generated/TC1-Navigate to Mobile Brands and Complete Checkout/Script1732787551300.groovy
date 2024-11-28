import truetest.common.completeCheckoutProcessWithShippingDetails
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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

"Step 2: Hover over item object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_object'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Hover over item object.png')

"Step 3: Click on link mobileBrands (GooglePixel) -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_mobileBrands"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_mobileBrands', ['link_mobileBrands_nthChild': link_mobileBrands_nthChild, 'category_id': category_id]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on link mobileBrands GooglePixel - Navigate to page category.png')

"Step 4: Click on button productDetails (GooglePixel7Pro)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_productDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_productDetails', ['button_productDetails_internalHasText': button_productDetails_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on button productDetails GooglePixel7Pro.png')

"Step 5: Click on link cartNavigation (GoToCart)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_cartNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_cartNavigation', ['link_cartNavigation_internalRoleLinkName': link_cartNavigation_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on link cartNavigation GoToCart.png')

"Step 6: Fill in shipping details and complete the checkout process"

completeCheckoutProcessWithShippingDetails.execute(data_path_0, Integer.valueOf(index_0))

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Navigate to Mobile Brands and Complete Checkout_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}