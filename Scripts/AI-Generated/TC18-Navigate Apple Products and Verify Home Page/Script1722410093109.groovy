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

"Step 2: Click on link apple -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_home/link_apple', ['nthChildIndex': link_apple_nthChildIndex]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 2: Click on link apple - Navigate to page category.png')

"Step 3: Click on button sale20WusbpowerAdapter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_category/button_sale20WusbpowerAdapter', ['classVariable': button_sale20WusbpowerAdapter_classVariable, 'internalHasTextVariable': button_sale20WusbpowerAdapter_internalHasTextVariable]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 3: Click on button sale20WusbpowerAdapter.png')

"Step 4: Click on label 1Tb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_category/label_1Tb', ['internalTextVariable': label_1Tb_internalTextVariable, 'forVariable': label_1Tb_forVariable]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 4: Click on label 1Tb.png')

"Step 5: Click on label 1Tb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_category/label_1Tb', ['internalTextVariable': label_1Tb_internalTextVariable, 'forVariable': label_1Tb_forVariable]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 5: Click on label 1Tb.png')

"Step 6: Click on button 1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_1'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 6: Click on button 1.png')

"Step 7: Click on link apple"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_category/link_apple', ['internalRoleLinkNameVariable': link_apple_internalRoleLinkNameVariable, 'nthChildIndex': link_apple_nthChildIndex]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 7: Click on link apple.png')

"Step 8: Hover over item phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Parameterized Objects/Page_category/item_phone', ['internalHasTextVariable': item_phone_internalHasTextVariable]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 8: Hover over item phone.png')

"Step 9: Click on link apple"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_category/link_apple', ['internalRoleLinkNameVariable': link_apple_internalRoleLinkNameVariable, 'nthChildIndex': link_apple_nthChildIndex]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 9: Click on link apple.png')

"Step 10: Click on link iPhone15PlusNew -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_category/link_iPhone15PlusNew', ['internalRoleLinkNameVariable': link_iPhone15PlusNew_internalRoleLinkNameVariable, 'classVariable': link_iPhone15PlusNew_classVariable]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 10: Click on link iPhone15PlusNew - Navigate to page product.png')

"Step 11: Click on div element -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_element'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 11: Click on div element - Navigate to page .png')

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC18-Navigate Apple Products and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}