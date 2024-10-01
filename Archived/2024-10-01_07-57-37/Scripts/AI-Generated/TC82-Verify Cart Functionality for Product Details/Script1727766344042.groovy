import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
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

"Step 2: Click on link productDetail (iPhone15Pro) -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_productDetail"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_productDetail', ['link_productDetail_class': link_productDetail_class, 'link_productDetail_nth': link_productDetail_nth, 'link_productDetail_internalRoleLinkName': link_productDetail_internalRoleLinkName, 'link_productDetail_product_id': link_productDetail_product_id]))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 2-Click on link productDetail iPhone15Pro - Navigate to page product.png')

"Step 3: Click on label colorStorageOption (BlueTitanium)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_colorStorageOption"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_colorStorageOption', ['label_colorStorageOption_for': label_colorStorageOption_for, 'label_colorStorageOption_internalText': label_colorStorageOption_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 3-Click on label colorStorageOption BlueTitanium.png')

"Step 4: Click on label colorStorageOption (BlueTitanium)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_colorStorageOption"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_colorStorageOption', ['label_colorStorageOption_for': label_colorStorageOption_for_1, 'label_colorStorageOption_internalText': label_colorStorageOption_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 4-Click on label colorStorageOption BlueTitanium.png')

"Step 5: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 5-Click on button buy.png')

"Step 6: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 6-Click on button buy.png')

"Step 7: Hover over link GoToCart2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_product/link_GoToCart2'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 7-Hover over link GoToCart2.png')

"Step 8: Click on span dynamicObject (ProductLink) -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/span_dynamicObject', ['span_dynamicObject_internalRoleLinkName': span_dynamicObject_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 8-Click on span dynamicObject ProductLink - Navigate to page cart.png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC82-Verify Cart Functionality for Product Details_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}