import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.common.proceedToCheckoutFillShippingAndCompleteOrder
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

"Step 2: Hover over item object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_object'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 2-Hover over item object.png')

"Step 3: Click on link Apple2 -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_Apple2'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 3-Click on link Apple2 - Navigate to page category.png')

"Step 4: Click on link accessoryProducts (iPhone15ClearCase) -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_accessoryProducts"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_accessoryProducts', ['link_accessoryProducts_class': link_accessoryProducts_class, 'link_accessoryProducts_internalRoleLinkName': link_accessoryProducts_internalRoleLinkName, 'product_id': product_id]))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 4-Click on link accessoryProducts iPhone15ClearCase - Navigate to page product.png')

"Step 5: Click on button Buy2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_Buy2'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 5-Click on button Buy2.png')

"Step 6: Click on link PlaceAnOrder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_PlaceAnOrder'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 6-Click on link PlaceAnOrder.png')

"Step 7: Complete shipping information and finalize order at checkout"

proceedToCheckoutFillShippingAndCompleteOrder.execute(data_path_0, Integer.valueOf(index_0))

"Step 8: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC34-Order Apple Accessories and Verify Homepage_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}