package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class fillShippingInfoAndProceedToCheckoutConfirmation {
    
    private static def execute_functional_method(Map data) {
        "Step 2: Click on button 'checkout' -> Navigate to page 'checkout-step-one.html'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart_html/button_checkout'))
        "Step 3: Click on input field 'firstName'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step_one_html/input_firstName'))
        "Step 4: Enter input value in input field 'firstName'"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_step_one_html/input_firstName'), data['input_firstname'])
        "Step 5: Click on input field 'lastName'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step_one_html/input_lastName'))
        "Step 6: Enter input value in input field 'lastName'"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_step_one_html/input_lastName'), data['input_lastname'])
        "Step 7: Click on input field 'postalCode'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step_one_html/input_postalCode'))
        "Step 8: Enter input value in input field 'postalCode'"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_step_one_html/input_postalCode'), data['input_postalcode'])
        "Step 9: Click on input field 'continue'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step_one_html/input_continue'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_firstname'] = testData.getValue('input_firstname', rowIndex)
        data['input_lastname'] = testData.getValue('input_lastname', rowIndex)
        data['input_postalcode'] = testData.getValue('input_postalcode', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_firstname'] = 'default_data'
        data['input_lastname'] = 'default_data'
        data['input_postalcode'] = 'default_data'
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

