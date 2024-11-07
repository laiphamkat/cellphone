package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class completeShippingInfoAndProceedToPayment {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Enter input value in input City"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_City'), data['input_City'])
        
        "Step 2: Click on input State"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_State'))
        
        "Step 3: Hover over div CheckoutShippingAddress2"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_CheckoutShippingAddress2'))
        
        "Step 4: Enter input value in input State"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_State'), data['input_State'])
        
        "Step 5: Click on input Phone"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_Phone'))
        
        "Step 6: Enter input value in input Phone"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_Phone'), data['input_Phone'])
        
        "Step 7: Click on button ContinueToPayment -> Navigate to page 'checkout/payment'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/button_ContinueToPayment'))
        
        "Step 8: Click on button CompleteOrder"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_CompleteOrder'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_City'] = testData.getValue('input_City', rowIndex)
        data['input_Phone'] = testData.getValue('input_Phone', rowIndex)
        data['input_State'] = testData.getValue('input_State', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_City'] = 'default_data'
        data['input_Phone'] = 'default_data'
        data['input_State'] = 'default_data'
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

