package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class selectStorageAndColorProceedToCheckout {
    
    private static def execute_functional_method(Map data) {
        "Step 1: Click on label 512Gb"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/label_512Gb'))
        "Step 2: Click on label yellow"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/label_yellow'))
        "Step 3: Click on button buy"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_buy'))
        "Step 4: Click on link goToCart -> Navigate to page 'cart'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_goToCart'))
        "Step 5: Click on button proceedToCheckout -> Navigate to page 'checkout/info'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))
        "Step 6: Hover over div emailMeWithNews"
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_info/div_emailMeWithNews'))
        "Step 7: Click on input email"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_email'))
        "Step 8: Enter input value in input email"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_email'), data['input_email'])
        "Step 9: Click on button continueToShipping"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_continueToShipping'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_email'] = testData.getValue('input_email', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_email'] = 'default_data'
        execute_functional_method(data)
    }
    
    public static def execute(String datasource = null, int rowIndex = 1) {
        if (datasource != null) {
            execute_with_data_source(datasource, rowIndex)
        } else {
            execute_without_data_source()
        }
    }
}

