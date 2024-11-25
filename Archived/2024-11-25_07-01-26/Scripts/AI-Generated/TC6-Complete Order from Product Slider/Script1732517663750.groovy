import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.fillShippingInformationAndProceedToPayment
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

"Step 2: Click on div swiperSliderContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_swiperSliderContent'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 2-Click on div swiperSliderContent.png')

"Step 3: Click on link product (iPhone15Plus) -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_product"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_product', ['link_product_class': link_product_class, 'link_product_nth': link_product_nth, 'link_product_internalRoleLinkName': link_product_internalRoleLinkName, 'product_id': product_id]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 3-Click on link product iPhone15Plus - Navigate to page product.png')

"Step 4: Click on label productDetails (512GB2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_productDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_productDetails', ['label_productDetails_for': label_productDetails_for, 'label_productDetails_internalText': label_productDetails_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 4-Click on label productDetails 512GB2.png')

"Step 5: Click on label productDetails (Green2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_productDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_productDetails', ['label_productDetails_for': label_productDetails_for_1, 'label_productDetails_internalText': label_productDetails_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 5-Click on label productDetails Green2.png')

"Step 6: Click on link cartNavigation (goToCart)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/link_cartNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_cartNavigation', ['link_cartNavigation_internalRoleLinkName': link_cartNavigation_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 6-Click on link cartNavigation goToCart.png')

"Step 7: Fill out shipping information and proceed to payment"

fillShippingInformationAndProceedToPayment.execute(data_path_0, Integer.valueOf(index_0))

"Step 8: Click on button CompleteOrder -> Navigate to page 'thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 8-Click on button CompleteOrder - Navigate to page thank-you.png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Complete Order from Product Slider_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}