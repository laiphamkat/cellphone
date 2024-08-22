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

"Step 2: Click on link apple2 -> Navigate to page '/category/apple'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_apple2'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 2-Click on link apple2 - Navigate to page categoryapple.png')

"Step 3: Click on button bestChoiceHotNew"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_apple/button_bestChoiceHotNew_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_apple/button_bestChoiceHotNew_1', ['button_bestChoiceHotNew_class': button_bestChoiceHotNew_class, 'button_bestChoiceHotNew_internalHasText': button_bestChoiceHotNew_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 3-Click on button bestChoiceHotNew.png')

"Step 4: Click on label 1Tb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_apple/label_pink"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_apple/label_pink', ['label_pink_for': label_pink_for, 'label_pink_internalText': label_pink_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 4-Click on label 1Tb.png')

"Step 5: Click on label naturalTitanium"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_apple/label_naturalTitanium_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_apple/label_naturalTitanium_1', ['label_naturalTitanium_for': label_naturalTitanium_for, 'label_naturalTitanium_internalText': label_naturalTitanium_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 5-Click on label naturalTitanium.png')

"Step 6: Click on button buy2 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_apple/button_buy2'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 6-Click on button buy2 - Navigate to page .png')

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC14-Order Apple Products and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}