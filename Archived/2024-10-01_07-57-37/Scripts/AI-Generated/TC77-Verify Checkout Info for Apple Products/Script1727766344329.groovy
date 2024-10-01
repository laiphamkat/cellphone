import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
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

"Step 2: Hover over item object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_object_1'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 2-Hover over item object.png')

"Step 3: Click on link apple -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_apple'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 3-Click on link apple - Navigate to page category.png')

"Step 4: Click on button addToCart (AddToCart)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_addToCart', ['button_addToCart_class': button_addToCart_class, 'button_addToCart_internalHasText': button_addToCart_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 4-Click on button addToCart AddToCart.png')

"Step 5: Click on label storageColorOption (iPhone15Plus)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_storageColorOption"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_storageColorOption', ['label_storageColorOption_for': label_storageColorOption_for, 'label_storageColorOption_internalText': label_storageColorOption_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 5-Click on label storageColorOption iPhone15Plus.png')

"Step 6: Click on label storageColorOption (Cypress)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_storageColorOption"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_storageColorOption', ['label_storageColorOption_for': label_storageColorOption_for_1, 'label_storageColorOption_internalText': label_storageColorOption_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 6-Click on label storageColorOption Cypress.png')

"Step 7: Click on button Buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_Buy'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 7-Click on button Buy.png')

"Step 8: Click on link goToCart (GoToCart) -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_goToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_goToCart', ['link_goToCart_class': link_goToCart_class, 'link_goToCart_internalRoleLinkName': link_goToCart_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 8-Click on link goToCart GoToCart - Navigate to page cart.png')

"Step 9: Click on button ProceedToCheckout -> Navigate to page 'checkout/info'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 9-Click on button ProceedToCheckout - Navigate to page checkoutinfo.png')

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC77-Verify Checkout Info for Apple Products_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}