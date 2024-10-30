import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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

"Step 2: Click on link iPhone15HotNew -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_iPhone15HotNew'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 2-Click on link iPhone15HotNew - Navigate to page product.png')

"Step 3: Hover over item Product"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_product/item_Product'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 3-Hover over item Product.png')

"Step 4: Click on link Apple -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_Apple'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 4-Click on link Apple - Navigate to page category.png')

"Step 5: Click on link brandOptions (Apple)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_brandOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_brandOptions', ['link_brandOptions_class': link_brandOptions_class, 'link_brandOptions_internalRoleLinkName': link_brandOptions_internalRoleLinkName, 'link_brandOptions_category_id': link_brandOptions_category_id]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 5-Click on link brandOptions Apple.png')

"Step 6: Click on button Sale20WUSBAdapter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_Sale20WUSBAdapter'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 6-Click on button Sale20WUSBAdapter.png')

"Step 7: Hover over item Category"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_category/item_Category'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 7-Hover over item Category.png')

"Step 8: Click on link Accessories"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_Accessories'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 8-Click on link Accessories.png')

"Step 9: Hover over item Category"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_category/item_Category'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 9-Hover over item Category.png')

"Step 10: Click on link Accessories"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_Accessories'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 10-Click on link Accessories.png')

"Step 11: Click on button SamsungGalaxyS23Ultra"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_SamsungGalaxyS23Ultra'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 11-Click on button SamsungGalaxyS23Ultra.png')

"Step 12: Click on link KCellphoneShop -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_KCellphoneShop'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 12-Click on link KCellphoneShop - Navigate to page .png')

"Step 13: Click on button AddToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_AddToCart'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 13-Click on button AddToCart.png')

"Step 14: Click on label productName (iPhone15)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_productName"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_productName', ['label_productName_for': label_productName_for]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 14-Click on label productName iPhone15.png')

"Step 15: Click on button Buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_Buy'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 15-Click on button Buy.png')

"Step 16: Click on button ProductAddedToCart -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_ProductAddedToCart'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 16-Click on button ProductAddedToCart - Navigate to page .png')

"Step 17: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC9-Add Multiple Products to Cart and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}