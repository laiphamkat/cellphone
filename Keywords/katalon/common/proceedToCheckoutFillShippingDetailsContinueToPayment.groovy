package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling

public class proceedToCheckoutFillShippingDetailsContinueToPayment {
    
    private static def execute_functional_method(Map data) {
        "Step 1: Click on button '+'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_cart/button_'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_'))
        "Step 2: Click on button 'Proceed to checkout ' -> Navigate to page 'checkout/info'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_cart/button_proceed to checkout '), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceed to checkout '))
        "Step 3: Click on input field 'email'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_info/input_email'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_email'))
        "Step 4: Enter input value in input field 'email'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_info/input_email'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_email'), data['fn0_input_email'])
        "Step 5: Click on input field 'receive marketing info'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_info/input_receive_marketing_info'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_receive_marketing_info'))
        "Step 6: Click on button 'CONTINUE TO SHIPPING' -> Navigate to page 'checkout/shipping-address'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_info/button_continue to shipping_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_continue to shipping_1'))
        "Step 7: Click on input field 'delivery id'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/input_delivery_id'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_delivery_id'))
        "Step 8: Click on input field 'shipping address.first name'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_addressfirst_name'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_addressfirst_name'))
        "Step 9: Enter input value in input field 'shipping address.first name'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_addressfirst_name'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_addressfirst_name'), data['fn0_input_shipping_addressfirst_name'])
        "Step 10: Click on input field 'shipping address.last name'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_addresslast_name'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_addresslast_name'))
        "Step 11: Enter input value in input field 'shipping address.last name'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_addresslast_name'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_addresslast_name'), data['fn0_input_shipping_addresslast_name'])
        "Step 12: Click on input field 'shipping address.address line 1'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_addressaddress_line_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_addressaddress_line_1'))
        "Step 13: Enter input value in input field 'shipping address.address line 1'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_addressaddress_line_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_addressaddress_line_1'), data['fn0_input_shipping_addressaddress_line_1'])
        "Step 14: Click on input field 'shipping address.zip'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_addresszip'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_addresszip'))
        "Step 15: Enter input value in input field 'shipping address.zip'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_addresszip'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_addresszip'), data['fn0_input_shipping_addresszip'])
        "Step 16: Click on input field 'shipping address.city'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_addresscity'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_addresscity'))
        "Step 17: Enter input value in input field 'shipping address.city'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_addresscity'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_addresscity'), data['fn0_input_shipping_addresscity'])
        "Step 18: Click on input field 'shipping address.state'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_addressstate'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_addressstate'))
        "Step 19: Enter input value in input field 'shipping address.state'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_addressstate'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_addressstate'), data['fn0_input_shipping_addressstate'])
        "Step 20: Click on input field 'shipping address.phone'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_addressphone'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_addressphone'))
        "Step 21: Enter input value in input field 'shipping address.phone'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_addressphone'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shipping_addressphone'), data['fn0_input_shipping_addressphone'])
        "Step 22: Click on button 'CONTINUE TO PAYMENT'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_shipping_address/button_continue to payment'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/button_continue to payment'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['fn0_input_email'] = testData.getValue('fn0_input_email', rowIndex)
        data['fn0_input_shipping_addressfirst_name'] = testData.getValue('fn0_input_shipping_addressfirst_name', rowIndex)
        data['fn0_input_shipping_addresslast_name'] = testData.getValue('fn0_input_shipping_addresslast_name', rowIndex)
        data['fn0_input_shipping_addressaddress_line_1'] = testData.getValue('fn0_input_shipping_addressaddress_line_1', rowIndex)
        data['fn0_input_shipping_addresszip'] = testData.getValue('fn0_input_shipping_addresszip', rowIndex)
        data['fn0_input_shipping_addresscity'] = testData.getValue('fn0_input_shipping_addresscity', rowIndex)
        data['fn0_input_shipping_addressstate'] = testData.getValue('fn0_input_shipping_addressstate', rowIndex)
        data['fn0_input_shipping_addressphone'] = testData.getValue('fn0_input_shipping_addressphone', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['fn0_input_email'] = 'default_data'
        data['fn0_input_shipping_addressfirst_name'] = 'default_data'
        data['fn0_input_shipping_addresslast_name'] = 'default_data'
        data['fn0_input_shipping_addressaddress_line_1'] = 'default_data'
        data['fn0_input_shipping_addresszip'] = 'default_data'
        data['fn0_input_shipping_addresscity'] = 'default_data'
        data['fn0_input_shipping_addressstate'] = 'default_data'
        data['fn0_input_shipping_addressphone'] = 'default_data'
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

