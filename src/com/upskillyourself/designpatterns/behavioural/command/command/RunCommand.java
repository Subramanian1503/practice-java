package com.upskillyourself.designpatterns.behavioural.command.command;

public class RunCommand implements Command{


    @Override
    public void execute() {
        System.out.println("Execute run command");
    }

    @Override
    public void unExecute() {
        System.out.println("Un execute run command");
    }
}
