package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class enterShippingDetailsAndContinueToPayment {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Hover over div checkoutShippingAddress"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_checkoutShippingAddress'))
        
        "Step 2: Click on input FirstName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_FirstName'))
        
        "Step 3: Hover over div checkoutShippingAddress2"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_checkoutShippingAddress2'))
        
        "Step 4: Enter input value in input FirstName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_FirstName'), data['input_FirstName'])
        
        "Step 5: Click on input LastName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_LastName'))
        
        "Step 6: Hover over div checkoutShippingAddress3"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_checkoutShippingAddress3'))
        
        "Step 7: Enter input value in input LastName2"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_LastName'), data['input_LastName2'])
        
        "Step 8: Click on input Address"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_Address'))
        
        "Step 9: Hover over div checkoutShippingAddress4"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_checkoutShippingAddress4'))
        
        "Step 10: Enter input value in input Address2"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_Address'), data['input_Address2'])
        
        "Step 11: Click on input ZipCode"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_ZipCode'))
        
        "Step 12: Hover over div checkoutShippingAddress5"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_checkoutShippingAddress5'))
        
        "Step 13: Enter input value in input ZipCode2"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_ZipCode'), data['input_ZipCode2'])
        
        "Step 14: Click on input City"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_City'))
        
        "Step 15: Hover over div checkoutShippingAddress6"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_checkoutShippingAddress6'))
        
        "Step 16: Click on input State"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_State'))
        
        "Step 17: Enter input value in input City2"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_City'), data['input_City2'])
        
        "Step 18: Hover over div checkoutShippingAddress7"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_checkoutShippingAddress7'))
        
        "Step 19: Enter input value in input State2"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_State'), data['input_State2'])
        
        "Step 20: Click on input Phone"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_Phone'))
        
        "Step 21: Enter input value in input Phone2"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_Phone'), data['input_Phone2'])
        
        "Step 22: Click on button ContinueToPayment"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/button_ContinueToPayment'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_Address2'] = testData.getValue('input_Address2', rowIndex)
        data['input_City2'] = testData.getValue('input_City2', rowIndex)
        data['input_FirstName'] = testData.getValue('input_FirstName', rowIndex)
        data['input_LastName2'] = testData.getValue('input_LastName2', rowIndex)
        data['input_Phone2'] = testData.getValue('input_Phone2', rowIndex)
        data['input_State2'] = testData.getValue('input_State2', rowIndex)
        data['input_ZipCode2'] = testData.getValue('input_ZipCode2', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_Address2'] = 'default_data'
        data['input_City2'] = 'default_data'
        data['input_FirstName'] = 'default_data'
        data['input_LastName2'] = 'default_data'
        data['input_Phone2'] = 'default_data'
        data['input_State2'] = 'default_data'
        data['input_ZipCode2'] = 'default_data'
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

