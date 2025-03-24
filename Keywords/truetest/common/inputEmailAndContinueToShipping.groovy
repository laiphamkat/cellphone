package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class inputEmailAndContinueToShipping {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button proceedToCheckout -> Navigate to page 'checkout info#checkout/info'"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_proceedToCheckout"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_proceedToCheckout', ['button_proceedToCheckout_internalRoleButtonName': data['button_proceedToCheckout_internalRoleButtonName']]))
        
        "Step 2: Hover over div checkoutInfo"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_info/div_checkoutInfo'))
        
        "Step 3: Click on input Email"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_Email'))
        
        "Step 4: Enter input value in input Email"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_Email'), data['input_Email'])
        
        "Step 5: Click on button ContinueToShipping"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_ContinueToShipping'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['button_proceedToCheckout_internalRoleButtonName'] = testData.getValue('button_proceedToCheckout_internalRoleButtonName', rowIndex)
        data['input_Email'] = testData.getValue('input_Email', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_proceedToCheckout_internalRoleButtonName'] = 'default_data'
        data['input_Email'] = 'default_data'
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

