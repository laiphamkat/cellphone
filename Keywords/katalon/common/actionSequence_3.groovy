package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class actionSequence_3 {
    
    private static def execute_functional_method(Map data) {
        "Step 2: Hover over div"
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiInputBaseRoot'))
        "Step 3: Click on input field 'shipping address.first name'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/textbox_shippingAddressFirstName'))
        "Step 4: Hover over div"
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControlRoot'))
        "Step 5: Enter input value in input field 'shipping address.first name'"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/textbox_shippingAddressFirstName'), data['input_shipping_address_first_name'])
        "Step 6: Click on input field 'shipping address.last name'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/textbox_shippingAddressLastName'))
        "Step 7: Hover over div"
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControlRoot_1'))
        "Step 8: Enter input value in input field 'shipping address.last name'"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/textbox_shippingAddressLastName'), data['input_shipping_address_last_name'])
        "Step 9: Click on input field 'shipping address.address line 1'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/textbox_shippingAddressLine1'))
        "Step 10: Hover over div"
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControlRoot_2'))
        "Step 11: Enter input value in input field 'shipping address.address line 1'"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/textbox_shippingAddressLine1'), data['input_shipping_address_address_line_1'])
        "Step 12: Click on input field 'shipping address.zip'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/textbox_shippingAddressZipcode'))
        "Step 13: Hover over div"
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControlRoot_3'))
        "Step 14: Enter input value in input field 'shipping address.zip'"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/textbox_shippingAddressZipcode'), data['input_shipping_address_zip'])
        "Step 15: Click on input field 'shipping address.city'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/textbox_shippingAddressCity'))
        "Step 16: Hover over div"
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControlRoot_4'))
        "Step 17: Enter input value in input field 'shipping address.city'"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/textbox_shippingAddressCity'), data['input_shipping_address_city'])
        "Step 18: Click on input field 'shipping address.state'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/textbox_shippingAddressState'))
        "Step 19: Hover over div"
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControlRoot_5'))
        "Step 20: Enter input value in input field 'shipping address.state'"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/textbox_shippingAddressState'), data['input_shipping_address_state'])
        "Step 21: Click on input field 'shipping address.phone'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/textbox_shippingAddressPhone'))
        "Step 22: Enter input value in input field 'shipping address.phone'"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/textbox_shippingAddressPhone'), data['input_shipping_address_phone'])
        "Step 23: Click on div"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/div_deliveryInformationUs'))
        "Step 24: Enter input value in input field 'shipping address.state'"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/textbox_shippingAddressState'), data['input_shipping_address_state_1'])
        "Step 25: Click on main"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/main_roleMain'))
        "Step 26: Hover over div"
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControlRoot_4'))
        "Step 27: Click on input field 'shipping address.state'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/textbox_shippingAddressState'))
        "Step 28: Hover over div"
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControlRoot_5'))
        "Step 29: Enter input value in input field 'shipping address.state'"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/textbox_shippingAddressState'), data['input_shipping_address_state_2'])
        "Step 30: Click on input field 'shipping address.phone'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/textbox_shippingAddressPhone'))
        "Step 31: Click on div"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/div_firstNameLastName'))
        "Step 32: Enter input value in input field 'shipping address.city'"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/textbox_shippingAddressCity'), data['input_shipping_address_city_1'])
        "Step 33: Click on main"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/main_roleMain'))
        "Step 34: Hover over div"
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControlRoot_3'))
        "Step 35: Click on input field 'shipping address.city'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/textbox_shippingAddressCity'))
        "Step 36: Enter input value in input field 'shipping address.city'"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/textbox_shippingAddressCity'), data['input_shipping_address_city_2'])
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
        data['input_shipping_address_state_1'] = testData.getValue('input_shipping_address_state_1', rowIndex)
        data['input_shipping_address_state_2'] = testData.getValue('input_shipping_address_state_2', rowIndex)
        data['input_shipping_address_city_1'] = testData.getValue('input_shipping_address_city_1', rowIndex)
        data['input_shipping_address_city_2'] = testData.getValue('input_shipping_address_city_2', rowIndex)
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
        data['input_shipping_address_state_1'] = 'default_data'
        data['input_shipping_address_state_2'] = 'default_data'
        data['input_shipping_address_city_1'] = 'default_data'
        data['input_shipping_address_city_2'] = 'default_data'
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

