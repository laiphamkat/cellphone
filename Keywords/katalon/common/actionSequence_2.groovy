package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class actionSequence_2 {
    
    private static def execute_functional_method(Map data) {
        "Step 2: Click on link 'iPhone 15' -> Navigate to page 'product/*'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_iPhone15'))
        "Step 3: Click on label"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_128Gb'))
        "Step 4: Click on label"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_blue'))
        "Step 5: Click on svg"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/svg_increased'))
        "Step 6: Click on button 'Buy'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy'))
        "Step 7: Click on link 'Place an order' -> Navigate to page 'cart'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_placeAnOrder'))
        "Step 8: Click on button '+'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_i'))
        "Step 9: Click on button 'Proceed to checkout' -> Navigate to page 'checkout/info'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))
        "Step 10: Click on input field 'email'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_email'))
        "Step 11: Enter input value in input field 'email'"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_email'), data['input_email'])
        "Step 12: Click on input field 'receive marketing info'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/checkbox_receiveMarketingInfo'))
        "Step 13: Click on button 'CONTINUE TO SHIPPING'"
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

