import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.common.completeCheckoutShippingAddressForm
import truetest.custom.TrueTestScripts
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration

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

"Step 3: Click on link Apple -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_Apple'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on link Apple - Navigate to page category.png')

"Step 4: Click on link iPhone15 -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_iPhone15'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on link iPhone15 - Navigate to page product.png')

"Step 5: Click on label 512GB"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_512GB'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on label 512GB.png')

"Step 6: Click on label Green -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_Green'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on label Green - Navigate to page cart.png')

"Step 7: Click on button Increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_Increased'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on button Increased.png')

"Step 8: Fill out shipping address form and complete order"

completeCheckoutShippingAddressForm.execute(data_path_0, Integer.valueOf(index_0))

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Complete Order for iPhone 15 with Customization Options_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}