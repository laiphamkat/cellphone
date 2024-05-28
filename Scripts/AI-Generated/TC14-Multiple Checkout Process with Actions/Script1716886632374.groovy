import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import katalon.common.actionSequence_3
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

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/item_phone'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_phone'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 3: Hover over list item.png')

"Step 4: Click on link 'Apple' -> Navigate to page 'category/*'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/link_apple_1'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_apple_1'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 4: Click on link Apple - Navigate to page category.png')

"Step 5: Hover over list item"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_category/item_accessoriesAppleSamsung'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_category/item_accessoriesAppleSamsung'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 5: Hover over list item.png')

"Step 6: Click on link 'Apple'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_category/link_apple1'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_apple1'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 6: Click on link Apple.png')

"Step 7: Hover over link"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_category/link_goToCart'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_category/link_goToCart'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 7: Hover over link.png')

"Step 8: Click on span  -> Navigate to page 'cart'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_category/span_goToCart'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/span_goToCart'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 8: Click on span  - Navigate to page cart.png')

"Step 9: Click on button 'Proceed to checkout'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 9: Click on button Proceed to checkout.png')

"Step 10: Hover over list item"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_cart/item_phoneAppleSamsungGooglePixel'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_cart/item_phoneAppleSamsungGooglePixel'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 10: Hover over list item.png')

"Step 11: Click on link 'Apple' -> Navigate to page 'category/*'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_cart/link_apple'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_apple'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 11: Click on link Apple - Navigate to page category.png')

"Step 12: Hover over link"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_category/link_goToCart'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_category/link_goToCart'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 12: Hover over link.png')

"Step 13: Click on span  -> Navigate to page 'cart'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_category/span_goToCart'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/span_goToCart'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 13: Click on span  - Navigate to page cart.png')

"Step 14: Click on button 'Proceed to checkout'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 14: Click on button Proceed to checkout.png')

"Step 15: Hover over link"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_cart/link_goToCart'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_cart/link_goToCart'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 15: Hover over link.png')

"Step 16: Click on span"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_cart/span_goToCart'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/span_goToCart'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 16: Click on span.png')

"Step 17: Click on button 'Proceed to checkout'"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 17: Click on button Proceed to checkout.png')

"Step 18: Click on button"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout_1'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout_1'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 18: Click on button.png')

"Step 19: Call function actionSequence 3"

actionSequence_3.execute(data_path_0, Integer.valueOf(index_0))

"Step 20: Click on div"

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/div_deliveryInformationUs'), 30)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/div_deliveryInformationUs'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 20: Click on div.png')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
