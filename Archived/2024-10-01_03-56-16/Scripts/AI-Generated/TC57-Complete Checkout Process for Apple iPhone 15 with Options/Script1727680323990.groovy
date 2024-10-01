import internal.GlobalVariable
import katalon.common.completeCheckoutProcessWithShippingInfo
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://testops.qa.katalon.com/organization/7584/settings/truetest/5909"

TrueTestScripts.navigate("/organization/7584/settings/truetest/5909")

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Navigate to /"

TrueTestScripts.navigate("/")

"Step 4: Click on link productAppleIphone15New -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_productAppleIphone15New'))

WebUI.takeScreenshot(reportLocation + '/TC57/Step 4-Click on link productAppleIphone15New - Navigate to page product.png')

"Step 5: Click on label colorSizeOption (tb)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_colorSizeOption"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_colorSizeOption', ['label_colorSizeOption_for': label_colorSizeOption_for, 'label_colorSizeOption_internalText': label_colorSizeOption_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC57/Step 5-Click on label colorSizeOption tb.png')

"Step 6: Click on label colorSizeOption (blue)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_colorSizeOption"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_colorSizeOption', ['label_colorSizeOption_for': label_colorSizeOption_for_1, 'label_colorSizeOption_internalText': label_colorSizeOption_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC57/Step 6-Click on label colorSizeOption blue.png')

"Step 7: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC57/Step 7-Click on button buy.png')

"Step 8: Click on link placeAnOrder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_placeAnOrder'))

WebUI.takeScreenshot(reportLocation + '/TC57/Step 8-Click on link placeAnOrder.png')

"Step 9: Fill shipping information and complete the checkout process"

completeCheckoutProcessWithShippingInfo.execute(data_path_0, Integer.valueOf(index_0))

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC57-Complete Checkout Process for Apple iPhone 15 with Options_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}