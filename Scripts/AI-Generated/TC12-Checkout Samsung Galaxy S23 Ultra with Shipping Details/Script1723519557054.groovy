import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.common.completeShippingDetailsForOrder
import katalon.truetest.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to"

TrueTestScripts.navigate("")

"Step 2: Hover over item phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_home/item_phone_10'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 2-Hover over item phone.png')

"Step 3: Click on link samsung -> Navigate to page 'category/samsung'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_samsung'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 3-Click on link samsung - Navigate to page categorysamsung.png')

"Step 4: Click on link samsungGalaxyS23Ultra -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_samsung/link_samsungGalaxyS23Ultra'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 4-Click on link samsungGalaxyS23Ultra - Navigate to page product.png')

"Step 5: Click on label 256Gb1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_512Gb_10"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_512Gb_10', ['label_512Gb_for': label_512Gb_for, 'label_512Gb_internalText': label_512Gb_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 5-Click on label 256Gb1.png')

"Step 6: Click on label blueTitanium"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_blueTitanium_11"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_blueTitanium_11', ['label_blueTitanium_for': label_blueTitanium_for, 'label_blueTitanium_internalText': label_blueTitanium_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 6-Click on label blueTitanium.png')

"Step 7: Hover over div productsSliderProduct"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_product/div_productsSliderProduct'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 7-Hover over div productsSliderProduct.png')

"Step 8: Click on button addToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_addToCart'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 8-Click on button addToCart.png')

"Step 9: Click on label 512Gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_blueTitanium_4"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_blueTitanium_4', ['label_blueTitanium_for': label_blueTitanium_for, 'label_blueTitanium_internalText': label_blueTitanium_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 9-Click on label 512Gb.png')

"Step 10: Click on label blueTitanium"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_blueTitanium_12"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_blueTitanium_12', ['label_blueTitanium_for': label_blueTitanium_for, 'label_blueTitanium_internalText': label_blueTitanium_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 10-Click on label blueTitanium.png')

"Step 11: Click on button buy2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy2'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 11-Click on button buy2.png')

"Step 12: Click on link goToCart -> Navigate to page 'cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/link_goToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_goToCart', ['link_goToCart_internalRoleLinkName': link_goToCart_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 12-Click on link goToCart - Navigate to page cart.png')

"Step 13: Click on button increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_decreased_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_decreased_1', ['button_decreased_class': button_decreased_class, 'button_decreased_nthChild': button_decreased_nthChild, 'button_decreased_internalRoleButtonName': button_decreased_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 13-Click on button increased.png')

"Step 14: Click on button proceedToCheckout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 14-Click on button proceedToCheckout.png')

"Step 15: Fill in shipping details multiple times during checkout"

completeShippingDetailsForOrder.execute(data_path_0, Integer.valueOf(index_0))

"Step 16: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC12-Checkout Samsung Galaxy S23 Ultra with Shipping Details_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}