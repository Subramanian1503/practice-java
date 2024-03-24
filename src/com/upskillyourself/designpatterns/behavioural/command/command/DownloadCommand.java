package com.upskillyourself.designpatterns.behavioural.command.command;

public class DownloadCommand implements Command{

    @Override
    public void execute() {
        System.out.println("Execute download command");
    }

    @Override
    public void unExecute() {
        System.out.println("Un execute download command");
    }
}
