import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.truetest.TrueTestScripts
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

"Step 2: Click on button hotNewIphone (hotNewIphone15)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_hotNewIphone"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_hotNewIphone', ['button_hotNewIphone_class': button_hotNewIphone_class, 'button_hotNewIphone_internalHasText': button_hotNewIphone_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 2-Click on button hotNewIphone hotNewIphone15.png')

"Step 3: Click on label storageColor (256Gb)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_storageColor"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_storageColor', ['label_storageColor_for': label_storageColor_for, 'label_storageColor_internalText': label_storageColor_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 3-Click on label storageColor 256Gb.png')

"Step 4: Click on label storageColor (yellow)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_storageColor"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_storageColor', ['label_storageColor_for': label_storageColor_for_1, 'label_storageColor_internalText': label_storageColor_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 4-Click on label storageColor yellow.png')

"Step 5: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 5-Click on button buy.png')

"Step 6: Click on link goToCart (goToCart) -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_goToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_goToCart', ['link_goToCart_internalRoleLinkName': link_goToCart_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 6-Click on link goToCart goToCart - Navigate to page cart.png')

"Step 7: Hover over link goToCart (goToCart)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/link_goToCart"
WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_cart/link_goToCart', ['link_goToCart_internalRoleLinkName': link_goToCart_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 7-Hover over link goToCart goToCart.png')

"Step 8: Click on span shoppingCart (shoppingCart) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/span_shoppingCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/span_shoppingCart', ['span_shoppingCart_internalRoleLinkName': span_shoppingCart_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 8-Click on span shoppingCart shoppingCart - Navigate to page .png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Purchase New iPhone and Verify Checkout_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}