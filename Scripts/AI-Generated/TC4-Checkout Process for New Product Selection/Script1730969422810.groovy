import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.completeShippingInfoAndProceedToPayment
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.custom.TrueTestScripts
import truetest.common.selectProductOptionsAndProceedToCheckout
import truetest.common.fillShippingAddressDetails
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

"Step 2: Hover over item object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_object2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 2-Hover over item object2.png')

"Step 3: Click on link brandNames (Apple) -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_brandNames"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_brandNames', ['link_brandNames_nthChild': link_brandNames_nthChild, 'link_brandNames_internalRoleLinkName': link_brandNames_internalRoleLinkName, 'link_brandNames_category_id': link_brandNames_category_id]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 3-Click on link brandNames Apple - Navigate to page category.png')

"Step 4: Click on button newProduct (NewIPhone15Plus)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_newProduct"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_newProduct', ['button_newProduct_class': button_newProduct_class, 'button_newProduct_internalHasText': button_newProduct_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 4-Click on button newProduct NewIPhone15Plus.png')

"Step 5: Select product options and proceed to checkout"

selectProductOptionsAndProceedToCheckout.execute(data_path_0, Integer.valueOf(index_0))

"Step 6: Fill in shipping address details for checkout"

fillShippingAddressDetails.execute(data_path_1, Integer.valueOf(index_1))

"Step 7: Complete shipping information and proceed to payment"

completeShippingInfoAndProceedToPayment.execute(data_path_2, Integer.valueOf(index_2))

"Step 8: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Checkout Process for New Product Selection_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}