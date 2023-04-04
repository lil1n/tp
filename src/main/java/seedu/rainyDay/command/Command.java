package seedu.rainyDay.command;

import seedu.rainyDay.data.AllData;
import seedu.rainyDay.data.MonthlyExpenditures;
import seedu.rainyDay.data.UserData;
import seedu.rainyDay.exceptions.RainyDayException;

//@@author lil1n

/**
 * Represents an executable command
 */
public abstract class Command {

    public static final String COMMAND_ADD = "add";
    public static final String COMMAND_DELETE = "delete";
    public static final String COMMAND_VIEW = "view";
    public static final String COMMAND_HELP = "help";
    public static final String COMMAND_EXIT = "bye";
    public static final String COMMAND_FILTER = "filter";
    public static final String COMMAND_EDIT = "edit";
    public static final String COMMAND_EXPORT = "export";
    public static final String COMMAND_SHORTCUT = "shortcut";
    public static final String COMMAND_SET_BUDGET = "setbudget";
    public static final String COMMAND_DELETE_SHORTCUT = "shortcut_delete";
    public static final String COMMAND_VIEW_SHORTCUT = "shortcut_view";
    public static final String COMMAND_IGNORE = "ignore";
    public static final String COMMAND_UNIGNORE = "unignore";
    private static boolean isExit = false;

    protected AllData allData;
    protected UserData userData;
    protected MonthlyExpenditures monthlyExpenditures;

    //@@author KN-CY
    public static boolean isValidCommand(String word) {
        return word.equalsIgnoreCase(COMMAND_ADD) || word.equalsIgnoreCase(COMMAND_DELETE) ||
                word.equalsIgnoreCase(COMMAND_VIEW) || word.equalsIgnoreCase(COMMAND_HELP) ||
                word.equalsIgnoreCase(COMMAND_EXIT) || word.equalsIgnoreCase(COMMAND_FILTER) ||
                word.equalsIgnoreCase(COMMAND_EDIT) || word.equalsIgnoreCase(COMMAND_EXPORT) ||
                word.equalsIgnoreCase(COMMAND_SHORTCUT) || word.equalsIgnoreCase(COMMAND_SET_BUDGET) ||
                word.equalsIgnoreCase(COMMAND_DELETE_SHORTCUT) || word.equalsIgnoreCase(COMMAND_VIEW_SHORTCUT) ||
                word.equalsIgnoreCase(COMMAND_IGNORE) || word.equalsIgnoreCase(COMMAND_UNIGNORE);
    }

    //@@author lil1n

    /**
     * Sets the attribute to reference the financial report for execution of commands
     *
     * @param allData allData provided for the commands to be performed on
     */
    public void setData(AllData allData) {
        this.allData = allData;
        this.userData = allData.getUserData();
        this.monthlyExpenditures = allData.getMonthlyExpenditures();
    }

    /**
     * Sets up logger for logging
     */
    protected abstract void setupLogger();

    /**
     * Executes the command and print the relevant output message
     */
    public abstract CommandResult execute() throws RainyDayException;

    //@@author azriellee
    public boolean isExit() {
        return isExit;
    }

    public void setExit() {
        isExit = true;
    }
}
