import katalon.truetest.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
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

"Step 2: Hover over item productCategories (phone)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_home/item_productCategories'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 2-Hover over item productCategories phone.png')

"Step 3: Click on link samsung -> Navigate to page '/category/samsung'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_samsung'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 3-Click on link samsung - Navigate to page categorysamsung.png')

"Step 4: Click on link sortOptions (byTitle)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_samsung/link_sortOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_samsung/link_sortOptions', ['link_sortOptions_nthChild': link_sortOptions_nthChild, 'link_sortOptions_internalRoleLinkName': link_sortOptions_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 4-Click on link sortOptions byTitle.png')

"Step 5: Click on button samsungPhones (samsungGalaxyZfold5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_samsung/button_samsungPhones"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_samsung/button_samsungPhones', ['button_samsungPhones_class': button_samsungPhones_class, 'button_samsungPhones_internalHasText': button_samsungPhones_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 5-Click on button samsungPhones samsungGalaxyZfold5.png')

"Step 6: Click on label storageOptions (512Gb)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_samsung/label_storageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_samsung/label_storageOptions', ['label_storageOptions_for': label_storageOptions_for, 'label_storageOptions_internalText': label_storageOptions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 6-Click on label storageOptions 512Gb.png')

"Step 7: Click on label storageOptions (512Gb)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_samsung/label_storageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_samsung/label_storageOptions', ['label_storageOptions_for': label_storageOptions_for_1, 'label_storageOptions_internalText': label_storageOptions_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 7-Click on label storageOptions 512Gb.png')

"Step 8: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_samsung/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 8-Click on button buy.png')

"Step 9: Click on label storageOptions (blue) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_samsung/label_storageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_samsung/label_storageOptions', ['label_storageOptions_for': label_storageOptions_for_2, 'label_storageOptions_internalText': label_storageOptions_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 9-Click on label storageOptions blue - Navigate to page .png')

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC8-Sort and Buy Samsung Phones_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}