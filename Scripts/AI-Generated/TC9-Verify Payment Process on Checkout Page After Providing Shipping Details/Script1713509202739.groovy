import katalon.common.enterShippingDetailsAndProceedToPayment
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.common.proceedToCheckoutWithEmailAndMarketingInfo
import com.kms.katalon.core.model.FailureHandling
import katalon.common.selectSamsungCategoryAndBuy
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts
import internal.GlobalVariable

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://cellphone-staging.aut.katalon.com/"

TrueTestScripts.navigate('/')

"Step 2: Hover over list item"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/li_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/li_object'))

"Step 3: Select Samsung category and buy items"

WebUI.takeScreenshot()

selectSamsungCategoryAndBuy.execute()

"Step 4: Click on link 'Place an order'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_category_samsung/link_ place an order'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_samsung/link_ place an order'))

"Step 5: Proceed to checkout after providing email and marketing info"

WebUI.takeScreenshot()

proceedToCheckoutWithEmailAndMarketingInfo.execute(data_path_0, Integer.valueOf(index_0))

"Step 6: Enter shipping details and proceed to payment"

WebUI.takeScreenshot()

enterShippingDetailsAndProceedToPayment.execute(data_path_1, Integer.valueOf(index_1))

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC9-Verify Payment Process on Checkout Page After Providing Shipping Details_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
