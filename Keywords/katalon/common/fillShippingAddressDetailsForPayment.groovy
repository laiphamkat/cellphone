package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class fillShippingAddressDetailsForPayment {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Hover over div muiInputBaseRoot"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiInputBaseRoot'))
        
        "Step 2: Click on input firstName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_firstName'))
        
        "Step 3: Hover over div muiFormControlRoot"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControlRoot'))
        
        "Step 4: Enter input value in input firstName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_firstName'), data['var_1_input_firstName'])
        
        "Step 5: Click on input lastName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_lastName'))
        
        "Step 6: Hover over div muiFormControlRoot"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControlRoot_1'))
        
        "Step 7: Enter input value in input lastName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_lastName'), data['var_2_input_lastName'])
        
        "Step 8: Click on input address"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_address'))
        
        "Step 9: Hover over div muiFormControlRoot"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControlRoot_2'))
        
        "Step 10: Enter input value in input address"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_address'), data['var_3_input_address'])
        
        "Step 11: Click on input zipcode"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_zipcode'))
        
        "Step 12: Hover over div muiFormControlRoot"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControlRoot_3'))
        
        "Step 13: Enter input value in input zipcode"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_zipcode'), data['var_4_input_zipcode'])
        
        "Step 14: Click on input city"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_city'))
        
        "Step 15: Hover over div muiFormControlRoot"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControlRoot_4'))
        
        "Step 16: Enter input value in input city"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_city'), data['var_5_input_city'])
        
        "Step 17: Click on textbox shippingAddressState"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/textbox_shippingAddressState'))
        
        "Step 18: Hover over div muiFormControlRoot"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControlRoot_5'))
        
        "Step 19: Enter input value in textbox shippingAddressState"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/textbox_shippingAddressState'), data['var_6_textbox_shippingAddressState'])
        
        "Step 20: Click on textbox shippingAddressPhone"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/textbox_shippingAddressPhone'))
        
        "Step 21: Enter input value in textbox shippingAddressPhone"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/textbox_shippingAddressPhone'), data['var_7_textbox_shippingAddressPhone'])
        
        "Step 22: Click on button continueToPayment"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/button_continueToPayment'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['var_1_input_firstName'] = testData.getValue('var_1_input_firstName', rowIndex)
        data['var_4_input_zipcode'] = testData.getValue('var_4_input_zipcode', rowIndex)
        data['var_3_input_address'] = testData.getValue('var_3_input_address', rowIndex)
        data['var_5_input_city'] = testData.getValue('var_5_input_city', rowIndex)
        data['var_2_input_lastName'] = testData.getValue('var_2_input_lastName', rowIndex)
        data['var_7_textbox_shippingAddressPhone'] = testData.getValue('var_7_textbox_shippingAddressPhone', rowIndex)
        data['var_6_textbox_shippingAddressState'] = testData.getValue('var_6_textbox_shippingAddressState', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['var_1_input_firstName'] = 'default_data'
        data['var_4_input_zipcode'] = 'default_data'
        data['var_3_input_address'] = 'default_data'
        data['var_5_input_city'] = 'default_data'
        data['var_2_input_lastName'] = 'default_data'
        data['var_7_textbox_shippingAddressPhone'] = 'default_data'
        data['var_6_textbox_shippingAddressState'] = 'default_data'
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

