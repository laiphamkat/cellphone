import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Hover over item accessories"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Parameterized Objects/Page_home/item_accessories'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 2: Hover over item accessories.png')

"Step 3: Click on link categoryChekhly -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_home/link_categoryChekhly', ['nthChildIndex': link_categoryChekhly_nthChildIndex, 'internalRoleLinkNameVariable': link_categoryChekhly_internalRoleLinkNameVariable]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 3: Click on link categoryChekhly - Navigate to page category.png')

"Step 4: Click on button productsItemInStock"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_category/button_productsItemInStock', ['internalHasTextVariable': button_productsItemInStock_internalHasTextVariable]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 4: Click on button productsItemInStock.png')

"Step 5: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 5: Click on button object.png')

"Step 6: Click on label pink"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_category/label_pink', ['internalTextVariable': label_pink_internalTextVariable, 'forVariable': label_pink_forVariable]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 6: Click on label pink.png')

"Step 7: Click on label pink"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_category/label_pink', ['internalTextVariable': label_pink_internalTextVariable, 'forVariable': label_pink_forVariable]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 7: Click on label pink.png')

"Step 8: Click on button buy2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_buy2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 8: Click on button buy2.png')

"Step 9: Click on link product20Wusbadapter -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_category/link_product20Wusbadapter', ['classVariable': link_product20Wusbadapter_classVariable, 'internalRoleLinkNameVariable': link_product20Wusbadapter_internalRoleLinkNameVariable]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 9: Click on link product20Wusbadapter - Navigate to page product.png')

"Step 10: Click on label object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_product/label_object', ['internalTextVariable': label_object_internalTextVariable, 'forVariable': label_object_forVariable]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 10: Click on label object.png')

"Step 11: Click on label object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_product/label_object', ['internalTextVariable': label_object_internalTextVariable, 'forVariable': label_object_forVariable]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 11: Click on label object.png')

"Step 12: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 12: Click on button buy.png')

"Step 13: Hover over item accessories"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Parameterized Objects/Page_product/item_accessories', ['internalHasTextVariable': item_accessories_internalHasTextVariable]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 13: Hover over item accessories.png')

"Step 14: Click on link categoryChekhly -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_product/link_categoryChekhly', ['nthChildIndex': link_categoryChekhly_nthChildIndex, 'internalRoleLinkNameVariable': link_categoryChekhly_internalRoleLinkNameVariable]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 14: Click on link categoryChekhly - Navigate to page category.png')

"Step 15: Click on link categorySamsung"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_category/link_categorySamsung', ['internalRoleLinkNameVariable': link_categorySamsung_internalRoleLinkNameVariable]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 15: Click on link categorySamsung.png')

"Step 16: Click on link byTitle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_category/link_byTitle', ['nthChildIndex': link_byTitle_nthChildIndex, 'internalRoleLinkNameVariable': link_byTitle_internalRoleLinkNameVariable]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 16: Click on link byTitle.png')

"Step 17: Click on link byTitle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_category/link_byTitle', ['nthChildIndex': link_byTitle_nthChildIndex, 'internalRoleLinkNameVariable': link_byTitle_internalRoleLinkNameVariable]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 17: Click on link byTitle.png')

"Step 18: Click on link product20Wusbadapter -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_category/link_product20Wusbadapter', ['classVariable': link_product20Wusbadapter_classVariable, 'internalRoleLinkNameVariable': link_product20Wusbadapter_internalRoleLinkNameVariable]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 18: Click on link product20Wusbadapter - Navigate to page product.png')

"Step 19: Click on label object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_product/label_object', ['internalTextVariable': label_object_internalTextVariable, 'forVariable': label_object_forVariable]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 19: Click on label object.png')

"Step 20: Click on label object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_product/label_object', ['internalTextVariable': label_object_internalTextVariable, 'forVariable': label_object_forVariable]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 20: Click on label object.png')

"Step 21: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 21: Click on button buy.png')

"Step 22: Click on link placeAnOrder -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_placeAnOrder'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 22: Click on link placeAnOrder - Navigate to page cart.png')

"Step 23: Click on button removeButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_removeButton'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 23: Click on button removeButton.png')

"Step 24: Hover over item listitem2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_cart/item_listitem2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 24: Hover over item listitem2.png')

"Step 25: Click on link apple -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_apple'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 25: Click on link apple - Navigate to page category.png')

"Step 26: Click on link byTitle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_category/link_byTitle', ['nthChildIndex': link_byTitle_nthChildIndex, 'internalRoleLinkNameVariable': link_byTitle_internalRoleLinkNameVariable]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 26: Click on link byTitle.png')

"Step 27: Click on link categorySamsung"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_category/link_categorySamsung', ['internalRoleLinkNameVariable': link_categorySamsung_internalRoleLinkNameVariable]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 27: Click on link categorySamsung.png')

"Step 28: Click on link product20Wusbadapter -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_category/link_product20Wusbadapter', ['classVariable': link_product20Wusbadapter_classVariable, 'internalRoleLinkNameVariable': link_product20Wusbadapter_internalRoleLinkNameVariable]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 28: Click on link product20Wusbadapter - Navigate to page .png')

"Step 29: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Order Multiple Products and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}