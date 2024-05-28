import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 2: Navigate to https://cellphone-staging.aut.katalon.com/"

TrueTestScripts.navigate('/')

"Step 3: Hover over list item"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/item_accessories'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_accessories'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 3: Hover over list item.png')

"Step 4: Click on link 'Apple' -> Navigate to page 'category/*'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/link_apple'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_apple'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 4: Click on link Apple - Navigate to page category.png')

"Step 5: Enter input value in input field 'price min'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_category/input_priceMin'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_category/input_priceMin'), input_price_min)

WebUI.takeScreenshot(reportLocation + '/TC25/Step 5: Enter input value in input field price min.png')

"Step 6: Enter input value in input field 'price max'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_category/input_priceMax'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_category/input_priceMax'), input_price_max)

WebUI.takeScreenshot(reportLocation + '/TC25/Step 6: Enter input value in input field price max.png')

"Step 7: Click on button 'Search'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_category/button_search'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 7: Click on button Search.png')

"Step 8: Click on label"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_category/label_128Gb1'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/label_128Gb1'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 8: Click on label.png')

"Step 9: Click on button 'Buy'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_category/button_buy'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 9: Click on button Buy.png')

"Step 10: Click on svg  -> Navigate to page 'cart'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_category/svg_placeAnOrder1'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/svg_placeAnOrder1'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 10: Click on svg  - Navigate to page cart.png')

"Step 11: Click on button '+'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_cart/button_i'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_i'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 11: Click on button .png')

"Step 12: Click on button 'Proceed to checkout'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 12: Click on button Proceed to checkout.png')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
