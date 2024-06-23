import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import katalon.common.selectIPhoneAndProceedToShipping
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.truetest.TrueTestScripts
import katalon.common.enterUSShippingDetailsAndProceedToPayment

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://cellphone-staging.aut.katalon.com/"

TrueTestScripts.navigate('/')

"Step 2: Click on link phone -> Navigate to page 'category/*'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_phone'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 2: Click on link phone - Navigate to page category.png')

"Step 3: Enter input value in input priceMin"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_category/input_priceMin'), input_price_min)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 3: Enter input value in input priceMin.png')

"Step 4: Enter input value in input priceMax"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_category/input_priceMax'), input_price_max)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 4: Enter input value in input priceMax.png')

"Step 5: Click on button search"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 5: Click on button search.png')

"Step 6: Select iPhone, add to cart, and proceed to shipping information"

selectIPhoneAndProceedToShipping.execute(data_path_0, Integer.valueOf(index_0))

"Step 7: Enter shipping details for US shipping and proceed to payment"

enterUSShippingDetailsAndProceedToPayment.execute(data_path_1, Integer.valueOf(index_1))

"Step 8: Click on button completeOrder -> Navigate to page ''"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_completeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 8: Click on button completeOrder - Navigate to page .png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Verify Search and Checkout Process for iPhone_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
