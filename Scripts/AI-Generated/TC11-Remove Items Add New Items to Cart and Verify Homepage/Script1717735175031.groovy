import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://cellphone-staging.aut.katalon.com/"

TrueTestScripts.navigate('/')

"Step 2: Click on link 3 -> Navigate to page 'cart'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_3'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 2: Click on link 3 - Navigate to page cart.png')

"Step 3: Click on button removeButton"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_removeButton'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 3: Click on button removeButton.png')

"Step 4: Click on button removeButton"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_removeButton'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 4: Click on button removeButton.png')

"Step 5: Click on link goShopping -> Navigate to page ''"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_goShopping'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 5: Click on link goShopping - Navigate to page .png')

"Step 6: Click on button bestChoiceHotNew"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_bestChoiceHotNew'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 6: Click on button bestChoiceHotNew.png')

"Step 7: Click on label 2"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/label_2'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 7: Click on label 2.png')

"Step 8: Click on label black"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/label_black'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 8: Click on label black.png')

"Step 9: Click on button buy2"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_buy2'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 9: Click on button buy2.png')

"Step 10: Click on link placeAnOrder -> Navigate to page 'cart'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_placeAnOrder'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 10: Click on link placeAnOrder - Navigate to page cart.png')

"Step 11: Click on button removeButton"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_removeButton'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 11: Click on button removeButton.png')

"Step 12: Click on link goShopping -> Navigate to page ''"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_goShopping'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 12: Click on link goShopping - Navigate to page .png')

"Step 13: Click on button bannerButton"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_bannerButton'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 13: Click on button bannerButton.png')

"Step 14: Click on div asideBackdrop"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_asideBackdrop'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 14: Click on div asideBackdrop.png')

"Step 15: Click on button bannerButton"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_bannerButton'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 15: Click on button bannerButton.png')

"Step 16: Click on div asideBackdrop"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_asideBackdrop'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 16: Click on div asideBackdrop.png')

"Step 17: Click on item newiPhone15Plus"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/item_newiPhone15Plus'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 17: Click on item newiPhone15Plus.png')

"Step 18: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC11-Remove Items Add New Items to Cart and Verify Homepage_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
