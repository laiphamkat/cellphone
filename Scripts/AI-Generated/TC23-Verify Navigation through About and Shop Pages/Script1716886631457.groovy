import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
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

"Step 2: Navigate to https://cellphone-staging.aut.katalon.com/about"

TrueTestScripts.navigate('/about')

"Step 3: Click on link 'K Cellphone Shop'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_about/link_kcellphoneShop'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/about?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_about/link_kcellphoneShop'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 3: Click on link K Cellphone Shop.png')

"Step 4: Click on link 'K Cellphone Shop' -> Navigate to page ''"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_about/link_kcellphoneShop'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/about?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_about/link_kcellphoneShop'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 4: Click on link K Cellphone Shop - Navigate to page .png')

"Step 5: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC23-Verify Navigation through About and Shop Pages_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
