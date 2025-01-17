import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

"Step 2: Click on link brand (Samsung) -> Navigate to page 'category#category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_brand"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_brand', ['link_brand_nthChild': link_brand_nthChild, 'link_brand_internalRoleLinkName': link_brand_internalRoleLinkName, 'category_id': category_id]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Click on link brand Samsung - Navigate to page categorycategory.png')

"Step 3: Click on link productDetails (SamsungGalaxyS23UltraSmartviewCases) -> Navigate to page 'product listing#product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_productDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_productDetails', ['product_id': product_id]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on link productDetails SamsungGalaxyS23UltraSmartviewCases - Navigate to page product listingproduct.png')

"Step 4: Click on button purchaseQuantity (Buy)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product_listing/button_purchaseQuantity"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product_listing/button_purchaseQuantity', ['button_purchaseQuantity_internalRoleButtonName': button_purchaseQuantity_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on button purchaseQuantity Buy.png')

"Step 5: Click on link Accessories -> Navigate to page 'category#category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_listing/link_Accessories'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on link Accessories - Navigate to page categorycategory.png')

"Step 6: Click on link Samsung"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_Samsung'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on link Samsung.png')

"Step 7: Click on link productDetails (SamsungGalaxyS23UltraSmartviewCases) -> Navigate to page 'product listing#product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_productDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_productDetails', ['product_id': product_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on link productDetails SamsungGalaxyS23UltraSmartviewCases - Navigate to page product listingproduct.png')

"Step 8: Click on link Apple -> Navigate to page 'category#category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_listing/link_Apple'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on link Apple - Navigate to page categorycategory.png')

"Step 9: Click on button AddToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_AddToCart'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on button AddToCart.png')

"Step 10: Click on label productType (iPhone15Plus)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_productType"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_productType', ['label_productType_for': label_productType_for, 'label_productType_internalText': label_productType_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Click on label productType iPhone15Plus.png')

"Step 11: Click on label productType (Cypress)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_productType"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_productType', ['label_productType_for': label_productType_for_1, 'label_productType_internalText': label_productType_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Click on label productType Cypress.png')

"Step 12: Click on button Buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_Buy'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Click on button Buy.png')

"Step 13: Click on link PlaceOrder -> Navigate to page 'display list of items:/{fixed page}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_PlaceOrder'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 13-Click on link PlaceOrder - Navigate to page display list of itemsfixed page.png')

"Step 14: Click on button ProceedToCheckout -> Navigate to page 'form:/{fixed part}/{fixed page}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_list_of_items:/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_list_of_items_fixed_page/button_ProceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 14-Click on button ProceedToCheckout - Navigate to page formfixed partfixed page.png')

"Step 15: Click on input Email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_Email'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 15-Click on input Email.png')

"Step 16: Enter input value in input Email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_Email'), input_Email)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 16-Enter input value in input Email.png')

"Step 17: Click on button ContinueToShipping"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/button_ContinueToShipping'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 17-Click on button ContinueToShipping.png')

"Step 18: Click on input FirstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_FirstName'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 18-Click on input FirstName.png')

"Step 19: Enter input value in input FirstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_FirstName'), input_FirstName)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 19-Enter input value in input FirstName.png')

"Step 20: Click on input LastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_LastName'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 20-Click on input LastName.png')

"Step 21: Enter input value in input LastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_LastName'), input_LastName)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 21-Enter input value in input LastName.png')

"Step 22: Click on input Address"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_Address'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 22-Click on input Address.png')

"Step 23: Enter input value in input Address"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_Address'), input_Address)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 23-Enter input value in input Address.png')

"Step 24: Click on input ZipCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_ZipCode'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 24-Click on input ZipCode.png')

"Step 25: Enter input value in input ZipCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_ZipCode'), input_ZipCode)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 25-Enter input value in input ZipCode.png')

"Step 26: Click on input City"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_City'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 26-Click on input City.png')

"Step 27: Enter input value in input City"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_City'), input_City)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 27-Enter input value in input City.png')

"Step 28: Click on input State"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_State'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 28-Click on input State.png')

"Step 29: Enter input value in input State"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_State'), input_State)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 29-Enter input value in input State.png')

"Step 30: Click on input Phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_Phone'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 30-Click on input Phone.png')

"Step 31: Enter input value in input Phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_Phone'), input_Phone)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 31-Enter input value in input Phone.png')

"Step 32: Click on button ContinueToPayment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/button_ContinueToPayment'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 32-Click on button ContinueToPayment.png')

"Step 33: Click on button CompleteOrder -> Navigate to page 'thank you#thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 33-Click on button CompleteOrder - Navigate to page thank youthank-you.png')

"Step 34: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Complete Purchase and Checkout Process for Multiple Products_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}