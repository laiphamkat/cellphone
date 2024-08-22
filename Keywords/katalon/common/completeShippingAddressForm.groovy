package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class completeShippingAddressForm {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Hover over div emailMeWithNews"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_info/div_emailMeWithNews'))
        
        "Step 2: Click on input email"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_email'))
        
        "Step 3: Enter input value in input email"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_email'), data['input_email'])
        
        "Step 4: Click on button continueToShipping -> Navigate to page '/checkout/shipping-address'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_continueToShipping'))
        
        "Step 5: Hover over div muiInputBaseRoot"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiInputBaseRoot'))
        
        "Step 6: Click on input firstName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_firstName'))
        
        "Step 7: Hover over div muiFormControlRoot"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControlRoot'))
        
        "Step 8: Enter input value in input firstName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_firstName'), data['input_firstName'])
        
        "Step 9: Click on input lastName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_lastName'))
        
        "Step 10: Hover over div muiFormControlRoot"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControlRoot_1'))
        
        "Step 11: Enter input value in input lastName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_lastName'), data['input_lastName'])
        
        "Step 12: Click on input address"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_address'))
        
        "Step 13: Hover over div muiFormControlRoot"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControlRoot_2'))
        
        "Step 14: Enter input value in input address"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_address'), data['input_address'])
        
        "Step 15: Click on input zipcode"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_zipcode'))
        
        "Step 16: Hover over div muiFormControlRoot"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControlRoot_3'))
        
        "Step 17: Enter input value in input zipcode"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_zipcode'), data['input_zipcode'])
        
        "Step 18: Click on input city"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_city'))
        
        "Step 19: Hover over div muiFormControlRoot"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControlRoot_4'))
        
        "Step 20: Enter input value in input city"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_city'), data['input_city'])
        
        "Step 21: Click on textbox shippingAddressState"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/textbox_shippingAddressState'))
        
        "Step 22: Hover over div muiFormControlRoot"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControlRoot_5'))
        
        "Step 23: Enter input value in textbox shippingAddressState"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/textbox_shippingAddressState'), data['textbox_shippingAddressState'])
        
        "Step 24: Click on textbox shippingAddressPhone"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/textbox_shippingAddressPhone'))
        
        "Step 25: Hover over div muiInputBaseRoot"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiInputBaseRoot'))
        
        "Step 26: Enter input value in textbox shippingAddressPhone"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/textbox_shippingAddressPhone'), data['textbox_shippingAddressPhone'])
        
        "Step 27: Click on input firstName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_firstName'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_address'] = testData.getValue('input_address', rowIndex)
        data['input_city'] = testData.getValue('input_city', rowIndex)
        data['input_email'] = testData.getValue('input_email', rowIndex)
        data['input_firstName'] = testData.getValue('input_firstName', rowIndex)
        data['input_lastName'] = testData.getValue('input_lastName', rowIndex)
        data['input_zipcode'] = testData.getValue('input_zipcode', rowIndex)
        data['textbox_shippingAddressPhone'] = testData.getValue('textbox_shippingAddressPhone', rowIndex)
        data['textbox_shippingAddressState'] = testData.getValue('textbox_shippingAddressState', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_address'] = 'default_data'
        data['input_city'] = 'default_data'
        data['input_email'] = 'default_data'
        data['input_firstName'] = 'default_data'
        data['input_lastName'] = 'default_data'
        data['input_zipcode'] = 'default_data'
        data['textbox_shippingAddressPhone'] = 'default_data'
        data['textbox_shippingAddressState'] = 'default_data'
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

