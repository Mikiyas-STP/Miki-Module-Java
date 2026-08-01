package sprint4.exercise2;

public class Main {
    public static void main(String[] args) {
        StatementDeliveryService deliveryService = new StatementDeliveryService();
        StatementService statementService = new StatementService(deliveryService);

        StatementSender emailSender = new EmailStatementSender();
        StatementSender letterSender = new LetterStatementSender();
        System.out.println("\n--- Sending Letter Statements ---");
        statementService.sendAllTransactionsStatement(emailSender);
        System.out.println("\n--- Sending Letter Statements ---");
        statementService.sendOutgoingTransactionsStatement(letterSender);
    }
}
