import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to"

TrueTestScripts.navigate("")

"Step 2: Click on button newiPhone15Plus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_object"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_object', ['button_object_class': button_object_button_object_class, 'button_object_internalHasText': button_object_button_object_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 2-Click on button newiPhone15Plus.png')

"Step 3: Click on label 256Gb2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_naturalTitanium"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_naturalTitanium', ['label_naturalTitanium_for': label_naturalTitanium_label_naturalTitanium_for, 'label_naturalTitanium_internalText': label_naturalTitanium_label_naturalTitanium_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 3-Click on label 256Gb2.png')

"Step 4: Click on label yellow1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_yellow1_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_yellow1_1', ['label_yellow1_for': label_yellow1_1_label_yellow1_for, 'label_yellow1_internalText': label_yellow1_1_label_yellow1_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 4-Click on label yellow1.png')

"Step 5: Click on button buy2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_buy2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 5-Click on button buy2.png')

"Step 6: Click on link goToCart -> Navigate to page 'cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_goToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_goToCart', ['link_goToCart_internalRoleLinkName': link_goToCart_link_goToCart_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 6-Click on link goToCart - Navigate to page cart.png')

"Step 7: Click on button increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_decreased"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_decreased', ['button_decreased_nthChild': button_decreased_button_decreased_nthChild, 'button_decreased_class': button_decreased_button_decreased_class, 'button_decreased_internalRoleButtonName': button_decreased_button_decreased_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 7-Click on button increased.png')

"Step 8: Click on button proceedToCheckout -> Navigate to page 'checkout/payment'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 8-Click on button proceedToCheckout - Navigate to page checkoutpayment.png')

"Step 9: Click on button completeOrder -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_completeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 9-Click on button completeOrder - Navigate to page .png')

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Complete Purchase of New iPhone 15 Plus and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}