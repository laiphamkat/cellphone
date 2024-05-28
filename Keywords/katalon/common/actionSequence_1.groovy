package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class actionSequence_1 {
    
    private static def execute_functional_method(Map data) {
        "Step 2: Click on input field 'delivery id'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/radio_usshipping490'))
        "Step 3: Click on input field 'shipping address.first name'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/textbox_shippingAddressFirstName'))
        "Step 4: Enter input value in input field 'shipping address.first name'"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/textbox_shippingAddressFirstName'), data['input_shipping_address_first_name'])
        "Step 5: Click on input field 'shipping address.last name'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/textbox_shippingAddressLastName'))
        "Step 6: Enter input value in input field 'shipping address.last name'"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/textbox_shippingAddressLastName'), data['input_shipping_address_last_name'])
        "Step 7: Click on input field 'shipping address.address line 1'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/textbox_shippingAddressLine1'))
        "Step 8: Enter input value in input field 'shipping address.address line 1'"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/textbox_shippingAddressLine1'), data['input_shipping_address_address_line_1'])
        "Step 9: Click on input field 'shipping address.zip'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/textbox_shippingAddressZipcode'))
        "Step 10: Enter input value in input field 'shipping address.zip'"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/textbox_shippingAddressZipcode'), data['input_shipping_address_zip'])
        "Step 11: Click on input field 'shipping address.city'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/textbox_shippingAddressCity'))
        "Step 12: Enter input value in input field 'shipping address.city'"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/textbox_shippingAddressCity'), data['input_shipping_address_city'])
        "Step 13: Click on input field 'shipping address.state'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/textbox_shippingAddressState'))
        "Step 14: Enter input value in input field 'shipping address.state'"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/textbox_shippingAddressState'), data['input_shipping_address_state'])
        "Step 15: Click on input field 'shipping address.phone'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/textbox_shippingAddressPhone'))
        "Step 16: Enter input value in input field 'shipping address.phone'"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/textbox_shippingAddressPhone'), data['input_shipping_address_phone'])
        "Step 17: Click on button 'CONTINUE TO PAYMENT'"
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

