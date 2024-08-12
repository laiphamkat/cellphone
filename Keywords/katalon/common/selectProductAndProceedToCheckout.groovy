package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class selectProductAndProceedToCheckout {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button object"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_object_1"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_object_1', ['button_object_class': button_object_1_button_object_class, 'button_object_internalHasText': button_object_1_button_object_internalHasText]))
        
        "Step 2: Click on label 256Gb2"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_green_1"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_green_1', ['label_green_for': label_green_1_label_green_for, 'label_green_internalText': label_green_1_label_green_internalText]))
        
        "Step 3: Click on label naturalTitanium"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_naturalTitanium_1"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_naturalTitanium_1', ['label_naturalTitanium_for': label_naturalTitanium_1_label_naturalTitanium_for, 'label_naturalTitanium_internalText': label_naturalTitanium_1_label_naturalTitanium_internalText]))
        
        "Step 4: Click on button buy2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_buy2'))
        
        "Step 5: Hover over link goToCart"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_goToCart"
        WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_goToCart', ['link_goToCart_internalRoleLinkName': link_goToCart_link_goToCart_internalRoleLinkName]))
        
        "Step 6: Click on span shoppingCart -> Navigate to page 'cart'"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/span_shoppingCart"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/span_shoppingCart', ['span_shoppingCart_internalRoleLinkName': span_shoppingCart_span_shoppingCart_internalRoleLinkName]))
        
        "Step 7: Click on button proceedToCheckout -> Navigate to page 'checkout/info'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))
        
        "Step 8: Hover over div emailMeWithNews"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_info/div_emailMeWithNews'))
        
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
        data['button_object_class'] = testData.getValue('button_object_class', rowIndex)
        data['button_object_internalHasText'] = testData.getValue('button_object_internalHasText', rowIndex)
        data['input_email'] = testData.getValue('input_email', rowIndex)
        data['label_green_for'] = testData.getValue('label_green_for', rowIndex)
        data['label_green_internalText'] = testData.getValue('label_green_internalText', rowIndex)
        data['label_naturalTitanium_for'] = testData.getValue('label_naturalTitanium_for', rowIndex)
        data['label_naturalTitanium_internalText'] = testData.getValue('label_naturalTitanium_internalText', rowIndex)
        data['link_goToCart_internalRoleLinkName'] = testData.getValue('link_goToCart_internalRoleLinkName', rowIndex)
        data['span_shoppingCart_internalRoleLinkName'] = testData.getValue('span_shoppingCart_internalRoleLinkName', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_object_class'] = 'default_data'
        data['button_object_internalHasText'] = 'default_data'
        data['input_email'] = 'default_data'
        data['label_green_for'] = 'default_data'
        data['label_green_internalText'] = 'default_data'
        data['label_naturalTitanium_for'] = 'default_data'
        data['label_naturalTitanium_internalText'] = 'default_data'
        data['link_goToCart_internalRoleLinkName'] = 'default_data'
        data['span_shoppingCart_internalRoleLinkName'] = 'default_data'
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

