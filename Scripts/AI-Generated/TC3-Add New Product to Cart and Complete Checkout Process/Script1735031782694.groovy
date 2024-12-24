import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.fillShippingAddressAndProceed
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

"Step 2: Hover over item object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_object3'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 2-Hover over item object3.png')

"Step 3: Click on link productBrands (Apple2) -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_productBrands"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_productBrands', ['link_productBrands_nthChild': link_productBrands_nthChild, 'link_productBrands_internalRoleLinkName': link_productBrands_internalRoleLinkName, 'category_id': category_id]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 3-Click on link productBrands Apple2 - Navigate to page category.png')

"Step 4: Click on button newProduct (NewIphone15Plus)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_newProduct"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_newProduct', ['button_newProduct_class': button_newProduct_class, 'button_newProduct_internalHasText': button_newProduct_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 4-Click on button newProduct NewIphone15Plus.png')

"Step 5: Click on label storageColorCapacity (256GB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_storageColorCapacity"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_storageColorCapacity', ['label_storageColorCapacity_for': label_storageColorCapacity_for, 'label_storageColorCapacity_internalText': label_storageColorCapacity_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 5-Click on label storageColorCapacity 256GB.png')

"Step 6: Click on label storageColorCapacity (Green)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_storageColorCapacity"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_storageColorCapacity', ['label_storageColorCapacity_for': label_storageColorCapacity_for_1, 'label_storageColorCapacity_internalText': label_storageColorCapacity_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 6-Click on label storageColorCapacity Green.png')

"Step 7: Click on button cartActions (Buy)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_cartActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_cartActions', ['button_cartActions_internalRoleButtonName': button_cartActions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 7-Click on button cartActions Buy.png')

"Step 8: Click on link cartNavigation (GoToCart) -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_cartNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_cartNavigation', ['link_cartNavigation_internalRoleLinkName': link_cartNavigation_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 8-Click on link cartNavigation GoToCart - Navigate to page cart.png')

"Step 9: Click on button ProceedToCheckout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_ProceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 9-Click on button ProceedToCheckout.png')

"Step 10: Complete shipping address form after entering email and continue to payment."

fillShippingAddressAndProceed.execute(data_path_0, Integer.valueOf(index_0))

"Step 11: Click on button CompleteOrder -> Navigate to page 'thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 11-Click on button CompleteOrder - Navigate to page thank-you.png')

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Add New Product to Cart and Complete Checkout Process_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}