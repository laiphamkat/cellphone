import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.common.completeCheckoutShippingAddressForm
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

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on label 512GB"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/label_512GB'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 2-Click on label 512GB.png')

"Step 3: Click on label Green"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/label_Green'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 3-Click on label Green.png')

"Step 4: Fill out shipping address form and complete order"

completeCheckoutShippingAddressForm.execute(data_path_0, Integer.valueOf(index_0))

"Step 5: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Order iPhone 15 with Customization without Additional Steps_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}