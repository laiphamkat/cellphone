import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts

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

WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_home/item_accessories'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 2-Hover over item accessories.png')

"Step 3: Click on link categoryChekhlyNaIphone -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_categoryChekhlyNaIphone', ['nthChild': link_categoryChekhlyNaIphone_nthChild, 'internalRoleLinkName': link_categoryChekhlyNaIphone_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 3-Click on link categoryChekhlyNaIphone - Navigate to page category.png')

"Step 4: Click on button sale20WusbpowerAdapter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_sale20WusbpowerAdapter', ['class': button_sale20WusbpowerAdapter_class, 'internalHasText': button_sale20WusbpowerAdapter_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 4-Click on button sale20WusbpowerAdapter.png')

"Step 5: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_object', ['internalRoleButtonName': button_object_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 5-Click on button object.png')

"Step 6: Click on label 512Gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_512Gb', ['for': label_512Gb_for, 'internalText': label_512Gb_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 6-Click on label 512Gb.png')

"Step 7: Click on label 512Gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_512Gb', ['for': label_512Gb_for, 'internalText': label_512Gb_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 7-Click on label 512Gb.png')

"Step 8: Click on button buy2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_buy2'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 8-Click on button buy2.png')

"Step 9: Click on link productApple20Wusbadapter -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_productApple20Wusbadapter', ['class': link_productApple20Wusbadapter_class, 'internalRoleLinkName': link_productApple20Wusbadapter_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 9-Click on link productApple20Wusbadapter - Navigate to page product.png')

"Step 10: Click on label 256Gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_256Gb', ['for': label_256Gb_for, 'internalText': label_256Gb_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 10-Click on label 256Gb.png')

"Step 11: Click on label 256Gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_256Gb', ['for': label_256Gb_for, 'internalText': label_256Gb_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 11-Click on label 256Gb.png')

"Step 12: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 12-Click on button buy.png')

"Step 13: Hover over item accessories"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_product/item_accessories', ['internalHasText': item_accessories_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 13-Hover over item accessories.png')

"Step 14: Click on link categoryChekhlyNaIphone -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_categoryChekhlyNaIphone', ['nthChild': link_categoryChekhlyNaIphone_nthChild, 'internalRoleLinkName': link_categoryChekhlyNaIphone_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 14-Click on link categoryChekhlyNaIphone - Navigate to page category.png')

"Step 15: Click on link categorySamsung"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_categorySamsung', ['internalRoleLinkName': link_categorySamsung_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 15-Click on link categorySamsung.png')

"Step 16: Click on link byTitle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_byTitle', ['nthChild': link_byTitle_nthChild, 'internalRoleLinkName': link_byTitle_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 16-Click on link byTitle.png')

"Step 17: Click on link byTitle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_byTitle', ['nthChild': link_byTitle_nthChild, 'internalRoleLinkName': link_byTitle_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 17-Click on link byTitle.png')

"Step 18: Click on link productApple20Wusbadapter -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_productApple20Wusbadapter', ['class': link_productApple20Wusbadapter_class, 'internalRoleLinkName': link_productApple20Wusbadapter_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 18-Click on link productApple20Wusbadapter - Navigate to page product.png')

"Step 19: Click on label 256Gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_256Gb', ['for': label_256Gb_for, 'internalText': label_256Gb_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 19-Click on label 256Gb.png')

"Step 20: Click on label 256Gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_256Gb', ['for': label_256Gb_for, 'internalText': label_256Gb_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 20-Click on label 256Gb.png')

"Step 21: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 21-Click on button buy.png')

"Step 22: Click on link placeAnOrder -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_placeAnOrder'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 22-Click on link placeAnOrder - Navigate to page cart.png')

"Step 23: Click on button remove"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_remove', ['class': button_remove_class, 'nth': button_remove_nth]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 23-Click on button remove.png')

"Step 24: Hover over item listitem2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_cart/item_listitem2', ['nth': item_listitem2_nth]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 24-Hover over item listitem2.png')

"Step 25: Click on link apple -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_apple'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 25-Click on link apple - Navigate to page category.png')

"Step 26: Click on link byTitle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_byTitle', ['nthChild': link_byTitle_nthChild, 'internalRoleLinkName': link_byTitle_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 26-Click on link byTitle.png')

"Step 27: Click on link categorySamsung"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_categorySamsung', ['internalRoleLinkName': link_categorySamsung_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 27-Click on link categorySamsung.png')

"Step 28: Click on link productApple20Wusbadapter -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_productApple20Wusbadapter', ['class': link_productApple20Wusbadapter_class, 'internalRoleLinkName': link_productApple20Wusbadapter_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 28-Click on link productApple20Wusbadapter - Navigate to page product.png')

"Step 29: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy_1'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 29-Click on button buy.png')

"Step 30: Click on link placeAnOrder -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_placeAnOrder'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 30-Click on link placeAnOrder - Navigate to page cart.png')

"Step 31: Click on button proceedToCheckout -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 31-Click on button proceedToCheckout - Navigate to page .png')

"Step 32: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-013_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}