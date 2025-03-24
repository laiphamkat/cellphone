package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class selectMobilePhoneAndBuyQuantity {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on link brandNames -> Navigate to page 'category#category/*'"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_brandNames"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_brandNames', ['category_id': data['category_id'], 'link_brandNames_internalRoleLinkName': data['link_brandNames_internalRoleLinkName'], 'link_brandNames_nthChild': data['link_brandNames_nthChild']]))
        
        "Step 2: Click on link mobilePhones -> Navigate to page 'product#product/*'"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_mobilePhones"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_mobilePhones', ['link_mobilePhones_class': data['link_mobilePhones_class'], 'link_mobilePhones_internalRoleLinkName': data['link_mobilePhones_internalRoleLinkName'], 'product_id': data['product_id']]))
        
        "Step 3: Click on label 512GB"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_512GB'))
        
        "Step 4: Click on label colorOptions"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_colorOptions"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_colorOptions', ['label_colorOptions_for': data['label_colorOptions_for'], 'label_colorOptions_internalText': data['label_colorOptions_internalText']]))
        
        "Step 5: Click on button buyQuantity"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_buyQuantity"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_buyQuantity', ['button_buyQuantity_internalRoleButtonName': data['button_buyQuantity_internalRoleButtonName'], 'button_buyQuantity_type': data['button_buyQuantity_type']]))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['button_buyQuantity_internalRoleButtonName'] = testData.getValue('button_buyQuantity_internalRoleButtonName', rowIndex)
        data['button_buyQuantity_type'] = testData.getValue('button_buyQuantity_type', rowIndex)
        data['category_id'] = testData.getValue('category_id', rowIndex)
        data['label_colorOptions_for'] = testData.getValue('label_colorOptions_for', rowIndex)
        data['label_colorOptions_internalText'] = testData.getValue('label_colorOptions_internalText', rowIndex)
        data['link_brandNames_internalRoleLinkName'] = testData.getValue('link_brandNames_internalRoleLinkName', rowIndex)
        data['link_brandNames_nthChild'] = testData.getValue('link_brandNames_nthChild', rowIndex)
        data['link_mobilePhones_class'] = testData.getValue('link_mobilePhones_class', rowIndex)
        data['link_mobilePhones_internalRoleLinkName'] = testData.getValue('link_mobilePhones_internalRoleLinkName', rowIndex)
        data['product_id'] = testData.getValue('product_id', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_buyQuantity_internalRoleButtonName'] = 'default_data'
        data['button_buyQuantity_type'] = 'default_data'
        data['category_id'] = 'default_data'
        data['label_colorOptions_for'] = 'default_data'
        data['label_colorOptions_internalText'] = 'default_data'
        data['link_brandNames_internalRoleLinkName'] = 'default_data'
        data['link_brandNames_nthChild'] = 'default_data'
        data['link_mobilePhones_class'] = 'default_data'
        data['link_mobilePhones_internalRoleLinkName'] = 'default_data'
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

