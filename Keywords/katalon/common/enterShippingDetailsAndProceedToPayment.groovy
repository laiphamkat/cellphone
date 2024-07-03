package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class enterShippingDetailsAndProceedToPayment {
    
    private static def execute_functional_method(Map data) {
        "Step 1: Click on radio usshipping490"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/radio_usshipping490'))
        "Step 2: Hover over div element"
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_element'))
        "Step 3: Click on input shippingAddressFirstName"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressFirstName'))
        "Step 4: Hover over div muiFormControlRoot"
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControlRoot'))
        "Step 5: Enter input value in input shippingAddressFirstName"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressFirstName'), data['input_shipping_address_first_name'])
        "Step 6: Click on input lastName"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_lastName'))
        "Step 7: Hover over div muiFormControlRoot"
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControlRoot_1'))
        "Step 8: Enter input value in input lastName"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_lastName'), data['input_shipping_address_last_name'])
        "Step 9: Click on input address"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_address'))
        "Step 10: Hover over div muiFormControlRoot"
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControlRoot_2'))
        "Step 11: Enter input value in input address"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_address'), data['input_shipping_address_address_line_1'])
        "Step 12: Click on input zipCode"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_zipCode'))
        "Step 13: Hover over div muiFormControlRoot"
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControlRoot_3'))
        "Step 14: Enter input value in input zipCode"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_zipCode'), data['input_shipping_address_zip'])
        "Step 15: Click on input city"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_city'))
        "Step 16: Hover over div muiFormControlRoot"
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControlRoot_4'))
        "Step 17: Enter input value in input city"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_city'), data['input_shipping_address_city'])
        "Step 18: Click on input state"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_state'))
        "Step 19: Hover over div muiFormControlRoot"
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControlRoot_5'))
        "Step 20: Enter input value in input state"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_state'), data['input_shipping_address_state'])
        "Step 21: Click on input shippingAddressPhone"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressPhone'))
        "Step 22: Enter input value in input shippingAddressPhone"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressPhone'), data['input_shipping_address_phone'])
        "Step 23: Click on button continueToPayment"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/button_continueToPayment'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_shipping_address_first_name'] = testData.getValue('input_shipping_address_first_name', rowIndex)
        data['input_shipping_address_last_name'] = testData.getValue('input_shipping_address_last_name', rowIndex)
        data['input_shipping_address_address_line_1'] = testData.getValue('input_shipping_address_address_line_1', rowIndex)
        data['input_shipping_address_zip'] = testData.getValue('input_shipping_address_zip', rowIndex)
        data['input_shipping_address_city'] = testData.getValue('input_shipping_address_city', rowIndex)
        data['input_shipping_address_state'] = testData.getValue('input_shipping_address_state', rowIndex)
        data['input_shipping_address_phone'] = testData.getValue('input_shipping_address_phone', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_shipping_address_first_name'] = 'default_data'
        data['input_shipping_address_last_name'] = 'default_data'
        data['input_shipping_address_address_line_1'] = 'default_data'
        data['input_shipping_address_zip'] = 'default_data'
        data['input_shipping_address_city'] = 'default_data'
        data['input_shipping_address_state'] = 'default_data'
        data['input_shipping_address_phone'] = 'default_data'
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

