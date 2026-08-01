package sprint4.exercise1;
public class LetterStatementSender implements StatementSender {
    @Override
    public void sendStatement (String statementContent){
        System.out.println("Success: Letter printed and posted with content -> " + statementContent);
    }
}