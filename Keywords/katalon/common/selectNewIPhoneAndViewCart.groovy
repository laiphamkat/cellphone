package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable

public class selectNewIPhoneAndViewCart {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Hover over item item"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_item'))
        
        "Step 2: Click on link apple -> Navigate to page 'category/*'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_apple', ['nthChild': data['link_apple_nthChild']]))
        
        "Step 3: Click on button hotNewiPhone15"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_hotNewiPhone15', ['class': data['button_hotNewiPhone15_class'], 'internalHasText': data['button_hotNewiPhone15_internalHasText']]))
        
        "Step 4: Click on label 256Gb"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_256Gb', ['for': data['label_256Gb_for'], 'internalText': data['label_256Gb_internalText']]))
        
        "Step 5: Click on label 256Gb"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_256Gb', ['for': data['label_256Gb_for'], 'internalText': data['label_256Gb_internalText']]))
        
        "Step 6: Click on button buy"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_buy'))
        
        "Step 7: Hover over link goToCart"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_goToCart', ['internalRoleLinkName': data['link_goToCart_internalRoleLinkName']]))
        
        "Step 8: Click on span goToCart"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/span_goToCart'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['button_hotNewiPhone15_class'] = testData.getValue('button_hotNewiPhone15_class', rowIndex)
        data['button_hotNewiPhone15_internalHasText'] = testData.getValue('button_hotNewiPhone15_internalHasText', rowIndex)
        data['label_256Gb_for'] = testData.getValue('label_256Gb_for', rowIndex)
        data['label_256Gb_internalText'] = testData.getValue('label_256Gb_internalText', rowIndex)
        data['link_apple_nthChild'] = testData.getValue('link_apple_nthChild', rowIndex)
        data['link_goToCart_internalRoleLinkName'] = testData.getValue('link_goToCart_internalRoleLinkName', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_hotNewiPhone15_class'] = 'default_data'
        data['button_hotNewiPhone15_internalHasText'] = 'default_data'
        data['label_256Gb_for'] = 'default_data'
        data['label_256Gb_internalText'] = 'default_data'
        data['link_apple_nthChild'] = 'default_data'
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

