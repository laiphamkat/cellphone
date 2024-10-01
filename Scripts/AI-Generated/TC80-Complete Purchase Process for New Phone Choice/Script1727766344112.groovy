import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
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

"Step 2: Click on button newPhoneChoice (NewiPhone15Plus)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_newPhoneChoice"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_newPhoneChoice', ['button_newPhoneChoice_class': button_newPhoneChoice_class, 'button_newPhoneChoice_internalHasText': button_newPhoneChoice_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 2-Click on button newPhoneChoice NewiPhone15Plus.png')

"Step 3: Click on label colorStorageOption (256GB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_colorStorageOption"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_colorStorageOption', ['label_colorStorageOption_for': label_colorStorageOption_for, 'label_colorStorageOption_internalText': label_colorStorageOption_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 3-Click on label colorStorageOption 256GB.png')

"Step 4: Click on label colorStorageOption (Yellow)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_colorStorageOption"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_colorStorageOption', ['label_colorStorageOption_for': label_colorStorageOption_for_1, 'label_colorStorageOption_internalText': label_colorStorageOption_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 4-Click on label colorStorageOption Yellow.png')

"Step 5: Click on button Buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_Buy'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 5-Click on button Buy.png')

"Step 6: Click on link goToCart (GoToCart) -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_goToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_goToCart', ['link_goToCart_internalRoleLinkName': link_goToCart_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 6-Click on link goToCart GoToCart - Navigate to page cart.png')

"Step 7: Click on button quantityControl (IncreaseQuantity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_quantityControl"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_quantityControl', ['button_quantityControl_nthChild': button_quantityControl_nthChild, 'button_quantityControl_class': button_quantityControl_class, 'button_quantityControl_nth': button_quantityControl_nth]))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 7-Click on button quantityControl IncreaseQuantity.png')

"Step 8: Click on button ProceedToCheckout -> Navigate to page 'checkout/payment'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 8-Click on button ProceedToCheckout - Navigate to page checkoutpayment.png')

"Step 9: Click on button CompleteOrder -> Navigate to page 'thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 9-Click on button CompleteOrder - Navigate to page thank-you.png')

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC80-Complete Purchase Process for New Phone Choice_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}