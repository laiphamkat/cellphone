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

WebUI.takeScreenshot(reportLocation + '/TC16/Step 2-Hover over item phone.png')

"Step 3: Click on link apple2 -> Navigate to page '/category/apple'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_apple2'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 3-Click on link apple2 - Navigate to page categoryapple.png')

"Step 4: Click on button newIphone15Plus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_apple/button_newIphone15Plus'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 4-Click on button newIphone15Plus.png')

"Step 5: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_apple/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 5-Click on button object.png')

"Step 6: Click on label pink"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_apple/label_pink'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 6-Click on label pink.png')

"Step 7: Click on label 1Tb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_apple/label_1Tb'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 7-Click on label 1Tb.png')

"Step 8: Click on button buy2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_apple/button_buy2'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 8-Click on button buy2.png')

"Step 9: Click on link iphone15ProMax -> Navigate to page '/product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_apple/link_iphone15ProMax'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 9-Click on link iphone15ProMax - Navigate to page product.png')

"Step 10: Click on label 256Gb1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_256Gb1'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 10-Click on label 256Gb1.png')

"Step 11: Click on label blueTitanium"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_blueTitanium'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 11-Click on label blueTitanium.png')

"Step 12: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 12-Click on button buy.png')

"Step 13: Hover over item phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_product/item_phone'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 13-Hover over item phone.png')

"Step 14: Click on link samsung -> Navigate to page '/category/samsung'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_samsung'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 14-Click on link samsung - Navigate to page categorysamsung.png')

"Step 15: Click on link googlePixel -> Navigate to page '/category/google-pixel'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_samsung/link_googlePixel'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 15-Click on link googlePixel - Navigate to page categorygoogle-pixel.png')

"Step 16: Click on link byTitle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/google-pixel?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_google_pixel/link_byTitle'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 16-Click on link byTitle.png')

"Step 17: Click on link byPrice"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/google-pixel?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_google_pixel/link_byPrice'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 17-Click on link byPrice.png')

"Step 18: Click on link googlePixel8 -> Navigate to page '/product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/google-pixel?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_google_pixel/link_googlePixel8'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 18-Click on link googlePixel8 - Navigate to page product.png')

"Step 19: Click on label 256Gb1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_256Gb1'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 19-Click on label 256Gb1.png')

"Step 20: Click on label black"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_black'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 20-Click on label black.png')

"Step 21: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 21-Click on button buy.png')

"Step 22: Click on link placeAnOrder -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_placeAnOrder'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 22-Click on link placeAnOrder - Navigate to page cart.png')

"Step 23: Click on button removeButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_removeButton'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 23-Click on button removeButton.png')

"Step 24: Hover over item listitem2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_cart/item_listitem2'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 24-Hover over item listitem2.png')

"Step 25: Click on link apple -> Navigate to page '/category/chekhly-na-iphone'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_apple'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 25-Click on link apple - Navigate to page categorychekhly-na-iphone.png')

"Step 26: Click on link byTitle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/chekhly-na-iphone?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_chekhly_na_iphone/link_byTitle'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 26-Click on link byTitle.png')

"Step 27: Click on link samsung -> Navigate to page '/category/power-and-cables'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/chekhly-na-iphone?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_chekhly_na_iphone/link_samsung'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 27-Click on link samsung - Navigate to page categorypower-and-cables.png')

"Step 28: Click on link samsungGalaxyZfold4SiliconCover -> Navigate to page '/product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/power-and-cables?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_power_and_cables/link_samsungGalaxyZfold4SiliconCover'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 28-Click on link samsungGalaxyZfold4SiliconCover - Navigate to page product.png')

"Step 29: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy_1'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 29-Click on button buy.png')

"Step 30: Click on link placeAnOrder -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_placeAnOrder'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 30-Click on link placeAnOrder - Navigate to page cart.png')

"Step 31: Click on button proceedToCheckout -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 31-Click on button proceedToCheckout - Navigate to page .png')

"Step 32: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC16-Add Multiple Phones and Accessories to Cart_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}