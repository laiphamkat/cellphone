import truetest.custom.TrueTestScripts
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.common.fillShippingInformationForCheckout

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on button addToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_addToCart'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 2-Click on button addToCart.png')

"Step 3: Click on button IncreaseQuantity"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_IncreaseQuantity'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 3-Click on button IncreaseQuantity.png')

"Step 4: Click on label storageColor (256GB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_storageColor"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_storageColor', ['label_storageColor_for': label_storageColor_for, 'label_storageColor_internalText': label_storageColor_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 4-Click on label storageColor 256GB.png')

"Step 5: Click on label storageColor (ColorSelection)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_storageColor"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_storageColor', ['label_storageColor_for': label_storageColor_for_1, 'label_storageColor_internalText': label_storageColor_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 5-Click on label storageColor ColorSelection.png')

"Step 6: Click on button Buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_Buy'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 6-Click on button Buy.png')

"Step 7: Click on link goToCart -> Navigate to page 'shopping cart#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_goToCart'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 7-Click on link goToCart - Navigate to page shopping cartcart.png')

"Step 8: Click on button IncreaseQuantity"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shopping_cart/button_IncreaseQuantity'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 8-Click on button IncreaseQuantity.png')

"Step 9: Complete shipping information for checkout process"

fillShippingInformationForCheckout.execute(data_path_0, Integer.valueOf(index_0))

"Step 10: Click on button CompleteOrder -> Navigate to page 'thank you page#thank-you/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 10-Click on button CompleteOrder - Navigate to page thank you pagethank-you.png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC48-Add Item to Cart and Complete Checkout Process_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}