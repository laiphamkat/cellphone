package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class selectAccessoriesAndAddToCart {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Hover over item accessories"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_accessories'))
        
        "Step 2: Click on link apple -> Navigate to page '/category/chekhly-na-iphone'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_apple'))
        
        "Step 3: Click on list breadcrumb"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_chekhly_na_iphone/list_breadcrumb'))
        
        "Step 4: Click on link goToCart -> Navigate to page '/cart'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_chekhly_na_iphone/link_goToCart'))
        
        "Step 5: Hover over item listitem2"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_cart/item_listitem2'))
        
        "Step 6: Click on link apple -> Navigate to page '/category/chekhly-na-iphone'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_apple'))
        
        "Step 7: Click on button newIphone15SiliconeCase"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_chekhly_na_iphone/button_newIphone15SiliconeCase'))
        
        "Step 8: Click on label iPhone15Plus"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_chekhly_na_iphone/label_iPhone15Plus'))
        
        "Step 9: Click on label iPhone15Plus"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_chekhly_na_iphone/label_iPhone15Plus'))
        
        "Step 10: Click on button buy2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_chekhly_na_iphone/button_buy2'))
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

