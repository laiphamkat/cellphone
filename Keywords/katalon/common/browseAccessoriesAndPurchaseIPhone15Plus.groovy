package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable

public class browseAccessoriesAndPurchaseIPhone15Plus {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Hover over item accessories"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_home/item_accessories'))
        
        "Step 2: Click on link apple -> Navigate to page 'category/*'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_apple'))
        
        "Step 3: Click on list breadcrumb"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/list_breadcrumb'))
        
        "Step 4: Click on link goToCart -> Navigate to page '/cart'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_goToCart'))
        
        "Step 5: Hover over item listitem2"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_cart/item_listitem2'))
        
        "Step 6: Click on link apple -> Navigate to page 'category/*'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_apple'))
        
        "Step 7: Click on button productsItemInStock"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_productsItemInStock', ['class': data['button_productsItemInStock_class'], 'internalHasText': data['button_productsItemInStock_internalHasText']]))
        
        "Step 8: Click on label iPhone15Plus"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_iPhone15Plus', ['for': data['label_iPhone15Plus_for'], 'internalText': data['label_iPhone15Plus_internalText']]))
        
        "Step 9: Click on label iPhone15Plus"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_iPhone15Plus', ['for': data['label_iPhone15Plus_for'], 'internalText': data['label_iPhone15Plus_internalText']]))
        
        "Step 10: Click on button buy2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_buy2'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['button_productsItemInStock_class'] = testData.getValue('button_productsItemInStock_class', rowIndex)
        data['button_productsItemInStock_internalHasText'] = testData.getValue('button_productsItemInStock_internalHasText', rowIndex)
        data['label_iPhone15Plus_for'] = testData.getValue('label_iPhone15Plus_for', rowIndex)
        data['label_iPhone15Plus_internalText'] = testData.getValue('label_iPhone15Plus_internalText', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_productsItemInStock_class'] = 'default_data'
        data['button_productsItemInStock_internalHasText'] = 'default_data'
        data['label_iPhone15Plus_for'] = 'default_data'
        data['label_iPhone15Plus_internalText'] = 'default_data'
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

