import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.completeEmailAndShippingDetails
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

WebUI.takeScreenshot(reportLocation + '/TC21/Step 2-Hover over item object3.png')

"Step 3: Click on link productCategories (SamsungCategory) -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_productCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_productCategories', ['link_productCategories_nthChild': link_productCategories_nthChild, 'link_productCategories_internalRoleLinkName': link_productCategories_internalRoleLinkName, 'category_id': category_id]))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 3-Click on link productCategories SamsungCategory - Navigate to page category.png')

"Step 4: Click on link ByTitle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_ByTitle'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 4-Click on link ByTitle.png')

"Step 5: Click on link productItems (SamsungGalaxyZFold5) -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_productItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_productItems', ['link_productItems_class': link_productItems_class, 'link_productItems_internalRoleHeadingName': link_productItems_internalRoleHeadingName, 'product_id': product_id]))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 5-Click on link productItems SamsungGalaxyZFold5 - Navigate to page product.png')

"Step 6: Click on label productDetails (StorageCapacity3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_productDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_productDetails', ['label_productDetails_for': label_productDetails_for, 'label_productDetails_internalText': label_productDetails_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 6-Click on label productDetails StorageCapacity3.png')

"Step 7: Click on label productDetails (colorStorageOptions4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_productDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_productDetails', ['label_productDetails_for': label_productDetails_for_1, 'label_productDetails_internalText': label_productDetails_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 7-Click on label productDetails colorStorageOptions4.png')

"Step 8: Click on link cartNavigationMultiple (GoToCart)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/link_cartNavigationMultiple"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_cartNavigationMultiple', ['link_cartNavigationMultiple_internalRoleLinkName': link_cartNavigationMultiple_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 8-Click on link cartNavigationMultiple GoToCart.png')

"Step 9: Enter email and shipping address details before payment"

completeEmailAndShippingDetails.execute(data_path_0, Integer.valueOf(index_0))

"Step 10: Click on button CompleteOrder -> Navigate to page 'thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 10-Click on button CompleteOrder - Navigate to page thank-you.png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC21-Purchase Product with Shipping Information_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}