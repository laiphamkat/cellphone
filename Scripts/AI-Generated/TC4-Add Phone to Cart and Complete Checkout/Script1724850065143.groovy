import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.truetest.TrueTestScripts
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

"Step 2: Hover over item item2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_item2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 2-Hover over item item2.png')

"Step 3: Click on link mobileBrands (apple2) -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_mobileBrands"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_mobileBrands', ['link_mobileBrands_nthChild': link_mobileBrands_nthChild, 'link_mobileBrands_internalRoleLinkName': link_mobileBrands_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 3-Click on link mobileBrands apple2 - Navigate to page category.png')

"Step 4: Click on button addToCart (addToCart)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_addToCart', ['button_addToCart_class': button_addToCart_class, 'button_addToCart_internalHasText': button_addToCart_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 4-Click on button addToCart addToCart.png')

"Step 5: Click on label deviceSpecifications (512Gb)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_deviceSpecifications"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_deviceSpecifications', ['label_deviceSpecifications_for': label_deviceSpecifications_for, 'label_deviceSpecifications_internalText': label_deviceSpecifications_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 5-Click on label deviceSpecifications 512Gb.png')

"Step 6: Click on label deviceSpecifications (green)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_deviceSpecifications"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_deviceSpecifications', ['label_deviceSpecifications_for': label_deviceSpecifications_for_1, 'label_deviceSpecifications_internalText': label_deviceSpecifications_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 6-Click on label deviceSpecifications green.png')

"Step 7: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 7-Click on button buy.png')

"Step 8: Click on link cart (cart) -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_cart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_cart', ['link_cart_internalRoleLinkName': link_cart_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 8-Click on link cart cart - Navigate to page cart.png')

"Step 9: Click on button proceedToCheckout -> Navigate to page 'checkout/payment'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 9-Click on button proceedToCheckout - Navigate to page checkoutpayment.png')

"Step 10: Click on button completeOrder -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_completeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 10-Click on button completeOrder - Navigate to page .png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Add Phone to Cart and Complete Checkout_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}