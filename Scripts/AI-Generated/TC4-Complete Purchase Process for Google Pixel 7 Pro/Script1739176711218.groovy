import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.fillCheckoutInformationAndProceedToPayment
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

"Step 2: Click on link GooglePixel -> Navigate to page 'product category page#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_GooglePixel'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 2-Click on link GooglePixel - Navigate to page product category page.png')

"Step 3: Click on link GooglePixel7Pro -> Navigate to page 'product#product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_category_page/link_GooglePixel7Pro'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 3-Click on link GooglePixel7Pro - Navigate to page productproduct.png')

"Step 4: Click on button purchase (Increased)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_purchase"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_purchase', ['button_purchase_internalRoleButtonName': button_purchase_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 4-Click on button purchase Increased.png')

"Step 5: Click on button purchase (Buy)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_purchase"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_purchase', ['button_purchase_internalRoleButtonName': button_purchase_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 5-Click on button purchase Buy.png')

"Step 6: Click on link PlaceAnOrder -> Navigate to page 'cart#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_PlaceAnOrder'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 6-Click on link PlaceAnOrder - Navigate to page cartcart.png')

"Step 7: Click on button IncreaseQuantity"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_IncreaseQuantity'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 7-Click on button IncreaseQuantity.png')

"Step 8: Fill out shipping information and continue to payment step"

fillCheckoutInformationAndProceedToPayment.execute(data_path_0, Integer.valueOf(index_0))

"Step 9: Click on button CompleteOrder -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 9-Click on button CompleteOrder - Navigate to page .png')

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Complete Purchase Process for Google Pixel 7 Pro_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}