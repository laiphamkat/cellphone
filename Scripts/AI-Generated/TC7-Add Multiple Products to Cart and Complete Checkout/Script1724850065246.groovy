import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.truetest.TrueTestScripts
import internal.GlobalVariable
import katalon.common.completeCheckoutProcessWithShippingDetails

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on button addToCart (addToCart2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_addToCart', ['button_addToCart_class': button_addToCart_class, 'button_addToCart_internalHasText': button_addToCart_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 2-Click on button addToCart addToCart2.png')

"Step 3: Click on label colorStorageOptions (512Gb)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_colorStorageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_colorStorageOptions', ['label_colorStorageOptions_for': label_colorStorageOptions_for, 'label_colorStorageOptions_internalText': label_colorStorageOptions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 3-Click on label colorStorageOptions 512Gb.png')

"Step 4: Click on label colorStorageOptions (blueTitanium)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_colorStorageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_colorStorageOptions', ['label_colorStorageOptions_for': label_colorStorageOptions_for_1, 'label_colorStorageOptions_internalText': label_colorStorageOptions_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 4-Click on label colorStorageOptions blueTitanium.png')

"Step 5: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 5-Click on button buy.png')

"Step 6: Click on link iphone15SiliconeCaseWithMagSafe -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_iphone15SiliconeCaseWithMagSafe'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 6-Click on link iphone15SiliconeCaseWithMagSafe - Navigate to page product.png')

"Step 7: Click on label productSpecifications (iphone15Pro)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_productSpecifications"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_productSpecifications', ['label_productSpecifications_for': label_productSpecifications_for, 'label_productSpecifications_internalText': label_productSpecifications_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 7-Click on label productSpecifications iphone15Pro.png')

"Step 8: Click on label productSpecifications (winterBlue)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_productSpecifications"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_productSpecifications', ['label_productSpecifications_for': label_productSpecifications_for_1, 'label_productSpecifications_internalText': label_productSpecifications_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 8-Click on label productSpecifications winterBlue.png')

"Step 9: Click on button buy2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy2'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 9-Click on button buy2.png')

"Step 10: Click on link cart (cart)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/link_cart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_cart', ['link_cart_internalRoleLinkName': link_cart_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 10-Click on link cart cart.png')

"Step 11: Fill in shipping details and complete the checkout process"

completeCheckoutProcessWithShippingDetails.execute(data_path_0, Integer.valueOf(index_0))

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC7-Add Multiple Products to Cart and Complete Checkout_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}