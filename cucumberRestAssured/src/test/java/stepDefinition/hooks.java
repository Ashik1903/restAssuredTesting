//package stepDefinition;
//
//import java.io.File;
//import java.io.IOException;
//
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//
//import io.cucumber.java.Scenario;
//import io.cucumber.java.AfterStep;
//
//public class hooks {
//	
//	public WebDriver driver;
//	
////	@AfterStep
//    public void takeScreenshot(Scenario scenario) throws IOException{
//        String screeshotName = scenario.getName().replaceAll(" ","_");
//        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        byte[] fileContent = FileUtils.readFileToByteArray(screenshot);
//        scenario.attach(fileContent,"image/png",screeshotName);
//    }
//
//}
