package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.model.FailureHandling
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class enterShippingDetailsForPayment {
    
    private static def execute_functional_method(Map data) {
        "Step 1: Click on input field 'delivery id'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/input_delivery_id'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_delivery_id'))
        "Step 2: Hover over div"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/div_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_object'))
        "Step 3: Click on input field 'shipping address.first name'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_address_first_name'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_address_first_name'))
        "Step 4: Hover over div"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/div_object_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_object_1'))
        "Step 5: Enter input value in input field 'shipping address.first name'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_address_first_name'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_address_first_name'), data['input_shipping_address_first_name'])
        "Step 6: Click on input field 'shipping address.last name'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_address_last_name'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_address_last_name'))
        "Step 7: Hover over div"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/div_object_2'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_object_2'))
        "Step 8: Enter input value in input field 'shipping address.last name'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_address_last_name'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_address_last_name'), data['input_shipping_address_last_name'])
        "Step 9: Click on input field 'shipping address.address line 1'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_address_address_line_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_address_address_line_1'))
        "Step 10: Hover over div"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/div_object_3'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_object_3'))
        "Step 11: Enter input value in input field 'shipping address.address line 1'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_address_address_line_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_address_address_line_1'), data['input_shipping_address_address_line_1'])
        "Step 12: Click on input field 'shipping address.zip'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_address_zip'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_address_zip'))
        "Step 13: Hover over div"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/div_object_4'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_object_4'))
        "Step 14: Enter input value in input field 'shipping address.zip'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_address_zip'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_address_zip'), data['input_shipping_address_zip'])
        "Step 15: Click on input field 'shipping address.city'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_address_city'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_address_city'))
        "Step 16: Hover over div"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/div_object_5'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_object_5'))
        "Step 17: Enter input value in input field 'shipping address.city'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_address_city'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_address_city'), data['input_shipping_address_city'])
        "Step 18: Click on input field 'shipping address.state'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_address_state'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_address_state'))
        "Step 19: Hover over div"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/div_object_6'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_object_6'))
        "Step 20: Enter input value in input field 'shipping address.state'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_address_state'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_address_state'), data['input_shipping_address_state'])
        "Step 21: Click on input field 'shipping address.phone'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_address_phone'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_address_phone'))
        "Step 22: Enter input value in input field 'shipping address.phone'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_address_phone'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_address_phone'), data['input_shipping_address_phone'])
        "Step 23: Click on button 'CONTINUE TO PAYMENT'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/button_continue to payment'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/button_continue to payment'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_shipping_address_first_name'] = testData.getValue('input_shipping_address_first_name', rowIndex)
        data['input_shipping_address_last_name'] = testData.getValue('input_shipping_address_last_name', rowIndex)
        data['input_shipping_address_address_line_1'] = testData.getValue('input_shipping_address_address_line_1', rowIndex)
        data['input_shipping_address_zip'] = testData.getValue('input_shipping_address_zip', rowIndex)
        data['input_shipping_address_city'] = testData.getValue('input_shipping_address_city', rowIndex)
        data['input_shipping_address_state'] = testData.getValue('input_shipping_address_state', rowIndex)
        data['input_shipping_address_phone'] = testData.getValue('input_shipping_address_phone', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_shipping_address_first_name'] = 'default_data'
        data['input_shipping_address_last_name'] = 'default_data'
        data['input_shipping_address_address_line_1'] = 'default_data'
        data['input_shipping_address_zip'] = 'default_data'
        data['input_shipping_address_city'] = 'default_data'
        data['input_shipping_address_state'] = 'default_data'
        data['input_shipping_address_phone'] = 'default_data'
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

