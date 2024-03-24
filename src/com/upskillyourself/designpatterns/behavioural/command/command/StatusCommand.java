package com.upskillyourself.designpatterns.behavioural.command.command;

public class StatusCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Execute status command");
    }

    @Override
    public void unExecute() {
        System.out.println("Un execute status command");
    }
}
