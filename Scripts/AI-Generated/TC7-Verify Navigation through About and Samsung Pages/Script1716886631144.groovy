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

"Step 2: Navigate to https://cellphone-staging.aut.katalon.com/"

TrueTestScripts.navigate('/')

"Step 3: Click on link 'About' -> Navigate to page 'about'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/link_about'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_about'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 3: Click on link About - Navigate to page about.png')

"Step 4: Click on link 'Samsung' -> Navigate to page ''"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_about/link_samsung'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/about?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_about/link_samsung'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 4: Click on link Samsung - Navigate to page .png')

"Step 5: Click on link 'About'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/link_about'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_about'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 5: Click on link About.png')

"Step 6: Click on link 'About'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/link_about'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_about'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 6: Click on link About.png')

"Step 7: Click on link 'About'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/link_about'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_about'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 7: Click on link About.png')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
