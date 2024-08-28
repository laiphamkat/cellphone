import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.common.fillShippingDetailsAndContinueToPayment
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.common.selectStorageOptionsAndCheckout

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Hover over item productCategories (phone)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_home/item_productCategories'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 2-Hover over item productCategories phone.png')

"Step 3: Click on link samsung -> Navigate to page '/category/samsung'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_samsung'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 3-Click on link samsung - Navigate to page categorysamsung.png')

"Step 4: Click on link sortOptions (byTitle)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_samsung/link_sortOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_samsung/link_sortOptions', ['link_sortOptions_nthChild': link_sortOptions_nthChild, 'link_sortOptions_internalRoleLinkName': link_sortOptions_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 4-Click on link sortOptions byTitle.png')

"Step 5: Click on link sortOptions (byPrice)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_samsung/link_sortOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_samsung/link_sortOptions', ['link_sortOptions_nthChild': link_sortOptions_nthChild_1, 'link_sortOptions_internalRoleLinkName': link_sortOptions_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 5-Click on link sortOptions byPrice.png')

"Step 6: Click on link googlePixel -> Navigate to page '/category/google-pixel'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_samsung/link_googlePixel'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 6-Click on link googlePixel - Navigate to page categorygoogle-pixel.png')

"Step 7: Click on link googlePixel8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/google-pixel?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_google_pixel/link_googlePixel8'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 7-Click on link googlePixel8.png')

"Step 8: Select storage options and proceed to checkout"

selectStorageOptionsAndCheckout.execute(data_path_0, Integer.valueOf(index_0))

"Step 9: Fill in shipping details and proceed to payment section"

fillShippingDetailsAndContinueToPayment.execute(data_path_1, Integer.valueOf(index_1))

"Step 10: Click on button completeOrder -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_completeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 10-Click on button completeOrder - Navigate to page .png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC13-Checkout Process for Google Pixel_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}