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

"Step 2: Click on link iphone15Pro -> Navigate to page '/product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_iphone15Pro_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_iphone15Pro_1', ['link_iphone15Pro_class': link_iphone15Pro_class, 'link_iphone15Pro_internalRoleLinkName': link_iphone15Pro_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 2-Click on link iphone15Pro - Navigate to page product.png')

"Step 3: Click on label 512Gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_512Gb_5"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_512Gb_5', ['label_512Gb_for': label_512Gb_for, 'label_512Gb_internalText': label_512Gb_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 3-Click on label 512Gb.png')

"Step 4: Click on label 512Gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_512Gb_6"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_512Gb_6', ['label_512Gb_for': label_512Gb_for, 'label_512Gb_internalText': label_512Gb_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Click on label 512Gb.png')

"Step 5: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Click on button buy.png')

"Step 6: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 6-Click on button buy.png')

"Step 7: Click on label 256Gb1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_512Gb_6"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_512Gb_6', ['label_512Gb_for': label_512Gb_for, 'label_512Gb_internalText': label_512Gb_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 7-Click on label 256Gb1.png')

"Step 8: Click on label blueTitanium"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_blueTitanium_5"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_blueTitanium_5', ['label_blueTitanium_for': label_blueTitanium_for, 'label_blueTitanium_internalText': label_blueTitanium_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 8-Click on label blueTitanium.png')

"Step 9: Hover over link goToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/link_goToCart"
WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_goToCart', ['link_goToCart_internalRoleLinkName': link_goToCart_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 9-Hover over link goToCart.png')

"Step 10: Click on span shoppingCart -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/span_shoppingCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/span_shoppingCart', ['span_shoppingCart_internalRoleLinkName': span_shoppingCart_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 10-Click on span shoppingCart - Navigate to page .png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Add iPhone 15 Pro to Cart and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}