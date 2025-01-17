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

"Step 2: Click on link brand (Apple) -> Navigate to page 'category#category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_brand"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_brand', ['link_brand_nthChild': link_brand_nthChild, 'link_brand_internalRoleLinkName': link_brand_internalRoleLinkName, 'category_id': category_id]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 2-Click on link brand Apple - Navigate to page categorycategory.png')

"Step 3: Click on link productDetails (productItems) -> Navigate to page 'product listing#product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_productDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_productDetails', ['product_id': product_id]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 3-Click on link productDetails productItems - Navigate to page product listingproduct.png')

"Step 4: Click on label storageColor (128GB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product_listing/label_storageColor"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product_listing/label_storageColor', ['label_storageColor_for': label_storageColor_for, 'label_storageColor_internalText': label_storageColor_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Click on label storageColor 128GB.png')

"Step 5: Click on label storageColor (Green)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product_listing/label_storageColor"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product_listing/label_storageColor', ['label_storageColor_for': label_storageColor_for_1, 'label_storageColor_internalText': label_storageColor_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Click on label storageColor Green.png')

"Step 6: Click on button purchaseQuantity (Buy2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product_listing/button_purchaseQuantity"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product_listing/button_purchaseQuantity', ['button_purchaseQuantity_internalRoleButtonName': button_purchaseQuantity_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 6-Click on button purchaseQuantity Buy2.png')

"Step 7: Click on button purchaseQuantity (Buy3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product_listing/button_purchaseQuantity"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product_listing/button_purchaseQuantity', ['button_purchaseQuantity_internalRoleButtonName': button_purchaseQuantity_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 7-Click on button purchaseQuantity Buy3.png')

"Step 8: Click on link PlaceAnOrder -> Navigate to page 'display list of items:/{fixed page}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_listing/link_PlaceAnOrder'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 8-Click on link PlaceAnOrder - Navigate to page display list of itemsfixed page.png')

"Step 9: Click on button ProceedToCheckout -> Navigate to page 'form:/{fixed part}/{fixed page}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_list_of_items:/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_list_of_items_fixed_page/button_ProceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 9-Click on button ProceedToCheckout - Navigate to page formfixed partfixed page.png')

"Step 10: Click on input Email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_Email'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 10-Click on input Email.png')

"Step 11: Enter input value in input Email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_Email'), input_Email)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 11-Enter input value in input Email.png')

"Step 12: Click on button ContinueToShipping"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/button_ContinueToShipping'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 12-Click on button ContinueToShipping.png')

"Step 13: Click on input FirstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_FirstName'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 13-Click on input FirstName.png')

"Step 14: Enter input value in input FirstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_FirstName'), input_FirstName)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 14-Enter input value in input FirstName.png')

"Step 15: Click on input LastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_LastName'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 15-Click on input LastName.png')

"Step 16: Enter input value in input LastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_LastName'), input_LastName)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 16-Enter input value in input LastName.png')

"Step 17: Click on input Address"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_Address'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 17-Click on input Address.png')

"Step 18: Enter input value in input Address"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_Address'), input_Address)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 18-Enter input value in input Address.png')

"Step 19: Click on input ZipCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_ZipCode'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 19-Click on input ZipCode.png')

"Step 20: Enter input value in input ZipCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_ZipCode'), input_ZipCode)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 20-Enter input value in input ZipCode.png')

"Step 21: Click on input City"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_City'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 21-Click on input City.png')

"Step 22: Enter input value in input City"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_City'), input_City)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 22-Enter input value in input City.png')

"Step 23: Click on input State"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_State'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 23-Click on input State.png')

"Step 24: Enter input value in input State"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_State'), input_State)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 24-Enter input value in input State.png')

"Step 25: Click on input Phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_Phone'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 25-Click on input Phone.png')

"Step 26: Enter input value in input Phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_Phone'), input_Phone)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 26-Enter input value in input Phone.png')

"Step 27: Click on button ContinueToPayment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/button_ContinueToPayment'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 27-Click on button ContinueToPayment.png')

"Step 28: Click on button CompleteOrder -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 28-Click on button CompleteOrder - Navigate to page .png')

"Step 29: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Order Placement with Custom Storage and Color Options_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}