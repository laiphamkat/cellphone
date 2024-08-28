import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import katalon.truetest.TrueTestScripts
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

"Step 2: Click on button hotNewOffers (hotNewIphone15)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_hotNewOffers"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_hotNewOffers', ['button_hotNewOffers_class': button_hotNewOffers_class, 'button_hotNewOffers_internalHasText': button_hotNewOffers_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 2-Click on button hotNewOffers hotNewIphone15.png')

"Step 3: Click on label colorOptions (256Gb)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_colorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_colorOptions', ['label_colorOptions_for': label_colorOptions_for, 'label_colorOptions_internalText': label_colorOptions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 3-Click on label colorOptions 256Gb.png')

"Step 4: Click on label colorOptions (yellow)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_colorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_colorOptions', ['label_colorOptions_for': label_colorOptions_for_1, 'label_colorOptions_internalText': label_colorOptions_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 4-Click on label colorOptions yellow.png')

"Step 5: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 5-Click on button buy.png')

"Step 6: Click on link goToCart -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_goToCart'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 6-Click on link goToCart - Navigate to page cart.png')

"Step 7: Hover over link cartNavigation (goToCart)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/link_cartNavigation"
WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_cart/link_cartNavigation', ['link_cartNavigation_internalRoleLinkName': link_cartNavigation_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 7-Hover over link cartNavigation goToCart.png')

"Step 8: Click on span cartIndicator (shoppingCart) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/span_cartIndicator"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/span_cartIndicator', ['span_cartIndicator_internalRoleLinkName': span_cartIndicator_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 8-Click on span cartIndicator shoppingCart - Navigate to page .png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Purchase Hot New Offers from Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}