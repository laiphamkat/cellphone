package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable

public class navigateThroughCheckoutProcess {
    
    private static def execute_functional_method(Map data) {
        "Step 1: Click on button 'checkout' -> Navigate to page 'checkout-step-one.html'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart.html?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart_html/button_checkout'))
        WebUI.takeScreenshot()
        "Step 2: Click on input field 'firstName'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-one.html?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step_one_html/input_firstName'))
        WebUI.takeScreenshot()
        "Step 3: Enter input value in input field 'firstName'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-one.html?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_step_one_html/input_firstName'), data['input_firstname'])
        WebUI.takeScreenshot()
        "Step 4: Click on input field 'lastName'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-one.html?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step_one_html/input_lastName'))
        WebUI.takeScreenshot()
        "Step 5: Enter input value in input field 'lastName'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-one.html?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_step_one_html/input_lastName'), data['input_lastname'])
        WebUI.takeScreenshot()
        "Step 6: Click on input field 'postalCode'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-one.html?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step_one_html/input_postalCode'))
        WebUI.takeScreenshot()
        "Step 7: Enter input value in input field 'postalCode'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-one.html?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_step_one_html/input_postalCode'), data['input_postalcode'])
        WebUI.takeScreenshot()
        "Step 8: Click on input field 'continue'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-one.html?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step_one_html/button_continue'))
        WebUI.takeScreenshot()
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_firstname'] = testData.getValue('input_firstname', rowIndex)
        data['input_lastname'] = testData.getValue('input_lastname', rowIndex)
        data['input_postalcode'] = testData.getValue('input_postalcode', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_firstname'] = 'default_data'
        data['input_lastname'] = 'default_data'
        data['input_postalcode'] = 'default_data'
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

