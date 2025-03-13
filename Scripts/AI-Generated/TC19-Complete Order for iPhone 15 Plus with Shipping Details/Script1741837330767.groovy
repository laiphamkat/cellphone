import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.fillShippingDetailsAndCompleteOrder
import truetest.common.proceedToCheckoutAndEnterEmail
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

"Step 2: Click on link iPhone15Plus -> Navigate to page 'product#product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_iPhone15Plus'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 2-Click on link iPhone15Plus - Navigate to page productproduct.png')

"Step 3: Click on link Phone -> Navigate to page 'general phone category#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_Phone'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 3-Click on link Phone - Navigate to page general phone category.png')

"Step 4: Click on button AddToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_general_phone_category/button_AddToCart'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 4-Click on button AddToCart.png')

"Step 5: Click on label 256GB"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_general_phone_category/label_256GB'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 5-Click on label 256GB.png')

"Step 6: Click on label Green"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_general_phone_category/label_Green'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 6-Click on label Green.png')

"Step 7: Click on button Buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_general_phone_category/button_Buy'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 7-Click on button Buy.png')

"Step 8: Click on link PlaceAnOrder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_general_phone_category/link_PlaceAnOrder'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 8-Click on link PlaceAnOrder.png')

"Step 9: Proceed to checkout and enter email for shipping"

proceedToCheckoutAndEnterEmail.execute(data_path_0, Integer.valueOf(index_0))

"Step 10: Fill in shipping details and complete the order"

fillShippingDetailsAndCompleteOrder.execute(data_path_1, Integer.valueOf(index_1))

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC19-Complete Order for iPhone 15 Plus with Shipping Details_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}