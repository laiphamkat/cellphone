import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import katalon.truetest.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to"

TrueTestScripts.navigate("")

"Step 2: Click on link productAppleIphone15Pro -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_productAppleIphone15Pro'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 2-Click on link productAppleIphone15Pro - Navigate to page product.png')

"Step 3: Click on label 512Gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_256Gb1_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_256Gb1_2', ['label_256Gb1_for': label_256Gb1_for, 'label_256Gb1_internalText': label_256Gb1_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 3-Click on label 512Gb.png')

"Step 4: Click on label 512Gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_256Gb1_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_256Gb1_2', ['label_256Gb1_for': label_256Gb1_for, 'label_256Gb1_internalText': label_256Gb1_internalText]))

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

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_256Gb1_3"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_256Gb1_3', ['label_256Gb1_for': label_256Gb1_for, 'label_256Gb1_internalText': label_256Gb1_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 7-Click on label 256Gb1.png')

"Step 8: Click on label blueTitanium"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_blueTitanium_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_blueTitanium_2', ['label_blueTitanium_for': label_blueTitanium_for, 'label_blueTitanium_internalText': label_blueTitanium_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 8-Click on label blueTitanium.png')

"Step 9: Hover over link goToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_product/link_goToCart'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 9-Hover over link goToCart.png')

"Step 10: Click on span shoppingCart -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/span_shoppingCart'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 10-Click on span shoppingCart - Navigate to page .png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Purchase Apple iPhone 15 Pro with Multiple Options_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}