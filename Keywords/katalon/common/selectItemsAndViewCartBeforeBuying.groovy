package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import com.kms.katalon.core.model.FailureHandling

public class selectItemsAndViewCartBeforeBuying {
    
    private static def execute_functional_method(Map data) {
        "Step 1: Click on label"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_category_samsung/label_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_samsung/label_object'))
        "Step 2: Click on label"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_category_samsung/label_object_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_samsung/label_object_1'))
        "Step 3: Click on button 'Buy'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_category_samsung/button_ buy'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_samsung/button_ buy'))
        "Step 4: Click on link '2' -> Navigate to page 'cart'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_category_samsung/link_2'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_samsung/link_2'))
        "Step 5: Click on link 'Apple'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_cart/link_apple'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_apple'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        
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

