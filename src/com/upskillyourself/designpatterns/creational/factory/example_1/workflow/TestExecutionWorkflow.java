package com.upskillyourself.designpatterns.creational.factory.example_1.workflow;

import com.upskillyourself.designpatterns.creational.factory.example_1.testingtool.TestingTool;

public interface TestExecutionWorkflow {

    TestingTool createTestingTool();

    default void executeTest() {
        // Initialize the workflow
        TestingTool testingTool = createTestingTool();

        // Execute the workflow
        testingTool.executeTestExecution();
    }
}
