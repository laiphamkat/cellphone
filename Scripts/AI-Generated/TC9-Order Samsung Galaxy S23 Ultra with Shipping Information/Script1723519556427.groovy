import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.common.fillShippingInformation
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

"Step 2: Click on link samsungGalaxyS23Ultra -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_iphone15Pro_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_iphone15Pro_1', ['link_iphone15Pro_class': link_iphone15Pro_class, 'link_iphone15Pro_internalRoleLinkName': link_iphone15Pro_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 2-Click on link samsungGalaxyS23Ultra - Navigate to page product.png')

"Step 3: Click on button increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_object"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_object', ['button_object_internalRoleButtonName': button_object_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 3-Click on button increased.png')

"Step 4: Click on label 512Gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_512Gb_9"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_512Gb_9', ['label_512Gb_for': label_512Gb_for, 'label_512Gb_internalText': label_512Gb_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 4-Click on label 512Gb.png')

"Step 5: Click on label blueTitanium"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_blueTitanium_9"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_blueTitanium_9', ['label_blueTitanium_for': label_blueTitanium_for, 'label_blueTitanium_internalText': label_blueTitanium_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 5-Click on label blueTitanium.png')

"Step 6: Click on label black"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_black_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_black_2', ['label_black_for': label_black_for, 'label_black_internalText': label_black_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 6-Click on label black.png')

"Step 7: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 7-Click on button buy.png')

"Step 8: Click on link placeAnOrder -> Navigate to page 'cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_placeAnOrder'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 8-Click on link placeAnOrder - Navigate to page cart.png')

"Step 9: Click on button increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_increased_4"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_increased_4', ['button_increased_class': button_increased_class, 'button_increased_nthChild': button_increased_nthChild, 'button_increased_internalRoleButtonName': button_increased_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 9-Click on button increased.png')

"Step 10: Click on button decreased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_decreased_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_decreased_1', ['button_decreased_class': button_decreased_class, 'button_decreased_nthChild': button_decreased_nthChild, 'button_decreased_internalRoleButtonName': button_decreased_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 10-Click on button decreased.png')

"Step 11: Click on button proceedToCheckout -> Navigate to page 'checkout/info'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 11-Click on button proceedToCheckout - Navigate to page checkoutinfo.png')

"Step 12: Hover over div emailMeWithNews"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_info/div_emailMeWithNews'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 12-Hover over div emailMeWithNews.png')

"Step 13: Click on input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_email'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 13-Click on input email.png')

"Step 14: Enter input value in input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_email'), input_email)

WebUI.takeScreenshot(reportLocation + '/TC9/Step 14-Enter input value in input email.png')

"Step 15: Click on button continueToShipping"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_continueToShipping'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 15-Click on button continueToShipping.png')

"Step 16: Input shipping details including name and address"

fillShippingInformation.execute(data_path_0, Integer.valueOf(index_0))

"Step 17: Click on button completeOrder -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_completeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 17-Click on button completeOrder - Navigate to page .png')

"Step 18: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC9-Order Samsung Galaxy S23 Ultra with Shipping Information_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}