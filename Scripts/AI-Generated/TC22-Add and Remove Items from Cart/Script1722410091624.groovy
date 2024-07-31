import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on link goToCart -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_goToCart'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 2: Click on link goToCart - Navigate to page cart.png')

"Step 3: Click on button remove"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_cart/button_remove', ['classVariable': button_remove_classVariable, 'nthIndex': button_remove_nthIndex]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 3: Click on button remove.png')

"Step 4: Click on button remove"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_cart/button_remove', ['classVariable': button_remove_classVariable, 'nthIndex': button_remove_nthIndex]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 4: Click on button remove.png')

"Step 5: Click on link goShopping -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_goShopping'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 5: Click on link goShopping - Navigate to page .png')

"Step 6: Click on button hotNewiPhone15"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_home/button_hotNewiPhone15', ['classVariable': button_hotNewiPhone15_classVariable, 'internalHasTextVariable': button_hotNewiPhone15_internalHasTextVariable]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 6: Click on button hotNewiPhone15.png')

"Step 7: Click on label 256Gb2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_home/label_256Gb2', ['internalTextVariable': label_256Gb2_internalTextVariable, 'forVariable': label_256Gb2_forVariable]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 7: Click on label 256Gb2.png')

"Step 8: Click on label 256Gb2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_home/label_256Gb2', ['internalTextVariable': label_256Gb2_internalTextVariable, 'forVariable': label_256Gb2_forVariable]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 8: Click on label 256Gb2.png')

"Step 9: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 9: Click on button buy.png')

"Step 10: Click on link placeAnOrder -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_placeAnOrder'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 10: Click on link placeAnOrder - Navigate to page cart.png')

"Step 11: Click on button remove"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_cart/button_remove', ['classVariable': button_remove_classVariable, 'nthIndex': button_remove_nthIndex]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 11: Click on button remove.png')

"Step 12: Click on link goShopping -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_goShopping'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 12: Click on link goShopping - Navigate to page .png')

"Step 13: Click on button bannerButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_bannerButton'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 13: Click on button bannerButton.png')

"Step 14: Click on div asideBackdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_asideBackdrop'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 14: Click on div asideBackdrop.png')

"Step 15: Click on button bannerButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_bannerButton'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 15: Click on button bannerButton.png')

"Step 16: Click on div asideBackdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_asideBackdrop'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 16: Click on div asideBackdrop.png')

"Step 17: Click on item newiPhone15Plus -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/item_newiPhone15Plus'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 17: Click on item newiPhone15Plus - Navigate to page .png')

"Step 18: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC22-Add and Remove Items from Cart_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}