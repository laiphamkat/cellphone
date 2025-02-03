import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.proceedToCheckoutAndEnterEmail
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to category/*"

TrueTestScripts.navigate("category/${GlobalVariable.category_id}")

"Step 2: Hover over item object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_category/item_object'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 2-Hover over item object.png')

"Step 3: Click on link brand (Apple)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_brand"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_brand', ['link_brand_nthChild': link_brand_nthChild, 'link_brand_internalRoleLinkName': link_brand_internalRoleLinkName, 'category_id': category_id]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 3-Click on link brand Apple.png')

"Step 4: Click on button addToCart (AddToCart)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_addToCart', ['button_addToCart_class': button_addToCart_class, 'button_addToCart_internalHasText': button_addToCart_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 4-Click on button addToCart AddToCart.png')

"Step 5: Click on link PlaceAnOrder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_PlaceAnOrder'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 5-Click on link PlaceAnOrder.png')

"Step 6: Proceed to checkout and enter email for shipping information"

proceedToCheckoutAndEnterEmail.execute(data_path_0, Integer.valueOf(index_0))

"Step 7: Hover over div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 7-Hover over div object.png')

"Step 8: Click on input FirstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_FirstName'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 8-Click on input FirstName.png')

"Step 9: Hover over div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_object2'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 9-Hover over div object2.png')

"Step 10: Enter input value in input FirstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_FirstName'), input_FirstName)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 10-Enter input value in input FirstName.png')

"Step 11: Click on input LastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_LastName'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 11-Click on input LastName.png')

"Step 12: Hover over div object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_object3'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 12-Hover over div object3.png')

"Step 13: Enter input value in input LastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_LastName'), input_LastName)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 13-Enter input value in input LastName.png')

"Step 14: Click on input Address"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_Address'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 14-Click on input Address.png')

"Step 15: Enter input value in input Address"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_Address'), input_Address)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 15-Enter input value in input Address.png')

"Step 16: Hover over div object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_object4'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 16-Hover over div object4.png')

"Step 17: Enter input value in input ZipCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_ZipCode'), input_ZipCode)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 17-Enter input value in input ZipCode.png')

"Step 18: Click on input City"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_City'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 18-Click on input City.png')

"Step 19: Hover over div object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_object5'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 19-Hover over div object5.png')

"Step 20: Enter input value in input City"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_City'), input_City)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 20-Enter input value in input City.png')

"Step 21: Click on input State"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_State'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 21-Click on input State.png')

"Step 22: Hover over div object6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_object6'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 22-Hover over div object6.png')

"Step 23: Enter input value in input State"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_State'), input_State)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 23-Enter input value in input State.png')

"Step 24: Click on input Phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_Phone'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 24-Click on input Phone.png')

"Step 25: Enter input value in input Phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_Phone'), input_Phone)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 25-Enter input value in input Phone.png')

"Step 26: Click on button ContinueToPayment -> Navigate to page 'checkout#checkout/payment'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_ContinueToPayment'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 26-Click on button ContinueToPayment - Navigate to page checkoutcheckoutpayment.png')

"Step 27: Click on button CompleteOrder -> Navigate to page 'thank you#thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 27-Click on button CompleteOrder - Navigate to page thank youthank-you.png')

"Step 28: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Add Product to Cart and Complete Checkout with Shipping Details_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}