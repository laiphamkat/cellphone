import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
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

"Step 2: Hover over item object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_object'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 2-Hover over item object.png')

"Step 3: Click on link Apple -> Navigate to page 'category page#category/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_Apple'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 3-Click on link Apple - Navigate to page category pagecategory.png')

"Step 4: Click on button AddToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_page/button_AddToCart'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 4-Click on button AddToCart.png')

"Step 5: Click on label storageColorOption (Storage512GB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_page/label_storageColorOption"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_page/label_storageColorOption', ['label_storageColorOption_for': label_storageColorOption_for, 'label_storageColorOption_internalText': label_storageColorOption_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 5-Click on label storageColorOption Storage512GB.png')

"Step 6: Click on label storageColorOption (ColorYellow)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_page/label_storageColorOption"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_page/label_storageColorOption', ['label_storageColorOption_for': label_storageColorOption_for_1, 'label_storageColorOption_internalText': label_storageColorOption_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 6-Click on label storageColorOption ColorYellow.png')

"Step 7: Click on button Increased2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_page/button_Increased2'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 7-Click on button Increased2.png')

"Step 8: Click on button quantityControl (Decreased)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_page/button_quantityControl"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_page/button_quantityControl', ['button_quantityControl_internalRoleButtonName': button_quantityControl_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 8-Click on button quantityControl Decreased.png')

"Step 9: Click on button quantityControl (Buy)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_page/button_quantityControl"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_page/button_quantityControl', ['button_quantityControl_internalRoleButtonName': button_quantityControl_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 9-Click on button quantityControl Buy.png')

"Step 10: Hover over link GoToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_category_page/link_GoToCart2'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 10-Hover over link GoToCart.png')

"Step 11: Click on span dynamicObject (Link1)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_page/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_page/span_dynamicObject', ['span_dynamicObject_internalRoleLinkName': span_dynamicObject_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 11-Click on span dynamicObject Link1.png')

"Step 12: Complete shipping information for checkout process"

fillShippingInformationForCheckout.execute(data_path_0, Integer.valueOf(index_0))

"Step 13: Click on button CompleteOrder -> Navigate to page 'thank you page#thank-you/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 13-Click on button CompleteOrder - Navigate to page thank you pagethank-you.png')

"Step 14: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC52-Add iPhone to Cart and Complete Checkout Process_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}