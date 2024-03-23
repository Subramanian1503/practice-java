package com.upskillyourself.designpatterns.creational.factory.example_1.workflow;

import com.upskillyourself.designpatterns.creational.factory.example_1.testingtool.COSYM;
import com.upskillyourself.designpatterns.creational.factory.example_1.testingtool.TestingTool;

public class COSYMWorkflow implements TestExecutionWorkflow {

    @Override
    public TestingTool createTestingTool() {
        return new COSYM();
    }

}
