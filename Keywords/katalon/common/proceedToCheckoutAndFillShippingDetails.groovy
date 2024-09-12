package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class proceedToCheckoutAndFillShippingDetails {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button proceedToCheckout -> Navigate to page 'checkout/info'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))
        
        "Step 2: Click on input email"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_email'))
        
        "Step 3: Enter input value in input email"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_email'), data['input_email'])
        
        "Step 4: Click on button continueToShipping -> Navigate to page 'checkout/shipping-address'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_continueToShipping'))
        
        "Step 5: Click on input email"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_email'))
        
        "Step 6: Enter input value in button continueToShipping"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/button_continueToShipping'), data['button_continueToShipping'])
        
        "Step 7: Click on input firstName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_firstName'))
        
        "Step 8: Enter input value in input firstName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_firstName'), data['input_firstName'])
        
        "Step 9: Click on input lastName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_lastName'))
        
        "Step 10: Enter input value in input lastName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_lastName'), data['input_lastName'])
        
        "Step 11: Click on input address"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_address'))
        
        "Step 12: Enter input value in input address"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_address'), data['input_address'])
        
        "Step 13: Click on input zipCode"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_zipCode'))
        
        "Step 14: Enter input value in input zipCode"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_zipCode'), data['input_zipCode'])
        
        "Step 15: Click on input city"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_city'))
        
        "Step 16: Enter input value in input city"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_city'), data['input_city'])
        
        "Step 17: Click on input state"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_state'))
        
        "Step 18: Enter input value in input state"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_state'), data['input_state'])
        
        "Step 19: Click on input phone -> Navigate to page 'checkout/payment'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_phone'))
        
        "Step 20: Click on button continueToShipping"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_continueToShipping'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['button_continueToShipping'] = testData.getValue('button_continueToShipping', rowIndex)
        data['input_address'] = testData.getValue('input_address', rowIndex)
        data['input_city'] = testData.getValue('input_city', rowIndex)
        data['input_email'] = testData.getValue('input_email', rowIndex)
        data['input_firstName'] = testData.getValue('input_firstName', rowIndex)
        data['input_lastName'] = testData.getValue('input_lastName', rowIndex)
        data['input_state'] = testData.getValue('input_state', rowIndex)
        data['input_zipCode'] = testData.getValue('input_zipCode', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_continueToShipping'] = 'default_data'
        data['input_address'] = 'default_data'
        data['input_city'] = 'default_data'
        data['input_email'] = 'default_data'
        data['input_firstName'] = 'default_data'
        data['input_lastName'] = 'default_data'
        data['input_state'] = 'default_data'
        data['input_zipCode'] = 'default_data'
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

