package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class selectProductAndCheckout {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on label 512Gb"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_512Gb_12"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_512Gb_12', ['label_512Gb_for': data['label_512Gb_for'], 'label_512Gb_internalText': data['label_512Gb_internalText']]))
        
        "Step 2: Click on label 256Gb1"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_512Gb_12"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_512Gb_12', ['label_512Gb_for': data['label_512Gb_for'], 'label_512Gb_internalText': data['label_512Gb_internalText']]))
        
        "Step 3: Click on button buy"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy'))
        
        "Step 4: Click on link placeAnOrder -> Navigate to page 'cart'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_placeAnOrder'))
        
        "Step 5: Click on button increased"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_decreased_1"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_decreased_1', ['button_decreased_class': data['button_decreased_class'], 'button_decreased_nthChild': data['button_decreased_nthChild'], 'button_decreased_internalRoleButtonName': data['button_decreased_internalRoleButtonName']]))
        
        "Step 6: Click on link goToCart"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/link_goToCart"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/link_goToCart', ['link_goToCart_internalRoleLinkName': data['link_goToCart_internalRoleLinkName']]))
        
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
        data['button_decreased_class'] = testData.getValue('button_decreased_class', rowIndex)
        data['button_decreased_internalRoleButtonName'] = testData.getValue('button_decreased_internalRoleButtonName', rowIndex)
        data['button_decreased_nthChild'] = testData.getValue('button_decreased_nthChild', rowIndex)
        data['input_email'] = testData.getValue('input_email', rowIndex)
        data['label_512Gb_for'] = testData.getValue('label_512Gb_for', rowIndex)
        data['label_512Gb_internalText'] = testData.getValue('label_512Gb_internalText', rowIndex)
        data['link_goToCart_internalRoleLinkName'] = testData.getValue('link_goToCart_internalRoleLinkName', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_decreased_class'] = 'default_data'
        data['button_decreased_internalRoleButtonName'] = 'default_data'
        data['button_decreased_nthChild'] = 'default_data'
        data['input_email'] = 'default_data'
        data['label_512Gb_for'] = 'default_data'
        data['label_512Gb_internalText'] = 'default_data'
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

