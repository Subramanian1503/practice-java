package com.upskillyourself.designpatterns.creational.factory.example_1.workflow;

import com.upskillyourself.designpatterns.creational.factory.example_1.testingtool.ECUTest;
import com.upskillyourself.designpatterns.creational.factory.example_1.testingtool.TestingTool;

public class ECUTestWorkflow implements TestExecutionWorkflow {

    @Override
    public TestingTool createTestingTool() {
        return new ECUTest();
    }
}
