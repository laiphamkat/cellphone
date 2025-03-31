package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class selectMobileDevicesAndPurchaseQuantity {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on link brandCategories -> Navigate to page 'category#category/*'"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_brandCategories"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_brandCategories', ['category_id': data['category_id'], 'link_brandCategories_internalRoleLinkName': data['link_brandCategories_internalRoleLinkName'], 'link_brandCategories_nthChild': data['link_brandCategories_nthChild']]))
        
        "Step 2: Click on link mobileDevices -> Navigate to page 'product#product/*'"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_mobileDevices"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_mobileDevices', ['link_mobileDevices_class': data['link_mobileDevices_class'], 'link_mobileDevices_internalRoleLinkName': data['link_mobileDevices_internalRoleLinkName'], 'product_id': data['product_id']]))
        
        "Step 3: Click on label  512Gb"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label__512Gb'))
        
        "Step 4: Click on label colorOptions"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_colorOptions"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_colorOptions', ['label_colorOptions_for': data['label_colorOptions_for'], 'label_colorOptions_internalText': data['label_colorOptions_internalText']]))
        
        "Step 5: Click on button purchaseQuantity"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_purchaseQuantity"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_purchaseQuantity', ['button_purchaseQuantity_internalRoleButtonName': data['button_purchaseQuantity_internalRoleButtonName'], 'button_purchaseQuantity_type': data['button_purchaseQuantity_type']]))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['button_purchaseQuantity_internalRoleButtonName'] = testData.getValue('button_purchaseQuantity_internalRoleButtonName', rowIndex)
        data['button_purchaseQuantity_type'] = testData.getValue('button_purchaseQuantity_type', rowIndex)
        data['category_id'] = testData.getValue('category_id', rowIndex)
        data['label_colorOptions_for'] = testData.getValue('label_colorOptions_for', rowIndex)
        data['label_colorOptions_internalText'] = testData.getValue('label_colorOptions_internalText', rowIndex)
        data['link_brandCategories_internalRoleLinkName'] = testData.getValue('link_brandCategories_internalRoleLinkName', rowIndex)
        data['link_brandCategories_nthChild'] = testData.getValue('link_brandCategories_nthChild', rowIndex)
        data['link_mobileDevices_class'] = testData.getValue('link_mobileDevices_class', rowIndex)
        data['link_mobileDevices_internalRoleLinkName'] = testData.getValue('link_mobileDevices_internalRoleLinkName', rowIndex)
        data['product_id'] = testData.getValue('product_id', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_purchaseQuantity_internalRoleButtonName'] = 'default_data'
        data['button_purchaseQuantity_type'] = 'default_data'
        data['category_id'] = 'default_data'
        data['label_colorOptions_for'] = 'default_data'
        data['label_colorOptions_internalText'] = 'default_data'
        data['link_brandCategories_internalRoleLinkName'] = 'default_data'
        data['link_brandCategories_nthChild'] = 'default_data'
        data['link_mobileDevices_class'] = 'default_data'
        data['link_mobileDevices_internalRoleLinkName'] = 'default_data'
        data['product_id'] = 'default_data'
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

