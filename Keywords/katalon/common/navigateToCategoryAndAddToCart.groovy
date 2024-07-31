package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class navigateToCategoryAndAddToCart {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Hover over item item"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_item'))
        
        "Step 2: Click on link apple -> Navigate to page 'category/*'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_home/link_apple', ['nthChildIndex': data['link_apple_nthChildIndex']]))
        
        "Step 3: Click on button sale20WusbtypeCadapter"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_category/button_sale20WusbtypeCadapter', ['classVariable': data['button_sale20WusbtypeCadapter_classVariable'], 'internalHasTextVariable': data['button_sale20WusbtypeCadapter_internalHasTextVariable']]))
        
        "Step 4: Click on label 1Tb"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_category/label_1Tb', ['internalTextVariable': data['label_1Tb_internalTextVariable'], 'forVariable': data['label_1Tb_forVariable']]))
        
        "Step 5: Click on label 1Tb"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_category/label_1Tb', ['internalTextVariable': data['label_1Tb_internalTextVariable'], 'forVariable': data['label_1Tb_forVariable']]))
        
        "Step 6: Click on button buy2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_buy2'))
        
        "Step 7: Hover over link goToCart"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Parameterized Objects/Page_category/link_goToCart', ['internalRoleLinkNameVariable': data['link_goToCart_internalRoleLinkNameVariable']]))
        
        "Step 8: Click on span goToCart"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/span_goToCart'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['link_apple_nthChildIndex'] = testData.getValue('link_apple_nthChildIndex', rowIndex)
        data['button_sale20WusbtypeCadapter_internalHasTextVariable'] = testData.getValue('button_sale20WusbtypeCadapter_internalHasTextVariable', rowIndex)
        data['button_sale20WusbtypeCadapter_classVariable'] = testData.getValue('button_sale20WusbtypeCadapter_classVariable', rowIndex)
        data['link_goToCart_internalRoleLinkNameVariable'] = testData.getValue('link_goToCart_internalRoleLinkNameVariable', rowIndex)
        data['label_1Tb_forVariable'] = testData.getValue('label_1Tb_forVariable', rowIndex)
        data['label_1Tb_internalTextVariable'] = testData.getValue('label_1Tb_internalTextVariable', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['link_apple_nthChildIndex'] = 'default_data'
        data['button_sale20WusbtypeCadapter_internalHasTextVariable'] = 'default_data'
        data['button_sale20WusbtypeCadapter_classVariable'] = 'default_data'
        data['link_goToCart_internalRoleLinkNameVariable'] = 'default_data'
        data['label_1Tb_forVariable'] = 'default_data'
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

