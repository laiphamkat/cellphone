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

WebUI.takeScreenshot(reportLocation + '/TC2/Step 2: Hover over item accessories.png')

"Step 3: Click on link categoryChekhly -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_home/link_categoryChekhly', ['nthChildIndex': link_categoryChekhly_nthChildIndex, 'internalRoleLinkNameVariable': link_categoryChekhly_internalRoleLinkNameVariable]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 3: Click on link categoryChekhly - Navigate to page category.png')

"Step 4: Click on button productsItemInStock"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_category/button_productsItemInStock', ['internalHasTextVariable': button_productsItemInStock_internalHasTextVariable]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4: Click on button productsItemInStock.png')

"Step 5: Click on button increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_increased'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 5: Click on button increased.png')

"Step 6: Click on button closeButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_closeButton'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 6: Click on button closeButton.png')

"Step 7: Click on link product20Wusbadapter -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_category/link_product20Wusbadapter', ['classVariable': link_product20Wusbadapter_classVariable, 'internalRoleLinkNameVariable': link_product20Wusbadapter_internalRoleLinkNameVariable]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 7: Click on link product20Wusbadapter - Navigate to page product.png')

"Step 8: Hover over item accessories"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Parameterized Objects/Page_product/item_accessories', ['internalHasTextVariable': item_accessories_internalHasTextVariable]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 8: Hover over item accessories.png')

"Step 9: Click on link categoryChekhly -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_product/link_categoryChekhly', ['nthChildIndex': link_categoryChekhly_nthChildIndex, 'internalRoleLinkNameVariable': link_categoryChekhly_internalRoleLinkNameVariable]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 9: Click on link categoryChekhly - Navigate to page category.png')

"Step 10: Click on link product20Wusbadapter -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_category/link_product20Wusbadapter', ['classVariable': link_product20Wusbadapter_classVariable, 'internalRoleLinkNameVariable': link_product20Wusbadapter_internalRoleLinkNameVariable]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 10: Click on link product20Wusbadapter - Navigate to page product.png')

"Step 11: Hover over item accessories"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Parameterized Objects/Page_product/item_accessories', ['internalHasTextVariable': item_accessories_internalHasTextVariable]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 11: Hover over item accessories.png')

"Step 12: Click on link categoryChekhly -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_product/link_categoryChekhly', ['nthChildIndex': link_categoryChekhly_nthChildIndex, 'internalRoleLinkNameVariable': link_categoryChekhly_internalRoleLinkNameVariable]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 12: Click on link categoryChekhly - Navigate to page category.png')

"Step 13: Click on link categorySamsung"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_category/link_categorySamsung', ['internalRoleLinkNameVariable': link_categorySamsung_internalRoleLinkNameVariable]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 13: Click on link categorySamsung.png')

"Step 14: Click on link categorySamsung"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_category/link_categorySamsung', ['internalRoleLinkNameVariable': link_categorySamsung_internalRoleLinkNameVariable]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 14: Click on link categorySamsung.png')

"Step 15: Hover over item accessories"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_category/item_accessories'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 15: Hover over item accessories.png')

"Step 16: Click on link apple -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_apple'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 16: Click on link apple - Navigate to page .png')

"Step 17: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Verify Navigation and Stock Check for Accessories Category_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}