import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on link samsung -> Navigate to page 'category/*'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_samsung'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 2: Click on link samsung - Navigate to page category.png')

"Step 3: Hover over item phone"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_category/item_phone'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 3: Hover over item phone.png')

"Step 4: Click on link phone"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_phone'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4: Click on link phone.png')

"Step 5: Click on link kcellphoneShop -> Navigate to page '/'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_kcellphoneShop'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 5: Click on link kcellphoneShop - Navigate to page .png')

"Step 6: Click on link iphoneSiliconeCaseWithMagsafe -> Navigate to page 'product/*'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_iphoneSiliconeCaseWithMagsafe'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 6: Click on link iphoneSiliconeCaseWithMagsafe - Navigate to page product.png')

"Step 7: Hover over item phoneAppleSamsungGooglePixel"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_product/item_phoneAppleSamsungGooglePixel'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 7: Hover over item phoneAppleSamsungGooglePixel.png')

"Step 8: Click on link samsung -> Navigate to page 'category/*'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_samsung'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 8: Click on link samsung - Navigate to page category.png')

"Step 9: Click on link samsungGalaxyS23UltraHot -> Navigate to page 'product/*'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_samsungGalaxyS23UltraHot'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 9: Click on link samsungGalaxyS23UltraHot - Navigate to page product.png')

"Step 10: Hover over item phoneAppleSamsungGooglePixel"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_product/item_phoneAppleSamsungGooglePixel'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 10: Hover over item phoneAppleSamsungGooglePixel.png')

"Step 11: Click on link phoneCategory -> Navigate to page 'category/*'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_phoneCategory'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 11: Click on link phoneCategory - Navigate to page category.png')

"Step 12: Click on div object"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 12: Click on div object.png')

"Step 13: Click on link googlePixel7Pro -> Navigate to page ''"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_googlePixel7Pro'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 13: Click on link googlePixel7Pro - Navigate to page .png')

"Step 14: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Verify Navigation to Different Phone and Accessory Categories_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
