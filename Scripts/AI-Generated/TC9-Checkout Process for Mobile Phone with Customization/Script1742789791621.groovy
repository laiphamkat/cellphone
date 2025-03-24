import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.fillShippingDetailsForCheckout
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

"Step 2: Click on link brandNames (Samsung) -> Navigate to page 'category#category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_brandNames"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_brandNames', ['category_id': category_id, 'link_brandNames_internalRoleLinkName': link_brandNames_internalRoleLinkName, 'link_brandNames_nthChild': link_brandNames_nthChild]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 2-Click on link brandNames Samsung - Navigate to page categorycategory.png')

"Step 3: Click on link mobilePhones (SamsungGalaxyS23Ultra2) -> Navigate to page 'product#product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_mobilePhones"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_mobilePhones', ['link_mobilePhones_class': link_mobilePhones_class, 'link_mobilePhones_internalRoleLinkName': link_mobilePhones_internalRoleLinkName, 'product_id': product_id]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 3-Click on link mobilePhones SamsungGalaxyS23Ultra2 - Navigate to page productproduct.png')

"Step 4: Click on label storageOptions (TB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_storageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_storageOptions', ['label_storageOptions_for': label_storageOptions_for, 'label_storageOptions_internalText': label_storageOptions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 4-Click on label storageOptions TB.png')

"Step 5: Click on label colorOptions (White)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_colorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_colorOptions', ['label_colorOptions_for': label_colorOptions_for, 'label_colorOptions_internalText': label_colorOptions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 5-Click on label colorOptions White.png')

"Step 6: Click on label colorOptions (Black)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_colorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_colorOptions', ['label_colorOptions_for': label_colorOptions_for_1, 'label_colorOptions_internalText': label_colorOptions_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 6-Click on label colorOptions Black.png')

"Step 7: Click on label storageOptions (256GB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_storageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_storageOptions', ['label_storageOptions_for': label_storageOptions_for_1, 'label_storageOptions_internalText': label_storageOptions_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 7-Click on label storageOptions 256GB.png')

"Step 8: Click on button buyQuantity (Buy)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_buyQuantity"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_buyQuantity', ['button_buyQuantity_internalRoleButtonName': button_buyQuantity_internalRoleButtonName, 'button_buyQuantity_type': button_buyQuantity_type]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 8-Click on button buyQuantity Buy.png')

"Step 9: Click on link iPhone15Pro"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_iPhone15Pro'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 9-Click on link iPhone15Pro.png')

"Step 10: Click on button buyQuantity (Buy)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_buyQuantity"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_buyQuantity', ['button_buyQuantity_internalRoleButtonName': button_buyQuantity_internalRoleButtonName_1, 'button_buyQuantity_type': button_buyQuantity_type_1]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 10-Click on button buyQuantity Buy.png')

"Step 11: Click on link PlaceOrder -> Navigate to page 'cart#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_PlaceOrder'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 11-Click on link PlaceOrder - Navigate to page cartcart.png')

"Step 12: Click on button proceedToCheckout (ProceedToCheckout)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_proceedToCheckout"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_proceedToCheckout', ['button_proceedToCheckout_internalRoleButtonName': button_proceedToCheckout_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 12-Click on button proceedToCheckout ProceedToCheckout.png')

"Step 13: Input shipping information for checkout process"

fillShippingDetailsForCheckout.execute(data_path_0, Integer.valueOf(index_0))

"Step 14: Click on button CompleteOrder -> Navigate to page 'thank you#thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 14-Click on button CompleteOrder - Navigate to page thank youthank-you.png')

"Step 15: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC9-Checkout Process for Mobile Phone with Customization_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}