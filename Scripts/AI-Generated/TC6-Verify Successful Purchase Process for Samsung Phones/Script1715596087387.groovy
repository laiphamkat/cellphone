import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.common.proceedToCheckoutAndEnterShippingDetails
import katalon.common.enterShippingAddressDetailsAndCompletePayment
import katalon.truetest.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.common.purchaseItemAndNavigatePage

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://cellphone-staging.aut.katalon.com/"

TrueTestScripts.navigate('/')

"Step 2: Click on button"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_hotNewiPhone15From'))

WebUI.takeScreenshot()

"Step 3: Click on label"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/label_256Gb2'))

WebUI.takeScreenshot()

"Step 4: Click on label"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/label_yellow'))

WebUI.takeScreenshot()

"Step 5: Click on button 'Buy'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_buy3'))

WebUI.takeScreenshot()

"Step 6: Click on link 'Place an order'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_placeAnOrder'))

WebUI.takeScreenshot()

"Step 7: Proceed to checkout and enter shipping details"

proceedToCheckoutAndEnterShippingDetails.execute(data_path_0, Integer.valueOf(index_0))

"Step 8: Enter shipping address details and complete payment"

enterShippingAddressDetailsAndCompletePayment.execute(data_path_1, Integer.valueOf(index_1))

"Step 9: Hover over list item"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/thank-you/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_thank_you/item_listItem2'))

WebUI.takeScreenshot()

"Step 10: Click on link 'Phone' -> Navigate to page 'category/*'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/thank-you/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_thank_you/link_phone1'))

WebUI.takeScreenshot()

"Step 11: Click on div"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/div_samsung2'))

WebUI.takeScreenshot()

"Step 12: Click on link 'Samsung'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_samsung2'))

WebUI.takeScreenshot()

"Step 13: Click on button"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_samsungGalaxyS23Ultra'))

WebUI.takeScreenshot()

"Step 14: Click on label"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/label_cypress'))

WebUI.takeScreenshot()

"Step 15: Click on label"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/label_iPhone15Plus'))

WebUI.takeScreenshot()

"Step 16: Purchase item and navigate to another page"

purchaseItemAndNavigatePage.execute()

"Step 17: Proceed to checkout and enter shipping details"

proceedToCheckoutAndEnterShippingDetails.execute(data_path_2, Integer.valueOf(index_2))

"Step 18: Enter shipping address details and complete payment"

enterShippingAddressDetailsAndCompletePayment.execute(data_path_3, Integer.valueOf(index_3))

"Step 19: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Verify Successful Purchase Process for Samsung Phones_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
