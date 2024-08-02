package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class actionSequence_1 {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Hover over div emailMeWithNews"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_emailMeWithNews'))
        
        "Step 2: Click on input email"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_email'))
        
        "Step 3: Enter input value in input email"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_email'), data['var_1_input_email'])
        
        "Step 4: Click on button continueToShipping"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_continueToShipping'))
        
        "Step 5: Hover over div emailMeWithNews"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_emailMeWithNews'))
        
        "Step 6: Click on input email"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_email'))
        
        "Step 7: Enter input value in input email"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_email'), data['var_2_input_email'])
        
        "Step 8: Click on button continueToShipping"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_continueToShipping'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['var_1_input_email'] = testData.getValue('var_1_input_email', rowIndex)
        data['var_2_input_email'] = testData.getValue('var_2_input_email', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['var_1_input_email'] = 'default_data'
        data['var_2_input_email'] = 'default_data'
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

