import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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

"Step 2: Click on link iphone15Pro (iPhone15Pro) -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_iphone15Pro"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_iphone15Pro', ['link_iphone15Pro_class': link_iphone15Pro_class, 'link_iphone15Pro_internalRoleLinkName': link_iphone15Pro_internalRoleLinkName, 'link_iphone15Pro_nth': link_iphone15Pro_nth, 'product_id': product_id]))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 2-Click on link iphone15Pro iPhone15Pro - Navigate to page product.png')

"Step 3: Click on label colorOptions (BlueTitanium)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_colorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_colorOptions', ['label_colorOptions_for': label_colorOptions_for, 'label_colorOptions_internalText': label_colorOptions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 3-Click on label colorOptions BlueTitanium.png')

"Step 4: Click on label colorOptions (BlueTitanium)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_colorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_colorOptions', ['label_colorOptions_for': label_colorOptions_for_1, 'label_colorOptions_internalText': label_colorOptions_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 4-Click on label colorOptions BlueTitanium.png')

"Step 5: Click on button Buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_Buy'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 5-Click on button Buy.png')

"Step 6: Click on button Buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_Buy'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 6-Click on button Buy.png')

"Step 7: Hover over link GoToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_product/link_GoToCart'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 7-Hover over link GoToCart.png')

"Step 8: Click on span dynamicObject (Zero) -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/span_dynamicObject', ['span_dynamicObject_internalRoleLinkName': span_dynamicObject_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 8-Click on span dynamicObject Zero - Navigate to page cart.png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC26-Buy Iphone 15 Pro and Verify Cart_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}