package sprint4.exercise1;
public class StatementDeliveryService {
    public void deliverStatement (String statementContent, StatementSender statementSender){
        statementSender.sendStatement(statementContent);
    }
}