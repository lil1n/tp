package seedu.rainyDay;

import static org.junit.jupiter.api.Assertions.assertEquals;

import seedu.rainyDay.data.FinancialReport;
import seedu.rainyDay.data.FinancialStatement;

import org.junit.jupiter.api.Test;
import seedu.rainyDay.data.Parser;

import java.util.ArrayList;

class ParserTest {
    ArrayList<FinancialStatement> statements = new ArrayList<>();
    FinancialReport financialReport = new FinancialReport(statements);

    @Test
    public void parseAddInCommand() {
        try {
            FinancialReport testReport = new FinancialReport(statements);
            testReport.addStatement(new FinancialStatement("noodles", "in", 5));
            Parser.parseUserInput("add -in noodles $5");
            assertEquals(financialReport.getFullStatement(0),
                    testReport.getFullStatement(0));
        } catch (Exception e) {
            System.out.println("Wrong input format! Please refer to help for correct user input!");
        }
    }

    @Test
    public void parseAddOutCommand() {
        try {
            FinancialReport testReport = new FinancialReport(statements);
            testReport.addStatement(new FinancialStatement("noodles", "out", 5));
            Parser.parseUserInput("add -out noodles $5");
            assertEquals(financialReport.getFullStatement(0),
                    testReport.getFullStatement(0));
        } catch (Exception e) {
            System.out.println("Wrong input format! Please refer to help for correct user input!");
        }
    }

    /*
    @Test
    public void parseDeleteCommand() {
        financialReport.clearReport();
        new AddFinancialStatement("Ipad", "out", 120).execute();
        new AddFinancialStatement("angpao", "in", 3000).execute();
        try {
            Parser.parseUserInput("delete 2");
            assertEquals(1, RainyDay.financialReport.getStatementCount());
        } catch (Exception e) {
            System.out.println("Wrong input format! Please refer to help for correct user input!");
        }
    }
    */
}