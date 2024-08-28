package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class browseCategoryAndPurchaseProduct {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Hover over item dynamicObject (item)"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_dynamicObject'))
        
        "Step 2: Click on link apple -> Navigate to page 'category/*'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_apple'))
        
        "Step 3: Click on list breadcrumb"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/list_breadcrumb'))
        
        "Step 4: Click on link cart (cart) -> Navigate to page '/cart'"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_cart"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_cart', ['link_cart_class': data['link_cart_class'], 'link_cart_internalRoleLinkName': data['link_cart_internalRoleLinkName']]))
        
        "Step 5: Hover over item listItem"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_cart/item_listItem'))
        
        "Step 6: Click on link apple -> Navigate to page 'category/*'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_apple'))
        
        "Step 7: Click on button productPurchase (newIphone15SiliconeCase)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_productPurchase"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_productPurchase', ['button_productPurchase_class': data['button_productPurchase_class'], 'button_productPurchase_internalHasText': data['button_productPurchase_internalHasText']]))
        
        "Step 8: Click on label storageColorModel (iphone15Plus)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_storageColorModel"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_storageColorModel', ['label_storageColorModel_for': data['label_storageColorModel_for'], 'label_storageColorModel_internalText': data['label_storageColorModel_internalText']]))
        
        "Step 9: Click on label storageColorModel (iphone15Plus)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_storageColorModel"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_storageColorModel', ['label_storageColorModel_for': data['label_storageColorModel_for'], 'label_storageColorModel_internalText': data['label_storageColorModel_internalText']]))
        
        "Step 10: Click on button buy"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_buy'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['button_productPurchase_class'] = testData.getValue('button_productPurchase_class', rowIndex)
        data['button_productPurchase_internalHasText'] = testData.getValue('button_productPurchase_internalHasText', rowIndex)
        data['label_storageColorModel_for'] = testData.getValue('label_storageColorModel_for', rowIndex)
        data['label_storageColorModel_internalText'] = testData.getValue('label_storageColorModel_internalText', rowIndex)
        data['link_cart_class'] = testData.getValue('link_cart_class', rowIndex)
        data['link_cart_internalRoleLinkName'] = testData.getValue('link_cart_internalRoleLinkName', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_productPurchase_class'] = 'default_data'
        data['button_productPurchase_internalHasText'] = 'default_data'
        data['label_storageColorModel_for'] = 'default_data'
        data['label_storageColorModel_internalText'] = 'default_data'
        data['link_cart_class'] = 'default_data'
        data['link_cart_internalRoleLinkName'] = 'default_data'
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

