package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class subscribeEmailAndFillShippingDetails {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Hover over div emailMeWithNews"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_info/div_emailMeWithNews'))
        
        "Step 2: Click on input email"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_email'))
        
        "Step 3: Enter input value in input email"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_email'), data['var_1_input_email'])
        
        "Step 4: Click on button continueToShipping -> Navigate to page 'checkout/*'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_continueToShipping'))
        
        "Step 5: Hover over div muiInputBaseRoot"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_muiInputBaseRoot'))
        
        "Step 6: Click on input firstName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_firstName'))
        
        "Step 7: Hover over div muiFormControlRoot"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_muiFormControlRoot'))
        
        "Step 8: Enter input value in input firstName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_firstName'), data['var_2_input_firstName'])
        
        "Step 9: Click on input lastName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_lastName'))
        
        "Step 10: Hover over div muiFormControlRoot"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_muiFormControlRoot_1'))
        
        "Step 11: Enter input value in input lastName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_lastName'), data['var_3_input_lastName'])
        
        "Step 12: Click on input address"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_address'))
        
        "Step 13: Hover over div muiFormControlRoot"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_muiFormControlRoot_2'))
        
        "Step 14: Enter input value in input address"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_address'), data['var_4_input_address'])
        
        "Step 15: Click on input zipcode"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_zipcode'))
        
        "Step 16: Hover over div muiFormControlRoot"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_muiFormControlRoot_3'))
        
        "Step 17: Enter input value in input zipcode"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_zipcode'), data['var_5_input_zipcode'])
        
        "Step 18: Click on input city"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_city'))
        
        "Step 19: Hover over div muiFormControlRoot"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_muiFormControlRoot_4'))
        
        "Step 20: Enter input value in input city"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_city'), data['var_6_input_city'])
        
        "Step 21: Click on textbox shippingAddressState"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/textbox_shippingAddressState'))
        
        "Step 22: Hover over div muiFormControlRoot"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_muiFormControlRoot_5'))
        
        "Step 23: Enter input value in textbox shippingAddressState"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/textbox_shippingAddressState'), data['var_7_textbox_shippingAddressState'])
        
        "Step 24: Click on textbox shippingAddressPhone"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/textbox_shippingAddressPhone'))
        
        "Step 25: Hover over div muiInputBaseRoot"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_muiInputBaseRoot'))
        
        "Step 26: Enter input value in textbox shippingAddressPhone"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/textbox_shippingAddressPhone'), data['var_8_textbox_shippingAddressPhone'])
        
        "Step 27: Click on input firstName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_firstName'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['var_1_input_email'] = testData.getValue('var_1_input_email', rowIndex)
        data['var_2_input_firstName'] = testData.getValue('var_2_input_firstName', rowIndex)
        data['var_3_input_lastName'] = testData.getValue('var_3_input_lastName', rowIndex)
        data['var_4_input_address'] = testData.getValue('var_4_input_address', rowIndex)
        data['var_5_input_zipcode'] = testData.getValue('var_5_input_zipcode', rowIndex)
        data['var_6_input_city'] = testData.getValue('var_6_input_city', rowIndex)
        data['var_7_textbox_shippingAddressState'] = testData.getValue('var_7_textbox_shippingAddressState', rowIndex)
        data['var_8_textbox_shippingAddressPhone'] = testData.getValue('var_8_textbox_shippingAddressPhone', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['var_1_input_email'] = 'default_data'
        data['var_2_input_firstName'] = 'default_data'
        data['var_3_input_lastName'] = 'default_data'
        data['var_4_input_address'] = 'default_data'
        data['var_5_input_zipcode'] = 'default_data'
        data['var_6_input_city'] = 'default_data'
        data['var_7_textbox_shippingAddressState'] = 'default_data'
        data['var_8_textbox_shippingAddressPhone'] = 'default_data'
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

