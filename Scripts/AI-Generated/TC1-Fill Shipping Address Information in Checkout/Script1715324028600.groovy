import katalon.common.fillShippingAddressInformation
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://cellphone-staging.aut.katalon.com/checkout/info"

TrueTestScripts.navigate('/checkout/info')

"Step 2: Fill shipping address information"

WebUI.takeScreenshot()

fillShippingAddressInformation.execute(data_path_0, Integer.valueOf(index_0))

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
