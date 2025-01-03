import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner())


RunConfiguration.setExecutionSettingFile("/var/folders/w3/23c299_j70s87lp12_v2vkhh0000gp/T/Katalon/Test Cases/AI-Generated/TC5-Verify Successful Order Completion on Thank You Page after Shipping Details/20240424_161928/execution.properties")

TestCaseMain.beforeStart()

       TestCaseMain.startTestCaseBinding('Test Cases/AI-Generated/TC5-Verify Successful Order Completion on Thank You Page after Shipping Details', new File("/var/folders/w3/23c299_j70s87lp12_v2vkhh0000gp/T/Katalon/Test Cases/AI-Generated/TC5-Verify Successful Order Completion on Thank You Page after Shipping Details/20240424_161929/testCaseBinding"))
    
