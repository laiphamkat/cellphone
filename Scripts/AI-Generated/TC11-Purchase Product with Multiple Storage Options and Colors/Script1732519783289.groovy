import internal.GlobalVariable
import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.completeCheckoutShippingDetails
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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

"Step 2: Click on link productDetail (iPhone15Plus) -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_productDetail"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_productDetail', ['product_id': product_id]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 2-Click on link productDetail iPhone15Plus - Navigate to page product.png')

"Step 3: Click on button Increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_Increased'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 3-Click on button Increased.png')

"Step 4: Click on button Increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_Increased'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 4-Click on button Increased.png')

"Step 5: Click on button Buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_Buy'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 5-Click on button Buy.png')

"Step 6: Click on label colorStorageOption (128GB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_colorStorageOption"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_colorStorageOption', ['label_colorStorageOption_for': label_colorStorageOption_for, 'label_colorStorageOption_internalText': label_colorStorageOption_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 6-Click on label colorStorageOption 128GB.png')

"Step 7: Click on label colorStorageOption (Blue)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_colorStorageOption"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_colorStorageOption', ['label_colorStorageOption_for': label_colorStorageOption_for_1, 'label_colorStorageOption_internalText': label_colorStorageOption_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 7-Click on label colorStorageOption Blue.png')

"Step 8: Click on button Buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_Buy'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 8-Click on button Buy.png')

"Step 9: Click on link goToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_goToCart'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 9-Click on link goToCart.png')

"Step 10: Fill in shipping details and proceed to payment"

completeCheckoutShippingDetails.execute(data_path_0, Integer.valueOf(index_0))

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC11-Purchase Product with Multiple Storage Options and Colors_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}