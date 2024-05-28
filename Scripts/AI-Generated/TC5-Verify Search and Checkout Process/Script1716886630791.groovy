import internal.GlobalVariable
import katalon.common.actionSequence_2
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
import katalon.common.actionSequence_1

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 2: Navigate to https://cellphone-staging.aut.katalon.com/"

TrueTestScripts.navigate('/')

"Step 3: Click on link 'Phone' -> Navigate to page 'category/*'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/link_phone'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_phone'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 3: Click on link Phone - Navigate to page category.png')

"Step 4: Enter input value in input field 'price min'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_category/input_priceMin'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_category/input_priceMin'), input_price_min)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 4: Enter input value in input field price min.png')

"Step 5: Enter input value in input field 'price max'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_category/input_priceMax'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_category/input_priceMax'), input_price_max)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 5: Enter input value in input field price max.png')

"Step 6: Click on button 'Search'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_category/button_search'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 6: Click on button Search.png')

"Step 7: Call function actionSequence 2"

actionSequence_2.execute(data_path_0, Integer.valueOf(index_0))

"Step 8: Call function actionSequence 1"

actionSequence_1.execute(data_path_1, Integer.valueOf(index_1))

"Step 9: Click on button 'COMPLETE ORDER' -> Navigate to page 'thank-you/*'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_payment/button_completeOrder'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_completeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 9: Click on button COMPLETE ORDER - Navigate to page thank-you.png')

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Verify Search and Checkout Process_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
