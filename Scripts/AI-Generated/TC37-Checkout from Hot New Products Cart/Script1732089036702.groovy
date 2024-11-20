import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.common.proceedToCheckoutFillShippingAndCompleteOrder
import com.kms.katalon.core.configuration.RunConfiguration
import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on button hotNewProducts (SamsungGalaxyS23Ultra)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_hotNewProducts"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_hotNewProducts', ['button_hotNewProducts_class': button_hotNewProducts_class, 'button_hotNewProducts_internalHasText': button_hotNewProducts_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 2-Click on button hotNewProducts SamsungGalaxyS23Ultra.png')

"Step 3: Click on link goToCart (GoToCart3) -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_goToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_goToCart', ['link_goToCart_internalRoleLinkName': link_goToCart_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 3-Click on link goToCart GoToCart3 - Navigate to page cart.png')

"Step 4: Click on button quantityControl (Increased)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_quantityControl"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_quantityControl', ['button_quantityControl_class': button_quantityControl_class, 'button_quantityControl_nthChild': button_quantityControl_nthChild, 'button_quantityControl_internalRoleButtonName': button_quantityControl_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 4-Click on button quantityControl Increased.png')

"Step 5: Complete shipping information and finalize order at checkout"

proceedToCheckoutFillShippingAndCompleteOrder.execute(data_path_0, Integer.valueOf(index_0))

"Step 6: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC37-Checkout from Hot New Products Cart_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}