import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to"

TrueTestScripts.navigate("")

"Step 2: Click on div newIphone15Plus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_newIphone15Plus'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 2-Click on div newIphone15Plus.png')

"Step 3: Click on button addToCartNewiPhone15Plus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_addToCartSamsungGalaxyS23"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_addToCartSamsungGalaxyS23', ['button_addToCartSamsungGalaxyS23_class': button_addToCartSamsungGalaxyS23_class, 'button_addToCartSamsungGalaxyS23_internalHasText': button_addToCartSamsungGalaxyS23_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 3-Click on button addToCartNewiPhone15Plus.png')

"Step 4: Click on button closeButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_closeButton'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 4-Click on button closeButton.png')

"Step 5: Hover over item accessories"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_home/item_phone_9'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 5-Hover over item accessories.png')

"Step 6: Click on link samsungPowerAndCables -> Navigate to page 'category/power-and-cables'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_samsungPowerAndCables'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 6-Click on link samsungPowerAndCables - Navigate to page categorypower-and-cables.png')

"Step 7: Click on button productsItemInStock"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/power-and-cables?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_power_and_cables/button_object"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_power_and_cables/button_object', ['button_object_class': button_object_class, 'button_object_internalHasText': button_object_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 7-Click on button productsItemInStock.png')

"Step 8: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/power-and-cables?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_power_and_cables/button_object_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_power_and_cables/button_object_1', ['button_object_class': button_object_class, 'button_object_internalHasText': button_object_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 8-Click on button object.png')

"Step 9: Click on link samsungGalaxyS23Ultra -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/power-and-cables?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_power_and_cables/link_samsungGalaxyS23Ultra'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 9-Click on link samsungGalaxyS23Ultra - Navigate to page product.png')

"Step 10: Hover over item phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/item_accessories_2"
WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_product/item_accessories_2', ['item_accessories_internalHasText': item_accessories_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 10-Hover over item phone.png')

"Step 11: Click on link samsung -> Navigate to page 'category/samsung'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_samsung'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 11-Click on link samsung - Navigate to page categorysamsung.png')

"Step 12: Click on button addToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_samsung/button_addToCart'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 12-Click on button addToCart.png')

"Step 13: Click on div pleaseChooseAvariant"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_samsung/div_pleaseChooseAvariant'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 13-Click on div pleaseChooseAvariant.png')

"Step 14: Click on button closeButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_samsung/button_closeButton'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 14-Click on button closeButton.png')

"Step 15: Click on button productsItemInStock"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_samsung/button_object"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_samsung/button_object', ['button_object_class': button_object_class, 'button_object_internalHasText': button_object_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 15-Click on button productsItemInStock.png')

"Step 16: Click on button closeButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_samsung/button_closeButton'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 16-Click on button closeButton.png')

"Step 17: Click on link samsung"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_samsung/link_samsung'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 17-Click on link samsung.png')

"Step 18: Click on link googlePixel -> Navigate to page 'category/google-pixel'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_samsung/link_googlePixel'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 18-Click on link googlePixel - Navigate to page categorygoogle-pixel.png')

"Step 19: Click on link samsung -> Navigate to page 'category/samsung'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/google-pixel?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_google_pixel/link_samsung'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 19-Click on link samsung - Navigate to page categorysamsung.png')

"Step 20: Hover over item phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_category_samsung/item_phone'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 20-Hover over item phone.png')

"Step 21: Click on span object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_samsung/span_object'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 21-Click on span object.png')

"Step 22: Click on link googlePixel -> Navigate to page 'category/google-pixel'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_samsung/link_googlePixel_1'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 22-Click on link googlePixel - Navigate to page categorygoogle-pixel.png')

"Step 23: Click on link phone -> Navigate to page 'category/phone'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/google-pixel?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_google_pixel/link_phone'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 23-Click on link phone - Navigate to page categoryphone.png')

"Step 24: Click on main roleMain"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/phone?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_phone/main_roleMain'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 24-Click on main roleMain.png')

"Step 25: Hover over item phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/phone?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_category_phone/item_phone'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 25-Hover over item phone.png')

"Step 26: Click on link samsung -> Navigate to page 'category/samsung'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/phone?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_phone/link_samsung'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 26-Click on link samsung - Navigate to page categorysamsung.png')

"Step 27: Click on link googlePixel -> Navigate to page 'category/google-pixel'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_samsung/link_googlePixel'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 27-Click on link googlePixel - Navigate to page categorygoogle-pixel.png')

"Step 28: Click on link samsung -> Navigate to page 'category/samsung'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/google-pixel?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_google_pixel/link_samsung'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 28-Click on link samsung - Navigate to page categorysamsung.png')

"Step 29: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_samsung/button_object_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_samsung/button_object_1', ['button_object_class': button_object_class, 'button_object_internalHasText': button_object_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 29-Click on button object.png')

"Step 30: Click on button closeButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_samsung/button_closeButton'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 30-Click on button closeButton.png')

"Step 31: Click on link samsungGalaxyS23Ultra -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_samsung/link_samsungGalaxyS23Ultra'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 31-Click on link samsungGalaxyS23Ultra - Navigate to page product.png')

"Step 32: Click on label 256Gb1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_512Gb_10"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_512Gb_10', ['label_512Gb_for': label_512Gb_for, 'label_512Gb_internalText': label_512Gb_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 32-Click on label 256Gb1.png')

"Step 33: Hover over item accessories"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/item_accessories_3"
WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_product/item_accessories_3', ['item_accessories_internalHasText': item_accessories_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 33-Hover over item accessories.png')

"Step 34: Click on link apple -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_apple'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 34-Click on link apple - Navigate to page .png')

"Step 35: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC11-Add Multiple Items from Different Categories to Cart_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}