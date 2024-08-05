package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class fillShippingAddressAndProceedToPayment {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Hover over div muiInputBaseRoot"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_muiInputBaseRoot'))
        
        "Step 2: Click on textbox shippingAddressFirstName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/textbox_shippingAddressFirstName'))
        
        "Step 3: Hover over div muiFormControlRoot"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_muiFormControlRoot'))
        
        "Step 4: Enter input value in textbox shippingAddressFirstName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/textbox_shippingAddressFirstName'), data['var_1_textbox_shippingAddressFirstName'])
        
        "Step 5: Click on textbox shippingAddressLastName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/textbox_shippingAddressLastName'))
        
        "Step 6: Hover over div muiFormControlRoot"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_muiFormControlRoot_1'))
        
        "Step 7: Enter input value in textbox shippingAddressLastName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/textbox_shippingAddressLastName'), data['var_2_textbox_shippingAddressLastName'])
        
        "Step 8: Click on textbox shippingAddressLine1"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/textbox_shippingAddressLine1'))
        
        "Step 9: Hover over div muiFormControlRoot"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_muiFormControlRoot_2'))
        
        "Step 10: Enter input value in textbox shippingAddressLine1"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/textbox_shippingAddressLine1'), data['var_3_textbox_shippingAddressLine1'])
        
        "Step 11: Click on textbox shippingAddressZipcode"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/textbox_shippingAddressZipcode'))
        
        "Step 12: Hover over div muiFormControlRoot"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_muiFormControlRoot_3'))
        
        "Step 13: Enter input value in textbox shippingAddressZipcode"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/textbox_shippingAddressZipcode'), data['var_4_textbox_shippingAddressZipcode'])
        
        "Step 14: Click on textbox shippingAddressCity"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/textbox_shippingAddressCity'))
        
        "Step 15: Hover over div muiFormControlRoot"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_muiFormControlRoot_4'))
        
        "Step 16: Enter input value in textbox shippingAddressCity"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/textbox_shippingAddressCity'), data['var_5_textbox_shippingAddressCity'])
        
        "Step 17: Click on textbox shippingAddressState"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/textbox_shippingAddressState'))
        
        "Step 18: Hover over div muiFormControlRoot"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_muiFormControlRoot_5'))
        
        "Step 19: Enter input value in textbox shippingAddressState"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/textbox_shippingAddressState'), data['var_6_textbox_shippingAddressState'])
        
        "Step 20: Click on textbox shippingAddressPhone"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/textbox_shippingAddressPhone'))
        
        "Step 21: Enter input value in textbox shippingAddressPhone"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/textbox_shippingAddressPhone'), data['var_7_textbox_shippingAddressPhone'])
        
        "Step 22: Click on button continueToPayment"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_continueToPayment'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['var_1_textbox_shippingAddressFirstName'] = testData.getValue('var_1_textbox_shippingAddressFirstName', rowIndex)
        data['var_2_textbox_shippingAddressLastName'] = testData.getValue('var_2_textbox_shippingAddressLastName', rowIndex)
        data['var_3_textbox_shippingAddressLine1'] = testData.getValue('var_3_textbox_shippingAddressLine1', rowIndex)
        data['var_4_textbox_shippingAddressZipcode'] = testData.getValue('var_4_textbox_shippingAddressZipcode', rowIndex)
        data['var_5_textbox_shippingAddressCity'] = testData.getValue('var_5_textbox_shippingAddressCity', rowIndex)
        data['var_6_textbox_shippingAddressState'] = testData.getValue('var_6_textbox_shippingAddressState', rowIndex)
        data['var_7_textbox_shippingAddressPhone'] = testData.getValue('var_7_textbox_shippingAddressPhone', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['var_1_textbox_shippingAddressFirstName'] = 'default_data'
        data['var_2_textbox_shippingAddressLastName'] = 'default_data'
        data['var_3_textbox_shippingAddressLine1'] = 'default_data'
        data['var_4_textbox_shippingAddressZipcode'] = 'default_data'
        data['var_5_textbox_shippingAddressCity'] = 'default_data'
        data['var_6_textbox_shippingAddressState'] = 'default_data'
        data['var_7_textbox_shippingAddressPhone'] = 'default_data'
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

