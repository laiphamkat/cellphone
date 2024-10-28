package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class fillUserInformationForCellphonePurchase {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Hover over div MainContent"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/div_MainContent'))
        
        "Step 2: Click on input FirstName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_FirstName'))
        
        "Step 3: Hover over div MainContent2"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/div_MainContent2'))
        
        "Step 4: Enter input value in input FirstName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_FirstName'), data['input_FirstName'])
        
        "Step 5: Click on input LastName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_LastName'))
        
        "Step 6: Hover over div MainContent3"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/div_MainContent3'))
        
        "Step 7: Enter input value in input LastName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_LastName'), data['input_LastName'])
        
        "Step 8: Click on input Address"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_Address'))
        
        "Step 9: Hover over div MainContent4"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/div_MainContent4'))
        
        "Step 10: Enter input value in input Address"
        
        WebUI.setText(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_Address'), data['input_Address'])
        
        "Step 11: Click on input ZipCode"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_ZipCode'))
        
        "Step 12: Hover over div MainContent5"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/div_MainContent5'))
        
        "Step 13: Enter input value in input ZipCode"
        
        WebUI.setText(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_ZipCode'), data['input_ZipCode'])
        
        "Step 14: Click on input City"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_City'))
        
        "Step 15: Hover over div MainContent6"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/div_MainContent6'))
        
        "Step 16: Enter input value in input City"
        
        WebUI.setText(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_City'), data['input_City'])
        
        "Step 17: Click on input State"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_State'))
        
        "Step 18: Hover over div MainContent7"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/div_MainContent7'))
        
        "Step 19: Enter input value in input State"
        
        WebUI.setText(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_State'), data['input_State'])
        
        "Step 20: Click on input Phone"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_Phone'))
        
        "Step 21: Enter input value in input Phone"
        
        WebUI.setText(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/input_Phone'), data['input_Phone'])
        
        "Step 22: Click on button ContinueToPayment"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/button_ContinueToPayment'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_Address'] = testData.getValue('input_Address', rowIndex)
        data['input_City'] = testData.getValue('input_City', rowIndex)
        data['input_FirstName'] = testData.getValue('input_FirstName', rowIndex)
        data['input_LastName'] = testData.getValue('input_LastName', rowIndex)
        data['input_Phone'] = testData.getValue('input_Phone', rowIndex)
        data['input_State'] = testData.getValue('input_State', rowIndex)
        data['input_ZipCode'] = testData.getValue('input_ZipCode', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_Address'] = 'default_data'
        data['input_City'] = 'default_data'
        data['input_FirstName'] = 'default_data'
        data['input_LastName'] = 'default_data'
        data['input_Phone'] = 'default_data'
        data['input_State'] = 'default_data'
        data['input_ZipCode'] = 'default_data'
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

