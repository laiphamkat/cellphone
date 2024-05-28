import katalon.truetest.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import katalon.common.fillShippingInfoAndProceedToCheckoutConfirmation
import com.kms.katalon.core.configuration.RunConfiguration

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 2: Navigate to https://www.saucedemo.com/"

TrueTestScripts.navigate('/')

"Step 3: Login into Application"

TrueTestScripts.login()

"Step 4: Click on link 'item 3 title link' -> Navigate to page 'inventory-item.html'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_inventory_html/link_testAllTheThingsTshirtRed'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/link_testAllTheThingsTshirtRed'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4: Click on link item 3 title link - Navigate to page inventory-itemhtml.png')

"Step 5: Click on button 'add-to-cart'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_inventory_item_html/button_addToCart'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory-item.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_item_html/button_addToCart'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 5: Click on button add-to-cart.png')

"Step 6: Click on button 'back-to-products' -> Navigate to page 'inventory.html'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_inventory_item_html/button_backToProducts'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory-item.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_item_html/button_backToProducts'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 6: Click on button back-to-products - Navigate to page inventoryhtml.png')

"Step 7: Click on button 'add-to-cart-sauce-labs-backpack'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_inventory_html/button_addToCartSauceLabsBackpack'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/button_addToCartSauceLabsBackpack'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 7: Click on button add-to-cart-sauce-labs-backpack.png')

"Step 8: Click on link '2' -> Navigate to page 'cart.html'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_inventory_html/link_shoppingCart'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/link_shoppingCart'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 8: Click on link 2 - Navigate to page carthtml.png')

"Step 9: Click on button 'continue-shopping' -> Navigate to page 'inventory.html'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_cart_html/button_continueShopping'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart_html/button_continueShopping'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 9: Click on button continue-shopping - Navigate to page inventoryhtml.png')

"Step 10: Click on button 'add-to-cart-sauce-labs-bike-light'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_inventory_html/button_addToCartSauceLabsBikeLight'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/button_addToCartSauceLabsBikeLight'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 10: Click on button add-to-cart-sauce-labs-bike-light.png')

"Step 11: Click on link '3' -> Navigate to page 'cart.html'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_inventory_html/link_shoppingCart'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/link_shoppingCart'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 11: Click on link 3 - Navigate to page carthtml.png')

"Step 12: Click on div"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_cart_html/div_continueShoppingCheckout'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart_html/div_continueShoppingCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 12: Click on div.png')

"Step 13: Fill out shipping information and proceed to checkout confirmation"

fillShippingInfoAndProceedToCheckoutConfirmation.execute(data_path_0, Integer.valueOf(index_0))

"Step 14: Click on button 'finish' -> Navigate to page 'checkout-complete.html'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_step_two_html/button_finish'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-two.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step_two_html/button_finish'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 14: Click on button finish - Navigate to page checkout-completehtml.png')

"Step 15: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Verify Checkout Completion for Specific Item_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
