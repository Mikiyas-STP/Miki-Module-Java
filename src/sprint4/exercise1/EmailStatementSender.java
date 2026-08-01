package sprint4.exercise1;
public class EmailStatementSender implements StatementSender {
    @Override
    public void sendStatement (String statementContent){
        System.out.println("Success: Email sent with content -> " + statementContent);
    }
}