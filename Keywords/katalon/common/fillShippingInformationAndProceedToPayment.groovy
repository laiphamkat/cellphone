package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class fillShippingInformationAndProceedToPayment {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Hover over div inputBase"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_inputBase'))
        
        "Step 2: Click on input firstName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_firstName'))
        
        "Step 3: Hover over div inputBase2"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_inputBase2'))
        
        "Step 4: Enter input value in input firstName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_firstName'), data['input_firstName'])
        
        "Step 5: Click on input lastName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_lastName'))
        
        "Step 6: Hover over div inputBase3"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_inputBase3'))
        
        "Step 7: Enter input value in input lastName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_lastName'), data['input_lastName'])
        
        "Step 8: Click on input address"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_address'))
        
        "Step 9: Hover over div inputBase4"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_inputBase4'))
        
        "Step 10: Enter input value in input address"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_address'), data['input_address'])
        
        "Step 11: Click on input zipCode"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_zipCode'))
        
        "Step 12: Hover over div inputBase5"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_inputBase5'))
        
        "Step 13: Enter input value in input zipCode"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_zipCode'), data['input_zipCode'])
        
        "Step 14: Click on input city"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_city'))
        
        "Step 15: Hover over div inputBase6"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_inputBase6'))
        
        "Step 16: Enter input value in input city"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_city'), data['input_city'])
        
        "Step 17: Click on input state"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_state'))
        
        "Step 18: Hover over div inputBase7"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_inputBase7'))
        
        "Step 19: Enter input value in input state"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_state'), data['input_state'])
        
        "Step 20: Click on input phone"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_phone'))
        
        "Step 21: Enter input value in input phone"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_phone'), data['input_phone'])
        
        "Step 22: Click on button continueToPayment"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/button_continueToPayment'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_address'] = testData.getValue('input_address', rowIndex)
        data['input_city'] = testData.getValue('input_city', rowIndex)
        data['input_firstName'] = testData.getValue('input_firstName', rowIndex)
        data['input_lastName'] = testData.getValue('input_lastName', rowIndex)
        data['input_phone'] = testData.getValue('input_phone', rowIndex)
        data['input_state'] = testData.getValue('input_state', rowIndex)
        data['input_zipCode'] = testData.getValue('input_zipCode', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_address'] = 'default_data'
        data['input_city'] = 'default_data'
        data['input_firstName'] = 'default_data'
        data['input_lastName'] = 'default_data'
        data['input_phone'] = 'default_data'
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

