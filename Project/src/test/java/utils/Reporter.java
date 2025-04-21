package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.devtools.v117.io.IO;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Media;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;



public class Reporter extends Base {
    public static TakesScreenshot ts;
    public static ExtentReports generateExtentReport(String reportName){
        ExtentReports extentReport = new ExtentReports();
        SimpleDateFormat dateFormat = new  SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
        String timestamp = dateFormat.format(new Date());
        String reportFilepath = System.getProperty("user.dir")+"/reports/";
        reportFilepath += reportName + "_" + timestamp + ".html";
        File extentReportFile = new File(reportFilepath);
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(extentReportFile);
        extentReport.attachReporter(sparkReporter);
        return extentReport;

    }
    public static String captureScreenShot(String filename){
        String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String name = filename + timestamp + ".png";
        String destPath = "./"+name;
        ts = (TakesScreenshot) driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
        File screenshotsDir = new File (System.getProperty("user.dir")+"/reports");
        
        File target = new File(screenshotsDir, name);
        try {
            Files.copy(file, target);
            
        } catch (IOException e) {
            e.printStackTrace();
            // TODO: handle exception
        }
        return destPath;
    }
    public static void attachScreenshotToReport(String filename, ExtentTest test, String description){
        try {
            test.log(Status.INFO,description,MediaEntityBuilder.createScreenCaptureFromPath(captureScreenShot(filename)).build());
            
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }
    }
    


}