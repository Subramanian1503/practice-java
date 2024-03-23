package com.upskillyourself.designpatterns.creational.factory.example_1;

import com.upskillyourself.designpatterns.creational.factory.example_1.workflow.COSYMWorkflow;
import com.upskillyourself.designpatterns.creational.factory.example_1.workflow.ECUTestWorkflow;
import com.upskillyourself.designpatterns.creational.factory.example_1.workflow.TestExecutionWorkflow;

import java.util.Locale;

public class Application {

    public static TestExecutionWorkflow initialize() throws Exception {
        // Read input from user for the type of workflow
        String workflowType = "COSYM";

        // Initialise the workflow
        switch (workflowType.toUpperCase(Locale.ROOT)) {
            case "COSYM":
                return new COSYMWorkflow();
            case "ECUTEST":
                return new ECUTestWorkflow();
            default:
                throw new Exception("Test execution with this type not found");
        }
    }

    public static void execute() throws Exception {
        // Initialise workflow
        // Execute the workflow
        initialize().executeTest();
    }
}
