import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.fillCheckoutInfoAndContinueToPayment
import truetest.common.selectMobileDevicesAndPurchaseQuantity
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Select mobile devices and set purchase quantity"

selectMobileDevicesAndPurchaseQuantity.execute(data_path_0, Integer.valueOf(index_0))

"Step 3: Click on link placeOrder -> Navigate to page 'cart#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_placeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 3-Click on link placeOrder - Navigate to page cartcart.png')

"Step 4: Click on button checkout (proceedToCheckout)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_checkout"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_checkout', ['button_checkout_internalRoleButtonName': button_checkout_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 4-Click on button checkout proceedToCheckout.png')

"Step 5: Fill in checkout information and proceed to payment"

fillCheckoutInfoAndContinueToPayment.execute(data_path_1, Integer.valueOf(index_1))

"Step 6: Click on button completeOrder -> Navigate to page 'thank you#thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_completeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 6-Click on button completeOrder - Navigate to page thank youthank-you.png')

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC15-Set Purchase Quantity and Complete Checkout for Mobile Devices_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}