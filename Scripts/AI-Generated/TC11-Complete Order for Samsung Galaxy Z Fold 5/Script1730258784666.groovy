import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.common.completeCheckoutShippingInformation
import com.kms.katalon.core.configuration.RunConfiguration
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

"Step 2: Hover over item object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_object2'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 2-Hover over item object2.png')

"Step 3: Click on link GooglePixel -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_GooglePixel'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 3-Click on link GooglePixel - Navigate to page category.png')

"Step 4: Click on link brandOptions (samsung)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_brandOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_brandOptions', ['link_brandOptions_class': link_brandOptions_class, 'link_brandOptions_internalRoleLinkName': link_brandOptions_internalRoleLinkName, 'link_brandOptions_category_id': link_brandOptions_category_id]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 4-Click on link brandOptions samsung.png')

"Step 5: Click on link byTitle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_byTitle'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 5-Click on link byTitle.png')

"Step 6: Click on button SamsungGalaxyZFold5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_SamsungGalaxyZFold5'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 6-Click on button SamsungGalaxyZFold5.png')

"Step 7: Click on label storageColorOptions (512GB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions', ['label_storageColorOptions_for': label_storageColorOptions_for, 'label_storageColorOptions_internalText': label_storageColorOptions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 7-Click on label storageColorOptions 512GB.png')

"Step 8: Click on label storageColorOptions (Blue)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions', ['label_storageColorOptions_for': label_storageColorOptions_for_1, 'label_storageColorOptions_internalText': label_storageColorOptions_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 8-Click on label storageColorOptions Blue.png')

"Step 9: Click on button Buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_Buy'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 9-Click on button Buy.png')

"Step 10: Click on link brandOptions (Apple2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_brandOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_brandOptions', ['link_brandOptions_class': link_brandOptions_class_1, 'link_brandOptions_internalRoleLinkName': link_brandOptions_internalRoleLinkName_1, 'link_brandOptions_category_id': link_brandOptions_category_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 10-Click on link brandOptions Apple2.png')

"Step 11: Click on button addToCart (AddToCart3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_addToCart', ['button_addToCart_class': button_addToCart_class, 'button_addToCart_internalHasText': button_addToCart_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 11-Click on button addToCart AddToCart3.png')

"Step 12: Click on div GBOptions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/div_GBOptions'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 12-Click on div GBOptions.png')

"Step 13: Click on label storageColorOptions (512GB2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions', ['label_storageColorOptions_for': label_storageColorOptions_for_2, 'label_storageColorOptions_internalText': label_storageColorOptions_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 13-Click on label storageColorOptions 512GB2.png')

"Step 14: Click on label storageColorOptions (Color)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions', ['label_storageColorOptions_for': label_storageColorOptions_for_3, 'label_storageColorOptions_internalText': label_storageColorOptions_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 14-Click on label storageColorOptions Color.png')

"Step 15: Click on button Buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_Buy'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 15-Click on button Buy.png')

"Step 16: Click on link PlaceAnOrder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_PlaceAnOrder'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 16-Click on link PlaceAnOrder.png')

"Step 17: Fill out shipping information and proceed to payment"

completeCheckoutShippingInformation.execute(data_path_0, Integer.valueOf(index_0))

"Step 18: Click on button CompleteOrder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 18-Click on button CompleteOrder.png')

"Step 19: Click on button CompleteOrder -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 19-Click on button CompleteOrder - Navigate to page .png')

"Step 20: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC11-Complete Order for Samsung Galaxy Z Fold 5_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}