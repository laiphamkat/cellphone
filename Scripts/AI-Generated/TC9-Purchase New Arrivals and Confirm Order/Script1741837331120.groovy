import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.fillShippingInformationAndProceedToPayment
import truetest.common.selectPhoneOptionsAndProceedToCheckout
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

"Step 2: Click on link mobileBrand (Samsung2) -> Navigate to page 'category#category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_mobileBrand"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_mobileBrand', ['link_mobileBrand_category_id': link_mobileBrand_category_id, 'link_mobileBrand_link_mobileBrand_internalRoleLinkName': link_mobileBrand_link_mobileBrand_internalRoleLinkName, 'link_mobileBrand_link_mobileBrand_nthChild': link_mobileBrand_link_mobileBrand_nthChild]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 2-Click on link mobileBrand Samsung2 - Navigate to page categorycategory.png')

"Step 3: Click on link newArrivals (HotNew)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_newArrivals"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_newArrivals', ['link_newArrivals_class': link_newArrivals_class, 'link_newArrivals_internalRoleLinkName': link_newArrivals_internalRoleLinkName, 'product_id': product_id]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 3-Click on link newArrivals HotNew.png')

"Step 4: Select phone options and proceed to checkout"

selectPhoneOptionsAndProceedToCheckout.execute(data_path_0, Integer.valueOf(index_0))

"Step 5: Enter shipping details and continue to payment step"

fillShippingInformationAndProceedToPayment.execute(data_path_1, Integer.valueOf(index_1))

"Step 6: Click on button CompleteOrder -> Navigate to page 'thank you#thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 6-Click on button CompleteOrder - Navigate to page thank youthank-you.png')

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC9-Purchase New Arrivals and Confirm Order_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}