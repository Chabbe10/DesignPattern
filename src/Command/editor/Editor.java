package Command.editor;

import Command.commands.Command;
import Command.commands.CommandHistory;

import javax.swing.*;

public class Editor {

    public JTextArea textField;
    public String clipboard;
    private CommandHistory history = new CommandHistory();


    public void init(){

    }

    private void executeCommand(Command command){
        if (command.execute()){
            history.push(command);
        }
    }

    private void undo(){
        if(history.isEmpty())
            return;

        Command command = history.pop();

    }
}
