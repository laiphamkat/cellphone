import internal.GlobalVariable
import com.kms.katalon.core.model.FailureHandling
import katalon.common.proceedToCheckoutAndProvideShippingInfo
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.common.enterShippingDetailsAndProceedToPayment
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.truetest.TrueTestScripts

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://cellphone-staging.aut.katalon.com/"

TrueTestScripts.navigate('/')

"Step 2: Click on svg"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/svg_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/svg_object'))

"Step 3: Click on link 'Place an order'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/link_ place an order'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_ place an order'))

"Step 4: Proceed to checkout and provide shipping info"

WebUI.takeScreenshot()

proceedToCheckoutAndProvideShippingInfo.execute(data_path_0, Integer.valueOf(index_0))

"Step 5: Enter shipping details and proceed to payment"

WebUI.takeScreenshot()

enterShippingDetailsAndProceedToPayment.execute(data_path_1, Integer.valueOf(index_1))

"Step 6: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Verify Successful Checkout Process after Adding Items to Shopping Cart_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
