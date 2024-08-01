package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class browseAccessoriesAndAddToCart {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Hover over item accessories"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_home/item_accessories'))
        
        "Step 2: Click on link categoryChekhlyNaIphone -> Navigate to page 'category/*'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_categoryChekhlyNaIphone', ['nthChild': data['link_categoryChekhlyNaIphone_nthChild'], 'internalRoleLinkName': data['link_categoryChekhlyNaIphone_internalRoleLinkName']]))
        
        "Step 3: Click on list breadcrumb"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/list_breadcrumb'))
        
        "Step 4: Click on link goToCart -> Navigate to page '/cart'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_goToCart', ['class': data['link_goToCart_class'], 'internalRoleLinkName': data['link_goToCart_internalRoleLinkName']]))
        
        "Step 5: Hover over item phone"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_cart/item_phone'))
        
        "Step 6: Click on link apple -> Navigate to page 'category/*'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_apple'))
        
        "Step 7: Click on button productsItemInStock"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_productsItemInStock', ['class': data['button_productsItemInStock_class'], 'internalHasText': data['button_productsItemInStock_internalHasText']]))
        
        "Step 8: Click on label 1Tb"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_1Tb', ['for': data['label_1Tb_for'], 'internalText': data['label_1Tb_internalText']]))
        
        "Step 9: Click on label 1Tb"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_1Tb', ['for': data['label_1Tb_for'], 'internalText': data['label_1Tb_internalText']]))
        
        "Step 10: Click on button buy2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_buy2'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['button_productsItemInStock_class'] = testData.getValue('button_productsItemInStock_class', rowIndex)
        data['button_productsItemInStock_internalHasText'] = testData.getValue('button_productsItemInStock_internalHasText', rowIndex)
        data['label_1Tb_for'] = testData.getValue('label_1Tb_for', rowIndex)
        data['label_1Tb_internalText'] = testData.getValue('label_1Tb_internalText', rowIndex)
        data['link_categoryChekhlyNaIphone_internalRoleLinkName'] = testData.getValue('link_categoryChekhlyNaIphone_internalRoleLinkName', rowIndex)
        data['link_categoryChekhlyNaIphone_nthChild'] = testData.getValue('link_categoryChekhlyNaIphone_nthChild', rowIndex)
        data['link_goToCart_class'] = testData.getValue('link_goToCart_class', rowIndex)
        data['link_goToCart_internalRoleLinkName'] = testData.getValue('link_goToCart_internalRoleLinkName', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_productsItemInStock_class'] = 'default_data'
        data['button_productsItemInStock_internalHasText'] = 'default_data'
        data['label_1Tb_for'] = 'default_data'
        data['label_1Tb_internalText'] = 'default_data'
        data['link_categoryChekhlyNaIphone_internalRoleLinkName'] = 'default_data'
        data['link_categoryChekhlyNaIphone_nthChild'] = 'default_data'
        data['link_goToCart_class'] = 'default_data'
        data['link_goToCart_internalRoleLinkName'] = 'default_data'
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

