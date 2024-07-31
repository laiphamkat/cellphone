package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class completePurchaseAndContinueToShipping {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on label 1Tb"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_category/label_1Tb', ['internalTextVariable': data['label_1Tb_internalTextVariable'], 'forVariable': data['label_1Tb_forVariable']]))
        
        "Step 2: Click on label 1Tb"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_category/label_1Tb', ['internalTextVariable': data['label_1Tb_internalTextVariable'], 'forVariable': data['label_1Tb_forVariable']]))
        
        "Step 3: Click on button buy2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_buy2'))
        
        "Step 4: Hover over link goToCart"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Parameterized Objects/Page_category/link_goToCart', ['internalRoleLinkNameVariable': data['link_goToCart_internalRoleLinkNameVariable']]))
        
        "Step 5: Click on span goToCart -> Navigate to page '/cart'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/span_goToCart'))
        
        "Step 6: Click on button proceedToCheckout -> Navigate to page 'checkout/info'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))
        
        "Step 7: Hover over div emailMeWithNews"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_info/div_emailMeWithNews'))
        
        "Step 8: Click on input email"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_email'))
        
        "Step 9: Enter input value in input email"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_email'), data['var_1_input_email'])
        
        "Step 10: Click on button continueToShipping"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_continueToShipping'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['var_1_input_email'] = testData.getValue('var_1_input_email', rowIndex)
        data['link_goToCart_internalRoleLinkNameVariable'] = testData.getValue('link_goToCart_internalRoleLinkNameVariable', rowIndex)
        data['label_1Tb_forVariable'] = testData.getValue('label_1Tb_forVariable', rowIndex)
        data['label_1Tb_internalTextVariable'] = testData.getValue('label_1Tb_internalTextVariable', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['var_1_input_email'] = 'default_data'
        data['link_goToCart_internalRoleLinkNameVariable'] = 'default_data'
        data['label_1Tb_forVariable'] = 'default_data'
        data['label_1Tb_internalTextVariable'] = 'default_data'
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

