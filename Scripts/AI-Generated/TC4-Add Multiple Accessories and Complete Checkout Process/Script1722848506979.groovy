import katalon.common.subscribeEmailAndFillShippingDetails
import com.kms.katalon.core.configuration.RunConfiguration
import katalon.truetest.TrueTestScripts
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.common.browseAccessoriesAndAddToCart

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Browse accessories and add items to the cart"

browseAccessoriesAndAddToCart.execute(data_path_0, Integer.valueOf(index_0))

"Step 3: Click on label iPhone15Plus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_iPhone15Plus', ['for': label_iPhone15Plus_for, 'internalText': label_iPhone15Plus_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 3-Click on label iPhone15Plus.png')

"Step 4: Click on label iPhone15Plus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_iPhone15Plus', ['for': label_iPhone15Plus_for, 'internalText': label_iPhone15Plus_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 4-Click on label iPhone15Plus.png')

"Step 5: Click on link goToCart -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_goToCart'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 5-Click on link goToCart - Navigate to page cart.png')

"Step 6: Click on label iPhone15Plus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/label_iPhone15Plus', ['for': label_iPhone15Plus_for, 'internalText': label_iPhone15Plus_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 6-Click on label iPhone15Plus.png')

"Step 7: Click on label iPhone15Plus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/label_iPhone15Plus', ['for': label_iPhone15Plus_for, 'internalText': label_iPhone15Plus_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 7-Click on label iPhone15Plus.png')

"Step 8: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 8-Click on button buy.png')

"Step 9: Hover over link goToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_cart/link_goToCart', ['internalRoleLinkName': link_goToCart_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 9-Hover over link goToCart.png')

"Step 10: Click on span shoppingCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/span_shoppingCart', ['internalRoleLinkName': span_shoppingCart_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 10-Click on span shoppingCart.png')

"Step 11: Hover over link goToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_cart/link_goToCart', ['internalRoleLinkName': link_goToCart_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 11-Hover over link goToCart.png')

"Step 12: Click on span shoppingCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/span_shoppingCart', ['internalRoleLinkName': span_shoppingCart_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 12-Click on span shoppingCart.png')

"Step 13: Click on link goShopping -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_goShopping'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 13-Click on link goShopping - Navigate to page .png')

"Step 14: Click on button addToCartSamsungGalaxyS23"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_addToCartSamsungGalaxyS23'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 14-Click on button addToCartSamsungGalaxyS23.png')

"Step 15: Click on label 512Gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_512Gb', ['for': label_512Gb_for, 'internalText': label_512Gb_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 15-Click on label 512Gb.png')

"Step 16: Click on label 512Gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_512Gb', ['for': label_512Gb_for, 'internalText': label_512Gb_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 16-Click on label 512Gb.png')

"Step 17: Click on button closeButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_closeButton'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 17-Click on button closeButton.png')

"Step 18: Click on button addToCartBestChoiceIphone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_addToCartBestChoiceIphone', ['class': button_addToCartBestChoiceIphone_class, 'internalHasText': button_addToCartBestChoiceIphone_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 18-Click on button addToCartBestChoiceIphone.png')

"Step 19: Click on label 512Gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_512Gb', ['for': label_512Gb_for, 'internalText': label_512Gb_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 19-Click on label 512Gb.png')

"Step 20: Click on label 512Gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_512Gb', ['for': label_512Gb_for, 'internalText': label_512Gb_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 20-Click on label 512Gb.png')

"Step 21: Click on button buy2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_buy2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 21-Click on button buy2.png')

"Step 22: Hover over link goToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/link_goToCart'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 22-Hover over link goToCart.png')

"Step 23: Click on span shoppingCart -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_shoppingCart'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 23-Click on span shoppingCart - Navigate to page cart.png')

"Step 24: Click on button proceedToCheckout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 24-Click on button proceedToCheckout.png')

"Step 25: Complete email subscription and fill shipping details"

subscribeEmailAndFillShippingDetails.execute(data_path_1, Integer.valueOf(index_1))

"Step 26: Click on button contactInfo -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_contactInfo'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 26-Click on button contactInfo - Navigate to page .png')

"Step 27: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Add Multiple Accessories and Complete Checkout Process_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}