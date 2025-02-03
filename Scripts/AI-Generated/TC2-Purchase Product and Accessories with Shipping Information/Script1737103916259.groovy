import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.fillShippingInfoAndProceedToPayment
import truetest.common.selectProductVariantAndAddToCart
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

"Step 2: Click on link brand (Samsung) -> Navigate to page 'category#category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_brand"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_brand', ['link_brand_nthChild': link_brand_nthChild, 'link_brand_internalRoleLinkName': link_brand_internalRoleLinkName, 'category_id': category_id]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 2-Click on link brand Samsung - Navigate to page categorycategory.png')

"Step 3: Click on link productDetails (SamsungGalaxyS23UltraSmartviewCases) -> Navigate to page 'product#product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_productDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_productDetails', ['product_id': product_id]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 3-Click on link productDetails SamsungGalaxyS23UltraSmartviewCases - Navigate to page productproduct.png')

"Step 4: Click on button purchaseAction (Buy2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_purchaseAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_purchaseAction', ['button_purchaseAction_internalRoleButtonName': button_purchaseAction_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Click on button purchaseAction Buy2.png')

"Step 5: Click on link Accessories -> Navigate to page 'category#category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_Accessories'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Click on link Accessories - Navigate to page categorycategory.png')

"Step 6: Click on link brand (Apple)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_brand"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_brand', ['link_brand_nthChild': link_brand_nthChild_1, 'link_brand_internalRoleLinkName': link_brand_internalRoleLinkName_1, 'category_id': category_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 6-Click on link brand Apple.png')

"Step 7: Click on link productDetails (SamsungGalaxyS23UltraSmartviewCases)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_productDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_productDetails', ['product_id': product_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 7-Click on link productDetails SamsungGalaxyS23UltraSmartviewCases.png')

"Step 8: Select product variant and add to cart for purchase"

selectProductVariantAndAddToCart.execute(data_path_0, Integer.valueOf(index_0))

"Step 9: Click on link PlaceAnOrder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_PlaceAnOrder'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 9-Click on link PlaceAnOrder.png')

"Step 10: Fill shipping information and proceed to payment"

fillShippingInfoAndProceedToPayment.execute(data_path_1, Integer.valueOf(index_1))

"Step 11: Click on button CompleteOrder -> Navigate to page 'thank you#thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 11-Click on button CompleteOrder - Navigate to page thank youthank-you.png')

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Purchase Product and Accessories with Shipping Information_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}