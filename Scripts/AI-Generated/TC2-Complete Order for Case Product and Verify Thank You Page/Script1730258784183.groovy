import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.common.completeCheckoutShippingInformation
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on button caseProduct (SamsungGalaxyS23UltraCase)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_caseProduct"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_caseProduct', ['button_caseProduct_class': button_caseProduct_class, 'button_caseProduct_internalHasText': button_caseProduct_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 2-Click on button caseProduct SamsungGalaxyS23UltraCase.png')

"Step 3: Click on link GoToCart -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_GoToCart'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 3-Click on link GoToCart - Navigate to page cart.png')

"Step 4: Click on button IncreaseQuantity"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_IncreaseQuantity'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Click on button IncreaseQuantity.png')

"Step 5: Fill out shipping information and proceed to payment"

completeCheckoutShippingInformation.execute(data_path_0, Integer.valueOf(index_0))

"Step 6: Click on button CompleteOrder -> Navigate to page 'thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 6-Click on button CompleteOrder - Navigate to page thank-you.png')

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Complete Order for Case Product and Verify Thank You Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}