package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable

public class fillShippingAddressAndProvideContactInfo {
    
    private static def execute_functional_method(Map data) {
        "Step 1: Hover over div"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_info/div_emailMeWithNews'))
        WebUI.takeScreenshot()
        "Step 2: Click on input field 'email'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_email'))
        WebUI.takeScreenshot()
        "Step 3: Enter input value in input field 'email'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_email'), data['input_email'])
        WebUI.takeScreenshot()
        "Step 4: Click on button 'CONTINUE TO SHIPPING' -> Navigate to page 'checkout/shipping-address'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_continueToShipping'))
        WebUI.takeScreenshot()
        "Step 5: Hover over div"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiInputBaseRoot'))
        WebUI.takeScreenshot()
        "Step 6: Click on input field 'shipping address.first name'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressFirstName'))
        WebUI.takeScreenshot()
        "Step 7: Hover over div"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControlRoot'))
        WebUI.takeScreenshot()
        "Step 8: Enter input value in input field 'shipping address.first name'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressFirstName'), data['input_shipping_address_first_name'])
        WebUI.takeScreenshot()
        "Step 9: Click on input field 'shipping address.last name'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressLastName'))
        WebUI.takeScreenshot()
        "Step 10: Hover over div"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControlRoot_1'))
        WebUI.takeScreenshot()
        "Step 11: Enter input value in input field 'shipping address.last name'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressLastName'), data['input_shipping_address_last_name'])
        WebUI.takeScreenshot()
        "Step 12: Click on input field 'shipping address.address line 1'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressAddressLine1'))
        WebUI.takeScreenshot()
        "Step 13: Hover over div"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControlRoot_2'))
        WebUI.takeScreenshot()
        "Step 14: Enter input value in input field 'shipping address.address line 1'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressAddressLine1'), data['input_shipping_address_address_line_1'])
        WebUI.takeScreenshot()
        "Step 15: Click on input field 'shipping address.zip'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressZip'))
        WebUI.takeScreenshot()
        "Step 16: Hover over div"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControlRoot_3'))
        WebUI.takeScreenshot()
        "Step 17: Enter input value in input field 'shipping address.zip'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressZip'), data['input_shipping_address_zip'])
        WebUI.takeScreenshot()
        "Step 18: Click on input field 'shipping address.city'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressCity'))
        WebUI.takeScreenshot()
        "Step 19: Hover over div"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControlRoot_4'))
        WebUI.takeScreenshot()
        "Step 20: Enter input value in input field 'shipping address.city'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressCity'), data['input_shipping_address_city'])
        WebUI.takeScreenshot()
        "Step 21: Click on input field 'shipping address.state'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressState'))
        WebUI.takeScreenshot()
        "Step 22: Hover over div"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControlRoot_5'))
        WebUI.takeScreenshot()
        "Step 23: Enter input value in input field 'shipping address.state'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressState'), data['input_shipping_address_state'])
        WebUI.takeScreenshot()
        "Step 24: Click on input field 'shipping address.phone'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressPhone'))
        WebUI.takeScreenshot()
        "Step 25: Enter input value in input field 'shipping address.phone'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressPhone'), data['input_shipping_address_phone'])
        WebUI.takeScreenshot()
        "Step 26: Click on div"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/div_deliveryInformationUs'))
        WebUI.takeScreenshot()
        "Step 27: Enter input value in input field 'shipping address.state'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressState'), data['input_shipping_address_state_1'])
        WebUI.takeScreenshot()
        "Step 28: Click on main"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/main_roleMain'))
        WebUI.takeScreenshot()
        "Step 29: Hover over div"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControlRoot_4'))
        WebUI.takeScreenshot()
        "Step 30: Click on input field 'shipping address.state'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressState'))
        WebUI.takeScreenshot()
        "Step 31: Hover over div"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControlRoot_5'))
        WebUI.takeScreenshot()
        "Step 32: Enter input value in input field 'shipping address.state'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressState'), data['input_shipping_address_state_2'])
        WebUI.takeScreenshot()
        "Step 33: Click on input field 'shipping address.phone'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressPhone'))
        WebUI.takeScreenshot()
        "Step 34: Click on div"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/div_firstNameLastName'))
        WebUI.takeScreenshot()
        "Step 35: Enter input value in input field 'shipping address.city'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressCity'), data['input_shipping_address_city_1'])
        WebUI.takeScreenshot()
        "Step 36: Click on main"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/main_roleMain'))
        WebUI.takeScreenshot()
        "Step 37: Hover over div"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_muiFormControlRoot_3'))
        WebUI.takeScreenshot()
        "Step 38: Click on input field 'shipping address.city'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressCity'))
        WebUI.takeScreenshot()
        "Step 39: Enter input value in input field 'shipping address.city'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressCity'), data['input_shipping_address_city_2'])
        WebUI.takeScreenshot()
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
        data['input_shipping_address_state_1'] = testData.getValue('input_shipping_address_state_1', rowIndex)
        data['input_shipping_address_state_2'] = testData.getValue('input_shipping_address_state_2', rowIndex)
        data['input_shipping_address_city_1'] = testData.getValue('input_shipping_address_city_1', rowIndex)
        data['input_shipping_address_city_2'] = testData.getValue('input_shipping_address_city_2', rowIndex)
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
        data['input_shipping_address_state_1'] = 'default_data'
        data['input_shipping_address_state_2'] = 'default_data'
        data['input_shipping_address_city_1'] = 'default_data'
        data['input_shipping_address_city_2'] = 'default_data'
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

