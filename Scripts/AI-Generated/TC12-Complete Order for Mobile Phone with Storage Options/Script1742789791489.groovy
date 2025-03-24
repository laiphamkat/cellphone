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

"Step 2: Click on link brandNames (apple) -> Navigate to page 'category#category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_brandNames"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_brandNames', ['category_id': category_id, 'link_brandNames_internalRoleLinkName': link_brandNames_internalRoleLinkName, 'link_brandNames_nthChild': link_brandNames_nthChild]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 2-Click on link brandNames apple - Navigate to page categorycategory.png')

"Step 3: Click on link mobilePhones (iPhone15)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_mobilePhones"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_mobilePhones', ['link_mobilePhones_class': link_mobilePhones_class, 'link_mobilePhones_internalRoleLinkName': link_mobilePhones_internalRoleLinkName, 'product_id': product_id]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 3-Click on link mobilePhones iPhone15.png')

"Step 4: Click on link mobilePhones (iPhone15Plus) -> Navigate to page 'product#product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_mobilePhones"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_mobilePhones', ['link_mobilePhones_class': link_mobilePhones_class_1, 'link_mobilePhones_internalRoleLinkName': link_mobilePhones_internalRoleLinkName_1, 'product_id': product_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 4-Click on link mobilePhones iPhone15Plus - Navigate to page productproduct.png')

"Step 5: Click on label 512GB2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_512GB2'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 5-Click on label 512GB2.png')

"Step 6: Click on label storageOptions (Black2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_storageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_storageOptions', ['label_storageOptions_for': label_storageOptions_for, 'label_storageOptions_internalText': label_storageOptions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 6-Click on label storageOptions Black2.png')

"Step 7: Click on button buyQuantity (Buy)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_buyQuantity"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_buyQuantity', ['button_buyQuantity_internalRoleButtonName': button_buyQuantity_internalRoleButtonName, 'button_buyQuantity_type': button_buyQuantity_type]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 7-Click on button buyQuantity Buy.png')

"Step 8: Click on link PlaceOrder -> Navigate to page 'cart#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_PlaceOrder'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 8-Click on link PlaceOrder - Navigate to page cartcart.png')

"Step 9: Click on button proceedToCheckout (ProceedToCheckout)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_proceedToCheckout"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_proceedToCheckout', ['button_proceedToCheckout_internalRoleButtonName': button_proceedToCheckout_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 9-Click on button proceedToCheckout ProceedToCheckout.png')

"Step 10: Input shipping information for checkout process"

fillShippingDetailsForCheckout.execute(data_path_0, Integer.valueOf(index_0))

"Step 11: Click on button CompleteOrder -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 11-Click on button CompleteOrder - Navigate to page .png')

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC12-Complete Order for Mobile Phone with Storage Options_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}