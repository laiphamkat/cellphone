import truetest.custom.TrueTestScripts
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
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

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Click on link ItemTitle -> Navigate to page '/inventory-item.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/link_ItemTitle'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on link ItemTitle - Navigate to page inventory-itemhtml.png')

"Step 4: Click on button AddToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory-item.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_item_html/button_AddToCart'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on button AddToCart.png')

"Step 5: Click on link ShoppingCart -> Navigate to page '/cart.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory-item.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_item_html/link_ShoppingCart'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on link ShoppingCart - Navigate to page carthtml.png')

"Step 6: Click on button Checkout -> Navigate to page '/checkout-step-one.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart_html/button_Checkout'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on button Checkout - Navigate to page checkout-step-onehtml.png')

"Step 7: Click on input FirstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-one.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step_one_html/input_FirstName'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on input FirstName.png')

"Step 8: Enter input value in input FirstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-one.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_step_one_html/input_FirstName'), input_FirstName)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Enter input value in input FirstName.png')

"Step 9: Click on input LastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-one.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step_one_html/input_LastName'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on input LastName.png')

"Step 10: Enter input value in input LastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-one.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_step_one_html/input_LastName'), input_LastName)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Enter input value in input LastName.png')

"Step 11: Enter input value in input PostalCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-one.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_step_one_html/input_PostalCode'), input_PostalCode)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Enter input value in input PostalCode.png')

"Step 12: Click on input Continue -> Navigate to page '/checkout-step-two.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-one.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step_one_html/input_Continue'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Click on input Continue - Navigate to page checkout-step-twohtml.png')

"Step 13: Click on button Finish -> Navigate to page '/checkout-complete.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-two.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step_two_html/button_Finish'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 13-Click on button Finish - Navigate to page checkout-completehtml.png')

"Step 14: Click on button BackHome -> Navigate to page '/inventory.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-complete.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_complete_html/button_BackHome'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 14-Click on button BackHome - Navigate to page inventoryhtml.png')

"Step 15: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Complete Checkout Process for a Single Item in Sauce Demo Application_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}