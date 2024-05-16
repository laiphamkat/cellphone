import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.common.navigateThroughCheckoutProcess
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import katalon.truetest.TrueTestScripts

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://www.saucedemo.com/"

TrueTestScripts.navigate('/')

"Step 2: Click on div 'login credentials'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_loginCredentials'))

WebUI.takeScreenshot()

"Step 3: Login into Application"

TrueTestScripts.login()

WebUI.takeScreenshot()

"Step 4: Click on link 'item 0 title link' -> Navigate to page 'inventory-item.html'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/link_item0TitleLink'))

WebUI.takeScreenshot()

"Step 5: Click on button 'add-to-cart'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory-item.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_item_html/button_addToCart'))

WebUI.takeScreenshot()

"Step 6: Click on link '1'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory-item.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_item_html/link_shoppingCartLink2'))

WebUI.takeScreenshot()

"Step 7: Navigate through checkout process"

navigateThroughCheckoutProcess.execute(data_path_0, Integer.valueOf(index_0))

"Step 8: Click on button 'finish' -> Navigate to page 'checkout-complete.html'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-two.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step_two_html/button_finish'))

WebUI.takeScreenshot()

"Step 9: Click on div 'checkout complete container'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-complete.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_complete_html/div_checkoutCompleteContainer'))

WebUI.takeScreenshot()

"Step 10: Click on button 'back-to-products' -> Navigate to page 'inventory.html'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-complete.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_complete_html/button_backToProducts'))

WebUI.takeScreenshot()

"Step 11: Click on link 'item 0 title link' -> Navigate to page 'inventory-item.html'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/link_item0TitleLink'))

WebUI.takeScreenshot()

"Step 12: Click on button 'add-to-cart'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory-item.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_item_html/button_addToCart'))

WebUI.takeScreenshot()

"Step 13: Click on link '1' -> Navigate to page 'cart.html'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory-item.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_item_html/link_shoppingCartLink2'))

WebUI.takeScreenshot()

"Step 14: Click on button 'checkout' -> Navigate to page 'inventory.html'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart_html/button_checkout'))

WebUI.takeScreenshot()

"Step 15: Click on link 'item 0 title link' -> Navigate to page 'inventory-item.html'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/link_item0TitleLink'))

WebUI.takeScreenshot()

"Step 16: Click on button 'add-to-cart'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory-item.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_item_html/button_addToCart'))

WebUI.takeScreenshot()

"Step 17: Click on link '1' -> Navigate to page ''"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory-item.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_item_html/link_shoppingCartLink2'))

WebUI.takeScreenshot()

"Step 18: Login into Application"

TrueTestScripts.login()

WebUI.takeScreenshot()

"Step 19: Click on button 'add-to-cart-sauce-labs-bike-light'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/button_addToCartSauceLabsBikeLight'))

WebUI.takeScreenshot()

"Step 20: Click on link '1'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/link_shoppingCartLink'))

WebUI.takeScreenshot()

"Step 21: Navigate through checkout process"

navigateThroughCheckoutProcess.execute(data_path_1, Integer.valueOf(index_1))

"Step 22: Click on button 'finish' -> Navigate to page 'checkout-complete.html'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-two.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step_two_html/button_finish'))

WebUI.takeScreenshot()

"Step 23: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Verify Successful Checkout Process with Multiple Items in Shopping Cart_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
