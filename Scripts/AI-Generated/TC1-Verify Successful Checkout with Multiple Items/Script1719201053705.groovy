import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
import katalon.common.fillUserInformationAndProceedToCheckout
import katalon.truetest.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://www.saucedemo.com/"

TrueTestScripts.navigate('/')

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Click on link item4Title -> Navigate to page 'inventory-item.html'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/link_item4Title'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3: Click on link item4Title - Navigate to page inventory-itemhtml.png')

"Step 4: Click on button addToCart"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory-item.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_item_html/button_addToCart'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4: Click on button addToCart.png')

"Step 5: Click on button backToProducts -> Navigate to page 'inventory.html'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory-item.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_item_html/button_backToProducts'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5: Click on button backToProducts - Navigate to page inventoryhtml.png')

"Step 6: Click on link sauceLabsBoltTshirt -> Navigate to page 'inventory-item.html'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/link_sauceLabsBoltTshirt'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6: Click on link sauceLabsBoltTshirt - Navigate to page inventory-itemhtml.png')

"Step 7: Click on button addToCart"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory-item.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_item_html/button_addToCart'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7: Click on button addToCart.png')

"Step 8: Click on link shoppingCart"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory-item.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_item_html/link_shoppingCart'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8: Click on link shoppingCart.png')

"Step 9: Fill out user information and proceed to checkout"

fillUserInformationAndProceedToCheckout.execute(data_path_0, Integer.valueOf(index_0))

"Step 10: Click on button finish -> Navigate to page ''"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-two.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step_two_html/button_finish'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10: Click on button finish - Navigate to page .png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Verify Successful Checkout with Multiple Items_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
