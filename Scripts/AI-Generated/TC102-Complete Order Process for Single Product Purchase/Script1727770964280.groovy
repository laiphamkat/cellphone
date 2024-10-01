import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Hover over item productCategories (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_productCategories_1'))

WebUI.takeScreenshot(reportLocation + '/TC102/Step 2-Hover over item productCategories object.png')

"Step 3: Click on link brandNames (Apple) -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_brandNames"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_brandNames', ['link_brandNames_nthChild': link_brandNames_nthChild, 'link_brandNames_internalRoleLinkName': link_brandNames_internalRoleLinkName, 'link_brandNames_category_id': link_brandNames_category_id]))

WebUI.takeScreenshot(reportLocation + '/TC102/Step 3-Click on link brandNames Apple - Navigate to page category.png')

"Step 4: Click on button addToCart (addToCart)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_addToCart', ['button_addToCart_class': button_addToCart_class, 'button_addToCart_internalHasText': button_addToCart_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC102/Step 4-Click on button addToCart addToCart.png')

"Step 5: Click on label productAttributes (512GB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_productAttributes"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_productAttributes', ['label_productAttributes_for': label_productAttributes_for, 'label_productAttributes_internalText': label_productAttributes_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC102/Step 5-Click on label productAttributes 512GB.png')

"Step 6: Click on label productAttributes (Color)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_productAttributes"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_productAttributes', ['label_productAttributes_for': label_productAttributes_for_1, 'label_productAttributes_internalText': label_productAttributes_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC102/Step 6-Click on label productAttributes Color.png')

"Step 7: Click on button Buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_Buy'))

WebUI.takeScreenshot(reportLocation + '/TC102/Step 7-Click on button Buy.png')

"Step 8: Click on link goToCart (GoToCart) -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_goToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_goToCart', ['link_goToCart_internalRoleLinkName': link_goToCart_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC102/Step 8-Click on link goToCart GoToCart - Navigate to page cart.png')

"Step 9: Click on button ProceedToCheckout -> Navigate to page 'checkout/payment'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_ProceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC102/Step 9-Click on button ProceedToCheckout - Navigate to page checkoutpayment.png')

"Step 10: Click on button CompleteOrder -> Navigate to page 'thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC102/Step 10-Click on button CompleteOrder - Navigate to page thank-you.png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC102-Complete Order Process for Single Product Purchase_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}