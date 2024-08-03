import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
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

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Click on link testAllTheThingsTshirtRed -> Navigate to page 'inventory-item.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/link_testAllTheThingsTshirtRed'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 3: Click on link testAllTheThingsTshirtRed - Navigate to page inventory-itemhtml.png')

"Step 4: Click on button addToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory-item.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_item_html/button_addToCart'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 4: Click on button addToCart.png')

"Step 5: Click on link shoppingCart -> Navigate to page 'cart.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory-item.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_item_html/link_shoppingCart'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 5: Click on link shoppingCart - Navigate to page carthtml.png')

"Step 6: Click on button continueShopping -> Navigate to page 'inventory.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart_html/button_continueShopping'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 6: Click on button continueShopping - Navigate to page inventoryhtml.png')

"Step 7: Click on select productSortContainer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/select_productSortContainer'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 7: Click on select productSortContainer.png')

"Step 8: Click on select productSortContainer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/select_productSortContainer'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 8: Click on select productSortContainer.png')

"Step 9: Click on button addToCartSauceLabsBikeLight"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/button_addToCartSauceLabsBikeLight'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 9: Click on button addToCartSauceLabsBikeLight.png')

"Step 10: Click on select productSortContainer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/select_productSortContainer'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 10: Click on select productSortContainer.png')

"Step 11: Click on link sauceLabsBoltTshirt -> Navigate to page 'inventory-item.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/link_sauceLabsBoltTshirt'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 11: Click on link sauceLabsBoltTshirt - Navigate to page inventory-itemhtml.png')

"Step 12: Click on button addToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory-item.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_item_html/button_addToCart'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 12: Click on button addToCart.png')

"Step 13: Click on link shoppingCart -> Navigate to page 'cart.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory-item.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_item_html/link_shoppingCart'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 13: Click on link shoppingCart - Navigate to page carthtml.png')

"Step 14: Click on button checkout -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart_html/button_checkout'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 14: Click on button checkout - Navigate to page .png')

"Step 15: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Verify Checkout Flow with Various Items_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}