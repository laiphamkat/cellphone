import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://cellphone-staging.aut.katalon.com//"

TrueTestScripts.navigate('//')

"Step 2: Click on link about3 -> Navigate to page '/about'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_about3'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 2: Click on link about3 - Navigate to page about.png')

"Step 3: Click on link apple -> Navigate to page 'category/*'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/about?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_about/link_apple'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 3: Click on link apple - Navigate to page category.png')

"Step 4: Click on link kcellphoneShop1 -> Navigate to page '/'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_kcellphoneShop1'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 4: Click on link kcellphoneShop1 - Navigate to page .png')

"Step 5: Click on link goToCart"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_goToCart'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 5: Click on link goToCart.png')

"Step 6: Click on link about3 -> Navigate to page '/about'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_about3'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 6: Click on link about3 - Navigate to page about.png')

"Step 7: Click on link apple -> Navigate to page 'category/*'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/about?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_about/link_apple'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 7: Click on link apple - Navigate to page category.png')

"Step 8: Click on link about3 -> Navigate to page '/about'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_about3'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 8: Click on link about3 - Navigate to page about.png')

"Step 9: Click on link apple -> Navigate to page ''"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/about?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_about/link_apple_1'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 9: Click on link apple - Navigate to page .png')

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC27-Verify Navigation through About and Category Pages_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
