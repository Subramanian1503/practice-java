package com.upskillyourself.designpatterns.behavioural.command.invoker;

import com.upskillyourself.designpatterns.behavioural.command.command.Command;

public class Invoker {

    private final Command command;


    public Invoker(Command command) {
        this.command = command;
    }

    public void execute() {
        this.command.execute();
    }

    public void unExecute() {
        this.command.unExecute();
    }
}
