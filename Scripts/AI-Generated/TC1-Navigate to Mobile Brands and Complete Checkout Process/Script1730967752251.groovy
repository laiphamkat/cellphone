import internal.GlobalVariable
import truetest.common.fillShippingAddressDetails
import truetest.common.selectStorageOptionsAndProceedToCheckout
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.common.completeShippingInfoAndProceedToPayment
import com.kms.katalon.core.configuration.RunConfiguration
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

"Step 2: Hover over item object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_object'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Hover over item object.png')

"Step 3: Click on link mobileBrands (Apple) -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_mobileBrands"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_mobileBrands', ['link_mobileBrands_nthChild': link_mobileBrands_nthChild, 'link_mobileBrands_internalRoleLinkName': link_mobileBrands_internalRoleLinkName, 'link_mobileBrands_category_id': link_mobileBrands_category_id]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on link mobileBrands Apple - Navigate to page category.png')

"Step 4: Click on button newProduct (NewIPhone15Plus)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_newProduct"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_newProduct', ['button_newProduct_class': button_newProduct_class, 'button_newProduct_internalHasText': button_newProduct_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on button newProduct NewIPhone15Plus.png')

"Step 5: Select storage options and proceed to checkout"

selectStorageOptionsAndProceedToCheckout.execute(data_path_0, Integer.valueOf(index_0))

"Step 6: Fill in shipping address details during checkout"

fillShippingAddressDetails.execute(data_path_1, Integer.valueOf(index_1))

"Step 7: Complete shipping information and proceed to payment"

completeShippingInfoAndProceedToPayment.execute(data_path_2, Integer.valueOf(index_2))

"Step 8: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Navigate to Mobile Brands and Complete Checkout Process_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}