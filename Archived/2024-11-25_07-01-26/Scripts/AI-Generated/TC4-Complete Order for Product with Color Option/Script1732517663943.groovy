import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.fillShippingInformationAndProceedToPayment
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

"Step 2: Hover over item object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_object2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 2-Hover over item object2.png')

"Step 3: Click on link brand (Apple2) -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_brand"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_brand', ['link_brand_nthChild': link_brand_nthChild, 'link_brand_internalRoleLinkName': link_brand_internalRoleLinkName, 'category_id': category_id]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 3-Click on link brand Apple2 - Navigate to page category.png')

"Step 4: Click on link productAccessories (ProductIPhone) -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_productAccessories"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_productAccessories', ['link_productAccessories_class': link_productAccessories_class, 'link_productAccessories_internalRoleLinkName': link_productAccessories_internalRoleLinkName, 'product_id': product_id]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 4-Click on link productAccessories ProductIPhone - Navigate to page product.png')

"Step 5: Click on label productDetails (512GB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_productDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_productDetails', ['label_productDetails_for': label_productDetails_for, 'label_productDetails_internalText': label_productDetails_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 5-Click on label productDetails 512GB.png')

"Step 6: Click on label colorOption (Green) -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_colorOption"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_colorOption', ['label_colorOption_for': label_colorOption_for, 'label_colorOption_internalText': label_colorOption_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 6-Click on label colorOption Green - Navigate to page cart.png')

"Step 7: Click on button Increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_Increased'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 7-Click on button Increased.png')

"Step 8: Fill out shipping information and proceed to payment"

fillShippingInformationAndProceedToPayment.execute(data_path_0, Integer.valueOf(index_0))

"Step 9: Click on button CompleteOrder -> Navigate to page 'thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 9-Click on button CompleteOrder - Navigate to page thank-you.png')

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Complete Order for Product with Color Option_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}