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

"Step 2: Hover over item dynamicObject (item2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_dynamicObject_1'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 2-Hover over item dynamicObject item2.png')

"Step 3: Click on link samsung -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_samsung'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 3-Click on link samsung - Navigate to page category.png')

"Step 4: Click on button productPurchase (newIphone15SiliconeCase)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_productPurchase"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_productPurchase', ['button_productPurchase_class': button_productPurchase_class, 'button_productPurchase_internalHasText': button_productPurchase_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 4-Click on button productPurchase newIphone15SiliconeCase.png')

"Step 5: Click on button increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_increased'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 5-Click on button increased.png')

"Step 6: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 6-Click on button close.png')

"Step 7: Click on link mobileDevices (samsungGalaxyS23Ultra) -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_mobileDevices"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_mobileDevices', ['link_mobileDevices_class': link_mobileDevices_class, 'link_mobileDevices_internalRoleLinkName': link_mobileDevices_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 7-Click on link mobileDevices samsungGalaxyS23Ultra - Navigate to page product.png')

"Step 8: Hover over item dynamicObject (accessories)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/item_dynamicObject"
WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_product/item_dynamicObject', ['item_dynamicObject_internalHasText': item_dynamicObject_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 8-Hover over item dynamicObject accessories.png')

"Step 9: Click on link mobileBrands (apple) -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/link_mobileBrands"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_mobileBrands', ['link_mobileBrands_nthChild': link_mobileBrands_nthChild, 'link_mobileBrands_internalRoleLinkName': link_mobileBrands_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 9-Click on link mobileBrands apple - Navigate to page category.png')

"Step 10: Click on link mobileDevices (iphone15ClearCaseWithMagSafe) -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_mobileDevices"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_mobileDevices', ['link_mobileDevices_class': link_mobileDevices_class_1, 'link_mobileDevices_internalRoleLinkName': link_mobileDevices_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 10-Click on link mobileDevices iphone15ClearCaseWithMagSafe - Navigate to page product.png')

"Step 11: Hover over item dynamicObject (phone)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/item_dynamicObject"
WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_product/item_dynamicObject', ['item_dynamicObject_internalHasText': item_dynamicObject_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 11-Hover over item dynamicObject phone.png')

"Step 12: Click on link mobileBrands (apple2) -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/link_mobileBrands"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_mobileBrands', ['link_mobileBrands_nthChild': link_mobileBrands_nthChild_1, 'link_mobileBrands_internalRoleLinkName': link_mobileBrands_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 12-Click on link mobileBrands apple2 - Navigate to page category.png')

"Step 13: Click on link mobileBrands (samsung)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_mobileBrands"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_mobileBrands', ['link_mobileBrands_class': link_mobileBrands_class, 'link_mobileBrands_internalRoleLinkName': link_mobileBrands_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 13-Click on link mobileBrands samsung.png')

"Step 14: Click on link mobileBrands (googlePixel)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_mobileBrands"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_mobileBrands', ['link_mobileBrands_class': link_mobileBrands_class_1, 'link_mobileBrands_internalRoleLinkName': link_mobileBrands_internalRoleLinkName_3]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 14-Click on link mobileBrands googlePixel.png')

"Step 15: Hover over item dynamicObject (accessories)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/item_dynamicObject"
WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_category/item_dynamicObject', ['item_dynamicObject_internalHasText': item_dynamicObject_internalHasText_2]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 15-Hover over item dynamicObject accessories.png')

"Step 16: Click on link mobileBrands (apple) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_mobileBrands_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_mobileBrands_1', ['link_mobileBrands_nthChild': link_mobileBrands_nthChild_2, 'link_mobileBrands_internalRoleLinkName': link_mobileBrands_internalRoleLinkName_4]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 16-Click on link mobileBrands apple - Navigate to page .png')

"Step 17: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC9-Purchase Multiple Samsung Products and Verify Checkout_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}