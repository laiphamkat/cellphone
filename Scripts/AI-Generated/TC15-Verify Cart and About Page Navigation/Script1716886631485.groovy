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

"Step 2: Navigate to https://cellphone-staging.aut.katalon.com/cart"

TrueTestScripts.navigate('/cart')

"Step 3: Click on link 'Phone' -> Navigate to page 'category/*'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_cart/link_phone1'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_phone1'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 3: Click on link Phone - Navigate to page category.png')

"Step 4: Click on link 'About' -> Navigate to page 'about'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_category/link_about2'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_about2'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 4: Click on link About - Navigate to page about.png')

"Step 5: Click on div"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_about/div_aboutWelcome'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/about?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_about/div_aboutWelcome'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 5: Click on div.png')

"Step 6: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC15-Verify Cart and About Page Navigation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
