import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import katalon.truetest.TrueTestScripts
import katalon.common.fillShippingInformationAndContinueToPayment
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Hover over item productCategories (accessories)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_home/item_productCategories'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 2-Hover over item productCategories accessories.png')

"Step 3: Click on link apple -> Navigate to page '/category/chekhly-na-iphone'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_apple'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 3-Click on link apple - Navigate to page categorychekhly-na-iphone.png')

"Step 4: Click on link iphoneAccessories (20WusbtypeCadapter) -> Navigate to page '/product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/chekhly-na-iphone?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_chekhly_na_iphone/link_iphoneAccessories"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_chekhly_na_iphone/link_iphoneAccessories', ['link_iphoneAccessories_class': link_iphoneAccessories_class, 'link_iphoneAccessories_internalRoleLinkName': link_iphoneAccessories_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 4-Click on link iphoneAccessories 20WusbtypeCadapter - Navigate to page product.png')

"Step 5: Click on button increased2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_increased2'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 5-Click on button increased2.png')

"Step 6: Click on button increased2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_increased2'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 6-Click on button increased2.png')

"Step 7: Hover over link cartNavigation (goToCart)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/link_cartNavigation"
WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_cartNavigation', ['link_cartNavigation_internalRoleLinkName': link_cartNavigation_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 7-Hover over link cartNavigation goToCart.png')

"Step 8: Click on span cartIndicator (shoppingCart) -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/span_cartIndicator"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/span_cartIndicator', ['span_cartIndicator_internalRoleLinkName': span_cartIndicator_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 8-Click on span cartIndicator shoppingCart - Navigate to page cart.png')

"Step 9: Click on button proceedToCheckout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 9-Click on button proceedToCheckout.png')

"Step 10: Fill shipping information and continue to payment"

fillShippingInformationAndContinueToPayment.execute(data_path_0, Integer.valueOf(index_0))

"Step 11: Click on button completeOrder -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_completeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 11-Click on button completeOrder - Navigate to page .png')

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC16-Purchase iPhone Accessories with Checkout Process_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}