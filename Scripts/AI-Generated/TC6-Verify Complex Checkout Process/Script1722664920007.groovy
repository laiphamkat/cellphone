import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import katalon.common.fillUserInformationAndProceedToCheckout
import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://www.saucedemo.com/"

TrueTestScripts.navigate("/")

"Step 2: Click on div loginCredentials"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_loginCredentials'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 2: Click on div loginCredentials.png')

"Step 3: Login into Application"

TrueTestScripts.login()

"Step 4: Click on link item0TitleLink -> Navigate to page 'inventory-item.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/link_item0TitleLink'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 4: Click on link item0TitleLink - Navigate to page inventory-itemhtml.png')

"Step 5: Click on button addToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory-item.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_item_html/button_addToCart'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 5: Click on button addToCart.png')

"Step 6: Click on link shoppingCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory-item.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_item_html/link_shoppingCart'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 6: Click on link shoppingCart.png')

"Step 7: Fill out user information and proceed to checkout"

fillUserInformationAndProceedToCheckout.execute(data_path_0, Integer.valueOf(index_0))

"Step 8: Click on button finish -> Navigate to page 'checkout-complete.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-two.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step_two_html/button_finish'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 8: Click on button finish - Navigate to page checkout-completehtml.png')

"Step 9: Click on div checkoutCompleteContainer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-complete.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_complete_html/div_checkoutCompleteContainer'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 9: Click on div checkoutCompleteContainer.png')

"Step 10: Click on button backToProducts -> Navigate to page 'inventory.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-complete.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_complete_html/button_backToProducts'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 10: Click on button backToProducts - Navigate to page inventoryhtml.png')

"Step 11: Click on link item0TitleLink -> Navigate to page 'inventory-item.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/link_item0TitleLink'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 11: Click on link item0TitleLink - Navigate to page inventory-itemhtml.png')

"Step 12: Click on button addToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory-item.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_item_html/button_addToCart'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 12: Click on button addToCart.png')

"Step 13: Click on link shoppingCart -> Navigate to page 'cart.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory-item.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_item_html/link_shoppingCart'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 13: Click on link shoppingCart - Navigate to page carthtml.png')

"Step 14: Click on button checkout -> Navigate to page 'inventory.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart_html/button_checkout'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 14: Click on button checkout - Navigate to page inventoryhtml.png')

"Step 15: Click on link item4Title -> Navigate to page 'inventory-item.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/link_item4Title'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 15: Click on link item4Title - Navigate to page inventory-itemhtml.png')

"Step 16: Click on button addToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory-item.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_item_html/button_addToCart'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 16: Click on button addToCart.png')

"Step 17: Click on link shoppingCart -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory-item.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_item_html/link_shoppingCart'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 17: Click on link shoppingCart - Navigate to page .png')

"Step 18: Login into Application"

TrueTestScripts.login()

"Step 19: Click on button addToCartSauceLabsBikeLight"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/button_addToCartSauceLabsBikeLight'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 19: Click on button addToCartSauceLabsBikeLight.png')

"Step 20: Click on link shoppingCartLink2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/link_shoppingCartLink2'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 20: Click on link shoppingCartLink2.png')

"Step 21: Fill out user information and proceed to checkout"

fillUserInformationAndProceedToCheckout.execute(data_path_1, Integer.valueOf(index_1))

"Step 22: Click on button finish -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-two.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step_two_html/button_finish'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 22: Click on button finish - Navigate to page .png')

"Step 23: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Verify Complex Checkout Process_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}