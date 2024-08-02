import katalon.common.subscribeToEmailUpdatesAndContinueToShipping
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
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

WebUI.takeScreenshot(reportLocation + '/TC11/Step 2-Hover over item accessories.png')

"Step 3: Click on link categoryChekhlyNaIphone -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_categoryChekhlyNaIphone', ['nthChild': link_categoryChekhlyNaIphone_nthChild, 'internalRoleLinkName': link_categoryChekhlyNaIphone_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 3-Click on link categoryChekhlyNaIphone - Navigate to page category.png')

"Step 4: Click on link byTitle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_byTitle', ['nthChild': link_byTitle_nthChild, 'internalRoleLinkName': link_byTitle_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 4-Click on link byTitle.png')

"Step 5: Click on link byTitle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_byTitle', ['nthChild': link_byTitle_nthChild, 'internalRoleLinkName': link_byTitle_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 5-Click on link byTitle.png')

"Step 6: Click on link categorySamsung"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_categorySamsung', ['internalRoleLinkName': link_categorySamsung_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 6-Click on link categorySamsung.png')

"Step 7: Click on link productApple20Wusbadapter -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_productApple20Wusbadapter', ['class': link_productApple20Wusbadapter_class, 'internalRoleLinkName': link_productApple20Wusbadapter_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 7-Click on link productApple20Wusbadapter - Navigate to page product.png')

"Step 8: Click on label 256Gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_256Gb', ['for': label_256Gb_for, 'internalText': label_256Gb_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 8-Click on label 256Gb.png')

"Step 9: Click on label 256Gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_256Gb', ['for': label_256Gb_for, 'internalText': label_256Gb_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 9-Click on label 256Gb.png')

"Step 10: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 10-Click on button buy.png')

"Step 11: Click on link placeAnOrder -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_placeAnOrder'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 11-Click on link placeAnOrder - Navigate to page cart.png')

"Step 12: Click on button increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_increased', ['class': button_increased_class]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 12-Click on button increased.png')

"Step 13: Click on link goToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/link_goToCart', ['internalRoleLinkName': link_goToCart_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 13-Click on link goToCart.png')

"Step 14: Click on button proceedToCheckout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 14-Click on button proceedToCheckout.png')

"Step 15: Subscribe to email updates and proceed to shipping"

subscribeToEmailUpdatesAndContinueToShipping.execute(data_path_0, Integer.valueOf(index_0))

"Step 16: Hover over div emailMeWithNews"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_emailMeWithNews'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 16-Hover over div emailMeWithNews.png')

"Step 17: Click on input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_email'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 17-Click on input email.png')

"Step 18: Enter input value in input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_email'), var_1_input_email)

WebUI.takeScreenshot(reportLocation + '/TC11/Step 18-Enter input value in input email.png')

"Step 19: Click on button continueToShipping -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_continueToShipping'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 19-Click on button continueToShipping - Navigate to page .png')

"Step 20: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC11-Purchase Multiple Accessories and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}