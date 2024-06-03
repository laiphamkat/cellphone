package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class fillShippingAddressAndProceedToPayment {
    
    private static def execute_functional_method(Map data) {
        "Step 1: Hover over div"
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiInputBaseRoot'))
        "Step 2: Click on input field 'shipping address.first name'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_firstName'))
        "Step 3: Hover over div"
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControlRoot'))
        "Step 4: Enter input value in input field 'shipping address.first name'"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_firstName'), data['input_shipping_address_first_name'])
        "Step 5: Click on input field 'shipping address.last name'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_lastName'))
        "Step 6: Hover over div"
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControlRoot_1'))
        "Step 7: Enter input value in input field 'shipping address.last name'"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_lastName'), data['input_shipping_address_last_name'])
        "Step 8: Click on input field 'shipping address.address line 1'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_address'))
        "Step 9: Hover over div"
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControlRoot_2'))
        "Step 10: Enter input value in input field 'shipping address.address line 1'"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_address'), data['input_shipping_address_address_line_1'])
        "Step 11: Click on input field 'shipping address.zip'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_zipcode'))
        "Step 12: Hover over div"
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControlRoot_3'))
        "Step 13: Enter input value in input field 'shipping address.zip'"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_zipcode'), data['input_shipping_address_zip'])
        "Step 14: Click on input field 'shipping address.city'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_city'))
        "Step 15: Hover over div"
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControlRoot_4'))
        "Step 16: Enter input value in input field 'shipping address.city'"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_city'), data['input_shipping_address_city'])
        "Step 17: Click on input field 'shipping address.state'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/textbox_shippingAddressState'))
        "Step 18: Hover over div"
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControlRoot_5'))
        "Step 19: Enter input value in input field 'shipping address.state'"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/textbox_shippingAddressState'), data['input_shipping_address_state'])
        "Step 20: Click on input field 'shipping address.phone'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/textbox_shippingAddressPhone'))
        "Step 21: Enter input value in input field 'shipping address.phone'"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/textbox_shippingAddressPhone'), data['input_shipping_address_phone'])
        "Step 22: Click on button 'CONTINUE TO PAYMENT'"
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

