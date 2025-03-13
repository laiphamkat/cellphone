package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class selectPhoneOptionsAndProceedToCheckout {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on label 512GB"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_512GB'))
        
        "Step 2: Click on label colorOption"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_colorOption"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_colorOption', ['label_colorOption_for': data['label_colorOption_for'], 'label_colorOption_internalText': data['label_colorOption_internalText']]))
        
        "Step 3: Click on button purchaseQuantity"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_purchaseQuantity"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_purchaseQuantity', ['button_purchaseQuantity_internalRoleButtonName': data['button_purchaseQuantity_internalRoleButtonName'], 'button_purchaseQuantity_type': data['button_purchaseQuantity_type']]))
        
        "Step 4: Click on link PlaceOrder -> Navigate to page 'cart#cart'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_PlaceOrder'))
        
        "Step 5: Click on button ProceedToCheckout"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_ProceedToCheckout'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['button_purchaseQuantity_internalRoleButtonName'] = testData.getValue('button_purchaseQuantity_internalRoleButtonName', rowIndex)
        data['button_purchaseQuantity_type'] = testData.getValue('button_purchaseQuantity_type', rowIndex)
        data['label_colorOption_for'] = testData.getValue('label_colorOption_for', rowIndex)
        data['label_colorOption_internalText'] = testData.getValue('label_colorOption_internalText', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_purchaseQuantity_internalRoleButtonName'] = 'default_data'
        data['button_purchaseQuantity_type'] = 'default_data'
        data['label_colorOption_for'] = 'default_data'
        data['label_colorOption_internalText'] = 'default_data'
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

