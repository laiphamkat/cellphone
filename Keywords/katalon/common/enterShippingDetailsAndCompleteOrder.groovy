package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling

public class enterShippingDetailsAndCompleteOrder {
    
    private static def execute_functional_method(Map data) {
        "Step 1: Hover over div"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_info/div_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_info/div_object'))
        "Step 2: Click on input field 'email'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_info/input_email'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_email'))
        "Step 3: Enter input value in input field 'email'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_info/input_email'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_email'), data['input_email'])
        "Step 4: Click on button 'CONTINUE TO SHIPPING' -> Navigate to page 'checkout/shipping-address'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_info/button_continue to shipping'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_continue to shipping'))
        "Step 5: Enter input value in input field 'shipping address.first name'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_address_first_name'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_address_first_name'), data['input_shipping_address_first_name'])
        "Step 6: Hover over div"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/div_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_object'))
        "Step 7: Enter input value in input field 'shipping address.last name'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_address_last_name'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_address_last_name'), data['input_shipping_address_last_name'])
        "Step 8: Click on input field 'shipping address.address line 1'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_address_address_line_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_address_address_line_1'))
        "Step 9: Hover over div"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/div_object_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_object_1'))
        "Step 10: Enter input value in input field 'shipping address.address line 1'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_address_address_line_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_address_address_line_1'), data['input_shipping_address_address_line_1'])
        "Step 11: Click on input field 'shipping address.zip'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_address_zip'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_address_zip'))
        "Step 12: Hover over div"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/div_object_2'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_object_2'))
        "Step 13: Enter input value in input field 'shipping address.zip'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_address_zip'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_address_zip'), data['input_shipping_address_zip'])
        "Step 14: Click on input field 'shipping address.city'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_address_city'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_address_city'))
        "Step 15: Hover over div"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/div_object_3'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_object_3'))
        "Step 16: Enter input value in input field 'shipping address.city'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_address_city'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_address_city'), data['input_shipping_address_city'])
        "Step 17: Click on input field 'shipping address.state'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_address_state'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_address_state'))
        "Step 18: Hover over div"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/div_object_4'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_object_4'))
        "Step 19: Enter input value in input field 'shipping address.state'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_address_state'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_address_state'), data['input_shipping_address_state'])
        "Step 20: Click on input field 'shipping address.phone'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_address_phone'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_address_phone'))
        "Step 21: Enter input value in input field 'shipping address.phone'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_address_phone'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_address_phone'), data['input_shipping_address_phone'])
        "Step 22: Click on button 'CONTINUE TO PAYMENT' -> Navigate to page 'checkout/payment'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/button_continue to payment'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/button_continue to payment'))
        "Step 23: Click on button 'COMPLETE ORDER'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_payment/button_complete order'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_complete order'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_email'] = testData.getValue('input_email', rowIndex)
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
        data['input_email'] = 'default_data'
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
