import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
import katalon.common.fillShippingInfoAndProceedToCheckoutConfirmation
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

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

"Step 4: Click on button 'add-to-cart-sauce-labs-backpack'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_inventory_html/button_addToCartSauceLabsBackpack'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/button_addToCartSauceLabsBackpack'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4: Click on button add-to-cart-sauce-labs-backpack.png')

"Step 5: Click on button 'add-to-cart-sauce-labs-bolt-t-shirt'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_inventory_html/button_addToCartSauceLabsBoltTshirt'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/button_addToCartSauceLabsBoltTshirt'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5: Click on button add-to-cart-sauce-labs-bolt-t-shirt.png')

"Step 6: Click on button 'add-to-cart-sauce-labs-onesie'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_inventory_html/button_addToCartSauceLabsOnesie'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/button_addToCartSauceLabsOnesie'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6: Click on button add-to-cart-sauce-labs-onesie.png')

"Step 7: Click on button 'add-to-cart-test.allthethings()-t-shirt-(red)'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_inventory_html/button_addToCartTestAllTheThingsTshirtRed'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/button_addToCartTestAllTheThingsTshirtRed'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7: Click on button add-to-cart-testallthethings-t-shirt-red.png')

"Step 8: Click on button 'add-to-cart-sauce-labs-bike-light'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_inventory_html/button_addToCartSauceLabsBikeLight'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/button_addToCartSauceLabsBikeLight'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8: Click on button add-to-cart-sauce-labs-bike-light.png')

"Step 9: Click on link '5' -> Navigate to page 'cart.html'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_inventory_html/link_shoppingCart'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/link_shoppingCart'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9: Click on link 5 - Navigate to page carthtml.png')

"Step 10: Click on button 'remove-sauce-labs-bike-light'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_cart_html/button_removeSauceLabsBikeLight'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart_html/button_removeSauceLabsBikeLight'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10: Click on button remove-sauce-labs-bike-light.png')

"Step 11: Click on button 'remove-sauce-labs-bolt-t-shirt'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_cart_html/button_removeSauceLabsBoltTshirt'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart_html/button_removeSauceLabsBoltTshirt'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 11: Click on button remove-sauce-labs-bolt-t-shirt.png')

"Step 12: Fill out shipping information and proceed to checkout confirmation"

fillShippingInfoAndProceedToCheckoutConfirmation.execute(data_path_0, Integer.valueOf(index_0))

"Step 13: Click on button 'finish' -> Navigate to page 'checkout-complete.html'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_step_two_html/button_finish'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-two.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step_two_html/button_finish'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 13: Click on button finish - Navigate to page checkout-completehtml.png')

"Step 14: Click on button 'back-to-products' -> Navigate to page 'inventory.html'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_complete_html/button_backToProducts'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-complete.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_complete_html/button_backToProducts'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 14: Click on button back-to-products - Navigate to page inventoryhtml.png')

"Step 15: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Verify Checkout Process with Multiple Items in Cart_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
