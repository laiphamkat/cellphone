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

"Step 2: Click on button addToCart2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_addToCart2'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 2-Click on button addToCart2.png')

"Step 3: Click on label 512Gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/label_512Gb'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 3-Click on label 512Gb.png')

"Step 4: Click on label blueTitanium"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/label_blueTitanium'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 4-Click on label blueTitanium.png')

"Step 5: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 5-Click on button buy.png')

"Step 6: Click on link iphone15SiliconeCaseWithMagSafe -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_iphone15SiliconeCaseWithMagSafe'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 6-Click on link iphone15SiliconeCaseWithMagSafe - Navigate to page product.png')

"Step 7: Click on label iphone15Pro"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_iphone15Pro'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 7-Click on label iphone15Pro.png')

"Step 8: Click on label winterBlue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_winterBlue'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 8-Click on label winterBlue.png')

"Step 9: Click on button buy2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy2'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 9-Click on button buy2.png')

"Step 10: Click on link cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_cart'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 10-Click on link cart.png')

"Step 11: Fill in shipping details and complete the checkout process"

completeCheckoutProcessWithShippingDetails.execute(data_path_0, Integer.valueOf(index_0))

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC7-Add Multiple iPhone Cases to Cart and Complete Checkout_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}