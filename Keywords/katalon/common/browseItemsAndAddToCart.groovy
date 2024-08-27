package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class browseItemsAndAddToCart {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Hover over link itemCategories (accessories)"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_itemCategories'))
        
        "Step 2: Click on link apple -> Navigate to page 'category/*'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_apple'))
        
        "Step 3: Click on list breadcrumb"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/list_breadcrumb'))
        
        "Step 4: Click on link goToCart -> Navigate to page '/cart'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_goToCart'))
        
        "Step 5: Hover over item listItem"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_cart/item_listItem'))
        
        "Step 6: Click on link apple -> Navigate to page 'category/*'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_apple'))
        
        "Step 7: Click on button saleItems (samsungGalaxyZfold5)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_saleItems_1"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_saleItems_1', ['button_saleItems_class': data['button_saleItems_class'], 'button_saleItems_internalHasText': data['button_saleItems_internalHasText']]))
        
        "Step 8: Click on label storageColorOptions (512Gb)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions', ['label_storageColorOptions_for': data['label_storageColorOptions_for'], 'label_storageColorOptions_internalText': data['label_storageColorOptions_internalText']]))
        
        "Step 9: Click on label storageColorOptions (512Gb)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions', ['label_storageColorOptions_for': data['label_storageColorOptions_for'], 'label_storageColorOptions_internalText': data['label_storageColorOptions_internalText']]))
        
        "Step 10: Click on button buy"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_buy'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['button_saleItems_class'] = testData.getValue('button_saleItems_class', rowIndex)
        data['button_saleItems_internalHasText'] = testData.getValue('button_saleItems_internalHasText', rowIndex)
        data['label_storageColorOptions_for'] = testData.getValue('label_storageColorOptions_for', rowIndex)
        data['label_storageColorOptions_internalText'] = testData.getValue('label_storageColorOptions_internalText', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_saleItems_class'] = 'default_data'
        data['button_saleItems_internalHasText'] = 'default_data'
        data['label_storageColorOptions_for'] = 'default_data'
        data['label_storageColorOptions_internalText'] = 'default_data'
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

