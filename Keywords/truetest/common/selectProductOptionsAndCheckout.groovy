package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class selectProductOptionsAndCheckout {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on label  512Gb"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label__512Gb'))
        
        "Step 2: Click on label colorOptions"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_colorOptions"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_colorOptions', ['label_colorOptions_for': data['label_colorOptions_for'], 'label_colorOptions_internalText': data['label_colorOptions_internalText']]))
        
        "Step 3: Click on button purchaseQuantity"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_purchaseQuantity"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_purchaseQuantity', ['button_purchaseQuantity_internalRoleButtonName': data['button_purchaseQuantity_internalRoleButtonName'], 'button_purchaseQuantity_type': data['button_purchaseQuantity_type']]))
        
        "Step 4: Click on link placeOrder -> Navigate to page 'cart#cart'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_placeOrder'))
        
        "Step 5: Click on button checkout"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_checkout"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_checkout', ['button_checkout_internalRoleButtonName': data['button_checkout_internalRoleButtonName']]))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['button_checkout_internalRoleButtonName'] = testData.getValue('button_checkout_internalRoleButtonName', rowIndex)
        data['button_purchaseQuantity_internalRoleButtonName'] = testData.getValue('button_purchaseQuantity_internalRoleButtonName', rowIndex)
        data['button_purchaseQuantity_type'] = testData.getValue('button_purchaseQuantity_type', rowIndex)
        data['label_colorOptions_for'] = testData.getValue('label_colorOptions_for', rowIndex)
        data['label_colorOptions_internalText'] = testData.getValue('label_colorOptions_internalText', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_checkout_internalRoleButtonName'] = 'default_data'
        data['button_purchaseQuantity_internalRoleButtonName'] = 'default_data'
        data['button_purchaseQuantity_type'] = 'default_data'
        data['label_colorOptions_for'] = 'default_data'
        data['label_colorOptions_internalText'] = 'default_data'
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

