import internal.GlobalVariable
import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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

"Step 2: Click on button hotNewiPhone15"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_hotNewiPhone15_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_hotNewiPhone15_1', ['button_hotNewiPhone15_class': button_hotNewiPhone15_class, 'button_hotNewiPhone15_internalHasText': button_hotNewiPhone15_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 2-Click on button hotNewiPhone15.png')

"Step 3: Click on label 256Gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_white_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_white_1', ['label_white_for': label_white_for, 'label_white_internalText': label_white_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 3-Click on label 256Gb.png')

"Step 4: Click on label yellow"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_yellow_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_yellow_1', ['label_yellow_for': label_yellow_for, 'label_yellow_internalText': label_yellow_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 4-Click on label yellow.png')

"Step 5: Click on button dialogButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_dialogButton'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 5-Click on button dialogButton.png')

"Step 6: Click on link goToCart -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_goToCart'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 6-Click on link goToCart - Navigate to page cart.png')

"Step 7: Hover over link goToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/link_goToCart"
WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_cart/link_goToCart', ['link_goToCart_internalRoleLinkName': link_goToCart_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 7-Hover over link goToCart.png')

"Step 8: Click on span object -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/span_object"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/span_object', ['span_object_internalRoleLinkName': span_object_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 8-Click on span object - Navigate to page .png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC7-Purchase Hot New iPhone 15 and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}