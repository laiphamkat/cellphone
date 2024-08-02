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

WebUI.takeScreenshot(reportLocation + '/TC12/Step 2-Hover over item accessories.png')

"Step 3: Click on link categoryChekhlyNaIphone -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_categoryChekhlyNaIphone', ['nthChild': link_categoryChekhlyNaIphone_nthChild, 'internalRoleLinkName': link_categoryChekhlyNaIphone_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 3-Click on link categoryChekhlyNaIphone - Navigate to page category.png')

"Step 4: Click on link iPhone15HotNew -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_iPhone15HotNew'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 4-Click on link iPhone15HotNew - Navigate to page product.png')

"Step 5: Click on list horizontalMenuList"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/list_horizontalMenuList'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 5-Click on list horizontalMenuList.png')

"Step 6: Click on button plus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_plus', ['internalRoleButtonName': button_plus_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 6-Click on button plus.png')

"Step 7: Click on label 256Gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_256Gb', ['for': label_256Gb_for, 'internalText': label_256Gb_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 7-Click on label 256Gb.png')

"Step 8: Click on label 256Gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_256Gb', ['for': label_256Gb_for, 'internalText': label_256Gb_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 8-Click on label 256Gb.png')

"Step 9: Click on button plus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_plus', ['internalRoleButtonName': button_plus_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 9-Click on button plus.png')

"Step 10: Click on button plus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_plus', ['internalRoleButtonName': button_plus_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 10-Click on button plus.png')

"Step 11: Click on link goToCart -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_goToCart'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 11-Click on link goToCart - Navigate to page cart.png')

"Step 12: Click on button proceedToCheckout -> Navigate to page 'checkout/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 12-Click on button proceedToCheckout - Navigate to page checkout.png')

"Step 13: Hover over div emailMeWithNews"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_emailMeWithNews'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 13-Hover over div emailMeWithNews.png')

"Step 14: Click on input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_email'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 14-Click on input email.png')

"Step 15: Enter input value in input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_email'), var_1_input_email)

WebUI.takeScreenshot(reportLocation + '/TC12/Step 15-Enter input value in input email.png')

"Step 16: Click on button continueToShipping"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_continueToShipping'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 16-Click on button continueToShipping.png')

"Step 17: Click on link backToTheCart -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/link_backToTheCart'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 17-Click on link backToTheCart - Navigate to page cart.png')

"Step 18: Hover over item listitem2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_cart/item_listitem2', ['nth': item_listitem2_nth]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 18-Hover over item listitem2.png')

"Step 19: Click on link apple2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_apple2'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 19-Click on link apple2.png')

"Step 20: Click on link apple2 -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_apple2'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 20-Click on link apple2 - Navigate to page category.png')

"Step 21: Click on button newiPhone15Plus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_newiPhone15Plus', ['class': button_newiPhone15Plus_class, 'internalHasText': button_newiPhone15Plus_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 21-Click on button newiPhone15Plus.png')

"Step 22: Click on button newiPhone15Plus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_newiPhone15Plus', ['class': button_newiPhone15Plus_class, 'internalHasText': button_newiPhone15Plus_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 22-Click on button newiPhone15Plus.png')

"Step 23: Click on label 512Gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_512Gb', ['for': label_512Gb_for, 'internalText': label_512Gb_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 23-Click on label 512Gb.png')

"Step 24: Click on label 512Gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_512Gb', ['for': label_512Gb_for, 'internalText': label_512Gb_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 24-Click on label 512Gb.png')

"Step 25: Click on label 512Gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_512Gb', ['for': label_512Gb_for, 'internalText': label_512Gb_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 25-Click on label 512Gb.png')

"Step 26: Click on label 512Gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_512Gb', ['for': label_512Gb_for, 'internalText': label_512Gb_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 26-Click on label 512Gb.png')

"Step 27: Click on button buy2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_buy2'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 27-Click on button buy2.png')

"Step 28: Click on button buy2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_buy2'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 28-Click on button buy2.png')

"Step 29: Click on link goToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_goToCart', ['class': link_goToCart_class, 'internalRoleLinkName': link_goToCart_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 29-Click on link goToCart.png')

"Step 30: Click on link goToCart -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_goToCart', ['class': link_goToCart_class, 'internalRoleLinkName': link_goToCart_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 30-Click on link goToCart - Navigate to page cart.png')

"Step 31: Click on button proceedToCheckout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 31-Click on button proceedToCheckout.png')

"Step 32: Click on button proceedToCheckout -> Navigate to page 'checkout/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 32-Click on button proceedToCheckout - Navigate to page checkout.png')

"Step 33: Hover over div emailMeWithNews"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_emailMeWithNews'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 33-Hover over div emailMeWithNews.png')

"Step 34: Click on input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_email'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 34-Click on input email.png')

"Step 35: Enter input value in input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_email'), var_2_input_email)

WebUI.takeScreenshot(reportLocation + '/TC12/Step 35-Enter input value in input email.png')

"Step 36: Click on button continueToShipping -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_continueToShipping'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 36-Click on button continueToShipping - Navigate to page .png')

"Step 37: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-012_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}