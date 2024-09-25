import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import katalon.truetest.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://testops.qa.katalon.com/organization/7584/settings/truetest/5909"

TrueTestScripts.navigate("/organization/7584/settings/truetest/5909")

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Navigate to /"

TrueTestScripts.navigate("/")

"Step 4: Hover over item item"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_item'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 4-Hover over item item.png')

"Step 5: Click on link apple -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_apple'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 5-Click on link apple - Navigate to page category.png')

"Step 6: Click on link iphone15SiliconeCaseWithMagsafe -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_iphone15SiliconeCaseWithMagsafe'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 6-Click on link iphone15SiliconeCaseWithMagsafe - Navigate to page product.png')

"Step 7: Click on label productName (iPhone15Plus)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_productName"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_productName', ['label_productName_for': label_productName_for]))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 7-Click on label productName iPhone15Plus.png')

"Step 8: Click on label productName (cypress)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_productName"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_productName', ['label_productName_for': label_productName_for_1]))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 8-Click on label productName cypress.png')

"Step 9: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 9-Click on button buy.png')

"Step 10: Click on link cart -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_cart'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 10-Click on link cart - Navigate to page cart.png')

"Step 11: Click on button proceedToCheckout -> Navigate to page 'checkout/info'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 11-Click on button proceedToCheckout - Navigate to page checkoutinfo.png')

"Step 12: Hover over div element"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_info/div_element'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 12-Hover over div element.png')

"Step 13: Click on input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_email'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 13-Click on input email.png')

"Step 14: Enter input value in input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_email'), input_email)

WebUI.takeScreenshot(reportLocation + '/TC26/Step 14-Enter input value in input email.png')

"Step 15: Click on button continueToShipping -> Navigate to page 'checkout/shipping-address'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_continueToShipping'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 15-Click on button continueToShipping - Navigate to page checkoutshipping-address.png')

"Step 16: Hover over div element"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_element'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 16-Hover over div element.png')

"Step 17: Click on input firstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_firstName'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 17-Click on input firstName.png')

"Step 18: Hover over div element2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_element2'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 18-Hover over div element2.png')

"Step 19: Enter input value in input firstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_firstName'), input_firstName)

WebUI.takeScreenshot(reportLocation + '/TC26/Step 19-Enter input value in input firstName.png')

"Step 20: Click on input lastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_lastName'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 20-Click on input lastName.png')

"Step 21: Hover over div element3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_element3'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 21-Hover over div element3.png')

"Step 22: Enter input value in input lastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_lastName'), input_lastName)

WebUI.takeScreenshot(reportLocation + '/TC26/Step 22-Enter input value in input lastName.png')

"Step 23: Click on input address"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_address'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 23-Click on input address.png')

"Step 24: Hover over div element4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_element4'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 24-Hover over div element4.png')

"Step 25: Enter input value in input address"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_address'), input_address)

WebUI.takeScreenshot(reportLocation + '/TC26/Step 25-Enter input value in input address.png')

"Step 26: Click on input zipCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_zipCode'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 26-Click on input zipCode.png')

"Step 27: Hover over div element5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_element5'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 27-Hover over div element5.png')

"Step 28: Enter input value in input zipCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_zipCode'), input_zipCode)

WebUI.takeScreenshot(reportLocation + '/TC26/Step 28-Enter input value in input zipCode.png')

"Step 29: Click on input city"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_city'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 29-Click on input city.png')

"Step 30: Hover over div element6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_element6'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 30-Hover over div element6.png')

"Step 31: Enter input value in input city"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_city'), input_city)

WebUI.takeScreenshot(reportLocation + '/TC26/Step 31-Enter input value in input city.png')

"Step 32: Click on input state"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_state'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 32-Click on input state.png')

"Step 33: Hover over div element7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_element7'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 33-Hover over div element7.png')

"Step 34: Enter input value in input state"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_state'), input_state)

WebUI.takeScreenshot(reportLocation + '/TC26/Step 34-Enter input value in input state.png')

"Step 35: Click on input phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_phone'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 35-Click on input phone.png')

"Step 36: Enter input value in input phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_phone'), input_phone)

WebUI.takeScreenshot(reportLocation + '/TC26/Step 36-Enter input value in input phone.png')

"Step 37: Click on button continueToPayment -> Navigate to page 'checkout/payment'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/button_continueToPayment'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 37-Click on button continueToPayment - Navigate to page checkoutpayment.png')

"Step 38: Click on button completeOrder -> Navigate to page 'thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_completeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 38-Click on button completeOrder - Navigate to page thank-you.png')

"Step 39: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC26-Complete Checkout Process for Apple Products on Cellphone Staging_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}