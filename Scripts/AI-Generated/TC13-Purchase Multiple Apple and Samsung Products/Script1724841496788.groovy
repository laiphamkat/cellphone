import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on div newIphone15Plus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_newIphone15Plus'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 2-Click on div newIphone15Plus.png')

"Step 3: Click on button addToCart (addToCart3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_addToCart', ['button_addToCart_class': button_addToCart_class, 'button_addToCart_internalHasText': button_addToCart_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 3-Click on button addToCart addToCart3.png')

"Step 4: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 4-Click on button close.png')

"Step 5: Hover over item dynamicObject (item)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_dynamicObject'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 5-Hover over item dynamicObject item.png')

"Step 6: Click on link samsung2 -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_samsung2'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 6-Click on link samsung2 - Navigate to page category.png')

"Step 7: Click on button productPurchase (newIphone15SiliconeCase)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_productPurchase"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_productPurchase', ['button_productPurchase_class': button_productPurchase_class, 'button_productPurchase_internalHasText': button_productPurchase_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 7-Click on button productPurchase newIphone15SiliconeCase.png')

"Step 8: Click on button productPurchase (sale20WusbtypeCadapter)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_productPurchase"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_productPurchase', ['button_productPurchase_class': button_productPurchase_class_1, 'button_productPurchase_internalHasText': button_productPurchase_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 8-Click on button productPurchase sale20WusbtypeCadapter.png')

"Step 9: Click on link samsungGalaxyS23Ultra2 -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_samsungGalaxyS23Ultra2'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 9-Click on link samsungGalaxyS23Ultra2 - Navigate to page product.png')

"Step 10: Hover over item dynamicObject (phone)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/item_dynamicObject"
WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_product/item_dynamicObject', ['item_dynamicObject_internalHasText': item_dynamicObject_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 10-Hover over item dynamicObject phone.png')

"Step 11: Click on link mobileBrands (samsung) -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/link_mobileBrands"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_mobileBrands', ['link_mobileBrands_nthChild': link_mobileBrands_nthChild, 'link_mobileBrands_internalRoleLinkName': link_mobileBrands_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 11-Click on link mobileBrands samsung - Navigate to page category.png')

"Step 12: Click on button addToCart (addToCart)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_addToCart', ['button_addToCart_class': button_addToCart_class_1, 'button_addToCart_internalHasText': button_addToCart_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 12-Click on button addToCart addToCart.png')

"Step 13: Click on div chooseVariant"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/div_chooseVariant'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 13-Click on div chooseVariant.png')

"Step 14: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 14-Click on button close.png')

"Step 15: Click on button productPurchase (newIphone15SiliconeCase)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_productPurchase"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_productPurchase', ['button_productPurchase_class': button_productPurchase_class_2, 'button_productPurchase_internalHasText': button_productPurchase_internalHasText_2]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 15-Click on button productPurchase newIphone15SiliconeCase.png')

"Step 16: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 16-Click on button close.png')

"Step 17: Click on link mobileBrands (samsung)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_mobileBrands"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_mobileBrands', ['link_mobileBrands_class': link_mobileBrands_class, 'link_mobileBrands_internalRoleLinkName': link_mobileBrands_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 17-Click on link mobileBrands samsung.png')

"Step 18: Click on link mobileBrands (googlePixel)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_mobileBrands"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_mobileBrands', ['link_mobileBrands_class': link_mobileBrands_class_1, 'link_mobileBrands_internalRoleLinkName': link_mobileBrands_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 18-Click on link mobileBrands googlePixel.png')

"Step 19: Click on link mobileBrands (samsung)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_mobileBrands"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_mobileBrands', ['link_mobileBrands_class': link_mobileBrands_class_2, 'link_mobileBrands_internalRoleLinkName': link_mobileBrands_internalRoleLinkName_3]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 19-Click on link mobileBrands samsung.png')

"Step 20: Hover over item dynamicObject (phone)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/item_dynamicObject"
WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_category/item_dynamicObject', ['item_dynamicObject_internalHasText': item_dynamicObject_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 20-Hover over item dynamicObject phone.png')

"Step 21: Click on span phoneAppleSamsungGooglePixelAccessories"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/span_phoneAppleSamsungGooglePixelAccessories'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 21-Click on span phoneAppleSamsungGooglePixelAccessories.png')

"Step 22: Click on link mobileBrands (googlePixel2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_mobileBrands_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_mobileBrands_1', ['link_mobileBrands_nthChild': link_mobileBrands_nthChild_1, 'link_mobileBrands_internalRoleLinkName': link_mobileBrands_internalRoleLinkName_4]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 22-Click on link mobileBrands googlePixel2.png')

"Step 23: Click on link phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_phone'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 23-Click on link phone.png')

"Step 24: Click on main pageLayout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/main_pageLayout'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 24-Click on main pageLayout.png')

"Step 25: Hover over item dynamicObject (phone)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/item_dynamicObject"
WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_category/item_dynamicObject', ['item_dynamicObject_internalHasText': item_dynamicObject_internalHasText_2]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 25-Hover over item dynamicObject phone.png')

"Step 26: Click on link mobileBrands (samsung2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_mobileBrands_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_mobileBrands_1', ['link_mobileBrands_nthChild': link_mobileBrands_nthChild_2, 'link_mobileBrands_internalRoleLinkName': link_mobileBrands_internalRoleLinkName_5]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 26-Click on link mobileBrands samsung2.png')

"Step 27: Click on link mobileBrands (googlePixel)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_mobileBrands"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_mobileBrands', ['link_mobileBrands_class': link_mobileBrands_class_3, 'link_mobileBrands_internalRoleLinkName': link_mobileBrands_internalRoleLinkName_6]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 27-Click on link mobileBrands googlePixel.png')

"Step 28: Click on link mobileBrands (samsung)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_mobileBrands"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_mobileBrands', ['link_mobileBrands_class': link_mobileBrands_class_4, 'link_mobileBrands_internalRoleLinkName': link_mobileBrands_internalRoleLinkName_7]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 28-Click on link mobileBrands samsung.png')

"Step 29: Click on button productPurchase (sale20WusbtypeCadapter)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_productPurchase"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_productPurchase', ['button_productPurchase_class': button_productPurchase_class_3, 'button_productPurchase_internalHasText': button_productPurchase_internalHasText_3]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 29-Click on button productPurchase sale20WusbtypeCadapter.png')

"Step 30: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 30-Click on button close.png')

"Step 31: Click on link mobileDevices (samsungGalaxyS23Ultra) -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_mobileDevices"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_mobileDevices', ['link_mobileDevices_class': link_mobileDevices_class, 'link_mobileDevices_internalRoleLinkName': link_mobileDevices_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 31-Click on link mobileDevices samsungGalaxyS23Ultra - Navigate to page product.png')

"Step 32: Click on label colorModelStorage (iphone15)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_colorModelStorage"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_colorModelStorage', ['label_colorModelStorage_for': label_colorModelStorage_for, 'label_colorModelStorage_internalText': label_colorModelStorage_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 32-Click on label colorModelStorage iphone15.png')

"Step 33: Hover over item dynamicObject (accessories)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/item_dynamicObject"
WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_product/item_dynamicObject', ['item_dynamicObject_internalHasText': item_dynamicObject_internalHasText_3]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 33-Hover over item dynamicObject accessories.png')

"Step 34: Click on link mobileBrands (apple) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/link_mobileBrands"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_mobileBrands', ['link_mobileBrands_nthChild': link_mobileBrands_nthChild_3, 'link_mobileBrands_internalRoleLinkName': link_mobileBrands_internalRoleLinkName_8]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 34-Click on link mobileBrands apple - Navigate to page .png')

"Step 35: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC13-Purchase Multiple Apple and Samsung Products_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}