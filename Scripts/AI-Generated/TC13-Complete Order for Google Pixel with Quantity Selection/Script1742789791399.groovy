import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.fillShippingDetailsForCheckout
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

WebUI.takeScreenshot(reportLocation + '/TC13/Step 2-Click on link GooglePixel - Navigate to page product category page.png')

"Step 3: Click on link GooglePixel7Pro -> Navigate to page 'product#product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_category_page/link_GooglePixel7Pro'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 3-Click on link GooglePixel7Pro - Navigate to page productproduct.png')

"Step 4: Click on button buyQuantity (Buy4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_buyQuantity"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_buyQuantity', ['button_buyQuantity_internalRoleButtonName': button_buyQuantity_internalRoleButtonName, 'button_buyQuantity_type': button_buyQuantity_type]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 4-Click on button buyQuantity Buy4.png')

"Step 5: Click on button buyQuantity (Buy3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_buyQuantity"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_buyQuantity', ['button_buyQuantity_internalRoleButtonName': button_buyQuantity_internalRoleButtonName_1, 'button_buyQuantity_type': button_buyQuantity_type_1]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 5-Click on button buyQuantity Buy3.png')

"Step 6: Click on link PlaceOrder -> Navigate to page 'cart#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_PlaceOrder'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 6-Click on link PlaceOrder - Navigate to page cartcart.png')

"Step 7: Click on button Increase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_Increase'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 7-Click on button Increase.png')

"Step 8: Click on button proceedToCheckout (ProceedToCheckout)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_proceedToCheckout"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_proceedToCheckout', ['button_proceedToCheckout_internalRoleButtonName': button_proceedToCheckout_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 8-Click on button proceedToCheckout ProceedToCheckout.png')

"Step 9: Input shipping information for checkout process"

fillShippingDetailsForCheckout.execute(data_path_0, Integer.valueOf(index_0))

"Step 10: Click on button CompleteOrder -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 10-Click on button CompleteOrder - Navigate to page .png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC13-Complete Order for Google Pixel with Quantity Selection_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}