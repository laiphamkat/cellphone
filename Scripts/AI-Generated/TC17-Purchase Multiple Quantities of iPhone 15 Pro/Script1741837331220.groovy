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

"Step 2: Click on link mobileDevice (SamsungGalaxyS23Ultra)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_mobileDevice"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_mobileDevice', ['link_mobileDevice_class': link_mobileDevice_class, 'link_mobileDevice_internalRoleLinkName': link_mobileDevice_internalRoleLinkName, 'link_mobileDevice_nth': link_mobileDevice_nth, 'product_id': product_id]))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 2-Click on link mobileDevice SamsungGalaxyS23Ultra.png')

"Step 3: Click on link iPhone15Pro -> Navigate to page 'product#product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_iPhone15Pro'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 3-Click on link iPhone15Pro - Navigate to page productproduct.png')

"Step 4: Click on button purchaseQuantity (Buy)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_purchaseQuantity"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_purchaseQuantity', ['button_purchaseQuantity_internalRoleButtonName': button_purchaseQuantity_internalRoleButtonName, 'button_purchaseQuantity_type': button_purchaseQuantity_type]))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 4-Click on button purchaseQuantity Buy.png')

"Step 5: Click on button purchaseQuantity (Buy)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_purchaseQuantity"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_purchaseQuantity', ['button_purchaseQuantity_internalRoleButtonName': button_purchaseQuantity_internalRoleButtonName_1, 'button_purchaseQuantity_type': button_purchaseQuantity_type_1]))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 5-Click on button purchaseQuantity Buy.png')

"Step 6: Click on button purchaseQuantity (Buy)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_purchaseQuantity"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_purchaseQuantity', ['button_purchaseQuantity_internalRoleButtonName': button_purchaseQuantity_internalRoleButtonName_2, 'button_purchaseQuantity_type': button_purchaseQuantity_type_2]))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 6-Click on button purchaseQuantity Buy.png')

"Step 7: Click on button purchaseQuantity (Buy)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_purchaseQuantity"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_purchaseQuantity', ['button_purchaseQuantity_internalRoleButtonName': button_purchaseQuantity_internalRoleButtonName_3, 'button_purchaseQuantity_type': button_purchaseQuantity_type_3]))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 7-Click on button purchaseQuantity Buy.png')

"Step 8: Click on button purchaseQuantity (Buy)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_purchaseQuantity"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_purchaseQuantity', ['button_purchaseQuantity_internalRoleButtonName': button_purchaseQuantity_internalRoleButtonName_4, 'button_purchaseQuantity_type': button_purchaseQuantity_type_4]))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 8-Click on button purchaseQuantity Buy.png')

"Step 9: Click on button purchaseQuantity (Buy)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_purchaseQuantity"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_purchaseQuantity', ['button_purchaseQuantity_internalRoleButtonName': button_purchaseQuantity_internalRoleButtonName_5, 'button_purchaseQuantity_type': button_purchaseQuantity_type_5]))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 9-Click on button purchaseQuantity Buy.png')

"Step 10: Click on link Apple -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_Apple_1'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 10-Click on link Apple - Navigate to page .png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC17-Purchase Multiple Quantities of iPhone 15 Pro_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}