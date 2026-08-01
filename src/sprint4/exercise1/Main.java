package sprint4.exercise1;
public interface StatementSender {

    /**
     * sends the statement to the customer
     * @param statementContent this is the text of the bank statement
     */
    void sendStatement(String statementContent);
}

public class EmailStatementSender implements StatementSender {
    @Override
    public void sendStatement (String statementContent){
        System.out.println("Success: Email sent with content -> " + statementContent);
    }
}


