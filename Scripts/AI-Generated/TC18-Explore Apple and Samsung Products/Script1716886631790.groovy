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

WebUI.takeScreenshot(reportLocation + '/TC18/Step 3: Click on link About - Navigate to page about.png')

"Step 4: Click on link 'Apple' -> Navigate to page 'category/*'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_about/link_apple_1'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/about?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_about/link_apple_1'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 4: Click on link Apple - Navigate to page category.png')

"Step 5: Click on link 'Apple'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_category/link_apple1'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_apple1'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 5: Click on link Apple.png')

"Step 6: Click on link 'Samsung'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_category/link_samsung2'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_samsung2'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 6: Click on link Samsung.png')

"Step 7: Click on link 'Home' -> Navigate to page ''"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_category/link_home'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_home'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 7: Click on link Home - Navigate to page .png')

"Step 8: Click on link 'About' -> Navigate to page 'about'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/link_about'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_about'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 8: Click on link About - Navigate to page about.png')

"Step 9: Click on link 'Apple' -> Navigate to page 'category/*'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_about/link_apple_1'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/about?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_about/link_apple_1'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 9: Click on link Apple - Navigate to page category.png')

"Step 10: Click on link 'Apple'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_category/link_apple1'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_apple1'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 10: Click on link Apple.png')

"Step 11: Click on link 'About' -> Navigate to page 'about'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_category/link_about2'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_about2'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 11: Click on link About - Navigate to page about.png')

"Step 12: Click on link 'Apple'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_about/link_apple'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/about?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_about/link_apple'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 12: Click on link Apple.png')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
