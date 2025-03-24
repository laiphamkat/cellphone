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

"Step 2: Click on link brandNames (samsung) -> Navigate to page 'category#category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_brandNames"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_brandNames', ['category_id': category_id, 'link_brandNames_internalRoleLinkName': link_brandNames_internalRoleLinkName, 'link_brandNames_nthChild': link_brandNames_nthChild]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 2-Click on link brandNames samsung - Navigate to page categorycategory.png')

"Step 3: Click on link SamsungGalaxyS23Ultra -> Navigate to page 'product#product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_SamsungGalaxyS23Ultra'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 3-Click on link SamsungGalaxyS23Ultra - Navigate to page productproduct.png')

"Step 4: Click on button buyQuantity (Buy4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_buyQuantity"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_buyQuantity', ['button_buyQuantity_internalRoleButtonName': button_buyQuantity_internalRoleButtonName, 'button_buyQuantity_type': button_buyQuantity_type]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 4-Click on button buyQuantity Buy4.png')

"Step 5: Click on button buyQuantity (Buy3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_buyQuantity"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_buyQuantity', ['button_buyQuantity_internalRoleButtonName': button_buyQuantity_internalRoleButtonName_1, 'button_buyQuantity_type': button_buyQuantity_type_1]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 5-Click on button buyQuantity Buy3.png')

"Step 6: Click on link Apple3 -> Navigate to page 'category#category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_Apple3'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 6-Click on link Apple3 - Navigate to page categorycategory.png')

"Step 7: Click on button AddToCart2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_AddToCart2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 7-Click on button AddToCart2.png')

"Step 8: Click on label 1TB"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/label_1TB'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 8-Click on label 1TB.png')

"Step 9: Click on label BlueTitanium"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/label_BlueTitanium'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 9-Click on label BlueTitanium.png')

"Step 10: Click on button purchaseOptions (Increased)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_purchaseOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_purchaseOptions', ['button_purchaseOptions_internalRoleButtonName': button_purchaseOptions_internalRoleButtonName, 'button_purchaseOptions_type': button_purchaseOptions_type]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 10-Click on button purchaseOptions Increased.png')

"Step 11: Click on button purchaseOptions (Increased)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_purchaseOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_purchaseOptions', ['button_purchaseOptions_internalRoleButtonName': button_purchaseOptions_internalRoleButtonName_1, 'button_purchaseOptions_type': button_purchaseOptions_type_1]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 11-Click on button purchaseOptions Increased.png')

"Step 12: Click on button purchaseOptions (Buy)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_purchaseOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_purchaseOptions', ['button_purchaseOptions_internalRoleButtonName': button_purchaseOptions_internalRoleButtonName_2, 'button_purchaseOptions_type': button_purchaseOptions_type_2]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 12-Click on button purchaseOptions Buy.png')

"Step 13: Click on link GoToCart -> Navigate to page 'cart#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_GoToCart'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 13-Click on link GoToCart - Navigate to page cartcart.png')

"Step 14: Click on button proceedToCheckout (ProceedToCheckout)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_proceedToCheckout"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_proceedToCheckout', ['button_proceedToCheckout_internalRoleButtonName': button_proceedToCheckout_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 14-Click on button proceedToCheckout ProceedToCheckout.png')

"Step 15: Input shipping information for checkout process"

fillShippingDetailsForCheckout.execute(data_path_0, Integer.valueOf(index_0))

"Step 16: Click on button CompleteOrder -> Navigate to page 'thank you#thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 16-Click on button CompleteOrder - Navigate to page thank youthank-you.png')

"Step 17: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Complete Order for Samsung Galaxy with Custom Options_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}