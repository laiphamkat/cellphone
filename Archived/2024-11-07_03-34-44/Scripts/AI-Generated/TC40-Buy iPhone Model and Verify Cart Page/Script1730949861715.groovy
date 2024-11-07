import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on link iphoneModels (iPhone15Pro) -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_iphoneModels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_iphoneModels', ['link_iphoneModels_class': link_iphoneModels_class, 'link_iphoneModels_internalRoleLinkName': link_iphoneModels_internalRoleLinkName, 'link_iphoneModels_nth': link_iphoneModels_nth, 'link_iphoneModels_product_id': link_iphoneModels_product_id]))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 2-Click on link iphoneModels iPhone15Pro - Navigate to page product.png')

"Step 3: Click on label productSpecifications (BlueTitanium)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_productSpecifications"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_productSpecifications', ['label_productSpecifications_for': label_productSpecifications_for, 'label_productSpecifications_internalText': label_productSpecifications_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 3-Click on label productSpecifications BlueTitanium.png')

"Step 4: Click on label productSpecifications (BlueTitanium)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_productSpecifications"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_productSpecifications', ['label_productSpecifications_for': label_productSpecifications_for_1, 'label_productSpecifications_internalText': label_productSpecifications_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 4-Click on label productSpecifications BlueTitanium.png')

"Step 5: Click on button Buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_Buy'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 5-Click on button Buy.png')

"Step 6: Click on button Buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_Buy'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 6-Click on button Buy.png')

"Step 7: Hover over link GoToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_product/link_GoToCart'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 7-Hover over link GoToCart.png')

"Step 8: Click on span ProductLink -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/span_ProductLink'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 8-Click on span ProductLink - Navigate to page cart.png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC40-Buy iPhone Model and Verify Cart Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}