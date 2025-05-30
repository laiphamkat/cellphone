package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class selectBrandAndPurchaseProduct {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on link brand -> Navigate to page 'category#category/*'"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_brand"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_brand', ['link_brand_nthChild': data['link_brand_nthChild'], 'link_brand_internalRoleLinkName': data['link_brand_internalRoleLinkName'], 'category_id': data['category_id']]))
        
        "Step 2: Click on link productCases -> Navigate to page 'product#product/*'"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_productCases"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_productCases', ['link_productCases_class': data['link_productCases_class'], 'link_productCases_internalRoleLinkName': data['link_productCases_internalRoleLinkName'], 'product_id': data['product_id']]))
        
        "Step 3: Click on label productAttributes"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_productAttributes"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_productAttributes', ['label_productAttributes_for': data['label_productAttributes_for'], 'label_productAttributes_internalText': data['label_productAttributes_internalText']]))
        
        "Step 4: Click on label productAttributes"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_productAttributes"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_productAttributes', ['label_productAttributes_for': data['label_productAttributes_for_1'], 'label_productAttributes_internalText': data['label_productAttributes_internalText_1']]))
        
        "Step 5: Click on button purchaseAction"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_purchaseAction"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_purchaseAction', ['button_purchaseAction_internalRoleButtonName': data['button_purchaseAction_internalRoleButtonName']]))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['button_purchaseAction_internalRoleButtonName'] = testData.getValue('button_purchaseAction_internalRoleButtonName', rowIndex)
        data['category_id'] = testData.getValue('category_id', rowIndex)
        data['label_productAttributes_for'] = testData.getValue('label_productAttributes_for', rowIndex)
        data['label_productAttributes_for_1'] = testData.getValue('label_productAttributes_for_1', rowIndex)
        data['label_productAttributes_internalText'] = testData.getValue('label_productAttributes_internalText', rowIndex)
        data['label_productAttributes_internalText_1'] = testData.getValue('label_productAttributes_internalText_1', rowIndex)
        data['link_brand_internalRoleLinkName'] = testData.getValue('link_brand_internalRoleLinkName', rowIndex)
        data['link_brand_nthChild'] = testData.getValue('link_brand_nthChild', rowIndex)
        data['link_productCases_class'] = testData.getValue('link_productCases_class', rowIndex)
        data['link_productCases_internalRoleLinkName'] = testData.getValue('link_productCases_internalRoleLinkName', rowIndex)
        data['product_id'] = testData.getValue('product_id', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_purchaseAction_internalRoleButtonName'] = 'default_data'
        data['category_id'] = 'default_data'
        data['label_productAttributes_for'] = 'default_data'
        data['label_productAttributes_for_1'] = 'default_data'
        data['label_productAttributes_internalText'] = 'default_data'
        data['label_productAttributes_internalText_1'] = 'default_data'
        data['link_brand_internalRoleLinkName'] = 'default_data'
        data['link_brand_nthChild'] = 'default_data'
        data['link_productCases_class'] = 'default_data'
        data['link_productCases_internalRoleLinkName'] = 'default_data'
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

