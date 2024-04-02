import katalon.common.searchIPhoneCasesByPriceRange
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.common.viewAndBuyIPhone15SiliconeCaseWithMagsafe
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://cellphone-staging.aut.katalon.com/"

WebUI.navigateToUrl(GlobalVariable.application_domain + '/')

"Step 2: Call functional action"

WebUI.takeScreenshot()

searchIPhoneCasesByPriceRange.execute(data_path_0, Integer.valueOf(index_0))

"Step 3: Call functional action"

WebUI.takeScreenshot()

viewAndBuyIPhone15SiliconeCaseWithMagsafe.execute()

"Step 4: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Verify Successful Purchase of iPhone 15 Silicone Case with Magsafe_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
