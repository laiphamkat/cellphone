import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.fillCheckoutInfoAndContinueToPayment
import truetest.common.selectProductOptionsAndCheckout
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

"Step 2: Click on link brandCategories (apple) -> Navigate to page 'category#category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_brandCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_brandCategories', ['category_id': category_id, 'link_brandCategories_internalRoleLinkName': link_brandCategories_internalRoleLinkName, 'link_brandCategories_nthChild': link_brandCategories_nthChild]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 2-Click on link brandCategories apple - Navigate to page categorycategory.png')

"Step 3: Click on link newProducts (hotNew)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_newProducts"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_newProducts', ['link_newProducts_class': link_newProducts_class, 'link_newProducts_internalRoleLinkName': link_newProducts_internalRoleLinkName, 'product_id': product_id]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 3-Click on link newProducts hotNew.png')

"Step 4: Choose product options and proceed to checkout"

selectProductOptionsAndCheckout.execute(data_path_0, Integer.valueOf(index_0))

"Step 5: Fill in checkout information and proceed to payment"

fillCheckoutInfoAndContinueToPayment.execute(data_path_1, Integer.valueOf(index_1))

"Step 6: Click on button completeOrder -> Navigate to page 'thank you#thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_completeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 6-Click on button completeOrder - Navigate to page thank youthank-you.png')

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Purchase New Products and Finalize Order_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}