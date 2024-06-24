package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class fillUserInformationAndProceedToCheckout {
    
    private static def execute_functional_method(Map data) {
        "Step 1: Click on button checkout -> Navigate to page 'checkout-step-one.html'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart_html/button_checkout'))
        "Step 2: Click on input firstName"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step_one_html/input_firstName'))
        "Step 3: Enter input value in input firstName"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_step_one_html/input_firstName'), data['input_firstname'])
        "Step 4: Click on input lastName"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step_one_html/input_lastName'))
        "Step 5: Enter input value in input lastName"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_step_one_html/input_lastName'), data['input_lastname'])
        "Step 6: Click on input postalCode"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step_one_html/input_postalCode'))
        "Step 7: Enter input value in input postalCode"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_step_one_html/input_postalCode'), data['input_postalcode'])
        "Step 8: Click on button continue"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step_one_html/button_continue'))
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

