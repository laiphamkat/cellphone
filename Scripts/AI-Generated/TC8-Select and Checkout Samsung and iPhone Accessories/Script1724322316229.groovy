import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import katalon.common.selectDeviceOptionsAndProceedToCheckout
import internal.GlobalVariable

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Hover over item accessories"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_accessories'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 2-Hover over item accessories.png')

"Step 3: Click on link samsungPowerAndCables -> Navigate to page '/category/power-and-cables'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_samsungPowerAndCables'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 3-Click on link samsungPowerAndCables - Navigate to page categorypower-and-cables.png')

"Step 4: Click on link byTitle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/power-and-cables?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_power_and_cables/link_byTitle'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 4-Click on link byTitle.png')

"Step 5: Click on link byTitle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/power-and-cables?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_power_and_cables/link_byTitle'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 5-Click on link byTitle.png')

"Step 6: Click on link samsung"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/power-and-cables?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_power_and_cables/link_samsung'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 6-Click on link samsung.png')

"Step 7: Click on link samsungGalaxyS23UltraSmartviewCases -> Navigate to page '/product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/power-and-cables?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_power_and_cables/link_samsungGalaxyS23UltraSmartviewCases'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 7-Click on link samsungGalaxyS23UltraSmartviewCases - Navigate to page product.png')

"Step 8: Click on link accessories -> Navigate to page '/category/accessories'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_accessories'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 8-Click on link accessories - Navigate to page categoryaccessories.png')

"Step 9: Click on link iphone15SiliconeCaseWithMagSafe -> Navigate to page '/product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/accessories?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_accessories/link_iphone15SiliconeCaseWithMagSafe'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 9-Click on link iphone15SiliconeCaseWithMagSafe - Navigate to page product.png')

"Step 10: Click on label 256Gb1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_256Gb1'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 10-Click on label 256Gb1.png')

"Step 11: Click on label blueTitanium"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_blueTitanium'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 11-Click on label blueTitanium.png')

"Step 12: Select device options and continue to checkout."

selectDeviceOptionsAndProceedToCheckout.execute(data_path_0, Integer.valueOf(index_0))

"Step 13: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC8-Select and Checkout Samsung and iPhone Accessories_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}