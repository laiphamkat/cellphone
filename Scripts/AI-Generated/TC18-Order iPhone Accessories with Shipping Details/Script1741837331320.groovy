import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.fillShippingDetailsAndCompleteOrder
import truetest.common.proceedToCheckoutAndEnterEmail
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

"Step 2: Hover over item object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_object_1'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 2-Hover over item object.png')

"Step 3: Click on link Apple -> Navigate to page 'iphone cases category#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_Apple'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 3-Click on link Apple - Navigate to page iphone cases category.png')

"Step 4: Click on link iphoneAccessories (iPhone15ClearCaseWithMagSafe) -> Navigate to page 'product#product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_iphone_cases_category/link_iphoneAccessories"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_iphone_cases_category/link_iphoneAccessories', ['link_iphoneAccessories_class': link_iphoneAccessories_class, 'link_iphoneAccessories_internalRoleLinkName': link_iphoneAccessories_internalRoleLinkName, 'product_id': product_id]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 4-Click on link iphoneAccessories iPhone15ClearCaseWithMagSafe - Navigate to page productproduct.png')

"Step 5: Click on button purchaseQuantity (Buy2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_purchaseQuantity"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_purchaseQuantity', ['button_purchaseQuantity_internalRoleButtonName': button_purchaseQuantity_internalRoleButtonName, 'button_purchaseQuantity_type': button_purchaseQuantity_type]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 5-Click on button purchaseQuantity Buy2.png')

"Step 6: Click on link PlaceOrder -> Navigate to page 'cart#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_PlaceOrder'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 6-Click on link PlaceOrder - Navigate to page cartcart.png')

"Step 7: Click on button Increase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_Increase'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 7-Click on button Increase.png')

"Step 8: Proceed to checkout and enter email for shipping"

proceedToCheckoutAndEnterEmail.execute(data_path_0, Integer.valueOf(index_0))

"Step 9: Fill in shipping details and complete the order"

fillShippingDetailsAndCompleteOrder.execute(data_path_1, Integer.valueOf(index_1))

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC18-Order iPhone Accessories with Shipping Details_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}