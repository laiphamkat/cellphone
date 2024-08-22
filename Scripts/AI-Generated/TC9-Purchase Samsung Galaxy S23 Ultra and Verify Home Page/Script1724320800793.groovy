import internal.GlobalVariable
import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

"Step 2: Hover over item phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_home/item_phone_5'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 2-Hover over item phone.png')

"Step 3: Click on link samsung -> Navigate to page '/category/samsung'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_samsung'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 3-Click on link samsung - Navigate to page categorysamsung.png')

"Step 4: Click on link byTitle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_samsung/link_byPrice"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_samsung/link_byPrice', ['link_byPrice_nthChild': link_byPrice_nthChild, 'link_byPrice_internalRoleLinkName': link_byPrice_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 4-Click on link byTitle.png')

"Step 5: Click on button productsItemInStock"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_samsung/button_object"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_samsung/button_object', ['button_object_class': button_object_class, 'button_object_internalHasText': button_object_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 5-Click on button productsItemInStock.png')

"Step 6: Click on label 512Gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_samsung/label_blueText"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_samsung/label_blueText', ['label_blueText_for': label_blueText_for, 'label_blueText_internalText': label_blueText_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 6-Click on label 512Gb.png')

"Step 7: Click on label 512Gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_samsung/label_blueText"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_samsung/label_blueText', ['label_blueText_for': label_blueText_for, 'label_blueText_internalText': label_blueText_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 7-Click on label 512Gb.png')

"Step 8: Click on button buy2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_samsung/button_buy2'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 8-Click on button buy2.png')

"Step 9: Click on label blueText -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_samsung/label_blueText_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_samsung/label_blueText_1', ['label_blueText_for': label_blueText_for, 'label_blueText_internalText': label_blueText_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 9-Click on label blueText - Navigate to page .png')

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC9-Purchase Samsung Galaxy S23 Ultra and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}