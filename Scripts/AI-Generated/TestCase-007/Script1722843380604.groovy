import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.common.browseAppleAndPurchaseIphone15
import katalon.common.fillShippingAddressAndProceedToPayment
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Browse Apple category and purchase iPhone 15"

browseAppleAndPurchaseIphone15.execute(data_path_0, Integer.valueOf(index_0))

"Step 3: Click on button proceedToCheckout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 3-Click on button proceedToCheckout.png')

"Step 4: Fill in shipping address details and proceed to payment"

fillShippingAddressAndProceedToPayment.execute(data_path_1, Integer.valueOf(index_1))

"Step 5: Fill in shipping address details and proceed to payment"

fillShippingAddressAndProceedToPayment.execute(data_path_2, Integer.valueOf(index_2))

"Step 6: Click on div deliveryInformationUs -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_checkout/div_deliveryInformationUs', ['internalHasText': div_deliveryInformationUs_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 6-Click on div deliveryInformationUs - Navigate to page .png')

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-007_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}