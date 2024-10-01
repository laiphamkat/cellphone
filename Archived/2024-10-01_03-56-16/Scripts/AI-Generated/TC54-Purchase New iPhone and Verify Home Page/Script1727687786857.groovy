import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.custom.TrueTestScripts
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://testops.qa.katalon.com/organization/7584/settings/truetest/5909"

TrueTestScripts.navigate("/organization/7584/settings/truetest/5909")

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Navigate to /"

TrueTestScripts.navigate("/")

"Step 4: Click on link productAppleIphone15New -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_productAppleIphone15New_1'))

WebUI.takeScreenshot(reportLocation + '/TC54/Step 4-Click on link productAppleIphone15New - Navigate to page product.png')

"Step 5: Hover over item phoneAccessories (item)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_product/item_phoneAccessories'))

WebUI.takeScreenshot(reportLocation + '/TC54/Step 5-Hover over item phoneAccessories item.png')

"Step 6: Click on link phoneBrand (apple3) -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/link_phoneBrand"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_phoneBrand', ['link_phoneBrand_nthChild': link_phoneBrand_nthChild, 'link_phoneBrand_internalRoleLinkName': link_phoneBrand_internalRoleLinkName, 'link_phoneBrand_category_id': link_phoneBrand_category_id]))

WebUI.takeScreenshot(reportLocation + '/TC54/Step 6-Click on link phoneBrand apple3 - Navigate to page category.png')

"Step 7: Click on link phoneBrand (categoryChekhlyNaIphone)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_phoneBrand"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_phoneBrand', ['link_phoneBrand_class': link_phoneBrand_class, 'link_phoneBrand_internalRoleLinkName': link_phoneBrand_internalRoleLinkName_1, 'link_phoneBrand_category_id': link_phoneBrand_category_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC54/Step 7-Click on link phoneBrand categoryChekhlyNaIphone.png')

"Step 8: Click on button phoneBrand (sale20WusbtypeCadapter)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_phoneBrand"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_phoneBrand', ['button_phoneBrand_class': button_phoneBrand_class, 'button_phoneBrand_internalHasText': button_phoneBrand_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC54/Step 8-Click on button phoneBrand sale20WusbtypeCadapter.png')

"Step 9: Hover over item phoneAccessories (item)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_category/item_phoneAccessories'))

WebUI.takeScreenshot(reportLocation + '/TC54/Step 9-Hover over item phoneAccessories item.png')

"Step 10: Click on link categoryNavigation (categoryAccessories)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_categoryNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_categoryNavigation', ['link_categoryNavigation_nth': link_categoryNavigation_nth, 'link_categoryNavigation_internalRoleLinkName': link_categoryNavigation_internalRoleLinkName, 'link_categoryNavigation_category_id': link_categoryNavigation_category_id]))

WebUI.takeScreenshot(reportLocation + '/TC54/Step 10-Click on link categoryNavigation categoryAccessories.png')

"Step 11: Hover over item phoneAccessories (item)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_category/item_phoneAccessories'))

WebUI.takeScreenshot(reportLocation + '/TC54/Step 11-Hover over item phoneAccessories item.png')

"Step 12: Click on link categoryNavigation (categoryAccessories)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_categoryNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_categoryNavigation', ['link_categoryNavigation_nth': link_categoryNavigation_nth_1, 'link_categoryNavigation_internalRoleLinkName': link_categoryNavigation_internalRoleLinkName_1, 'link_categoryNavigation_category_id': link_categoryNavigation_category_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC54/Step 12-Click on link categoryNavigation categoryAccessories.png')

"Step 13: Click on button phoneBrand (samsungGalaxyS23Ultra2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_phoneBrand"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_phoneBrand', ['button_phoneBrand_class': button_phoneBrand_class_1, 'button_phoneBrand_internalHasText': button_phoneBrand_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC54/Step 13-Click on button phoneBrand samsungGalaxyS23Ultra2.png')

"Step 14: Click on link kCellphoneShop -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_kCellphoneShop'))

WebUI.takeScreenshot(reportLocation + '/TC54/Step 14-Click on link kCellphoneShop - Navigate to page .png')

"Step 15: Click on button addToCart (addToCart3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_addToCart', ['button_addToCart_class': button_addToCart_class, 'button_addToCart_internalHasText': button_addToCart_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC54/Step 15-Click on button addToCart addToCart3.png')

"Step 16: Click on label colorStorageOption (iphone15s)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_colorStorageOption"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_colorStorageOption', ['label_colorStorageOption_for': label_colorStorageOption_for]))

WebUI.takeScreenshot(reportLocation + '/TC54/Step 16-Click on label colorStorageOption iphone15s.png')

"Step 17: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC54/Step 17-Click on button buy.png')

"Step 18: Click on button productAddedToCart -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_productAddedToCart'))

WebUI.takeScreenshot(reportLocation + '/TC54/Step 18-Click on button productAddedToCart - Navigate to page .png')

"Step 19: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC54-Purchase New iPhone and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}