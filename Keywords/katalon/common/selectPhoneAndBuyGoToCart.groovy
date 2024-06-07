package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class selectPhoneAndBuyGoToCart {
    
    private static def execute_functional_method(Map data) {
        "Step 1: Hover over item phone"
        WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_phone'))
        "Step 2: Click on link samsung -> Navigate to page 'category/*'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_samsung'))
        "Step 3: Click on button newiPhone15Plus"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_newiPhone15Plus'))
        "Step 4: Click on label 2"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/label_2'))
        "Step 5: Click on label 2"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/label_2_1'))
        "Step 6: Click on button buy"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_buy'))
        "Step 7: Hover over link goToCart"
        WebUI.mouseOver(findTestObject('AI-Generated/Page_category/link_goToCart'))
        "Step 8: Click on span goToCart"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/span_goToCart'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        
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

