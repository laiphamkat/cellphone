import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.completeOrderWithShippingDetails
import truetest.common.hoverAndSelectIphoneAccessories
import truetest.common.inputEmailAndContinueToShipping
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

"Step 2: Hover over items and select iPhone accessories to buy"

hoverAndSelectIphoneAccessories.execute(data_path_0, Integer.valueOf(index_0))

"Step 3: Click on button Increase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_Increase'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 3-Click on button Increase.png')

"Step 4: Enter email and continue to shipping details for checkout"

inputEmailAndContinueToShipping.execute(data_path_1, Integer.valueOf(index_1))

"Step 5: Fill in all shipping details and complete the order"

completeOrderWithShippingDetails.execute(data_path_2, Integer.valueOf(index_2))

"Step 6: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC16-Checkout Process for iPhone Accessories_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}