import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.fillShippingDetailsForCheckout
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

"Step 2: Click on link brandNames (samsung) -> Navigate to page 'category#category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_brandNames"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_brandNames', ['category_id': category_id, 'link_brandNames_internalRoleLinkName': link_brandNames_internalRoleLinkName, 'link_brandNames_nthChild': link_brandNames_nthChild]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 2-Click on link brandNames samsung - Navigate to page categorycategory.png')

"Step 3: Click on link ByPrice"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_ByPrice'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 3-Click on link ByPrice.png')

"Step 4: Click on button AddToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_AddToCart'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 4-Click on button AddToCart.png')

"Step 5: Click on div Slider"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/div_Slider'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 5-Click on div Slider.png')

"Step 6: Click on button Show"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_Show'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 6-Click on button Show.png')

"Step 7: Click on div Slider"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/div_Slider'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 7-Click on div Slider.png')

"Step 8: Click on link Apple2 -> Navigate to page 'iphone cases category#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_Apple2'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 8-Click on link Apple2 - Navigate to page iphone cases category.png')

"Step 9: Click on link GoToCart -> Navigate to page 'cart#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_iphone_cases_category/link_GoToCart'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 9-Click on link GoToCart - Navigate to page cartcart.png')

"Step 10: Click on button proceedToCheckout (ProceedToCheckout)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_proceedToCheckout"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_proceedToCheckout', ['button_proceedToCheckout_internalRoleButtonName': button_proceedToCheckout_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 10-Click on button proceedToCheckout ProceedToCheckout.png')

"Step 11: Input shipping information for checkout process"

fillShippingDetailsForCheckout.execute(data_path_0, Integer.valueOf(index_0))

"Step 12: Click on button CompleteOrder -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 12-Click on button CompleteOrder - Navigate to page .png')

"Step 13: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC7-Checkout Process for Mobile Phone by Price_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}