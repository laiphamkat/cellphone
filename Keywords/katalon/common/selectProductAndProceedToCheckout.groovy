package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class selectProductAndProceedToCheckout {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button hotNewProduct (bestChoiceHotNew)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_hotNewProduct_2"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_hotNewProduct_2', ['button_hotNewProduct_class': data['button_hotNewProduct_class'], 'button_hotNewProduct_internalHasText': data['button_hotNewProduct_internalHasText']]))
        
        "Step 2: Click on label colorStorageOptions (512Gb2)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_colorStorageOptions"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_colorStorageOptions', ['label_colorStorageOptions_for': data['label_colorStorageOptions_for'], 'label_colorStorageOptions_internalText': data['label_colorStorageOptions_internalText']]))
        
        "Step 3: Click on label colorStorageOptions (naturalTitanium)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_colorStorageOptions_4"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_colorStorageOptions_4', ['label_colorStorageOptions_for': data['label_colorStorageOptions_for'], 'label_colorStorageOptions_internalText': data['label_colorStorageOptions_internalText']]))
        
        "Step 4: Click on button buy"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_buy'))
        
        "Step 5: Hover over link goToCart"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_home/link_goToCart'))
        
        "Step 6: Click on span dynamicObject (object) -> Navigate to page '/cart'"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/span_dynamicObject"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/span_dynamicObject', ['span_dynamicObject_internalRoleLinkName': data['span_dynamicObject_internalRoleLinkName']]))
        
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
        data['button_hotNewProduct_class'] = testData.getValue('button_hotNewProduct_class', rowIndex)
        data['button_hotNewProduct_internalHasText'] = testData.getValue('button_hotNewProduct_internalHasText', rowIndex)
        data['input_email'] = testData.getValue('input_email', rowIndex)
        data['label_colorStorageOptions_for'] = testData.getValue('label_colorStorageOptions_for', rowIndex)
        data['label_colorStorageOptions_internalText'] = testData.getValue('label_colorStorageOptions_internalText', rowIndex)
        data['span_dynamicObject_internalRoleLinkName'] = testData.getValue('span_dynamicObject_internalRoleLinkName', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_hotNewProduct_class'] = 'default_data'
        data['button_hotNewProduct_internalHasText'] = 'default_data'
        data['input_email'] = 'default_data'
        data['label_colorStorageOptions_for'] = 'default_data'
        data['label_colorStorageOptions_internalText'] = 'default_data'
        data['span_dynamicObject_internalRoleLinkName'] = 'default_data'
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

