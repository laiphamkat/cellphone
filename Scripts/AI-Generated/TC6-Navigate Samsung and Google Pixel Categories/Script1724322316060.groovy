import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
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

"Step 2: Hover over item phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_phone'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 2-Hover over item phone.png')

"Step 3: Click on link samsung -> Navigate to page '/category/samsung'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_samsung'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 3-Click on link samsung - Navigate to page categorysamsung.png')

"Step 4: Click on button productsItemInStock"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_samsung/button_productsItemInStock'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 4-Click on button productsItemInStock.png')

"Step 5: Click on button increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_samsung/button_increased'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 5-Click on button increased.png')

"Step 6: Click on button closeButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_samsung/button_closeButton'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 6-Click on button closeButton.png')

"Step 7: Click on link samsungGalaxyS23Ultra -> Navigate to page '/product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_samsung/link_samsungGalaxyS23Ultra'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 7-Click on link samsungGalaxyS23Ultra - Navigate to page product.png')

"Step 8: Hover over item accessories"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_product/item_accessories'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 8-Hover over item accessories.png')

"Step 9: Click on link apple -> Navigate to page '/category/chekhly-na-iphone'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_apple'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 9-Click on link apple - Navigate to page categorychekhly-na-iphone.png')

"Step 10: Click on link iphone15ClearCaseWithMagSafe -> Navigate to page '/product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/chekhly-na-iphone?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_chekhly_na_iphone/link_iphone15ClearCaseWithMagSafe'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 10-Click on link iphone15ClearCaseWithMagSafe - Navigate to page product.png')

"Step 11: Hover over item phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_product/item_phone'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 11-Hover over item phone.png')

"Step 12: Click on link apple -> Navigate to page '/category/apple'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_apple_1'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 12-Click on link apple - Navigate to page categoryapple.png')

"Step 13: Click on link samsung -> Navigate to page '/category/samsung'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_apple/link_samsung'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 13-Click on link samsung - Navigate to page categorysamsung.png')

"Step 14: Click on link googlePixel -> Navigate to page '/category/google-pixel'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_samsung/link_googlePixel'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 14-Click on link googlePixel - Navigate to page categorygoogle-pixel.png')

"Step 15: Hover over item accessories"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/google-pixel?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_category_google_pixel/item_accessories'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 15-Hover over item accessories.png')

"Step 16: Click on link apple -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/google-pixel?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_google_pixel/link_apple'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 16-Click on link apple - Navigate to page .png')

"Step 17: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Navigate Samsung and Google Pixel Categories_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}