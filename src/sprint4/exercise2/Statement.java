package sprint4.exercise2;

/**
 *  A contract which represents a bank statement
 */

public interface Statement {
    /**
     * this gets the text containing list of transaction
     */
    String getTransactionList();

    /**
     * gets the statement period
     */
    String getStatementPeriod();
}
