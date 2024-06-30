import internal.GlobalVariable
import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

"Step 2: Click on div hotNewiPhone15Details"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_hotNewiPhone15Details'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 2: Click on div hotNewiPhone15Details.png')

"Step 3: Click on link productsSliderNext"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_productsSliderNext'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 3: Click on link productsSliderNext.png')

"Step 4: Click on link productsSliderNext"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_productsSliderNext'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 4: Click on link productsSliderNext.png')

"Step 5: Click on link productsSliderNext"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_productsSliderNext'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 5: Click on link productsSliderNext.png')

"Step 6: Click on link productsSliderNext"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_productsSliderNext'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 6: Click on link productsSliderNext.png')

"Step 7: Click on link productsSliderNext"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_productsSliderNext'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 7: Click on link productsSliderNext.png')

"Step 8: Click on link productsSliderNext"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_productsSliderNext'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 8: Click on link productsSliderNext.png')

"Step 9: Click on link productsSliderNext"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_productsSliderNext'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 9: Click on link productsSliderNext.png')

"Step 10: Click on link productsSliderNext"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_productsSliderNext'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 10: Click on link productsSliderNext.png')

"Step 11: Click on link productsSliderNext"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_productsSliderNext'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 11: Click on link productsSliderNext.png')

"Step 12: Click on link productsSliderNext"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_productsSliderNext'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 12: Click on link productsSliderNext.png')

"Step 13: Click on link productsSliderNext -> Navigate to page ''"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_productsSliderNext'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 13: Click on link productsSliderNext - Navigate to page .png')

"Step 14: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC41-Explore and Purchase iPhone 15 Pro Max_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
