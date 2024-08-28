package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class selectStorageOptionsAndCheckout {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on label storageColorOptions (512Gb)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_storageColorOptions"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_storageColorOptions', ['label_storageColorOptions_for': data['label_storageColorOptions_for'], 'label_storageColorOptions_internalText': data['label_storageColorOptions_internalText']]))
        
        "Step 2: Click on label storageColorOptions (256Gb)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_storageColorOptions"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_storageColorOptions', ['label_storageColorOptions_for': data['label_storageColorOptions_for'], 'label_storageColorOptions_internalText': data['label_storageColorOptions_internalText']]))
        
        "Step 3: Click on button buy"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy'))
        
        "Step 4: Click on link placeAnOrder -> Navigate to page '/cart'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_placeAnOrder'))
        
        "Step 5: Click on button quantityAdjustment (increased)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_quantityAdjustment"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_quantityAdjustment', ['button_quantityAdjustment_nthChild': data['button_quantityAdjustment_nthChild'], 'button_quantityAdjustment_class': data['button_quantityAdjustment_class'], 'button_quantityAdjustment_internalRoleButtonName': data['button_quantityAdjustment_internalRoleButtonName']]))
        
        "Step 6: Click on link cartNavigation (goToCart)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/link_cartNavigation"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/link_cartNavigation', ['link_cartNavigation_internalRoleLinkName': data['link_cartNavigation_internalRoleLinkName']]))
        
        "Step 7: Click on button proceedToCheckout -> Navigate to page '/checkout/info'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))
        
        "Step 8: Hover over div email"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_info/div_email'))
        
        "Step 9: Click on input email"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_email'))
        
        "Step 10: Enter input value in input email"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_email'), data['input_email'])
        
        "Step 11: Click on button continueToShipping"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_continueToShipping'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['button_quantityAdjustment_class'] = testData.getValue('button_quantityAdjustment_class', rowIndex)
        data['button_quantityAdjustment_internalRoleButtonName'] = testData.getValue('button_quantityAdjustment_internalRoleButtonName', rowIndex)
        data['button_quantityAdjustment_nthChild'] = testData.getValue('button_quantityAdjustment_nthChild', rowIndex)
        data['input_email'] = testData.getValue('input_email', rowIndex)
        data['label_storageColorOptions_for'] = testData.getValue('label_storageColorOptions_for', rowIndex)
        data['label_storageColorOptions_internalText'] = testData.getValue('label_storageColorOptions_internalText', rowIndex)
        data['link_cartNavigation_internalRoleLinkName'] = testData.getValue('link_cartNavigation_internalRoleLinkName', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_quantityAdjustment_class'] = 'default_data'
        data['button_quantityAdjustment_internalRoleButtonName'] = 'default_data'
        data['button_quantityAdjustment_nthChild'] = 'default_data'
        data['input_email'] = 'default_data'
        data['label_storageColorOptions_for'] = 'default_data'
        data['label_storageColorOptions_internalText'] = 'default_data'
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

