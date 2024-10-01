import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.common.fillPersonalDetailsForOrderProcessing
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

"Step 2: Hover over item Phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_Phone'))

WebUI.takeScreenshot(reportLocation + '/TC90/Step 2-Hover over item Phone.png')

"Step 3: Click on link Samsung -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_Samsung'))

WebUI.takeScreenshot(reportLocation + '/TC90/Step 3-Click on link Samsung - Navigate to page category.png')

"Step 4: Click on link productAccessory (SamsungGalaxyS23Ultra) -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_productAccessory"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_productAccessory', ['link_productAccessory_class': link_productAccessory_class, 'link_productAccessory_internalRoleLinkName': link_productAccessory_internalRoleLinkName, 'link_productAccessory_product_id': link_productAccessory_product_id]))

WebUI.takeScreenshot(reportLocation + '/TC90/Step 4-Click on link productAccessory SamsungGalaxyS23Ultra - Navigate to page product.png')

"Step 5: Click on label colorStorageOption (256GB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_colorStorageOption"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_colorStorageOption', ['label_colorStorageOption_for': label_colorStorageOption_for, 'label_colorStorageOption_internalText': label_colorStorageOption_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC90/Step 5-Click on label colorStorageOption 256GB.png')

"Step 6: Click on label colorStorageOption (White)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_colorStorageOption"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_colorStorageOption', ['label_colorStorageOption_for': label_colorStorageOption_for_1, 'label_colorStorageOption_internalText': label_colorStorageOption_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC90/Step 6-Click on label colorStorageOption White.png')

"Step 7: Hover over div ProductSlider"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_product/div_ProductSlider'))

WebUI.takeScreenshot(reportLocation + '/TC90/Step 7-Hover over div ProductSlider.png')

"Step 8: Click on button AddToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_AddToCart'))

WebUI.takeScreenshot(reportLocation + '/TC90/Step 8-Click on button AddToCart.png')

"Step 9: Click on label storageOption (512GB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_storageOption"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_storageOption', ['label_storageOption_for': label_storageOption_for, 'label_storageOption_internalText': label_storageOption_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC90/Step 9-Click on label storageOption 512GB.png')

"Step 10: Click on label storageOption (BlueTitanium2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_storageOption"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_storageOption', ['label_storageOption_for': label_storageOption_for_1, 'label_storageOption_internalText': label_storageOption_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC90/Step 10-Click on label storageOption BlueTitanium2.png')

"Step 11: Click on button Buy2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_Buy2'))

WebUI.takeScreenshot(reportLocation + '/TC90/Step 11-Click on button Buy2.png')

"Step 12: Click on link goToCart (GoToCart) -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/link_goToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_goToCart', ['link_goToCart_internalRoleLinkName': link_goToCart_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC90/Step 12-Click on link goToCart GoToCart - Navigate to page cart.png')

"Step 13: Click on button quantityControl (IncreaseQuantity3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_quantityControl"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_quantityControl', ['button_quantityControl_nthChild': button_quantityControl_nthChild, 'button_quantityControl_class': button_quantityControl_class]))

WebUI.takeScreenshot(reportLocation + '/TC90/Step 13-Click on button quantityControl IncreaseQuantity3.png')

"Step 14: Click on button ProceedToCheckout -> Navigate to page 'checkout/info'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC90/Step 14-Click on button ProceedToCheckout - Navigate to page checkoutinfo.png')

"Step 15: Hover over div EmailSubscription"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_info/div_EmailSubscription'))

WebUI.takeScreenshot(reportLocation + '/TC90/Step 15-Hover over div EmailSubscription.png')

"Step 16: Click on input Email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_email'))

WebUI.takeScreenshot(reportLocation + '/TC90/Step 16-Click on input Email.png')

"Step 17: Enter input value in input Email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_email'), input_Email)

WebUI.takeScreenshot(reportLocation + '/TC90/Step 17-Enter input value in input Email.png')

"Step 18: Click on button ContinueToShipping"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_continueToShipping'))

WebUI.takeScreenshot(reportLocation + '/TC90/Step 18-Click on button ContinueToShipping.png')

"Step 19: Fill out personal details for order processing"

fillPersonalDetailsForOrderProcessing.execute(data_path_0, Integer.valueOf(index_0))

"Step 20: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC90-Complete Purchase Process for Samsung Accessories_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}