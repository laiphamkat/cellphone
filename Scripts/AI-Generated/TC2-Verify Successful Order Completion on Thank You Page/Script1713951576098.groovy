import katalon.common.enterShippingDetailsAndCompleteOrder
import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.common.clickObjectsToBuyAndProceedToCheckout

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://cellphone-staging.aut.katalon.com/"

TrueTestScripts.navigate('/')

"Step 2: Click objects to buy items and proceed to checkout"

WebUI.takeScreenshot()

clickObjectsToBuyAndProceedToCheckout.execute()

"Step 3: Enter shipping details and complete order"

WebUI.takeScreenshot()

enterShippingDetailsAndCompleteOrder.execute(data_path_0, Integer.valueOf(index_0))

"Step 4: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Verify Successful Order Completion on Thank You Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
