package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class hoverAndSelectIphoneAccessories {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Hover over item object3"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_object2'))
        
        "Step 2: Click on link Apple -> Navigate to page 'iphone cases category#*/*'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_Apple'))
        
        "Step 3: Click on link iphoneAccessories -> Navigate to page 'product#product/*'"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_iphone_cases_category/link_iphoneAccessories"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_iphone_cases_category/link_iphoneAccessories', ['link_iphoneAccessories_class': data['link_iphoneAccessories_class'], 'link_iphoneAccessories_internalRoleLinkName': data['link_iphoneAccessories_internalRoleLinkName'], 'product_id': data['product_id']]))
        
        "Step 4: Click on button buyQuantity"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_buyQuantity"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_buyQuantity', ['button_buyQuantity_internalRoleButtonName': data['button_buyQuantity_internalRoleButtonName'], 'button_buyQuantity_type': data['button_buyQuantity_type']]))
        
        "Step 5: Click on link PlaceOrder"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_PlaceOrder'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['button_buyQuantity_internalRoleButtonName'] = testData.getValue('button_buyQuantity_internalRoleButtonName', rowIndex)
        data['button_buyQuantity_type'] = testData.getValue('button_buyQuantity_type', rowIndex)
        data['link_iphoneAccessories_class'] = testData.getValue('link_iphoneAccessories_class', rowIndex)
        data['link_iphoneAccessories_internalRoleLinkName'] = testData.getValue('link_iphoneAccessories_internalRoleLinkName', rowIndex)
        data['product_id'] = testData.getValue('product_id', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_buyQuantity_internalRoleButtonName'] = 'default_data'
        data['button_buyQuantity_type'] = 'default_data'
        data['link_iphoneAccessories_class'] = 'default_data'
        data['link_iphoneAccessories_internalRoleLinkName'] = 'default_data'
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

