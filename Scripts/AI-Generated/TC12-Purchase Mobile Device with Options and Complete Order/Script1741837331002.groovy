import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.fillShippingInformationAndProceedToPayment
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

"Step 2: Click on link mobileBrand (Samsung2) -> Navigate to page 'category#category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_mobileBrand"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_mobileBrand', ['link_mobileBrand_category_id': link_mobileBrand_category_id, 'link_mobileBrand_link_mobileBrand_internalRoleLinkName': link_mobileBrand_link_mobileBrand_internalRoleLinkName, 'link_mobileBrand_link_mobileBrand_nthChild': link_mobileBrand_link_mobileBrand_nthChild]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 2-Click on link mobileBrand Samsung2 - Navigate to page categorycategory.png')

"Step 3: Click on link mobileDevice (SamsungGalaxyS23Ultra) -> Navigate to page 'product#product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_mobileDevice"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_mobileDevice', ['link_mobileDevice_class': link_mobileDevice_class, 'link_mobileDevice_internalRoleLinkName': link_mobileDevice_internalRoleLinkName, 'product_id': product_id]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 3-Click on link mobileDevice SamsungGalaxyS23Ultra - Navigate to page productproduct.png')

"Step 4: Click on label storageOption (TB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_storageOption"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_storageOption', ['label_storageOption_for': label_storageOption_for, 'label_storageOption_internalText': label_storageOption_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 4-Click on label storageOption TB.png')

"Step 5: Click on label colorOption (White)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_colorOption"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_colorOption', ['label_colorOption_for': label_colorOption_for, 'label_colorOption_internalText': label_colorOption_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 5-Click on label colorOption White.png')

"Step 6: Click on label colorOption (Black)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_colorOption"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_colorOption', ['label_colorOption_for': label_colorOption_for_1, 'label_colorOption_internalText': label_colorOption_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 6-Click on label colorOption Black.png')

"Step 7: Click on label storageOption (256GB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_storageOption"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_storageOption', ['label_storageOption_for': label_storageOption_for_1, 'label_storageOption_internalText': label_storageOption_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 7-Click on label storageOption 256GB.png')

"Step 8: Click on button purchaseQuantity (Buy)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_purchaseQuantity"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_purchaseQuantity', ['button_purchaseQuantity_internalRoleButtonName': button_purchaseQuantity_internalRoleButtonName, 'button_purchaseQuantity_type': button_purchaseQuantity_type]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 8-Click on button purchaseQuantity Buy.png')

"Step 9: Click on link iPhone15Pro"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_iPhone15Pro'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 9-Click on link iPhone15Pro.png')

"Step 10: Click on button purchaseQuantity (Buy)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_purchaseQuantity"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_purchaseQuantity', ['button_purchaseQuantity_internalRoleButtonName': button_purchaseQuantity_internalRoleButtonName_1, 'button_purchaseQuantity_type': button_purchaseQuantity_type_1]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 10-Click on button purchaseQuantity Buy.png')

"Step 11: Click on link PlaceOrder -> Navigate to page 'cart#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_PlaceOrder'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 11-Click on link PlaceOrder - Navigate to page cartcart.png')

"Step 12: Click on button ProceedToCheckout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_ProceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 12-Click on button ProceedToCheckout.png')

"Step 13: Enter shipping details and continue to payment step"

fillShippingInformationAndProceedToPayment.execute(data_path_0, Integer.valueOf(index_0))

"Step 14: Click on button CompleteOrder -> Navigate to page 'thank you#thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 14-Click on button CompleteOrder - Navigate to page thank youthank-you.png')

"Step 15: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC12-Purchase Mobile Device with Options and Complete Order_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}