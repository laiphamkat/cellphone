import internal.GlobalVariable
import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.common.placeOrderAndProceedToCheckout
import katalon.common.fillShippingAddressForm
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Hover over item phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_home/item_phone_6'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 2-Hover over item phone.png')

"Step 3: Click on link samsung -> Navigate to page '/category/samsung'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_samsung'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 3-Click on link samsung - Navigate to page categorysamsung.png')

"Step 4: Click on link byTitle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_samsung/link_byPrice"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_samsung/link_byPrice', ['link_byPrice_nthChild': link_byPrice_nthChild, 'link_byPrice_internalRoleLinkName': link_byPrice_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 4-Click on link byTitle.png')

"Step 5: Click on link byPrice"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_samsung/link_byPrice_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_samsung/link_byPrice_1', ['link_byPrice_nthChild': link_byPrice_nthChild, 'link_byPrice_internalRoleLinkName': link_byPrice_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 5-Click on link byPrice.png')

"Step 6: Click on link googlePixel -> Navigate to page '/category/google-pixel'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_samsung/link_googlePixel'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 6-Click on link googlePixel - Navigate to page categorygoogle-pixel.png')

"Step 7: Click on link googlePixel8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/google-pixel?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_google_pixel/link_googlePixel8'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 7-Click on link googlePixel8.png')

"Step 8: Choose storage options and proceed to checkout from cart"

placeOrderAndProceedToCheckout.execute(data_path_0, Integer.valueOf(index_0))

"Step 9: Enter shipping details including name address and phone number"

fillShippingAddressForm.execute(data_path_1, Integer.valueOf(index_1))

"Step 10: Click on button completeOrder -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_completeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 10-Click on button completeOrder - Navigate to page .png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC13-Purchase Google Pixel 8 and Complete Checkout_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}