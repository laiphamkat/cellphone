import katalon.truetest.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.common.proceedThroughCheckoutProcess
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable

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

WebUI.takeScreenshot()

"Step 3: Click on div"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/div_sauceLabsBikeLightDescription'))

WebUI.takeScreenshot()

"Step 4: Click on button 'add-to-cart-sauce-labs-bike-light'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/button_addToCartSauceLabsBikeLight'))

WebUI.takeScreenshot()

"Step 5: Click on link '1' -> Navigate to page 'cart.html'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/link_shoppingCartLink2'))

WebUI.takeScreenshot()

"Step 6: Click on div"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart_html/div_cartFooter'))

WebUI.takeScreenshot()

"Step 7: Proceed through checkout process"

proceedThroughCheckoutProcess.execute(data_path_0, Integer.valueOf(index_0))

"Step 8: Click on button 'finish' -> Navigate to page 'checkout-complete.html'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-two.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step_two_html/button_finish'))

WebUI.takeScreenshot()

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Verify Successful Checkout Process after Adding Sauce Labs Bike Light to Cart_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
