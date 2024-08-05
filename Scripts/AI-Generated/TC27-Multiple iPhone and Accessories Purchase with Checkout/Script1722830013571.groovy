import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
import katalon.truetest.TrueTestScripts
import katalon.common.selectNewIPhoneAndViewCart
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.common.fillShippingAddressAndProceedToPayment
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

"Step 2: Select new iPhone and navigate to the cart"

selectNewIPhoneAndViewCart.execute(data_path_0, Integer.valueOf(index_0))

"Step 3: Click on button proceedToCheckout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 3-Click on button proceedToCheckout.png')

"Step 4: Enter shipping address details and continue to payment"

fillShippingAddressAndProceedToPayment.execute(data_path_1, Integer.valueOf(index_1))

"Step 5: Enter shipping address details and continue to payment"

fillShippingAddressAndProceedToPayment.execute(data_path_2, Integer.valueOf(index_2))

"Step 6: Click on button completeOrder -> Navigate to page 'thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_completeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 6-Click on button completeOrder - Navigate to page thank-you.png')

"Step 7: Hover over item listitem"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/thank-you/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_thank_you/item_listitem', ['nth': item_listitem_nth]))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 7-Hover over item listitem.png')

"Step 8: Click on link apple -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/thank-you/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_thank_you/link_apple'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 8-Click on link apple - Navigate to page category.png')

"Step 9: Click on button sale20WusbpowerAdapter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_sale20WusbpowerAdapter', ['class': button_sale20WusbpowerAdapter_class, 'internalHasText': button_sale20WusbpowerAdapter_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 9-Click on button sale20WusbpowerAdapter.png')

"Step 10: Click on link goToCart -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_goToCart', ['internalRoleLinkName': link_goToCart_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 10-Click on link goToCart - Navigate to page cart.png')

"Step 11: Click on button proceedToCheckout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 11-Click on button proceedToCheckout.png')

"Step 12: Enter shipping address details and continue to payment"

fillShippingAddressAndProceedToPayment.execute(data_path_3, Integer.valueOf(index_3))

"Step 13: Enter shipping address details and continue to payment"

fillShippingAddressAndProceedToPayment.execute(data_path_4, Integer.valueOf(index_4))

"Step 14: Click on button completeOrder -> Navigate to page 'thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_completeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 14-Click on button completeOrder - Navigate to page thank-you.png')

"Step 15: Hover over item listitem"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/thank-you/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_thank_you/item_listitem', ['nth': item_listitem_nth]))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 15-Hover over item listitem.png')

"Step 16: Click on link apple2 -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/thank-you/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_thank_you/link_apple2'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 16-Click on link apple2 - Navigate to page category.png')

"Step 17: Click on button sale20WusbpowerAdapter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_sale20WusbpowerAdapter', ['class': button_sale20WusbpowerAdapter_class, 'internalHasText': button_sale20WusbpowerAdapter_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 17-Click on button sale20WusbpowerAdapter.png')

"Step 18: Click on button hotNewiPhone15"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_hotNewiPhone15', ['class': button_hotNewiPhone15_class, 'internalHasText': button_hotNewiPhone15_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 18-Click on button hotNewiPhone15.png')

"Step 19: Click on div hotNewBestChoice"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/div_hotNewBestChoice'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 19-Click on div hotNewBestChoice.png')

"Step 20: Click on link iPhone15HotNew -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_iPhone15HotNew', ['class': link_iPhone15HotNew_class, 'internalRoleLinkName': link_iPhone15HotNew_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 20-Click on link iPhone15HotNew - Navigate to page product.png')

"Step 21: Click on label gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_gb', ['for': label_gb_for, 'internalText': label_gb_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 21-Click on label gb.png')

"Step 22: Click on label gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_gb', ['for': label_gb_for, 'internalText': label_gb_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 22-Click on label gb.png')

"Step 23: Click on button buyButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buyButton'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 23-Click on button buyButton.png')

"Step 24: Click on link goToCart -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_goToCart'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 24-Click on link goToCart - Navigate to page .png')

"Step 25: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC27-Multiple iPhone and Accessories Purchase with Checkout_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}