package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class fillShippingDetailsForCheckout {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on input Email"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_Email'))
        
        "Step 2: Enter input value in input Email"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_Email'), data['input_Email'])
        
        "Step 3: Click on button ContinueToShipping -> Navigate to page 'checkout#checkout/shipping-address'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_ContinueToShipping'))
        
        "Step 4: Click on input FirstName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_FirstName'))
        
        "Step 5: Enter input value in input FirstName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_FirstName'), data['input_FirstName'])
        
        "Step 6: Click on input LastName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_LastName'))
        
        "Step 7: Enter input value in input LastName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_LastName'), data['input_LastName'])
        
        "Step 8: Click on input Address"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_Address'))
        
        "Step 9: Enter input value in input Address"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_Address'), data['input_Address'])
        
        "Step 10: Click on input ZipCode"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_ZipCode'))
        
        "Step 11: Enter input value in input ZipCode"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_ZipCode'), data['input_ZipCode'])
        
        "Step 12: Click on input City"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_City'))
        
        "Step 13: Enter input value in input City"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_City'), data['input_City'])
        
        "Step 14: Click on input State"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_State'))
        
        "Step 15: Enter input value in input State"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_State'), data['input_State'])
        
        "Step 16: Click on input Phone"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_Phone'))
        
        "Step 17: Enter input value in input Phone"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_Phone'), data['input_Phone'])
        
        "Step 18: Click on button ContinueToPayment"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_ContinueToPayment'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_Address'] = testData.getValue('input_Address', rowIndex)
        data['input_City'] = testData.getValue('input_City', rowIndex)
        data['input_Email'] = testData.getValue('input_Email', rowIndex)
        data['input_FirstName'] = testData.getValue('input_FirstName', rowIndex)
        data['input_LastName'] = testData.getValue('input_LastName', rowIndex)
        data['input_Phone'] = testData.getValue('input_Phone', rowIndex)
        data['input_State'] = testData.getValue('input_State', rowIndex)
        data['input_ZipCode'] = testData.getValue('input_ZipCode', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_Address'] = 'default_data'
        data['input_City'] = 'default_data'
        data['input_Email'] = 'default_data'
        data['input_FirstName'] = 'default_data'
        data['input_LastName'] = 'default_data'
        data['input_Phone'] = 'default_data'
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

