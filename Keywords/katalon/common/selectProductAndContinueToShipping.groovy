package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class selectProductAndContinueToShipping {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on label colorModelStorage (iphone15)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_colorModelStorage"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_colorModelStorage', ['label_colorModelStorage_for': data['label_colorModelStorage_for'], 'label_colorModelStorage_internalText': data['label_colorModelStorage_internalText']]))
        
        "Step 2: Click on label colorModelStorage (black)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_colorModelStorage"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_colorModelStorage', ['label_colorModelStorage_for': data['label_colorModelStorage_for'], 'label_colorModelStorage_internalText': data['label_colorModelStorage_internalText']]))
        
        "Step 3: Click on button buy"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy'))
        
        "Step 4: Click on link placeAnOrder -> Navigate to page '/cart'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_placeAnOrder'))
        
        "Step 5: Click on button dynamicObject (increased)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_dynamicObject"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_dynamicObject', ['button_dynamicObject_nthChild': data['button_dynamicObject_nthChild'], 'button_dynamicObject_class': data['button_dynamicObject_class'], 'button_dynamicObject_internalRoleButtonName': data['button_dynamicObject_internalRoleButtonName']]))
        
        "Step 6: Click on link goToCart (goToCart)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/link_goToCart"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/link_goToCart', ['link_goToCart_internalRoleLinkName': data['link_goToCart_internalRoleLinkName']]))
        
        "Step 7: Click on button proceedToCheckout -> Navigate to page 'checkout/info'"
        
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
        data['button_dynamicObject_class'] = testData.getValue('button_dynamicObject_class', rowIndex)
        data['button_dynamicObject_internalRoleButtonName'] = testData.getValue('button_dynamicObject_internalRoleButtonName', rowIndex)
        data['button_dynamicObject_nthChild'] = testData.getValue('button_dynamicObject_nthChild', rowIndex)
        data['input_email'] = testData.getValue('input_email', rowIndex)
        data['label_colorModelStorage_for'] = testData.getValue('label_colorModelStorage_for', rowIndex)
        data['label_colorModelStorage_internalText'] = testData.getValue('label_colorModelStorage_internalText', rowIndex)
        data['link_goToCart_internalRoleLinkName'] = testData.getValue('link_goToCart_internalRoleLinkName', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_dynamicObject_class'] = 'default_data'
        data['button_dynamicObject_internalRoleButtonName'] = 'default_data'
        data['button_dynamicObject_nthChild'] = 'default_data'
        data['input_email'] = 'default_data'
        data['label_colorModelStorage_for'] = 'default_data'
        data['label_colorModelStorage_internalText'] = 'default_data'
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

