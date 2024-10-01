package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable

public class selectPhoneColorAndProceedToCheckout {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on label phoneStorageColor (256Gb2)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_phoneStorageColor"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_phoneStorageColor', ['label_phoneStorageColor_for': data['label_phoneStorageColor_for'], 'label_phoneStorageColor_internalText': data['label_phoneStorageColor_internalText']]))
        
        "Step 2: Click on label phoneStorageColor (black)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_phoneStorageColor"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_phoneStorageColor', ['label_phoneStorageColor_for': data['label_phoneStorageColor_for_1'], 'label_phoneStorageColor_internalText': data['label_phoneStorageColor_internalText_1']]))
        
        "Step 3: Click on button buy"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy'))
        
        "Step 4: Click on link placeAnOrder -> Navigate to page '/cart'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_placeAnOrder'))
        
        "Step 5: Click on button increaseQuantity (increased3)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_increaseQuantity"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_increaseQuantity', ['button_increaseQuantity_nthChild': data['button_increaseQuantity_nthChild'], 'button_increaseQuantity_class': data['button_increaseQuantity_class']]))
        
        "Step 6: Click on link cartNavigation (cart)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/link_cartNavigation"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/link_cartNavigation', ['link_cartNavigation_internalRoleLinkName': data['link_cartNavigation_internalRoleLinkName']]))
        
        "Step 7: Click on button proceedToCheckout -> Navigate to page 'checkout/info'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_ProceedToCheckout'))
        
        "Step 8: Hover over div email"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_info/div_EmailSubscription'))
        
        "Step 9: Click on input email"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_Email'))
        
        "Step 10: Enter input value in input email"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_Email'), data['input_email'])
        
        "Step 11: Click on button continueToShipping"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_ContinueToShipping'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['button_increaseQuantity_class'] = testData.getValue('button_increaseQuantity_class', rowIndex)
        data['button_increaseQuantity_nthChild'] = testData.getValue('button_increaseQuantity_nthChild', rowIndex)
        data['input_email'] = testData.getValue('input_email', rowIndex)
        data['label_phoneStorageColor_for'] = testData.getValue('label_phoneStorageColor_for', rowIndex)
        data['label_phoneStorageColor_for_1'] = testData.getValue('label_phoneStorageColor_for_1', rowIndex)
        data['label_phoneStorageColor_internalText'] = testData.getValue('label_phoneStorageColor_internalText', rowIndex)
        data['label_phoneStorageColor_internalText_1'] = testData.getValue('label_phoneStorageColor_internalText_1', rowIndex)
        data['link_cartNavigation_internalRoleLinkName'] = testData.getValue('link_cartNavigation_internalRoleLinkName', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_increaseQuantity_class'] = 'default_data'
        data['button_increaseQuantity_nthChild'] = 'default_data'
        data['input_email'] = 'default_data'
        data['label_phoneStorageColor_for'] = 'default_data'
        data['label_phoneStorageColor_for_1'] = 'default_data'
        data['label_phoneStorageColor_internalText'] = 'default_data'
        data['label_phoneStorageColor_internalText_1'] = 'default_data'
        data['link_cartNavigation_internalRoleLinkName'] = 'default_data'
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

