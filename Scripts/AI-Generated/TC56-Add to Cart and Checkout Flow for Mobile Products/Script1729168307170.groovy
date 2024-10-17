import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import truetest.common.fillShippingInformationForCheckout

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Hover over item object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_object'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 2-Hover over item object.png')

"Step 3: Click on link mobileBrands (GooglePixel) -> Navigate to page 'category page#category/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_mobileBrands"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_mobileBrands', ['link_mobileBrands_nthChild': link_mobileBrands_nthChild]))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 3-Click on link mobileBrands GooglePixel - Navigate to page category pagecategory.png')

"Step 4: Click on button addToCart (AddToCart)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_page/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_page/button_addToCart', ['button_addToCart_internalHasText': button_addToCart_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 4-Click on button addToCart AddToCart.png')

"Step 5: Hover over link GoToCart2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_category_page/link_GoToCart2'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 5-Hover over link GoToCart2.png')

"Step 6: Click on span dynamicObject (Link1) -> Navigate to page 'shopping cart#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_page/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_page/span_dynamicObject', ['span_dynamicObject_internalRoleLinkName': span_dynamicObject_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 6-Click on span dynamicObject Link1 - Navigate to page shopping cartcart.png')

"Step 7: Click on div PriceQtyTotal"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shopping_cart/div_PriceQtyTotal'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 7-Click on div PriceQtyTotal.png')

"Step 8: Click on div PriceQtyTotal"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shopping_cart/div_PriceQtyTotal'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 8-Click on div PriceQtyTotal.png')

"Step 9: Complete shipping information for checkout process"

fillShippingInformationForCheckout.execute(data_path_0, Integer.valueOf(index_0))

"Step 10: Click on button CompleteOrder -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 10-Click on button CompleteOrder - Navigate to page .png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC56-Add to Cart and Checkout Flow for Mobile Products_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}