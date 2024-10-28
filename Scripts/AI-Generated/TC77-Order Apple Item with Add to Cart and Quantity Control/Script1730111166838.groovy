import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import truetest.common.enterEmailAndProceedToShipping
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable

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

WebUI.takeScreenshot(reportLocation + '/TC77/Step 2-Hover over item object.png')

"Step 3: Click on link Apple -> Navigate to page 'display list of items:/{fixed part}/{item main or descendent item category id or slug}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_Apple'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 3-Click on link Apple - Navigate to page display list of itemsfixed partitem main or descendent item category id or slug.png')

"Step 4: Click on button AddToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_list_of_items:/{fixed_part}/{item_main_or_descendent_item_category_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_list_of_items_fixed_part_item_main_or_descendent_item/button_AddToCart'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 4-Click on button AddToCart.png')

"Step 5: Click on label itemAttributes (StorageCapacity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_list_of_items:/{fixed_part}/{item_main_or_descendent_item_category_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_display_list_of_items_fixed_part_item_main_or_descendent_item/label_itemAttributes"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_display_list_of_items_fixed_part_item_main_or_descendent_item/label_itemAttributes', ['label_itemAttributes_for': label_itemAttributes_for, 'label_itemAttributes_internalText': label_itemAttributes_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 5-Click on label itemAttributes StorageCapacity.png')

"Step 6: Click on label itemAttributes (ColorOption)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_list_of_items:/{fixed_part}/{item_main_or_descendent_item_category_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_display_list_of_items_fixed_part_item_main_or_descendent_item/label_itemAttributes"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_display_list_of_items_fixed_part_item_main_or_descendent_item/label_itemAttributes', ['label_itemAttributes_for': label_itemAttributes_for_1, 'label_itemAttributes_internalText': label_itemAttributes_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 6-Click on label itemAttributes ColorOption.png')

"Step 7: Click on button Increased2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_list_of_items:/{fixed_part}/{item_main_or_descendent_item_category_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_list_of_items_fixed_part_item_main_or_descendent_item/button_Increased2'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 7-Click on button Increased2.png')

"Step 8: Click on button quantityControl (Decreased)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_list_of_items:/{fixed_part}/{item_main_or_descendent_item_category_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_display_list_of_items_fixed_part_item_main_or_descendent_item/button_quantityControl"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_display_list_of_items_fixed_part_item_main_or_descendent_item/button_quantityControl', ['button_quantityControl_internalRoleButtonName': button_quantityControl_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 8-Click on button quantityControl Decreased.png')

"Step 9: Click on button quantityControl (Buy)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_list_of_items:/{fixed_part}/{item_main_or_descendent_item_category_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_display_list_of_items_fixed_part_item_main_or_descendent_item/button_quantityControl"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_display_list_of_items_fixed_part_item_main_or_descendent_item/button_quantityControl', ['button_quantityControl_internalRoleButtonName': button_quantityControl_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 9-Click on button quantityControl Buy.png')

"Step 10: Hover over link GoToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_list_of_items:/{fixed_part}/{item_main_or_descendent_item_category_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_display_list_of_items_fixed_part_item_main_or_descendent_item/link_GoToCart'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 10-Hover over link GoToCart.png')

"Step 11: Click on span navigationLinks (Link1)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_list_of_items:/{fixed_part}/{item_main_or_descendent_item_category_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_display_list_of_items_fixed_part_item_main_or_descendent_item/span_navigationLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_display_list_of_items_fixed_part_item_main_or_descendent_item/span_navigationLinks', ['span_navigationLinks_internalRoleLinkName': span_navigationLinks_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 11-Click on span navigationLinks Link1.png')

"Step 12: Enter email and proceed through shipping form"

enterEmailAndProceedToShipping.execute(data_path_0, Integer.valueOf(index_0))

"Step 13: Click on button CompleteOrder -> Navigate to page 'display single item:/{fixed page}/{item id or slug}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 13-Click on button CompleteOrder - Navigate to page display single itemfixed pageitem id or slug.png')

"Step 14: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC77-Order Apple Item with Add to Cart and Quantity Control_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}