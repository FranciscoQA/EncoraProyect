package com.encora.evershop.extentreports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {

    public static final ExtentReports extentReports = new ExtentReports();

    public synchronized static ExtentReports createExtentReport() {

        ExtentSparkReporter report = new ExtentSparkReporter("./extent-report/spark-report.html");
        report.config().setReportName("Report Para Bank");
        report.config().setDocumentTitle("Report of ParaBank");
        report.config().setTheme(Theme.STANDARD);
        extentReports.attachReporter(report);
        extentReports.setSystemInfo("Encora ParaBank", "Tech QA Team");
        extentReports.setSystemInfo("Author", "Francisco Jimenez");

        return extentReports;

    }
}