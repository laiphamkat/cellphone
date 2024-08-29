import katalon.common.completeCheckoutProcessWithShippingDetails
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts
import internal.GlobalVariable
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

"Step 2: Click on button addToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_addToCart'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 2-Click on button addToCart.png')

"Step 3: Click on label 512Gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/label_512Gb'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 3-Click on label 512Gb.png')

"Step 4: Click on label green"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/label_green'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 4-Click on label green.png')

"Step 5: Click on button increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_increased'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 5-Click on button increased.png')

"Step 6: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 6-Click on button buy.png')

"Step 7: Click on link cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_cart'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 7-Click on link cart.png')

"Step 8: Fill in shipping details and complete the checkout process"

completeCheckoutProcessWithShippingDetails.execute(data_path_0, Integer.valueOf(index_0))

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Add to Cart and Checkout for Green Device with 512GB_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}