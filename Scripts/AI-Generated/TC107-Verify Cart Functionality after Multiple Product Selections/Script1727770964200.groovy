import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
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

"Step 2: Click on link productDetail (iPhone15Pro) -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_productDetail"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_productDetail', ['link_productDetail_class': link_productDetail_class, 'link_productDetail_nth': link_productDetail_nth, 'link_productDetail_internalRoleLinkName': link_productDetail_internalRoleLinkName, 'link_productDetail_product_id': link_productDetail_product_id]))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 2-Click on link productDetail iPhone15Pro - Navigate to page product.png')

"Step 3: Click on label storageOptions (Storage512GB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_storageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_storageOptions', ['label_storageOptions_for': label_storageOptions_for, 'label_storageOptions_internalText': label_storageOptions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 3-Click on label storageOptions Storage512GB.png')

"Step 4: Click on label storageOptions (Storage512GB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_storageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_storageOptions', ['label_storageOptions_for': label_storageOptions_for_1, 'label_storageOptions_internalText': label_storageOptions_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 4-Click on label storageOptions Storage512GB.png')

"Step 5: Click on button Buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 5-Click on button Buy.png')

"Step 6: Click on button Buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 6-Click on button Buy.png')

"Step 7: Click on label storageOptions (256GB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_storageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_storageOptions', ['label_storageOptions_for': label_storageOptions_for_2, 'label_storageOptions_internalText': label_storageOptions_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 7-Click on label storageOptions 256GB.png')

"Step 8: Click on label storageOptions (BlueTitanium)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_storageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_storageOptions', ['label_storageOptions_for': label_storageOptions_for_3, 'label_storageOptions_internalText': label_storageOptions_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 8-Click on label storageOptions BlueTitanium.png')

"Step 9: Hover over link goToCartMultiple (GoToCart2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/link_goToCartMultiple"
WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_goToCartMultiple', ['link_goToCartMultiple_internalRoleLinkName': link_goToCartMultiple_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 9-Hover over link goToCartMultiple GoToCart2.png')

"Step 10: Click on span productDetails (ProductLink) -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/span_productDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/span_productDetails', ['span_productDetails_internalRoleLinkName': span_productDetails_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 10-Click on span productDetails ProductLink - Navigate to page cart.png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC107-Verify Cart Functionality after Multiple Product Selections_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}