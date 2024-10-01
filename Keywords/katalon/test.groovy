package katalon

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


public class test {
	private static def execute_functional_method(Map data) {
		
				"Step 1: Click on button proceedToCheckout -> Navigate to page 'checkout/info'"
		
				WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))
		
				"Step 2: Hover over div element"
		
				WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_info/div_element'))
		
				"Step 3: Click on input email"
		
				WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_email'))
		
				"Step 4: Enter input value in input email"
		
				WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_email'), data['input_email'])
		
				"Step 5: Click on button continueToShipping -> Navigate to page 'checkout/shipping-address'"
		
				WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_continueToShipping'))
		
				"Step 6: Hover over div element"
		
				WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_element'))
		
				"Step 7: Click on input firstName"
		
				WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_firstName'))
		
				"Step 8: Hover over div element2"
		
				WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_element2'))
		
				"Step 9: Enter input value in input firstName"
		
				WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_firstName'), data['input_firstName'])
		
				"Step 10: Click on input lastName"
		
				WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_lastName'))
		
				"Step 11: Hover over div element3"
		
				WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_element3'))
		
				"Step 12: Enter input value in input lastName"
		
				WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_lastName'), data['input_lastName'])
		
				"Step 13: Click on input address"
		
				WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_address'))
		
				"Step 14: Hover over div element4"
		
				WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_element4'))
		
				"Step 15: Enter input value in input address"
		
				WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_address'), data['input_address'])
		
				"Step 16: Click on input zipCode"
		
				WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_zipCode'))
		
				"Step 17: Hover over div element5"
		
				WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_element5'))
		
				"Step 18: Enter input value in input zipCode"
		
				WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_zipCode'), data['input_zipCode'])
		
				"Step 19: Click on input city"
		
				WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_city'))
		
				"Step 20: Hover over div element6"
		
				WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_element6'))
		
				"Step 21: Enter input value in input city"
		
				WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_city'), data['input_city'])
		
				"Step 22: Click on input state"
		
				WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_state'))
		
				"Step 23: Hover over div element7"
		
				WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_element7'))
		
				"Step 24: Enter input value in input state"
		
				WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_state'), data['input_state'])
		
				"Step 25: Click on input phone"
		
				WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_phone'))
		
				"Step 26: Enter input value in input phone"
		
				WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_phone'), data['input_phone'])
		
				"Step 27: Click on button continueToPayment"
		
				WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/button_continueToPayment'))
			}
}
