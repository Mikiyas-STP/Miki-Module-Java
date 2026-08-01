package sprint4.exercise1;

public class Main{
    public static void main(String[] args){
        StatementDeliveryService deliveryService = new StatementDeliveryService();
        StatementSender emailSender = new EmailStatementSender();
        StatementSender letterSender = new LetterStatementSender();

        String myStatement = "Your account balance is £1,500.00";
        deliveryService.deliverStatement(myStatement, emailSender);
        deliveryService.deliverStatement(myStatement, letterSender);
    }
}