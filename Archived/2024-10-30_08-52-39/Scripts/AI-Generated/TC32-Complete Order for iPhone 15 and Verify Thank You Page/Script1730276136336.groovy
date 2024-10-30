import truetest.custom.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
import truetest.common.completeCheckoutShippingInformation
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on link iPhone15 -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_iPhone15'))

WebUI.takeScreenshot(reportLocation + '/TC32/Step 2-Click on link iPhone15 - Navigate to page product.png')

"Step 3: Click on label colorVariant (TB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_colorVariant"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_colorVariant', ['label_colorVariant_for': label_colorVariant_for, 'label_colorVariant_internalText': label_colorVariant_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC32/Step 3-Click on label colorVariant TB.png')

"Step 4: Click on label colorVariant (Blue)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_colorVariant"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_colorVariant', ['label_colorVariant_for': label_colorVariant_for_1, 'label_colorVariant_internalText': label_colorVariant_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC32/Step 4-Click on label colorVariant Blue.png')

"Step 5: Click on button Buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_Buy'))

WebUI.takeScreenshot(reportLocation + '/TC32/Step 5-Click on button Buy.png')

"Step 6: Click on link PlaceAnOrder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_PlaceAnOrder'))

WebUI.takeScreenshot(reportLocation + '/TC32/Step 6-Click on link PlaceAnOrder.png')

"Step 7: Fill out shipping information and proceed to payment"

completeCheckoutShippingInformation.execute(data_path_0, Integer.valueOf(index_0))

"Step 8: Click on button CompleteOrder -> Navigate to page 'thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC32/Step 8-Click on button CompleteOrder - Navigate to page thank-you.png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC32-Complete Order for iPhone 15 and Verify Thank You Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}