package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class fillShippingInformationAndProceedToPayment {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Hover over div CheckoutInfo"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_info/div_CheckoutInfo'))
        
        "Step 2: Click on input Email"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_Email'))
        
        "Step 3: Enter input value in input Email"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_Email'), data['input_Email'])
        
        "Step 4: Click on button ContinueToShipping -> Navigate to page 'checkout/shipping-address'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_ContinueToShipping'))
        
        "Step 5: Hover over div CheckoutShippingAddress"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_CheckoutShippingAddress'))
        
        "Step 6: Click on input FirstName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_FirstName'))
        
        "Step 7: Hover over div CheckoutShippingAddress3"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_CheckoutShippingAddress3'))
        
        "Step 8: Enter input value in input FirstName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_FirstName'), data['input_FirstName'])
        
        "Step 9: Click on input Address"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_Address'))
        
        "Step 10: Hover over div CheckoutShippingAddress4"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_CheckoutShippingAddress4'))
        
        "Step 11: Enter input value in input Address"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_Address'), data['input_Address'])
        
        "Step 12: Click on input ZipCode"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_ZipCode'))
        
        "Step 13: Hover over div CheckoutShippingAddress5"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_CheckoutShippingAddress5'))
        
        "Step 14: Enter input value in input ZipCode"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_ZipCode'), data['input_ZipCode'])
        
        "Step 15: Click on input ShippingCity"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_ShippingCity'))
        
        "Step 16: Hover over div CheckoutShippingAddress2"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_CheckoutShippingAddress2'))
        
        "Step 17: Enter input value in input ShippingCity"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_ShippingCity'), data['input_ShippingCity'])
        
        "Step 18: Click on input LastName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_LastName'))
        
        "Step 19: Hover over div CheckoutShippingAddress6"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_CheckoutShippingAddress6'))
        
        "Step 20: Enter input value in input LastName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_LastName'), data['input_LastName'])
        
        "Step 21: Click on input State"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_State'))
        
        "Step 22: Hover over div CheckoutShippingAddress7"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_CheckoutShippingAddress7'))
        
        "Step 23: Enter input value in input State"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_State'), data['input_State'])
        
        "Step 24: Click on input Phone"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_Phone'))
        
        "Step 25: Enter input value in input Phone"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_Phone'), data['input_Phone'])
        
        "Step 26: Click on button ContinueToPayment"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/button_ContinueToPayment'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_Address'] = testData.getValue('input_Address', rowIndex)
        data['input_Email'] = testData.getValue('input_Email', rowIndex)
        data['input_FirstName'] = testData.getValue('input_FirstName', rowIndex)
        data['input_LastName'] = testData.getValue('input_LastName', rowIndex)
        data['input_Phone'] = testData.getValue('input_Phone', rowIndex)
        data['input_ShippingCity'] = testData.getValue('input_ShippingCity', rowIndex)
        data['input_State'] = testData.getValue('input_State', rowIndex)
        data['input_ZipCode'] = testData.getValue('input_ZipCode', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_Address'] = 'default_data'
        data['input_Email'] = 'default_data'
        data['input_FirstName'] = 'default_data'
        data['input_LastName'] = 'default_data'
        data['input_Phone'] = 'default_data'
        data['input_ShippingCity'] = 'default_data'
        data['input_State'] = 'default_data'
        data['input_ZipCode'] = 'default_data'
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

