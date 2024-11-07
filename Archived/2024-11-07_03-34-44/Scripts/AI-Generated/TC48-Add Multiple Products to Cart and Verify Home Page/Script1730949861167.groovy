import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on link iPhone15HotNew -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_iPhone15HotNew'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 2-Click on link iPhone15HotNew - Navigate to page product.png')

"Step 3: Hover over item productCategories (Product)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_product/item_productCategories'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 3-Hover over item productCategories Product.png')

"Step 4: Click on link brandLinks (Apple) -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/link_brandLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_brandLinks', ['link_brandLinks_nthChild': link_brandLinks_nthChild, 'link_brandLinks_internalRoleLinkName': link_brandLinks_internalRoleLinkName, 'link_brandLinks_category_id': link_brandLinks_category_id]))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 4-Click on link brandLinks Apple - Navigate to page category.png')

"Step 5: Click on link brandOptions (Apple)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_brandOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_brandOptions', ['link_brandOptions_class': link_brandOptions_class, 'link_brandOptions_category_id': link_brandOptions_category_id]))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 5-Click on link brandOptions Apple.png')

"Step 6: Click on button addToCartProduct (Sale20WUSBAdapter)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_addToCartProduct"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_addToCartProduct', ['button_addToCartProduct_class': button_addToCartProduct_class, 'button_addToCartProduct_internalHasText': button_addToCartProduct_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 6-Click on button addToCartProduct Sale20WUSBAdapter.png')

"Step 7: Hover over item dynamicObject (Category)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_category/item_dynamicObject'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 7-Hover over item dynamicObject Category.png')

"Step 8: Click on link productCategories (Accessories)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_productCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_productCategories', ['link_productCategories_nth': link_productCategories_nth, 'link_productCategories_internalRoleLinkName': link_productCategories_internalRoleLinkName, 'link_productCategories_category_id': link_productCategories_category_id]))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 8-Click on link productCategories Accessories.png')

"Step 9: Hover over item dynamicObject (Category)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_category/item_dynamicObject'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 9-Hover over item dynamicObject Category.png')

"Step 10: Click on link productCategories (Accessories)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_productCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_productCategories', ['link_productCategories_nth': link_productCategories_nth_1, 'link_productCategories_internalRoleLinkName': link_productCategories_internalRoleLinkName_1, 'link_productCategories_category_id': link_productCategories_category_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 10-Click on link productCategories Accessories.png')

"Step 11: Click on button addToCartProduct (SamsungGalaxyS23Ultra)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_addToCartProduct"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_addToCartProduct', ['button_addToCartProduct_class': button_addToCartProduct_class_1, 'button_addToCartProduct_internalHasText': button_addToCartProduct_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 11-Click on button addToCartProduct SamsungGalaxyS23Ultra.png')

"Step 12: Click on link KCellphoneShop -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_KCellphoneShop'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 12-Click on link KCellphoneShop - Navigate to page .png')

"Step 13: Click on button addToCart (AddToCart2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_addToCart', ['button_addToCart_class': button_addToCart_class, 'button_addToCart_internalHasText': button_addToCart_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 13-Click on button addToCart AddToCart2.png')

"Step 14: Click on label productDetails (iPhone15)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_productDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_productDetails', ['label_productDetails_for': label_productDetails_for]))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 14-Click on label productDetails iPhone15.png')

"Step 15: Click on button Buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_Buy_1'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 15-Click on button Buy.png')

"Step 16: Click on button ProductAddedToCart -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_ProductAddedToCart'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 16-Click on button ProductAddedToCart - Navigate to page .png')

"Step 17: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC48-Add Multiple Products to Cart and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}