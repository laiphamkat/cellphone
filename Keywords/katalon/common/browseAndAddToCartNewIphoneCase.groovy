package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class browseAndAddToCartNewIphoneCase {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Hover over item accessories"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_home/item_phone_2'))
        
        "Step 2: Click on link apple -> Navigate to page 'category/chekhly-na-iphone'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_apple'))
        
        "Step 3: Click on list breadcrumb"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_chekhly_na_iphone/list_breadcrumb'))
        
        "Step 4: Click on link goToCart -> Navigate to page 'cart'"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_chekhly_na_iphone/link_goToCart"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_chekhly_na_iphone/link_goToCart', ['link_goToCart_class': link_goToCart_link_goToCart_class, 'link_goToCart_internalRoleLinkName': link_goToCart_link_goToCart_internalRoleLinkName]))
        
        "Step 5: Hover over item listitem2"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/item_listitem2"
        WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_cart/item_listitem2', ['item_listitem2_nth': item_listitem2_item_listitem2_nth]))
        
        "Step 6: Click on link apple -> Navigate to page 'category/chekhly-na-iphone'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_apple'))
        
        "Step 7: Click on button newIphone15SiliconeCase"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_chekhly_na_iphone/button_newIphone15SiliconeCase'))
        
        "Step 8: Click on label iPhone15Plus"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_chekhly_na_iphone/label_iPhone15Plus"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_chekhly_na_iphone/label_iPhone15Plus', ['label_iPhone15Plus_for': label_iPhone15Plus_label_iPhone15Plus_for, 'label_iPhone15Plus_internalText': label_iPhone15Plus_label_iPhone15Plus_internalText]))
        
        "Step 9: Click on label iPhone15Plus"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_chekhly_na_iphone/label_iPhone15Plus"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_chekhly_na_iphone/label_iPhone15Plus', ['label_iPhone15Plus_for': label_iPhone15Plus_label_iPhone15Plus_for, 'label_iPhone15Plus_internalText': label_iPhone15Plus_label_iPhone15Plus_internalText]))
        
        "Step 10: Click on button buy2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_chekhly_na_iphone/button_buy2'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['item_listitem2_nth'] = testData.getValue('item_listitem2_nth', rowIndex)
        data['label_iPhone15Plus_for'] = testData.getValue('label_iPhone15Plus_for', rowIndex)
        data['label_iPhone15Plus_internalText'] = testData.getValue('label_iPhone15Plus_internalText', rowIndex)
        data['link_goToCart_class'] = testData.getValue('link_goToCart_class', rowIndex)
        data['link_goToCart_internalRoleLinkName'] = testData.getValue('link_goToCart_internalRoleLinkName', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['item_listitem2_nth'] = 'default_data'
        data['label_iPhone15Plus_for'] = 'default_data'
        data['label_iPhone15Plus_internalText'] = 'default_data'
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

