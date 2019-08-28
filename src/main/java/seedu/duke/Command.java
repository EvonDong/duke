package seedu.duke;

import java.io.IOException;

/**
 * Command is an abstract base class for all commands that the user inputs.
 * A <code>Command/code> object corresponds to a command that starts with "todo", "deadline",
 * "event", "done" or "bye".
 */
public abstract class Command {
    protected boolean exit = false;

    /**
     * Constructor of the Command class.
     */
    public Command() {
    }

    /**
     * Abstract method that executes the command.
     *
     * @param list the TaskList object that is handling the arraylist of the datafile
     * @param ui the UserInterface object that handles the interaction with users
     * @param storage the Storage object that stores and handles the path to datafile
     * @throws IOException on input error
     */
    public abstract void execute(TaskList list, Ui ui, Storage storage) throws IOException;

    /**
     * Returns whether the program should exit.
     *
     * @return the exit variable
     */
    public boolean isExit() {
        return exit;
    }

}
