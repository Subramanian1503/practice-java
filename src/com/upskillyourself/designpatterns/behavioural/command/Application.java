package com.upskillyourself.designpatterns.behavioural.command;

import com.upskillyourself.designpatterns.behavioural.command.command.Command;
import com.upskillyourself.designpatterns.behavioural.command.command.RunCommand;
import com.upskillyourself.designpatterns.behavioural.command.invoker.Invoker;

public class Application {

    public static void main(String args[]){
        Command runCommand = new RunCommand();
        Invoker invoker = new Invoker(runCommand);
        invoker.execute();
        invoker.unExecute();
    }
}
