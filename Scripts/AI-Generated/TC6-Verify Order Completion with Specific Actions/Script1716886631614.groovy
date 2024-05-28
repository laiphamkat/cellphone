import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.truetest.TrueTestScripts
import katalon.common.actionSequence_1
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

"Step 3: Click on button"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/button_newiPhone15Plus'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_newiPhone15Plus'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 3: Click on button.png')

"Step 4: Click on label"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/label_256Gb'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/label_256Gb'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 4: Click on label.png')

"Step 5: Click on label"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/label_yellow'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/label_yellow'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 5: Click on label.png')

"Step 6: Click on button 'Buy'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/button_buy'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 6: Click on button Buy.png')

"Step 7: Click on link '1'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/link_goToCart'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_goToCart'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 7: Click on link 1.png')

"Step 8: Call function actionSequence 1"

actionSequence_1.execute(data_path_0, Integer.valueOf(index_0))

"Step 9: Click on button 'COMPLETE ORDER' -> Navigate to page 'thank-you/*'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_payment/button_completeOrder'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_completeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 9: Click on button COMPLETE ORDER - Navigate to page thank-you.png')

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Verify Order Completion with Specific Actions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
