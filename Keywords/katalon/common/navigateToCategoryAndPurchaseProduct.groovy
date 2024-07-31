package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class navigateToCategoryAndPurchaseProduct {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Hover over item item"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_item'))
        
        "Step 2: Click on link apple -> Navigate to page 'category/*'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_apple'))
        
        "Step 3: Click on list breadcrumb"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/list_breadcrumb'))
        
        "Step 4: Click on link goToCart -> Navigate to page '/cart'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_category/link_goToCart', ['internalRoleLinkNameVariable': data['link_goToCart_internalRoleLinkNameVariable']]))
        
        "Step 5: Hover over item listitem2"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Parameterized Objects/Page_cart/item_listitem2', ['nthIndex': data['item_listitem2_nthIndex']]))
        
        "Step 6: Click on link apple -> Navigate to page 'category/*'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_apple'))
        
        "Step 7: Click on button sale20WusbpowerAdapter"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_category/button_sale20WusbpowerAdapter', ['classVariable': data['button_sale20WusbpowerAdapter_classVariable'], 'internalHasTextVariable': data['button_sale20WusbpowerAdapter_internalHasTextVariable']]))
        
        "Step 8: Click on label 1Tb"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_category/label_1Tb', ['internalTextVariable': data['label_1Tb_internalTextVariable'], 'forVariable': data['label_1Tb_forVariable']]))
        
        "Step 9: Click on label 1Tb"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_category/label_1Tb', ['internalTextVariable': data['label_1Tb_internalTextVariable'], 'forVariable': data['label_1Tb_forVariable']]))
        
        "Step 10: Click on button buy2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_buy2'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['item_listitem2_nthIndex'] = testData.getValue('item_listitem2_nthIndex', rowIndex)
        data['button_sale20WusbpowerAdapter_internalHasTextVariable'] = testData.getValue('button_sale20WusbpowerAdapter_internalHasTextVariable', rowIndex)
        data['link_goToCart_internalRoleLinkNameVariable'] = testData.getValue('link_goToCart_internalRoleLinkNameVariable', rowIndex)
        data['label_1Tb_forVariable'] = testData.getValue('label_1Tb_forVariable', rowIndex)
        data['button_sale20WusbpowerAdapter_classVariable'] = testData.getValue('button_sale20WusbpowerAdapter_classVariable', rowIndex)
        data['label_1Tb_internalTextVariable'] = testData.getValue('label_1Tb_internalTextVariable', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['item_listitem2_nthIndex'] = 'default_data'
        data['button_sale20WusbpowerAdapter_internalHasTextVariable'] = 'default_data'
        data['link_goToCart_internalRoleLinkNameVariable'] = 'default_data'
        data['label_1Tb_forVariable'] = 'default_data'
        data['button_sale20WusbpowerAdapter_classVariable'] = 'default_data'
        data['label_1Tb_internalTextVariable'] = 'default_data'
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

