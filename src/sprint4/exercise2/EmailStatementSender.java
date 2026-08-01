package sprint4.exercise2;

public class EmailStatementSender implements StatementSender {

    @Override
    public void sendStatement(String statementContent){
        System.out.println("Success: Email sent with content ->" + statementContent);
    }

    @Override
    public void sendStatement(Statement statement){
        String content = "Period: " + statement.getStatementPeriod() + " | Transactions: " + statement.getTransactionsList();
        sendStatement(content);
    }
}
