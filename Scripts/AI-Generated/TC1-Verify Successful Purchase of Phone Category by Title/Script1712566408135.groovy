import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.common.proceedThroughCheckoutProcess
import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.model.FailureHandling

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://cellphone-staging.aut.katalon.com/"

TrueTestScripts.navigate('/')

"Step 2: Click on link 'Phone' -> Navigate to page 'category/phone'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/hyperlink_phone'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_phone'))

"Step 3: Click on link 'By title'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_category_phone/hyperlink_by title'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/phone?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_phone/hyperlink_by title'))

"Step 4: Click on svg"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_category_phone/svg_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/phone?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_phone/svg_object'))

"Step 5: Click on link ' Place an order'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_category_phone/hyperlink_ place an order'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/phone?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_phone/hyperlink_ place an order'))

"Step 6: Proceed through checkout process"

WebUI.takeScreenshot()

proceedThroughCheckoutProcess.execute(data_path_0, Integer.valueOf(index_0))

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Verify Successful Purchase of Phone Category by Title_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
