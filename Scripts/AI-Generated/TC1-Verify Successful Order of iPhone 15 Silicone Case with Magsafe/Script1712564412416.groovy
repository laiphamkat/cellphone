import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.common.orderIphone15SiliconeCase
import katalon.common.searchAppleProductsByPriceRange
import katalon.truetest.TrueTestScripts

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://cellphone-staging.aut.katalon.com/"

TrueTestScripts.navigate('/')

"Step 2: Search for Apple products within specified price range"

WebUI.takeScreenshot()

searchAppleProductsByPriceRange.execute(data_path_0, Integer.valueOf(index_0))

"Step 3: Select and order iPhone 15 silicone case with magsafe"

WebUI.takeScreenshot()

orderIphone15SiliconeCase.execute()

"Step 4: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Verify Successful Order of iPhone 15 Silicone Case with Magsafe_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
