import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.fillShippingInformationAndProceedToPayment
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on link Samsung -> Navigate to page 'category#category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_Samsung'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 2-Click on link Samsung - Navigate to page categorycategory.png')

"Step 3: Click on link SamsungGalaxyS23Ultra -> Navigate to page 'product#product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_SamsungGalaxyS23Ultra'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 3-Click on link SamsungGalaxyS23Ultra - Navigate to page productproduct.png')

"Step 4: Click on button Increased2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_Increased2'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 4-Click on button Increased2.png')

"Step 5: Click on button Buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_Buy'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 5-Click on button Buy.png')

"Step 6: Click on link Apple2 -> Navigate to page 'category#category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_Apple2'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 6-Click on link Apple2 - Navigate to page categorycategory.png')

"Step 7: Click on button AddToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_AddToCart'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 7-Click on button AddToCart.png')

"Step 8: Click on label 1TB"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/label_1TB'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 8-Click on label 1TB.png')

"Step 9: Click on label BlueTitanium"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/label_BlueTitanium'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 9-Click on label BlueTitanium.png')

"Step 10: Click on button buy (Increased)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_buy"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_buy', ['button_buy_internalRoleButtonName': button_buy_internalRoleButtonName, 'button_buy_type': button_buy_type]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 10-Click on button buy Increased.png')

"Step 11: Click on button buy (Increased)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_buy"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_buy', ['button_buy_internalRoleButtonName': button_buy_internalRoleButtonName_1, 'button_buy_type': button_buy_type_1]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 11-Click on button buy Increased.png')

"Step 12: Click on button buy (Buy)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_buy"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_buy', ['button_buy_internalRoleButtonName': button_buy_internalRoleButtonName_2, 'button_buy_type': button_buy_type_2]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 12-Click on button buy Buy.png')

"Step 13: Click on link GoToCart -> Navigate to page 'cart#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_GoToCart'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 13-Click on link GoToCart - Navigate to page cartcart.png')

"Step 14: Click on button ProceedToCheckout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_ProceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 14-Click on button ProceedToCheckout.png')

"Step 15: Enter shipping details and continue to payment step"

fillShippingInformationAndProceedToPayment.execute(data_path_0, Integer.valueOf(index_0))

"Step 16: Click on button CompleteOrder -> Navigate to page 'thank you#thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 16-Click on button CompleteOrder - Navigate to page thank youthank-you.png')

"Step 17: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC8-Purchase Multiple Samsung Products and Checkout_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}