import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

"Step 2: Hover over link accessories"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/link_accessories'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 2-Hover over link accessories.png')

"Step 3: Click on link samsung2 -> Navigate to page '/category/power-and-cables'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_samsung2'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 3-Click on link samsung2 - Navigate to page categorypower-and-cables.png')

"Step 4: Click on button addToCart (addToCart)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/power-and-cables?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_power_and_cables/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_power_and_cables/button_addToCart', ['button_addToCart_liNthOfType': button_addToCart_liNthOfType, 'button_addToCart_nth': button_addToCart_nth]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Click on button addToCart addToCart.png')

"Step 5: Click on link productDetail (samsungGalaxyS23UltraSmartviewCases) -> Navigate to page '/product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/power-and-cables?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_power_and_cables/link_productDetail"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_power_and_cables/link_productDetail', ['link_productDetail_href_variable': link_productDetail_href_variable, 'link_productDetail_internalHasText': link_productDetail_internalHasText, 'link_productDetail_liNthOfType': link_productDetail_liNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Click on link productDetail samsungGalaxyS23UltraSmartviewCases - Navigate to page product.png')

"Step 6: Click on button purchase (buy)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_purchase"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_purchase', ['button_purchase_buttonNthOfType': button_purchase_buttonNthOfType, 'button_purchase_buttonTitle': button_purchase_buttonTitle]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 6-Click on button purchase buy.png')

"Step 7: Hover over link phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_product/link_phone'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 7-Hover over link phone.png')

"Step 8: Click on link googlePixel -> Navigate to page '/category/google-pixel'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_googlePixel'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 8-Click on link googlePixel - Navigate to page categorygoogle-pixel.png')

"Step 9: Click on button addToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/google-pixel?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_google_pixel/button_addToCart'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 9-Click on button addToCart.png')

"Step 10: Click on label colorStorageOption (storage512Gb)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/google-pixel?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_google_pixel/label_colorStorageOption"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_google_pixel/label_colorStorageOption', ['label_colorStorageOption_for': label_colorStorageOption_for, 'label_colorStorageOption_internalText': label_colorStorageOption_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 10-Click on label colorStorageOption storage512Gb.png')

"Step 11: Click on label colorStorageOption (colorBlack)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/google-pixel?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_google_pixel/label_colorStorageOption"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_google_pixel/label_colorStorageOption', ['label_colorStorageOption_for': label_colorStorageOption_for_1, 'label_colorStorageOption_internalText': label_colorStorageOption_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 11-Click on label colorStorageOption colorBlack.png')

"Step 12: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/google-pixel?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_google_pixel/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 12-Click on button buy.png')

"Step 13: Hover over link googlePixel8New"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/google-pixel?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_category_google_pixel/link_googlePixel8New'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 13-Hover over link googlePixel8New.png')

"Step 14: Click on link placeOrder -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/google-pixel?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_google_pixel/link_placeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 14-Click on link placeOrder - Navigate to page cart.png')

"Step 15: Click on button proceedToCheckout -> Navigate to page '/checkout/info'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 15-Click on button proceedToCheckout - Navigate to page checkoutinfo.png')

"Step 16: Click on input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_email'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 16-Click on input email.png')

"Step 17: Enter input value in input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_email'), input_email)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 17-Enter input value in input email.png')

"Step 18: Click on button continueToShipping -> Navigate to page '/checkout/shipping-address'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_continueToShipping'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 18-Click on button continueToShipping - Navigate to page checkoutshipping-address.png')

"Step 19: Click on input firstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_firstName'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 19-Click on input firstName.png')

"Step 20: Enter input value in input firstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_firstName'), input_firstName)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 20-Enter input value in input firstName.png')

"Step 21: Press key Tab on input firstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Page_checkout_shipping_address/input_firstName'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 21-Press key Tab on input firstName.png')

"Step 22: Enter input value in input lastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_lastName'), input_lastName)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 22-Enter input value in input lastName.png')

"Step 23: Press key Tab on input lastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Page_checkout_shipping_address/input_lastName'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 23-Press key Tab on input lastName.png')

"Step 24: Enter input value in input address"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_address'), input_address)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 24-Enter input value in input address.png')

"Step 25: Press key Tab on input address"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Page_checkout_shipping_address/input_address'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 25-Press key Tab on input address.png')

"Step 26: Enter input value in input zipCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_zipCode'), input_zipCode)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 26-Enter input value in input zipCode.png')

"Step 27: Press key Tab on input zipCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Page_checkout_shipping_address/input_zipCode'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 27-Press key Tab on input zipCode.png')

"Step 28: Enter input value in input city"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_city'), input_city)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 28-Enter input value in input city.png')

"Step 29: Press key Tab on input city"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Page_checkout_shipping_address/input_city'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 29-Press key Tab on input city.png')

"Step 30: Enter input value in input state"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_state'), input_state)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 30-Enter input value in input state.png')

"Step 31: Press key Tab on input state"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Page_checkout_shipping_address/input_state'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 31-Press key Tab on input state.png')

"Step 32: Enter input value in input phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_phone'), input_phone)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 32-Enter input value in input phone.png')

"Step 33: Click on button continueToPayment -> Navigate to page '/checkout/payment'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/button_continueToPayment'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 33-Click on button continueToPayment - Navigate to page checkoutpayment.png')

"Step 34: Click on button completeOrder -> Navigate to page '/thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_completeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 34-Click on button completeOrder - Navigate to page thank-you.png')

"Step 35: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Complete Order for Multiple Devices with Accessories_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}