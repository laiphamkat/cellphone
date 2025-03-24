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

"Step 2: Click on link mobilePhones (SamsungGalaxyS23Ultra)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_mobilePhones"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_mobilePhones', ['link_mobilePhones_class': link_mobilePhones_class, 'link_mobilePhones_internalRoleLinkName': link_mobilePhones_internalRoleLinkName, 'link_mobilePhones_nth': link_mobilePhones_nth, 'product_id': product_id]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 2-Click on link mobilePhones SamsungGalaxyS23Ultra.png')

"Step 3: Click on link iPhone15Pro -> Navigate to page 'product#product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_iPhone15Pro'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 3-Click on link iPhone15Pro - Navigate to page productproduct.png')

"Step 4: Click on button buyQuantity (Buy2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_buyQuantity"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_buyQuantity', ['button_buyQuantity_internalRoleButtonName': button_buyQuantity_internalRoleButtonName, 'button_buyQuantity_type': button_buyQuantity_type]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 4-Click on button buyQuantity Buy2.png')

"Step 5: Click on button buyQuantity (Buy2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_buyQuantity"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_buyQuantity', ['button_buyQuantity_internalRoleButtonName': button_buyQuantity_internalRoleButtonName_1, 'button_buyQuantity_type': button_buyQuantity_type_1]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 5-Click on button buyQuantity Buy2.png')

"Step 6: Click on button buyQuantity (Buy)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_buyQuantity"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_buyQuantity', ['button_buyQuantity_internalRoleButtonName': button_buyQuantity_internalRoleButtonName_2, 'button_buyQuantity_type': button_buyQuantity_type_2]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 6-Click on button buyQuantity Buy.png')

"Step 7: Click on button buyQuantity (Buy)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_buyQuantity"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_buyQuantity', ['button_buyQuantity_internalRoleButtonName': button_buyQuantity_internalRoleButtonName_3, 'button_buyQuantity_type': button_buyQuantity_type_3]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 7-Click on button buyQuantity Buy.png')

"Step 8: Click on button buyQuantity (Buy)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_buyQuantity"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_buyQuantity', ['button_buyQuantity_internalRoleButtonName': button_buyQuantity_internalRoleButtonName_4, 'button_buyQuantity_type': button_buyQuantity_type_4]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 8-Click on button buyQuantity Buy.png')

"Step 9: Click on button buyQuantity (Buy)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_buyQuantity"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_buyQuantity', ['button_buyQuantity_internalRoleButtonName': button_buyQuantity_internalRoleButtonName_5, 'button_buyQuantity_type': button_buyQuantity_type_5]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 9-Click on button buyQuantity Buy.png')

"Step 10: Click on link Apple -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_Apple'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 10-Click on link Apple - Navigate to page .png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC14-Purchase Multiple Quantities of iPhone_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}