package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable

public class addItemsToCartFromAppleCategory {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Hover over item item"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_item'))
        
        "Step 2: Click on link apple -> Navigate to page 'category/*'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_apple'))
        
        "Step 3: Click on list breadcrumb"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/list_breadcrumb'))
        
        "Step 4: Click on link goToCart -> Navigate to page '/cart'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_goToCart', ['internalRoleLinkName': data['link_goToCart_internalRoleLinkName']]))
        
        "Step 5: Hover over item listitem2"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_cart/item_listitem2', ['nth': data['item_listitem2_nth']]))
        
        "Step 6: Click on link apple -> Navigate to page 'category/*'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_apple_1'))
        
        "Step 7: Click on button sale20WusbpowerAdapter"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_sale20WusbpowerAdapter', ['class': data['button_sale20WusbpowerAdapter_class'], 'internalHasText': data['button_sale20WusbpowerAdapter_internalHasText']]))
        
        "Step 8: Click on label 256Gb"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_256Gb', ['for': data['label_256Gb_for'], 'internalText': data['label_256Gb_internalText']]))
        
        "Step 9: Click on label 256Gb"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_256Gb', ['for': data['label_256Gb_for'], 'internalText': data['label_256Gb_internalText']]))
        
        "Step 10: Click on button buy"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_buy'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['button_sale20WusbpowerAdapter_class'] = testData.getValue('button_sale20WusbpowerAdapter_class', rowIndex)
        data['button_sale20WusbpowerAdapter_internalHasText'] = testData.getValue('button_sale20WusbpowerAdapter_internalHasText', rowIndex)
        data['item_listitem2_nth'] = testData.getValue('item_listitem2_nth', rowIndex)
        data['label_256Gb_for'] = testData.getValue('label_256Gb_for', rowIndex)
        data['label_256Gb_internalText'] = testData.getValue('label_256Gb_internalText', rowIndex)
        data['link_goToCart_internalRoleLinkName'] = testData.getValue('link_goToCart_internalRoleLinkName', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_sale20WusbpowerAdapter_class'] = 'default_data'
        data['button_sale20WusbpowerAdapter_internalHasText'] = 'default_data'
        data['item_listitem2_nth'] = 'default_data'
        data['label_256Gb_for'] = 'default_data'
        data['label_256Gb_internalText'] = 'default_data'
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

