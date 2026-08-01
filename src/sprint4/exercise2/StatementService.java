package sprint4.exercise2;

/**
 * Creates monthly statements and coordinates their delivery
 */

public class StatementService {
    private final StatementDeliveryService deliveryService;

    public StatementService(StatementDeliveryService deliveryService){
        this.deliveryService = deliveryService;
    }
    /**
     * Create and send a statememnt containing all transaction
     */
    public void sendAllTransactionsStatement(StatementSender sender) {
        Statement statement = new AllTransactionsMonthlyStatement();
        deliveryService.deliverStatement(statement, sender);
    }
    /**
     * creates and sends a statement containing outgoing transactions only
     */
    public void sendOutgoingTransactionsStatement(StatementSender sender) {
        Statement statement = new OutgoingTransactionsMonthlyStatement();
        deliveryService.deliverStatement(statement, sender);
    }
}